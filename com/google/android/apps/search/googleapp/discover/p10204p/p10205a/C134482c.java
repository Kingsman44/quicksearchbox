package com.google.android.apps.search.googleapp.discover.p10204p.p10205a;

import androidx.work.C4410f;
import androidx.work.C4412h;
import androidx.work.C4634o;
import androidx.work.WorkerParameters;
import com.google.android.apps.search.googleapp.discover.p10204p.p10206b.C134486a;
import com.google.android.apps.search.googleapp.discover.p10204p.p10210d.C134526f;
import com.google.apps.tiktok.contrib.work.C46513b;
import com.google.apps.tiktok.contrib.work.C46570d;
import com.google.apps.tiktok.contrib.work.C46573g;
import com.google.apps.tiktok.contrib.work.C46574h;
import com.google.apps.tiktok.contrib.work.C46582p;
import com.google.apps.tiktok.contrib.work.C46583q;
import com.google.apps.tiktok.contrib.work.C46586t;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62910ar;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.p.a.c */
/* compiled from: PG */
public final class C134482c implements C46513b {

    /* renamed from: a */
    public final C134486a f366246a;

    /* renamed from: b */
    public final C134526f f366247b;

    /* renamed from: c */
    public final boolean f366248c;

    /* renamed from: d */
    public final C46586t f366249d;

    /* renamed from: e */
    private final C71422aw f366250e;

    /* renamed from: f */
    private final C62910ar f366251f;

    /* renamed from: g */
    private final C4412h f366252g;

    public C134482c(C134486a aVar, C71422aw awVar, C134526f fVar, boolean z, C62910ar arVar) {
        C69664n.m101061g(awVar, "lightweightScope");
        this.f366246a = aVar;
        this.f366250e = awVar;
        this.f366247b = fVar;
        this.f366248c = z;
        this.f366251f = arVar;
        C4410f fVar2 = new C4410f();
        fVar2.f14073c = true;
        fVar2.f14074d = true;
        C4412h a = fVar2.mo9349a();
        this.f366252g = a;
        C46582p j = C46586t.m83063j(C134482c.class);
        C46570d dVar = (C46570d) j;
        dVar.f121753b = a;
        dVar.f121757f = C58833ax.m90834k(new C46574h("com.google.android.apps.search.googleapp.discover.ondevicecontent.beyondstoresync", C4634o.UPDATE));
        dVar.f121756e = C58833ax.m90834k(C46583q.m83055c(new C46573g(Math.max(arVar.f169860a / 3600, 2), TimeUnit.HOURS)));
        C46586t a2 = j.mo50561a();
        C69664n.m101060f(a2, "builder(OnDeviceContentS… )\n      )\n      .build()");
        this.f366249d = a2;
    }

    /* renamed from: b */
    public final C60870cx mo21393b(WorkerParameters workerParameters) {
        return C71663i.m104692e(this.f366250e, (C71424ay) null, new C134481b(this, (C69577g) null), 3);
    }
}
