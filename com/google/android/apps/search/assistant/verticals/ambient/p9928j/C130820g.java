package com.google.android.apps.search.assistant.verticals.ambient.p9928j;

import android.content.Context;
import com.google.android.gms.search.queries.C145948p;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.protos.p5124m.p5125a.C65603f;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.j.g */
/* compiled from: PG */
public final class C130820g implements C130812a {

    /* renamed from: a */
    public static final C59071e f358061a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.ambient.j.g");

    /* renamed from: b */
    public final C60887da f358062b;

    /* renamed from: c */
    public final Context f358063c;

    /* renamed from: d */
    public final C145948p f358064d;

    /* renamed from: e */
    private final C58485gu f358065e;

    public C130820g(C60887da daVar, Context context, C145948p pVar, C65603f fVar) {
        this.f358062b = daVar;
        this.f358063c = context;
        this.f358064d = pVar;
        this.f358065e = C58485gu.m89842j(fVar.f178307a);
    }

    /* renamed from: a */
    public final C60870cx mo109828a() {
        C58485gu guVar = (C58485gu) Collection.EL.stream((C58485gu) Collection.EL.stream(this.f358065e).filter(new C130819f(this)).collect(C58370cn.f155946a)).map(new C130815b(this)).collect(C58370cn.f155946a);
        return C47638k.m84750a(guVar).mo51520a(new C130816c(guVar), this.f358062b);
    }
}
