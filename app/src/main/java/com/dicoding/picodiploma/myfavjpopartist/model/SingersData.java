package com.dicoding.picodiploma.myfavjpopartist.model;

import java.util.ArrayList;

public class SingersData {
    public static String[][] data = new String[][]{
        {"Aimer",
                "Aimer (エメ Eme, [eme]) is a Japanese pop singer and lyricist signed to SME Records and managed by FOURseam",
                "data:image/jpeg;base64,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",
                "https://www.aimer-web.jp"},
        {"LiSA",
                "Risa Oribe better known by her stage name LiSA, is a Japanese singer, songwriter and lyricist from Seki, Gifu, signed to Aniplex under Sony Music Artists.",
                "https://pinimg.icu/wall/1080x1920/lisa-live-is-small-always-risa-oribe-lisa-olive-Daf487bcbb38d2a1ad852ba918eb2b210.jpg",
                "https://www.lxixsxa.com/"},
        {"Kana Nishino",
                "Kana Nishino (西野 カナ Nishino Kana, born March 18, 1989) is a Japanese singer and songwriter signed with SME Records' Newcome Inc. She debuted on February 20, 2008, with the single \"I\".",
                "https://aramajapan.com/wp-content/uploads/2019/01/aramajapan.com-kana-nishino2019.jpg",
                "https://www.nishinokana.com/"},
        {"Rie Takahashi",
                "Rie Takahashi (高橋 李依 Takahashi Rie, born February 27, 1994) is a Japanese voice actress and singer from Saitama Prefecture who is represented by the agency 81 Produce.",
                "https://otakotaku.com/asset/img/people/2017/09/takahashi-rie-59cf35ba8257fp.jpg",
                "https://en.wikipedia.org/wiki/Rie_Takahashi"},
        {"Chiai Fujikawa",
                "Fujikawa Chiai is a solo idol and former member of Maneki Kecak.",
                "https://vignette.wikia.nocookie.net/jpop/images/7/7d/Fujikachiai.jpg/revision/latest/scale-to-width-down/310?cb=20181111134651",
                "https://fujikawachiai.com/"},
        {"Yorushika",
                "Yorushika is a band formed by the composer’s “n-buna” with vocal “suis” \"n-buna (guitar/composition) and suis (vocals) are the two featured members, with three others supporting them across the two mini albums released so far. (Mitsuru Shimotsuru on guitar, KITANITATSUYA on bass, and Masack on drums).\"",
                "https://i.ytimg.com/vi/F64yFFnZfkI/maxresdefault.jpg",
                "http://yorushika.com"},
        {"Kenshi Yonezu",
                "Kenshi Yonezu (米津 玄師 Yonezu Kenshi, born March 10, 1991) is a Japanese musician, singer-songwriter, record producer and illustrator who began releasing Vocaloid music under the stage name Hachi (ハチ) in 2009. In 2012 he debuted under his real name, releasing music with his own voice.",
                "https://i1.sndcdn.com/avatars-000296954130-37hzou-t500x500.jpg",
                "https://kenshiyonezu.jp/all/"},
        {"Garnidelia",
                "Garnidelia (ガルニデリア) (stylized as GARNiDELiA) is a Japanese pop rock duo signed to Sacra Music, consisting of singer Mai Mizuhashi, better known by her stage name MARiA[2] and record producer Yoshinori Abe (阿部 尚徳 Abe Yoshinori, born March 5, 1978), better known by his stage name toku.",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/e/ee/GARNiDELiA_at_the_J-Pop_Summit_2016.jpg/330px-GARNiDELiA_at_the_J-Pop_Summit_2016.jpg",
                "https://www.garnidelia.com/"},
        {"Radwimps",
                "Radwimps (ラッドウインプス Raddo'uinpusu, stylized as RADWIMPS) is a Japanese rock band, who debuted independently in 2003 and later on major label Toshiba EMI in 2005. The band's name, Radwimps, was formed from two English language slang terms, rad and wimp. According to the band, the coined word had several meanings, including \"excellent weakling\" and \"superlative coward.\"[",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/8/88/Radwinps2016.jpg/450px-Radwinps2016.jpg",
                "http://www.radwimps.jp"},
        {"Asuka Okura",
                "Asuka Ōkura (大倉 明日香 Ōkura Asuka, born September 5, 1996),[1] also known by the stage name Asca (stylized as ASCA), is a Japanese musician signed to Sacra Music.[1] She made her debut in 2013 after becoming a finalist at the 5th Animax All-Japan Anisong Grand Prix. After focusing on her studies, she resumed her music career in late 2016. Her songs have been featured in the anime series The Pet Girl of Sakurasou, Fate/Apocrypha, and Sword Art Online.",
                "https://i1.wp.com/otacouncil.com/wp-content/uploads/2019/07/ASCA.jpg?ssl=1",
                "https://en.wikipedia.org/wiki/Asuka_%C5%8Ckura"},
    };

    public static ArrayList<Singer> getListData(){
        ArrayList<Singer> list = new ArrayList<>();
        for (String[] aData: data){
            Singer singer = new Singer();
            singer.setName(aData[0]);
            singer.setAbout(aData[1]);
            singer.setPhoto(aData[2]);
            singer.setUrl(aData[3]);
            list.add(singer);
        }
        return list;
    }
    }

