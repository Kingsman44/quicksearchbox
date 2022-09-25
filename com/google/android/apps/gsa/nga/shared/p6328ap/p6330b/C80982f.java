package com.google.android.apps.gsa.nga.shared.p6328ap.p6330b;

import com.google.android.apps.gsa.nga.shared.p6328ap.C81004x;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82548jg;
import com.google.android.apps.gsa.nga.shared.p6407v.p6414f.C83217a;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7180q.C91084c;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.ap.b.f */
/* compiled from: PG */
public final class C80982f implements C81004x {

    /* renamed from: a */
    public static final C58974d f221986a = C58974d.m91134h("VisMonitoringLogger");

    /* renamed from: b */
    public final String f221987b;

    /* renamed from: c */
    public boolean f221988c;

    /* renamed from: d */
    private final C21370a f221989d;

    /* renamed from: e */
    private final C22871g f221990e;

    /* renamed from: f */
    private final Optional f221991f;

    /* renamed from: g */
    private final Optional f221992g;

    /* renamed from: h */
    private final C91142g f221993h;

    /* renamed from: i */
    private long f221994i;

    /* renamed from: j */
    private C60870cx f221995j = C60856cj.m92898g();

    public C80982f(C21370a aVar, C22871g gVar, Optional optional, Optional optional2, C91142g gVar2, C91084c cVar) {
        this.f221989d = aVar;
        this.f221990e = gVar;
        this.f221991f = optional;
        this.f221992g = optional2;
        this.f221993h = gVar2;
        this.f221987b = cVar.f254376p;
    }

    /* renamed from: a */
    public final void mo74759a() {
        this.f221994i = this.f221989d.mo26871c();
        this.f221990e.mo28212l("[NGA] logOnCreate", new C80978b(this));
        long d = this.f221993h.mo85399d(C90126fx.f251776pg);
        this.f221995j = this.f221990e.mo28208h("[NGA] Delayed logging for VIS onShow() not called after onCreate()", d, new C80979c(this, d));
    }

    /* renamed from: b */
    public final void mo74760b() {
        if (!this.f221995j.isDone()) {
            this.f221995j.cancel(true);
        }
        if (!this.f221988c) {
            this.f221990e.mo28212l("[NGA] logOnShow", new C80981e(this, this.f221989d.mo26871c() - this.f221994i));
        }
    }

    /* renamed from: c */
    public final String mo74761c() {
        return ((C83217a) this.f221991f.map(C80980d.f221983a).orElse(C83217a.UNKNOWN)).f226840e;
    }

    /* renamed from: d */
    public final void mo74762d(C82548jg jgVar) {
        this.f221992g.ifPresent(new C80977a(jgVar));
    }
}
