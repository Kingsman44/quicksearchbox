package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.j.rm */
/* compiled from: PG */
public enum C52431rm implements C62957cd {
    UNKNOWN(0),
    ANDROID_ALLO(14),
    ANDROID_AUTO(4),
    ANDROID_THINGS_CUBE(47),
    ANDROID_THINGS_JASPER(33),
    ANDROID_TV(5),
    ANDROID_TV_KIDS(45),
    ANDROID_WEAR(2),
    AR_GLASSES(57),
    ASSISTANT_SDK(28),
    AUDIOWEAR(13),
    BUBBLE_CHARACTERS_IOS(58),
    CAPABILITY_BASED_SURFACE(29),
    CHROMECAST_ASSISTANT(27),
    CHROMECAST_MANHATTAN(42),
    CHROMECAST_SEARCH(18),
    CLOUD_DEVICE(54),
    COMPANION_SCREEN(31),
    DYNAMITE_WEB(25),
    ENSEMBLE(3),
    EYESFREE_AGSA(7),
    EYESFREE_GMM(8),
    GBOARD(24),
    GLASS(9),
    GOOGLE_HOME(6),
    HANGOUTS_CHATBOT(19),
    IOS_ALLO(15),
    IOS_GSA(10),
    IOS_WEAR(11),
    LIBASSISTANT(35),
    LINE_CHATBOT(20),
    MULTIMODAL_AGSA(1),
    NON_ASSISTANT_SURFACE(41),
    OPA_AGSA(12),
    OPA_AGSA_CHROME_OS(26),
    OPA_ANDROID_AUTO(17),
    OPA_ANDROID_LITE(34),
    OPA_ANDROID_SCREENLESS(23),
    OPA_ANDROID_SMART_DISPLAY(56),
    OPA_ANDROID_TABLET(40),
    OPA_CROS(46),
    OPA_GACS(51),
    OPA_IOS(16),
    OPA_IOS_SCREENLESS(30),
    OPA_KAIOS(38),
    OPA_MOBILE_WEB(53),
    RTOS_PHONE(55),
    SMS_CHATBOT(21),
    TELEGRAM_CHATBOT(22),
    TELEPHONE_ASSISTANT(49),
    VERILY_ONDUO(32),
    YOUTUBE_APP(36),
    AGSA_BISTO_FOR_EVAL(37),
    COGSWORTH_FOR_EVAL(39),
    LOCKHART_MIC_FOR_EVAL(48),
    OPA_ANDROID_AUTO_EMBEDDED_FAKE(50),
    SPARK(43),
    WALLE(52),
    UNIT_TESTING(44);
    

    /* renamed from: ah */
    public final int f137633ah;

    private C52431rm(int i) {
        this.f137633ah = i;
    }

    /* renamed from: a */
    public static C52431rm m86627a(String str) {
        return (C52431rm) Enum.valueOf(C52431rm.class, str);
    }

    /* renamed from: b */
    public static C52431rm m86628b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return MULTIMODAL_AGSA;
            case 2:
                return ANDROID_WEAR;
            case 3:
                return ENSEMBLE;
            case 4:
                return ANDROID_AUTO;
            case 5:
                return ANDROID_TV;
            case 6:
                return GOOGLE_HOME;
            case 7:
                return EYESFREE_AGSA;
            case 8:
                return EYESFREE_GMM;
            case 9:
                return GLASS;
            case 10:
                return IOS_GSA;
            case 11:
                return IOS_WEAR;
            case 12:
                return OPA_AGSA;
            case 13:
                return AUDIOWEAR;
            case 14:
                return ANDROID_ALLO;
            case 15:
                return IOS_ALLO;
            case 16:
                return OPA_IOS;
            case 17:
                return OPA_ANDROID_AUTO;
            case 18:
                return CHROMECAST_SEARCH;
            case 19:
                return HANGOUTS_CHATBOT;
            case 20:
                return LINE_CHATBOT;
            case 21:
                return SMS_CHATBOT;
            case 22:
                return TELEGRAM_CHATBOT;
            case 23:
                return OPA_ANDROID_SCREENLESS;
            case 24:
                return GBOARD;
            case 25:
                return DYNAMITE_WEB;
            case 26:
                return OPA_AGSA_CHROME_OS;
            case 27:
                return CHROMECAST_ASSISTANT;
            case 28:
                return ASSISTANT_SDK;
            case 29:
                return CAPABILITY_BASED_SURFACE;
            case 30:
                return OPA_IOS_SCREENLESS;
            case 31:
                return COMPANION_SCREEN;
            case 32:
                return VERILY_ONDUO;
            case 33:
                return ANDROID_THINGS_JASPER;
            case 34:
                return OPA_ANDROID_LITE;
            case 35:
                return LIBASSISTANT;
            case 36:
                return YOUTUBE_APP;
            case 37:
                return AGSA_BISTO_FOR_EVAL;
            case 38:
                return OPA_KAIOS;
            case 39:
                return COGSWORTH_FOR_EVAL;
            case 40:
                return OPA_ANDROID_TABLET;
            case 41:
                return NON_ASSISTANT_SURFACE;
            case 42:
                return CHROMECAST_MANHATTAN;
            case 43:
                return SPARK;
            case 44:
                return UNIT_TESTING;
            case 45:
                return ANDROID_TV_KIDS;
            case 46:
                return OPA_CROS;
            case 47:
                return ANDROID_THINGS_CUBE;
            case 48:
                return LOCKHART_MIC_FOR_EVAL;
            case 49:
                return TELEPHONE_ASSISTANT;
            case 50:
                return OPA_ANDROID_AUTO_EMBEDDED_FAKE;
            case 51:
                return OPA_GACS;
            case 52:
                return WALLE;
            case 53:
                return OPA_MOBILE_WEB;
            case 54:
                return CLOUD_DEVICE;
            case 55:
                return RTOS_PHONE;
            case 56:
                return OPA_ANDROID_SMART_DISPLAY;
            case 57:
                return AR_GLASSES;
            case 58:
                return BUBBLE_CHARACTERS_IOS;
            default:
                return null;
        }
    }

    /* renamed from: c */
    public static C62959cf m86629c() {
        return C52430rl.f137572a;
    }

    public final int getNumber() {
        return this.f137633ah;
    }

    public final String toString() {
        return Integer.toString(this.f137633ah);
    }
}
