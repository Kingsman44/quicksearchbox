package com.google.android.apps.gsa.nga.engine.recognition.p6121i.p6122a;

import com.google.android.apps.gsa.nga.engine.p6260x.C79856d;
import com.google.android.apps.gsa.nga.engine.recognition.C77623f;
import com.google.android.apps.gsa.nga.engine.recognition.C77632g;
import com.google.android.apps.gsa.nga.shared.p6296ab.p6299b.C80539a;
import com.google.android.apps.gsa.nga.shared.p6296ab.p6299b.C80542d;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.p4534f.C59081b;
import com.google.speech.p5218j.C67026ih;
import com.google.speech.p5218j.C67087ko;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p3186j$.time.temporal.ChronoUnit;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.i.a.f */
/* compiled from: PG */
public final /* synthetic */ class C77660f implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C77663i f213904a;

    /* renamed from: b */
    public final /* synthetic */ C67087ko f213905b;

    /* renamed from: c */
    public final /* synthetic */ C79856d f213906c;

    public /* synthetic */ C77660f(C77663i iVar, C67087ko koVar, C79856d dVar) {
        this.f213904a = iVar;
        this.f213905b = koVar;
        this.f213906c = dVar;
    }

    public final void run() {
        C77663i iVar = this.f213904a;
        C67087ko koVar = this.f213905b;
        C79856d dVar = this.f213906c;
        C67026ih ihVar = koVar.f182373f;
        if (ihVar == null) {
            ihVar = C67026ih.f182188e;
        }
        C59081b.m91349a(TimeUnit.MILLISECONDS, "time unit");
        float f = ihVar.f182191b;
        float f2 = ihVar.f182192c;
        int i = ihVar.f182190a;
        if (!((i & 1) == 0 || (i & 2) == 0)) {
            iVar.f213913b.mo72714gG(C77623f.m124587e(dVar.f218924a, f, f2, iVar.f213917f.mo26870b()));
        }
        if ((ihVar.f182190a & 4) != 0) {
            C77632g gVar = iVar.f213922k;
            C80539a aVar = (C80539a) C80542d.f221083f.createBuilder();
            aVar.copyOnWrite();
            C80542d dVar2 = (C80542d) aVar.instance;
            dVar2.f221089e = 1;
            dVar2.f221085a |= 8;
            C83320io b = dVar.f218924a.b();
            aVar.copyOnWrite();
            C80542d dVar3 = (C80542d) aVar.instance;
            b.getClass();
            dVar3.f221086b = b;
            dVar3.f221085a |= 1;
            long d = iVar.f213917f.mo26872d();
            aVar.copyOnWrite();
            C80542d dVar4 = (C80542d) aVar.instance;
            dVar4.f221085a |= 2;
            dVar4.f221087c = d;
            long millis = Duration.m71141of(ihVar.f182193d, ChronoUnit.MICROS).toMillis();
            aVar.copyOnWrite();
            C80542d dVar5 = (C80542d) aVar.instance;
            dVar5.f221085a |= 4;
            dVar5.f221088d = millis;
            gVar.mo72723a((C80542d) aVar.build());
        }
    }
}
