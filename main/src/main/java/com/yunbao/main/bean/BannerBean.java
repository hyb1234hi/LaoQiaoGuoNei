package com.yunbao.main.bean;

import java.util.List;

public class BannerBean {


    private List<ListBean> list;

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * listorder : 0
         * slide_cid : 1
         * slide_content :
         * slide_des :
         * slide_id : 25
         * slide_name : 欧夜
         * slide_pic : http://qiniu.kulehu.com/20190502/5cca9ab319801.jpg
         * slide_status : 1
         * slide_url : https://fir.im/5wy3
         */

        private String listorder;
        private String slide_cid;
        private String slide_content;
        private String slide_des;
        private String slide_id;
        private String slide_name;
        private String slide_pic;
        private String slide_status;
        private String slide_url;

        public String getListorder() {
            return listorder;
        }

        public void setListorder(String listorder) {
            this.listorder = listorder;
        }

        public String getSlide_cid() {
            return slide_cid;
        }

        public void setSlide_cid(String slide_cid) {
            this.slide_cid = slide_cid;
        }

        public String getSlide_content() {
            return slide_content;
        }

        public void setSlide_content(String slide_content) {
            this.slide_content = slide_content;
        }

        public String getSlide_des() {
            return slide_des;
        }

        public void setSlide_des(String slide_des) {
            this.slide_des = slide_des;
        }

        public String getSlide_id() {
            return slide_id;
        }

        public void setSlide_id(String slide_id) {
            this.slide_id = slide_id;
        }

        public String getSlide_name() {
            return slide_name;
        }

        public void setSlide_name(String slide_name) {
            this.slide_name = slide_name;
        }

        public String getSlide_pic() {
            return slide_pic;
        }

        public void setSlide_pic(String slide_pic) {
            this.slide_pic = slide_pic;
        }

        public String getSlide_status() {
            return slide_status;
        }

        public void setSlide_status(String slide_status) {
            this.slide_status = slide_status;
        }

        public String getSlide_url() {
            return slide_url;
        }

        public void setSlide_url(String slide_url) {
            this.slide_url = slide_url;
        }
    }
}
