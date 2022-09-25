package com.google.android.apps.gsa.search.core.p6816p;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.search.core.p.ah */
/* compiled from: PG */
public final class C86198ah {

    /* renamed from: a */
    public static final C59071e f232934a = C59071e.m91332i("com.google.android.apps.gsa.search.core.p.ah");

    /* renamed from: b */
    public final C58485gu f232935b;

    public C86198ah(C86196af afVar) {
        this.f232935b = C58485gu.m89842j(afVar.f232930a);
    }

    /* renamed from: a */
    public final void mo79834a(Exception exc) {
        C58485gu guVar = this.f232935b;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            ((C86197ag) guVar.get(i)).f232931a.mo57357o(exc);
        }
    }
}
