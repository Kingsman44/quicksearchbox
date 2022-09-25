package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7974b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.b.b */
/* compiled from: PG */
public enum C101548b implements C62957cd {
    LINK_ACCOUNT_FAILED(0),
    LINK_ACCOUNT_SUCCEEDED_CHECK_ACCOUNT_IS_LINKED_FAILED(1),
    LINK_ACCOUNT_SUCCEEDED_CHECK_ACCOUNT_IS_LINKED_SUCCEEDED(2);
    

    /* renamed from: d */
    public final int f283388d;

    private C101548b(int i) {
        this.f283388d = i;
    }

    /* renamed from: a */
    public static C101548b m167926a(int i) {
        if (i == 0) {
            return LINK_ACCOUNT_FAILED;
        }
        if (i == 1) {
            return LINK_ACCOUNT_SUCCEEDED_CHECK_ACCOUNT_IS_LINKED_FAILED;
        }
        if (i != 2) {
            return null;
        }
        return LINK_ACCOUNT_SUCCEEDED_CHECK_ACCOUNT_IS_LINKED_SUCCEEDED;
    }

    /* renamed from: b */
    public static C62959cf m167927b() {
        return C101546a.f283378a;
    }

    public final int getNumber() {
        return this.f283388d;
    }

    public final String toString() {
        return Integer.toString(this.f283388d);
    }
}
