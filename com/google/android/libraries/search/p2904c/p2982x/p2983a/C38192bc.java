package com.google.android.libraries.search.p2904c.p2982x.p2983a;

import com.google.android.libraries.search.p2904c.C37397bb;
import com.google.android.libraries.search.p2904c.C37400be;
import com.google.android.libraries.search.p2904c.p2942m.C37895i;
import com.google.android.libraries.search.p2904c.p2982x.C38227aj;
import com.google.android.libraries.search.p2904c.p2982x.C38236as;
import com.google.android.libraries.search.p2904c.p2982x.C38237at;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.search.c.x.a.bc */
/* compiled from: PG */
public final class C38192bc {

    /* renamed from: a */
    public static final C59071e f101211a = C59071e.m91332i("com.google.android.libraries.search.c.x.a.bc");

    /* renamed from: b */
    public final C37400be f101212b;

    /* renamed from: c */
    public final C38227aj f101213c;

    /* renamed from: d */
    public final int f101214d;

    /* renamed from: e */
    public final int f101215e;

    /* renamed from: f */
    public final Executor f101216f;

    /* renamed from: g */
    public final Executor f101217g;

    /* renamed from: h */
    private final C70862aj f101218h;

    /* renamed from: i */
    private final C60870cx f101219i;

    /* renamed from: j */
    private final C37895i f101220j;

    /* renamed from: k */
    private boolean f101221k;

    public C38192bc(C37400be beVar, C38227aj ajVar, C70862aj ajVar2, int i, int i2, C60870cx cxVar, C37895i iVar, Executor executor, Executor executor2) {
        this.f101212b = beVar;
        this.f101213c = ajVar;
        this.f101218h = ajVar2;
        this.f101214d = i;
        this.f101215e = i2;
        this.f101219i = cxVar;
        this.f101220j = iVar;
        this.f101216f = executor;
        this.f101217g = executor2;
    }

    /* renamed from: a */
    public final void mo41314a(C58833ax axVar) {
        if (axVar.mo56113h()) {
            C60856cj.m92911t((C60870cx) axVar.mo56107c(), C47810es.m84974n(new C38190ba(this)), this.f101216f);
            return;
        }
        mo41318e();
        mo41315b();
    }

    /* renamed from: b */
    public final void mo41315b() {
        C60856cj.m92911t(this.f101219i, C47810es.m84974n(new C38188az(this)), this.f101216f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo41316c() {
        this.f101220j.mo41108i(this.f101214d, this.f101215e).mo41093b().mo20354a();
    }

    /* renamed from: d */
    public final synchronized void mo41317d() {
        if (!this.f101221k) {
            this.f101218h.mo20121a();
            this.f101221k = true;
        }
    }

    /* renamed from: e */
    public final void mo41318e() {
        C58976aa aaVar = C58975e.f156826a;
        C38236as asVar = (C38236as) C38237at.f101333c.createBuilder();
        C37397bb bbVar = C37397bb.f99320c;
        asVar.copyOnWrite();
        C38237at atVar = (C38237at) asVar.instance;
        bbVar.getClass();
        atVar.f101336b = bbVar;
        atVar.f101335a = 4;
        mo41321h((C38237at) asVar.build());
    }

    /* renamed from: f */
    public final synchronized void mo41319f(Throwable th) {
        if (!this.f101221k) {
            this.f101218h.mo20122b(th);
            this.f101221k = true;
        }
    }

    /* renamed from: g */
    public final void mo41320g(C58833ax axVar) {
        if (axVar.mo56113h()) {
            C60856cj.m92911t((C60870cx) axVar.mo56107c(), C47810es.m84974n(new C38185aw(this)), this.f101216f);
        } else {
            mo41318e();
        }
    }

    /* renamed from: h */
    public final synchronized void mo41321h(C38237at atVar) {
        if (!this.f101221k) {
            this.f101218h.mo20123c(atVar);
        }
    }

    /* renamed from: i */
    public final void mo41322i() {
        C60856cj.m92911t(this.f101219i, C47810es.m84974n(new C38186ax(this)), this.f101216f);
    }
}
