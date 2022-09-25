package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.common.base.C58817ah;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.en */
/* compiled from: PG */
public final /* synthetic */ class C79285en implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C79290es f217756a;

    /* renamed from: b */
    public final /* synthetic */ C79311i f217757b;

    /* renamed from: c */
    public final /* synthetic */ String f217758c;

    public /* synthetic */ C79285en(C79290es esVar, C79311i iVar, String str) {
        this.f217756a = esVar;
        this.f217757b = iVar;
        this.f217758c = str;
    }

    public final Object apply(Object obj) {
        C79289er erVar;
        C79290es esVar = this.f217756a;
        C79311i iVar = this.f217757b;
        String str = this.f217758c;
        boolean k = esVar.mo73856k((Optional) obj, iVar);
        Objects.requireNonNull(esVar.f217763b);
        C79234cq cqVar = new C79234cq();
        if (k) {
            Objects.requireNonNull(esVar.f217763b);
            new C79235cr
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001f: CONSTRUCTOR  (r8v8 ? I:com.google.android.apps.gsa.nga.engine.understanding.teleport.cr) =  call: com.google.android.apps.gsa.nga.engine.understanding.teleport.cr.<init>():void type: CONSTRUCTOR in method: com.google.android.apps.gsa.nga.engine.understanding.teleport.en.apply(java.lang.Object):java.lang.Object, dex: classes5.dex
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r8v8 ?
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	... 34 more
                */
            /*
                this = this;
                com.google.android.apps.gsa.nga.engine.understanding.teleport.es r0 = r7.f217756a
                com.google.android.apps.gsa.nga.engine.understanding.teleport.i r1 = r7.f217757b
                java.lang.String r2 = r7.f217758c
                j$.util.Optional r8 = (p3186j$.util.Optional) r8
                boolean r3 = r0.mo73856k(r8, r1)
                com.google.android.apps.gsa.nga.engine.understanding.teleport.aa r8 = r0.f217763b
                p3186j$.util.Objects.requireNonNull(r8)
                com.google.android.apps.gsa.nga.engine.understanding.teleport.cq r4 = new com.google.android.apps.gsa.nga.engine.understanding.teleport.cq
                r4.<init>()
                if (r3 == 0) goto L_0x0023
                com.google.android.apps.gsa.nga.engine.understanding.teleport.aa r8 = r0.f217763b
                p3186j$.util.Objects.requireNonNull(r8)
                com.google.android.apps.gsa.nga.engine.understanding.teleport.cr r8 = new com.google.android.apps.gsa.nga.engine.understanding.teleport.cr
                r8.<init>()
                goto L_0x002d
            L_0x0023:
                com.google.android.apps.gsa.nga.engine.understanding.teleport.aa r8 = r0.f217763b
                p3186j$.util.Objects.requireNonNull(r8)
                com.google.android.apps.gsa.nga.engine.understanding.teleport.cs r8 = new com.google.android.apps.gsa.nga.engine.understanding.teleport.cs
                r8.<init>()
            L_0x002d:
                r5 = r8
                j$.util.Optional r6 = p3186j$.util.Optional.empty()
                com.google.common.b.gu r8 = r0.mo73849c(r1, r2, r3, r4, r5, r6)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.understanding.teleport.C79285en.apply(java.lang.Object):java.lang.Object");
        }
    }
