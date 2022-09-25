package com.google.android.libraries.mdi.p2213d.p2219c.p2222c;

import android.content.Context;
import com.google.android.libraries.mdi.p2210b.C28596a;
import com.google.android.libraries.mdi.p2213d.C28612a;
import com.google.android.libraries.mdi.p2213d.C28619b;
import com.google.android.libraries.mdi.p2213d.C28621c;
import com.google.android.libraries.mdi.p2213d.C28683d;
import com.google.android.libraries.mdi.p2213d.C28684e;
import com.google.android.libraries.mdi.p2213d.C28685f;
import com.google.android.libraries.mdi.p2213d.p2214a.p2215a.C28614b;
import com.google.android.libraries.mdi.p2213d.p2214a.p2215a.C28615c;
import com.google.android.libraries.mdi.p2213d.p2214a.p2215a.C28616d;
import com.google.android.libraries.mdi.p2213d.p2214a.p2216b.p2217a.C28618a;
import com.google.android.libraries.mdi.p2213d.p2219c.C28622a;
import com.google.android.libraries.mdi.p2213d.p2219c.C28679h;
import com.google.android.libraries.mdi.p2213d.p2219c.C28680i;
import com.google.android.libraries.mdi.p2213d.p2219c.C28681j;
import com.google.android.libraries.mdi.p2213d.p2219c.p2221b.C28625a;
import com.google.android.libraries.mdi.p2213d.p2219c.p2222c.p2223a.C28628a;
import com.google.android.libraries.mdi.p2213d.p2219c.p2222c.p2224b.C28641b;
import com.google.android.libraries.mdi.p2213d.p2219c.p2222c.p2225c.C28643a;
import com.google.android.libraries.mdi.p2213d.p2219c.p2222c.p2225c.C28644b;
import com.google.android.libraries.mdi.p2213d.p2219c.p2222c.p2225c.C28645c;
import com.google.android.libraries.mdi.p2213d.p2219c.p2227d.C28675a;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45642av;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4552o.p4566l.C60124ap;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4017at.p4078i.p4079a.C54290d;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;
import p5304e.p5305a.p5306a.p5427s.p5428a.C69137a;

/* renamed from: com.google.android.libraries.mdi.d.c.c.x */
/* compiled from: PG */
public final class C28671x implements C28681j, C28643a, C28644b {

    /* renamed from: a */
    public final C28628a f77929a;

    /* renamed from: b */
    public final C28641b f77930b;

    /* renamed from: c */
    public final C28618a f77931c;

    /* renamed from: d */
    private final Map f77932d = new LinkedHashMap();

    /* renamed from: e */
    private final Object f77933e = new Object();

    /* renamed from: f */
    private final C28645c f77934f;

    /* renamed from: g */
    private final Context f77935g;

    /* renamed from: h */
    private final C28615c f77936h;

    /* renamed from: i */
    private final C28625a f77937i;

    public C28671x(C28645c cVar, Context context, C28641b bVar, C28618a aVar, C28615c cVar2, C28628a aVar2, C28625a aVar3) {
        this.f77934f = cVar;
        this.f77935g = context;
        this.f77930b = bVar;
        this.f77931c = aVar;
        this.f77936h = cVar2;
        this.f77929a = aVar2;
        this.f77937i = aVar3;
    }

    /* renamed from: l */
    public static boolean m53539l(C28638aj ajVar) {
        C28637ai aiVar = ajVar.f77884b;
        if (aiVar == null) {
            aiVar = C28637ai.f77874e;
        }
        return !aiVar.equals(C28637ai.f77874e);
    }

    /* renamed from: m */
    public static boolean m53540m(C28638aj ajVar) {
        return !C28638aj.f77881c.equals(ajVar);
    }

    /* renamed from: n */
    public static boolean m53541n(C28638aj ajVar, C28680i iVar) {
        C54290d dVar = ajVar.f77883a;
        if (dVar == null) {
            dVar = C54290d.f142638b;
        }
        C45642av a = C28675a.m53558a(dVar);
        if (a != null) {
            return ((C28622a) iVar).f77850a || !a.f120078d;
        }
        return false;
    }

    /* renamed from: o */
    private final C60870cx m53542o() {
        C47633f g = C47633f.m84733g(this.f77931c.f77843a.mo46042d());
        if (!C69137a.f185311a.mo6453a().mo60920b(this.f77935g)) {
            return g;
        }
        return g.mo51514f(IOException.class, new C28664q(this), C60826bg.f164896a);
    }

