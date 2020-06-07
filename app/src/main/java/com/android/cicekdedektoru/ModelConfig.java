package com.android.cicekdedektoru;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * The most of those information can be found in GTSRB_TensorFlow_MobileNet.ipynb
 */
public class ModelConfig {
    public static String MODEL_FILENAME = "graph.lite";


    public static final int INPUT_IMG_SIZE_WIDTH = 224;
    public static final int INPUT_IMG_SIZE_HEIGHT = 224;
    public static final int FLOAT_TYPE_SIZE = 4;
    public static final int PIXEL_SIZE = 3;
    public static final int MODEL_INPUT_SIZE = FLOAT_TYPE_SIZE * INPUT_IMG_SIZE_WIDTH * INPUT_IMG_SIZE_HEIGHT * PIXEL_SIZE;
    public static final int IMAGE_MEAN = 0;
    public static final float IMAGE_STD = 255.0f;

    //This list can be taken from notebooks/output/labels_readable.txt 

    public static final List<String> OUTPUT_LABELS = Collections.unmodifiableList(
            Arrays.asList(
                    "1 daffodil nergis",
                    "10 sunflower ayci egi",
                    "11 daisy papatya",
                    "12 coltsfoot oksuruk otu",
                    "13 dandelion kara hindiba",
                    "14 cowslip cuha cicegi",
                    "15 buttercup d g n cicegi",
                    "16 windflower dag lalesi",
                    "17 pansy hercai menekse",
                    "2 snowdrop kardelen",
                    "3 lillyvalley muge cicegi",
                    "4 bluebell can cicegi",
                    "5 crocus cigdem",
                    "6 iris cigdem",
                    "7 tigerlily pars zambagi",
                    "8 tulip lale",
                    "9 fritilleria ters lale"

            ));

    public static final int MAX_CLASSIFICATION_RESULTS = 3;
    public static final float CLASSIFICATION_THRESHOLD = 0.1f;
}
