package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bp.f.b.a.cz */
/* compiled from: PG */
public enum C56299cz implements C62957cd {
    UNKNOWN(0),
    NO_SCRIPT(1),
    SCRIPT_NOT_SUPPORTED(2),
    MULTILINGUAL_SCRIPT_NOT_DOWNLOADED(3),
    MONOLINGUAL_SCRIPT_NOT_DOWNLOADED(4),
    LANGUAGE_NOT_SUPPORTED(5),
    LANGUAGE_NOT_DOWNLOADED(6),
    SUCCESS(7);
    

    /* renamed from: i */
    public final int f150036i;

    private C56299cz(int i) {
        this.f150036i = i;
    }

    /* renamed from: a */
    public static C56299cz m87961a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return NO_SCRIPT;
            case 2:
                return SCRIPT_NOT_SUPPORTED;
            case 3:
                return MULTILINGUAL_SCRIPT_NOT_DOWNLOADED;
            case 4:
                return MONOLINGUAL_SCRIPT_NOT_DOWNLOADED;
            case 5:
                return LANGUAGE_NOT_SUPPORTED;
            case 6:
                return LANGUAGE_NOT_DOWNLOADED;
            case 7:
                return SUCCESS;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m87962b() {
        return C56298cy.f150026a;
    }

    public final int getNumber() {
        return this.f150036i;
    }

    public final String toString() {
        return Integer.toString(this.f150036i);
    }
}
