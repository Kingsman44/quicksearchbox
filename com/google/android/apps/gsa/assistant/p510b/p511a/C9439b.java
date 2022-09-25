package com.google.android.apps.gsa.assistant.p510b.p511a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.assistant.b.a.b */
/* compiled from: PG */
public enum C9439b implements C62957cd {
    UNKNOWN_ENTRY(0),
    FIRST_TIME_HOTWORD_ONBOARDING(1),
    VOICE_SETTINGS(2),
    NOW_HOTWORD_CARD(3),
    HOTWORD_RETRAINING_NOTIFICATION(4),
    ANDROID_SETUP_WIZARD(5),
    SRP_VOICE_FEATURE_TIPS(6),
    VOICE_SETTINGS_HOTWORD_RETRAINING(7),
    HOTWORD_MULTI_USER_ENROLLMENT(11),
    HOTWORD_RETRAINING_NOTIFICATION_ACCOUNT_CHANGED(12),
    HOTWORD_RETRAINING_NOTIFICATION_AUDIO_HISTORY_DISABLED(13),
    HOTWORD_RETRAINING_NOTIFICATION_LANGUAGE_CHANGED(14),
    HOTWORD_RETRAINING_NOTIFICATION_SILENT_ENROLLMENT_FAILED(73),
    PUBLIC_SETTINGS_ACTIVITY(15),
    ASSISTANT_GOOGLE_HOME_SETTINGS(16),
    OPA_HOTWORD_ENROLLMENT(17),
    OPA_LAUNCH(18),
    ASSISTANT_GOOGLE_HOME_RETRAINING(19),
    ASSISTANT_GOOGLE_HOME_DISCOVERY(20),
    ASSISTANT_GOOGLE_HOME_OOBE(21),
    ASSISTANT_CHROME_OS_SETUP_WIZARD(23),
    ASSISTANT_CHROME_OS_LAUNCH(25),
    DEFERRED_ANDROID_SETUP_WIZARD(24),
    WEAR_ONBOARDING(26),
    AUTO_ONBOARDING(27),
    BISTO_ONBOARDING(28),
    DEVICE_REGISTRATION_ONBOARDING(29),
    ASSISTANT_SETTINGS_UDC_DEEPLINK(30),
    OPA_ANDROID_UDC_PUNT_CARD(31),
    ASSISTANT_SETTINGS_STARTUP(32),
    HQ_STARTUP(33),
    AGENT_DIRECTORY_STARTUP(34),
    HOTWORD_RETRAINING_NOTIFICATION_HOTWORD_UPGRADE(35),
    ASSISTANT_GOOGLE_HOME_CLOUD(36),
    ASSISTANT_GOOGLE_HOME_OOBE_CLOUD(37),
    ASSISTANT_GOOGLE_HOME_CONSENT_ONBOARDING(41),
    ASSISTANT_GOOGLE_HOME_CONSENT_PERSISTENT_CTA(45),
    OPA_PAYMENTS_ONBOARDING(42),
    OPA_EXIT_SIGNED_OUT(43),
    FACE_MATCH_ENROLLMENT_ASSISTANT_SETTINGS(44),
    FACE_MATCH_RETRAINING_ASSISTANT_SETTINGS(53),
    FACE_MATCH_ENROLLMENT_FROM_VOICE_MATCH(54),
    VOICE_MATCH_ENROLLMENT_DEEPLINK(46),
    DEVICES_SCAN_SEQUENCE_FROM_VOICE_MATCH(57),
    OPA_ZERO_STATE_LOCATION_CONSENT_ONBOARDING(47),
    OPA_DREAMLINER_ONBOARDING(48),
    OPA_DREAMLINER_PF_SETUP(49),
    OPA_HOTWORD_TRAINING(50),
    UPGRADE_VOICE_MATCH(51),
    ASSISTANT_SETTINGS_ANDROID_DEVICE(52),
    OPA_AMBIENT_MODE_ONBOARDING(55),
    OPA_DEFERRED_VOICE_MATCH_SUGGESTION_CHIP(56),
    VOICE_MATCH_SETTINGS_UNDECIDED(58),
    OPA_DEFERRED_VOICE_MATCH_POST_QUERY_CHIP(59),
    ASSISTANT_SETTINGS_VOICE_MATCH_LEGACY(60),
    ASSISTANT_SETTINGS_VOICE_MATCH(61),
    DEVICE_REGISTRATION_ACCOUNT_LINKING(62),
    ASSISTANT_GOOGLE_HOME_RETRAINING_BTW_UPGRADE(63),
    OPA_VOICE_MATCH_FROM_FRE_INPUT_PLATE(64),
    PHONE_ENROLLMENT_DEEPLINK_FROM_VOICE_SEARCH(65),
    OPA_IRIS_PROMO(66),
    INCOMPLETE_STATE_ONBOARDING(67),
    VOICE_MATCH_ENROLLMENT_FROM_SRP_PROMO(68),
    ASSISTANT_GOOGLE_HOME_RETRAINING_UPGRADE_PUNT(69),
    ASSISTANT_STRUCTURE_LEVEL_GOOGLE_HOME_OOBE(70),
    ASSISTANT_STRUCTURE_LEVEL_MANAGER_ONBOARDING(71),
    ASSISTANT_STRUCTURE_LEVEL_ASSISTANT_SETTINGS(72),
    BLOCKING_VOICE_MATCH_FROM_ASSISTANT_INVOCATION(74);
    

