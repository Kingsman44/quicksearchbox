package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.au.am;
import com.google.android.apps.gsa.nga.engine.au.ap;
import com.google.android.apps.gsa.nga.engine.au.av;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.ds */
/* compiled from: PG */
public final /* synthetic */ class C79263ds implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C79290es f217727a;

    /* renamed from: b */
    public final /* synthetic */ C79298f f217728b;

    /* renamed from: c */
    public final /* synthetic */ C79326x f217729c;

    public /* synthetic */ C79263ds(C79290es esVar, C79298f fVar, C79326x xVar) {
        this.f217727a = esVar;
        this.f217728b = fVar;
        this.f217729c = xVar;
    }

    public final C60870cx apply(Object obj) {
        C58485gu guVar;
        C58485gu guVar2;
        C79289er erVar;
        C79290es esVar = this.f217727a;
        C79298f fVar = this.f217728b;
        C79326x xVar = this.f217729c;
        Optional optional = (Optional) obj;
        if (!esVar.f217766e.mo85405j(C90126fx.f251484jg)) {
            xVar.mo73900a("Not generating Assisted Browse, disabled by flag.");
            return C60856cj.m92900i(C58485gu.m89845m());
        } else if (!optional.isPresent()) {
            xVar.mo73900a("No foreground app found so giving up on generating Assisted Browse intent.");
            return C60856cj.m92900i(C58485gu.m89845m());
        } else {
            String str = (String) optional.map(C79245da.f217709a).map(C79246db.f217710a).orElse(BuildConfig.FLAVOR);
            if (str.isEmpty()) {
                xVar.mo73900a("No foreground app found so giving up on generating Assisted Browse intent.");
                return C60856cj.m92900i(C58485gu.m89845m());
            }
            C79325w wVar = (C79325w) optional.get();
            C58485gu a = esVar.f217767f.mo73867a(fVar, wVar);
            xVar.mo73900a(String.format("Generated %d webref intents.", new Object[]{Integer.valueOf(a.size())}));
            if (wVar.mo73886a().mo73870a().equals(C79310h.APP) && !wVar.mo73886a().mo73871b().equals("com.android.chrome") && esVar.f217769h.mo73703j(wVar.mo73886a().mo73871b())) {
                xVar.mo73900a("Skip foreground pattern matching, app is supported by classifier.");
            } else if (wVar.mo73886a().mo73870a().equals(C79310h.URL) && esVar.f217769h.mo73704k(Optional.m71637of(Uri.parse(wVar.mo73886a().mo73872c())))) {
                xVar.mo73900a("Skip foreground pattern matching, url is supported by classifier.");
            } else if (esVar.mo73855j(wVar.mo73886a(), fVar)) {
                xVar.mo73900a("Deeplink detected skipping foreground pattern matching.");
            } else {
                C79326x a2 = xVar.mo73900a("Running pattern-based assisted browse logic.");
                Optional of = Optional.m71637of(wVar);
                if (!of.isPresent()) {
                    a2.mo73900a("RETURNING - no foreground info.");
                    guVar = C58485gu.m89845m();
                } else {
                    C79311i a3 = ((C79325w) of.get()).mo73886a();
                    C58480gp e = C58485gu.m89837e();
                    e.mo55396h(esVar.mo73850d(a3));
                    if (a3.mo73870a().equals(C79310h.URL)) {
                        av avVar = esVar.f217776o;
                        guVar2 = (C58485gu) Collection.EL.stream(avVar.b(a3.mo73873d(), esVar.f217777p).f112a).flatMap(new ap(avVar)).collect(C58370cn.f155946a);
                    } else {
                        av avVar2 = esVar.f217776o;
                        guVar2 = (C58485gu) Collection.EL.stream(avVar2.a(a3.mo73873d()).f112a).flatMap(new am(avVar2)).collect(C58370cn.f155946a);
                    }
                    e.mo55396h(guVar2);
                    if (Collection.EL.stream(e.mo55394f()).map(new C79253di(fVar)).anyMatch(C79240cw.f217707a)) {
                        a2.mo73900a("REJECTED - assisted browse pattern matched negative pattern.");
                        guVar = C58485gu.m89845m();
                    } else {
                        Optional g = esVar.mo73852g(fVar, esVar.mo73848a(a3).f120e);
                        if (!g.isPresent()) {
                            a2.mo73900a("RETURNING - No assisted browse pattern matched.");
                            guVar = C58485gu.m89845m();
                        } else {
                            C79298f b = C79290es.m127206b((C79207bq) g.get());
                            if (b.mo73866l()) {
                                a2.mo73900a("RETURNING - extracted search test is empty.");
                                guVar = C58485gu.m89845m();
                            } else {
                                C58485gu a4 = esVar.f217767f.mo73867a(b, (C79325w) of.get());
                                a2.mo73900a(String.format("Generated %d webref intents.", new Object[]{Integer.valueOf(a4.size())}));
                                C79311i a5 = ((C79325w) of.get()).mo73886a();
                                String b2 = esVar.f217768g.mo73824b(a3.mo73873d(), b);
                                boolean b3 = ((C79325w) of.get()).mo73887b();
                                Objects.requireNonNull(esVar.f217763b);
                                C79255dk dkVar = new C79255dk();
                                if (b3) {
                                    Objects.requireNonNull(esVar.f217763b);
                                    new C79256dl
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0226: CONSTRUCTOR  (r0v23 ? I:com.google.android.apps.gsa.nga.engine.understanding.teleport.dl) =  call: com.google.android.apps.gsa.nga.engine.understanding.teleport.dl.<init>():void type: CONSTRUCTOR in method: com.google.android.apps.gsa.nga.engine.understanding.teleport.ds.apply(java.lang.Object):com.google.common.util.concurrent.cx, dex: classes5.dex
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v23 ?
                                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                        	... 74 more
                                        */
                                    /*
                                        this = this;
                                        com.google.android.apps.gsa.nga.engine.understanding.teleport.es r7 = r14.f217727a
                                        com.google.android.apps.gsa.nga.engine.understanding.teleport.f r0 = r14.f217728b
                                        com.google.android.apps.gsa.nga.engine.understanding.teleport.x r1 = r14.f217729c
                                        j$.util.Optional r15 = (p3186j$.util.Optional) r15
                                        com.google.android.apps.gsa.shared.util.v.g r2 = r7.f217766e
                                        com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251484jg
                                        boolean r2 = r2.mo85405j(r3)
                                        if (r2 != 0) goto L_0x0021
                                        java.lang.String r15 = "Not generating Assisted Browse, disabled by flag."
                                        r1.mo73900a(r15)
                                        com.google.common.b.gu r15 = com.google.common.p4522b.C58485gu.m89845m()
                                        com.google.common.util.concurrent.cx r15 = com.google.common.util.concurrent.C60856cj.m92900i(r15)
                                        goto L_0x02f4
                                    L_0x0021:
                                        boolean r2 = r15.isPresent()
                                        java.lang.String r3 = "No foreground app found so giving up on generating Assisted Browse intent."
                                        if (r2 != 0) goto L_0x0036
                                        r1.mo73900a(r3)
                                        com.google.common.b.gu r15 = com.google.common.p4522b.C58485gu.m89845m()
                                        com.google.common.util.concurrent.cx r15 = com.google.common.util.concurrent.C60856cj.m92900i(r15)
                                        goto L_0x02f4
                                    L_0x0036:
                                        com.google.android.apps.gsa.nga.engine.understanding.teleport.da r2 = com.google.android.apps.gsa.nga.engine.understanding.teleport.C79245da.f217709a
                                        j$.util.Optional r2 = r15.map(r2)
                                        com.google.android.apps.gsa.nga.engine.understanding.teleport.db r4 = com.google.android.apps.gsa.nga.engine.understanding.teleport.C79246db.f217710a
                                        j$.util.Optional r2 = r2.map(r4)
                                        java.lang.String r4 = ""
                                        java.lang.Object r2 = r2.orElse(r4)
                                        r8 = r2
                                        java.lang.String r8 = (java.lang.String) r8
                                        boolean r2 = r8.isEmpty()
                                        if (r2 == 0) goto L_0x005e
                                        r1.mo73900a(r3)
                                        com.google.common.b.gu r15 = com.google.common.p4522b.C58485gu.m89845m()
                                        com.google.common.util.concurrent.cx r15 = com.google.common.util.concurrent.C60856cj.m92900i(r15)
                                        goto L_0x02f4
                                    L_0x005e:
                                        java.lang.Object r15 = r15.get()
                                        com.google.android.apps.gsa.nga.engine.understanding.teleport.w r15 = (com.google.android.apps.gsa.nga.engine.understanding.teleport.C79325w) r15
                                        com.google.android.apps.gsa.nga.engine.understanding.teleport.fj r2 = r7.f217767f
                                        com.google.common.b.gu r9 = r2.mo73867a(r0, r15)
                                        r10 = 1
                                        java.lang.Object[] r2 = new java.lang.Object[r10]
                                        int r3 = r9.size()
                                        java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                                        r11 = 0
                                        r2[r11] = r3
                                        java.lang.String r3 = "Generated %d webref intents."
                                        java.lang.String r2 = java.lang.String.format(r3, r2)
                                        r1.mo73900a(r2)
                                        com.google.android.apps.gsa.nga.engine.understanding.teleport.i r2 = r15.mo73886a()
                                        com.google.android.apps.gsa.nga.engine.understanding.teleport.h r2 = r2.mo73870a()
                                        com.google.android.apps.gsa.nga.engine.understanding.teleport.h r4 = com.google.android.apps.gsa.nga.engine.understanding.teleport.C79310h.APP
                                        boolean r2 = r2.equals(r4)
                                        if (r2 == 0) goto L_0x00b8
                                        com.google.android.apps.gsa.nga.engine.understanding.teleport.i r2 = r15.mo73886a()
                                        java.lang.String r2 = r2.mo73871b()
                                        java.lang.String r4 = "com.android.chrome"
                                        boolean r2 = r2.equals(r4)
                                        if (r2 != 0) goto L_0x00b8
                                        com.google.android.apps.gsa.nga.engine.understanding.a.a.l r2 = r7.f217769h
                                        com.google.android.apps.gsa.nga.engine.understanding.teleport.i r4 = r15.mo73886a()
                                        java.lang.String r4 = r4.mo73871b()
                                        boolean r2 = r2.mo73703j(r4)
                                        if (r2 == 0) goto L_0x00b8
                                        java.lang.String r15 = "Skip foreground pattern matching, app is supported by classifier."
                                        r1.mo73900a(r15)
                                        goto L_0x027c
                                    L_0x00b8:
                                        com.google.android.apps.gsa.nga.engine.understanding.teleport.i r2 = r15.mo73886a()
                                        com.google.android.apps.gsa.nga.engine.understanding.teleport.h r2 = r2.mo73870a()
                                        com.google.android.apps.gsa.nga.engine.understanding.teleport.h r4 = com.google.android.apps.gsa.nga.engine.understanding.teleport.C79310h.URL
                                        boolean r2 = r2.equals(r4)
                                        if (r2 == 0) goto L_0x00e7
                                        com.google.android.apps.gsa.nga.engine.understanding.a.a.l r2 = r7.f217769h
                                        com.google.android.apps.gsa.nga.engine.understanding.teleport.i r4 = r15.mo73886a()
                                        java.lang.String r4 = r4.mo73872c()
                                        android.net.Uri r4 = android.net.Uri.parse(r4)
                                        j$.util.Optional r4 = p3186j$.util.Optional.m71637of(r4)
                                        boolean r2 = r2.mo73704k(r4)
                                        if (r2 == 0) goto L_0x00e7
                                        java.lang.String r15 = "Skip foreground pattern matching, url is supported by classifier."
                                        r1.mo73900a(r15)
                                        goto L_0x027c
                                    L_0x00e7:
                                        com.google.android.apps.gsa.nga.engine.understanding.teleport.i r2 = r15.mo73886a()
                                        boolean r2 = r7.mo73855j(r2, r0)
                                        if (r2 == 0) goto L_0x00f8
                                        java.lang.String r15 = "Deeplink detected skipping foreground pattern matching."
                                        r1.mo73900a(r15)
                                        goto L_0x027c
                                    L_0x00f8:
                                        java.lang.String r2 = "Running pattern-based assisted browse logic."
                                        com.google.android.apps.gsa.nga.engine.understanding.teleport.x r12 = r1.mo73900a(r2)
                                        j$.util.Optional r15 = p3186j$.util.Optional.m71637of(r15)
                                        boolean r1 = r15.isPresent()
                                        if (r1 != 0) goto L_0x0113
                                        java.lang.String r15 = "RETURNING - no foreground info."
                                        r12.mo73900a(r15)
                                        com.google.common.b.gu r15 = com.google.common.p4522b.C58485gu.m89845m()
                                        goto L_0x026e
                                    L_0x0113:
                                        java.lang.Object r1 = r15.get()
                                        com.google.android.apps.gsa.nga.engine.understanding.teleport.w r1 = (com.google.android.apps.gsa.nga.engine.understanding.teleport.C79325w) r1
                                        com.google.android.apps.gsa.nga.engine.understanding.teleport.i r1 = r1.mo73886a()
                                        com.google.common.b.gp r2 = com.google.common.p4522b.C58485gu.m89837e()
                                        com.google.common.b.gu r4 = r7.mo73850d(r1)
                                        r2.mo55396h(r4)
                                        com.google.android.apps.gsa.nga.engine.understanding.teleport.h r4 = r1.mo73870a()
                                        com.google.android.apps.gsa.nga.engine.understanding.teleport.h r5 = com.google.android.apps.gsa.nga.engine.understanding.teleport.C79310h.URL
                                        boolean r4 = r4.equals(r5)
                                        if (r4 == 0) goto L_0x0158
                                        com.google.android.apps.gsa.nga.engine.au.av r4 = r7.f217776o
                                        java.lang.String r5 = r1.mo73873d()
                                        com.google.android.apps.gsa.nga.engine.au.d r6 = r7.f217777p
                                        a.d.a.a.ad r5 = r4.b(r5, r6)
                                        com.google.protobuf.cq r5 = r5.f112a
                                        j$.util.stream.Stream r5 = p3186j$.util.Collection.EL.stream(r5)
                                        com.google.android.apps.gsa.nga.engine.au.ap r6 = new com.google.android.apps.gsa.nga.engine.au.ap
                                        r6.<init>(r4)
                                        j$.util.stream.Stream r4 = r5.flatMap(r6)
                                        j$.util.stream.Collector r5 = com.google.common.p4522b.C58370cn.f155946a
                                        java.lang.Object r4 = r4.collect(r5)
                                        com.google.common.b.gu r4 = (com.google.common.p4522b.C58485gu) r4
                                        goto L_0x0179
                                    L_0x0158:
                                        com.google.android.apps.gsa.nga.engine.au.av r4 = r7.f217776o
                                        java.lang.String r5 = r1.mo73873d()
                                        a.d.a.a.ad r5 = r4.a(r5)
                                        com.google.protobuf.cq r5 = r5.f112a
                                        j$.util.stream.Stream r5 = p3186j$.util.Collection.EL.stream(r5)
                                        com.google.android.apps.gsa.nga.engine.au.am r6 = new com.google.android.apps.gsa.nga.engine.au.am
                                        r6.<init>(r4)
                                        j$.util.stream.Stream r4 = r5.flatMap(r6)
                                        j$.util.stream.Collector r5 = com.google.common.p4522b.C58370cn.f155946a
                                        java.lang.Object r4 = r4.collect(r5)
                                        com.google.common.b.gu r4 = (com.google.common.p4522b.C58485gu) r4
                                    L_0x0179:
                                        r2.mo55396h(r4)
                                        com.google.common.b.gu r2 = r2.mo55394f()
                                        j$.util.stream.Stream r2 = p3186j$.util.Collection.EL.stream(r2)
                                        com.google.android.apps.gsa.nga.engine.understanding.teleport.di r4 = new com.google.android.apps.gsa.nga.engine.understanding.teleport.di
                                        r4.<init>(r0)
                                        j$.util.stream.Stream r2 = r2.map(r4)
                                        com.google.android.apps.gsa.nga.engine.understanding.teleport.cw r4 = com.google.android.apps.gsa.nga.engine.understanding.teleport.C79240cw.f217707a
                                        boolean r2 = r2.anyMatch(r4)
                                        if (r2 == 0) goto L_0x01a0
                                        java.lang.String r15 = "REJECTED - assisted browse pattern matched negative pattern."
                                        r12.mo73900a(r15)
                                        com.google.common.b.gu r15 = com.google.common.p4522b.C58485gu.m89845m()
                                        goto L_0x026e
                                    L_0x01a0:
                                        a.d.a.a.af r2 = r7.mo73848a(r1)
                                        com.google.protobuf.cq r2 = r2.f120e
                                        j$.util.Optional r0 = r7.mo73852g(r0, r2)
                                        boolean r2 = r0.isPresent()
                                        if (r2 != 0) goto L_0x01bb
                                        java.lang.String r15 = "RETURNING - No assisted browse pattern matched."
                                        r12.mo73900a(r15)
                                        com.google.common.b.gu r15 = com.google.common.p4522b.C58485gu.m89845m()
                                        goto L_0x026e
                                    L_0x01bb:
                                        java.lang.Object r0 = r0.get()
                                        com.google.android.apps.gsa.nga.engine.understanding.teleport.bq r0 = (com.google.android.apps.gsa.nga.engine.understanding.teleport.C79207bq) r0
                                        com.google.android.apps.gsa.nga.engine.understanding.teleport.f r0 = com.google.android.apps.gsa.nga.engine.understanding.teleport.C79290es.m127206b(r0)
                                        boolean r2 = r0.mo73866l()
                                        if (r2 == 0) goto L_0x01d6
                                        java.lang.String r15 = "RETURNING - extracted search test is empty."
                                        r12.mo73900a(r15)
                                        com.google.common.b.gu r15 = com.google.common.p4522b.C58485gu.m89845m()
                                        goto L_0x026e
                                    L_0x01d6:
                                        com.google.android.apps.gsa.nga.engine.understanding.teleport.fj r2 = r7.f217767f
                                        java.lang.Object r4 = r15.get()
                                        com.google.android.apps.gsa.nga.engine.understanding.teleport.w r4 = (com.google.android.apps.gsa.nga.engine.understanding.teleport.C79325w) r4
                                        com.google.common.b.gu r13 = r2.mo73867a(r0, r4)
                                        java.lang.Object[] r2 = new java.lang.Object[r10]
                                        int r4 = r13.size()
                                        java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                                        r2[r11] = r4
                                        java.lang.String r2 = java.lang.String.format(r3, r2)
                                        r12.mo73900a(r2)
                                        java.lang.Object r2 = r15.get()
                                        com.google.android.apps.gsa.nga.engine.understanding.teleport.w r2 = (com.google.android.apps.gsa.nga.engine.understanding.teleport.C79325w) r2
                                        com.google.android.apps.gsa.nga.engine.understanding.teleport.i r2 = r2.mo73886a()
                                        com.google.android.apps.gsa.nga.engine.understanding.teleport.TeleportQueryCleaner r3 = r7.f217768g
                                        java.lang.String r1 = r1.mo73873d()
                                        java.lang.String r3 = r3.mo73824b(r1, r0)
                                        java.lang.Object r15 = r15.get()
                                        com.google.android.apps.gsa.nga.engine.understanding.teleport.w r15 = (com.google.android.apps.gsa.nga.engine.understanding.teleport.C79325w) r15
                                        boolean r15 = r15.mo73887b()
                                        com.google.android.apps.gsa.nga.engine.understanding.teleport.aa r0 = r7.f217763b
                                        p3186j$.util.Objects.requireNonNull(r0)
                                        com.google.android.apps.gsa.nga.engine.understanding.teleport.dk r4 = new com.google.android.apps.gsa.nga.engine.understanding.teleport.dk
                                        r4.<init>()
                                        if (r15 == 0) goto L_0x022a
                                        com.google.android.apps.gsa.nga.engine.understanding.teleport.aa r0 = r7.f217763b
                                        p3186j$.util.Objects.requireNonNull(r0)
                                        com.google.android.apps.gsa.nga.engine.understanding.teleport.dl r0 = new com.google.android.apps.gsa.nga.engine.understanding.teleport.dl
                                        r0.<init>()
                                        goto L_0x0234
                                    L_0x022a:
                                        com.google.android.apps.gsa.nga.engine.understanding.teleport.aa r0 = r7.f217763b
                                        p3186j$.util.Objects.requireNonNull(r0)
                                        com.google.android.apps.gsa.nga.engine.understanding.teleport.dm r0 = new com.google.android.apps.gsa.nga.engine.understanding.teleport.dm
                                        r0.<init>()
                                    L_0x0234:
                                        r5 = r0
                                        com.google.android.apps.gsa.nga.engine.understanding.teleport.aa r0 = r7.f217763b
                                        p3186j$.util.Objects.requireNonNull(r0)
                                        com.google.android.apps.gsa.nga.engine.understanding.teleport.dn r0 = new com.google.android.apps.gsa.nga.engine.understanding.teleport.dn
                                        r0.<init>()
                                        j$.util.Optional r6 = p3186j$.util.Optional.m71637of(r0)
                                        r0 = r7
                                        r1 = r2
                                        r2 = r3
                                        r3 = r15
                                        com.google.common.b.gu r15 = r0.mo73849c(r1, r2, r3, r4, r5, r6)
                                        java.lang.Object[] r0 = new java.lang.Object[r10]
                                        int r1 = r15.size()
                                        java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                                        r0[r11] = r1
                                        java.lang.String r1 = "Generated %d pattern based Assisted Browse intents."
                                        java.lang.String r0 = java.lang.String.format(r1, r0)
                                        r12.mo73900a(r0)
                                        com.google.common.b.gp r0 = com.google.common.p4522b.C58485gu.m89837e()
                                        r0.mo55396h(r13)
                                        r0.mo55396h(r15)
                                        com.google.common.b.gu r15 = r0.mo55394f()
                                    L_0x026e:
                                        com.google.common.b.gp r0 = com.google.common.p4522b.C58485gu.m89837e()
                                        r0.mo55396h(r9)
                                        r0.mo55396h(r15)
                                        com.google.common.b.gu r9 = r0.mo55394f()
                                    L_0x027c:
                                        boolean r15 = r9.isEmpty()
                                        if (r15 == 0) goto L_0x028b
                                        com.google.common.b.gu r15 = com.google.common.p4522b.C58485gu.m89845m()
                                        com.google.common.util.concurrent.cx r15 = com.google.common.util.concurrent.C60856cj.m92900i(r15)
                                        goto L_0x02f4
                                    L_0x028b:
                                        com.google.android.apps.gsa.nga.engine.n.f.a r15 = r7.f217770i
                                        com.google.android.apps.gsa.nga.shared.aa.bn r0 = com.google.android.apps.gsa.nga.shared.p6275aa.C80136bn.f219915c
                                        com.google.protobuf.bn r0 = r0.createBuilder()
                                        com.google.android.apps.gsa.nga.shared.aa.k r0 = (com.google.android.apps.gsa.nga.shared.p6275aa.C80472k) r0
                                        com.google.android.apps.gsa.nga.shared.aa.h r1 = com.google.android.apps.gsa.nga.shared.p6275aa.C80447h.f220803d
                                        com.google.protobuf.bn r1 = r1.createBuilder()
                                        com.google.android.apps.gsa.nga.shared.aa.g r1 = (com.google.android.apps.gsa.nga.shared.p6275aa.C80407g) r1
                                        r1.copyOnWrite()
                                        com.google.protobuf.bv r2 = r1.instance
                                        com.google.android.apps.gsa.nga.shared.aa.h r2 = (com.google.android.apps.gsa.nga.shared.p6275aa.C80447h) r2
                                        r8.getClass()
                                        int r3 = r2.f220805a
                                        r3 = r3 | r10
                                        r2.f220805a = r3
                                        r2.f220806b = r8
                                        com.google.android.apps.gsa.shared.util.v.g r2 = r7.f217766e
                                        com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251036bI
                                        boolean r2 = r2.mo85405j(r3)
                                        r1.copyOnWrite()
                                        com.google.protobuf.bv r3 = r1.instance
                                        com.google.android.apps.gsa.nga.shared.aa.h r3 = (com.google.android.apps.gsa.nga.shared.p6275aa.C80447h) r3
                                        int r4 = r3.f220805a
                                        r4 = r4 | 2
                                        r3.f220805a = r4
                                        r3.f220807c = r2
                                        com.google.protobuf.bv r1 = r1.build()
                                        com.google.android.apps.gsa.nga.shared.aa.h r1 = (com.google.android.apps.gsa.nga.shared.p6275aa.C80447h) r1
                                        r0.copyOnWrite()
                                        com.google.protobuf.bv r2 = r0.instance
                                        com.google.android.apps.gsa.nga.shared.aa.bn r2 = (com.google.android.apps.gsa.nga.shared.p6275aa.C80136bn) r2
                                        r1.getClass()
                                        r2.f219918b = r1
                                        r1 = 29
                                        r2.f219917a = r1
                                        com.google.protobuf.bv r0 = r0.build()
                                        com.google.android.apps.gsa.nga.shared.aa.bn r0 = (com.google.android.apps.gsa.nga.shared.p6275aa.C80136bn) r0
                                        j$.util.Optional r1 = p3186j$.util.Optional.empty()
                                        com.google.common.util.concurrent.cx r15 = r15.mo72193d(r0, r1)
                                        com.google.android.apps.gsa.nga.engine.understanding.teleport.dc r0 = new com.google.android.apps.gsa.nga.engine.understanding.teleport.dc
                                        r0.<init>(r8, r9)
                                        java.util.concurrent.Executor r1 = r7.f217774m
                                        com.google.common.util.concurrent.cx r15 = com.google.common.util.concurrent.C60922j.m93044g(r15, r0, r1)
                                    L_0x02f4:
                                        return r15
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.understanding.teleport.C79263ds.apply(java.lang.Object):com.google.common.util.concurrent.cx");
                                }
                            }
