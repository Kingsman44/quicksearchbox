package com.google.android.libraries.mdi.download;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.mdi.download.bw */
/* compiled from: PG */
public enum C28745bw implements C62957cd {
    GDD_UNKNOWN(0),
    GDD_NEVER_USE_THIS_SEE_OMG_28475(1),
    GDD_WEBREF(2),
    GDD_WEBREF_NGA(7),
    GDD_NGA_GENIE_FM(3),
    GDD_APA_GENIE_FM(4),
    GDD_APA_BISTO(5),
    GDD_APA_WARMACTIONS(6),
    GDD_APA_LIGHTWEIGHT_TOKENS(9),
    GDD_MDD_SAMPLE_APP_MULTI_VARIANTS(10),
    GDD_APA_HOTWORD_MODEL(11),
    GDD_APA_UCM_TFL(12),
    GDD_APA_DICTATION_FORMATTING(13),
    GDD_APA_CORRECTIONS(14),
    GDD_APA_HEAD_SUGGEST(15),
    GDD_APA_SMART_ACTION_MODELS(16),
    GDD_APA_BISTO_DEVICE_CUSTOMIZE_INFO(17),
    GDD_LENS_TEXT(18),
    GDD_APA_ARC_POP_NLU_MODELS(19),
    GDD_MOBSERVE_CODELAB(20),
    GDD_APA_HOTMATCH(21),
    GDD_AGSA_GROWTH_TRACKING(22),
    GDD_APA_POP(1022),
    GDD_LENS_AVS(23),
    GDD_AUTOFILL_VCN_MERCHANT_OPT_OUT(25);
    

    /* renamed from: z */
    private final int f78162z;

    private C28745bw(int i) {
        this.f78162z = i;
    }

    /* renamed from: a */
    public static C28745bw m53621a(int i) {
        if (i == 25) {
            return GDD_AUTOFILL_VCN_MERCHANT_OPT_OUT;
        }
        if (i == 1022) {
            return GDD_APA_POP;
        }
        switch (i) {
            case 0:
                return GDD_UNKNOWN;
            case 1:
                return GDD_NEVER_USE_THIS_SEE_OMG_28475;
            case 2:
                return GDD_WEBREF;
            case 3:
                return GDD_NGA_GENIE_FM;
            case 4:
                return GDD_APA_GENIE_FM;
            case 5:
                return GDD_APA_BISTO;
            case 6:
                return GDD_APA_WARMACTIONS;
            case 7:
                return GDD_WEBREF_NGA;
            default:
                switch (i) {
                    case 9:
                        return GDD_APA_LIGHTWEIGHT_TOKENS;
                    case 10:
                        return GDD_MDD_SAMPLE_APP_MULTI_VARIANTS;
                    case 11:
                        return GDD_APA_HOTWORD_MODEL;
                    case 12:
                        return GDD_APA_UCM_TFL;
                    case 13:
                        return GDD_APA_DICTATION_FORMATTING;
                    case 14:
                        return GDD_APA_CORRECTIONS;
                    case 15:
                        return GDD_APA_HEAD_SUGGEST;
                    case 16:
                        return GDD_APA_SMART_ACTION_MODELS;
                    case 17:
                        return GDD_APA_BISTO_DEVICE_CUSTOMIZE_INFO;
                    case 18:
                        return GDD_LENS_TEXT;
                    case 19:
                        return GDD_APA_ARC_POP_NLU_MODELS;
                    case 20:
                        return GDD_MOBSERVE_CODELAB;
                    case 21:
                        return GDD_APA_HOTMATCH;
                    case 22:
                        return GDD_AGSA_GROWTH_TRACKING;
                    case 23:
                        return GDD_LENS_AVS;
                    default:
                        return null;
                }
        }
    }

    /* renamed from: b */
    public static C62959cf m53622b() {
        return C28744bv.f78135a;
    }

    public final int getNumber() {
        return this.f78162z;
    }

    public final String toString() {
        return Integer.toString(this.f78162z);
    }
}
