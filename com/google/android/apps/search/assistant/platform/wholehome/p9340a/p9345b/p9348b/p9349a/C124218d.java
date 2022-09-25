package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9348b.p9349a;

import androidx.p104d.p105a.C2169h;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124186b;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124190f;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124203s;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124204t;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9348b.C124214a;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9348b.C124235b;
import com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17597g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3741aa.C48130a;
import com.google.assistant.p3741aa.C48167b;
import com.google.assistant.p3741aa.C48168c;
import com.google.assistant.p3741aa.C48169d;
import com.google.assistant.p3741aa.p3742a.p3743a.C48160h;
import com.google.assistant.p3897e.p3908d.p3909a.C51182m;
import com.google.assistant.p3897e.p3908d.p3909a.C51183n;
import com.google.assistant.p3897e.p3908d.p3909a.C51185p;
import com.google.assistant.p3897e.p3917i.p3918a.C51271bn;
import com.google.assistant.p3897e.p3917i.p3918a.C51274bq;
import com.google.assistant.p3897e.p3921j.C52428rj;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60948g;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Instant;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p5488io.grpc.Status;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.b.a.d */
/* compiled from: PG */
final class C124218d implements C124235b, C70862aj {

    /* renamed from: g */
    private static final C59071e f342991g = C59071e.m91332i("com.google.android.apps.search.assistant.platform.wholehome.a.b.b.a.d");

    /* renamed from: a */
    public final String f342992a;

    /* renamed from: b */
    public final C17597g f342993b;

    /* renamed from: c */
    public final AtomicReference f342994c = new AtomicReference(C124214a.IDLE);

    /* renamed from: d */
    public final AtomicReference f342995d = new AtomicReference();

    /* renamed from: e */
    public final Runnable f342996e;

    /* renamed from: f */
    public final ConcurrentHashMap f342997f = new ConcurrentHashMap();

    /* renamed from: h */
    private final AccountId f342998h;

    /* renamed from: i */
    private final Executor f342999i;

    /* renamed from: j */
    private final Runnable f343000j;

    public C124218d(String str, AccountId accountId, C17597g gVar, Runnable runnable, Runnable runnable2, Executor executor) {
        this.f342992a = str;
        this.f342998h = accountId;
        this.f342993b = gVar;
        this.f343000j = runnable;
        this.f342996e = runnable2;
        this.f342999i = new C60904dr(executor);
    }

    /* renamed from: a */
    public final void mo20121a() {
        ((C59052c) ((C59052c) f342991g.mo56224b()).mo56372aa(36116)).mo56389s("Connection(%s) completed.", this.f342992a);
        this.f342993b.mo20121a();
        this.f343000j.run();
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        if (Status.m102100d(th).getCode() == Status.Code.CANCELLED) {
            ((C59052c) ((C59052c) f342991g.mo56224b()).mo56372aa(36118)).mo56389s("Connection(%s) has been cancelled.", this.f342992a);
        } else {
            ((C59052c) ((C59052c) ((C59052c) f342991g.mo56226d()).mo56382g(th)).mo56372aa(36117)).mo56389s("Connection(%s) failure.", this.f342992a);
        }
        this.f342993b.mo20122b(th);
        this.f343000j.run();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        this.f342999i.execute(C47810es.m84977q(new C124215a(this, (C124190f) obj)));
    }

    /* renamed from: d */
    public final C124186b mo106329d() {
        return (C124186b) this.f342995d.get();
    }

    /* renamed from: e */
    public final C124214a mo106330e() {
        return (C124214a) this.f342994c.get();
    }

    /* renamed from: f */
    public final AccountId mo106331f() {
        return this.f342998h;
    }

    /* renamed from: g */
    public final C60870cx mo106332g(C124204t tVar) {
        C51183n nVar;
        C48169d dVar = tVar.f342963b;
        if (dVar == null) {
            dVar = C48169d.f124635g;
        }
        C48168c cVar = (C48168c) dVar.f124642f.get(0);
        String str = cVar.f124632b;
        C51274bq bqVar = cVar.f124634d;
        if (bqVar == null) {
            bqVar = C51274bq.f133487i;
        }
        C51183n nVar2 = C51183n.f133226e;
        C51185p pVar = bqVar.f133496h;
        if (pVar == null) {
            pVar = C51185p.f133232b;
        }
        Iterator it = pVar.f133234a.iterator();
        while (true) {
            if (it.hasNext()) {
                nVar = (C51183n) it.next();
                C52428rj rjVar = nVar.f133231d;
                if (rjVar == null) {
                    rjVar = C52428rj.f137558m;
                }
                if (!rjVar.f137564e.equals(str)) {
                    C52428rj rjVar2 = nVar.f133231d;
                    if (rjVar2 == null) {
                        rjVar2 = C52428rj.f137558m;
                    }
                    if (rjVar2.f137568i.equals(str)) {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        C51182m mVar = (C51182m) nVar.toBuilder();
        mVar.copyOnWrite();
        C51183n nVar3 = (C51183n) mVar.instance;
        nVar3.f133231d = null;
        nVar3.f133228a &= -2;
        nVar2 = (C51183n) mVar.build();
        C124203s sVar = (C124203s) tVar.toBuilder();
        C48130a aVar = (C48130a) dVar.toBuilder();
        C48167b bVar = (C48167b) cVar.toBuilder();
        C51271bn bnVar = (C51271bn) bqVar.toBuilder();
        bnVar.copyOnWrite();
        C51274bq bqVar2 = (C51274bq) bnVar.instance;
        nVar2.getClass();
        bqVar2.f133495g = nVar2;
        bqVar2.f133489a |= 32;
        C51274bq bqVar3 = (C51274bq) bnVar.build();
        bVar.copyOnWrite();
        C48168c cVar2 = (C48168c) bVar.instance;
        bqVar3.getClass();
        cVar2.f124634d = bqVar3;
        cVar2.f124631a |= 2;
        C48168c cVar3 = (C48168c) bVar.build();
        aVar.copyOnWrite();
        C48169d dVar2 = (C48169d) aVar.instance;
        cVar3.getClass();
        dVar2.mo53142a();
        dVar2.f124642f.set(0, cVar3);
        C48169d dVar3 = (C48169d) aVar.build();
        sVar.copyOnWrite();
        dVar3.getClass();
        ((C124204t) sVar.instance).f342963b = dVar3;
        C124204t tVar2 = (C124204t) sVar.build();
        C17597g gVar = this.f342993b;
        C60948g gVar2 = C60948g.f165068a;
        C124217c cVar4 = new C124217c(gVar, tVar2, str, Instant.now());
        this.f342997f.put(tVar2.f342962a, cVar4);
        return C2169h.m6027a(cVar4);
    }

    /* renamed from: h */
    public final String mo106333h() {
        return this.f342992a;
    }

    /* renamed from: i */
    public final void mo106334i(C48160h hVar) {
        this.f342999i.execute(C47810es.m84977q(new C124216b(this, hVar)));
    }
}
