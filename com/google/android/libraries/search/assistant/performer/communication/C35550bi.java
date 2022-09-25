package com.google.android.libraries.search.assistant.performer.communication;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62958ce;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.bi */
/* compiled from: PG */
public enum C35550bi implements C62957cd {
    CALL_PERFORMER_TELECOM_PACKAGE_MISSING(0),
    CALL_PERFORMER_NO_TELECOM_MANAGER(1);
    

    /* renamed from: c */
    public static final C62958ce f93354c = null;

    /* renamed from: d */
    private final int f93356d;

    static {
        f93354c = new C35549bh();
    }

    private C35550bi(int i) {
        this.f93356d = i;
    }

    /* renamed from: a */
    public static C35550bi m63909a(int i) {
        if (i == 0) {
            return CALL_PERFORMER_TELECOM_PACKAGE_MISSING;
        }
        if (i != 1) {
            return null;
        }
        return CALL_PERFORMER_NO_TELECOM_MANAGER;
    }

    public final int getNumber() {
        return this.f93356d;
    }

    public final String toString() {
        return Integer.toString(this.f93356d);
    }
}
