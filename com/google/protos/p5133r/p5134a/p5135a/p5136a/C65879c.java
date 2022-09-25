package com.google.protos.p5133r.p5134a.p5135a.p5136a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.protos.r.a.a.a.c */
/* compiled from: PG */
public enum C65879c implements C62957cd {
    EVENT_UNKNOWN(0),
    EVENT_TRANSITION(1),
    EVENT_NETWORK_ERROR(2),
    EVENT_HTTP_CLIENT_ERROR(3),
    EVENT_HTTP_SERVER_ERROR(4),
    EVENT_MALFORMED_RESPONSE(5),
    EVENT_FORM_VALIDATION_ERROR(6),
    EVENT_SYSTEM_ACTION_USER_CANCEL(7),
    EVENT_ACCOUNT_SELECTION_SELECT_ACCOUNT(20),
    EVENT_ACCOUNT_SELECTION_USE_ANOTHER_ACCOUNT(21),
    EVENT_ACCOUNT_SELECTION_CANCEL(22),
    EVENT_ACCOUNT_SELECTION_CREATE_ACCOUNT(23),
    EVENT_PROVIDER_CONSENT_LINK(30),
    EVENT_PROVIDER_CONSENT_CANCEL(31),
    EVENT_PROVIDER_CONSENT_LEARN_MORE(32),
    EVENT_ACCOUNT_CREATION_CREATE_ACCOUNT(40),
    EVENT_ACCOUNT_CREATION_CANCEL(41),
    EVENT_ACCOUNT_CREATION_CHANGE_PHONE(42),
    EVENT_ACCOUNT_CREATION_ADD_PHONE(43),
    EVENT_ACCOUNT_CREATION_LEARN_MORE(44),
    EVENT_APP_AUTH_DISMISS(50),
    EVENT_APP_AUTH_NO_CUSTOM_TABS_SUPPORTED_BROWSER(51),
    EVENT_APP_AUTH_BROWSER_WARM_UP_FAILED(52),
    EVENT_APP_AUTH_NO_BROWSER_FOUND(53),
    EVENT_APP_AUTH_INVALID_REQUEST(54),
    EVENT_APP_AUTH_UNAUTHORIZED_CLIENT(55),
    EVENT_APP_AUTH_ACCESS_DENIED(56),
    EVENT_APP_AUTH_UNSUPPORTED_RESPONSE_TYPE(57),
    EVENT_APP_AUTH_INVALID_SCOPE(58),
    EVENT_APP_AUTH_SERVER_ERROR(59),
    EVENT_ADD_PHONE_ADD(60),
    EVENT_ADD_PHONE_CANCEL(61),
    EVENT_VERIFY_PHONE_VERIFY(70),
    EVENT_VERIFY_PHONE_CANCEL(71),
    EVENT_VERIFY_PHONE_FAIL_TRY_AGAIN(80),
    EVENT_VERIFY_PHONE_FAIL_CLOSE(81),
    EVENT_ERROR_OK(90),
    EVENT_APP_FLIP_3P_APP_INSTALLED(100),
    EVENT_APP_FLIP_3P_APP_NOT_INSTALLED(101),
    EVENT_APP_FLIP_3P_APP_SUPPORTED(102),
    EVENT_APP_FLIP_3P_APP_NOT_SUPPORTED(103),
    EVENT_APP_FLIP_FLOW_SUCCESS(104),
    EVENT_APP_FLIP_FLOW_CANCELED(105),
    EVENT_APP_FLIP_3P_ERROR_RECOVERABLE(106),
    EVENT_APP_FLIP_3P_ERROR_UNRECOVERABLE(107),
    EVENT_APP_FLIP_3P_CONSENT_REJECTED(108),
    EVENT_LINKING_INFO_CONTINUE_LINKING(110),
    EVENT_LINKING_INFO_CANCEL_LINKING(111),
    EVENT_USAGE_NOTICE_ACCEPT_NOTICE(120),
    EVENT_USAGE_NOTICE_CANCEL_LINKING(121),
    EVENT_APP_AUTH_TEMPORARILY_UNAVAILABLE(130),
    EVENT_APP_AUTH_NO_REDIRECT_STATE(131),
    EVENT_APP_AUTH_OTHER(132),
    EVENT_APP_AUTH_NULL_RESPONSE_URI(133),
    EVENT_APP_AUTH_SUCCESS(134),
    EVENT_APP_AUTH_RECEIVE_ACTIVITY_RESULT(135),
    EVENT_APP_AUTH_RECEIVE_NEW_INTENT(136),
    EVENT_APP_AUTH_FRAGMENT_HANDLE_INTENT(137),
    EVENT_APP_FLIP_INVALID_REQUEST(140),
    EVENT_APP_FLIP_UNAUTHORIZED_CLIENT(141),
    EVENT_APP_FLIP_UNSUPPORTED_RESPONSE_TYPE(142),
    EVENT_APP_FLIP_INVALID_SCOPE(143),
    EVENT_APP_FLIP_SERVER_ERROR(144),
    EVENT_APP_FLIP_TEMPORARILY_UNAVAILABLE(145),
    EVENT_APP_FLIP_NO_REDIRECT_STATE(146),
    EVENT_APP_FLIP_NULL_RESPONSE_URI(147),
    UNRECOGNIZED(-1);
    

