package com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.d.a.t */
/* compiled from: PG */
public enum C80265t implements C62957cd {
    FAILURE_CAUSE_UNKNOWN(0),
    SEARCH_SERVICE_CALL_FAILED(1),
    EXECUTION_MISMATCH(2),
    STATE_CHANGE_IDLE(3),
    TIMEOUT(4),
    GESTURE_NOT_SWIPE(5),
    PIE_NOT_ELIGIBLE(6),
    SWIPE_INVOCATION_DISMISSED(7),
    LIGHTWEIGHT_SWIPE_INVOCATION_DISMISSED(29),
    LIGHTWEIGHT_LONG_PRESS_HOME_INVOCATION_DISMISSED(41),
    UI_EXIT_CLICKED(20),
    PRECONDITIONS_FAILED(8),
    FLOW_ALREADY_IN_PROGRESS(9),
    FLOW_STATES_EMPTY(10),
    TRIGGER_PIE_NOT_ELIGIBLE(11),
    TRIGGER_FLOW_IN_PROGRESS(12),
    TRIGGER_FLOW_CREATION_FAILED(13),
    TRIGGER_SCREEN_LOCKED(21),
    TRIGGER_NOTIFICATION_DISMISSED(14),
    TRIGGER_NOTIFICATION_ALREADY_ACTIVE(15),
    TRIGGER_NOTIFICATION_ALREADY_DISPLAYED(16),
    TRIGGER_NOTIFICATION_DISPLAY_FAILED(17),
    TRIGGER_NOTIFICATION_GLOBAL_CAP_REACHED(18),
    TRIGGER_NOTIFICATION_INVALID_DATA(19),
    TRIGGER_NOTIFICATION_FAILED_TO_CREATE_PENDINGINTENT(22),
    TRIGGER_NOTIFICATION_RATE_LIMITED_GLOBALLY(23),
    TRIGGER_NOTIFICATION_RATE_LIMITED_PER_FLOW(24),
    TRIGGER_NOTIFICATION_RATE_LIMITED_PER_FLOW_SUCCESS(31),
    TRIGGER_NOTIFICATION_MAXIMUM_PER_FLOW(32),
    TRIGGER_NOTIFICATION_PIE_NOT_ENABLED(25),
    TRIGGER_NOTIFICATION_PIE_NOT_ELIGIBLE(26),
    TRIGGER_NOTIFICATION_USER_IS_COUNTERFACTUAL(33),
    TRIGGER_NOTIFICATION_INIT_DELAY(45),
    TRIGGER_SWIPE_EDUCATION_USER_IS_NOT_ASSISTANT_USER(27),
    TRIGGER_SWIPE_EDUCATION_USER_IS_SWIPE_USER(28),
    TRIGGER_ONDEVICE_ACTION_LOGGING_NOT_ENABLED(30),
    NGA_OPA_PROMO_NOTIFICATION_FLOW_NOT_SPECIFIED(34),
    LISTENING_TIMEOUT(35),
    LISTENING_CANCELLATION(36),
    LISTENING_IMPLICIT_DISMISSAL(37),
    ASSISTANT_TRIGGER_NOT_AVAILABLE(38),
    HOTWORD_INVOCATION_TRYSAYING_DISMISSED(39),
    TRIGGER_OPEN_APP_HOTWORD_NOT_ENABLED(40),
    TRIGGER_UI_NOT_SUPPORTED(42),
    TRIGGER_OPA_PROACTIVE_NOTIFICATION_FAILED(43),
    TRIGGER_OPA_PROACTIVE_NOTIFICATION_TAP_FAILED(44),
    WAIT_FOR_FOREGROUND_APP_ERROR(46),
    WAIT_FOR_FOREGROUND_APP_NEGATIVE(47),
    TRIGGER_INVALID_REQUEST(48),
    NOTIFICATIONS_DISABLED(49);
    

    /* renamed from: Y */
    public final int f220260Y;

    private C80265t(int i) {
        this.f220260Y = i;
    }

