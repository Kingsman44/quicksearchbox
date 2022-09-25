package com.google.apps.tiktok.experiments.phenotype;

import android.util.Log;
import com.google.android.libraries.storage.p3304a.p3307c.C42750c;
import com.google.apps.tiktok.experiments.C46890b;
import com.google.apps.tiktok.experiments.C46891c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C62974ct;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.bu */
/* compiled from: PG */
final class C46954bu implements Callable {

    /* renamed from: a */
    final /* synthetic */ C47633f f122447a;

    /* renamed from: b */
    final /* synthetic */ C46966cf f122448b;

    public C46954bu(C47633f fVar, C46966cf cfVar) {
        this.f122447a = fVar;
        this.f122448b = cfVar;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C46891c cVar;
        C58495hd hdVar;
        C47633f fVar = this.f122447a;
        boolean z = this.f122448b.f122479m;
        try {
            Object r = C60856cj.m92909r(fVar);
            C69664n.m101060f(r, "{\n        getDone(cache)\n      }");
            cVar = (C46891c) r;
        } catch (ExecutionException e) {
            if (!(e.getCause() instanceof IOException) || (z && (e.getCause() instanceof C42750c))) {
                throw e;
            }
            C46890b bVar = (C46890b) C46891c.f122341i.createBuilder();
            C69664n.m101060f(bVar, "newBuilder()");
            cVar = C69664n.m101061g(bVar, "builder").mo50900a();
        }
        try {
            hdVar = this.f122448b.mo50940b(cVar);
        } catch (C62974ct e2) {
            Log.e("MendelPackageState", "Failed to parse flag", e2);
            C46890b bVar2 = (C46890b) C46891c.f122341i.createBuilder();
            C69664n.m101060f(bVar2, "newBuilder()");
            cVar = C69664n.m101061g(bVar2, "builder").mo50900a();
            hdVar = this.f122448b.mo50940b(cVar);
        } catch (RuntimeException e3) {
            Log.e("MendelPackageState", "Failed to parse flag", e3);
            C46890b bVar3 = (C46890b) C46891c.f122341i.createBuilder();
            C69664n.m101060f(bVar3, "newBuilder()");
            cVar = C69664n.m101061g(bVar3, "builder").mo50900a();
            hdVar = this.f122448b.mo50940b(cVar);
        }
        this.f122448b.mo50942d(cVar.f122345c, cVar.f122346d);
        if (Math.abs(this.f122448b.f122469c.mo26870b() - cVar.f122350h) > TimeUnit.DAYS.toMillis(1)) {
            C46966cf cfVar = this.f122448b;
            C46945bl.m83606a(C60856cj.m92905n(C47810es.m84965e(cfVar.f122478l), cfVar.f122468b), "Failed to fetch after encountering old config");
        }
        return (C46940bg) this.f122448b.f122472f.mo5192a(hdVar, C46946bm.m83607a(cVar));
    }
}
