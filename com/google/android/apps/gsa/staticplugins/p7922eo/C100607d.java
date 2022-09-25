package com.google.android.apps.gsa.staticplugins.p7922eo;

import com.google.android.apps.gsa.g.c.b;
import com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84570aa;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.assistant.auto.tng.p1028l.C13750bc;
import com.google.android.libraries.assistant.auto.tng.p1028l.C13751bd;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.eo.d */
/* compiled from: PG */
public final class C100607d {

    /* renamed from: a */
    public static final C59071e f281319a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.eo.d");

    /* renamed from: a */
    public static int m166731a(Query query, C90021c cVar) {
        return ((cVar.mo79746e(C90086ek.f250499el) || cVar.mo79746e(C90086ek.f250502eo)) && query.mo84412cs()) ? 14 : 2;
    }

    /* renamed from: b */
    public static int m166732b(Query query, C90021c cVar) {
        if ((cVar.mo79746e(C90086ek.f250501en) || cVar.mo79746e(C90086ek.f250504eq)) && query.mo84412cs()) {
            return 13;
        }
        return query.mo84434dO() ? 7 : 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0091, code lost:
        if ("ActivateInterpreter".equals(r3.f118518a) != false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009d, code lost:
        if (r0.mo81663y(r10.mo84326bK()) != false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x015d, code lost:
        if (r11.contains("morris") != false) goto L_0x01a1;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.common.util.concurrent.C60870cx m166733c(com.google.android.apps.gsa.shared.p6968aa.C89061q r5, com.google.android.libraries.gsa.p1876k.C22871g r6, com.google.android.apps.gsa.shared.p7066m.C90021c r7, java.lang.String r8, boolean r9, com.google.android.apps.gsa.shared.search.Query r10, dagger.C68214a r11, com.google.android.apps.gsa.g.c.b r12) {
        /*
            boolean r0 = r10.mo84437dR()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000c
            if (r9 == 0) goto L_0x000c
            r9 = 1
            goto L_0x000d
        L_0x000c:
            r9 = 0
        L_0x000d:
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247088aZ
            boolean r0 = r7.mo79746e(r0)
            if (r0 == 0) goto L_0x0027
            boolean r0 = r10.mo84327bL()
            if (r0 != 0) goto L_0x001c
            goto L_0x0027
        L_0x001c:
            r5 = 15
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            com.google.common.util.concurrent.cx r5 = com.google.common.util.concurrent.C60856cj.m92900i(r5)
            return r5
        L_0x0027:
            boolean r0 = r10.mo84386cS()
            if (r0 != 0) goto L_0x0054
            if (r9 != 0) goto L_0x0047
            com.google.common.f.e r5 = f281319a
            com.google.common.f.x r5 = r5.mo56224b()
            java.lang.String r6 = "Use SpeechieMode PUSH_TO_TALK, offline not supported"
            r7 = 33664(0x8380, float:4.7173E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r7)).mo56386p(r6)
            r5 = 4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            com.google.common.util.concurrent.cx r5 = com.google.common.util.concurrent.C60856cj.m92900i(r5)
            goto L_0x0053
        L_0x0047:
            com.google.common.util.concurrent.cx r5 = r5.mo27435e()
            java.lang.String r7 = "get connectivity info for deciding Push-To-Talk mode"
            com.google.android.apps.gsa.staticplugins.eo.c r8 = com.google.android.apps.gsa.staticplugins.p7922eo.C100606c.f281318a
            com.google.common.util.concurrent.cx r5 = r6.mo28209i(r5, r7, r8)
        L_0x0053:
            return r5
        L_0x0054:
            boolean r0 = r10.mo84412cs()
            if (r0 != 0) goto L_0x0060
            boolean r0 = r10.mo84434dO()
            if (r0 == 0) goto L_0x0113
        L_0x0060:
            java.lang.Object r0 = r11.mo27525b()
            com.google.android.apps.gsa.search.shared.d.c r0 = (com.google.android.apps.gsa.search.shared.p6926d.C87541c) r0
            com.google.android.speech.embedded.TaggerResult r3 = r12.a
            boolean r4 = r10.mo84412cs()
            if (r4 == 0) goto L_0x0081
            if (r3 != 0) goto L_0x00a1
            boolean r3 = r10.mo84338bW()
            r4 = 0
            if (r3 == 0) goto L_0x0080
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250344bP
            boolean r3 = r7.mo79746e(r3)
            if (r3 == 0) goto L_0x0080
            goto L_0x00a1
        L_0x0080:
            r3 = r4
        L_0x0081:
            boolean r4 = r10.mo84434dO()
            if (r4 == 0) goto L_0x0093
            if (r3 == 0) goto L_0x0093
            java.lang.String r4 = "ActivateInterpreter"
            java.lang.String r3 = r3.f118518a
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x00a1
        L_0x0093:
            if (r0 == 0) goto L_0x0113
            boolean r3 = r10.mo84326bK()
            boolean r0 = r0.mo81663y(r3)
            if (r0 != 0) goto L_0x00a1
            goto L_0x0113
        L_0x00a1:
            java.lang.Object r5 = r11.mo27525b()
            com.google.android.apps.gsa.search.shared.d.c r5 = (com.google.android.apps.gsa.search.shared.p6926d.C87541c) r5
            boolean r6 = r10.mo84412cs()
            if (r6 == 0) goto L_0x00c9
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250351bW
            boolean r6 = r7.mo79746e(r6)
            if (r6 == 0) goto L_0x00c9
            com.google.android.speech.embedded.TaggerResult r5 = r5.mo81647i()
            if (r5 != 0) goto L_0x00d4
            int r5 = r12.e
            r6 = 3
            if (r5 == r6) goto L_0x00d4
            if (r5 != r1) goto L_0x00d5
            boolean r5 = r12.f()
            if (r5 == 0) goto L_0x00d5
            goto L_0x00d4
        L_0x00c9:
            com.google.android.speech.embedded.TaggerResult r5 = r5.mo81647i()
            if (r5 != 0) goto L_0x00d4
            com.google.android.speech.embedded.TaggerResult r5 = r12.a
            if (r5 != 0) goto L_0x00d4
            goto L_0x00d5
        L_0x00d4:
            r1 = 0
        L_0x00d5:
            if (r1 == 0) goto L_0x00ea
            int r5 = m166732b(r10, r7)
            com.google.common.f.e r6 = f281319a
            com.google.common.f.x r6 = r6.mo56224b()
            java.lang.String r7 = "Use SpeechieMode %d network follow-on query"
            r8 = 33663(0x837f, float:4.7172E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r8)).mo56387q(r7, r5)
            goto L_0x00fc
        L_0x00ea:
            int r5 = m166731a(r10, r7)
            com.google.common.f.e r6 = f281319a
            com.google.common.f.x r6 = r6.mo56224b()
            java.lang.String r7 = "Use SpeechieMode %d embedded for follow-on query"
            r8 = 33662(0x837e, float:4.717E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r8)).mo56387q(r7, r5)
        L_0x00fc:
            com.google.common.f.e r6 = f281319a
            com.google.common.f.x r6 = r6.mo56224b()
            java.lang.String r7 = "Use SpeechieMode %d for follow-on"
            r8 = 33665(0x8381, float:4.7175E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r8)).mo56387q(r7, r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            com.google.common.util.concurrent.cx r5 = com.google.common.util.concurrent.C60856cj.m92900i(r5)
            return r5
        L_0x0113:
            com.google.android.apps.gsa.shared.m.d r11 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249917ag
            boolean r11 = r7.mo79746e(r11)
            if (r11 == 0) goto L_0x0135
            boolean r11 = r10.mo84420dA()
            if (r11 == 0) goto L_0x0135
            boolean r11 = r10.mo84434dO()
            if (r11 != 0) goto L_0x0135
            boolean r11 = r10.mo84412cs()
            if (r11 != 0) goto L_0x0135
            r8 = 16
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x01a5
        L_0x0135:
            if (r9 == 0) goto L_0x01a1
            com.google.android.apps.gsa.shared.m.d r11 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f250008cR
            boolean r11 = r7.mo79746e(r11)
            if (r11 == 0) goto L_0x01a1
            com.google.android.apps.gsa.shared.m.d r11 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248860bO
            boolean r11 = r7.mo79746e(r11)
            r10.mo84355bn()
            if (r11 == 0) goto L_0x0160
            java.lang.String r11 = r10.mo84355bn()
            if (r11 == 0) goto L_0x0160
            java.lang.String r11 = r10.mo84355bn()
            r11.getClass()
            java.lang.String r12 = "morris"
            boolean r11 = r11.contains(r12)
            if (r11 == 0) goto L_0x0160
            goto L_0x01a1
        L_0x0160:
            boolean r11 = r10.mo84326bK()
            if (r11 != 0) goto L_0x01a1
            com.google.android.apps.gsa.shared.m.h r11 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f250007cQ
            com.google.common.b.gu r11 = r7.mo79745c(r11)
            boolean r8 = r11.contains(r8)
            if (r8 == 0) goto L_0x01a1
            com.google.android.apps.gsa.shared.m.d r8 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250500em
            boolean r8 = r7.mo79746e(r8)
            if (r8 != 0) goto L_0x0182
            com.google.android.apps.gsa.shared.m.d r8 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250503ep
            boolean r8 = r7.mo79746e(r8)
            if (r8 == 0) goto L_0x018b
        L_0x0182:
            boolean r8 = r10.mo84412cs()
            if (r8 == 0) goto L_0x018b
            r2 = 12
            goto L_0x019c
        L_0x018b:
            boolean r8 = r10.mo84434dO()
            if (r8 == 0) goto L_0x0194
            r2 = 9
            goto L_0x019c
        L_0x0194:
            boolean r8 = m166735e(r10)
            if (r8 == 0) goto L_0x019b
            goto L_0x019c
        L_0x019b:
            r2 = 5
        L_0x019c:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            goto L_0x01a5
        L_0x01a1:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
        L_0x01a5:
            int r8 = r8.intValue()
            if (r8 == 0) goto L_0x01b4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            com.google.common.util.concurrent.cx r5 = com.google.common.util.concurrent.C60856cj.m92900i(r5)
            return r5
        L_0x01b4:
            com.google.common.util.concurrent.cx r5 = r5.mo27435e()
            com.google.android.apps.gsa.staticplugins.eo.a r8 = new com.google.android.apps.gsa.staticplugins.eo.a
            r8.<init>(r10, r7, r9)
            java.lang.String r7 = "get connectivity info for getNonHybridSpeechieMode"
            com.google.common.util.concurrent.cx r5 = r6.mo28209i(r5, r7, r8)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7922eo.C100607d.m166733c(com.google.android.apps.gsa.shared.aa.q, com.google.android.libraries.gsa.k.g, com.google.android.apps.gsa.shared.m.c, java.lang.String, boolean, com.google.android.apps.gsa.shared.search.Query, dagger.a, com.google.android.apps.gsa.g.c.b):com.google.common.util.concurrent.cx");
    }

    /* renamed from: d */
    public static C60870cx m166734d(C89061q qVar, C22871g gVar, C86124t tVar, boolean z, C89994f fVar, Query query, C68214a aVar, C68214a aVar2, b bVar) {
        String str;
        int i;
        C86124t tVar2 = tVar;
        Query query2 = query;
        Integer num = 0;
        if (query.mo84412cs()) {
            C13751bd bdVar = (C13751bd) tVar.mo79754t(C90086ek.f250406cY, C13751bd.f41927b.getParserForType());
            if (bdVar != null) {
                C13750bc bcVar = C13750bc.UNSPECIFIED;
                C13750bc a = C13750bc.m29999a(bdVar.f41929a);
                if (a == null) {
                    a = C13750bc.UNSPECIFIED;
                }
                int ordinal = a.ordinal();
                if (ordinal == 1) {
                    i = 14;
                } else if (ordinal == 2) {
                    i = 13;
                }
                num = Integer.valueOf(i);
            }
        } else if (fVar.mo83874aK()) {
            num = Integer.valueOf(query.mo84386cS() ? m166732b(query, tVar) : 4);
        } else if (fVar.mo83872aI()) {
            num = Integer.valueOf(query.mo84386cS() ? m166731a(query, tVar) : 6);
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            ((C59052c) ((C59052c) f281319a.mo56224b()).mo56372aa(33666)).mo56387q("Use SpeechieMode %d for debug", intValue);
            return C60856cj.m92900i(Integer.valueOf(intValue));
        }
        if (query.mo84434dO()) {
            str = fVar.mo83863Z();
        } else {
            str = fVar.mo83885ae();
        }
        String str2 = str;
        boolean z2 = z;
        boolean f = C84570aa.m135301f(tVar, z, str2);
        if (!tVar.mo79746e(C90014bt.f247222dA) || !f || !query.mo84420dA() || !query.mo84403cj() || query.mo84412cs() || query.mo84324bI() || query.mo84337bV()) {
            C22871g gVar2 = gVar;
            return m166733c(qVar, gVar, tVar, str2, f, query, aVar, bVar);
        }
        C22871g gVar3 = gVar;
        return gVar.mo28210j(((C89037bh) aVar2.mo27525b()).mo27378c(), "Check network type", new C100598b(tVar, query, qVar, gVar, str2, aVar, bVar));
    }

    /* renamed from: e */
    public static boolean m166735e(Query query) {
        return !query.mo84412cs() && !query.mo84434dO();
    }
}
