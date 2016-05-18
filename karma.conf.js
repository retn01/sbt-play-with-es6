module.exports = function(config) {
    config.set({

        browsers: ['PhantomJS'],

        files: [

            { pattern: 'test-context.js'}
        ],


        frameworks: ['jasmine', 'es5-shim'],

        preprocessors: {
            'test-context.js': ['webpack']
        },

        webpack: {
            module: {
                loaders: [
                    { test: /\.js/, exclude: /node_modules/, loader: 'babel-loader' }
                ]
            },
            watch: true
        }
    });
};
