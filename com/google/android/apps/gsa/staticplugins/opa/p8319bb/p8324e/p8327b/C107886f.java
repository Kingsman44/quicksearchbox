package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.p8327b;

import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8583g.p8586b.C113448a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8583g.p8586b.C113454g;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8583g.p8586b.C113455h;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8583g.p8586b.C113461n;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.e.b.f */
/* compiled from: PG */
public final class C107886f {

    /* renamed from: a */
    public static final C59071e f300188a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.bb.e.b.f");

    /* renamed from: b */
    public final C113448a f300189b;

    /* renamed from: c */
    public final C22871g f300190c;

    /* renamed from: d */
    public final C68214a f300191d;

    /* renamed from: e */
    public final C113461n f300192e;

    /* renamed from: f */
    public final Optional f300193f;

    /* renamed from: g */
    public final C84466a f300194g;

    /* renamed from: h */
    private final C113455h f300195h;

    /* renamed from: i */
    private C113454g f300196i;

    public C107886f(C113448a aVar, C22871g gVar, C84466a aVar2, C68214a aVar3, C113455h hVar, C113461n nVar, Optional optional) {
        this.f300189b = aVar;
        this.f300190c = gVar;
        this.f300194g = aVar2;
        C59104x b = f300188a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HttpStreamingTapasSearchCon");
        ((C59052c) ((C59052c) b).mo56372aa(26360)).mo56352E("taskGraphFactory: %s#%d", aVar2, aVar2.hashCode());
        this.f300195h = hVar;
        this.f300192e = nVar;
        this.f300191d = aVar3;
        this.f300193f = optional;
    }

    /* renamed from: a */
    public final C113454g mo96325a() {
        if (this.f300196i == null) {
            this.f300196i = this.f300195h.mo100237a(new C107885e(this));
        }
        return this.f300196i;
    }
}
