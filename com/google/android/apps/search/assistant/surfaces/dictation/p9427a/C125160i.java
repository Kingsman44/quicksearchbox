package com.google.android.apps.search.assistant.surfaces.dictation.p9427a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62958ce;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.i */
/* compiled from: PG */
public enum C125160i implements C62957cd {
    UNKNOWN(0),
    ELIGIBLE(1),
    NON_ELIGIBLE_ASSISTANT_DICTATION_FLAG_DISABLED(2),
    NON_ELIGIBLE_ASSISTANT_NOT_CONNECTED_TO_KEYBOARD(3),
    NON_ELIGIBLE_ON_DEVICE_STACK_NOT_ENABLED(4),
    NON_ELIGIBLE_LOCALE_MISMATCH(9),
    NON_ELIGIBLE_UNSUPPORTED_INPUT_FIELD(10),
    NON_ELIGIBLE_ASSISTANT_VOICE_TYPING_SETTING_DISABLED(12),
    NON_ELIGIBLE_GBOARD_VOICE_TYPING_SETTING_DISABLED(30),
    NON_ELIGIBLE_TALKBACK_ACTIVE(13),
    NON_ELIGIBLE_WORK_PROFILE(15),
    NON_ELIGIBLE_KEYBOARD_INCOGNITO_MODE(16),
    NON_ELIGIBLE_AIAI_UNKNOWN_ERROR(17),
    NON_ELIGIBLE_AIAI_LANGUAGE_PACK_NOT_INSTALLED(18),
    NON_ELIGIBLE_AIAI_LANGUAGE_NOT_SUPPORTED(19),
    NON_ELIGIBLE_AIAI_RECOGNITION_SERVICE_MISSING(20),
    NON_ELIGIBLE_AIAI_TIMEOUT(21),
    NON_ELIGIBLE_AIAI_BUSY(23),
    NON_ELIGIBLE_AIAI_OLD_VERSION(27),
    NON_ELIGIBLE_ASSISTANT_MIC_PERMISSION_NOT_GRANTED(22),
    NON_ELIGIBLE_KEYBOARD_UNSUPPORTED_IME(25),
    NON_ELIGIBLE_DATA_FILES_NOT_DOWNLOADED(26),
    NON_ELIGIBLE_UNSUPPORTED_DICTATION_LOCALE(28),
    NON_ELIGIBLE_UNSUPPORTED_SYSTEM_LOCALE(31),
    NON_ELIGIBLE_SAA_DISABLED(29),
    NON_ELIGIBLE_NLUF_GROUPS_FOR_LOCALE_NOT_DOWNLOADED(32),
    NON_ELIGIBLE_LANGUAGE_AUTO_DETECT_NOT_SUPPORTED(33),
    NON_ELIGIBLE_NOT_ALL_AUTO_DETECT_LANGUAGES_SUPPORTED(34),
    NON_ELIGIBLE_ANDROID_OLD_VERSION(35),
    NON_ELIGIBLE_ASSISTANT_NOT_ENABLED(36),
    NON_ELIGIBLE_KEYBOARD_NOT_VISIBLE(37),
    NON_ELIGIBLE_MODEL_DOWNLOAD_NEEDS_USER_REQUEST(38),
    NON_ELIGIBLE_MODEL_DOWNLOAD_IN_PROGRESS(39),
    NON_ELIGIBLE_VOICE_ACCESSIBILITY_SERVICE_ENABLED(40),
    UNRECOGNIZED(-1);
    

    /* renamed from: J */
    public static final C62958ce f345255J = null;

    /* renamed from: K */
    private final int f345283K;

    static {
        f345255J = new C125159h();
    }

    private C125160i(int i) {
        this.f345283K = i;
    }

    /* renamed from: a */
    public static C125160i m205013a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return ELIGIBLE;
            case 2:
                return NON_ELIGIBLE_ASSISTANT_DICTATION_FLAG_DISABLED;
            case 3:
                return NON_ELIGIBLE_ASSISTANT_NOT_CONNECTED_TO_KEYBOARD;
            case 4:
                return NON_ELIGIBLE_ON_DEVICE_STACK_NOT_ENABLED;
            case 9:
                return NON_ELIGIBLE_LOCALE_MISMATCH;
            case 10:
                return NON_ELIGIBLE_UNSUPPORTED_INPUT_FIELD;
            case 12:
                return NON_ELIGIBLE_ASSISTANT_VOICE_TYPING_SETTING_DISABLED;
            case 13:
                return NON_ELIGIBLE_TALKBACK_ACTIVE;
            case 15:
                return NON_ELIGIBLE_WORK_PROFILE;
            case 16:
                return NON_ELIGIBLE_KEYBOARD_INCOGNITO_MODE;
            case 17:
                return NON_ELIGIBLE_AIAI_UNKNOWN_ERROR;
            case 18:
                return NON_ELIGIBLE_AIAI_LANGUAGE_PACK_NOT_INSTALLED;
            case 19:
                return NON_ELIGIBLE_AIAI_LANGUAGE_NOT_SUPPORTED;
            case 20:
                return NON_ELIGIBLE_AIAI_RECOGNITION_SERVICE_MISSING;
            case 21:
                return NON_ELIGIBLE_AIAI_TIMEOUT;
            case 22:
                return NON_ELIGIBLE_ASSISTANT_MIC_PERMISSION_NOT_GRANTED;
            case 23:
                return NON_ELIGIBLE_AIAI_BUSY;
            case 25:
                return NON_ELIGIBLE_KEYBOARD_UNSUPPORTED_IME;
            case 26:
                return NON_ELIGIBLE_DATA_FILES_NOT_DOWNLOADED;
            case 27:
                return NON_ELIGIBLE_AIAI_OLD_VERSION;
            case 28:
                return NON_ELIGIBLE_UNSUPPORTED_DICTATION_LOCALE;
            case 29:
                return NON_ELIGIBLE_SAA_DISABLED;
            case 30:
                return NON_ELIGIBLE_GBOARD_VOICE_TYPING_SETTING_DISABLED;
            case 31:
                return NON_ELIGIBLE_UNSUPPORTED_SYSTEM_LOCALE;
            case 32:
                return NON_ELIGIBLE_NLUF_GROUPS_FOR_LOCALE_NOT_DOWNLOADED;
            case 33:
                return NON_ELIGIBLE_LANGUAGE_AUTO_DETECT_NOT_SUPPORTED;
            case 34:
                return NON_ELIGIBLE_NOT_ALL_AUTO_DETECT_LANGUAGES_SUPPORTED;
            case 35:
                return NON_ELIGIBLE_ANDROID_OLD_VERSION;
            case 36:
                return NON_ELIGIBLE_ASSISTANT_NOT_ENABLED;
            case 37:
                return NON_ELIGIBLE_KEYBOARD_NOT_VISIBLE;
            case 38:
                return NON_ELIGIBLE_MODEL_DOWNLOAD_NEEDS_USER_REQUEST;
            case 39:
                return NON_ELIGIBLE_MODEL_DOWNLOAD_IN_PROGRESS;
            case 40:
                return NON_ELIGIBLE_VOICE_ACCESSIBILITY_SERVICE_ENABLED;
            default:
                return null;
        }
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f345283K;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
