import remarkPresetLintRecommended from 'remark-preset-lint-recommended';
import remarkFrontmatter from 'remark-frontmatter';
import remarkMdx from 'remark-mdx';
import remarkNoInlineCodeFences from './src/plugins/remark-no-inline-code-fences.mjs';

export default {
    plugins: [
        remarkFrontmatter,
        remarkMdx,
        remarkPresetLintRecommended,
        remarkNoInlineCodeFences,
        remarkNoHtmlLinks,
        [
            remarkLintNoDeadUrls,
            {
                skipLocalhost: false,
                skipOffline: true,
                skipUrlPatterns: [
                    'https://github.com/signup',
                    'https://code.visualstudio.com/',
                    'https://www.conventionalcommits.org/en/v1.0.0/',
                    'https://vale.sh/',
                    'https://squoosh.app/',
                ], // Add known flaky URL patterns here
            },
        ],
    ],
};
