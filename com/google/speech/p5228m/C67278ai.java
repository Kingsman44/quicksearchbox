package com.google.speech.p5228m;

import com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar;

/* renamed from: com.google.speech.m.ai */
/* compiled from: PG */
public final class C67278ai {
    /* renamed from: a */
    public static /* synthetic */ String m97448a(int i) {
        if (i == 1) {
            return "UNKNOWN";
        }
        if (i == 2) {
            return "SESSION";
        }
        if (i == 3) {
            return "TEST_MESSAGE";
        }
        if (i == 4) {
            return "CLIENT_EVENT_EXAMPLE_EVENT";
        }
        if (i == 5) {
            return "TEST_MESSAGE_WITH_FILE";
        }
        if (i == 3004) {
            return "GBOARD_SESSION";
        }
        if (i == 5001) {
            return "LENS_PROACTIVE_SHOPPING_INTENT";
        }
        if (i == 8001) {
            return "SPEECH_LEARNING_SCHEDULING_RESULT";
        }
        if (i == 8002) {
            return "SPEECH_LEARNING_TASK_RESULT";
        }
        switch (i) {
            case 1001:
                return "AUDIO_UNLABELED";
            case 1002:
                return "HOTWORD_INFO";
            case 1003:
                return "RECOGNITION_INFO";
            case 1004:
                return "CLIENT_EVENT_SERVER_HOTWORD_INFO";
            case 1005:
                return "AUDIO_POSITIVE";
            case 1006:
                return "AUDIO_NEGATIVE";
            case 1007:
                return "CLIENT_EVENT_SCREEN_OFF";
            case 1008:
                return "CLIENT_EVENT_SCREEN_ON";
            case 1009:
                return "CLIENT_EVENT_DEVICE_UNLOCKED";
            case 1010:
                return "CLIENT_EVENT_SERVER_EMPTY_QUERY";
            case 1011:
                return "CLIENT_EVENT_SERVER_RECOGNITION_INFO";
            case 1012:
                return "HOTWORD_INFO_TEST";
            case 1013:
                return "CLIENT_EVENT_OPA_TRIGGER_TYPE";
            case 1014:
                return "CLIENT_EVENT_OPA_ACTIVITY_DISMISS";
            case 1015:
                return "CLIENT_EVENT_SERVER_HOTWORD_MULTIDEVICE_SUPPRESSED";
            case 1016:
                return "CLIENT_EVENT_OPA_ACTIVITY_DISMISSED_TYPE";
            case 1017:
                return "CLIENT_EVENT_NGA_USER_CANCELLED_ACTIVITY";
            default:
                switch (i) {
                    case 2001:
                        return "HOME_AEC_EVENT";
                    case 2002:
                        return "HOME_ALARM_TIMER_EVENT";
                    case 2003:
                        return "HOME_CONVERSATION_EVENT";
                    case 2004:
                        return "HOME_DEVICE_STATE_EVENT";
                    case 2005:
                        return "HOME_RECOGNITION_EVENT";
                    case 2006:
                        return "HOME_DEVICE_SETTINGS";
                    case 2007:
                        return "HOME_VOLUME_CHANGE_EVENT";
                    case 2008:
                        return "HOME_SODA_AUDIO_EVENT";
                    case 2009:
                        return "HOME_SODA_HOTWORD_EVENT";
                    case 2010:
                        return "HOME_VISION_FACE_BOUNDING_BOX_EVENT";
                    case 2011:
                        return "HOME_INTERACTION";
                    case 2012:
                        return "HOME_USER_EVENT";
                    case 2013:
                        return "HOME_ACTIVE_SPEAKER_DETECTION";
                    case 2014:
                        return "HOME_GAZE";
                    case 2015:
                        return "HOME_SCREEN_TOUCH";
                    case 2016:
                        return "HOME_ASD_HOTWORD";
                    case 2017:
                        return "HOME_HOTGAZE_METRICS";
                    case 2018:
                        return "HOME_HOTWORD_CACHE_EVENT";
                    case 2019:
                        return "HOME_LIGHT_SENSOR_EVENT";
                    case 2020:
                        return "SESSION_SCORE_EVENT";
                    case 2021:
                        return "HOME_SODA_HOTWORD_TIMEOUT_EVENT_WITH_FOLLOWUP";
                    case 2022:
                        return "HOME_SODA_HOTWORD_TIMEOUT_EVENT_HIGH_THRESHOLD";
                    case 2023:
                        return "HOME_AUDIO_METRICS_EVENT";
                    case 2024:
                        return "HOME_DARK_VISION";
                    case 2025:
                        return "HOME_MEDIA_TYPES_EVENT";
                    default:
                        switch (i) {
                            case 3007:
                                return "GBOARD_VOICE_RECORDING";
                            case 3008:
                                return "GBOARD_VOICE_INPUT_CONTEXT";
                            case 3009:
                                return "GBOARD_KEYBOARD_SESSION";
                            case 3010:
                                return "GBOARD_INPUT_TURN";
                            default:
                                switch (i) {
                                    case 4001:
                                        return "AIAI_VOICE_RECORDING";
                                    case 4002:
                                        return "AIAI_CORRECTIONS";
                                    case 4003:
                                        return "AIAI_VOICE_INPUT_CONTEXT";
                                    case 4004:
                                        return "AIAI_RECOGNITION_ENDPOINT";
                                    case 4005:
                                        return "AIAI_RECOGNITION_RESULT";
                                    case 4006:
                                        return "AIAI_INPUT_TURN";
                                    default:
                                        switch (i) {
                                            case 6001:
                                                return "SHELDON_TEXT_QUERY";
                                            case 6002:
                                                return "SHELDON_AUDIO";
                                            case 6003:
                                                return "SHELDON_DEBUG";
                                            case 6004:
                                                return "SHELDON_AUDIO_UNLABELLED";
                                            case 6005:
                                                return "SHELDON_AUDIO_UNINTENDED";
                                            default:
                                                switch (i) {
                                                    case 7001:
                                                        return "UNINTENDED_ESCAPE_HATCH_CHIP_TAP";
                                                    case 7002:
                                                        return "UNINTENDED_SUPPRESSED_BY_SERVER";
                                                    case 7003:
                                                        return "UNINTENDED_SUPPRESSED_BY_CLIENT";
                                                    case 7004:
                                                        return "UNINTENDED_MODEL_FEATURES";
                                                    default:
                                                        return "null";
                                                }
                                        }
                                }
                        }
                }
        }
    }

