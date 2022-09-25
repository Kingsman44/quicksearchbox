package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.core.state.p6864a.C86792g;
import com.google.android.apps.gsa.search.core.state.p6864a.C86795j;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.cu */
/* compiled from: PG */
public final class C86899cu {

    /* renamed from: a */
    public C86795j f234667a;

    /* renamed from: b */
    private final C68214a f234668b;

    /* renamed from: c */
    private final C68214a f234669c;

    public C86899cu(C68214a aVar, C68214a aVar2) {
        this.f234668b = aVar;
        this.f234669c = aVar2;
    }

    /* renamed from: a */
    public final C86795j mo80559a() {
        return mo80560b(((C86792g) this.f234669c.mo27525b()).mo80447f().mo81992b());
    }

    /* renamed from: b */
    public final C86795j mo80560b(String str) {
        if (!str.equals("search")) {
            return (C86795j) this.f234668b.mo27525b();
        }
        C86795j jVar = this.f234667a;
        jVar.getClass();
        return jVar;
    }
}
