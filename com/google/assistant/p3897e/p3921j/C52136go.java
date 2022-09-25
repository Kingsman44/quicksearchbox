package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.j.go */
/* compiled from: PG */
public enum C52136go implements C62957cd {
    UNSPECIFIED(0),
    RINGTONE(1),
    NOTIFICATION(2),
    MEDIA(3),
    ALARM(4),
    SYSTEM(5);
    

    /* renamed from: g */
    public final int f136807g;

    private C52136go(int i) {
        this.f136807g = i;
    }

    /* renamed from: a */
    public static C52136go m86517a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return RINGTONE;
        }
        if (i == 2) {
            return NOTIFICATION;
        }
        if (i == 3) {
            return MEDIA;
        }
        if (i == 4) {
            return ALARM;
        }
        if (i != 5) {
            return null;
        }
        return SYSTEM;
    }

    /* renamed from: b */
    public static C62959cf m86518b() {
        return C52135gn.f136799a;
    }

    public final int getNumber() {
        return this.f136807g;
    }

    public final String toString() {
        return Integer.toString(this.f136807g);
    }
}
