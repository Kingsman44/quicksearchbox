package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7983g;

import com.google.android.apps.gsa.configuration.C74464a;
import com.google.android.apps.gsa.search.core.p6805i.C86123s;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.speech.p7271d.C92228e;
import com.google.android.apps.gsa.speech.p7271d.C92229f;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.g.m */
/* compiled from: PG */
public final class C101845m extends C92229f {

    /* renamed from: c */
    private final C86124t f284077c;

    /* renamed from: d */
    private final C68214a f284078d;

    /* renamed from: e */
    private C86123s f284079e;

    public C101845m(C86124t tVar, C90931ca caVar, C68214a aVar) {
        super(C92228e.EXPERIMENTAL_CONFIG, caVar, tVar);
        this.f284077c = tVar;
        this.f284078d = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo86900a() {
        if (this.f284077c.mo79760z()) {
            mo86905e(true);
            return;
        }
        if (this.f284079e == null) {
            this.f284079e = new C101844l(this);
        }
        this.f284077c.mo79738i(this.f284079e);
        ((C74464a) this.f284078d.mo27525b()).mo70781b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo86901b() {
        C86123s sVar = this.f284079e;
        if (sVar != null) {
            this.f284077c.mo79740k(sVar);
        }
    }
}
