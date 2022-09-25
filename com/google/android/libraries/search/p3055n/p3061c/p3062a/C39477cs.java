package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.assistant.soda.C19243af;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p3055n.C39251aa;
import com.google.android.libraries.search.p3055n.C39253ac;
import com.google.android.libraries.search.p3055n.p3061c.C39645b;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3064b.C39419h;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3068f.p3069a.C39518a;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3068f.p3069a.C39526i;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3073j.C39628b;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.speech.p5218j.C67055jj;
import com.google.speech.p5218j.C67056jk;
import com.google.speech.p5218j.C67086kn;
import com.google.speech.p5218j.C67087ko;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71022bv;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71023bw;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71080dz;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71082ea;

/* renamed from: com.google.android.libraries.search.n.c.a.cs */
/* compiled from: PG */
final class C39477cs implements C39390af {

    /* renamed from: a */
    final /* synthetic */ C39479cu f103935a;

    public C39477cs(C39479cu cuVar) {
        this.f103935a = cuVar;
    }

    /* renamed from: a */
    public final void mo41801a(C39393ai aiVar) {
        C39636r rVar = new C39636r();
        rVar.f104346a = this.f103935a.mo41850k(C39389ae.HOTWORD_RUNTIME_ERROR.name());
        rVar.mo41791b(C39389ae.HOTWORD_RUNTIME_ERROR);
        C39411b a = rVar.mo41790a();
        C59104x b = C39479cu.f103938a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
        ((C59052c) ((C59052c) b).mo56372aa(53543)).mo56359L("#onError. Error code: %s, error message: %s, appFlowLoggingTag %s", aiVar.mo41808a(), aiVar.mo41809b(), a.mo41821b());
        C39526i iVar = this.f103935a.f103970u;
        C37252a c = C37176a.f97168gU.mo40779c();
        C71080dz dzVar = (C71080dz) C71082ea.f189563q.createBuilder();
        int c2 = C39518a.m68941c(aiVar);
        dzVar.copyOnWrite();
        C71082ea eaVar = (C71082ea) dzVar.instance;
        eaVar.f189580p = c2 - 2;
        eaVar.f189565a |= C89885b.S3REQUEST_VALUE;
        iVar.mo41871e(c, a, (C71082ea) dzVar.build());
        this.f103935a.mo41851l(aiVar, a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0090, code lost:
        if (r1 == false) goto L_0x0094;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41802b(com.google.speech.p5218j.C67087ko r12) {
        /*
            r11 = this;
            com.google.android.libraries.search.n.c.a.cu r0 = r11.f103935a
            com.google.android.libraries.search.n.c.a.ae r1 = com.google.android.libraries.search.p3055n.p3061c.p3062a.C39389ae.HOTWORD_DETECTED
            java.lang.String r1 = r1.name()
            java.lang.String r0 = r0.mo41850k(r1)
            com.google.android.libraries.search.n.c.a.cu r1 = r11.f103935a
            com.google.android.libraries.search.n.c.a.f.a.i r1 = r1.f103970u
            com.google.android.libraries.search.b.i.g r2 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97165gR
            com.google.android.libraries.search.b.i.a r2 = r2.mo40779c()
            com.google.android.libraries.search.n.c.a.r r3 = new com.google.android.libraries.search.n.c.a.r
            r3.<init>()
            r3.f104346a = r0
            com.google.android.libraries.search.n.c.a.ae r4 = com.google.android.libraries.search.p3055n.p3061c.p3062a.C39389ae.HOTWORD_DETECTED
            r3.mo41791b(r4)
            com.google.android.libraries.search.n.c.a.b r3 = r3.mo41790a()
            r1.mo41868a(r2, r3)
            com.google.common.f.e r1 = com.google.android.libraries.search.p3055n.p3061c.p3062a.C39479cu.f103938a
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "SodaTriggeringFrontend"
            r1.mo56378ag(r2, r3)
            java.lang.String r2 = "#onHotwordDetected"
            r4 = 53544(0xd128, float:7.5031E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r4)).mo56386p(r2)
            com.google.android.libraries.search.p3055n.p3061c.p3062a.p3073j.C39628b.m69080e(r12)
            com.google.android.libraries.search.n.c.a.cu r1 = r11.f103935a
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.f103971v
            boolean r1 = r1.get()
            r2 = 1
            r1 = r1 ^ r2
            com.google.android.libraries.search.n.c.a.cu r4 = r11.f103935a
            com.google.android.libraries.search.n.c.a.ac r5 = r4.f103961l
            com.google.common.base.ax r4 = r4.f103939A
            java.lang.Object r4 = r4.mo56107c()
            com.google.android.libraries.search.n.c.a.b.h r4 = (com.google.android.libraries.search.p3055n.p3061c.p3062a.p3064b.C39419h) r4
            com.google.android.libraries.search.n.h r4 = r4.mo41825a()
            com.google.android.libraries.search.n.c.a.cu r6 = r11.f103935a
            com.google.common.base.ax r6 = r6.f103939A
            java.lang.Object r6 = r6.mo56107c()
            com.google.android.libraries.search.n.c.a.b.h r6 = (com.google.android.libraries.search.p3055n.p3061c.p3062a.p3064b.C39419h) r6
            boolean r6 = r6.mo41836j()
            boolean r7 = com.google.android.libraries.search.p3055n.p3061c.p3062a.C39479cu.m68890p(r12)
            com.google.android.libraries.search.n.bf r8 = r4.f104599c
            if (r8 != 0) goto L_0x0073
            com.google.android.libraries.search.n.bf r8 = com.google.android.libraries.search.p3055n.C39357bf.f103644d
        L_0x0073:
            int r8 = r8.f103647b
            com.google.android.libraries.search.n.be r8 = com.google.android.libraries.search.p3055n.C39356be.m68761a(r8)
            if (r8 != 0) goto L_0x007d
            com.google.android.libraries.search.n.be r8 = com.google.android.libraries.search.p3055n.C39356be.DEFAULT_PERSONAL
        L_0x007d:
            com.google.android.libraries.search.n.be r9 = com.google.android.libraries.search.p3055n.C39356be.NAVIGATION
            r10 = 0
            if (r8 != r9) goto L_0x0087
            if (r6 == 0) goto L_0x0087
            if (r7 == 0) goto L_0x0093
            goto L_0x0090
        L_0x0087:
            boolean r4 = r5.mo41799d(r4)
            if (r4 == 0) goto L_0x0090
            if (r7 != 0) goto L_0x0090
            goto L_0x0093
        L_0x0090:
            if (r1 != 0) goto L_0x0093
            goto L_0x0094
        L_0x0093:
            r2 = 0
        L_0x0094:
            com.google.android.libraries.search.n.c.a.cu r4 = r11.f103935a
            com.google.common.base.ax r4 = r4.f103940B
            java.lang.Object r4 = r4.mo56107c()
            com.google.android.libraries.search.n.c.a.al r4 = (com.google.android.libraries.search.p3055n.p3061c.p3062a.C39396al) r4
            java.lang.String r4 = r4.mo41817d()
            if (r2 == 0) goto L_0x00f0
            com.google.android.libraries.search.n.c.a.cu r1 = r11.f103935a
            com.google.android.libraries.search.n.c.b r1 = r1.f103951b
            r1.mo39385a(r12)
            com.google.common.f.e r1 = com.google.android.libraries.search.p3055n.p3061c.p3062a.C39479cu.f103938a
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r3)
            java.lang.String r2 = "Hotword detected. Sent SodaEvent back to client."
            r3 = 53547(0xd12b, float:7.5035E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            com.google.android.libraries.search.n.c.a.cu r1 = r11.f103935a
            com.google.protobuf.bt r2 = com.google.android.libraries.search.p3055n.C39260aj.f103415g
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r12.mo58887l(r2)
            com.google.protobuf.bf r12 = r12.f169962ag
            com.google.protobuf.bs r3 = r2.f169971d
            java.lang.Object r12 = r12.mo58854l(r3)
            if (r12 != 0) goto L_0x00d6
            java.lang.Object r12 = r2.f169969b
            goto L_0x00da
        L_0x00d6:
            java.lang.Object r12 = r2.mo58889c(r12)
        L_0x00da:
            com.google.android.libraries.search.n.aj r12 = (com.google.android.libraries.search.p3055n.C39260aj) r12
            com.google.common.base.ax r12 = com.google.android.libraries.search.p3055n.p3061c.p3062a.p3068f.p3069a.C39518a.m68939a(r12, r4)
            r2 = 12
            r1.mo41856r(r12, r2)
            com.google.android.libraries.search.n.c.a.co r12 = new com.google.android.libraries.search.n.c.a.co
            r12.<init>(r11, r0)
            com.google.common.util.concurrent.cx r12 = androidx.p104d.p105a.C2169h.m6027a(r12)
            goto L_0x0194
        L_0x00f0:
            if (r1 == 0) goto L_0x012d
            com.google.common.f.e r1 = com.google.android.libraries.search.p3055n.p3061c.p3062a.C39479cu.f103938a
            com.google.common.f.x r1 = r1.mo56226d()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r3)
            java.lang.String r2 = "Shutdown called, not sending the hotword detect event to client. Try to restart hotword immediately"
            r3 = 53546(0xd12a, float:7.5034E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            com.google.android.libraries.search.n.c.a.cu r1 = r11.f103935a
            com.google.protobuf.bt r2 = com.google.android.libraries.search.p3055n.C39260aj.f103415g
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r12.mo58887l(r2)
            com.google.protobuf.bf r12 = r12.f169962ag
            com.google.protobuf.bs r3 = r2.f169971d
            java.lang.Object r12 = r12.mo58854l(r3)
            if (r12 != 0) goto L_0x011d
            java.lang.Object r12 = r2.f169969b
            goto L_0x0121
        L_0x011d:
            java.lang.Object r12 = r2.mo58889c(r12)
        L_0x0121:
            com.google.android.libraries.search.n.aj r12 = (com.google.android.libraries.search.p3055n.C39260aj) r12
            com.google.common.base.ax r12 = com.google.android.libraries.search.p3055n.p3061c.p3062a.p3068f.p3069a.C39518a.m68939a(r12, r4)
            r2 = 14
            r1.mo41856r(r12, r2)
            goto L_0x0192
        L_0x012d:
            com.google.common.f.e r1 = com.google.android.libraries.search.p3055n.p3061c.p3062a.C39479cu.f103938a
            com.google.common.f.x r1 = r1.mo56226d()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r3)
            java.lang.String r2 = "Speaker id not verified, sending the hotword reject event to client. Try to restart hotword immediately"
            r3 = 53545(0xd129, float:7.5033E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            com.google.android.libraries.search.n.c.a.cu r1 = r11.f103935a
            com.google.protobuf.bt r2 = com.google.android.libraries.search.p3055n.C39260aj.f103415g
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r12.mo58887l(r2)
            com.google.protobuf.bf r3 = r12.f169962ag
            com.google.protobuf.bs r5 = r2.f169971d
            java.lang.Object r3 = r3.mo58854l(r5)
            if (r3 != 0) goto L_0x0158
            java.lang.Object r2 = r2.f169969b
            goto L_0x015c
        L_0x0158:
            java.lang.Object r2 = r2.mo58889c(r3)
        L_0x015c:
            com.google.android.libraries.search.n.aj r2 = (com.google.android.libraries.search.p3055n.C39260aj) r2
            com.google.common.base.ax r2 = com.google.android.libraries.search.p3055n.p3061c.p3062a.p3068f.p3069a.C39518a.m68939a(r2, r4)
            r3 = 13
            r1.mo41856r(r2, r3)
            com.google.android.libraries.search.n.c.a.cu r1 = r11.f103935a
            com.google.protobuf.bt r2 = com.google.android.libraries.search.p3055n.C39260aj.f103415g
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r12.mo58887l(r2)
            com.google.protobuf.bf r12 = r12.f169962ag
            com.google.protobuf.bs r3 = r2.f169971d
            java.lang.Object r12 = r12.mo58854l(r3)
            if (r12 != 0) goto L_0x017f
            java.lang.Object r12 = r2.f169969b
            goto L_0x0183
        L_0x017f:
            java.lang.Object r12 = r2.mo58889c(r12)
        L_0x0183:
            com.google.android.libraries.search.n.aj r12 = (com.google.android.libraries.search.p3055n.C39260aj) r12
            com.google.speech.j.je r12 = r12.f103420d
            if (r12 != 0) goto L_0x018b
            com.google.speech.j.je r12 = com.google.speech.p5218j.C67050je.f182262f
        L_0x018b:
            com.google.speech.j.ko r12 = com.google.android.libraries.search.p3055n.p3061c.p3062a.p3073j.C39628b.m69076a(r12, r4)
            r1.mo41852m(r12)
        L_0x0192:
            com.google.common.util.concurrent.cx r12 = com.google.common.util.concurrent.C60866ct.f164955a
        L_0x0194:
            com.google.android.libraries.search.n.c.a.cu r1 = r11.f103935a
            com.google.apps.tiktok.tracing.contrib.b.e r2 = r1.f103955f
            com.google.android.libraries.search.n.c.a.cp r3 = new com.google.android.libraries.search.n.c.a.cp
            r3.<init>(r11, r12, r0)
            java.util.concurrent.Executor r12 = r1.f103953d
            com.google.common.util.concurrent.cx r12 = r2.mo51512b(r3, r12)
            java.lang.String r0 = "Handle start recognition again after hotword detected failed!"
            java.lang.Object[] r1 = new java.lang.Object[r10]
            com.google.apps.tiktok.concurrent.C46459k.m82829b(r12, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.p3055n.p3061c.p3062a.C39477cs.mo41802b(com.google.speech.j.ko):void");
    }

    /* renamed from: c */
    public final void mo41803c(C67056jk jkVar) {
        C39628b.m69079d(jkVar);
        int a = C67055jj.m97418a(jkVar.f182280c);
        if (a == 0 || a == 1) {
            String d = ((C39396al) this.f103935a.f103940B.mo56107c()).mo41817d();
            C39479cu cuVar = this.f103935a;
            String str = ((C39419h) cuVar.f103939A.mo56107c()).mo41828d().mo41840a().f395891l;
            C71022bv bvVar = (C71022bv) C71023bw.f189405n.createBuilder();
            float f = jkVar.f182278a;
            bvVar.copyOnWrite();
            C71023bw bwVar = (C71023bw) bvVar.instance;
            bwVar.f189407a = 1 | bwVar.f189407a;
            bwVar.f189408b = f;
            bvVar.copyOnWrite();
            C71023bw bwVar2 = (C71023bw) bvVar.instance;
            d.getClass();
            bwVar2.f189407a |= 256;
            bwVar2.f189416j = d;
            String str2 = jkVar.f182279b;
            bvVar.copyOnWrite();
            C71023bw bwVar3 = (C71023bw) bvVar.instance;
            str2.getClass();
            bwVar3.f189407a |= 2;
            bwVar3.f189409c = str2;
            bvVar.copyOnWrite();
            C71023bw bwVar4 = (C71023bw) bvVar.instance;
            str.getClass();
            bwVar4.f189407a |= 1024;
            bwVar4.f189418l = str;
            C58833ax k = C58833ax.m90834k((C71023bw) bvVar.build());
            if (cuVar.f103939A.mo56113h() && ((C39419h) cuVar.f103939A.mo56107c()).mo41832g()) {
                cuVar.f103970u.mo41872f(C37176a.f97287ih.mo40806d(), k, 15);
            }
            C39636r rVar = new C39636r();
            rVar.f104346a = this.f103935a.mo41850k(C39389ae.HOTWORD_TIMEOUT.name());
            rVar.mo41791b(C39389ae.HOTWORD_TIMEOUT);
            C39411b a2 = rVar.mo41790a();
            this.f103935a.f103970u.mo41868a(C37176a.f97166gS.mo40779c(), a2);
            C58976aa aaVar = C58975e.f156826a;
            this.f103935a.mo41852m(C39628b.m69077b(jkVar, d));
            C39479cu cuVar2 = this.f103935a;
            C46459k.m82829b(cuVar2.f103955f.mo51512b(new C39472cn(this, a2), cuVar2.f103953d), "Failed to handle onHotwordTimeout.", new Object[0]);
            return;
        }
        C59104x b = C39479cu.f103938a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
        ((C59052c) ((C59052c) b).mo56372aa(53549)).mo56386p("Not handling the timeoutevent with the timeout reason that is not DEFAULT_DSP for now.");
    }

    /* renamed from: d */
    public final void mo41804d() {
        C59104x b = C39479cu.f103938a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
        ((C59052c) ((C59052c) b).mo56372aa(53550)).mo56386p("Received onSodaAudioAdapterDisconnect");
        this.f103935a.mo41854o(C37176a.f97173gZ.mo40779c(), C39389ae.SODA_AUDIO_ADAPTER_DISCONNECTED, "#onSodaAudioAdapterDisconnect");
    }

    /* renamed from: e */
    public final void mo41805e(C19243af afVar) {
        int i;
        this.f103935a.mo41854o(C37176a.f97227ha.mo40779c(), C39389ae.SODA_STOPPED, "#onSodaStop");
        C59104x b = C39479cu.f103938a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
        ((C59052c) ((C59052c) b).mo56372aa(53551)).mo56389s("#onSodaStop %s", afVar.name());
        C39645b bVar = this.f103935a.f103951b;
        C67086kn knVar = (C67086kn) C67087ko.f182366n.createBuilder();
        C62940bt btVar = C39253ac.f103397d;
        C39251aa aaVar = (C39251aa) C39253ac.f103396c.createBuilder();
        int ordinal = afVar.ordinal();
        if (ordinal != 0) {
            i = 2;
            if (ordinal != 1) {
                if (ordinal != 2) {
                    i = 4;
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            i = 5;
                        } else {
                            throw new IllegalStateException(String.format("Unknown SodaStopReason %s", new Object[]{afVar.name()}));
                        }
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        aaVar.copyOnWrite();
        C39253ac acVar = (C39253ac) aaVar.instance;
        acVar.f103400b = i - 1;
        acVar.f103399a |= 1;
        knVar.mo58885m(btVar, (C39253ac) aaVar.build());
        bVar.mo39385a((C67087ko) knVar.build());
    }
}
