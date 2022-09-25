package com.google.android.libraries.search.p2904c.p2982x.p2983a;

import com.google.android.libraries.search.p2904c.C37656hc;
import com.google.android.libraries.search.p2904c.p2942m.C37895i;
import com.google.android.libraries.search.p2904c.p2982x.C38235ar;
import com.google.android.libraries.search.p2904c.p2982x.C38265x;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.search.c.x.a.ad */
/* compiled from: PG */
public final class C38166ad {

    /* renamed from: a */
    public static final C59071e f101128a = C59071e.m91332i("com.google.android.libraries.search.c.x.a.ad");

    /* renamed from: b */
    public final C37656hc f101129b;

    /* renamed from: c */
    public final C38265x f101130c;

    /* renamed from: d */
    public final int f101131d;

    /* renamed from: e */
    public final Executor f101132e;

    /* renamed from: f */
    public final Executor f101133f;

    /* renamed from: g */
    private final C70862aj f101134g;

    /* renamed from: h */
    private final C60870cx f101135h;

    /* renamed from: i */
    private final C37895i f101136i;

    /* renamed from: j */
    private boolean f101137j;

    public C38166ad(C37656hc hcVar, C38265x xVar, C70862aj ajVar, int i, C60870cx cxVar, C37895i iVar, Executor executor, Executor executor2) {
        this.f101129b = hcVar;
        this.f101130c = xVar;
        this.f101134g = ajVar;
        this.f101131d = i;
        this.f101135h = cxVar;
        this.f101136i = iVar;
        this.f101132e = executor;
        this.f101133f = executor2;
    }

    /* renamed from: a */
    public final void mo41295a(C58833ax axVar) {
        if (axVar.mo56113h()) {
            C60856cj.m92911t((C60870cx) axVar.mo56107c(), C47810es.m84974n(new C38217z(this)), this.f101132e);
        } else {
            mo41296b();
        }
    }

    /* renamed from: b */
    public final void mo41296b() {
        C60856cj.m92911t(this.f101135h, C47810es.m84974n(new C38163aa(this)), this.f101132e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo41297c() {
        this.f101136i.mo41112m(this.f101131d).mo41143b().mo41058b();
    }

    /* renamed from: d */
    public final synchronized void mo41298d() {
        if (!this.f101137j) {
            this.f101134g.mo20121a();
            this.f101137j = true;
        }
    }

    /* renamed from: e */
    public final synchronized void mo41299e(Throwable th) {
        if (!this.f101137j) {
            this.f101134g.mo20122b(th);
            this.f101137j = true;
        }
    }

    /* renamed from: f */
    public final void mo41300f(C58833ax axVar) {
        if (axVar.mo56113h()) {
            C60856cj.m92911t((C60870cx) axVar.mo56107c(), C47810es.m84974n(new C38215x(this)), this.f101132e);
        }
    }

    /* renamed from: g */
    public final void mo41301g() {
        C60856cj.m92911t(this.f101135h, C47810es.m84974n(new C38216y(this)), this.f101132e);
    }

    /* renamed from: h */
    public final synchronized void mo41302h(C38235ar arVar) {
        if (!this.f101137j) {
            this.f101134g.mo20123c(arVar);
        }
    }
}