    /* renamed from: ap */
    private final int f179176ap;

    private C65879c(int i) {
        this.f179176ap = i;
    }

    /* renamed from: a */
    public static C65879c m96821a(int i) {
        if (i == 70) {
            return EVENT_VERIFY_PHONE_VERIFY;
        }
        if (i == 71) {
            return EVENT_VERIFY_PHONE_CANCEL;
        }
        if (i == 80) {
            return EVENT_VERIFY_PHONE_FAIL_TRY_AGAIN;
        }
        if (i == 81) {
            return EVENT_VERIFY_PHONE_FAIL_CLOSE;
        }
        if (i == 110) {
            return EVENT_LINKING_INFO_CONTINUE_LINKING;
        }
        if (i == 111) {
            return EVENT_LINKING_INFO_CANCEL_LINKING;
        }
        if (i == 120) {
            return EVENT_USAGE_NOTICE_ACCEPT_NOTICE;
        }
        if (i == 121) {
            return EVENT_USAGE_NOTICE_CANCEL_LINKING;
        }
        switch (i) {
            case 0:
                return EVENT_UNKNOWN;
            case 1:
                return EVENT_TRANSITION;
            case 2:
                return EVENT_NETWORK_ERROR;
            case 3:
                return EVENT_HTTP_CLIENT_ERROR;
            case 4:
                return EVENT_HTTP_SERVER_ERROR;
            case 5:
                return EVENT_MALFORMED_RESPONSE;
            case 6:
                return EVENT_FORM_VALIDATION_ERROR;
            case 7:
                return EVENT_SYSTEM_ACTION_USER_CANCEL;
            default:
                switch (i) {
                    case 20:
                        return EVENT_ACCOUNT_SELECTION_SELECT_ACCOUNT;
                    case 21:
                        return EVENT_ACCOUNT_SELECTION_USE_ANOTHER_ACCOUNT;
                    case 22:
                        return EVENT_ACCOUNT_SELECTION_CANCEL;
                    case 23:
                        return EVENT_ACCOUNT_SELECTION_CREATE_ACCOUNT;
                    default:
                        switch (i) {
                            case 30:
                                return EVENT_PROVIDER_CONSENT_LINK;
                            case 31:
                                return EVENT_PROVIDER_CONSENT_CANCEL;
                            case 32:
                                return EVENT_PROVIDER_CONSENT_LEARN_MORE;
                            default:
                                switch (i) {
                                    case 40:
                                        return EVENT_ACCOUNT_CREATION_CREATE_ACCOUNT;
                                    case 41:
                                        return EVENT_ACCOUNT_CREATION_CANCEL;
                                    case 42:
                                        return EVENT_ACCOUNT_CREATION_CHANGE_PHONE;
                                    case 43:
                                        return EVENT_ACCOUNT_CREATION_ADD_PHONE;
                                    case 44:
                                        return EVENT_ACCOUNT_CREATION_LEARN_MORE;
                                    default:
                                        switch (i) {
                                            case 50:
                                                return EVENT_APP_AUTH_DISMISS;
                                            case 51:
                                                return EVENT_APP_AUTH_NO_CUSTOM_TABS_SUPPORTED_BROWSER;
                                            case 52:
                                                return EVENT_APP_AUTH_BROWSER_WARM_UP_FAILED;
                                            case 53:
                                                return EVENT_APP_AUTH_NO_BROWSER_FOUND;
                                            case 54:
                                                return EVENT_APP_AUTH_INVALID_REQUEST;
                                            case 55:
                                                return EVENT_APP_AUTH_UNAUTHORIZED_CLIENT;
                                            case 56:
                                                return EVENT_APP_AUTH_ACCESS_DENIED;
                                            case 57:
                                                return EVENT_APP_AUTH_UNSUPPORTED_RESPONSE_TYPE;
                                            case 58:
                                                return EVENT_APP_AUTH_INVALID_SCOPE;
                                            case 59:
                                                return EVENT_APP_AUTH_SERVER_ERROR;
                                            case 60:
                                                return EVENT_ADD_PHONE_ADD;
                                            case 61:
                                                return EVENT_ADD_PHONE_CANCEL;
                                            case 90:
                                                return EVENT_ERROR_OK;
                                            case 130:
                                                return EVENT_APP_AUTH_TEMPORARILY_UNAVAILABLE;
                                            case 131:
                                                return EVENT_APP_AUTH_NO_REDIRECT_STATE;
                                            case 132:
                                                return EVENT_APP_AUTH_OTHER;
                                            case 133:
                                                return EVENT_APP_AUTH_NULL_RESPONSE_URI;
                                            case 134:
                                                return EVENT_APP_AUTH_SUCCESS;
                                            case 135:
                                                return EVENT_APP_AUTH_RECEIVE_ACTIVITY_RESULT;
                                            case 136:
                                                return EVENT_APP_AUTH_RECEIVE_NEW_INTENT;
                                            case 137:
                                                return EVENT_APP_AUTH_FRAGMENT_HANDLE_INTENT;
                                            case 140:
                                                return EVENT_APP_FLIP_INVALID_REQUEST;
                                            case 141:
                                                return EVENT_APP_FLIP_UNAUTHORIZED_CLIENT;
                                            case 142:
                                                return EVENT_APP_FLIP_UNSUPPORTED_RESPONSE_TYPE;
                                            case 143:
                                                return EVENT_APP_FLIP_INVALID_SCOPE;
                                            case 144:
                                                return EVENT_APP_FLIP_SERVER_ERROR;
                                            case 145:
                                                return EVENT_APP_FLIP_TEMPORARILY_UNAVAILABLE;
                                            case 146:
                                                return EVENT_APP_FLIP_NO_REDIRECT_STATE;
                                            case 147:
                                                return EVENT_APP_FLIP_NULL_RESPONSE_URI;
                                            default:
                                                switch (i) {
                                                    case 100:
                                                        return EVENT_APP_FLIP_3P_APP_INSTALLED;
                                                    case 101:
                                                        return EVENT_APP_FLIP_3P_APP_NOT_INSTALLED;
                                                    case 102:
                                                        return EVENT_APP_FLIP_3P_APP_SUPPORTED;
                                                    case 103:
                                                        return EVENT_APP_FLIP_3P_APP_NOT_SUPPORTED;
                                                    case 104:
                                                        return EVENT_APP_FLIP_FLOW_SUCCESS;
                                                    case 105:
                                                        return EVENT_APP_FLIP_FLOW_CANCELED;
                                                    case 106:
                                                        return EVENT_APP_FLIP_3P_ERROR_RECOVERABLE;
                                                    case 107:
                                                        return EVENT_APP_FLIP_3P_ERROR_UNRECOVERABLE;
                                                    case 108:
                                                        return EVENT_APP_FLIP_3P_CONSENT_REJECTED;
                                                    default:
                                                        return null;
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f179176ap;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
