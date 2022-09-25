package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3068f.p3069a;

import android.content.Context;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37254c;
import com.google.android.libraries.search.p2871b.p2895i.C37259h;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39389ae;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39411b;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71082ea;

/* renamed from: com.google.android.libraries.search.n.c.a.f.a.i */
/* compiled from: PG */
public final class C39526i {

    /* renamed from: a */
    public static final C59071e f104079a = C59071e.m91332i("com.google.android.libraries.search.n.c.a.f.a.i");

    /* renamed from: b */
    public final C47632e f104080b;

    /* renamed from: c */
    public final Context f104081c;

    /* renamed from: d */
    public final Executor f104082d;

    /* renamed from: e */
    public C37215b f104083e = null;

    /* renamed from: com.google.android.libraries.search.n.c.a.f.a.i$a */
    /* compiled from: PG */
    public interface C39527a {
        /* renamed from: eR */
        C37215b mo41874eR();
    }

    public C39526i(Context context, Executor executor) {
        this.f104082d = executor;
        this.f104080b = new C47632e();
        this.f104081c = context;
    }

    /* renamed from: b */
    public static String m68948b(C39389ae aeVar) {
        return aeVar == C39389ae.HOTWORD_TIMEOUT ? "request_hotword_timeout_handling" : "request_handling";
    }

    /* renamed from: a */
    public final C60870cx mo41868a(C37252a aVar, C39411b bVar) {
        return this.f104080b.mo51512b(new C39522e(this, aVar, bVar), this.f104082d);
    }

    /* renamed from: c */
    public final void mo41869c(C37254c cVar) {
        this.f104080b.mo51512b(new C39524g(this, cVar), this.f104082d);
    }

    /* renamed from: d */
    public final void mo41870d(C37252a aVar, C39411b bVar) {
        this.f104080b.mo51512b(new C39525h(this, aVar, bVar), this.f104082d);
    }

    /* renamed from: e */
    public final void mo41871e(C37252a aVar, C39411b bVar, C71082ea eaVar) {
        this.f104080b.mo51512b(new C39519b(this, aVar, bVar, eaVar), this.f104082d);
    }

    /* renamed from: f */
    public final void mo41872f(C37259h hVar, C58833ax axVar, int i) {
        this.f104080b.mo51512b(new C39520c(this, hVar, axVar, i), this.f104082d);
    }

    /* renamed from: g */
    public final void mo41873g(C37259h hVar, C39411b bVar, C71082ea eaVar, int i) {
        this.f104080b.mo51512b(new C39523f(this, hVar, bVar, i, eaVar), this.f104082d);
    }
}
