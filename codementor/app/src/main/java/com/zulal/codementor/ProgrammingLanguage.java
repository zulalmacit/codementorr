package com.zulal.codementor;
public class ProgrammingLanguage {

    public static class Languages {

        private String LanguagesName;
        private String LanguagesInfo;
        private String LanguagesMethodTitle;
        private String Languages;
        private int Thumbnail;


        public Languages(String name, String languagesInfo, String languagesMethodTitle,String languages, int thumbnail){

            this.LanguagesName = name;
            this.LanguagesInfo = languagesInfo;
            this.LanguagesMethodTitle = languagesMethodTitle;
            this.Languages = languages;
            this.Thumbnail = thumbnail;

        }


        public  String getLanguagesName(){

            return LanguagesName;
        }
        public String getLanguagesInfo(){
            return LanguagesInfo;
        }

        public String getLanguagesMethodTitle(){
            return LanguagesMethodTitle;
        }

        public String getLanguages(){
            return Languages;
        }

        public int getThumbnail(){
            return Thumbnail;
        }
    }
}