    /* renamed from: b */
    public static int m97449b(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (i == 3003) {
            return 3004;
        }
        if (i == 5000) {
            return 5001;
        }
        if (i == 8000) {
            return 8001;
        }
        if (i == 8001) {
            return 8002;
        }
        switch (i) {
            case 1000:
                return 1001;
            case 1001:
                return 1002;
            case 1002:
                return 1003;
            case 1003:
                return 1004;
            case 1004:
                return 1005;
            case 1005:
                return 1006;
            case 1006:
                return 1007;
            case 1007:
                return 1008;
            case 1008:
                return 1009;
            case 1009:
                return 1010;
            case 1010:
                return 1011;
            case 1011:
                return 1012;
            case 1012:
                return 1013;
            case 1013:
                return 1014;
            case 1014:
                return 1015;
            case 1015:
                return 1016;
            case 1016:
                return 1017;
            default:
                switch (i) {
                    case SimpleSnackbar.LENGTH_SHORT:
                        return 2001;
                    case 2001:
                        return 2002;
                    case 2002:
                        return 2003;
                    case 2003:
                        return 2004;
                    case 2004:
                        return 2005;
                    case 2005:
                        return 2006;
                    case 2006:
                        return 2007;
                    case 2007:
                        return 2008;
                    case 2008:
                        return 2009;
                    case 2009:
                        return 2010;
                    case 2010:
                        return 2011;
                    case 2011:
                        return 2012;
                    case 2012:
                        return 2013;
                    case 2013:
                        return 2014;
                    case 2014:
                        return 2015;
                    case 2015:
                        return 2016;
                    case 2016:
                        return 2017;
                    case 2017:
                        return 2018;
                    case 2018:
                        return 2019;
                    case 2019:
                        return 2020;
                    case 2020:
                        return 2021;
                    case 2021:
                        return 2022;
                    case 2022:
                        return 2023;
                    case 2023:
                        return 2024;
                    case 2024:
                        return 2025;
                    default:
                        switch (i) {
                            case 3006:
                                return 3007;
                            case 3007:
                                return 3008;
                            case 3008:
                                return 3009;
                            case 3009:
                                return 3010;
                            default:
                                switch (i) {
                                    case 4000:
                                        return 4001;
                                    case 4001:
                                        return 4002;
                                    case 4002:
                                        return 4003;
                                    case 4003:
                                        return 4004;
                                    case 4004:
                                        return 4005;
                                    case 4005:
                                        return 4006;
                                    default:
                                        switch (i) {
                                            case 6000:
                                                return 6001;
                                            case 6001:
                                                return 6002;
                                            case 6002:
                                                return 6003;
                                            case 6003:
                                                return 6004;
                                            case 6004:
                                                return 6005;
                                            default:
                                                switch (i) {
                                                    case 7000:
                                                        return 7001;
                                                    case 7001:
                                                        return 7002;
                                                    case 7002:
                                                        return 7003;
                                                    case 7003:
                                                        return 7004;
                                                    default:
                                                        return 0;
                                                }
                                        }
                                }
                        }
                }
        }
    }
}
