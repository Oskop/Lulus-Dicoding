package com.anacode.first.deeplearningnetwork;

import java.util.ArrayList;

public class NetworksData {
    private static String[] networkFullName = {
            "Shallow Neural Network",
            "Deep Neural Network",
            "Convolutional Neural Network",
            "Recurrent Neural Network",
            "Faster Recurrent Convolutional Neural Network",
            "Masked Recurrent Convolutional Neural Network",
            "Single-Shoot Detection",
            "You Only Look at Once",
            "You Only Look at Coefficient",
            "Long-Short Term Memory",
            "Gated Recurrent Unit",
            "Transformer",
            "Cross Language Model",
            "Auto Encoder",
            "Variational Auto Endocder",
            "Generative Adversarial Network",
            "Tacotron"
    };

    private static String[] networkNickName = {
            "SNN",
            "DNN",
            "CNN",
            "RNN",
            "Faster RCNN",
            "Masked RCNN",
            "SSD",
            "YOLO",
            "YOLACT",
            "LSTM",
            "GRU",
            "Transformer",
            "XLM",
            "AE",
            "VAE",
            "GAN",
            "Tacotron"
    };
    private static String[] networkDetail = {
            "Merupakan neural network dengan jumlah hidden layer yang sedikit. Cocok untuk sekedar membuat model dari banyak jenis perhitungan matematika atau bahkan penyelesaian model permasalahan di kehidupan nyata yang bisa direpresentasikan ke dalam bentuk numerik.",
            "Merupakan neural network dengan jumlah hidden layer yang banyak. Merupakan cikal bakal dari sekian banyak network yang membutuhkan sebuah ruang pemahaman yang besar.",
            "Merupakan neural network yang dikhususkan untuk mengolah dan memahami data spatial. Terinspirasi dari bagaimana cara kerja mata hewan dalam melihat, terbuatlah CNN ini sehingga sangat cocok untuk pengolahan citra.",
            "Merupakan neural network yang dikhususkan untuk mengolah dan memahami data yang bersifat sekuensial. Data sekuensial dapat berupa teks dan suara. RNN ini sangat cocok untuk dapat menyelesaikan tugas yang berkaitan dengan data yang berjalan dalam timestap.",
            "Merupakan gabungan dari RNN dan CNN yang dikhususkan untuk mengolah citra, khususnya untuk tugas pendeteksian obyek dengan kecepatan yang lebih baik daripada CNN.",
            "Merupakan kombinasi network dari RNN dan CNN yang dilengkapi dengan beberapa tipe network sebagai mask, yang dikhususkan untuk segmentasi sebuah pemandangan.",
            "Merupakan turunan dari CNN yang dikhususkan untuk pendeteksian obyek, namun dalam prosesnya, gambar inputan hanya diambil feature-nya satu kali dan dimasukkan ke sejumlah tahap pemrosesan dalam network.",
            "Merupakan turunan dari CNN yang dikhususkan untuk pendeteksian obyek. dengan hanya satu tahap pemrosesan berupa pemindaian obyek pada gambar dengan merepresentasikan gambar inputan ke dalam grid 13x13. Kemudian tiap grid dideteksi apakah mengandung obyek atau tidak dengan 3 ukuran dimensi convolution yang berbeda, yang kemudian disambungkan hasil pengolahan convolution grid sebelumnya dengan yang selanjutnya.",
            "Merupakan turunan dari YOLO yang dikhususkan untuk pendeteksian obyek sekaligus segmentasi semantik. Dengan lebih menitikberatkan pada nilai koefisien dalam pendeteksian, YOLACT mampu merekonstruksi area yang menandakan sebuah obyek sehingga bisa digunakan juga untuk segmentasi obyek.",
            "Merupakan turunan RNN yang ditambahi dengan 3 gate berupa forget-gate, memory-gate/context-gate, dan output-gate. Dengan adanya 3 gate tersebut, language model yang terbentuk dari LSTM dapat mengingat konteks yang dalam.",
            "Merupakan turunan RNN seperti LSTM, tapi hanya dengan tambahan 1 gate saja, yaitu memory-gate/context-gate. Meskipun begitu, language model yang terbentuk juga dapat mengingat konteks tetapi tidak sedalam LSTM. Namun GRU ini akan sangat dirasa manfaatnya untuk tugas tugas tertentu.",
            "Merupakan turunan dari RNN yang dilengkapi dengan attention unit, dimana setiap data dalam timestap akan dihubungkan ke semua data timestap lain dalam satu batch, sehingga relasi antar data dalam timestap menjadi lebih lengkap. Transformer merupakan network yang bagus untuk pembuatan language model dengan kemampuan mengatasi banyak macam tugas yang berkaitan dengan pengolahan bahasa natural (Natural Language Prosessing).",
            "Merupakan turunan dari RNN yang dilengkapi dengan attention unit seperti Transformer, dengan language model yang terbentuk dari dua atau lebih bahasa negara yang berbeda. Language model yang terbentuk cocok untuk tugas berupa translasi dari satu bahasa ke bahasa lain.",
            "Merupakan neural network yang ditujukan untuk merekonstruksi kembali data yang diinputkan seutuhnya. Dimulai dengan data yang diekstraksi (encode) feature-nya sempai tahap yang paling kompleks, kemudian direkonstruksi ulang (decode) dengan feature yang telah diekstrak pada tahap akhir pengekstrakan sehingga didapat data yang sama seperti data input-an.",
            "Merupakan neural network yang ditujukan untuk merekonstruksi data masukan menjadi data yang memiliki variasi dari data awal. Dengan proses pengekstrakan feature seperti AE, yang kemudian direkonstruksi kembali dengan mengubah sedikit atau beberapa nilai dari feature ekstraksi sehingga didapat data varian dari data masukan.",
            "Merupakan neural network yang ditujukan untuk merekonstruksi data masukkan yang pada saat proses pelatiahn modelnya, tiap data yang masuk diberikan noise dengan tujuan agar model lebih dapat memahami data secara general.",
            "Merukapan turunan dari RNN yang dikhususkan untuk mengolah suara, dan ditujukan untuk tugas mengubah dari teks menjadi suara."
    };
    private static String[] networkMajor = {
            "Mathematic Model",
            "All Major",
            "Computer Vision and Natural Language Processing",
            "Computer Vision and Natural Language Processing",
            "Computer Vision",
            "Computer Vision",
            "Computer Vision",
            "Computer Vision",
            "Computer Vision",
            "Natural Language Processing",
            "Natural Language Processing",
            "Natural Language Processing",
            "Natural Language Processing",
            "Lot Major",
            "Lot Major",
            "Generative Data",
            "Speech Processing"
    };
    private static String[] networkUse = {
            "Menyelesaikan persoalan yang dapat dimodelkan dalam matematika tanpa pendalaman yang jauh",
            "Cikal bakal network lain",
            "deteksi obyek, deteksi wajah, deteksi pose",
            "Semua tugas dari Natural Langauge Processing",
            "Deteksi obyek",
            "Deteksi obyek dan segmentasi pemandangan beserta obyek",
            "Deteksi obyek",
            "Deteksi obyek",
            "Deteksi dan segmentasi obeyek",
            "Pembuatan Language Model untuk NLP",
            "Pembuatan Language Model untuk NLP",
            "Untuk banyak tugas dalam NLP",
            "translasi bahasa",
            "-",
            "-",
            "Pewarnaan otomatis, pembuatan video bergerak dari satu foto, pembuatan gambar dari beberapa hint",
            "pengubahan teks menjadi suara"
    };
    private static int[] photo = {
            R.drawable.snn,
            R.drawable.dnn,
            R.drawable.cnn,
            R.drawable.rnn,
            R.drawable.frcnn,
            R.drawable.maskedrcnn,
            R.drawable.ssd,
            R.drawable.yolo,
            R.drawable.yolact,
            R.drawable.lstm,
            R.drawable.gru,
            R.drawable.transformer,
            R.drawable.xlm,
            R.drawable.ae,
            R.drawable.vae,
            R.drawable.gan,
            R.drawable.tacotron
    };

    static ArrayList<NetworkArchitecture> getListData() {
        ArrayList<NetworkArchitecture> list = new ArrayList<>();
        for (int position = 0; position < networkNickName.length; position++) {
            NetworkArchitecture nw = new NetworkArchitecture();
            nw.setFullName(networkFullName[position]);
            nw.setNickName(networkNickName[position]);
            nw.setDetail(networkDetail[position]);
            nw.setMajor(networkMajor[position]);
            nw.setUse(networkUse[position]);
            nw.setPhoto(photo[position]);
            list.add(nw);
        }

        return list;
    }
}
