package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9967b;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.assistant.p4016z.C53715bm;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.b.f */
/* compiled from: PG */
public final /* synthetic */ class C131271f implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C131278m f358922a;

    /* renamed from: b */
    public final /* synthetic */ C106596h f358923b;

    /* renamed from: c */
    public final /* synthetic */ C53715bm f358924c;

    /* renamed from: d */
    public final /* synthetic */ C58485gu f358925d;

    public /* synthetic */ C131271f(C131278m mVar, C106596h hVar, C53715bm bmVar, C58485gu guVar) {
        this.f358922a = mVar;
        this.f358923b = hVar;
        this.f358924c = bmVar;
        this.f358925d = guVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.google.common.b.gu} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx apply(java.lang.Object r7) {
        /*
            r6 = this;
            com.google.android.apps.search.assistant.verticals.ambient.s.b.m r0 = r6.f358922a
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.h r1 = r6.f358923b
            com.google.assistant.z.bm r2 = r6.f358924c
            com.google.common.b.gu r3 = r6.f358925d
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x001a
            com.google.common.b.gu r7 = com.google.common.p4522b.C58485gu.m89845m()
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60856cj.m92900i(r7)
            goto L_0x00ab
        L_0x001a:
            j$.util.stream.Stream r7 = p3186j$.util.Collection.EL.stream(r3)
            com.google.android.apps.search.assistant.verticals.ambient.s.b.b r4 = com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9967b.C131267b.f358918a
            j$.util.stream.Stream r7 = r7.filter(r4)
            j$.util.Optional r7 = r7.findFirst()
            boolean r4 = r7.isEmpty()
            if (r4 != 0) goto L_0x007b
            java.lang.Object r7 = r7.get()
            com.google.android.apps.gsa.opa.smartspace.ak r7 = (com.google.android.apps.gsa.opa.smartspace.C83739ak) r7
            com.google.protobuf.bn r7 = r7.toBuilder()
            com.google.android.apps.gsa.opa.smartspace.ab r7 = (com.google.android.apps.gsa.opa.smartspace.C83730ab) r7
            com.google.assistant.c.cr r4 = com.google.assistant.p3886c.C50794cr.SHOPPING_LIST
            r7.copyOnWrite()
            com.google.protobuf.bv r5 = r7.instance
            com.google.android.apps.gsa.opa.smartspace.ak r5 = (com.google.android.apps.gsa.opa.smartspace.C83739ak) r5
            int r4 = r4.f132222T
            r5.f228239h = r4
            int r4 = r5.f228232a
            r4 = r4 | 64
            r5.f228232a = r4
            r7.copyOnWrite()
            com.google.protobuf.bv r4 = r7.instance
            com.google.android.apps.gsa.opa.smartspace.ak r4 = (com.google.android.apps.gsa.opa.smartspace.C83739ak) r4
            com.google.protobuf.cq r5 = com.google.android.apps.gsa.opa.smartspace.C83739ak.emptyProtobufList()
            r4.f228246o = r5
            com.google.protobuf.bv r7 = r7.build()
            com.google.android.apps.gsa.opa.smartspace.ak r7 = (com.google.android.apps.gsa.opa.smartspace.C83739ak) r7
            j$.util.stream.Stream r7 = p3186j$.util.stream.Stream.CC.m71935of(r7)
            j$.util.stream.Stream r3 = p3186j$.util.Collection.EL.stream(r3)
            com.google.android.apps.search.assistant.verticals.ambient.s.b.c r4 = com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9967b.C131268c.f358919a
            j$.util.stream.Stream r3 = r3.filter(r4)
            j$.util.stream.Stream r7 = p3186j$.util.stream.Stream.CC.concat(r7, r3)
            j$.util.stream.Collector r3 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r7 = r7.collect(r3)
            r3 = r7
            com.google.common.b.gu r3 = (com.google.common.p4522b.C58485gu) r3
        L_0x007b:
            com.google.android.apps.search.assistant.verticals.ambient.s.a r7 = r0.f358939d
            com.google.android.apps.search.assistant.verticals.ambient.s.a r4 = r0.f358940e
            com.google.common.b.gu r7 = com.google.common.p4522b.C58485gu.m89847o(r7, r4)
            j$.util.stream.Stream r7 = p3186j$.util.Collection.EL.stream(r7)
            com.google.android.apps.search.assistant.verticals.ambient.s.b.k r4 = new com.google.android.apps.search.assistant.verticals.ambient.s.b.k
            r4.<init>(r0, r1, r2, r3)
            j$.util.stream.Stream r7 = r7.map(r4)
            j$.util.stream.Collector r1 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r7 = r7.collect(r1)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60856cj.m92896e(r7)
            com.google.android.apps.search.assistant.verticals.ambient.s.b.l r1 = new com.google.android.apps.search.assistant.verticals.ambient.s.b.l
            r1.<init>(r0)
            java.util.concurrent.ExecutorService r0 = r0.f358938c
            com.google.common.base.ah r1 = com.google.apps.tiktok.tracing.C47810es.m84963c(r1)
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60922j.m93044g(r7, r1, r0)
        L_0x00ab:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9967b.C131271f.apply(java.lang.Object):com.google.common.util.concurrent.cx");
    }
}
