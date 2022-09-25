package com.google.android.apps.gsa.staticplugins.fedass.p7948g;

import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100719ab;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100721ad;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100742h;
import com.google.android.apps.gsa.staticplugins.fedass.p7940b.C100775f;
import com.google.android.apps.gsa.staticplugins.fedass.p7940b.C100776g;
import com.google.android.apps.gsa.staticplugins.fedass.p7940b.C100777h;
import com.google.android.apps.gsa.staticplugins.fedass.p7940b.C100784o;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19409m;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.g.b */
/* compiled from: PG */
public final class C100851b implements C19409m {

    /* renamed from: a */
    public static final C59071e f281814a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.fedass.g.b");

    /* renamed from: b */
    public final C100721ad f281815b;

    /* renamed from: c */
    private final C68214a f281816c;

    /* renamed from: d */
    private final C68214a f281817d;

    public C100851b(C100721ad adVar, C68214a aVar, C68214a aVar2) {
        this.f281815b = adVar;
        this.f281816c = aVar;
        this.f281817d = aVar2;
    }

    /* renamed from: a */
    public final C60870cx mo24603a(String str) {
        C60870cx cxVar;
        C100777h hVar = (C100777h) this.f281817d.mo27525b();
        if (!hVar.mo92046b()) {
            cxVar = C60856cj.m92900i(Optional.empty());
        } else {
            C100742h e = C100742h.m166944c(((C100784o) hVar.f281683b.mo17428b()).mo92047a(str)).mo92035e(new C100775f(hVar));
            e.mo92038i(C100776g.f281681a);
            cxVar = e.f281631a;
        }
        C60870cx e2 = ((C100719ab) this.f281816c.mo27525b()).mo92021e(str);
        return C60856cj.m92895d(cxVar, e2).mo57334a(new C100850a(this, e2, cxVar), C60826bg.f164896a);
    }
}
