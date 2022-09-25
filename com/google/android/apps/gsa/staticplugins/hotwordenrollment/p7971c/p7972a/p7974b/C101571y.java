package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7974b;

import com.google.android.libraries.gsa.p1876k.C22864c;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.b.y */
/* compiled from: PG */
public final /* synthetic */ class C101571y implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C101571y f283424a = new C101571y();

    private /* synthetic */ C101571y() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        if (Collection.EL.stream((List) obj).anyMatch(C101572z.f283425a)) {
            return C101548b.LINK_ACCOUNT_SUCCEEDED_CHECK_ACCOUNT_IS_LINKED_FAILED;
        }
        return C101548b.LINK_ACCOUNT_SUCCEEDED_CHECK_ACCOUNT_IS_LINKED_SUCCEEDED;
    }
}