    /* renamed from: p */
    private final void m53543p() {
        if (this.f77937i.mo34302d()) {
            C28615c cVar = this.f77936h;
            C28596a aVar = cVar.f77839b;
            C28614b bVar = (C28614b) cVar.f77838a;
            C60124ap a = aVar.mo34273a((bVar.f77836a + "#null#" + bVar.f77837b) + ":1004");
            if (a != null) {
                C28612a aVar2 = (C28612a) C28683d.f77943f.createBuilder();
                long j = a.f162610d;
                aVar2.copyOnWrite();
                C28683d dVar = (C28683d) aVar2.instance;
                dVar.f77945a |= 32;
                dVar.f77948d = (int) j;
                C28619b bVar2 = (C28619b) C28621c.f77844e.createBuilder();
                String str = ((C28614b) cVar.f77838a).f77837b;
                bVar2.copyOnWrite();
                C28621c cVar2 = (C28621c) bVar2.instance;
                cVar2.f77846a |= 16;
                cVar2.f77849d = str;
                bVar2.copyOnWrite();
                C28621c cVar3 = (C28621c) bVar2.instance;
                cVar3.f77846a |= 2;
                cVar3.f77847b = 2;
                String str2 = ((C28614b) cVar.f77838a).f77836a;
                bVar2.copyOnWrite();
                C28621c cVar4 = (C28621c) bVar2.instance;
                cVar4.f77846a |= 4;
                cVar4.f77848c = str2;
                C28621c cVar5 = (C28621c) bVar2.build();
                aVar2.copyOnWrite();
                C28683d dVar2 = (C28683d) aVar2.instance;
                cVar5.getClass();
                dVar2.f77949e = cVar5;
                dVar2.f77945a |= 64;
                C28684e eVar = (C28684e) C28685f.f77950c.createBuilder();
                eVar.copyOnWrite();
                C28685f fVar = (C28685f) eVar.instance;
                fVar.f77953b = a;
                fVar.f77952a |= 1;
                aVar2.copyOnWrite();
                C28683d dVar3 = (C28683d) aVar2.instance;
                C28685f fVar2 = (C28685f) eVar.build();
                fVar2.getClass();
                dVar3.f77947c = fVar2;
                dVar3.f77946b = 4;
                ((C28616d) cVar.f77840c.mo6453a()).mo34292a(1005, (C28683d) aVar2.build());
            }
        }
    }

    /* renamed from: a */
    public final C60870cx mo34316a() {
        m53543p();
        return C47633f.m84733g(C47633f.m84733g(m53542o()).mo51515h(new C28627a(this), C60826bg.f164896a)).mo51514f(Exception.class, new C28656i(this), C60826bg.f164896a).mo51515h(new C28662o(this), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo34317b(C28680i iVar, int i) {
        m53543p();
        return C47633f.m84733g(m53542o()).mo51516i(new C28642c(this, iVar, i), C60826bg.f164896a).mo51514f(Exception.class, new C28650d(this), C60826bg.f164896a).mo51515h(new C28652e(this), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C60870cx mo34318c() {
        m53543p();
        return C47633f.m84733g(C47633f.m84733g(m53542o()).mo51516i(new C28670w(this), C60826bg.f164896a).mo51515h(C28639b.f77887a, C60826bg.f164896a)).mo51514f(Exception.class, new C28657j(this), C60826bg.f164896a).mo51515h(new C28658k(this), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final C60870cx mo34319d(C28680i iVar, int i) {
        m53543p();
        return C47633f.m84733g(m53542o()).mo51516i(new C28666s(this, iVar, i), C60826bg.f164896a).mo51514f(Exception.class, new C28667t(this), C60826bg.f164896a).mo51515h(new C28668u(this), C60826bg.f164896a);
    }

    /* renamed from: f */
    public final void mo34321f(C28679h hVar) {
        synchronized (this.f77933e) {
            this.f77932d.remove(hVar);
        }
    }

    /* renamed from: g */
    public final C58833ax mo34322g() {
        this.f77934f.mo34311a();
        return C58836b.f156633a;
    }

    /* renamed from: h */
    public final C60870cx mo34323h(C28680i iVar, int i) {
        C60870cx i2 = mo34324i();
        C28665r rVar = new C28665r(this, iVar, i);
        return C60922j.m93045h(i2, C47810es.m84966f(rVar), C60826bg.f164896a);
    }

    /* renamed from: i */
    public final C60870cx mo34324i() {
        C60870cx a = this.f77934f.mo34311a();
        C28669v vVar = new C28669v(this);
        return C60922j.m93045h(a, C47810es.m84966f(vVar), C60826bg.f164896a);
    }

    /* renamed from: j */
    public final void mo34310j() {
        C58495hd l;
        synchronized (this.f77933e) {
            l = C58495hd.m89898l(this.f77932d);
        }
        C58800sl lA = l.entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            C28679h hVar = (C28679h) entry.getKey();
            Objects.requireNonNull(hVar);
            ((Executor) entry.getValue()).execute(C47810es.m84977q(new C28663p(hVar)));
        }
    }

    /* renamed from: k */
    public final void mo34305k() {
        C58495hd l;
        synchronized (this.f77933e) {
            l = C58495hd.m89898l(this.f77932d);
        }
        C58800sl lA = l.entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            C28679h hVar = (C28679h) entry.getKey();
            Objects.requireNonNull(hVar);
            ((Executor) entry.getValue()).execute(C47810es.m84977q(new C28659l(hVar)));
        }
    }

    /* renamed from: e */
    public final void mo34320e(C28679h hVar, Executor executor) {
        executor.getClass();
        synchronized (this.f77933e) {
            this.f77932d.put(hVar, executor);
        }
    }
}
