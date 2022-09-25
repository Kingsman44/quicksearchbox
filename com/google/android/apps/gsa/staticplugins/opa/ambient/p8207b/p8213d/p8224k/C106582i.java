package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8224k;

import com.google.android.apps.gsa.assistant.settings.features.d.u;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.C106546e;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.C106551f;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.C106559h;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.C106562i;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8218e.C106547a;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.k.i */
/* compiled from: PG */
public final class C106582i implements C106562i {

    /* renamed from: a */
    public final C58974d f297172a;

    /* renamed from: b */
    public final u f297173b;

    /* renamed from: c */
    public C106551f f297174c;

    /* renamed from: d */
    boolean f297175d = false;

    /* renamed from: e */
    public final C106581h f297176e = new C106581h(this);

    /* renamed from: f */
    private final C106559h f297177f;

    /* renamed from: g */
    private final C60888db f297178g;

    /* renamed from: h */
    private final C106551f f297179h = new C106578e(this);

    public C106582i(C83564a aVar, u uVar, C106559h hVar, C60888db dbVar) {
        this.f297172a = aVar.mo76900a("AA.Context");
        this.f297173b = uVar;
        this.f297177f = hVar;
        this.f297178g = dbVar;
    }

    /* renamed from: a */
    public final C60870cx mo95582a() {
        C106551f fVar = this.f297174c;
        if (fVar == null) {
            return C118826c.f331423b;
        }
        C106574a aVar = (C106574a) C106575b.f297162e.createBuilder();
        aVar.copyOnWrite();
        C106575b bVar = (C106575b) aVar.instance;
        bVar.f297164a |= 1;
        bVar.f297165b = true;
        return ((C106547a) fVar).f297123a.mo95579e((C106575b) aVar.build());
    }

    /* renamed from: b */
    public final C106546e mo95569b() {
        return C106546e.f297119b;
    }

    /* renamed from: c */
    public final C60870cx mo95570c(C106551f fVar) {
        this.f297173b.m(this.f297176e);
        this.f297175d = true;
        this.f297174c = fVar;
        return C47638k.m84750a(C58485gu.m89846n(this.f297177f.mo95577b(this.f297179h))).mo51520a(C106579f.f297169a, this.f297178g);
    }

    /* renamed from: e */
    public final C60870cx mo95571e() {
        return C47638k.m84750a(C58485gu.m89846n(this.f297177f.mo95578c(this.f297179h))).mo51520a(new C106580g(this), this.f297178g);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("ResetTriggerSource");
        boolean z = this.f297174c != null;
        fVar.mo85292s(C90752i.m148229c("hasListener? " + z));
        boolean z2 = this.f297175d;
        fVar.mo85292s(C90752i.m148229c("isRegistered? " + z2));
    }
}