    /* renamed from: aq */
    public final int f32835aq;

    private C9439b(int i) {
        this.f32835aq = i;
    }

    /* renamed from: a */
    public static C9439b m23955a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_ENTRY;
            case 1:
                return FIRST_TIME_HOTWORD_ONBOARDING;
            case 2:
                return VOICE_SETTINGS;
            case 3:
                return NOW_HOTWORD_CARD;
            case 4:
                return HOTWORD_RETRAINING_NOTIFICATION;
            case 5:
                return ANDROID_SETUP_WIZARD;
            case 6:
                return SRP_VOICE_FEATURE_TIPS;
            case 7:
                return VOICE_SETTINGS_HOTWORD_RETRAINING;
            case 11:
                return HOTWORD_MULTI_USER_ENROLLMENT;
            case 12:
                return HOTWORD_RETRAINING_NOTIFICATION_ACCOUNT_CHANGED;
            case 13:
                return HOTWORD_RETRAINING_NOTIFICATION_AUDIO_HISTORY_DISABLED;
            case 14:
                return HOTWORD_RETRAINING_NOTIFICATION_LANGUAGE_CHANGED;
            case 15:
                return PUBLIC_SETTINGS_ACTIVITY;
            case 16:
                return ASSISTANT_GOOGLE_HOME_SETTINGS;
            case 17:
                return OPA_HOTWORD_ENROLLMENT;
            case 18:
                return OPA_LAUNCH;
            case 19:
                return ASSISTANT_GOOGLE_HOME_RETRAINING;
            case 20:
                return ASSISTANT_GOOGLE_HOME_DISCOVERY;
            case 21:
                return ASSISTANT_GOOGLE_HOME_OOBE;
            case 23:
                return ASSISTANT_CHROME_OS_SETUP_WIZARD;
            case 24:
                return DEFERRED_ANDROID_SETUP_WIZARD;
            case 25:
                return ASSISTANT_CHROME_OS_LAUNCH;
            case 26:
                return WEAR_ONBOARDING;
            case 27:
                return AUTO_ONBOARDING;
            case 28:
                return BISTO_ONBOARDING;
            case 29:
                return DEVICE_REGISTRATION_ONBOARDING;
            case 30:
                return ASSISTANT_SETTINGS_UDC_DEEPLINK;
            case 31:
                return OPA_ANDROID_UDC_PUNT_CARD;
            case 32:
                return ASSISTANT_SETTINGS_STARTUP;
            case 33:
                return HQ_STARTUP;
            case 34:
                return AGENT_DIRECTORY_STARTUP;
            case 35:
                return HOTWORD_RETRAINING_NOTIFICATION_HOTWORD_UPGRADE;
            case 36:
                return ASSISTANT_GOOGLE_HOME_CLOUD;
            case 37:
                return ASSISTANT_GOOGLE_HOME_OOBE_CLOUD;
            case 41:
                return ASSISTANT_GOOGLE_HOME_CONSENT_ONBOARDING;
            case 42:
                return OPA_PAYMENTS_ONBOARDING;
            case 43:
                return OPA_EXIT_SIGNED_OUT;
            case 44:
                return FACE_MATCH_ENROLLMENT_ASSISTANT_SETTINGS;
            case 45:
                return ASSISTANT_GOOGLE_HOME_CONSENT_PERSISTENT_CTA;
            case 46:
                return VOICE_MATCH_ENROLLMENT_DEEPLINK;
            case 47:
                return OPA_ZERO_STATE_LOCATION_CONSENT_ONBOARDING;
            case 48:
                return OPA_DREAMLINER_ONBOARDING;
            case 49:
                return OPA_DREAMLINER_PF_SETUP;
            case 50:
                return OPA_HOTWORD_TRAINING;
            case 51:
                return UPGRADE_VOICE_MATCH;
            case 52:
                return ASSISTANT_SETTINGS_ANDROID_DEVICE;
            case 53:
                return FACE_MATCH_RETRAINING_ASSISTANT_SETTINGS;
            case 54:
                return FACE_MATCH_ENROLLMENT_FROM_VOICE_MATCH;
            case 55:
                return OPA_AMBIENT_MODE_ONBOARDING;
            case 56:
                return OPA_DEFERRED_VOICE_MATCH_SUGGESTION_CHIP;
            case 57:
                return DEVICES_SCAN_SEQUENCE_FROM_VOICE_MATCH;
            case 58:
                return VOICE_MATCH_SETTINGS_UNDECIDED;
            case 59:
                return OPA_DEFERRED_VOICE_MATCH_POST_QUERY_CHIP;
            case 60:
                return ASSISTANT_SETTINGS_VOICE_MATCH_LEGACY;
            case 61:
                return ASSISTANT_SETTINGS_VOICE_MATCH;
            case 62:
                return DEVICE_REGISTRATION_ACCOUNT_LINKING;
            case 63:
                return ASSISTANT_GOOGLE_HOME_RETRAINING_BTW_UPGRADE;
            case 64:
                return OPA_VOICE_MATCH_FROM_FRE_INPUT_PLATE;
            case 65:
                return PHONE_ENROLLMENT_DEEPLINK_FROM_VOICE_SEARCH;
            case 66:
                return OPA_IRIS_PROMO;
            case 67:
                return INCOMPLETE_STATE_ONBOARDING;
            case 68:
                return VOICE_MATCH_ENROLLMENT_FROM_SRP_PROMO;
            case 69:
                return ASSISTANT_GOOGLE_HOME_RETRAINING_UPGRADE_PUNT;
            case 70:
                return ASSISTANT_STRUCTURE_LEVEL_GOOGLE_HOME_OOBE;
            case 71:
                return ASSISTANT_STRUCTURE_LEVEL_MANAGER_ONBOARDING;
            case 72:
                return ASSISTANT_STRUCTURE_LEVEL_ASSISTANT_SETTINGS;
            case 73:
                return HOTWORD_RETRAINING_NOTIFICATION_SILENT_ENROLLMENT_FAILED;
            case 74:
                return BLOCKING_VOICE_MATCH_FROM_ASSISTANT_INVOCATION;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m23956b() {
        return C9438a.f32765a;
    }

    public final int getNumber() {
        return this.f32835aq;
    }

    public final String toString() {
        return Integer.toString(this.f32835aq);
    }
}
