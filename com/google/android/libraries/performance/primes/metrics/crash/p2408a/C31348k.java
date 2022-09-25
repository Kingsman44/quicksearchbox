package com.google.android.libraries.performance.primes.metrics.crash.p2408a;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.libraries.directboot.C20674d;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31301d;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31302e;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31310m;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31311n;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31313p;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import dagger.C68214a;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71271d;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71298e;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71307ei;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71308ej;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71311f;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71312g;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71314i;

/* renamed from: com.google.android.libraries.performance.primes.metrics.crash.a.k */
/* compiled from: PG */
final class C31348k extends C31343f implements C31313p {

    /* renamed from: a */
    private static final C59071e f84398a = C59071e.m91332i("com.google.android.libraries.performance.primes.metrics.crash.a.k");

    /* renamed from: b */
    private final C31310m f84399b;

    /* renamed from: c */
    private final Context f84400c;

    /* renamed from: d */
    private final Executor f84401d;

    /* renamed from: e */
    private final C31340c f84402e;

    /* renamed from: f */
    private final C69464a f84403f;

    /* renamed from: g */
    private final C68214a f84404g;

    /* renamed from: h */
    private final C69464a f84405h;

    /* renamed from: i */
    private final C69464a f84406i;

    public C31348k(C31311n nVar, Context context, Executor executor, C31340c cVar, C69464a aVar, C68214a aVar2, C69464a aVar3, C69464a aVar4) {
        this.f84399b = nVar.mo37026a(executor, aVar2, (C69464a) null);
        this.f84400c = context;
        this.f84401d = executor;
        this.f84402e = cVar;
        this.f84403f = aVar;
        this.f84404g = aVar2;
        this.f84405h = aVar3;
        this.f84406i = aVar4;
    }

    /* renamed from: b */
    public static /* synthetic */ C60870cx m58438b(C31348k kVar) {
        if (!((C31339b) kVar.f84404g.mo27525b()).mo36980b()) {
            return C60866ct.f164955a;
        }
        if (!Application.getProcessName().equals(String.valueOf(kVar.f84400c.getPackageName()).concat(String.valueOf(((C31339b) kVar.f84404g.mo27525b()).mo37047d())))) {
            return C60866ct.f164955a;
        }
        if (!((Boolean) kVar.f84405h.mo17428b()).booleanValue()) {
            return C60866ct.f164955a;
        }
        List<C71298e> a = kVar.f84402e.mo37049a(0, 0, ((SharedPreferences) kVar.f84403f.mo17428b()).getString("lastExitProcessName", (String) null), ((SharedPreferences) kVar.f84403f.mo17428b()).getLong("lastExitTimestamp", -1));
        if (a.isEmpty()) {
            return C60866ct.f164955a;
        }
        C71314i iVar = (C71314i) kVar.f84406i.mo17428b();
        C71311f fVar = (C71311f) C71312g.f190446e.createBuilder();
        int size = a.size();
        fVar.copyOnWrite();
        C71312g gVar = (C71312g) fVar.instance;
        gVar.f190448a |= 2;
        gVar.f190451d = size;
        fVar.copyOnWrite();
        C71312g gVar2 = (C71312g) fVar.instance;
        iVar.getClass();
        gVar2.f190450c = iVar;
        gVar2.f190448a |= 1;
        HashSet hashSet = new HashSet();
        for (int i = 0; i < iVar.f190454a.size(); i++) {
            int a2 = C71271d.m103949a(iVar.f190454a.mo58914d(i));
            if (a2 == 0) {
                a2 = 1;
            }
            hashSet.add(Integer.valueOf(a2 - 1));
        }
        for (C71298e eVar : a) {
            int a3 = C71271d.m103949a(eVar.f190389c);
            if (a3 == 0) {
                a3 = 1;
            }
            if (hashSet.contains(Integer.valueOf(a3 - 1))) {
                fVar.copyOnWrite();
                C71312g gVar3 = (C71312g) fVar.instance;
                eVar.getClass();
                C62971cq cqVar = gVar3.f190449b;
                if (!cqVar.mo58948c()) {
                    gVar3.f190449b = C62942bv.mutableCopy(cqVar);
                }
                gVar3.f190449b.add(eVar);
            }
        }
        C71312g gVar4 = (C71312g) fVar.build();
        C31310m mVar = kVar.f84399b;
        C31301d j = C31302e.m58363j();
        C71307ei eiVar = (C71307ei) C71308ej.f190415x.createBuilder();
        eiVar.copyOnWrite();
        C71308ej ejVar = (C71308ej) eiVar.instance;
        gVar4.getClass();
        ejVar.f190429n = gVar4;
        ejVar.f190416a |= 524288;
        j.mo37004e((C71308ej) eiVar.build());
        return C60922j.m93044g(mVar.mo37023b(j.mo37000a()), new C31345h(kVar, a), kVar.f84401d);
    }

    /* renamed from: c */
    public /* synthetic */ C60870cx mo37053c() {
        return C20674d.m38853b(this.f84400c, new C31347j(this));
    }

    /* renamed from: d */
    public /* synthetic */ Void mo37054d(List list, Void voidR) {
        int i = 0;
        C71298e eVar = (C71298e) list.get(0);
        do {
            String str = eVar.f190388b;
            i++;
            if (((SharedPreferences) this.f84403f.mo17428b()).edit().putString("lastExitProcessName", str).putLong("lastExitTimestamp", eVar.f190392f).commit()) {
                return null;
            }
        } while (i < 3);
        ((C59052c) ((C59052c) f84398a.mo56226d()).mo56372aa(50379)).mo56386p("Failed to persist most recent App Exit");
        return null;
    }

    /* renamed from: e */
    public /* synthetic */ void mo37055e() {
        C60856cj.m92905n(new C31346i(this), this.f84401d);
    }

    /* renamed from: f */
    public void mo37056f() {
        C60856cj.m92905n(new C31344g(this), this.f84401d);
    }

    /* renamed from: ln */
    public void mo29159ln() {
        mo37056f();
    }
}
