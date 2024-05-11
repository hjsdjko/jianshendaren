const base = {
    get() {
        return {
            url : "http://localhost:8080/jianshendaren/",
            name: "jianshendaren",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/jianshendaren/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "健身达人"
        } 
    }
}
export default base
