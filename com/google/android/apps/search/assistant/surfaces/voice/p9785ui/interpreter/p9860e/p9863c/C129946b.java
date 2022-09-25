package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.p9863c;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129893ab;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129918b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129944c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129962m;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129963n;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129964o;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129965p;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129966q;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129969t;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129975z;
import com.google.assistant.p3897e.p3921j.p3925d.C51776b;
import com.google.assistant.p3897e.p3921j.p3925d.C51778d;
import com.google.assistant.p3897e.p3921j.p3925d.C51780f;
import com.google.assistant.p3897e.p3921j.p3925d.C51782h;
import com.google.assistant.p3897e.p3921j.p3925d.C51784j;
import com.google.assistant.p3897e.p3921j.p3926e.C51894da;
import com.google.assistant.p3897e.p3921j.p3926e.C51909dp;
import com.google.assistant.p3897e.p3921j.p3926e.C51910dq;
import com.google.assistant.p3897e.p3921j.p3926e.C51912ds;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.c.b */
/* compiled from: PG */
public final class C129946b {

    /* renamed from: a */
    private static final C59071e f356413a = C59071e.m91331h();

    /* renamed from: a */
    public static final C129966q m212133a(C129966q qVar, C51910dq dqVar) {
        C69664n.m101061g(qVar, "interpreterState");
        C69664n.m101061g(dqVar, "clientOp");
        int i = dqVar.f136161a;
        if (!((i & 64) == 0 || (i & 128) == 0)) {
            String str = dqVar.f136166f;
            C69664n.m101060f(str, "sourceText");
            if (!C69764m.m101229h(str)) {
                String str2 = dqVar.f136167g;
                C69664n.m101060f(str2, "targetText");
                if (!C69764m.m101229h(str2)) {
                    C62934bn builder = qVar.toBuilder();
                    C69664n.m101060f(builder, "this.toBuilder()");
                    C129969t a = C69664n.m101061g((C129944c) builder, "builder");
                    C51776b bVar = dqVar.f136165e;
                    if (bVar == null) {
                        bVar = C51776b.f135842e;
                    }
                    C51780f fVar = bVar.f135845b;
                    if (fVar == null) {
                        fVar = C51780f.f135862d;
                    }
                    C69664n.m101060f(fVar, "clientOp.guiParams.sourcePanel");
                    C51776b bVar2 = dqVar.f136165e;
                    if (bVar2 == null) {
                        bVar2 = C51776b.f135842e;
                    }
                    C51780f fVar2 = bVar2.f135846c;
                    if (fVar2 == null) {
                        fVar2 = C51780f.f135862d;
                    }
                    C69664n.m101060f(fVar2, "clientOp.guiParams.targetPanel");
                    C129962m mVar = (C129962m) C129963n.f356442m.createBuilder();
                    C69664n.m101060f(mVar, "newBuilder()");
                    C69664n.m101061g(mVar, "builder");
                    C51912ds dsVar = dqVar.f136170j;
                    if (dsVar == null) {
                        dsVar = C51912ds.f136180b;
                    }
                    C69664n.m101060f(dsVar, "clientOp.smartReplies");
                    C69664n.m101061g(dsVar, "value");
                    mVar.copyOnWrite();
                    dsVar.getClass();
                    ((C129963n) mVar.instance).f356449f = dsVar;
                    C51894da daVar = dqVar.f136171k;
                    if (daVar == null) {
                        daVar = C51894da.f136125b;
                    }
                    C69664n.m101060f(daVar, "clientOp.alternativeTranslations");
                    C69664n.m101061g(daVar, "value");
                    mVar.copyOnWrite();
                    daVar.getClass();
                    ((C129963n) mVar.instance).f356450g = daVar;
                    mVar.copyOnWrite();
                    ((C129963n) mVar.instance).f356448e = false;
                    if (dqVar.f136168h) {
                        String str3 = dqVar.f136166f;
                        C69664n.m101060f(str3, "clientOp.sourceText");
                        C129975z.m212157a(str3, mVar);
                        String str4 = dqVar.f136167g;
                        C69664n.m101060f(str4, "clientOp.targetText");
                        C129975z.m212160d(str4, mVar);
                        C51782h hVar = fVar.f135865b;
                        if (hVar == null) {
                            hVar = C51782h.f135867c;
                        }
                        String str5 = hVar.f135870b;
                        C69664n.m101060f(str5, "sourcePanel.languageNameHeader.text");
                        C129975z.m212158b(str5, mVar);
                        C51782h hVar2 = fVar2.f135865b;
                        if (hVar2 == null) {
                            hVar2 = C51782h.f135867c;
                        }
                        String str6 = hVar2.f135870b;
                        C69664n.m101060f(str6, "targetPanel.languageNameHeader.text");
                        C129975z.m212162f(str6, mVar);
                        C51909dp dpVar = dqVar.f136174n;
                        if (dpVar == null) {
                            dpVar = C51909dp.f136155c;
                        }
                        String str7 = dpVar.f136158b;
                        C69664n.m101060f(str7, "clientOp.targetData.textForTts");
                        C129975z.m212161e(str7, mVar);
                        String str8 = dqVar.f136164d;
                        C69664n.m101060f(str8, "clientOp.targetLanguage");
                        C129975z.m212163g(str8, mVar);
                        String str9 = dqVar.f136163c;
                        C69664n.m101060f(str9, "clientOp.sourceLanguage");
                        C129975z.m212159c(str9, mVar);
                    } else {
                        String str10 = dqVar.f136167g;
                        C69664n.m101060f(str10, "clientOp.targetText");
                        C129975z.m212157a(str10, mVar);
                        String str11 = dqVar.f136166f;
                        C69664n.m101060f(str11, "clientOp.sourceText");
                        C129975z.m212160d(str11, mVar);
                        C51782h hVar3 = fVar2.f135865b;
                        if (hVar3 == null) {
                            hVar3 = C51782h.f135867c;
                        }
                        String str12 = hVar3.f135870b;
                        C69664n.m101060f(str12, "targetPanel.languageNameHeader.text");
                        C129975z.m212158b(str12, mVar);
                        C51782h hVar4 = fVar.f135865b;
                        if (hVar4 == null) {
                            hVar4 = C51782h.f135867c;
                        }
                        String str13 = hVar4.f135870b;
                        C69664n.m101060f(str13, "sourcePanel.languageNameHeader.text");
                        C129975z.m212162f(str13, mVar);
                        C51909dp dpVar2 = dqVar.f136173m;
                        if (dpVar2 == null) {
                            dpVar2 = C51909dp.f136155c;
                        }
                        String str14 = dpVar2.f136158b;
                        C69664n.m101060f(str14, "clientOp.sourceData.textForTts");
                        C129975z.m212161e(str14, mVar);
                        String str15 = dqVar.f136163c;
                        C69664n.m101060f(str15, "clientOp.sourceLanguage");
                        C129975z.m212163g(str15, mVar);
                        String str16 = dqVar.f136164d;
                        C69664n.m101060f(str16, "clientOp.targetLanguage");
                        C129975z.m212159c(str16, mVar);
                    }
                    C51776b bVar3 = dqVar.f136165e;
                    if (bVar3 == null) {
                        bVar3 = C51776b.f135842e;
                    }
                    C51784j jVar = bVar3.f135847d;
                    if (jVar == null) {
                        jVar = C51784j.f135871b;
                    }
                    C51782h hVar5 = jVar.f135873a;
                    if (hVar5 == null) {
                        hVar5 = C51782h.f135867c;
                    }
                    String str17 = hVar5.f135870b;
                    C69664n.m101060f(str17, "clientOp.guiParams.trigg…veTranslationsHeader.text");
                    C69664n.m101061g(str17, "value");
                    mVar.copyOnWrite();
                    C129963n nVar = (C129963n) mVar.instance;
                    str17.getClass();
                    nVar.f356444a |= 2;
                    nVar.f356455l = str17;
                    C62942bv build = mVar.build();
                    C69664n.m101060f(build, "_builder.build()");
                    C129963n nVar2 = (C129963n) build;
                    C69664n.m101061g(nVar2, "value");
                    C129944c cVar = a.f356478a;
                    cVar.copyOnWrite();
                    C129966q qVar2 = (C129966q) cVar.instance;
                    nVar2.getClass();
                    qVar2.f356470c = nVar2;
                    qVar2.f356469b = 6;
                    return a.mo109353a();
                }
            }
        }
        C62934bn builder2 = qVar.toBuilder();
        C69664n.m101060f(builder2, "this.toBuilder()");
        C129969t a2 = C69664n.m101061g((C129944c) builder2, "builder");
        C129918b a3 = C129918b.m212112a(qVar.f356473f);
        if (a3 == null) {
            a3 = C129918b.UNRECOGNIZED;
        }
        C69664n.m101060f(a3, "interpreterState.selectedMode");
        a2.mo109354b(m212134b(a3, dqVar));
        return a2.mo109353a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        if (r3 != 4) goto L_0x00f4;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129956g m212134b(com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129918b r3, com.google.assistant.p3897e.p3921j.p3926e.C51910dq r4) {
        /*
            java.lang.String r0 = "selectedMode"
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r0)
            java.lang.String r0 = "clientOp"
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r0)
            com.google.assistant.e.j.d.b r0 = r4.f136165e
            if (r0 != 0) goto L_0x0010
            com.google.assistant.e.j.d.b r0 = com.google.assistant.p3897e.p3921j.p3925d.C51776b.f135842e
        L_0x0010:
            com.google.assistant.e.j.d.f r0 = r0.f135845b
            if (r0 != 0) goto L_0x0016
            com.google.assistant.e.j.d.f r0 = com.google.assistant.p3897e.p3921j.p3925d.C51780f.f135862d
        L_0x0016:
            java.lang.String r1 = "clientOp.guiParams.sourcePanel"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
            com.google.assistant.e.j.d.b r4 = r4.f136165e
            if (r4 != 0) goto L_0x0021
            com.google.assistant.e.j.d.b r4 = com.google.assistant.p3897e.p3921j.p3925d.C51776b.f135842e
        L_0x0021:
            com.google.assistant.e.j.d.f r4 = r4.f135846c
            if (r4 != 0) goto L_0x0027
            com.google.assistant.e.j.d.f r4 = com.google.assistant.p3897e.p3921j.p3925d.C51780f.f135862d
        L_0x0027:
            java.lang.String r1 = "clientOp.guiParams.targetPanel"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r1)
            com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.g r1 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129956g.f356423c
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.f r1 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129955f) r1
            java.lang.String r2 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            java.lang.String r2 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r2)
            com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.b r2 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129918b.MODE_NOT_SELECTED
            int r3 = r3.ordinal()
            if (r3 == 0) goto L_0x00dc
            r2 = 1
            if (r3 == r2) goto L_0x00af
            r2 = 2
            if (r3 == r2) goto L_0x0082
            r2 = 3
            if (r3 == r2) goto L_0x0054
            r4 = 4
            if (r3 == r4) goto L_0x00dc
            goto L_0x00f4
        L_0x0054:
            com.google.assistant.e.j.d.d r3 = r0.f135866c
            if (r3 != 0) goto L_0x005a
            com.google.assistant.e.j.d.d r3 = com.google.assistant.p3897e.p3921j.p3925d.C51778d.f135848m
        L_0x005a:
            com.google.assistant.e.j.d.h r3 = r3.f135858i
            if (r3 != 0) goto L_0x0060
            com.google.assistant.e.j.d.h r3 = com.google.assistant.p3897e.p3921j.p3925d.C51782h.f135867c
        L_0x0060:
            java.lang.String r3 = r3.f135870b
            java.lang.String r0 = "sourcePanel.messages.pho…KeyboardStartupIntro.text"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r0)
            com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129970u.m212150a(r3, r1)
            com.google.assistant.e.j.d.d r3 = r4.f135866c
            if (r3 != 0) goto L_0x0070
            com.google.assistant.e.j.d.d r3 = com.google.assistant.p3897e.p3921j.p3925d.C51778d.f135848m
        L_0x0070:
            com.google.assistant.e.j.d.h r3 = r3.f135858i
            if (r3 != 0) goto L_0x0076
            com.google.assistant.e.j.d.h r3 = com.google.assistant.p3897e.p3921j.p3925d.C51782h.f135867c
        L_0x0076:
            java.lang.String r3 = r3.f135870b
            java.lang.String r4 = "targetPanel.messages.pho…KeyboardStartupIntro.text"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r4)
            com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129970u.m212151b(r3, r1)
            goto L_0x00f4
        L_0x0082:
            com.google.assistant.e.j.d.d r3 = r0.f135866c
            if (r3 != 0) goto L_0x0088
            com.google.assistant.e.j.d.d r3 = com.google.assistant.p3897e.p3921j.p3925d.C51778d.f135848m
        L_0x0088:
            com.google.assistant.e.j.d.h r3 = r3.f135859j
            if (r3 != 0) goto L_0x008e
            com.google.assistant.e.j.d.h r3 = com.google.assistant.p3897e.p3921j.p3925d.C51782h.f135867c
        L_0x008e:
            java.lang.String r3 = r3.f135870b
            java.lang.String r0 = "sourcePanel.messages.phoneManualStartupIntro.text"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r0)
            com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129970u.m212150a(r3, r1)
            com.google.assistant.e.j.d.d r3 = r4.f135866c
            if (r3 != 0) goto L_0x009e
            com.google.assistant.e.j.d.d r3 = com.google.assistant.p3897e.p3921j.p3925d.C51778d.f135848m
        L_0x009e:
            com.google.assistant.e.j.d.h r3 = r3.f135859j
            if (r3 != 0) goto L_0x00a4
            com.google.assistant.e.j.d.h r3 = com.google.assistant.p3897e.p3921j.p3925d.C51782h.f135867c
        L_0x00a4:
            java.lang.String r3 = r3.f135870b
            java.lang.String r4 = "targetPanel.messages.phoneManualStartupIntro.text"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r4)
            com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129970u.m212151b(r3, r1)
            goto L_0x00f4
        L_0x00af:
            com.google.assistant.e.j.d.d r3 = r0.f135866c
            if (r3 != 0) goto L_0x00b5
            com.google.assistant.e.j.d.d r3 = com.google.assistant.p3897e.p3921j.p3925d.C51778d.f135848m
        L_0x00b5:
            com.google.assistant.e.j.d.h r3 = r3.f135854e
            if (r3 != 0) goto L_0x00bb
            com.google.assistant.e.j.d.h r3 = com.google.assistant.p3897e.p3921j.p3925d.C51782h.f135867c
        L_0x00bb:
            java.lang.String r3 = r3.f135870b
            java.lang.String r0 = "sourcePanel.messages.phoneStartupIntro.text"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r0)
            com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129970u.m212150a(r3, r1)
            com.google.assistant.e.j.d.d r3 = r4.f135866c
            if (r3 != 0) goto L_0x00cb
            com.google.assistant.e.j.d.d r3 = com.google.assistant.p3897e.p3921j.p3925d.C51778d.f135848m
        L_0x00cb:
            com.google.assistant.e.j.d.h r3 = r3.f135854e
            if (r3 != 0) goto L_0x00d1
            com.google.assistant.e.j.d.h r3 = com.google.assistant.p3897e.p3921j.p3925d.C51782h.f135867c
        L_0x00d1:
            java.lang.String r3 = r3.f135870b
            java.lang.String r4 = "targetPanel.messages.phoneStartupIntro.text"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r4)
            com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129970u.m212151b(r3, r1)
            goto L_0x00f4
        L_0x00dc:
            com.google.common.f.e r3 = f356413a
            com.google.common.f.x r3 = r3.mo56226d()
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            com.google.common.f.n r4 = new com.google.common.f.n
            r0 = 38628(0x96e4, float:5.413E-41)
            r4.<init>(r0)
            r3.mo56379ah(r4)
            java.lang.String r4 = "Invalid mode found. Ignoring."
            r3.mo56386p(r4)
        L_0x00f4:
            com.google.protobuf.bv r3 = r1.build()
            java.lang.String r4 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r4)
            com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.g r3 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129956g) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.p9863c.C129946b.m212134b(com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.b, com.google.assistant.e.j.e.dq):com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.g");
    }

    /* renamed from: c */
    public static final C129965p m212135c(C51910dq dqVar) {
        C69664n.m101061g(dqVar, "clientOp");
        C129964o oVar = (C129964o) C129965p.f356456i.createBuilder();
        C69664n.m101060f(oVar, "newBuilder()");
        C129893ab a = C69664n.m101061g(oVar, "builder");
        C51776b bVar = dqVar.f136165e;
        if (bVar == null) {
            bVar = C51776b.f135842e;
        }
        C51780f fVar = bVar.f135845b;
        if (fVar == null) {
            fVar = C51780f.f135862d;
        }
        C51778d dVar = fVar.f135866c;
        if (dVar == null) {
            dVar = C51778d.f135848m;
        }
        C51782h hVar = dVar.f135851b;
        if (hVar == null) {
            hVar = C51782h.f135867c;
        }
        String str = hVar.f135870b;
        C69664n.m101060f(str, "clientOp.guiParams.sourc…nel.messages.waiting.text");
        a.mo109332e(str);
        C51776b bVar2 = dqVar.f136165e;
        if (bVar2 == null) {
            bVar2 = C51776b.f135842e;
        }
        C51780f fVar2 = bVar2.f135846c;
        if (fVar2 == null) {
            fVar2 = C51780f.f135862d;
        }
        C51778d dVar2 = fVar2.f135866c;
        if (dVar2 == null) {
            dVar2 = C51778d.f135848m;
        }
        C51782h hVar2 = dVar2.f135851b;
        if (hVar2 == null) {
            hVar2 = C51782h.f135867c;
        }
        String str2 = hVar2.f135870b;
        C69664n.m101060f(str2, "clientOp.guiParams.targe…nel.messages.waiting.text");
        C69664n.m101061g(str2, "value");
        C129964o oVar2 = a.f356324a;
        oVar2.copyOnWrite();
        str2.getClass();
        ((C129965p) oVar2.instance).f356460c = str2;
        return a.mo109328a();
    }
}
