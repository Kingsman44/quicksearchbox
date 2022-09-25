package com.google.android.libraries.mdi.download.p2248h.p2250b;

import android.content.Context;
import com.google.android.libraries.geller.p1818f.C21850cf;
import com.google.android.libraries.geller.portable.C21942ah;
import com.google.android.libraries.mdi.download.C28737bo;
import com.google.android.libraries.mdi.download.C28746bx;
import com.google.android.libraries.mdi.download.C28812d;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2246f.C29405b;
import com.google.android.libraries.mdi.download.p2257l.C29669a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import com.google.common.base.C58889cz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4552o.p4566l.C60129au;
import com.google.common.p4552o.p4566l.C60130av;
import com.google.common.p4552o.p4566l.C60142bg;
import com.google.common.p4552o.p4566l.C60143bh;
import com.google.common.p4552o.p4566l.C60184cv;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.mdi.download.h.b.as */
/* compiled from: PG */
public final class C29538as implements C28746bx {

    /* renamed from: a */
    public final Executor f80054a;

    /* renamed from: b */
    public final C65753ak f80055b;

    /* renamed from: c */
    public final C58881cr f80056c;

    /* renamed from: d */
    public final C58881cr f80057d;

    /* renamed from: e */
    public final C58881cr f80058e;

    /* renamed from: f */
    public final C58881cr f80059f;

    /* renamed from: g */
    public final C29553bf f80060g;

    /* renamed from: h */
    public final C29551bd f80061h;

    /* renamed from: i */
    public final String f80062i;

    /* renamed from: j */
    public final C21942ah f80063j;

    /* renamed from: k */
    public final C58889cz f80064k;

    /* renamed from: l */
    public final C58833ax f80065l;

    /* renamed from: m */
    private final Context f80066m;

    /* renamed from: n */
    private final C29405b f80067n;

    /* renamed from: o */
    private final C29669a f80068o = new C29669a();

    public C29538as(C29537ar arVar) {
        this.f80066m = arVar.f80038a;
        this.f80054a = arVar.f80040c;
        this.f80055b = arVar.f80039b;
        this.f80067n = new C29405b(arVar.f80053p, arVar.f80049l);
        this.f80056c = arVar.f80041d;
        this.f80057d = arVar.f80042e;
        this.f80060g = arVar.f80046i;
        this.f80061h = arVar.f80047j;
        this.f80062i = arVar.f80048k;
        this.f80058e = arVar.f80044g;
        this.f80059f = arVar.f80045h;
        this.f80063j = arVar.f80050m;
        this.f80064k = arVar.f80051n;
        this.f80065l = arVar.f80052o;
    }

    /* renamed from: c */
    public static final C60870cx m54520c(C58495hd hdVar, C65753ak akVar) {
        Throwable th;
        C58833ax j = C58833ax.m90833j((C21850cf) hdVar.get(akVar));
        if (!j.mo56113h() || ((C21850cf) j.mo56107c()).mo27152b().isEmpty()) {
            return C60866ct.f164955a;
        }
        if (((C21850cf) j.mo56107c()).mo27152b().size() == 1) {
            th = (Throwable) ((C21850cf) j.mo56107c()).mo27152b().get(0);
        } else {
            th = C28812d.m53781a(((C21850cf) j.mo56107c()).mo27152b(), "Multiple Geller sync failures", new Object[0]);
        }
        return C60856cj.m92899h(th);
    }

    /* renamed from: a */
    public final C60870cx mo34764a(C60870cx cxVar, C28737bo boVar, C65753ak akVar, String str) {
        C29532am amVar = new C29532am(this, boVar, akVar, str);
        return C60846c.m92879h(cxVar, Exception.class, C47810es.m84966f(amVar), this.f80054a);
    }

    /* renamed from: b */
    public final C60870cx mo19336b(C29409fd fdVar) {
        C29669a aVar = this.f80068o;
        return aVar.f80333a.mo51512b(new C29524ae(this), this.f80054a);
    }

    /* renamed from: d */
    public final void mo34765d(int i, C65753ak akVar, String str) {
        C29405b bVar = this.f80067n;
        String packageName = this.f80066m.getPackageName();
        String name = akVar.name();
        long j = (long) bVar.f79724a.mo34430j();
        if (C29045l.m53929a(j)) {
            C60129au auVar = (C60129au) C60130av.f162627x.createBuilder();
            auVar.copyOnWrite();
            C60130av avVar = (C60130av) auVar.instance;
            avVar.f162629a |= 524288;
            avVar.f162634f = j;
            C60142bg bgVar = (C60142bg) C60143bh.f162691f.createBuilder();
            bgVar.copyOnWrite();
            C60143bh bhVar = (C60143bh) bgVar.instance;
            bhVar.f162694b = C60184cv.m92533a(i);
            bhVar.f162693a |= 1;
            bgVar.copyOnWrite();
            C60143bh bhVar2 = (C60143bh) bgVar.instance;
            str.getClass();
            bhVar2.f162693a |= 2;
            bhVar2.f162695c = str;
            bgVar.copyOnWrite();
            C60143bh bhVar3 = (C60143bh) bgVar.instance;
            packageName.getClass();
            bhVar3.f162693a |= 4;
            bhVar3.f162696d = packageName;
            bgVar.copyOnWrite();
            C60143bh bhVar4 = (C60143bh) bgVar.instance;
            name.getClass();
            bhVar4.f162693a |= 8;
            bhVar4.f162697e = name;
            C60143bh bhVar5 = (C60143bh) bgVar.build();
            auVar.copyOnWrite();
            C60130av avVar2 = (C60130av) auVar.instance;
            bhVar5.getClass();
            avVar2.f162651w = bhVar5;
            avVar2.f162631c |= 32;
            bVar.f79725b.mo34707a((C60130av) auVar.build(), 1103);
        }
    }
}
