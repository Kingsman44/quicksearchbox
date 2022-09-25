package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p760a.p762b.p763a;

import com.google.common.p4526f.C59052c;
import com.google.p4449cd.p4456g.C57974a;
import com.google.p4449cd.p4456g.C57996c;
import com.google.p4449cd.p4456g.p4458b.C57987f;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.a.b.a.a */
/* compiled from: PG */
final class C12183a implements C57974a {

    /* renamed from: a */
    public final C57987f f38888a = new C57987f();

    /* renamed from: b */
    private final C57987f f38889b = new C57987f();

    /* renamed from: c */
    private boolean f38890c = false;

    /* renamed from: d */
    private boolean f38891d = false;

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x014f  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo20337c(java.lang.Object r14) {
        /*
            r13 = this;
            com.google.speech.h.ci r14 = (com.google.speech.p5208h.C66611ci) r14
            boolean r0 = r13.f38890c
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0158
            com.google.protobuf.bt r0 = com.google.speech.p5208h.C66629d.f181275b
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r14.mo58887l(r0)
            com.google.protobuf.bf r3 = r14.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r3.mo58857o(r0)
            if (r0 == 0) goto L_0x0158
            com.google.protobuf.bt r0 = com.google.speech.p5208h.C66629d.f181275b
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r14.mo58887l(r0)
            com.google.protobuf.bf r3 = r14.f169962ag
            com.google.protobuf.bs r4 = r0.f169971d
            java.lang.Object r3 = r3.mo58854l(r4)
            if (r3 != 0) goto L_0x0031
            java.lang.Object r0 = r0.f169969b
            goto L_0x0035
        L_0x0031:
            java.lang.Object r0 = r0.mo58889c(r3)
        L_0x0035:
            com.google.assistant.e.e.a.j r0 = (com.google.assistant.p3897e.p3910e.p3911a.C51195j) r0
            com.google.protobuf.cq r3 = r0.f133269d
            int r3 = r3.size()
            r4 = 2
            if (r3 <= 0) goto L_0x006a
            com.google.protobuf.cq r3 = r0.f133269d
            java.lang.Object r3 = r3.get(r2)
            com.google.assistant.e.e.a.p r3 = (com.google.assistant.p3897e.p3910e.p3911a.C51201p) r3
            int r3 = r3.f133293b
            int r3 = com.google.assistant.p3897e.p3910e.p3911a.C51200o.m86084a(r3)
            if (r3 != 0) goto L_0x0051
            goto L_0x0055
        L_0x0051:
            if (r3 != r4) goto L_0x0055
        L_0x0053:
            r3 = 1
            goto L_0x006b
        L_0x0055:
            com.google.protobuf.cq r3 = r0.f133269d
            java.lang.Object r3 = r3.get(r2)
            com.google.assistant.e.e.a.p r3 = (com.google.assistant.p3897e.p3910e.p3911a.C51201p) r3
            int r3 = r3.f133293b
            int r3 = com.google.assistant.p3897e.p3910e.p3911a.C51200o.m86084a(r3)
            if (r3 != 0) goto L_0x0066
            goto L_0x006a
        L_0x0066:
            r5 = 3
            if (r3 != r5) goto L_0x006a
            goto L_0x0053
        L_0x006a:
            r3 = 0
        L_0x006b:
            int r5 = r0.f133266a
            r6 = 4
            r5 = r5 & r6
            if (r5 == 0) goto L_0x0084
            com.google.assistant.e.e.a.i r5 = r0.f133270e
            if (r5 != 0) goto L_0x0077
            com.google.assistant.e.e.a.i r5 = com.google.assistant.p3897e.p3910e.p3911a.C51194i.f133258e
        L_0x0077:
            int r5 = r5.f133263d
            int r5 = com.google.assistant.p3897e.p3910e.p3911a.C51193h.m86083a(r5)
            if (r5 != 0) goto L_0x0080
            goto L_0x0084
        L_0x0080:
            if (r5 != r4) goto L_0x0084
            r5 = 1
            goto L_0x0085
        L_0x0084:
            r5 = 0
        L_0x0085:
            int r7 = r0.f133266a
            r7 = r7 & 8
            if (r3 != 0) goto L_0x0158
            if (r5 != 0) goto L_0x0158
            if (r7 == 0) goto L_0x0091
            goto L_0x0158
        L_0x0091:
            com.google.common.f.e r3 = com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p760a.p762b.p763a.C12184b.f38892a
            com.google.common.f.x r3 = r3.mo56224b()
            java.lang.String r5 = "ConversationDeltaStreamChunkSink: handleAssistantResponseOnNext"
            r7 = 44089(0xac39, float:6.1782E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r7)).mo56386p(r5)
            com.google.cd.g.b.f r3 = r13.f38888a
            com.google.assistant.e.j.en r5 = r0.f133275j
            if (r5 != 0) goto L_0x00a7
            com.google.assistant.e.j.en r5 = com.google.assistant.p3897e.p3921j.C52081en.f136679i
        L_0x00a7:
            com.google.common.b.gz r7 = new com.google.common.b.gz
            r7.<init>(r6)
            com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.a.a.c r8 = new com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.a.a.c
            r8.<init>()
            r8.mo20474b(r5)
            com.google.assistant.e.e.a.i r9 = r0.f133270e
            if (r9 != 0) goto L_0x00ba
            com.google.assistant.e.e.a.i r9 = com.google.assistant.p3897e.p3910e.p3911a.C51194i.f133258e
        L_0x00ba:
            com.google.protobuf.z r9 = r9.f133262c
            j$.util.Optional r9 = p3186j$.util.Optional.m71637of(r9)
            r8.f38883b = r9
            com.google.protobuf.cq r5 = r5.f136684d
            java.util.Iterator r5 = r5.iterator()
        L_0x00c8:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x013c
            java.lang.Object r9 = r5.next()
            com.google.assistant.e.j.ep r9 = (com.google.assistant.p3897e.p3921j.C52083ep) r9
            int r10 = r9.f136692b
            if (r10 != r6) goto L_0x00dd
            java.lang.Object r10 = r9.f136693c
            com.google.assistant.e.j.ei r10 = (com.google.assistant.p3897e.p3921j.C52076ei) r10
            goto L_0x00df
        L_0x00dd:
            com.google.assistant.e.j.ei r10 = com.google.assistant.p3897e.p3921j.C52076ei.f136664f
        L_0x00df:
            com.google.assistant.e.j.dy r10 = r10.f136668c
            if (r10 != 0) goto L_0x00e5
            com.google.assistant.e.j.dy r10 = com.google.assistant.p3897e.p3921j.C51809dy.f135933f
        L_0x00e5:
            java.lang.String r11 = r10.f135936b
            java.lang.String r12 = "tts.OUTPUT"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x00c8
            com.google.assistant.e.j.dw r10 = r10.f135938d
            if (r10 != 0) goto L_0x00f5
            com.google.assistant.e.j.dw r10 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
        L_0x00f5:
            com.google.assistant.e.j.aos r11 = com.google.assistant.p3897e.p3921j.aos.f135519e
            com.google.protobuf.eb r11 = r11.getParserForType()
            java.lang.String r12 = "speech_output_args"
            j$.util.Optional r10 = com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p856a.C12875h.m29134b(r10, r12, r11)
            boolean r11 = r10.isPresent()
            if (r11 == 0) goto L_0x00c8
            java.lang.Object r10 = r10.get()
            com.google.assistant.e.j.aos r10 = (com.google.assistant.p3897e.p3921j.aos) r10
            int r10 = r10.f135521a
            r10 = r10 & r4
            if (r10 != 0) goto L_0x00c8
            boolean r10 = r13.f38891d
            if (r10 == 0) goto L_0x0124
            com.google.common.f.e r10 = com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p760a.p762b.p763a.C12184b.f38892a
            com.google.common.f.x r10 = r10.mo56225c()
            java.lang.String r11 = "ConversationDeltaStreamChunkSink: multiple client ops without structured tts."
            r12 = 44088(0xac38, float:6.178E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r12)).mo56386p(r11)
        L_0x0124:
            r13.f38891d = r1
            int r9 = r9.f136694d
            com.google.cd.g.b.f r10 = r13.f38889b
            com.google.android.libraries.assistant.auto.tng.assistant.c.b.d.a.c r11 = new com.google.android.libraries.assistant.auto.tng.assistant.c.b.d.a.c
            r11.<init>(r10)
            com.google.android.libraries.assistant.auto.tng.assistant.c.b.d.a.a r10 = new com.google.android.libraries.assistant.auto.tng.assistant.c.b.d.a.a
            r10.<init>(r11)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r7.mo55429h(r9, r10)
            goto L_0x00c8
        L_0x013c:
            com.google.common.b.hd r4 = r7.mo55427f(r2)
            r8.f38882a = r4
            com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.a.a.h r4 = r8.mo20473a()
            com.google.cd.g.b.a r3 = r3.f155056f
            r3.mo54591h(r4)
            boolean r0 = r0.f133274i
            if (r0 != 0) goto L_0x0158
            r13.f38890c = r1
            com.google.cd.g.b.f r0 = r13.f38888a
            com.google.cd.g.b.a r0 = r0.f155056f
            r0.mo54589f(r2)
        L_0x0158:
            com.google.protobuf.bt r0 = com.google.speech.p5224k.p5225a.C67186ad.f182611f
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r14.mo58887l(r0)
            com.google.protobuf.bf r3 = r14.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r3.mo58857o(r0)
            if (r0 != 0) goto L_0x016c
            goto L_0x01c0
        L_0x016c:
            com.google.protobuf.bt r0 = com.google.speech.p5224k.p5225a.C67186ad.f182611f
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r14.mo58887l(r0)
            com.google.protobuf.bf r14 = r14.f169962ag
            com.google.protobuf.bs r3 = r0.f169971d
            java.lang.Object r14 = r14.mo58854l(r3)
            if (r14 != 0) goto L_0x0182
            java.lang.Object r14 = r0.f169969b
            goto L_0x0186
        L_0x0182:
            java.lang.Object r14 = r0.mo58889c(r14)
        L_0x0186:
            com.google.speech.k.a.ad r14 = (com.google.speech.p5224k.p5225a.C67186ad) r14
            int r0 = r14.f182613a
            r0 = r0 & r1
            if (r0 == 0) goto L_0x01b5
            com.google.cd.g.b.f r0 = r13.f38889b
            com.google.android.libraries.assistant.c.g.k.be r3 = com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17496be.f50505c
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.libraries.assistant.c.g.k.bd r3 = (com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17495bd) r3
            com.google.protobuf.z r4 = r14.f182614b
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.android.libraries.assistant.c.g.k.be r5 = (com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17496be) r5
            r4.getClass()
            int r6 = r5.f50507a
            r1 = r1 | r6
            r5.f50507a = r1
            r5.f50508b = r4
            com.google.protobuf.bv r1 = r3.build()
            com.google.android.libraries.assistant.c.g.k.be r1 = (com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17496be) r1
            com.google.cd.g.b.a r0 = r0.f155056f
            r0.mo54591h(r1)
        L_0x01b5:
            boolean r14 = r14.f182615c
            if (r14 == 0) goto L_0x01c0
            com.google.cd.g.b.f r14 = r13.f38889b
            com.google.cd.g.b.a r14 = r14.f155056f
            r14.mo54589f(r2)
        L_0x01c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p760a.p762b.p763a.C12183a.mo20337c(java.lang.Object):void");
    }

    /* renamed from: d */
    public final void mo20338d(C57996c cVar) {
    }

    /* renamed from: gQ */
    public final void mo20339gQ(boolean z) {
        if (!this.f38890c) {
            this.f38890c = true;
            this.f38888a.f155056f.mo54589f(z);
        }
        this.f38889b.f155056f.mo54589f(false);
    }

    /* renamed from: gR */
    public final void mo20340gR(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C12184b.f38892a.mo56226d()).mo56382g(th)).mo56372aa(44094)).mo56386p("ConversationDeltaStreamChunkSink: sink failure.");
        if (!this.f38890c) {
            this.f38888a.f155056f.mo54590g(th);
        }
        this.f38889b.f155056f.mo54590g(th);
    }
}
