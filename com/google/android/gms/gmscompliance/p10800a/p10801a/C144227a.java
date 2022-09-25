package com.google.android.gms.gmscompliance.p10800a.p10801a;

import com.google.android.gms.gmscompliance.p10800a.C144265e;
import com.google.android.gms.gmscompliance.p10800a.p10801a.p10804c.C144239a;
import com.google.android.gms.gmscompliance.p10800a.p10801a.p10804c.C144251m;
import com.google.android.gms.gmscompliance.p10800a.p10801a.p10805d.C144253a;
import com.google.android.gms.tasks.C146010af;
import com.google.android.gms.tasks.C146014aj;
import com.google.android.gms.tasks.C146024d;
import com.google.android.libraries.p3339v.C43201a;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.gms.gmscompliance.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C144227a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C144260f f390665a;

    /* renamed from: b */
    public final /* synthetic */ C146010af f390666b;

    public /* synthetic */ C144227a(C144260f fVar, C146010af afVar) {
        this.f390665a = fVar;
        this.f390666b = afVar;
    }

    public final void run() {
        C144260f fVar = this.f390665a;
        C146010af afVar = this.f390666b;
        C144260f.f390715a.mo119787f("start reading cache", new Object[0]);
        long nanoTime = System.nanoTime();
        C144265e a = C144239a.m234482a(fVar.f390717c.mo119783a());
        long nanoTime2 = System.nanoTime();
        C144253a aVar = C144260f.f390715a;
        double d = (double) (nanoTime2 - nanoTime);
        Double.isNaN(d);
        aVar.mo119787f("finished reading cache in %f ms", Double.valueOf(d / 1000000.0d));
        if (a.mo119794b()) {
            C144260f.f390715a.mo119787f("responding based on cache", new Object[0]);
            afVar.f394698a.mo122510x(a);
        }
        C144251m mVar = fVar.f390718d;
        Objects.requireNonNull(mVar);
        C60870cx g = C60922j.m93044g(C60838bs.m92859i(C60856cj.m92905n(new C144232b(mVar), fVar.f390716b)), C144238c.f390684a, fVar.f390716b);
        C146024d dVar = new C146024d();
        C146010af afVar2 = new C146010af(dVar.f394725a);
        C60856cj.m92911t(g, new C43201a(afVar2, g, dVar), C60826bg.f164896a);
        C146014aj ajVar = afVar2.f394698a;
        Executor executor = fVar.f390716b;
        Objects.requireNonNull(afVar);
        ajVar.mo122495n(executor, new C144252d(afVar));
        Executor executor2 = fVar.f390716b;
        Objects.requireNonNull(afVar);
        ajVar.mo122494m(executor2, new C144254e(afVar));
    }
}
