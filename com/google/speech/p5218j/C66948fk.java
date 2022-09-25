package com.google.speech.p5218j;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.speech.j.fk */
/* compiled from: PG */
public enum C66948fk implements C62957cd {
    QP_UNKNOWN(0),
    QP_STOP_ALARM(1),
    QP_SNOOZE_ALARM(2),
    QP_STOP_TIMER(3),
    QP_ANSWER_CALL(4),
    QP_DECLINE_CALL(5),
    QP_SET_ALARM(6),
    QP_CANCEL_ALARM(7),
    QP_SET_LIGHT_ON_OFF(8),
    QP_SET_LIGHT_BRIGHTNESS(9),
    QP_SET_TIMER(10),
    QP_CANCEL_TIMER(11),
    QP_GET_TIME(12),
    QP_GET_WEATHER(13);
    

    /* renamed from: o */
    public final int f181990o;

    private C66948fk(int i) {
        this.f181990o = i;
    }

    /* renamed from: a */
    public static C66948fk m97389a(int i) {
        switch (i) {
            case 0:
                return QP_UNKNOWN;
            case 1:
                return QP_STOP_ALARM;
            case 2:
                return QP_SNOOZE_ALARM;
            case 3:
                return QP_STOP_TIMER;
            case 4:
                return QP_ANSWER_CALL;
            case 5:
                return QP_DECLINE_CALL;
            case 6:
                return QP_SET_ALARM;
            case 7:
                return QP_CANCEL_ALARM;
            case 8:
                return QP_SET_LIGHT_ON_OFF;
            case 9:
                return QP_SET_LIGHT_BRIGHTNESS;
            case 10:
                return QP_SET_TIMER;
            case 11:
                return QP_CANCEL_TIMER;
            case 12:
                return QP_GET_TIME;
            case 13:
                return QP_GET_WEATHER;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m97390b() {
        return C66947fj.f181974a;
    }

    public final int getNumber() {
        return this.f181990o;
    }

    public final String toString() {
        return Integer.toString(this.f181990o);
    }
}
