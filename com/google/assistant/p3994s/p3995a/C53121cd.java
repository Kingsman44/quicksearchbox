package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.s.a.cd */
/* compiled from: PG */
public enum C53121cd implements C62957cd {
    UNKNOWN(0),
    AGENDA(1),
    REMINDERS(2),
    WEATHER(3),
    FLIGHT_STATUS(4),
    BILL(5),
    BIRTHDAY(6),
    PPT(7),
    IMPLICIT_REMINDERS(8),
    DO_IT_AGAIN(9),
    MORNING_NOTIFICATION(10),
    INPUT_SUGGESTIONS(11),
    WHEN_IS(12),
    UNIT_TEST(999);
    

    /* renamed from: o */
    public final int f139214o;

    private C53121cd(int i) {
        this.f139214o = i;
    }

    /* renamed from: a */
    public static C53121cd m86778a(int i) {
        if (i == 999) {
            return UNIT_TEST;
        }
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return AGENDA;
            case 2:
                return REMINDERS;
            case 3:
                return WEATHER;
            case 4:
                return FLIGHT_STATUS;
            case 5:
                return BILL;
            case 6:
                return BIRTHDAY;
            case 7:
                return PPT;
            case 8:
                return IMPLICIT_REMINDERS;
            case 9:
                return DO_IT_AGAIN;
            case 10:
                return MORNING_NOTIFICATION;
            case 11:
                return INPUT_SUGGESTIONS;
            case 12:
                return WHEN_IS;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m86779b() {
        return C53120cc.f139198a;
    }

    public final int getNumber() {
        return this.f139214o;
    }

    public final String toString() {
        return Integer.toString(this.f139214o);
    }
}
