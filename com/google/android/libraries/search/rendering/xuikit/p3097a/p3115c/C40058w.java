package com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c;

import android.util.ArraySet;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28423g;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28399t;
import com.google.android.libraries.logging.p2185ve.synthetic.C28463g;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40364q;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3143l.C40480q;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.protos.youtube.elements.C66190dd;
import com.google.protos.youtube.elements.C66192df;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.c.w */
/* compiled from: PG */
public final class C40058w implements C40026ag {

    /* renamed from: a */
    public static final C59071e f105244a = C59071e.m91332i("com.google.android.libraries.search.rendering.xuikit.a.c.w");

    /* renamed from: b */
    public final C28310af f105245b;

    /* renamed from: c */
    public final C28463g f105246c;

    /* renamed from: d */
    public final C28443m f105247d;

    /* renamed from: e */
    public final C28399t f105248e;

    /* renamed from: f */
    public final C28423g f105249f;

    /* renamed from: g */
    public final boolean f105250g;

    /* renamed from: h */
    public final Object f105251h = new Object();

    /* renamed from: i */
    public final C40364q f105252i;

    /* renamed from: j */
    public final Set f105253j = new ArraySet();

    /* renamed from: k */
    public final Map f105254k;

    /* renamed from: l */
    public final Map f105255l;

    /* renamed from: m */
    public boolean f105256m;

    /* renamed from: n */
    private final C60887da f105257n;

    /* renamed from: o */
    private final Executor f105258o;

    /* renamed from: p */
    private final C40480q f105259p;

    public C40058w(C60887da daVar, Executor executor, C28310af afVar, C28463g gVar, C28443m mVar, C28399t tVar, C40480q qVar, C40364q qVar2, C28439i iVar, C28423g gVar2, C40059x xVar) {
        HashMap hashMap = new HashMap();
        this.f105254k = hashMap;
        this.f105255l = new HashMap();
        this.f105256m = false;
        this.f105257n = daVar;
        this.f105258o = executor;
        this.f105245b = afVar;
        this.f105246c = gVar;
        this.f105247d = mVar;
        this.f105248e = tVar;
        this.f105259p = qVar;
        this.f105249f = gVar2;
        this.f105250g = xVar.f105260a;
        this.f105252i = qVar2;
        hashMap.put(0, iVar);
    }

    /* renamed from: e */
    public static void m69566e(C66192df dfVar) {
        if (dfVar.f180000c == 0) {
            throw new IllegalArgumentException("LoggingNode nodeId must be set to a non-zero value");
        }
    }

    /* renamed from: a */
    public final void mo26744a(C58485gu guVar) {
        this.f105259p.mo42465b(new C40056u(this, guVar), "GilElementsInteractionLogger", "attachNodes");
    }

    /* renamed from: b */
    public final void mo26745b(C66192df dfVar, C66190dd ddVar) {
        this.f105259p.mo42465b(new C40054s(this, dfVar, ddVar), "GilElementsInteractionLogger", "gesture");
    }

    /* renamed from: c */
    public final void mo26746c(C58485gu guVar, int i) {
        this.f105259p.mo42465b(new C40053r(this, i, guVar), "GilElementsInteractionLogger", "visibility");
    }

    /* renamed from: d */
    public final C60870cx mo42133d(C66192df dfVar) {
        C40051p pVar = new C40051p(this, dfVar);
        return C60856cj.m92904m(C47810es.m84978r(pVar), this.f105257n);
    }

    /* renamed from: f */
    public final void mo42158f() {
        this.f105256m = true;
        if (this.f105250g) {
            this.f105246c.mo33922f();
        }
        synchronized (this.f105253j) {
            for (C60870cx cancel : this.f105253j) {
                cancel.cancel(false);
            }
            this.f105253j.clear();
        }
        synchronized (this.f105251h) {
            this.f105254k.clear();
            this.f105255l.clear();
        }
    }

    /* renamed from: g */
    public final void mo42159g(Runnable runnable) {
        C60870cx c = this.f105257n.mo19400c(C47810es.m84977q(new C40052q(this, runnable)), (Object) null);
        synchronized (this.f105253j) {
            this.f105253j.add(c);
        }
        C40057v vVar = new C40057v(this, c);
        C60856cj.m92911t(c, C47810es.m84974n(vVar), this.f105258o);
    }
}
