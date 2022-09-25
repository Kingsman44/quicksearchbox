package com.google.android.apps.gsa.staticplugins.offline.p8167b;

import com.google.android.apps.gsa.g.c.b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6604bo.C84917a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.staticplugins.offline.p8167b.p8168a.C105873n;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.speech.grammar.pumpkin.C66525q;
import com.google.speech.grammar.pumpkin.C66527s;

/* renamed from: com.google.android.apps.gsa.staticplugins.offline.b.a */
/* compiled from: PG */
public final class C105859a extends C86734a implements C84917a {

    /* renamed from: a */
    private final C105873n f295462a;

    /* renamed from: b */
    private final b f295463b;

    /* renamed from: c */
    private final C86124t f295464c;

    public C105859a(C105873n nVar, b bVar, C86124t tVar) {
        super(C118575h.WORKER_OFFLINE_PHONE_ACTION, "offlinephoneaction");
        this.f295462a = nVar;
        this.f295463b = bVar;
        this.f295464c = tVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: com.google.assistant.e.j.ka} */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b4, code lost:
        if ("ActivateInterpreter".equals(r6.f295463b.c) != false) goto L_0x00b6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo78585a(com.google.android.apps.gsa.g.f.b r7, com.google.android.apps.gsa.shared.search.Query r8) {
        /*
            r6 = this;
            com.google.android.apps.gsa.search.core.i.t r0 = r6.f295464c
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90042cu.f248705f
            boolean r0 = r0.mo79746e(r1)
            if (r0 == 0) goto L_0x00c1
            com.google.android.speech.embedded.TaggerResult r0 = r7.c
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = r0.f118518a
            goto L_0x0015
        L_0x0011:
            com.google.android.apps.gsa.g.c.b r0 = r6.f295463b
            java.lang.String r0 = r0.c
        L_0x0015:
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r1 = "ActivateInterpreter"
            boolean r2 = r1.equals(r0)
            if (r2 != 0) goto L_0x0027
            java.lang.String r2 = "ActivateInterpreterFollowOn"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x002d
        L_0x0027:
            com.google.speech.grammar.pumpkin.q r0 = m176351c(r7, r0)
            if (r0 != 0) goto L_0x00b6
        L_0x002d:
            java.lang.String r0 = "android.opa.extra.CONVERSATION_DELTA"
            boolean r0 = r8.mo84364bx(r0)
            if (r0 != 0) goto L_0x0037
            goto L_0x00ac
        L_0x0037:
            byte[] r0 = r8.mo84439dT()     // Catch:{ ct -> 0x00ab }
            com.google.protobuf.ba r2 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x00ab }
            com.google.assistant.e.j.en r3 = com.google.assistant.p3897e.p3921j.C52081en.f136679i     // Catch:{ ct -> 0x00ab }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r3, (byte[]) r0, (com.google.protobuf.C62921ba) r2)     // Catch:{ ct -> 0x00ab }
            com.google.assistant.e.j.en r0 = (com.google.assistant.p3897e.p3921j.C52081en) r0     // Catch:{ ct -> 0x00ab }
            com.google.protobuf.cq r0 = r0.f136684d     // Catch:{ ct -> 0x00ab }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ ct -> 0x00ab }
        L_0x004d:
            boolean r2 = r0.hasNext()     // Catch:{ ct -> 0x00ab }
            if (r2 == 0) goto L_0x00ac
            java.lang.Object r2 = r0.next()     // Catch:{ ct -> 0x00ab }
            com.google.assistant.e.j.ep r2 = (com.google.assistant.p3897e.p3921j.C52083ep) r2     // Catch:{ ct -> 0x00ab }
            int r3 = r2.f136692b     // Catch:{ ct -> 0x00ab }
            r4 = 3
            if (r3 != r4) goto L_0x0063
            java.lang.Object r2 = r2.f136693c     // Catch:{ ct -> 0x00ab }
            com.google.assistant.e.j.ek r2 = (com.google.assistant.p3897e.p3921j.C52078ek) r2     // Catch:{ ct -> 0x00ab }
            goto L_0x0065
        L_0x0063:
            com.google.assistant.e.j.ek r2 = com.google.assistant.p3897e.p3921j.C52078ek.f136671f     // Catch:{ ct -> 0x00ab }
        L_0x0065:
            int r3 = r2.f136674b     // Catch:{ ct -> 0x00ab }
            r4 = 5
            if (r3 != r4) goto L_0x006f
            java.lang.Object r2 = r2.f136675c     // Catch:{ ct -> 0x00ab }
            com.google.assistant.e.j.du r2 = (com.google.assistant.p3897e.p3921j.C51805du) r2     // Catch:{ ct -> 0x00ab }
            goto L_0x0071
        L_0x006f:
            com.google.assistant.e.j.du r2 = com.google.assistant.p3897e.p3921j.C51805du.f135924e     // Catch:{ ct -> 0x00ab }
        L_0x0071:
            java.lang.String r3 = "intent_input"
            com.google.assistant.e.j.ka r4 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d     // Catch:{ ct -> 0x00ab }
            com.google.protobuf.dn r2 = r2.f135929d     // Catch:{ ct -> 0x00ab }
            boolean r5 = r2.containsKey(r3)     // Catch:{ ct -> 0x00ab }
            if (r5 == 0) goto L_0x0084
            java.lang.Object r2 = r2.get(r3)     // Catch:{ ct -> 0x00ab }
            r4 = r2
            com.google.assistant.e.j.ka r4 = (com.google.assistant.p3897e.p3921j.C52230ka) r4     // Catch:{ ct -> 0x00ab }
        L_0x0084:
            com.google.protobuf.z r2 = r4.f137061c     // Catch:{ ct -> 0x00ab }
            com.google.protobuf.ba r3 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x00ab }
            com.google.assistant.e.j.hd r4 = com.google.assistant.p3897e.p3921j.C52152hd.f136850c     // Catch:{ ct -> 0x00ab }
            com.google.protobuf.bv r2 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r4, (com.google.protobuf.C63088z) r2, (com.google.protobuf.C62921ba) r3)     // Catch:{ ct -> 0x00ab }
            com.google.assistant.e.j.hd r2 = (com.google.assistant.p3897e.p3921j.C52152hd) r2     // Catch:{ ct -> 0x00ab }
            com.google.protobuf.z r2 = r2.f136853b     // Catch:{ ct -> 0x00ab }
            com.google.protobuf.ba r3 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x00ab }
            com.google.knowledge.a.a.n r4 = com.google.knowledge.p4661a.p4662a.C61752n.f166808f     // Catch:{ ct -> 0x00ab }
            com.google.protobuf.bv r2 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r4, (com.google.protobuf.C63088z) r2, (com.google.protobuf.C62921ba) r3)     // Catch:{ ct -> 0x00ab }
            com.google.knowledge.a.a.n r2 = (com.google.knowledge.p4661a.p4662a.C61752n) r2     // Catch:{ ct -> 0x00ab }
            java.lang.String r2 = r2.f166811b     // Catch:{ ct -> 0x00ab }
            java.lang.String r3 = "Activate_interpreter"
            boolean r2 = r2.equals(r3)     // Catch:{ ct -> 0x00ab }
            if (r2 == 0) goto L_0x004d
            goto L_0x00b6
        L_0x00ab:
        L_0x00ac:
            com.google.android.apps.gsa.g.c.b r0 = r6.f295463b
            java.lang.String r0 = r0.c
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00c1
        L_0x00b6:
            com.google.android.apps.gsa.staticplugins.offline.b.a.n r0 = r6.f295462a
            com.google.speech.grammar.pumpkin.q r7 = m176351c(r7, r1)
            com.google.common.util.concurrent.cx r7 = r0.mo95124b(r7, r8)
            return r7
        L_0x00c1:
            com.google.common.base.b r7 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60856cj.m92900i(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.offline.p8167b.C105859a.mo78585a(com.google.android.apps.gsa.g.f.b, com.google.android.apps.gsa.shared.search.Query):com.google.common.util.concurrent.cx");
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }

    /* renamed from: c */
    private static C66525q m176351c(com.google.android.apps.gsa.g.f.b bVar, String str) {
        if (bVar.b != 1) {
            C58976aa aaVar = C58975e.f156826a;
            return null;
        }
        C66527s sVar = bVar.e;
        if (sVar == null || sVar.f180939a.size() <= 0) {
            C58976aa aaVar2 = C58975e.f156826a;
            return null;
        }
        C66527s sVar2 = bVar.e;
        sVar2.getClass();
        for (C66525q qVar : sVar2.f180939a) {
            if (str.equals(qVar.f180932b)) {
                return qVar;
            }
        }
        return null;
    }
}
