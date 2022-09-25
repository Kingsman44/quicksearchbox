package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d;

import android.content.Context;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8231a.C106615m;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.C106546e;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.C106551f;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.C106562i;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8214a.C106519a;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.d.r */
/* compiled from: PG */
public final class C106544r implements C106562i {

    /* renamed from: a */
    public final C58974d f297097a;

    /* renamed from: b */
    public final Context f297098b;

    /* renamed from: c */
    public final C91142g f297099c;

    /* renamed from: d */
    public final C106615m f297100d;

    /* renamed from: e */
    public final C106543q f297101e;

    /* renamed from: f */
    public final C60888db f297102f;

    /* renamed from: g */
    public final C47770dh f297103g;

    /* renamed from: h */
    public final C60836bq f297104h;

    /* renamed from: i */
    public final C106519a f297105i;

    /* renamed from: j */
    public final C91142g f297106j;

    /* renamed from: k */
    public C106551f f297107k;

    /* renamed from: l */
    public boolean f297108l = false;

    /* renamed from: m */
    public C106532f f297109m = null;

    /* renamed from: n */
    public final int f297110n;

    public C106544r(Context context, C91142g gVar, C106615m mVar, C83564a aVar, C60888db dbVar, C47770dh dhVar, C106519a aVar2, C91142g gVar2, int i) {
        this.f297098b = context;
        this.f297099c = gVar;
        this.f297100d = mVar;
        this.f297097a = aVar.mo76900a("AA.Context");
        this.f297102f = dbVar;
        this.f297103g = dhVar;
        this.f297105i = aVar2;
        this.f297110n = i;
        this.f297106j = gVar2;
        this.f297104h = new C60836bq();
        this.f297101e = new C106543q(this);
    }

    /* renamed from: b */
    public final C106546e mo95569b() {
        return C106546e.f297118a;
    }

    /* renamed from: c */
    public final C60870cx mo95570c(C106551f fVar) {
        return this.f297104h.mo57305b(new C106542p(this, fVar), this.f297102f);
    }

    /* renamed from: e */
    public final C60870cx mo95571e() {
        return this.f297104h.mo57305b(new C106541o(this), this.f297102f);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("HeadsetStateTriggerSource");
        boolean z = this.f297108l;
        fVar.mo85292s(C90752i.m148229c("Is registered? " + z));
        boolean z2 = this.f297107k != null;
        fVar.mo85292s(C90752i.m148229c("Has listener? " + z2));
    }
}
