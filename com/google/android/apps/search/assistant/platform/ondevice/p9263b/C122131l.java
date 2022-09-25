package com.google.android.apps.search.assistant.platform.ondevice.p9263b;

import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58370cn;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4985f.p5003f.p5004a.C64845a;
import com.google.protos.p4985f.p5003f.p5004a.C64851g;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.b.l */
/* compiled from: PG */
public final class C122131l implements C64845a {

    /* renamed from: a */
    public final C122136q f338800a;

    /* renamed from: c */
    private final Executor f338801c;

    public C122131l(C122136q qVar, Executor executor) {
        this.f338800a = qVar;
        this.f338801c = executor;
    }

    /* renamed from: a */
    public final C60870cx mo59316a(C64851g gVar) {
        return C47638k.m84750a((Iterable) Collection.EL.stream(gVar.f175744b).map(new C122129j(this, gVar)).collect(C58370cn.f155946a)).mo51520a(C122130k.f338799a, this.f338801c);
    }
}
