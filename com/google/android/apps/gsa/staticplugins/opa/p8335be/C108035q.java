package com.google.android.apps.gsa.staticplugins.opa.p8335be;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.store.C118302a;
import com.google.android.apps.gsa.store.C118312c;
import com.google.android.apps.gsa.store.C118314e;
import com.google.android.apps.gsa.store.C118316g;
import com.google.android.apps.gsa.store.C118328s;
import com.google.android.apps.gsa.store.C118329t;
import com.google.android.apps.gsa.store.C118332u;
import com.google.android.apps.gsa.store.C118333v;
import com.google.android.apps.gsa.store.C118334w;
import com.google.android.apps.gsa.store.C118335x;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58470gf;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.be.q */
/* compiled from: PG */
public final class C108035q {

    /* renamed from: a */
    public static final C59071e f300539a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.be.q");

    /* renamed from: b */
    public final C118312c f300540b;

    /* renamed from: c */
    public final C108014bn f300541c;

    /* renamed from: d */
    private final C22871g f300542d;

    public C108035q(C118312c cVar, C108014bn bnVar, C22871g gVar) {
        this.f300540b = cVar;
        this.f300541c = bnVar;
        this.f300542d = gVar;
    }

    /* renamed from: h */
    static final void m179361h(C118314e eVar, C58470gf gfVar, C108034p pVar, Predicate predicate) {
        while (eVar.hasNext()) {
            try {
                C118332u uVar = (C118332u) eVar.next();
                if (uVar.mo103670a() && predicate.test(uVar)) {
                    gfVar.mo55373c(pVar.mo96349a(uVar));
                }
            } catch (IOException e) {
                ((C59052c) ((C59052c) ((C59052c) f300539a.mo56225c()).mo56382g(e)).mo56372aa(26952)).mo56386p("Exception while deserializing.");
                return;
            }
        }
    }

    /* renamed from: a */
    public final C60870cx mo96372a(Collection collection, String str) {
        if (collection.isEmpty()) {
            return C118826c.f331423b;
        }
        C118316g c = this.f300540b.mo91759c();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c.mo103661b((String) it.next());
        }
        return this.f300542d.mo28209i(this.f300540b.mo91762h(c.mo103660a()), str, C108021c.f300520a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C118334w mo96373b(int i) {
        C118335x g = this.f300540b.mo91761g();
        g.f328476c.mo55395g(C118328s.m196511c(C108014bn.f300500a, (long) (i - 1)));
        return g.mo103674a();
    }

    /* renamed from: c */
    public final C60870cx mo96374c(int i, int i2, C58833ax axVar) {
        C58485gu n = C58485gu.m89846n(this.f300541c.mo96370a(i, i2, axVar));
        StringBuilder sb = new StringBuilder("delete-");
        sb.append(i - 1);
        sb.append("-");
        sb.append(i2 - 1);
        return mo96372a(n, sb.toString());
    }

    /* renamed from: d */
    public final C60870cx mo96375d(int i, C108034p pVar, Predicate predicate) {
        C118334w b = mo96373b(i);
        C22871g gVar = this.f300542d;
        C60870cx b2 = gVar.mo28202b("getAllObjectsOfType", new C108023e(this, b));
        StringBuilder sb = new StringBuilder("getAllObjectsOfType-");
        sb.append(i - 1);
        return gVar.mo28209i(b2, sb.toString(), new C108024f(pVar, predicate));
    }

    /* renamed from: e */
    public final C60870cx mo96376e(int i, int i2, C58833ax axVar, C108034p pVar) {
        String a = this.f300541c.mo96370a(i, i2, axVar);
        C22871g gVar = this.f300542d;
        C60870cx b = gVar.mo28202b("getObject", new C107973a(this, a));
        StringBuilder sb = new StringBuilder("get-");
        sb.append(i - 1);
        sb.append("-");
        sb.append(i2 - 1);
        return gVar.mo28209i(b, sb.toString(), new C108025g(pVar));
    }

    /* renamed from: f */
    public final C60870cx mo96377f(int i, int i2, Set set) {
        C22871g gVar = this.f300542d;
        C118334w b = mo96373b(i2);
        C22871g gVar2 = this.f300542d;
        C60870cx i3 = this.f300540b.mo91763i(b);
        StringBuilder sb = new StringBuilder("getAllKeysOfType-");
        sb.append(i2 - 1);
        return gVar.mo28210j(gVar2.mo28209i(i3, sb.toString(), new C108033o()), "purgeExcept", new C108030l(this, set, i, i2));
    }

    /* renamed from: g */
    public final C60870cx mo96378g(int i, int i2, C58833ax axVar, byte[] bArr, long j) {
        C118333v vVar;
        String a = this.f300541c.mo96370a(i, i2, axVar);
        C118329t e = this.f300540b.mo91760e();
        if (j > 0) {
            vVar = e.mo103668b(a, bArr, j, TimeUnit.MINUTES);
        } else {
            vVar = e.mo103667a(a, bArr);
        }
        int i3 = i2 - 1;
        vVar.mo103672a(C108014bn.f300500a, Long.valueOf((long) i3));
        C22871g gVar = this.f300542d;
        C60870cx b = gVar.mo28202b("putObject", new C108028j(this, e));
        StringBuilder sb = new StringBuilder("put-");
        sb.append(i - 1);
        sb.append("-");
        sb.append(i3);
        return gVar.mo28209i(b, sb.toString(), new C108029k(a));
    }

    /* renamed from: i */
    public final C60870cx mo96379i(int i, int i2, C118302a aVar, C58833ax axVar, byte[] bArr, long j) {
        C118333v vVar;
        String a = this.f300541c.mo96370a(12, i, axVar);
        C118329t e = this.f300540b.mo91760e();
        if (j > 0) {
            vVar = e.mo103668b(a, bArr, j, TimeUnit.MINUTES);
        } else {
            vVar = e.mo103667a(a, bArr);
        }
        int i3 = i - 1;
        vVar.mo103672a(C108014bn.f300500a, Long.valueOf((long) i3));
        vVar.mo103672a(aVar, Long.valueOf((long) i2));
        C22871g gVar = this.f300542d;
        return gVar.mo28209i(gVar.mo28202b("putObject", new C108031m(this, e)), "put-11-" + i3, new C108032n(a));
    }
}
