package com.google.android.apps.search.fedora.p10106i;

import android.content.Context;
import com.google.android.apps.search.fedora.p10096d.p10097a.C132754m;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.p3663j.C47352j;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.fedora.i.am */
/* compiled from: PG */
final class C132924am implements C47352j {

    /* renamed from: a */
    public static final C59071e f362584a = C59071e.m91332i("com.google.android.apps.search.fedora.i.am");

    /* renamed from: b */
    public final Context f362585b;

    /* renamed from: c */
    public final C132939m f362586c;

    /* renamed from: d */
    public final C69464a f362587d;

    /* renamed from: e */
    public final C69464a f362588e;

    /* renamed from: f */
    public final C69464a f362589f;

    /* renamed from: g */
    public final C69464a f362590g;

    /* renamed from: h */
    public final C69464a f362591h;

    /* renamed from: i */
    public final C46175b f362592i;

    /* renamed from: j */
    public final boolean f362593j;

    /* renamed from: k */
    public final C60887da f362594k;

    /* renamed from: l */
    private final boolean f362595l;

    /* renamed from: com.google.android.apps.search.fedora.i.am$a */
    /* compiled from: PG */
    public interface C132925a {
        /* renamed from: bD */
        C132754m mo110937bD();

        /* renamed from: bG */
        C132934h mo110938bG();

        /* renamed from: bH */
        C132940n mo110939bH();
    }

    public C132924am(Context context, C132939m mVar, C69464a aVar, C69464a aVar2, C69464a aVar3, C69464a aVar4, C69464a aVar5, C46175b bVar, boolean z, boolean z2, C60887da daVar) {
        this.f362585b = context;
        this.f362586c = mVar;
        this.f362587d = aVar;
        this.f362588e = aVar2;
        this.f362589f = aVar3;
        this.f362590g = aVar4;
        this.f362591h = aVar5;
        this.f362592i = bVar;
        this.f362593j = z2;
        this.f362594k = daVar;
        this.f362595l = z;
    }

    /* renamed from: b */
    public final C60870cx mo19293b() {
        if (!this.f362595l) {
            ((C59052c) ((C59052c) f362584a.mo56224b()).mo56372aa(39951)).mo56386p("ekho is not enabled. no-op()");
            return C60866ct.f164955a;
        }
        C132950x xVar = new C132950x(this);
        C47633f h = C47633f.m84733g(C60856cj.m92905n(C47810es.m84965e(xVar), this.f362594k)).mo51515h(C132914ac.f362573a, this.f362594k);
        C132923al alVar = new C132923al();
        C60856cj.m92911t(h.f164926b, C47810es.m84974n(alVar), this.f362594k);
        return h;
    }
}
