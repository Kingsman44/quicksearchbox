package com.google.ads.interactivemedia.p367v3.internal;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.db */
/* compiled from: PG */
public final class C6868db {

    /* renamed from: a */
    private String f21830a;

    /* renamed from: b */
    private Uri f21831b;

    /* renamed from: c */
    private String f21832c;

    /* renamed from: d */
    private final long f21833d = Long.MIN_VALUE;

    /* renamed from: e */
    private List f21834e;

    /* renamed from: f */
    private List f21835f;

    /* renamed from: g */
    private C6874dh f21836g;

    /* renamed from: h */
    private long f21837h;

    /* renamed from: i */
    private float f21838i;

    /* renamed from: j */
    private float f21839j;

    public C6868db() {
        Collections.emptyList();
        Collections.emptyMap();
        this.f21834e = Collections.emptyList();
        this.f21835f = Collections.emptyList();
        this.f21837h = -9223372036854775807L;
        this.f21838i = -3.4028235E38f;
        this.f21839j = -3.4028235E38f;
    }

    public /* synthetic */ C6868db(C6873dg dgVar) {
        this();
        this.f21830a = dgVar.f21857a;
        this.f21836g = dgVar.f21860d;
        C6871de deVar = dgVar.f21859c;
        this.f21837h = deVar.f21846b;
        this.f21838i = deVar.f21847c;
        this.f21839j = deVar.f21848d;
        C6872df dfVar = dgVar.f21858b;
        if (dfVar != null) {
            this.f21832c = dfVar.f21850b;
            this.f21831b = dfVar.f21849a;
            this.f21834e = dfVar.f21852d;
            this.f21835f = dfVar.f21854f;
        }
    }

    /* renamed from: a */
    public final C6873dg mo15649a() {
        C6872df dfVar;
        ary.m19464q(true);
        Uri uri = this.f21831b;
        if (uri != null) {
            dfVar = new C6872df(uri, this.f21832c, (C6870dd) null, this.f21834e, this.f21835f);
            String str = this.f21830a;
            if (str == null) {
                str = this.f21831b.toString();
            }
            this.f21830a = str;
        } else {
            dfVar = null;
        }
        C6872df dfVar2 = dfVar;
        String str2 = this.f21830a;
        ary.m19467t(str2);
        C6869dc dcVar = new C6869dc(Long.MIN_VALUE);
        C6871de deVar = new C6871de(this.f21837h, this.f21838i, this.f21839j);
        C6874dh dhVar = this.f21836g;
        if (dhVar == null) {
            new C6874dh
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0043: CONSTRUCTOR  (r1v4 ? I:com.google.ads.interactivemedia.v3.internal.dh) =  call: com.google.ads.interactivemedia.v3.internal.dh.<init>():void type: CONSTRUCTOR in method: com.google.ads.interactivemedia.v3.internal.db.a():com.google.ads.interactivemedia.v3.internal.dg, dex: classes.dex
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v4 ?
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	... 34 more
                */
            /*
                this = this;
                r0 = 1
                com.google.ads.interactivemedia.p367v3.internal.ary.m19464q(r0)
                android.net.Uri r2 = r9.f21831b
                if (r2 == 0) goto L_0x0022
                com.google.ads.interactivemedia.v3.internal.df r0 = new com.google.ads.interactivemedia.v3.internal.df
                java.lang.String r3 = r9.f21832c
                r4 = 0
                java.util.List r5 = r9.f21834e
                java.util.List r6 = r9.f21835f
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6)
                java.lang.String r1 = r9.f21830a
                if (r1 != 0) goto L_0x001f
                android.net.Uri r1 = r9.f21831b
                java.lang.String r1 = r1.toString()
            L_0x001f:
                r9.f21830a = r1
                goto L_0x0023
            L_0x0022:
                r0 = 0
            L_0x0023:
                r4 = r0
                com.google.ads.interactivemedia.v3.internal.dg r0 = new com.google.ads.interactivemedia.v3.internal.dg
                java.lang.String r2 = r9.f21830a
                com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r2)
                com.google.ads.interactivemedia.v3.internal.dc r3 = new com.google.ads.interactivemedia.v3.internal.dc
                r5 = -9223372036854775808
                r3.<init>(r5)
                com.google.ads.interactivemedia.v3.internal.de r5 = new com.google.ads.interactivemedia.v3.internal.de
                long r6 = r9.f21837h
                float r1 = r9.f21838i
                float r8 = r9.f21839j
                r5.<init>(r6, r1, r8)
                com.google.ads.interactivemedia.v3.internal.dh r1 = r9.f21836g
                if (r1 != 0) goto L_0x0046
                com.google.ads.interactivemedia.v3.internal.dh r1 = new com.google.ads.interactivemedia.v3.internal.dh
                r1.<init>()
            L_0x0046:
                r6 = r1
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C6868db.mo15649a():com.google.ads.interactivemedia.v3.internal.dg");
        }

        /* renamed from: b */
        public final void mo15650b(float f) {
            this.f21839j = f;
        }

        /* renamed from: c */
        public final void mo15651c(float f) {
            this.f21838i = f;
        }

        /* renamed from: d */
        public final void mo15652d(long j) {
            this.f21837h = j;
        }

        /* renamed from: e */
        public final void mo15653e(String str) {
            this.f21830a = str;
        }

        /* renamed from: f */
        public final void mo15654f(String str) {
            this.f21832c = str;
        }

        /* renamed from: g */
        public final void mo15655g(List list) {
            List list2;
            if (list == null || list.isEmpty()) {
                list2 = Collections.emptyList();
            } else {
                list2 = Collections.unmodifiableList(new ArrayList(list));
            }
            this.f21834e = list2;
        }

        /* renamed from: h */
        public final void mo15656h(Uri uri) {
            this.f21831b = uri;
        }
    }
