package com.google.android.apps.gsa.staticplugins.offline.p8167b.p8168a;

import com.google.android.apps.gsa.g.b.a;
import com.google.android.apps.gsa.g.c.b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.p4661a.p4662a.C61752n;

/* renamed from: com.google.android.apps.gsa.staticplugins.offline.b.a.n */
/* compiled from: PG */
public final class C105873n implements a {

    /* renamed from: a */
    private final C105879t f295501a;

    /* renamed from: b */
    private final C105862c f295502b;

    /* renamed from: c */
    private final b f295503c;

    public C105873n(C105879t tVar, C105862c cVar, b bVar) {
        this.f295501a = tVar;
        this.f295502b = cVar;
        this.f295503c = bVar;
    }

    /* renamed from: a */
    public final C58833ax mo95123a(C61752n nVar, Query query) {
        return C58836b.f156633a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: com.google.assistant.e.j.ka} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo95124b(com.google.speech.grammar.pumpkin.C66525q r9, com.google.android.apps.gsa.shared.search.Query r10) {
        /*
            r8 = this;
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.g.c.b r0 = r8.f295503c
            boolean r0 = r0.f()
            r1 = 5
            r2 = 3
            java.lang.String r3 = "android.opa.extra.CONVERSATION_DELTA"
            if (r0 == 0) goto L_0x02bf
            com.google.android.apps.gsa.g.c.b r0 = r8.f295503c
            java.lang.String r0 = r0.c
            java.lang.String r4 = "ActivateInterpreter"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x02bf
            com.google.android.apps.gsa.staticplugins.offline.b.a.c r9 = r8.f295502b
            boolean r0 = r10.mo84364bx(r3)
            if (r0 != 0) goto L_0x002a
            com.google.common.base.b r9 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r9 = com.google.common.util.concurrent.C60856cj.m92900i(r9)
            goto L_0x03b6
        L_0x002a:
            byte[] r10 = r10.mo84439dT()     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.ba r0 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.en r3 = com.google.assistant.p3897e.p3921j.C52081en.f136679i     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.bv r10 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r3, (byte[]) r10, (com.google.protobuf.C62921ba) r0)     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.en r10 = (com.google.assistant.p3897e.p3921j.C52081en) r10     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.cq r10 = r10.f136684d     // Catch:{ ct -> 0x02b7 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ ct -> 0x02b7 }
        L_0x0040:
            boolean r0 = r10.hasNext()     // Catch:{ ct -> 0x02b7 }
            if (r0 == 0) goto L_0x02b7
            java.lang.Object r0 = r10.next()     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.ep r0 = (com.google.assistant.p3897e.p3921j.C52083ep) r0     // Catch:{ ct -> 0x02b7 }
            int r3 = r0.f136692b     // Catch:{ ct -> 0x02b7 }
            if (r3 != r2) goto L_0x0055
            java.lang.Object r0 = r0.f136693c     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.ek r0 = (com.google.assistant.p3897e.p3921j.C52078ek) r0     // Catch:{ ct -> 0x02b7 }
            goto L_0x0057
        L_0x0055:
            com.google.assistant.e.j.ek r0 = com.google.assistant.p3897e.p3921j.C52078ek.f136671f     // Catch:{ ct -> 0x02b7 }
        L_0x0057:
            int r3 = r0.f136674b     // Catch:{ ct -> 0x02b7 }
            if (r3 != r1) goto L_0x0060
            java.lang.Object r0 = r0.f136675c     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.du r0 = (com.google.assistant.p3897e.p3921j.C51805du) r0     // Catch:{ ct -> 0x02b7 }
            goto L_0x0062
        L_0x0060:
            com.google.assistant.e.j.du r0 = com.google.assistant.p3897e.p3921j.C51805du.f135924e     // Catch:{ ct -> 0x02b7 }
        L_0x0062:
            java.lang.String r0 = r0.f135927b     // Catch:{ ct -> 0x02b7 }
            java.lang.String r3 = "ui.TAP_EXIT_LANG_TRANSLATOR"
            boolean r0 = r0.equals(r3)     // Catch:{ ct -> 0x02b7 }
            if (r0 == 0) goto L_0x0040
            com.google.android.apps.gsa.g.c.b r10 = r9.f295471b     // Catch:{ ct -> 0x02b7 }
            r10.a()     // Catch:{ ct -> 0x02b7 }
            java.util.Locale r9 = r9.f295470a     // Catch:{ ct -> 0x02b7 }
            java.lang.String r9 = r9.getLanguage()     // Catch:{ ct -> 0x02b7 }
            com.google.common.b.hd r10 = com.google.android.apps.gsa.staticplugins.offline.p8167b.p8168a.C105867h.f295481c     // Catch:{ ct -> 0x02b7 }
            java.util.Locale r0 = java.util.Locale.forLanguageTag(r9)     // Catch:{ ct -> 0x02b7 }
            java.lang.String r0 = r0.getLanguage()     // Catch:{ ct -> 0x02b7 }
            java.lang.Object r10 = r10.get(r0)     // Catch:{ ct -> 0x02b7 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ ct -> 0x02b7 }
            r10.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ ct -> 0x02b7 }
            r0.<init>()     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.aos r1 = com.google.assistant.p3897e.p3921j.aos.f135519e     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.bn r1 = r1.createBuilder()     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.aor r1 = (com.google.assistant.p3897e.p3921j.aor) r1     // Catch:{ ct -> 0x02b7 }
            r1.copyOnWrite()     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.bv r2 = r1.instance     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.aos r2 = (com.google.assistant.p3897e.p3921j.aos) r2     // Catch:{ ct -> 0x02b7 }
            int r3 = r2.f135521a     // Catch:{ ct -> 0x02b7 }
            r3 = r3 | 1
            r2.f135521a = r3     // Catch:{ ct -> 0x02b7 }
            r2.f135522b = r10     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.ka r2 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.jz r2 = (com.google.assistant.p3897e.p3921j.C52228jz) r2     // Catch:{ ct -> 0x02b7 }
            java.lang.String r3 = "speech.s3.TtsServiceRequest"
            r2.copyOnWrite()     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.ka r4 = (com.google.assistant.p3897e.p3921j.C52230ka) r4     // Catch:{ ct -> 0x02b7 }
            int r5 = r4.f137059a     // Catch:{ ct -> 0x02b7 }
            r5 = r5 | 1
            r4.f137059a = r5     // Catch:{ ct -> 0x02b7 }
            r4.f137060b = r3     // Catch:{ ct -> 0x02b7 }
            com.google.speech.k.a.ah r3 = com.google.speech.p5224k.p5225a.C67190ah.f182619q     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.bn r3 = r3.createBuilder()     // Catch:{ ct -> 0x02b7 }
            com.google.speech.k.a.ae r3 = (com.google.speech.p5224k.p5225a.C67187ae) r3     // Catch:{ ct -> 0x02b7 }
            r3.copyOnWrite()     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.bv r4 = r3.instance     // Catch:{ ct -> 0x02b7 }
            com.google.speech.k.a.ah r4 = (com.google.speech.p5224k.p5225a.C67190ah) r4     // Catch:{ ct -> 0x02b7 }
            int r5 = r4.f182622a     // Catch:{ ct -> 0x02b7 }
            r5 = r5 | 1
            r4.f182622a = r5     // Catch:{ ct -> 0x02b7 }
            r4.f182625d = r10     // Catch:{ ct -> 0x02b7 }
            r3.copyOnWrite()     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.bv r4 = r3.instance     // Catch:{ ct -> 0x02b7 }
            com.google.speech.k.a.ah r4 = (com.google.speech.p5224k.p5225a.C67190ah) r4     // Catch:{ ct -> 0x02b7 }
            r9.getClass()     // Catch:{ ct -> 0x02b7 }
            int r5 = r4.f182622a     // Catch:{ ct -> 0x02b7 }
            r5 = r5 | 8192(0x2000, float:1.14794E-41)
            r4.f182622a = r5     // Catch:{ ct -> 0x02b7 }
            r4.f182632k = r9     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.bv r9 = r3.build()     // Catch:{ ct -> 0x02b7 }
            com.google.speech.k.a.ah r9 = (com.google.speech.p5224k.p5225a.C67190ah) r9     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.z r9 = r9.toByteString()     // Catch:{ ct -> 0x02b7 }
            r2.copyOnWrite()     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.bv r3 = r2.instance     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.ka r3 = (com.google.assistant.p3897e.p3921j.C52230ka) r3     // Catch:{ ct -> 0x02b7 }
            r9.getClass()     // Catch:{ ct -> 0x02b7 }
            int r4 = r3.f137059a     // Catch:{ ct -> 0x02b7 }
            r4 = r4 | 2
            r3.f137059a = r4     // Catch:{ ct -> 0x02b7 }
            r3.f137061c = r9     // Catch:{ ct -> 0x02b7 }
            r1.copyOnWrite()     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.bv r9 = r1.instance     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.aos r9 = (com.google.assistant.p3897e.p3921j.aos) r9     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.bv r2 = r2.build()     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.ka r2 = (com.google.assistant.p3897e.p3921j.C52230ka) r2     // Catch:{ ct -> 0x02b7 }
            r2.getClass()     // Catch:{ ct -> 0x02b7 }
            r9.f135523c = r2     // Catch:{ ct -> 0x02b7 }
            int r2 = r9.f135521a     // Catch:{ ct -> 0x02b7 }
            r2 = r2 | 2
            r9.f135521a = r2     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.bv r9 = r1.build()     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.aos r9 = (com.google.assistant.p3897e.p3921j.aos) r9     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.z r9 = r9.toByteString()     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.dy r1 = com.google.assistant.p3897e.p3921j.C51809dy.f135933f     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.bn r1 = r1.createBuilder()     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.dx r1 = (com.google.assistant.p3897e.p3921j.C51808dx) r1     // Catch:{ ct -> 0x02b7 }
            java.lang.String r2 = "tts.OUTPUT"
            r1.copyOnWrite()     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.bv r3 = r1.instance     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.dy r3 = (com.google.assistant.p3897e.p3921j.C51809dy) r3     // Catch:{ ct -> 0x02b7 }
            int r4 = r3.f135935a     // Catch:{ ct -> 0x02b7 }
            r4 = r4 | 1
            r3.f135935a = r4     // Catch:{ ct -> 0x02b7 }
            r3.f135936b = r2     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.dw r2 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.dv r2 = (com.google.assistant.p3897e.p3921j.C51806dv) r2     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.kc r3 = com.google.assistant.p3897e.p3921j.C52232kc.f137062d     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.bn r3 = r3.createBuilder()     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.kb r3 = (com.google.assistant.p3897e.p3921j.C52231kb) r3     // Catch:{ ct -> 0x02b7 }
            java.lang.String r4 = "speech_output_args"
            r3.copyOnWrite()     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.bv r5 = r3.instance     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.kc r5 = (com.google.assistant.p3897e.p3921j.C52232kc) r5     // Catch:{ ct -> 0x02b7 }
            int r6 = r5.f137064a     // Catch:{ ct -> 0x02b7 }
            r6 = r6 | 1
            r5.f137064a = r6     // Catch:{ ct -> 0x02b7 }
            r5.f137065b = r4     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.ka r4 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.bn r4 = r4.createBuilder()     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.jz r4 = (com.google.assistant.p3897e.p3921j.C52228jz) r4     // Catch:{ ct -> 0x02b7 }
            java.lang.String r5 = "assistant.api.client_op.SpeechOutputArgs"
            r4.copyOnWrite()     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.bv r6 = r4.instance     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.ka r6 = (com.google.assistant.p3897e.p3921j.C52230ka) r6     // Catch:{ ct -> 0x02b7 }
            int r7 = r6.f137059a     // Catch:{ ct -> 0x02b7 }
            r7 = r7 | 1
            r6.f137059a = r7     // Catch:{ ct -> 0x02b7 }
            r6.f137060b = r5     // Catch:{ ct -> 0x02b7 }
            r4.copyOnWrite()     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.bv r5 = r4.instance     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.ka r5 = (com.google.assistant.p3897e.p3921j.C52230ka) r5     // Catch:{ ct -> 0x02b7 }
            r9.getClass()     // Catch:{ ct -> 0x02b7 }
            int r6 = r5.f137059a     // Catch:{ ct -> 0x02b7 }
            r6 = r6 | 2
            r5.f137059a = r6     // Catch:{ ct -> 0x02b7 }
            r5.f137061c = r9     // Catch:{ ct -> 0x02b7 }
            r3.copyOnWrite()     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.bv r9 = r3.instance     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.kc r9 = (com.google.assistant.p3897e.p3921j.C52232kc) r9     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.bv r4 = r4.build()     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.ka r4 = (com.google.assistant.p3897e.p3921j.C52230ka) r4     // Catch:{ ct -> 0x02b7 }
            r4.getClass()     // Catch:{ ct -> 0x02b7 }
            r9.f137066c = r4     // Catch:{ ct -> 0x02b7 }
            int r4 = r9.f137064a     // Catch:{ ct -> 0x02b7 }
            r4 = r4 | 2
            r9.f137064a = r4     // Catch:{ ct -> 0x02b7 }
            r2.mo53732b(r3)     // Catch:{ ct -> 0x02b7 }
            r1.copyOnWrite()     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.bv r9 = r1.instance     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.dy r9 = (com.google.assistant.p3897e.p3921j.C51809dy) r9     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.bv r2 = r2.build()     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.dw r2 = (com.google.assistant.p3897e.p3921j.C51807dw) r2     // Catch:{ ct -> 0x02b7 }
            r2.getClass()     // Catch:{ ct -> 0x02b7 }
            r9.f135938d = r2     // Catch:{ ct -> 0x02b7 }
            int r2 = r9.f135935a     // Catch:{ ct -> 0x02b7 }
            r2 = r2 | 4
            r9.f135935a = r2     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.bv r9 = r1.build()     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.dy r9 = (com.google.assistant.p3897e.p3921j.C51809dy) r9     // Catch:{ ct -> 0x02b7 }
            r0.add(r9)     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.aos r9 = com.google.assistant.p3897e.p3921j.aos.f135519e     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.bn r9 = r9.createBuilder()     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.aor r9 = (com.google.assistant.p3897e.p3921j.aor) r9     // Catch:{ ct -> 0x02b7 }
            r9.copyOnWrite()     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.bv r1 = r9.instance     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.aos r1 = (com.google.assistant.p3897e.p3921j.aos) r1     // Catch:{ ct -> 0x02b7 }
            int r2 = r1.f135521a     // Catch:{ ct -> 0x02b7 }
            r2 = r2 | 1
            r1.f135521a = r2     // Catch:{ ct -> 0x02b7 }
            r1.f135522b = r10     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.bv r9 = r9.build()     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.aos r9 = (com.google.assistant.p3897e.p3921j.aos) r9     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.z r9 = r9.toByteString()     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.dy r10 = com.google.assistant.p3897e.p3921j.C51809dy.f135933f     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.bn r10 = r10.createBuilder()     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.dx r10 = (com.google.assistant.p3897e.p3921j.C51808dx) r10     // Catch:{ ct -> 0x02b7 }
            java.lang.String r1 = "ui.SHOW_TEXT"
            r10.copyOnWrite()     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.bv r2 = r10.instance     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.dy r2 = (com.google.assistant.p3897e.p3921j.C51809dy) r2     // Catch:{ ct -> 0x02b7 }
            int r3 = r2.f135935a     // Catch:{ ct -> 0x02b7 }
            r3 = r3 | 1
            r2.f135935a = r3     // Catch:{ ct -> 0x02b7 }
            r2.f135936b = r1     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.dw r1 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.bn r1 = r1.createBuilder()     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.dv r1 = (com.google.assistant.p3897e.p3921j.C51806dv) r1     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.kc r2 = com.google.assistant.p3897e.p3921j.C52232kc.f137062d     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.kb r2 = (com.google.assistant.p3897e.p3921j.C52231kb) r2     // Catch:{ ct -> 0x02b7 }
            java.lang.String r3 = "show_text_args"
            r2.copyOnWrite()     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.kc r4 = (com.google.assistant.p3897e.p3921j.C52232kc) r4     // Catch:{ ct -> 0x02b7 }
            int r5 = r4.f137064a     // Catch:{ ct -> 0x02b7 }
            r5 = r5 | 1
            r4.f137064a = r5     // Catch:{ ct -> 0x02b7 }
            r4.f137065b = r3     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.ka r3 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.bn r3 = r3.createBuilder()     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.jz r3 = (com.google.assistant.p3897e.p3921j.C52228jz) r3     // Catch:{ ct -> 0x02b7 }
            java.lang.String r4 = "assistant.api.client_op.ShowTextArgs"
            r3.copyOnWrite()     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.bv r5 = r3.instance     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.ka r5 = (com.google.assistant.p3897e.p3921j.C52230ka) r5     // Catch:{ ct -> 0x02b7 }
            int r6 = r5.f137059a     // Catch:{ ct -> 0x02b7 }
            r6 = r6 | 1
            r5.f137059a = r6     // Catch:{ ct -> 0x02b7 }
            r5.f137060b = r4     // Catch:{ ct -> 0x02b7 }
            r3.copyOnWrite()     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.bv r4 = r3.instance     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.ka r4 = (com.google.assistant.p3897e.p3921j.C52230ka) r4     // Catch:{ ct -> 0x02b7 }
            r9.getClass()     // Catch:{ ct -> 0x02b7 }
            int r5 = r4.f137059a     // Catch:{ ct -> 0x02b7 }
            r5 = r5 | 2
            r4.f137059a = r5     // Catch:{ ct -> 0x02b7 }
            r4.f137061c = r9     // Catch:{ ct -> 0x02b7 }
            r2.copyOnWrite()     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.bv r9 = r2.instance     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.kc r9 = (com.google.assistant.p3897e.p3921j.C52232kc) r9     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.bv r3 = r3.build()     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.ka r3 = (com.google.assistant.p3897e.p3921j.C52230ka) r3     // Catch:{ ct -> 0x02b7 }
            r3.getClass()     // Catch:{ ct -> 0x02b7 }
            r9.f137066c = r3     // Catch:{ ct -> 0x02b7 }
            int r3 = r9.f137064a     // Catch:{ ct -> 0x02b7 }
            r3 = r3 | 2
            r9.f137064a = r3     // Catch:{ ct -> 0x02b7 }
            r1.mo53732b(r2)     // Catch:{ ct -> 0x02b7 }
            r10.copyOnWrite()     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.bv r9 = r10.instance     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.dy r9 = (com.google.assistant.p3897e.p3921j.C51809dy) r9     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.bv r1 = r1.build()     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.dw r1 = (com.google.assistant.p3897e.p3921j.C51807dw) r1     // Catch:{ ct -> 0x02b7 }
            r1.getClass()     // Catch:{ ct -> 0x02b7 }
            r9.f135938d = r1     // Catch:{ ct -> 0x02b7 }
            int r1 = r9.f135935a     // Catch:{ ct -> 0x02b7 }
            r1 = r1 | 4
            r9.f135935a = r1     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.bv r9 = r10.build()     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.dy r9 = (com.google.assistant.p3897e.p3921j.C51809dy) r9     // Catch:{ ct -> 0x02b7 }
            r0.add(r9)     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.e.a.j r9 = com.google.assistant.p3897e.p3910e.p3911a.C51195j.f133264n     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.bn r9 = r9.createBuilder()     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.e.a.e r9 = (com.google.assistant.p3897e.p3910e.p3911a.C51190e) r9     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.j.en r10 = com.google.android.apps.gsa.staticplugins.offline.p8167b.p8168a.C105863d.m176359a(r0)     // Catch:{ ct -> 0x02b7 }
            r9.copyOnWrite()     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.bv r0 = r9.instance     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.e.a.j r0 = (com.google.assistant.p3897e.p3910e.p3911a.C51195j) r0     // Catch:{ ct -> 0x02b7 }
            r10.getClass()     // Catch:{ ct -> 0x02b7 }
            r0.f133275j = r10     // Catch:{ ct -> 0x02b7 }
            int r10 = r0.f133266a     // Catch:{ ct -> 0x02b7 }
            r10 = r10 | 128(0x80, float:1.794E-43)
            r0.f133266a = r10     // Catch:{ ct -> 0x02b7 }
            com.google.protobuf.bv r9 = r9.build()     // Catch:{ ct -> 0x02b7 }
            com.google.assistant.e.e.a.j r9 = (com.google.assistant.p3897e.p3910e.p3911a.C51195j) r9     // Catch:{ ct -> 0x02b7 }
            com.google.common.base.ax r9 = com.google.common.base.C58833ax.m90834k(r9)     // Catch:{ ct -> 0x02b7 }
            com.google.common.util.concurrent.cx r9 = com.google.common.util.concurrent.C60856cj.m92900i(r9)     // Catch:{ ct -> 0x02b7 }
            goto L_0x03b6
        L_0x02b7:
            com.google.common.base.b r9 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r9 = com.google.common.util.concurrent.C60856cj.m92900i(r9)
            goto L_0x03b6
        L_0x02bf:
            com.google.android.apps.gsa.staticplugins.offline.b.a.t r0 = r8.f295501a
            if (r9 != 0) goto L_0x0383
            com.google.android.apps.gsa.g.e.a r9 = new com.google.android.apps.gsa.g.e.a
            r9.<init>()
            boolean r3 = r10.mo84364bx(r3)     // Catch:{ ct -> 0x0379 }
            if (r3 != 0) goto L_0x02d4
            com.google.android.apps.gsa.g.e.h r9 = r9.a()     // Catch:{ ct -> 0x0379 }
            goto L_0x03a9
        L_0x02d4:
            byte[] r10 = r10.mo84439dT()     // Catch:{ ct -> 0x0379 }
            com.google.protobuf.ba r3 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0379 }
            com.google.assistant.e.j.en r4 = com.google.assistant.p3897e.p3921j.C52081en.f136679i     // Catch:{ ct -> 0x0379 }
            com.google.protobuf.bv r10 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r4, (byte[]) r10, (com.google.protobuf.C62921ba) r3)     // Catch:{ ct -> 0x0379 }
            com.google.assistant.e.j.en r10 = (com.google.assistant.p3897e.p3921j.C52081en) r10     // Catch:{ ct -> 0x0379 }
            com.google.protobuf.cq r10 = r10.f136684d     // Catch:{ ct -> 0x0379 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ ct -> 0x0379 }
        L_0x02ea:
            boolean r3 = r10.hasNext()     // Catch:{ ct -> 0x0379 }
            if (r3 == 0) goto L_0x0379
            java.lang.Object r3 = r10.next()     // Catch:{ ct -> 0x0379 }
            com.google.assistant.e.j.ep r3 = (com.google.assistant.p3897e.p3921j.C52083ep) r3     // Catch:{ ct -> 0x0379 }
            int r4 = r3.f136692b     // Catch:{ ct -> 0x0379 }
            if (r4 != r2) goto L_0x02ff
            java.lang.Object r3 = r3.f136693c     // Catch:{ ct -> 0x0379 }
            com.google.assistant.e.j.ek r3 = (com.google.assistant.p3897e.p3921j.C52078ek) r3     // Catch:{ ct -> 0x0379 }
            goto L_0x0301
        L_0x02ff:
            com.google.assistant.e.j.ek r3 = com.google.assistant.p3897e.p3921j.C52078ek.f136671f     // Catch:{ ct -> 0x0379 }
        L_0x0301:
            int r4 = r3.f136674b     // Catch:{ ct -> 0x0379 }
            if (r4 != r1) goto L_0x030a
            java.lang.Object r3 = r3.f136675c     // Catch:{ ct -> 0x0379 }
            com.google.assistant.e.j.du r3 = (com.google.assistant.p3897e.p3921j.C51805du) r3     // Catch:{ ct -> 0x0379 }
            goto L_0x030c
        L_0x030a:
            com.google.assistant.e.j.du r3 = com.google.assistant.p3897e.p3921j.C51805du.f135924e     // Catch:{ ct -> 0x0379 }
        L_0x030c:
            java.lang.String r4 = "intent_input"
            com.google.assistant.e.j.ka r5 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d     // Catch:{ ct -> 0x0379 }
            com.google.protobuf.dn r3 = r3.f135929d     // Catch:{ ct -> 0x0379 }
            boolean r6 = r3.containsKey(r4)     // Catch:{ ct -> 0x0379 }
            if (r6 == 0) goto L_0x031f
            java.lang.Object r3 = r3.get(r4)     // Catch:{ ct -> 0x0379 }
            r5 = r3
            com.google.assistant.e.j.ka r5 = (com.google.assistant.p3897e.p3921j.C52230ka) r5     // Catch:{ ct -> 0x0379 }
        L_0x031f:
            com.google.protobuf.z r3 = r5.f137061c     // Catch:{ ct -> 0x0379 }
            com.google.protobuf.ba r4 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0379 }
            com.google.assistant.e.j.hd r5 = com.google.assistant.p3897e.p3921j.C52152hd.f136850c     // Catch:{ ct -> 0x0379 }
            com.google.protobuf.bv r3 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r5, (com.google.protobuf.C63088z) r3, (com.google.protobuf.C62921ba) r4)     // Catch:{ ct -> 0x0379 }
            com.google.assistant.e.j.hd r3 = (com.google.assistant.p3897e.p3921j.C52152hd) r3     // Catch:{ ct -> 0x0379 }
            com.google.protobuf.z r3 = r3.f136853b     // Catch:{ ct -> 0x0379 }
            com.google.protobuf.ba r4 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0379 }
            com.google.knowledge.a.a.n r5 = com.google.knowledge.p4661a.p4662a.C61752n.f166808f     // Catch:{ ct -> 0x0379 }
            com.google.protobuf.bv r3 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r5, (com.google.protobuf.C63088z) r3, (com.google.protobuf.C62921ba) r4)     // Catch:{ ct -> 0x0379 }
            com.google.knowledge.a.a.n r3 = (com.google.knowledge.p4661a.p4662a.C61752n) r3     // Catch:{ ct -> 0x0379 }
            java.lang.String r4 = r3.f166811b     // Catch:{ ct -> 0x0379 }
            java.lang.String r5 = "Activate_interpreter"
            boolean r4 = r4.equals(r5)     // Catch:{ ct -> 0x0379 }
            if (r4 == 0) goto L_0x02ea
            com.google.protobuf.cq r3 = r3.f166812c     // Catch:{ ct -> 0x0379 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ ct -> 0x0379 }
        L_0x034b:
            boolean r4 = r3.hasNext()     // Catch:{ ct -> 0x0379 }
            if (r4 == 0) goto L_0x02ea
            java.lang.Object r4 = r3.next()     // Catch:{ ct -> 0x0379 }
            com.google.knowledge.a.a.h r4 = (com.google.knowledge.p4661a.p4662a.C61746h) r4     // Catch:{ ct -> 0x0379 }
            java.lang.String r5 = "source_language"
            java.lang.String r6 = r4.f166796d     // Catch:{ ct -> 0x0379 }
            boolean r5 = r5.equals(r6)     // Catch:{ ct -> 0x0379 }
            if (r5 == 0) goto L_0x0368
            com.google.common.base.ax r4 = com.google.android.apps.gsa.staticplugins.offline.p8167b.p8168a.C105879t.m176376a(r4)     // Catch:{ ct -> 0x0379 }
            r9.b = r4     // Catch:{ ct -> 0x0379 }
            goto L_0x034b
        L_0x0368:
            java.lang.String r5 = "target_language"
            java.lang.String r6 = r4.f166796d     // Catch:{ ct -> 0x0379 }
            boolean r5 = r5.equals(r6)     // Catch:{ ct -> 0x0379 }
            if (r5 == 0) goto L_0x034b
            com.google.common.base.ax r4 = com.google.android.apps.gsa.staticplugins.offline.p8167b.p8168a.C105879t.m176376a(r4)     // Catch:{ ct -> 0x0379 }
            r9.c = r4     // Catch:{ ct -> 0x0379 }
            goto L_0x034b
        L_0x0379:
            java.util.Locale r10 = r0.f295510a
            r9.b(r10)
            com.google.android.apps.gsa.g.e.h r9 = r9.a()
            goto L_0x03a9
        L_0x0383:
            java.lang.String r10 = "NLUArgumentLabel_language"
            com.google.common.base.ax r10 = com.google.android.apps.gsa.staticplugins.offline.p8167b.p8168a.C105879t.m176377b(r9, r10)
            java.lang.String r1 = "NLUArgumentLabel_source_language"
            com.google.common.base.ax r1 = com.google.android.apps.gsa.staticplugins.offline.p8167b.p8168a.C105879t.m176377b(r9, r1)
            java.lang.String r2 = "NLUArgumentLabel_target_language"
            com.google.common.base.ax r9 = com.google.android.apps.gsa.staticplugins.offline.p8167b.p8168a.C105879t.m176377b(r9, r2)
            com.google.android.apps.gsa.g.e.a r2 = new com.google.android.apps.gsa.g.e.a
            r2.<init>()
            r2.a = r10
            r2.b = r1
            r2.c = r9
            java.util.Locale r9 = r0.f295510a
            r2.b(r9)
            com.google.android.apps.gsa.g.e.h r9 = r2.a()
        L_0x03a9:
            com.google.android.libraries.gsa.k.g r10 = r0.f295511b
            com.google.android.apps.gsa.staticplugins.offline.b.a.r r1 = new com.google.android.apps.gsa.staticplugins.offline.b.a.r
            r1.<init>(r0, r9)
            java.lang.String r9 = "triggerOfflineInterpreter"
            com.google.common.util.concurrent.cx r9 = r10.mo28202b(r9, r1)
        L_0x03b6:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.offline.p8167b.p8168a.C105873n.mo95124b(com.google.speech.grammar.pumpkin.q, com.google.android.apps.gsa.shared.search.Query):com.google.common.util.concurrent.cx");
    }

    /* renamed from: c */
    public final C60870cx mo95125c(C52081en enVar) {
        return C60856cj.m92900i(C58836b.f156633a);
    }
}
