package com.google.android.apps.gsa.nga.shared.p6417x;

import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.time.Duration;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.nga.shared.x.n */
/* compiled from: PG */
public final /* synthetic */ class C83364n implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C83356f f227207a;

    /* renamed from: b */
    public final /* synthetic */ C22871g f227208b;

    /* renamed from: c */
    public final /* synthetic */ String f227209c;

    /* renamed from: d */
    public final /* synthetic */ Duration f227210d;

    /* renamed from: e */
    public final /* synthetic */ Object f227211e;

    /* renamed from: f */
    public final /* synthetic */ String f227212f;

    public /* synthetic */ C83364n(C83356f fVar, C22871g gVar, String str, Duration duration, Object obj, String str2) {
        this.f227207a = fVar;
        this.f227208b = gVar;
        this.f227209c = str;
        this.f227210d = duration;
        this.f227211e = obj;
        this.f227212f = str2;
    }

    public final void run() {
        C83356f fVar = this.f227207a;
        C22871g gVar = this.f227208b;
        String str = this.f227209c;
        Duration duration = this.f227210d;
        Object obj = this.f227211e;
        String str2 = this.f227212f;
        C60870cx d = gVar.mo28204d(str, duration.toMillis(), new C83367q(obj));
        ((C60870cx) fVar.f227194c.getAndSet(d)).cancel(false);
        C83357g gVar2 = fVar.f227193b;
        Objects.requireNonNull(gVar2);
        new C90873ag(d, gVar, "[NGA] fetch ".concat(str2), new C83354d(gVar2)).mo85223a(new C83355e(str2));
    }
}
