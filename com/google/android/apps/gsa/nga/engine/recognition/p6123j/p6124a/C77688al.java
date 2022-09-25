package com.google.android.apps.gsa.nga.engine.recognition.p6123j.p6124a;

import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6260x.C79856d;
import com.google.android.apps.gsa.nga.engine.recognition.C77566as;
import com.google.android.apps.gsa.nga.engine.recognition.C77651h;
import com.google.android.apps.gsa.nga.engine.recognition.p6101a.C77496a;
import com.google.android.apps.gsa.nga.engine.recognition.p6125k.C77732a;
import com.google.android.apps.gsa.nga.engine.recognition.p6125k.p6126a.C77733a;
import com.google.android.apps.gsa.nga.engine.recognition.p6125k.p6126a.C77735c;
import com.google.android.apps.gsa.nga.engine.recognition.p6125k.p6126a.C77741i;
import com.google.android.apps.gsa.nga.engine.recognition.p6131m.p6132a.C77843k;
import com.google.android.apps.gsa.nga.shared.p6363s.C81465n;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.p4534f.C59081b;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.j.a.al */
/* compiled from: PG */
final class C77688al implements C77733a {

    /* renamed from: a */
    private final C79856d f213994a;

    /* renamed from: b */
    private final C77566as f213995b;

    /* renamed from: c */
    private final C77741i f213996c;

    /* renamed from: d */
    private final C77720r f213997d;

    /* renamed from: e */
    private final C77711i f213998e;

    /* renamed from: f */
    private final C77843k f213999f;

    /* renamed from: g */
    private final C21370a f214000g;

    public C77688al(C79856d dVar, C77566as asVar, C77741i iVar, C77720r rVar, C77711i iVar2, C77843k kVar, C21370a aVar) {
        this.f213994a = dVar;
        this.f213995b = asVar;
        this.f213996c = iVar;
        this.f213997d = rVar;
        this.f213998e = iVar2;
        this.f213999f = kVar;
        this.f214000g = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C60870cx mo72777a() {
        C77711i iVar = this.f213998e;
        C79856d dVar = this.f213994a;
        C77566as asVar = this.f213995b;
        C77720r rVar = this.f213997d;
        C22871g gVar = (C22871g) iVar.f214065a.mo17428b();
        gVar.getClass();
        C22871g gVar2 = (C22871g) iVar.f214066b.mo17428b();
        gVar2.getClass();
        C91142g gVar3 = (C91142g) iVar.f214067c.mo17428b();
        gVar3.getClass();
        C76092h hVar = (C76092h) iVar.f214068d.mo17428b();
        hVar.getClass();
        C77735c cVar = (C77735c) iVar.f214069e.mo17428b();
        cVar.getClass();
        C77496a aVar = (C77496a) iVar.f214070f.mo17428b();
        aVar.getClass();
        C77732a aVar2 = (C77732a) iVar.f214071g.mo17428b();
        aVar2.getClass();
        C83305i iVar2 = (C83305i) iVar.f214072h.mo17428b();
        iVar2.getClass();
        C81465n nVar = (C81465n) iVar.f214073i.mo17428b();
        nVar.getClass();
        C22871g gVar4 = (C22871g) iVar.f214074j.mo17428b();
        gVar4.getClass();
        C77713k kVar = (C77713k) iVar.f214075k.mo17428b();
        kVar.getClass();
        C77710h hVar2 = r0;
        C77710h hVar3 = new C77710h(dVar, asVar, this, rVar, gVar, gVar2, gVar3, hVar, cVar, aVar, aVar2, iVar2, nVar, gVar4, kVar);
        C77710h hVar4 = hVar2;
        return hVar4.f214061m.mo28202b("[NGA] S3Microphone.setup", new C77705c(hVar4, this.f213996c.f214163f));
    }

    /* renamed from: b */
    public final void mo72778b(float f, float f2) {
        C59081b.m91349a(TimeUnit.MILLISECONDS, "time unit");
        if (f2 > 0.4f) {
            f2 = Math.min(1.0f, f2 + 0.4f);
        }
        C77651h hVar = new C77651h();
        hVar.mo72751e(f);
        hVar.mo72748b(f2);
        hVar.mo72749c(this.f214000g.mo26870b());
        hVar.mo72750d(this.f213994a.f218924a);
        this.f213999f.mo72714gG(hVar.mo72747a());
    }
}
