package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.common.base.C58817ah;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.bp */
/* compiled from: PG */
public final /* synthetic */ class C123335bp implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C42813k f341088a;

    /* renamed from: b */
    public final /* synthetic */ Locale f341089b;

    /* renamed from: c */
    public final /* synthetic */ C123511q f341090c;

    /* renamed from: d */
    public final /* synthetic */ C123460gf f341091d;

    public /* synthetic */ C123335bp(C42813k kVar, Locale locale, C123511q qVar, C123460gf gfVar) {
        this.f341088a = kVar;
        this.f341089b = locale;
        this.f341090c = qVar;
        this.f341091d = gfVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v84, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: a.d.a.a.af} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v92, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: a.d.a.a.af} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: a.d.a.a.af} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0304 A[Catch:{ IOException -> 0x0326 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0311 A[Catch:{ IOException -> 0x0326 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0344 A[Catch:{ IOException -> 0x0365 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r20) {
        /*
            r19 = this;
            r1 = r19
            java.lang.String r2 = "No resources"
            java.lang.String r3 = "Resource building failure"
            com.google.android.libraries.storage.a.k r4 = r1.f341088a
            java.util.Locale r5 = r1.f341089b
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.q r6 = r1.f341090c
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.gf r7 = r1.f341091d
            r8 = r20
            com.google.android.libraries.mdi.f r8 = (com.google.android.libraries.mdi.C29690f) r8
            java.lang.String r0 = "teleport_search_understanding_resources.binarypb"
            a.d.a.a.ak r9 = p001a.p014d.p015a.p016a.C0048ak.f131d     // Catch:{ IOException -> 0x02e6 }
            j$.util.Optional r0 = com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123050cq.m202384a(r4, r8, r0, r9)     // Catch:{ IOException -> 0x02e6 }
            boolean r9 = r0.isPresent()     // Catch:{ IOException -> 0x02e6 }
            if (r9 == 0) goto L_0x02d1
            java.lang.Object r9 = r0.get()     // Catch:{ IOException -> 0x02e6 }
            a.d.a.a.ak r9 = (p001a.p014d.p015a.p016a.C0048ak) r9     // Catch:{ IOException -> 0x02e6 }
            a.d.a.a.an r10 = p001a.p014d.p015a.p016a.C0051an.f137b     // Catch:{ IOException -> 0x02e6 }
            com.google.protobuf.bn r10 = r10.createBuilder()     // Catch:{ IOException -> 0x02e6 }
            a.d.a.a.al r10 = (p001a.p014d.p015a.p016a.C0049al) r10     // Catch:{ IOException -> 0x02e6 }
            java.lang.String r11 = r5.toLanguageTag()     // Catch:{ IOException -> 0x02e6 }
            r10.mo24a(r11, r9)     // Catch:{ IOException -> 0x02e6 }
            com.google.protobuf.bv r9 = r10.build()     // Catch:{ IOException -> 0x02e6 }
            a.d.a.a.an r9 = (p001a.p014d.p015a.p016a.C0051an) r9     // Catch:{ IOException -> 0x02e6 }
            byte[] r9 = r9.toByteArray()     // Catch:{ IOException -> 0x02e6 }
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig.TeleportQueryCleanerImpl.nativeUpdateResources(r9)     // Catch:{ IOException -> 0x02e6 }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x02e6 }
            r10 = r0
            a.d.a.a.ak r10 = (p001a.p014d.p015a.p016a.C0048ak) r10     // Catch:{ IOException -> 0x02e6 }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ IOException -> 0x02e6 }
            r0.<init>()     // Catch:{ IOException -> 0x02e6 }
            com.google.protobuf.dn r9 = r10.f134b     // Catch:{ IOException -> 0x02e6 }
            java.util.Map r9 = java.util.Collections.unmodifiableMap(r9)     // Catch:{ IOException -> 0x02e6 }
            java.util.Collection r9 = r9.values()     // Catch:{ IOException -> 0x02e6 }
            j$.util.stream.Stream r9 = p3186j$.util.Collection.EL.stream(r9)     // Catch:{ IOException -> 0x02e6 }
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.gg r11 = com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig.C123461gg.f341257a     // Catch:{ IOException -> 0x02e6 }
            j$.util.stream.Stream r9 = r9.flatMap(r11)     // Catch:{ IOException -> 0x02e6 }
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.hg r11 = new com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.hg     // Catch:{ IOException -> 0x02e6 }
            r11.<init>(r0)     // Catch:{ IOException -> 0x02e6 }
            r9.forEach(r11)     // Catch:{ IOException -> 0x02e6 }
            com.google.protobuf.dn r9 = r10.f134b     // Catch:{ IOException -> 0x02e6 }
            java.util.Map r9 = java.util.Collections.unmodifiableMap(r9)     // Catch:{ IOException -> 0x02e6 }
            java.util.Collection r9 = r9.values()     // Catch:{ IOException -> 0x02e6 }
            j$.util.stream.Stream r9 = p3186j$.util.Collection.EL.stream(r9)     // Catch:{ IOException -> 0x02e6 }
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.hh r11 = com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig.C123489hh.f341287a     // Catch:{ IOException -> 0x02e6 }
            j$.util.stream.Stream r9 = r9.flatMap(r11)     // Catch:{ IOException -> 0x02e6 }
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.hi r11 = new com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.hi     // Catch:{ IOException -> 0x02e6 }
            r11.<init>(r0)     // Catch:{ IOException -> 0x02e6 }
            r9.forEach(r11)     // Catch:{ IOException -> 0x02e6 }
            com.google.protobuf.dn r9 = r10.f134b     // Catch:{ IOException -> 0x02e6 }
            java.util.Map r9 = java.util.Collections.unmodifiableMap(r9)     // Catch:{ IOException -> 0x02e6 }
            java.util.Collection r9 = r9.values()     // Catch:{ IOException -> 0x02e6 }
            j$.util.stream.Stream r9 = p3186j$.util.Collection.EL.stream(r9)     // Catch:{ IOException -> 0x02e6 }
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.gh r11 = com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig.C123462gh.f341258a     // Catch:{ IOException -> 0x02e6 }
            j$.util.stream.Stream r9 = r9.flatMap(r11)     // Catch:{ IOException -> 0x02e6 }
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.gi r11 = new com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.gi     // Catch:{ IOException -> 0x02e6 }
            r11.<init>(r0)     // Catch:{ IOException -> 0x02e6 }
            r9.forEach(r11)     // Catch:{ IOException -> 0x02e6 }
            com.google.protobuf.dn r9 = r10.f134b     // Catch:{ IOException -> 0x02e6 }
            java.util.Map r9 = java.util.Collections.unmodifiableMap(r9)     // Catch:{ IOException -> 0x02e6 }
            java.util.Collection r9 = r9.values()     // Catch:{ IOException -> 0x02e6 }
            j$.util.stream.Stream r9 = p3186j$.util.Collection.EL.stream(r9)     // Catch:{ IOException -> 0x02e6 }
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.gj r11 = com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig.C123464gj.f341260a     // Catch:{ IOException -> 0x02e6 }
            j$.util.stream.Stream r9 = r9.flatMap(r11)     // Catch:{ IOException -> 0x02e6 }
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.gk r11 = new com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.gk     // Catch:{ IOException -> 0x02e6 }
            r11.<init>(r0)     // Catch:{ IOException -> 0x02e6 }
            r9.forEach(r11)     // Catch:{ IOException -> 0x02e6 }
            com.google.protobuf.dn r9 = r10.f134b     // Catch:{ IOException -> 0x02e6 }
            java.util.Map r9 = java.util.Collections.unmodifiableMap(r9)     // Catch:{ IOException -> 0x02e6 }
            java.util.Collection r9 = r9.values()     // Catch:{ IOException -> 0x02e6 }
            j$.util.stream.Stream r9 = p3186j$.util.Collection.EL.stream(r9)     // Catch:{ IOException -> 0x02e6 }
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.gl r11 = com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig.C123466gl.f341262a     // Catch:{ IOException -> 0x02e6 }
            j$.util.stream.Stream r9 = r9.flatMap(r11)     // Catch:{ IOException -> 0x02e6 }
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.gm r11 = new com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.gm     // Catch:{ IOException -> 0x02e6 }
            r11.<init>(r0)     // Catch:{ IOException -> 0x02e6 }
            r9.forEach(r11)     // Catch:{ IOException -> 0x02e6 }
            com.google.protobuf.dn r9 = r10.f135c     // Catch:{ IOException -> 0x02e6 }
            java.util.Map r9 = java.util.Collections.unmodifiableMap(r9)     // Catch:{ IOException -> 0x02e6 }
            java.util.Collection r9 = r9.values()     // Catch:{ IOException -> 0x02e6 }
            j$.util.stream.Stream r9 = p3186j$.util.Collection.EL.stream(r9)     // Catch:{ IOException -> 0x02e6 }
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.gr r11 = com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig.C123472gr.f341268a     // Catch:{ IOException -> 0x02e6 }
            j$.util.stream.Stream r9 = r9.flatMap(r11)     // Catch:{ IOException -> 0x02e6 }
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.hb r11 = new com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.hb     // Catch:{ IOException -> 0x02e6 }
            r11.<init>(r0)     // Catch:{ IOException -> 0x02e6 }
            r9.forEach(r11)     // Catch:{ IOException -> 0x02e6 }
            com.google.protobuf.dn r9 = r10.f135c     // Catch:{ IOException -> 0x02e6 }
            java.util.Map r9 = java.util.Collections.unmodifiableMap(r9)     // Catch:{ IOException -> 0x02e6 }
            java.util.Collection r9 = r9.values()     // Catch:{ IOException -> 0x02e6 }
            j$.util.stream.Stream r9 = p3186j$.util.Collection.EL.stream(r9)     // Catch:{ IOException -> 0x02e6 }
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.hc r11 = com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig.C123484hc.f341282a     // Catch:{ IOException -> 0x02e6 }
            j$.util.stream.Stream r9 = r9.flatMap(r11)     // Catch:{ IOException -> 0x02e6 }
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.hd r11 = new com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.hd     // Catch:{ IOException -> 0x02e6 }
            r11.<init>(r0)     // Catch:{ IOException -> 0x02e6 }
            r9.forEach(r11)     // Catch:{ IOException -> 0x02e6 }
            com.google.protobuf.dn r9 = r10.f135c     // Catch:{ IOException -> 0x02e6 }
            java.util.Map r9 = java.util.Collections.unmodifiableMap(r9)     // Catch:{ IOException -> 0x02e6 }
            java.util.Collection r9 = r9.values()     // Catch:{ IOException -> 0x02e6 }
            j$.util.stream.Stream r9 = p3186j$.util.Collection.EL.stream(r9)     // Catch:{ IOException -> 0x02e6 }
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.he r11 = com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig.C123486he.f341284a     // Catch:{ IOException -> 0x02e6 }
            j$.util.stream.Stream r9 = r9.flatMap(r11)     // Catch:{ IOException -> 0x02e6 }
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.hf r11 = new com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.hf     // Catch:{ IOException -> 0x02e6 }
            r11.<init>(r0)     // Catch:{ IOException -> 0x02e6 }
            r9.forEach(r11)     // Catch:{ IOException -> 0x02e6 }
            com.google.common.b.hd r11 = com.google.common.p4522b.C58495hd.m89898l(r0)     // Catch:{ IOException -> 0x02e6 }
            com.google.protobuf.dn r0 = r10.f133a     // Catch:{ IOException -> 0x02e6 }
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)     // Catch:{ IOException -> 0x02e6 }
            java.util.Collection r0 = r0.values()     // Catch:{ IOException -> 0x02e6 }
            j$.util.stream.Stream r0 = p3186j$.util.Collection.EL.stream(r0)     // Catch:{ IOException -> 0x02e6 }
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.ha r9 = com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig.C123482ha.f341280a     // Catch:{ IOException -> 0x02e6 }
            j$.util.stream.Stream r0 = r0.flatMap(r9)     // Catch:{ IOException -> 0x02e6 }
            j$.util.stream.Collector r9 = com.google.common.p4522b.C58370cn.f155947b     // Catch:{ IOException -> 0x02e6 }
            java.lang.Object r0 = r0.collect(r9)     // Catch:{ IOException -> 0x02e6 }
            com.google.common.b.ij r0 = (com.google.common.p4522b.C58528ij) r0     // Catch:{ IOException -> 0x02e6 }
            com.google.common.b.gz r9 = new com.google.common.b.gz     // Catch:{ IOException -> 0x02e6 }
            r12 = 4
            r9.<init>(r12)     // Catch:{ IOException -> 0x02e6 }
            com.google.common.b.sl r0 = r0.iterator()     // Catch:{ IOException -> 0x02e6 }
        L_0x0158:
            boolean r13 = r0.hasNext()     // Catch:{ IOException -> 0x02e6 }
            if (r13 == 0) goto L_0x018d
            java.lang.Object r13 = r0.next()     // Catch:{ IOException -> 0x02e6 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ IOException -> 0x02e6 }
            a.d.a.a.af r14 = p001a.p014d.p015a.p016a.C0043af.f114m     // Catch:{ IOException -> 0x02e6 }
            r13.getClass()     // Catch:{ IOException -> 0x02e6 }
            com.google.protobuf.dn r15 = r10.f134b     // Catch:{ IOException -> 0x02e6 }
            boolean r16 = r15.containsKey(r13)     // Catch:{ IOException -> 0x02e6 }
            if (r16 == 0) goto L_0x0177
            java.lang.Object r14 = r15.get(r13)     // Catch:{ IOException -> 0x02e6 }
            a.d.a.a.af r14 = (p001a.p014d.p015a.p016a.C0043af) r14     // Catch:{ IOException -> 0x02e6 }
        L_0x0177:
            com.google.protobuf.cq r14 = r14.f119d     // Catch:{ IOException -> 0x02e6 }
            j$.util.stream.Stream r14 = p3186j$.util.Collection.EL.stream(r14)     // Catch:{ IOException -> 0x02e6 }
            j$.util.stream.Collector r15 = com.google.common.p4522b.C58370cn.f155946a     // Catch:{ IOException -> 0x02e6 }
            java.lang.Object r14 = r14.collect(r15)     // Catch:{ IOException -> 0x02e6 }
            com.google.common.b.gu r14 = (com.google.common.p4522b.C58485gu) r14     // Catch:{ IOException -> 0x02e6 }
            com.google.common.b.gu r14 = com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig.C123491hj.m202823a(r14)     // Catch:{ IOException -> 0x02e6 }
            r9.mo55429h(r13, r14)     // Catch:{ IOException -> 0x02e6 }
            goto L_0x0158
        L_0x018d:
            r0 = 0
            com.google.common.b.hd r13 = r9.mo55427f(r0)     // Catch:{ IOException -> 0x02e6 }
            com.google.protobuf.dn r9 = r10.f133a     // Catch:{ IOException -> 0x02e6 }
            java.util.Map r9 = java.util.Collections.unmodifiableMap(r9)     // Catch:{ IOException -> 0x02e6 }
            java.util.Collection r9 = r9.values()     // Catch:{ IOException -> 0x02e6 }
            j$.util.stream.Stream r9 = p3186j$.util.Collection.EL.stream(r9)     // Catch:{ IOException -> 0x02e6 }
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.gy r14 = com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig.C123479gy.f341275a     // Catch:{ IOException -> 0x02e6 }
            j$.util.stream.Stream r9 = r9.flatMap(r14)     // Catch:{ IOException -> 0x02e6 }
            j$.util.stream.Collector r14 = com.google.common.p4522b.C58370cn.f155947b     // Catch:{ IOException -> 0x02e6 }
            java.lang.Object r9 = r9.collect(r14)     // Catch:{ IOException -> 0x02e6 }
            com.google.common.b.ij r9 = (com.google.common.p4522b.C58528ij) r9     // Catch:{ IOException -> 0x02e6 }
            com.google.common.b.gz r14 = new com.google.common.b.gz     // Catch:{ IOException -> 0x02e6 }
            r14.<init>(r12)     // Catch:{ IOException -> 0x02e6 }
            com.google.common.b.sl r9 = r9.iterator()     // Catch:{ IOException -> 0x02e6 }
        L_0x01b7:
            boolean r15 = r9.hasNext()     // Catch:{ IOException -> 0x02e6 }
            if (r15 == 0) goto L_0x01f2
            java.lang.Object r15 = r9.next()     // Catch:{ IOException -> 0x02e6 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ IOException -> 0x02e6 }
            a.d.a.a.af r16 = p001a.p014d.p015a.p016a.C0043af.f114m     // Catch:{ IOException -> 0x02e6 }
            r15.getClass()     // Catch:{ IOException -> 0x02e6 }
            com.google.protobuf.dn r12 = r10.f134b     // Catch:{ IOException -> 0x02e6 }
            boolean r17 = r12.containsKey(r15)     // Catch:{ IOException -> 0x02e6 }
            if (r17 == 0) goto L_0x01d8
            java.lang.Object r12 = r12.get(r15)     // Catch:{ IOException -> 0x02e6 }
            r16 = r12
            a.d.a.a.af r16 = (p001a.p014d.p015a.p016a.C0043af) r16     // Catch:{ IOException -> 0x02e6 }
        L_0x01d8:
            r12 = r16
            com.google.protobuf.cq r12 = r12.f121f     // Catch:{ IOException -> 0x02e6 }
            j$.util.stream.Stream r12 = p3186j$.util.Collection.EL.stream(r12)     // Catch:{ IOException -> 0x02e6 }
            j$.util.stream.Collector r0 = com.google.common.p4522b.C58370cn.f155946a     // Catch:{ IOException -> 0x02e6 }
            java.lang.Object r0 = r12.collect(r0)     // Catch:{ IOException -> 0x02e6 }
            com.google.common.b.gu r0 = (com.google.common.p4522b.C58485gu) r0     // Catch:{ IOException -> 0x02e6 }
            com.google.common.b.gu r0 = com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig.C123491hj.m202823a(r0)     // Catch:{ IOException -> 0x02e6 }
            r14.mo55429h(r15, r0)     // Catch:{ IOException -> 0x02e6 }
            r0 = 0
            r12 = 4
            goto L_0x01b7
        L_0x01f2:
            com.google.common.b.hd r14 = r14.mo55427f(r0)     // Catch:{ IOException -> 0x02e6 }
            com.google.protobuf.dn r0 = r10.f133a     // Catch:{ IOException -> 0x02e6 }
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)     // Catch:{ IOException -> 0x02e6 }
            java.util.Collection r0 = r0.values()     // Catch:{ IOException -> 0x02e6 }
            j$.util.stream.Stream r0 = p3186j$.util.Collection.EL.stream(r0)     // Catch:{ IOException -> 0x02e6 }
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.gz r9 = com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig.C123480gz.f341276a     // Catch:{ IOException -> 0x02e6 }
            j$.util.stream.Stream r0 = r0.flatMap(r9)     // Catch:{ IOException -> 0x02e6 }
            j$.util.stream.Collector r9 = com.google.common.p4522b.C58370cn.f155947b     // Catch:{ IOException -> 0x02e6 }
            java.lang.Object r0 = r0.collect(r9)     // Catch:{ IOException -> 0x02e6 }
            com.google.common.b.ij r0 = (com.google.common.p4522b.C58528ij) r0     // Catch:{ IOException -> 0x02e6 }
            r0.size()     // Catch:{ IOException -> 0x02e6 }
            com.google.common.b.gz r9 = new com.google.common.b.gz     // Catch:{ IOException -> 0x02e6 }
            r12 = 4
            r9.<init>(r12)     // Catch:{ IOException -> 0x02e6 }
            com.google.common.b.sl r0 = r0.iterator()     // Catch:{ IOException -> 0x02e6 }
        L_0x021f:
            boolean r12 = r0.hasNext()     // Catch:{ IOException -> 0x02e6 }
            if (r12 == 0) goto L_0x0259
            java.lang.Object r12 = r0.next()     // Catch:{ IOException -> 0x02e6 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ IOException -> 0x02e6 }
            a.d.a.a.af r15 = p001a.p014d.p015a.p016a.C0043af.f114m     // Catch:{ IOException -> 0x02e6 }
            r12.getClass()     // Catch:{ IOException -> 0x02e6 }
            r17 = r0
            com.google.protobuf.dn r0 = r10.f134b     // Catch:{ IOException -> 0x02e6 }
            boolean r18 = r0.containsKey(r12)     // Catch:{ IOException -> 0x02e6 }
            if (r18 == 0) goto L_0x0241
            java.lang.Object r0 = r0.get(r12)     // Catch:{ IOException -> 0x02e6 }
            r15 = r0
            a.d.a.a.af r15 = (p001a.p014d.p015a.p016a.C0043af) r15     // Catch:{ IOException -> 0x02e6 }
        L_0x0241:
            com.google.protobuf.cq r0 = r15.f122g     // Catch:{ IOException -> 0x02e6 }
            j$.util.stream.Stream r0 = p3186j$.util.Collection.EL.stream(r0)     // Catch:{ IOException -> 0x02e6 }
            j$.util.stream.Collector r15 = com.google.common.p4522b.C58370cn.f155946a     // Catch:{ IOException -> 0x02e6 }
            java.lang.Object r0 = r0.collect(r15)     // Catch:{ IOException -> 0x02e6 }
            com.google.common.b.gu r0 = (com.google.common.p4522b.C58485gu) r0     // Catch:{ IOException -> 0x02e6 }
            com.google.common.b.gu r0 = com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig.C123491hj.m202823a(r0)     // Catch:{ IOException -> 0x02e6 }
            r9.mo55429h(r12, r0)     // Catch:{ IOException -> 0x02e6 }
            r0 = r17
            goto L_0x021f
        L_0x0259:
            r0 = 0
            com.google.common.b.hd r15 = r9.mo55427f(r0)     // Catch:{ IOException -> 0x02e6 }
            com.google.protobuf.dn r0 = r10.f133a     // Catch:{ IOException -> 0x02e6 }
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)     // Catch:{ IOException -> 0x02e6 }
            java.util.Collection r0 = r0.values()     // Catch:{ IOException -> 0x02e6 }
            j$.util.stream.Stream r0 = p3186j$.util.Collection.EL.stream(r0)     // Catch:{ IOException -> 0x02e6 }
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.gx r9 = com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig.C123478gx.f341274a     // Catch:{ IOException -> 0x02e6 }
            j$.util.stream.Stream r0 = r0.flatMap(r9)     // Catch:{ IOException -> 0x02e6 }
            j$.util.stream.Collector r9 = com.google.common.p4522b.C58370cn.f155947b     // Catch:{ IOException -> 0x02e6 }
            java.lang.Object r0 = r0.collect(r9)     // Catch:{ IOException -> 0x02e6 }
            com.google.common.b.ij r0 = (com.google.common.p4522b.C58528ij) r0     // Catch:{ IOException -> 0x02e6 }
            com.google.common.b.gz r9 = new com.google.common.b.gz     // Catch:{ IOException -> 0x02e6 }
            r12 = 4
            r9.<init>(r12)     // Catch:{ IOException -> 0x02e6 }
            com.google.common.b.sl r0 = r0.iterator()     // Catch:{ IOException -> 0x02e6 }
        L_0x0284:
            boolean r12 = r0.hasNext()     // Catch:{ IOException -> 0x02e6 }
            if (r12 == 0) goto L_0x02c3
            java.lang.Object r12 = r0.next()     // Catch:{ IOException -> 0x02e6 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ IOException -> 0x02e6 }
            a.d.a.a.af r17 = p001a.p014d.p015a.p016a.C0043af.f114m     // Catch:{ IOException -> 0x02e6 }
            r12.getClass()     // Catch:{ IOException -> 0x02e6 }
            r20 = r0
            com.google.protobuf.dn r0 = r10.f134b     // Catch:{ IOException -> 0x02e6 }
            boolean r18 = r0.containsKey(r12)     // Catch:{ IOException -> 0x02e6 }
            if (r18 == 0) goto L_0x02a7
            java.lang.Object r0 = r0.get(r12)     // Catch:{ IOException -> 0x02e6 }
            r17 = r0
            a.d.a.a.af r17 = (p001a.p014d.p015a.p016a.C0043af) r17     // Catch:{ IOException -> 0x02e6 }
        L_0x02a7:
            r0 = r17
            com.google.protobuf.cq r0 = r0.f123h     // Catch:{ IOException -> 0x02e6 }
            j$.util.stream.Stream r0 = p3186j$.util.Collection.EL.stream(r0)     // Catch:{ IOException -> 0x02e6 }
            j$.util.stream.Collector r1 = com.google.common.p4522b.C58370cn.f155946a     // Catch:{ IOException -> 0x02e6 }
            java.lang.Object r0 = r0.collect(r1)     // Catch:{ IOException -> 0x02e6 }
            com.google.common.b.gu r0 = (com.google.common.p4522b.C58485gu) r0     // Catch:{ IOException -> 0x02e6 }
            com.google.common.b.gu r0 = com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig.C123491hj.m202823a(r0)     // Catch:{ IOException -> 0x02e6 }
            r9.mo55429h(r12, r0)     // Catch:{ IOException -> 0x02e6 }
            r1 = r19
            r0 = r20
            goto L_0x0284
        L_0x02c3:
            r0 = 0
            r9.mo55427f(r0)     // Catch:{ IOException -> 0x02e6 }
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.ht r0 = new com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.ht     // Catch:{ IOException -> 0x02e6 }
            r9 = r0
            r12 = r13
            r13 = r14
            r14 = r15
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ IOException -> 0x02e6 }
            goto L_0x02f5
        L_0x02d1:
            com.google.common.f.e r0 = com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig.C123491hj.f341289a     // Catch:{ IOException -> 0x02e6 }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ IOException -> 0x02e6 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ IOException -> 0x02e6 }
            r1 = 35054(0x88ee, float:4.9121E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ IOException -> 0x02e6 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ IOException -> 0x02e6 }
            r0.mo56386p(r2)     // Catch:{ IOException -> 0x02e6 }
            goto L_0x02f3
        L_0x02e6:
            r0 = move-exception
            com.google.common.f.e r1 = com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig.C123491hj.f341289a
            com.google.common.f.x r1 = r1.mo56226d()
            r9 = 35055(0x88ef, float:4.9123E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r9)).mo56386p(r3)
        L_0x02f3:
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.ht r0 = com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig.C123501ht.f341299a
        L_0x02f5:
            r10 = r0
            java.lang.String r0 = "teleport_search_fulfillment_resources.binarypb"
            a.d.a.a.w r1 = p001a.p014d.p015a.p016a.C0078w.f208d     // Catch:{ IOException -> 0x0326 }
            j$.util.Optional r0 = com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123050cq.m202384a(r4, r8, r0, r1)     // Catch:{ IOException -> 0x0326 }
            boolean r1 = r0.isPresent()     // Catch:{ IOException -> 0x0326 }
            if (r1 == 0) goto L_0x0311
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.ea r1 = new com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.ea     // Catch:{ IOException -> 0x0326 }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x0326 }
            a.d.a.a.w r0 = (p001a.p014d.p015a.p016a.C0078w) r0     // Catch:{ IOException -> 0x0326 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0326 }
            r11 = r1
            goto L_0x0336
        L_0x0311:
            com.google.common.f.e r0 = com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig.C123399dz.f341162a     // Catch:{ IOException -> 0x0326 }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ IOException -> 0x0326 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ IOException -> 0x0326 }
            r1 = 35016(0x88c8, float:4.9068E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ IOException -> 0x0326 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ IOException -> 0x0326 }
            r0.mo56386p(r2)     // Catch:{ IOException -> 0x0326 }
            goto L_0x0333
        L_0x0326:
            r0 = move-exception
            com.google.common.f.e r1 = com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig.C123399dz.f341162a
            com.google.common.f.x r1 = r1.mo56226d()
            r2 = 35017(0x88c9, float:4.9069E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r2)).mo56386p(r3)
        L_0x0333:
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.ea r0 = com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig.C123401ea.f341164a
            r11 = r0
        L_0x0336:
            java.lang.String r0 = "canonical_url_data.binarypb"
            a.d.a.a.d r1 = p001a.p014d.p015a.p016a.C0059d.f156b     // Catch:{ IOException -> 0x0365 }
            j$.util.Optional r0 = com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123050cq.m202384a(r4, r8, r0, r1)     // Catch:{ IOException -> 0x0365 }
            boolean r1 = r0.isPresent()     // Catch:{ IOException -> 0x0365 }
            if (r1 == 0) goto L_0x0372
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.bl r1 = new com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.bl     // Catch:{ IOException -> 0x0365 }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x0365 }
            a.d.a.a.d r0 = (p001a.p014d.p015a.p016a.C0059d) r0     // Catch:{ IOException -> 0x0365 }
            com.google.protobuf.cq r0 = r0.f158a     // Catch:{ IOException -> 0x0365 }
            j$.util.stream.Stream r0 = p3186j$.util.Collection.EL.stream(r0)     // Catch:{ IOException -> 0x0365 }
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.bj r2 = com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig.C123329bj.f341076a     // Catch:{ IOException -> 0x0365 }
            j$.util.stream.Stream r0 = r0.map(r2)     // Catch:{ IOException -> 0x0365 }
            j$.util.stream.Collector r2 = com.google.common.p4522b.C58370cn.f155946a     // Catch:{ IOException -> 0x0365 }
            java.lang.Object r0 = r0.collect(r2)     // Catch:{ IOException -> 0x0365 }
            com.google.common.b.gu r0 = (com.google.common.p4522b.C58485gu) r0     // Catch:{ IOException -> 0x0365 }
            r1.<init>(r0, r5)     // Catch:{ IOException -> 0x0365 }
            r12 = r1
            goto L_0x037c
        L_0x0365:
            r0 = move-exception
            com.google.common.f.e r1 = com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig.C123330bk.f341077a
            com.google.common.f.x r1 = r1.mo56226d()
            r2 = 35002(0x88ba, float:4.9048E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r2)).mo56386p(r3)
        L_0x0372:
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.bl r0 = new com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.bl
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89845m()
            r0.<init>(r1, r5)
            r12 = r0
        L_0x037c:
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.TeleportQueryCleanerImpl r13 = new com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.TeleportQueryCleanerImpl
            r13.<init>(r10, r12, r5)
            com.google.common.b.ij r0 = r11.mo105999a()
            j$.util.stream.Stream r0 = p3186j$.util.Collection.EL.stream(r0)
            p3186j$.util.Objects.requireNonNull(r11)
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.r r1 = new com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.r
            r1.<init>(r11)
            j$.util.stream.Stream r0 = r0.map(r1)
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.t r1 = com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig.C123514t.f341320a
            j$.util.stream.Stream r0 = r0.filter(r1)
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.u r1 = com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig.C123515u.f341321a
            j$.util.stream.Stream r0 = r0.map(r1)
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.v r1 = com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig.C123516v.f341322a
            j$.util.stream.Stream r0 = r0.map(r1)
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.w r1 = new com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.w
            r1.<init>(r10)
            j$.util.stream.Stream r0 = r0.filter(r1)
            j$.util.stream.Collector r1 = com.google.common.p4522b.C58370cn.f155947b
            java.lang.Object r0 = r0.collect(r1)
            com.google.common.b.ij r0 = (com.google.common.p4522b.C58528ij) r0
            com.google.common.b.ij r1 = r11.mo105999a()
            j$.util.stream.Stream r1 = p3186j$.util.Collection.EL.stream(r1)
            p3186j$.util.Objects.requireNonNull(r11)
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.x r2 = new com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.x
            r2.<init>(r11)
            j$.util.stream.Stream r1 = r1.map(r2)
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.t r2 = com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig.C123514t.f341320a
            j$.util.stream.Stream r1 = r1.filter(r2)
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.y r2 = com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig.C123519y.f341325a
            j$.util.stream.Stream r1 = r1.map(r2)
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.z r2 = com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig.C123520z.f341326a
            j$.util.stream.Stream r1 = r1.flatMap(r2)
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.aa r2 = new com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.aa
            r2.<init>(r10)
            j$.util.stream.Stream r1 = r1.filter(r2)
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.s r2 = com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig.C123513s.f341319a
            j$.util.stream.Stream r1 = r1.map(r2)
            j$.util.stream.Collector r2 = com.google.common.p4522b.C58370cn.f155947b
            java.lang.Object r1 = r1.collect(r2)
            com.google.common.b.ij r1 = (com.google.common.p4522b.C58528ij) r1
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.aq r2 = new com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.aq
            r2.<init>(r0, r1)
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.ag r0 = new com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.ag
            r0.<init>(r2, r10, r11, r12)
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.p r15 = new com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.p
            g.a.a r1 = r6.f341317a
            java.lang.Object r1 = r1.mo17428b()
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            r1.getClass()
            r15.<init>(r0, r13, r1)
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.dr r14 = new com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.dr
            r14.<init>(r15)
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.ge r0 = new com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.ge
            r10.getClass()
            r11.getClass()
            g.a.a r1 = r7.f341255a
            java.lang.Object r1 = r1.mo17428b()
            r16 = r1
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.bf r16 = (com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig.C123325bf) r16
            r16.getClass()
            g.a.a r1 = r7.f341256b
            java.lang.Object r1 = r1.mo17428b()
            r17 = r1
            java.util.concurrent.Executor r17 = (java.util.concurrent.Executor) r17
            r17.getClass()
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig.C123335bp.apply(java.lang.Object):java.lang.Object");
    }
}
