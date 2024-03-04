package com.example.idn

object DataProv {
    private val data = listOf(
        Prov(
            "Provinsi Aceh",
            "Banda Aceh",
            1956,
            "Aceh salah satu provinsi di Indonesia yang berada di ujung utara pulau Sumatera dengan jumlah penduduk sekitar 5,1 juta jiwa. Luas wilayah kurang lebih 3,4 juta hektar dimana 0,2 juta hektar berupa lahan gambut. Provinsi Aceh, terletak di ujung barat Pulau Sumatera, mempesona dengan keindahan alamnya yang menakjubkan. Pantai-pantainya yang berpasir putih dan air laut yang jernih memberikan pemandangan yang memukau, sementara pegunungan yang hijau dan lembah-lembah yang subur menambah pesonanya. Budaya Aceh yang kaya, tercermin dalam warisan Islam yang kuat, tercermin dalam bangunan-bangunan bersejarah di ibu kota Banda Aceh, seperti Masjid Raya Baiturrahman yang megah. Selain itu, seni dan budaya tradisional seperti tari Saman juga menjadi bagian tak terpisahkan dari identitas budaya Aceh. Beragam etnis dan suku bangsa mendiami provinsi ini, yang menghasilkan kekayaan budaya dan bahasa yang beragam. Aceh juga memiliki sejarah panjang yang dipenuhi dengan peristiwa-peristiwa penting, mulai dari masa kejayaan Kesultanan Aceh Darussalam hingga tragedi tsunami yang mengguncang dunia pada tahun 2004. Meskipun Aceh telah mengalami berbagai tantangan dan tragedi, semangat dan kegigihan masyarakatnya dalam menghadapi cobaan telah membawa provinsi ini bangkit kembali dengan semangat yang kuat. Dengan kekayaan alamnya, keanekaragaman budaya, dan sejarah yang kaya, Aceh adalah destinasi yang menawarkan pengalaman yang tak terlupakan bagi para pengunjungnya.",
            "5.067.000",
            "5.796.000 ha",
            "3.388.280,71 ha",
            R.drawable.aceh
        ),
        Prov(
            "Provinsi Bangka Belitung",
            "Pangkal Pinang",
            2000,
            "Kepulauan Bangka Belitung adalah salah satu provinsi di Indonesia yang terletak di bagian timur pulau Sumatera dengan jumlah penduduk sekitar 1,3 juta jiwa. Luas wilayah kurang lebih 1,6 juta hektar dimana 0,7 juta hektar berupa hutan dan 0,004 juta hektar adalah lahan gambut.",
            "1.278.000",
            "1.642.000 ha",
            "654.562,00 ha",
            R.drawable.bangka_belitung
        ),
        Prov(
            "Provinsi Bengkulu",
            "Bengkulu",
            1967,
            "Bengkulu adalah sebuah provinsi yang berada di Pulau Sumatera, Indonesia. Ibu kota provinsi Bengkulu terletak di Kota Bengkulu. Provinsi ini terletak di bagian Barat Daya Pulau Sumatra dan pantai barat di bagian Selatan Pulau Sumatra yang berbatasan langsung dengan provinsi Sumatera Barat, Jambi, Sumatera Selatan dan Lampung di wilayah sekitarnya. Pada tahun 2020, jumlah penduduk provinsi ini sebanyak 2.091.314 jiwa, dengan kepadatan 105 jiwa/km².",
            "1.924.000",
            "1.992.000 ha",
            "924.631,00 ha",
            R.drawable.bengkulu
        ),
        Prov(
            "Provinsi Jambi",
            "Jambi",
            1956,
            "Jambi adalah sebuah provinsi di Indonesia yang terletak di pesisir timur, di bagian tengah pulau Sumatra, ibu kotanya berada di kota Jambi. Provinsi dengan luas wilayah 50.160,05 km2 ini, pada akhir tahun 2023 memiliki jumlah penduduk 3.760.275 jiwa. Provinsi Jambi adalah nama provinsi di Indonesia yang ibu kotanya memiliki nama sama dengan provinsi selain Bengkulu, Daerah Khusus Ibukota Jakarta, Daerah Istimewa Yogyakarta, dan Gorontalo.",
            "3.406.000",
            "5.006.000 ha",
            "2.107.779,00 ha",
            R.drawable.jambi
        ),
        Prov(
            "Provinsi Kalimantan Barat",
            "Pontianak",
            1957,
            "Kalimantan Barat adalah sebuah provinsi di Indonesia, yang berada di pulau Kalimantan, dengan ibu kota atau pusat pemerintahan berada di kota Pontianak. Daerah Kalimantan Barat termasuk salah satu daerah yang dapat dijuluki provinsi \"Seribu Sungai\". Julukan ini selaras dengan kondisi geografis yang mempunyai ratusan sungai besar dan kecil yang di antaranya dapat dan sering dilayari. Beberapa sungai besar sampai saat ini masih merupakan urat nadi dan jalur utama untuk angkutan daerah pedalaman, walaupun prasarana jalan darat telah dapat menjangkau sebagian besar kecamatan.",
            "5.310.000",
            "14.731.000 ha",
            " 8.168.088,48 ha",
            R.drawable.kalimantan_barat
        ),
        Prov(
            "Provinsi Kalimantan Selatan",
            "Banjarbaru",
            1956,
            "Kalimantan Selatan adalah salah satu provinsi yang berada di pulau Kalimantan, Indonesia. Sejak 16 Maret 2022, ibu kota provinsi Kalimantan Selatan dipindah ke Kota Banjarbaru menggantikan Kota Banjarmasin. Provinsi ini merupakan rumah bagi etnis Banjar dan memiliki luas 38.744,00 km² dengan populasi pada akhir tahun 2023 berjumlah 4.234.214 jiwa, dan wilayah administrasi terbagi menjadi 11 kabupaten dan 2 kota.",
            "3.835.000",
            "3.874.000 ha",
            "1.779.982,00 ha",
            R.drawable.kalimantan_selatan
        ),
        Prov(
            "Provinsi Kalimantan Tengah",
            "Palangkaraya",
            1957,
            "Kalimantan Tengah (disingkat Kalteng) adalah salah satu provinsi di Indonesia yang terletak di pulau Kalimantan. Ibu kotanya adalah Kota Palangka Raya. Berdasarkan sensus tahun 2010, provinsi ini memiliki populasi 2.202.599 jiwa, yang terdiri atas 1.147.878 laki-laki dan 1.054.721 perempuan. Data BPS Kalimantan Tengah tahun 2023 menunjukkan penduduk provinsi ini tahun 2023 bertambah menjadi 2.741.100 (Laki-laki 1.420.900 jiwa dan perempuan 1.320.200 jiwa).[2] Kalimantan Tengah mempunyai 13 kabupaten dan 1 kota.",
            "2.446.000",
            "15.356.000 ha",
            "12.697.165,00 ha",
            R.drawable.kalimantan_tengah
        ),
        Prov(
            "Provinsi Kalimantan Timur",
            "Samarinda",
            1957,
            "Kalimantan Timur adalah sebuah provinsi di pulau Kalimantan, Indonesia. Luas total Kalimantan Timur adalah 127.346,92 km². Populasi provinsi ini pada 2020 sebanyak 3.941.766 jiwa, dan pada akhir 2023 sebanyak 4.007.736 jiwa. Kalimantan Timur merupakan wilayah dengan kepadatan penduduk terendah ke empat di Indonesia. Ibu kotanya adalah Kota Samarinda.",
            "3.361.000",
            "12.907.000 ha",
            "9.452.513,00 ha",
            R.drawable.kalimantan_timur
        ),
        Prov(
            "Provinsi Kalimantan Utara",
            "Tanjung Selor",
            2012,
            "Kalimantan Utara adalah sebuah provinsi di Indonesia yang terletak di bagian utara Pulau Kalimantan. Provinsi ini berbatasan langsung dengan negara tetangga Malaysia, yaitu negara bagian Sabah dan Sarawak. Pusat pemerintahan Kalimantan Utara saat ini berada di Tanjung Selor, bersama dengan pusat pemerintahan Kabupaten Bulungan. Pada akhir tahun 2023, jumlah penduduk kalimantan Utara sebanyak 747.415 jiwa.",
            "3.361.000",
            "12.907.000 ha",
            "9.452.513,00 ha",
            R.drawable.kalimantan_utara
        ),
        Prov(
            "Provinsi Kepulauan Riau",
            "Tanjung Pinang",
            2002,
            "Kepulauan Riau adalah sebuah wilayah provinsi yang terletak di Indonesia. Provinsi ini beribu kota di Kota Tanjungpinang. Provinsi ini berbatasan langsung dengan Vietnam, Kamboja, dan Laut Tiongkok Selatan di sebelah utara Laut Natuna Utara; provinsi Kalimantan Barat dan Sarawak (Malaysia) di sebelah timur; provinsi Kepulauan Bangka Belitung dan Jambi di selatan; negara Singapura, tiga negara bagian Malaysia Barat (Terengganu, Pahang, dan Johor) dan provinsi Riau di sebelah barat.",
            "1.810.000",
            "820.000 ha",
            "603.354,32 ha",
            R.drawable.kepulauan_riau
        ),
        Prov(
            "Provinsi Lampung",
            "Bandar Lampung",
            1964,
            "Lampung adalah sebuah provinsi di bagian ujung selatan Pulau Sumatra, Indonesia. Ibu kota dan pusat pemerintahannya berada di Kota Bandar Lampung. Provinsi ini memiliki dua kota, yaitu Bandar Lampung dan Metro, serta 13 kabupaten. Posisi provinsi Lampung secara geografis di sebelah barat berbatasan dengan Samudra Hindia, di sebelah timur dengan Laut Jawa, di sebelah utara berbatasan dengan provinsi Sumatera Selatan dan Bengkulu, serta di sebelah selatan berbatasan dengan Selat Sunda.",
            "9.543.000",
            "3.462.000 ha",
            "1.004.735,00 ha",
            R.drawable.lampung
        ),
        Prov(
            "Provinsi Riau",
            "Pekanbaru",
            1957,
            "Riau (Jawi: رياو) adalah sebuah provinsi di Indonesia yang terletak di pantai timur pulau Sumatra bagian tengah. Wilayah pesisirnya berbatasan dengan Selat Malaka. Hingga tahun 2004, provinsi ini juga meliputi Kepulauan Riau, sekelompok besar pulau-pulau kecil (pulau-pulau utamanya antara lain Pulau Batam dan Pulau Bintan) yang terletak di sebelah Timur Sumatra dan sebelah Selatan Singapura. Kepulauan ini dimekarkan menjadi provinsi tersendiri pada Juli 2004.",
            "5.867.000",
            "8.702.000 ha",
            "7.121.344,00 ha",
            R.drawable.riau
        ),
        Prov(
            "Provinsi Sumatera Barat",
            "Padang",
            1945,
            "Sumatera Barat (disingkat Sumbar) adalah sebuah provinsi di Indonesia yang terletak di Pulau Sumatra dengan ibu kota Padang. Provinsi Sumatera Barat terletak sepanjang pesisir barat Sumatra bagian tengah, dataran tinggi Bukit Barisan di sebelah timur, dan sejumlah pulau di lepas pantainya seperti Kepulauan Mentawai. Dari utara ke selatan, provinsi dengan wilayah seluas 42.012,89 km² ini berbatasan dengan empat provinsi, yakni Sumatera Utara, Riau, Jambi, dan Bengkulu.",
            "5.384.000",
            "4.201.000 ha",
            "2.342.894,00 ha",
            R.drawable.sumatera_barat
        ),
        Prov(
            "Provinsi Sumatera Selatan",
            "Palembang",
            1946,
            "Sumatra Selatan adalah provinsi di Indonesia yang terletak di bagian Selatan pulau Sumatera. Ibu kota Sumatera Selatan berada di kota Palembang, dan pada tahun 2021 penduduk provinsi ini berjumlah 8.550.849 jiwa. Secara geografis, Sumatera Selatan berbatasan dengan provinsi Jambi di utara, provinsi Kepulauan Bangka-Belitung di timur, provinsi Lampung di selatan dan Provinsi Bengkulu di barat. Provinsi ini kaya akan sumber daya alam, seperti minyak bumi, gas alam dan batu bara. Selain itu, ibu kota provinsi Sumatera Selatan, Palembang, telah terkenal sejak dahulu karena menjadi pusat Kedatuan Sriwijaya.",
            "8.043.000",
            "9.159.000 ha",
            "3.422.937,17 ha",
            R.drawable.sumatera_selatan
        ),
        Prov(
            "Provinsi Sumatera Utara",
            "Medan",
            1948,
            "Sumatera Utara atau Sumatra Utara (disingkat Sumut; Surat Batak: ᯘᯮᯔᯖᯩᯒᯥᯖᯒ, Abjad Jawi: سوماترا اوتارا) adalah sebuah provinsi di Indonesia yang terletak di bagian utara Pulau Sumatra. Provinsi ini beribu kota di Kota Medan, dengan luas wilayah 72.981,23 km2. Sumatera Utara merupakan provinsi dengan jumlah penduduk terbesar keempat di Indonesia, setelah provinsi Jawa Barat, Jawa Timur, dan Jawa Tengah, dan terbanyak di Pulau Sumatera. Pada akhir tahun 2023, penduduk Sumatera Utara berjumlah 15.471.582 jiwa, dengan kepadatan penduduk 210 jiwa/km2.",
            "14.552.000",
            "7.298.000 ha",
            "3.742.120,00 ha",
            R.drawable.sumatera_utara
        ),


        )

    val listData: List<Prov>
        get() = data
}