    /* renamed from: a */
    public static C80265t m128108a(int i) {
        switch (i) {
            case 0:
                return FAILURE_CAUSE_UNKNOWN;
            case 1:
                return SEARCH_SERVICE_CALL_FAILED;
            case 2:
                return EXECUTION_MISMATCH;
            case 3:
                return STATE_CHANGE_IDLE;
            case 4:
                return TIMEOUT;
            case 5:
                return GESTURE_NOT_SWIPE;
            case 6:
                return PIE_NOT_ELIGIBLE;
            case 7:
                return SWIPE_INVOCATION_DISMISSED;
            case 8:
                return PRECONDITIONS_FAILED;
            case 9:
                return FLOW_ALREADY_IN_PROGRESS;
            case 10:
                return FLOW_STATES_EMPTY;
            case 11:
                return TRIGGER_PIE_NOT_ELIGIBLE;
            case 12:
                return TRIGGER_FLOW_IN_PROGRESS;
            case 13:
                return TRIGGER_FLOW_CREATION_FAILED;
            case 14:
                return TRIGGER_NOTIFICATION_DISMISSED;
            case 15:
                return TRIGGER_NOTIFICATION_ALREADY_ACTIVE;
            case 16:
                return TRIGGER_NOTIFICATION_ALREADY_DISPLAYED;
            case 17:
                return TRIGGER_NOTIFICATION_DISPLAY_FAILED;
            case 18:
                return TRIGGER_NOTIFICATION_GLOBAL_CAP_REACHED;
            case 19:
                return TRIGGER_NOTIFICATION_INVALID_DATA;
            case 20:
                return UI_EXIT_CLICKED;
            case 21:
                return TRIGGER_SCREEN_LOCKED;
            case 22:
                return TRIGGER_NOTIFICATION_FAILED_TO_CREATE_PENDINGINTENT;
            case 23:
                return TRIGGER_NOTIFICATION_RATE_LIMITED_GLOBALLY;
            case 24:
                return TRIGGER_NOTIFICATION_RATE_LIMITED_PER_FLOW;
            case 25:
                return TRIGGER_NOTIFICATION_PIE_NOT_ENABLED;
            case 26:
                return TRIGGER_NOTIFICATION_PIE_NOT_ELIGIBLE;
            case 27:
                return TRIGGER_SWIPE_EDUCATION_USER_IS_NOT_ASSISTANT_USER;
            case 28:
                return TRIGGER_SWIPE_EDUCATION_USER_IS_SWIPE_USER;
            case 29:
                return LIGHTWEIGHT_SWIPE_INVOCATION_DISMISSED;
            case 30:
                return TRIGGER_ONDEVICE_ACTION_LOGGING_NOT_ENABLED;
            case 31:
                return TRIGGER_NOTIFICATION_RATE_LIMITED_PER_FLOW_SUCCESS;
            case 32:
                return TRIGGER_NOTIFICATION_MAXIMUM_PER_FLOW;
            case 33:
                return TRIGGER_NOTIFICATION_USER_IS_COUNTERFACTUAL;
            case 34:
                return NGA_OPA_PROMO_NOTIFICATION_FLOW_NOT_SPECIFIED;
            case 35:
                return LISTENING_TIMEOUT;
            case 36:
                return LISTENING_CANCELLATION;
            case 37:
                return LISTENING_IMPLICIT_DISMISSAL;
            case 38:
                return ASSISTANT_TRIGGER_NOT_AVAILABLE;
            case 39:
                return HOTWORD_INVOCATION_TRYSAYING_DISMISSED;
            case 40:
                return TRIGGER_OPEN_APP_HOTWORD_NOT_ENABLED;
            case 41:
                return LIGHTWEIGHT_LONG_PRESS_HOME_INVOCATION_DISMISSED;
            case 42:
                return TRIGGER_UI_NOT_SUPPORTED;
            case 43:
                return TRIGGER_OPA_PROACTIVE_NOTIFICATION_FAILED;
            case 44:
                return TRIGGER_OPA_PROACTIVE_NOTIFICATION_TAP_FAILED;
            case 45:
                return TRIGGER_NOTIFICATION_INIT_DELAY;
            case 46:
                return WAIT_FOR_FOREGROUND_APP_ERROR;
            case 47:
                return WAIT_FOR_FOREGROUND_APP_NEGATIVE;
            case 48:
                return TRIGGER_INVALID_REQUEST;
            case 49:
                return NOTIFICATIONS_DISABLED;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m128109b() {
        return C80264s.f220208a;
    }

    public final int getNumber() {
        return this.f220260Y;
    }

    public final String toString() {
        return Integer.toString(this.f220260Y);
    }
}
