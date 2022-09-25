package com.google.p4160bf.p4164b.p4165a.p4166a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bf.b.a.a.at */
/* compiled from: PG */
public enum C55540at implements C62957cd {
    REGISTRATION_REASON_UNSPECIFIED(0),
    DEVICE_START(1),
    APP_UPDATED(2),
    ACCOUNT_CHANGED(3),
    SERVER_SYNC_INSTRUCTION(4),
    LOCALE_CHANGED(5),
    TIMEZONE_CHANGED(6),
    COLLABORATOR_API_CALL(7),
    GUNS_MIGRATION(8),
    REGISTRATION_ID_CHANGED(9),
    CHANNEL_BLOCK_STATE_CHANGED(10),
    GROWTHKIT_PERIODIC_REGISTRATION(11);
    

    /* renamed from: m */
    public final int f146563m;

    private C55540at(int i) {
        this.f146563m = i;
    }

    /* renamed from: a */
    public static C55540at m87704a(int i) {
        switch (i) {
            case 0:
                return REGISTRATION_REASON_UNSPECIFIED;
            case 1:
                return DEVICE_START;
            case 2:
                return APP_UPDATED;
            case 3:
                return ACCOUNT_CHANGED;
            case 4:
                return SERVER_SYNC_INSTRUCTION;
            case 5:
                return LOCALE_CHANGED;
            case 6:
                return TIMEZONE_CHANGED;
            case 7:
                return COLLABORATOR_API_CALL;
            case 8:
                return GUNS_MIGRATION;
            case 9:
                return REGISTRATION_ID_CHANGED;
            case 10:
                return CHANNEL_BLOCK_STATE_CHANGED;
            case 11:
                return GROWTHKIT_PERIODIC_REGISTRATION;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m87705b() {
        return C55539as.f146549a;
    }

    public final int getNumber() {
        return this.f146563m;
    }

    public final String toString() {
        return Integer.toString(this.f146563m);
    }
}
