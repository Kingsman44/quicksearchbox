package com.google.apps.tiktok.experiments.phenotype;

import com.google.p343ac.p357d.C6663e;
import com.google.protobuf.C62971cq;
import dagger.C68214a;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import p5462h.p5463a.C69514bd;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.cw */
/* compiled from: PG */
public final class C46983cw {

    /* renamed from: a */
    public final C68214a f122504a;

    /* renamed from: b */
    public final C68214a f122505b;

    /* renamed from: c */
    public final C68214a f122506c;

    /* renamed from: d */
    public final Set f122507d;

    /* renamed from: e */
    public final Map f122508e;

    /* renamed from: f */
    public final C68214a f122509f;

    /* renamed from: g */
    public final C46919am f122510g;

    /* renamed from: h */
    private final Executor f122511h;

    /* renamed from: i */
    private final int f122512i;

    public C46983cw(C68214a aVar, C68214a aVar2, Executor executor, C46919am amVar, C68214a aVar3, int i, Set set, Map map, C68214a aVar4) {
        C69664n.m101061g(aVar, "supportsDeclarative");
        C69664n.m101061g(aVar2, "registrationInfos");
        C69664n.m101061g(executor, "executor");
        C69664n.m101061g(amVar, "subpackager");
        C69664n.m101061g(aVar3, "configurationUpdater");
        C69664n.m101061g(set, "logSources");
        C69664n.m101061g(map, "packages");
        C69664n.m101061g(aVar4, "params");
        this.f122504a = aVar;
        this.f122505b = aVar2;
        this.f122511h = executor;
        this.f122510g = amVar;
        this.f122506c = aVar3;
        this.f122512i = i;
        this.f122507d = set;
        this.f122508e = map;
        this.f122509f = aVar4;
    }

    /* renamed from: b */
    public static final String[] m83630b(Set set, C6663e eVar) {
        if (eVar != null) {
            C62971cq cqVar = eVar.f19910h;
            C69664n.m101060f(cqVar, "info.logSourceNameList");
            Object[] array = C69540x.m100827I(C69514bd.m100891e(set, cqVar)).toArray(new String[0]);
            C69664n.m101059e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return (String[]) array;
        }
        Object[] array2 = set.toArray(new String[0]);
        C69664n.m101059e(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0037  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo50961a(com.google.common.util.concurrent.C60930r r8, p5462h.p5473f.p5474a.C69632r r9, java.lang.String r10, com.google.p343ac.p357d.C6663e r11) {
        /*
            r7 = this;
            if (r11 == 0) goto L_0x0013
            int r0 = r11.f19904b
            r1 = 2
            if (r0 != r1) goto L_0x0010
            java.lang.Object r0 = r11.f19905c
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L_0x0015
        L_0x0010:
            r0 = 0
            r4 = 0
            goto L_0x0016
        L_0x0013:
            int r0 = r7.f122512i
        L_0x0015:
            r4 = r0
        L_0x0016:
            if (r8 == 0) goto L_0x0037
            com.google.common.util.concurrent.r r8 = com.google.apps.tiktok.tracing.C47810es.m84965e(r8)
            java.util.concurrent.Executor r0 = r7.f122511h
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92905n(r8, r0)
            com.google.apps.tiktok.experiments.phenotype.cu r0 = new com.google.apps.tiktok.experiments.phenotype.cu
            r1 = r0
            r2 = r9
            r3 = r10
            r5 = r7
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            com.google.common.util.concurrent.s r9 = com.google.apps.tiktok.tracing.C47810es.m84966f(r0)
            com.google.common.util.concurrent.bg r10 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60922j.m93045h(r8, r9, r10)
            goto L_0x0052
        L_0x0037:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            java.util.Set r0 = r7.f122507d
            java.lang.String[] r0 = m83630b(r0, r11)
            r1 = 0
            if (r11 == 0) goto L_0x004c
            com.google.protobuf.z r11 = r11.f19911i
            if (r11 == 0) goto L_0x004c
            byte[] r1 = r11.mo59174N()
        L_0x004c:
            java.lang.Object r8 = r9.mo8479a(r10, r8, r0, r1)
            com.google.common.util.concurrent.cx r8 = (com.google.common.util.concurrent.C60870cx) r8
        L_0x0052:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.tiktok.experiments.phenotype.C46983cw.mo50961a(com.google.common.util.concurrent.r, h.f.a.r, java.lang.String, com.google.ac.d.e):com.google.common.util.concurrent.cx");
    }
}
