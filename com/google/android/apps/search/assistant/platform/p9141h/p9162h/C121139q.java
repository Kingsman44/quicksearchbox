package com.google.android.apps.search.assistant.platform.p9141h.p9162h;

import com.google.android.libraries.search.p3005i.C38469m;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47636i;
import com.google.assistant.p3897e.p3921j.C51756ci;
import com.google.common.p4526f.C59052c;
import com.google.common.p4580v.C60944c;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65138c;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65767ay;
import com.google.protos.p5129p.p5131b.C65768az;
import com.google.protos.p5129p.p5131b.C65797ca;
import com.google.protos.p5129p.p5131b.C65798cb;
import com.google.protos.p5129p.p5131b.C65806cj;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.assistant.platform.h.h.q */
/* compiled from: PG */
final class C121139q implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ AtomicBoolean f336586a;

    /* renamed from: b */
    final /* synthetic */ Boolean f336587b;

    /* renamed from: c */
    final /* synthetic */ Boolean f336588c;

    /* renamed from: d */
    final /* synthetic */ C121140r f336589d;

    public C121139q(C121140r rVar, AtomicBoolean atomicBoolean, Boolean bool, Boolean bool2) {
        this.f336589d = rVar;
        this.f336586a = atomicBoolean;
        this.f336587b = bool;
        this.f336588c = bool2;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C121140r.f336590a.mo56226d()).mo56382g(th)).mo56372aa(35716)).mo56386p("Failed to update personal response bit");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C51756ci ciVar;
        Void voidR = (Void) obj;
        if (this.f336586a.get()) {
            for (C121115a a : (Set) this.f336589d.f336594e.mo27525b()) {
                a.mo105055a();
            }
            if (this.f336587b.booleanValue()) {
                C121140r rVar = this.f336589d;
                if (rVar.f336599j) {
                    boolean booleanValue = this.f336588c.booleanValue();
                    C38469m mVar = rVar.f336595f;
                    C65753ak akVar = C121140r.f336591b;
                    C65797ca caVar = (C65797ca) C65798cb.f178854e.createBuilder();
                    C65806cj cjVar = C65806cj.PERSONAL_RESULTS;
                    caVar.copyOnWrite();
                    C65798cb cbVar = (C65798cb) caVar.instance;
                    cbVar.f178859d = cjVar.f178896v;
                    cbVar.f178856a |= 1;
                    if (booleanValue) {
                        ciVar = C51756ci.ALL_PERSONAL_DATA;
                    } else {
                        ciVar = C51756ci.NO_PERSONAL_DATA;
                    }
                    caVar.copyOnWrite();
                    C65798cb cbVar2 = (C65798cb) caVar.instance;
                    cbVar2.f178858c = Integer.valueOf(ciVar.f135790e);
                    cbVar2.f178857b = 2;
                    C65767ay ayVar = (C65767ay) C65768az.f178793f.createBuilder();
                    String str = C121140r.f336592c;
                    ayVar.copyOnWrite();
                    C65768az azVar = (C65768az) ayVar.instance;
                    str.getClass();
                    azVar.f178795a |= 4;
                    azVar.f178798d = str;
                    C65138c cVar = (C65138c) C65139d.f176307e.createBuilder();
                    long b = C60944c.m93089b(Duration.ofMillis(rVar.f336596g.mo26870b()));
                    cVar.copyOnWrite();
                    C65139d dVar = (C65139d) cVar.instance;
                    dVar.f176309a |= 1;
                    dVar.f176310b = b;
                    cVar.copyOnWrite();
                    C65139d dVar2 = (C65139d) cVar.instance;
                    dVar2.f176309a = 2 | dVar2.f176309a;
                    dVar2.f176311c = 0;
                    cVar.copyOnWrite();
                    C65139d dVar3 = (C65139d) cVar.instance;
                    dVar3.f176309a |= 4;
                    dVar3.f176312d = 0;
                    ayVar.copyOnWrite();
                    C65768az azVar2 = (C65768az) ayVar.instance;
                    C65139d dVar4 = (C65139d) cVar.build();
                    dVar4.getClass();
                    azVar2.f178796b = dVar4;
                    azVar2.f178795a |= 1;
                    C63062g gVar = (C63062g) C63070h.f170215c.createBuilder();
                    gVar.copyOnWrite();
                    ((C63070h) gVar.instance).f170217a = "type.googleapis.com/geller.oneplatform.PrivacySettingsState";
                    C63088z byteString = ((C65798cb) caVar.build()).toByteString();
                    gVar.copyOnWrite();
                    byteString.getClass();
                    ((C63070h) gVar.instance).f170218b = byteString;
                    ayVar.copyOnWrite();
                    C65768az azVar3 = (C65768az) ayVar.instance;
                    C63070h hVar = (C63070h) gVar.build();
                    hVar.getClass();
                    azVar3.f178799e = hVar;
                    azVar3.f178795a |= 8;
                    C60856cj.m92911t(C47636i.m84746e(mVar.mo41434e(akVar, (C65768az) ayVar.build())).mo51519b(new C121136n(rVar), rVar.f336593d), C47810es.m84974n(new C121138p()), this.f336589d.f336593d);
                }
            }
        }
    }
}
