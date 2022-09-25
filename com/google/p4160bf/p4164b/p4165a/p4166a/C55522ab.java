package com.google.p4160bf.p4164b.p4165a.p4166a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bf.b.a.a.ab */
/* compiled from: PG */
public enum C55522ab implements C62957cd {
    FETCH_REASON_UNSPECIFIED(0),
    FULL_SYNC_INSTRUCTION(1),
    SYNC_INSTRUCTION(2),
    COLLABORATOR_API_CALL(3),
    GUNS_MIGRATION(4),
    INBOX(5),
    DELAYED_IMPRESSION(6),
    REMOTE_DELETED_MESSAGES(7),
    LOCALE_CHANGED(8),
    GROWTHKIT_PERIODIC_FETCH(9);
    

    /* renamed from: k */
    public final int f146514k;

    private C55522ab(int i) {
        this.f146514k = i;
    }

    /* renamed from: a */
    public static C55522ab m87701a(int i) {
        switch (i) {
            case 0:
                return FETCH_REASON_UNSPECIFIED;
            case 1:
                return FULL_SYNC_INSTRUCTION;
            case 2:
                return SYNC_INSTRUCTION;
            case 3:
                return COLLABORATOR_API_CALL;
            case 4:
                return GUNS_MIGRATION;
            case 5:
                return INBOX;
            case 6:
                return DELAYED_IMPRESSION;
            case 7:
                return REMOTE_DELETED_MESSAGES;
            case 8:
                return LOCALE_CHANGED;
            case 9:
                return GROWTHKIT_PERIODIC_FETCH;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m87702b() {
        return C55521aa.f146502a;
    }

    public final int getNumber() {
        return this.f146514k;
    }

    public final String toString() {
        return Integer.toString(this.f146514k);
    }
}
