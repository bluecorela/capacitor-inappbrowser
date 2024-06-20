import { WebPlugin } from "@capacitor/core";
export class InAppBrowserWeb extends WebPlugin {
    async open(options) {
        console.log("open", options);
        return options;
    }
    async clearCookies(options) {
        console.log("cleanCookies", options);
        return;
    }
    async getCookies(options) {
        // Web implementation to get cookies
        return options;
    }
    async openWebView(options) {
        console.log("openWebView", options);
        return options;
    }
    async executeScript({ code }) {
        console.log("code", code);
        return code;
    }
    async close() {
        console.log("close");
        return;
    }
    async setUrl(options) {
        console.log("setUrl", options.url);
        return;
    }
    async reload() {
        console.log("reload");
        return;
    }
}
//# sourceMappingURL=web.js.map