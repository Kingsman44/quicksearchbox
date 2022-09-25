package com.google.android.libraries.performance.primes.p2402g;

import android.content.Context;
import com.google.android.libraries.directboot.C20674d;
import com.google.common.p4526f.C59052c;
import dagger.C68214a;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71301ec;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71304ef;

/* renamed from: com.google.android.libraries.performance.primes.g.l */
/* compiled from: PG */
public final /* synthetic */ class C31249l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C31251n f84174a;

    /* renamed from: b */
    public final /* synthetic */ Context f84175b;

    /* renamed from: c */
    public final /* synthetic */ C68214a f84176c;

    /* renamed from: d */
    public final /* synthetic */ Executor f84177d;

    /* renamed from: e */
    public final /* synthetic */ C31257t f84178e;

    /* renamed from: f */
    public final /* synthetic */ C69464a f84179f;

    public /* synthetic */ C31249l(C31251n nVar, Context context, C68214a aVar, Executor executor, C31257t tVar, C69464a aVar2) {
        this.f84174a = nVar;
        this.f84175b = context;
        this.f84176c = aVar;
        this.f84177d = executor;
        this.f84178e = tVar;
        this.f84179f = aVar2;
    }

    public final void run() {
        C31251n nVar = this.f84174a;
        Context context = this.f84175b;
        C68214a aVar = this.f84176c;
        Executor executor = this.f84177d;
        C31257t tVar = this.f84178e;
        C69464a aVar2 = this.f84179f;
        if (C20674d.m38856e(context)) {
            nVar.mo36972a(aVar);
        } else {
            C20674d.m38853b(context, new C31248k(nVar, aVar, executor));
        }
        if (!nVar.f84185c) {
            return;
        }
        if (aVar2 == null) {
            C71301ec ecVar = (C71301ec) C71304ef.f190405d.createBuilder();
            ecVar.copyOnWrite();
            C71304ef efVar = (C71304ef) ecVar.instance;
            efVar.f190409c = 2;
            efVar.f190407a |= 4;
            nVar.f84184b = tVar.mo36976a((C71304ef) ecVar.build());
            return;
        }
        try {
            nVar.f84184b = tVar.mo36976a((C71304ef) aVar2.mo17428b());
        } catch (Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C31251n.f84182a.mo56226d()).mo56382g(th)).mo56372aa(50461)).mo56386p("Couldn't get sampling strategy");
            C71301ec ecVar2 = (C71301ec) C71304ef.f190405d.createBuilder();
            ecVar2.copyOnWrite();
            C71304ef efVar2 = (C71304ef) ecVar2.instance;
            efVar2.f190407a = 2 | efVar2.f190407a;
            efVar2.f190408b = 0;
            ecVar2.copyOnWrite();
            C71304ef efVar3 = (C71304ef) ecVar2.instance;
            efVar3.f190409c = 1;
            efVar3.f190407a |= 4;
            nVar.f84184b = tVar.mo36976a((C71304ef) ecVar2.build());
        }
    }
}
