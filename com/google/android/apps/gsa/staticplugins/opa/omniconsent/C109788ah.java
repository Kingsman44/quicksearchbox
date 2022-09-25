package com.google.android.apps.gsa.staticplugins.opa.omniconsent;

import com.google.android.apps.gsa.opaonboarding.C83870ad;
import com.google.android.apps.gsa.opaonboarding.C83884ar;
import com.google.android.apps.gsa.opaonboarding.C83885as;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84026u;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8402a.C109779k;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8402a.C109780l;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.omniconsent.ah */
/* compiled from: PG */
public final class C109788ah extends C83870ad implements C83885as {

    /* renamed from: b */
    private static final C59071e f305913b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.omniconsent.ah");

    /* renamed from: a */
    public C109800at f305914a;

    /* renamed from: c */
    private final C84026u f305915c;

    /* renamed from: d */
    private final C109782ab f305916d;

    /* renamed from: e */
    private final C109790aj f305917e;

    /* renamed from: f */
    private final C83893b f305918f;

    /* renamed from: g */
    private final C109801au f305919g;

    /* renamed from: h */
    private final C109822r f305920h;

    /* renamed from: i */
    private final C69464a f305921i;

    /* renamed from: j */
    private final C69464a f305922j;

    /* renamed from: k */
    private final C69464a f305923k;

    /* renamed from: l */
    private final C69464a f305924l;

    /* renamed from: m */
    private final C83884ar f305925m;

    /* renamed from: n */
    private C109787ag f305926n = new C109787ag(1, C58836b.f156633a);

    /* renamed from: o */
    private C60870cx f305927o;

    /* renamed from: p */
    private C109785ae f305928p;

    public C109788ah(C84026u uVar, C109782ab abVar, C109790aj ajVar, C83893b bVar, C109801au auVar, C109822r rVar, C69464a aVar, C69464a aVar2, C69464a aVar3, C69464a aVar4, C83884ar arVar) {
        this.f305915c = uVar;
        this.f305916d = abVar;
        this.f305917e = ajVar;
        this.f305918f = bVar;
        this.f305919g = auVar;
        this.f305920h = rVar;
        this.f305921i = aVar;
        this.f305922j = aVar2;
        this.f305923k = aVar3;
        this.f305924l = aVar4;
        this.f305925m = arVar;
    }

    /* renamed from: b */
    private final C109780l m182811b(C58833ax axVar) {
        if (!axVar.mo56113h()) {
            return C109780l.f305895d;
        }
        String str = (String) axVar.mo56107c();
        C109779k kVar = (C109779k) C109780l.f305895d.createBuilder();
        kVar.copyOnWrite();
        C109780l lVar = (C109780l) kVar.instance;
        str.getClass();
        lVar.f305897a |= 1;
        lVar.f305898b = str;
        if (this.f305925m.mo77260e().mo56113h()) {
            String str2 = (String) this.f305925m.mo77260e().mo56107c();
            kVar.copyOnWrite();
            C109780l lVar2 = (C109780l) kVar.instance;
            str2.getClass();
            lVar2.f305897a |= 2;
            lVar2.f305899c = str2;
        }
        return (C109780l) kVar.build();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02ca, code lost:
        if (r1.f305940b.mo100634n() == false) goto L_0x02cc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x033d  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0478  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x011c  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.base.C58833ax mo77210d() {
        /*
            r28 = this;
            r0 = r28
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.ag r1 = r0.f305926n
            int r1 = r1.f305912b
            int r1 = r1 + -1
            r2 = 0
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L_0x04ce
            java.lang.String r7 = " flowId"
            java.lang.String r8 = "Missing required properties:"
            java.lang.String r9 = " omniconsentScope"
            java.lang.String r10 = " consentUi"
            r11 = 5
            if (r1 == r6) goto L_0x014d
            if (r1 == r5) goto L_0x0040
            if (r1 == r4) goto L_0x003a
            if (r1 == r3) goto L_0x04ce
            if (r1 != r11) goto L_0x0026
            goto L_0x04ce
        L_0x0026:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Unknown SequenceState: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x003a:
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.ag r1 = com.google.android.apps.gsa.staticplugins.opa.omniconsent.C109787ag.m182809a()
            goto L_0x05f4
        L_0x0040:
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.a r1 = new com.google.android.apps.gsa.staticplugins.opa.omniconsent.a
            r1.<init>()
            r1.mo98105b(r6)
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.a.l r2 = com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8402a.C109780l.f305895d
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)
            r1.f305847c = r2
            com.google.assistant.at.ud r2 = com.google.assistant.p3861at.C50359ud.f131080h
            r1.mo98104a(r2)
            r1.mo98107d(r5)
            r1.mo98106c(r6)
            com.google.android.apps.gsa.opaonboarding.ar r2 = r0.f305925m
            boolean r2 = r2.mo77263h()
            r1.mo98105b(r2)
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.ae r2 = r0.f305928p
            com.google.assistant.at.ug r2 = r2.mo98113a()
            com.google.assistant.at.ud r2 = r2.f131100c
            if (r2 != 0) goto L_0x0070
            com.google.assistant.at.ud r2 = com.google.assistant.p3861at.C50359ud.f131080h
        L_0x0070:
            r1.mo98104a(r2)
            com.google.android.apps.gsa.opaonboarding.ar r2 = r0.f305925m
            boolean r2 = r2.mo77265j()
            if (r2 == 0) goto L_0x0094
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.at r2 = r0.f305914a
            r2.getClass()
            boolean r2 = r2.f305955g
            if (r2 != 0) goto L_0x0085
            goto L_0x0094
        L_0x0085:
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.ae r2 = r0.f305928p
            com.google.common.base.ax r2 = r2.mo98115c()
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.a.l r2 = r0.m182811b(r2)
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)
            goto L_0x0096
        L_0x0094:
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a
        L_0x0096:
            r1.f305847c = r2
            com.google.android.apps.gsa.opaonboarding.ar r2 = r0.f305925m
            int r2 = r2.mo77266k()
            r1.mo98107d(r2)
            com.google.android.apps.gsa.opaonboarding.ar r2 = r0.f305925m
            int r2 = r2.mo77268m()
            r1.mo98106c(r2)
            byte r2 = r1.f305848d
            if (r2 != r6) goto L_0x011c
            com.google.assistant.at.ud r13 = r1.f305846b
            if (r13 == 0) goto L_0x011c
            int r15 = r1.f305849e
            if (r15 == 0) goto L_0x011c
            int r2 = r1.f305850f
            if (r2 != 0) goto L_0x00bb
            goto L_0x011c
        L_0x00bb:
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.b r17 = new com.google.android.apps.gsa.staticplugins.opa.omniconsent.b
            boolean r12 = r1.f305845a
            com.google.common.base.ax r14 = r1.f305847c
            r11 = r17
            r16 = r2
            r11.<init>(r12, r13, r14, r15, r16)
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.r r1 = r0.f305920h
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.q r2 = new com.google.android.apps.gsa.staticplugins.opa.omniconsent.q
            g.a.a r4 = r1.f306045a
            java.lang.Object r4 = r4.mo17428b()
            r18 = r4
            com.google.android.apps.gsa.opaonboarding.b r18 = (com.google.android.apps.gsa.opaonboarding.C83893b) r18
            r18.getClass()
            g.a.a r4 = r1.f306046b
            java.lang.Object r4 = r4.mo17428b()
            r19 = r4
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.aj r19 = (com.google.android.apps.gsa.staticplugins.opa.omniconsent.C109790aj) r19
            r19.getClass()
            g.a.a r4 = r1.f306047c
            g.a.a r5 = r1.f306048d
            java.lang.Object r5 = r5.mo17428b()
            r21 = r5
            android.content.res.Resources r21 = (android.content.res.Resources) r21
            r21.getClass()
            g.a.a r5 = r1.f306049e
            java.lang.Object r5 = r5.mo17428b()
            r22 = r5
            com.google.android.apps.gsa.shared.util.v r22 = (com.google.android.apps.gsa.shared.util.C91123v) r22
            r22.getClass()
            g.a.a r1 = r1.f306050f
            java.lang.Object r1 = r1.mo17428b()
            r23 = r1
            com.google.android.apps.gsa.shared.m.c r23 = (com.google.android.apps.gsa.shared.p7066m.C90021c) r23
            r23.getClass()
            r16 = r2
            r20 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.ag r1 = com.google.android.apps.gsa.staticplugins.opa.omniconsent.C109787ag.m182810b(r3, r2)
            goto L_0x05f4
        L_0x011c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            byte r3 = r1.f305848d
            if (r3 != 0) goto L_0x012a
            java.lang.String r3 = " shouldShowDisclosures"
            r2.append(r3)
        L_0x012a:
            com.google.assistant.at.ud r3 = r1.f305846b
            if (r3 != 0) goto L_0x0131
            r2.append(r10)
        L_0x0131:
            int r3 = r1.f305849e
            if (r3 != 0) goto L_0x0138
            r2.append(r9)
        L_0x0138:
            int r1 = r1.f305850f
            if (r1 != 0) goto L_0x013f
            r2.append(r7)
        L_0x013f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r8.concat(r2)
            r1.<init>(r2)
            throw r1
        L_0x014d:
            com.google.common.util.concurrent.cx r1 = r0.f305927o
            boolean r1 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148480n(r1)
            com.google.common.base.C58838bb.m90883r(r1)
            com.google.common.util.concurrent.cx r1 = r0.f305927o
            java.lang.Object r1 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148474h(r1)
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.af r1 = (com.google.android.apps.gsa.staticplugins.opa.omniconsent.C109786af) r1
            int r12 = r1.mo98118a()
            if (r12 == 0) goto L_0x04b4
            if (r12 == r6) goto L_0x04b4
            if (r12 != r5) goto L_0x04a0
            int r11 = r1.mo98118a()
            if (r11 != r5) goto L_0x0170
            r11 = 1
            goto L_0x0171
        L_0x0170:
            r11 = 0
        L_0x0171:
            java.lang.String r12 = "FetchPayload not present for status %s"
            int r13 = r1.mo98118a()
            com.google.common.base.C58838bb.m90885t(r11, r12, r13)
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.ae r1 = r1.mo98119b()
            r1.getClass()
            r0.f305928p = r1
            com.google.assistant.at.ug r11 = r1.mo98113a()
            int r11 = r11.f131099b
            int r11 = com.google.assistant.p3861at.C50342tn.m85815a(r11)
            if (r11 != 0) goto L_0x0190
            r11 = 1
        L_0x0190:
            int r11 = r11 + -1
            r12 = 7
            if (r11 == r6) goto L_0x0218
            if (r11 == r5) goto L_0x0218
            if (r11 == r4) goto L_0x01e3
            if (r11 != r3) goto L_0x01cf
            com.google.android.apps.gsa.opaonboarding.ar r2 = r0.f305925m
            boolean r2 = r2.mo77261f()
            if (r2 == 0) goto L_0x01c9
            g.a.a r2 = r0.f305923k
            java.lang.Object r2 = r2.mo17428b()
            com.google.android.apps.gsa.opaonboarding.bm r2 = (com.google.android.apps.gsa.opaonboarding.C83907bm) r2
            com.google.assistant.at.ug r1 = r1.mo98113a()
            com.google.assistant.at.uf r1 = r1.f131103f
            if (r1 != 0) goto L_0x01b5
            com.google.assistant.at.uf r1 = com.google.assistant.p3861at.C50361uf.f131089f
        L_0x01b5:
            java.lang.String r3 = "error_ui"
            byte[] r1 = r1.toByteArray()
            android.os.Bundle r1 = com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8403ui.C109826a.m182917a(r3, r1)
            com.google.android.apps.gsa.opaonboarding.t r1 = com.google.android.apps.gsa.opaonboarding.C83875ai.m133540e(r2, r1)
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.ag r1 = com.google.android.apps.gsa.staticplugins.opa.omniconsent.C109787ag.m182810b(r12, r1)
            goto L_0x05f4
        L_0x01c9:
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.ag r1 = com.google.android.apps.gsa.staticplugins.opa.omniconsent.C109787ag.m182809a()
            goto L_0x05f4
        L_0x01cf:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown ConsentStatus: "
            r2.<init>(r3)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01e3:
            com.google.android.apps.gsa.opaonboarding.ar r2 = r0.f305925m
            boolean r2 = r2.mo77261f()
            if (r2 == 0) goto L_0x0212
            g.a.a r2 = r0.f305922j
            java.lang.Object r2 = r2.mo17428b()
            com.google.android.apps.gsa.opaonboarding.bm r2 = (com.google.android.apps.gsa.opaonboarding.C83907bm) r2
            com.google.assistant.at.ug r1 = r1.mo98113a()
            com.google.assistant.at.tk r1 = r1.f131102e
            if (r1 != 0) goto L_0x01fd
            com.google.assistant.at.tk r1 = com.google.assistant.p3861at.C50339tk.f131012h
        L_0x01fd:
            java.lang.String r3 = "account_error_ui"
            byte[] r1 = r1.toByteArray()
            android.os.Bundle r1 = com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8403ui.C109826a.m182917a(r3, r1)
            com.google.android.apps.gsa.opaonboarding.t r1 = com.google.android.apps.gsa.opaonboarding.C83875ai.m133540e(r2, r1)
            r2 = 6
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.ag r1 = com.google.android.apps.gsa.staticplugins.opa.omniconsent.C109787ag.m182810b(r2, r1)
            goto L_0x05f4
        L_0x0212:
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.ag r1 = com.google.android.apps.gsa.staticplugins.opa.omniconsent.C109787ag.m182809a()
            goto L_0x05f4
        L_0x0218:
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.ae r1 = r0.f305928p
            com.google.assistant.at.ug r1 = r1.mo98113a()
            com.google.assistant.at.ud r1 = r1.f131100c
            if (r1 != 0) goto L_0x0224
            com.google.assistant.at.ud r1 = com.google.assistant.p3861at.C50359ud.f131080h
        L_0x0224:
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.ae r11 = r0.f305928p
            com.google.assistant.at.ug r11 = r11.mo98113a()
            com.google.protobuf.cq r11 = r11.f131101d
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.f r13 = new com.google.android.apps.gsa.staticplugins.opa.omniconsent.f
            r13.<init>()
            r13.mo98132a(r2)
            com.google.common.base.b r14 = com.google.common.base.C58836b.f156633a
            r13.f305996f = r14
            r13.mo98135d(r6)
            com.google.protobuf.z r14 = com.google.protobuf.C63088z.f170246b
            r13.mo98134c(r14)
            com.google.common.b.gu r14 = com.google.common.p4522b.C58485gu.m89845m()
            r13.mo98133b(r14)
            r13.mo98136e(r2)
            com.google.android.apps.gsa.opaonboarding.ar r2 = r0.f305925m
            int r2 = r2.mo77268m()
            if (r2 == 0) goto L_0x0498
            r13.f306001k = r2
            com.google.android.apps.gsa.opaonboarding.ar r2 = r0.f305925m
            boolean r2 = r2.mo77265j()
            if (r2 != 0) goto L_0x025f
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a
            goto L_0x026d
        L_0x025f:
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.ae r2 = r0.f305928p
            com.google.common.base.ax r2 = r2.mo98115c()
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.a.l r2 = r0.m182811b(r2)
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)
        L_0x026d:
            r13.f305991a = r2
            if (r1 == 0) goto L_0x0490
            r13.f305992b = r1
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89842j(r11)
            r13.mo98133b(r1)
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.ae r1 = r0.f305928p
            boolean r1 = r1.mo98117e()
            r13.mo98136e(r1)
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.ae r1 = r0.f305928p
            boolean r1 = r1.mo98116d()
            r13.mo98132a(r1)
            com.google.android.apps.gsa.opaonboarding.ar r1 = r0.f305925m
            int r1 = r1.mo77269n()
            if (r1 == 0) goto L_0x0488
            r13.f306002l = r1
            com.google.android.apps.gsa.opaonboarding.ar r1 = r0.f305925m
            int r1 = r1.mo77266k()
            if (r1 == 0) goto L_0x0480
            r13.f306003m = r1
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.aj r1 = r0.f305917e
            com.google.android.apps.gsa.opaonboarding.ar r2 = r0.f305925m
            int r2 = r2.mo77256a()
            if (r2 == r6) goto L_0x02c4
            if (r2 == r5) goto L_0x02cc
            if (r2 != r4) goto L_0x02b0
            goto L_0x0339
        L_0x02b0:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Unknown UdcRequired: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x02c4:
            com.google.android.apps.gsa.staticplugins.opa.util.bc r1 = r1.f305940b
            boolean r1 = r1.mo100634n()
            if (r1 != 0) goto L_0x0339
        L_0x02cc:
            com.google.android.apps.gsa.opaonboarding.ar r1 = r0.f305925m
            com.google.common.base.ax r1 = r1.mo77259d()
            boolean r1 = r1.mo56113h()
            if (r1 == 0) goto L_0x02df
            com.google.android.apps.gsa.opaonboarding.ar r1 = r0.f305925m
            com.google.common.base.ax r1 = r1.mo77259d()
            goto L_0x033b
        L_0x02df:
            com.google.android.apps.gsa.opaonboarding.d.b r1 = com.google.android.apps.gsa.opaonboarding.p6462d.C83915b.f228541j
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.gsa.opaonboarding.d.a r1 = (com.google.android.apps.gsa.opaonboarding.p6462d.C83914a) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.gsa.opaonboarding.d.b r2 = (com.google.android.apps.gsa.opaonboarding.p6462d.C83915b) r2
            int r11 = r2.f228543a
            r11 = r11 | r5
            r2.f228543a = r11
            r11 = 2132090356(0x7f151df4, float:1.982105E38)
            r2.f228545c = r11
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.gsa.opaonboarding.d.b r2 = (com.google.android.apps.gsa.opaonboarding.p6462d.C83915b) r2
            int r11 = r2.f228543a
            r11 = r11 | 8
            r2.f228543a = r11
            r11 = 2132090355(0x7f151df3, float:1.9821048E38)
            r2.f228547e = r11
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.gsa.opaonboarding.d.b r2 = (com.google.android.apps.gsa.opaonboarding.p6462d.C83915b) r2
            int r11 = r2.f228543a
            r11 = r11 | 32
            r2.f228543a = r11
            r11 = 2132090354(0x7f151df2, float:1.9821046E38)
            r2.f228549g = r11
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.gsa.opaonboarding.d.b r2 = (com.google.android.apps.gsa.opaonboarding.p6462d.C83915b) r2
            int r11 = r2.f228543a
            r11 = r11 | 128(0x80, float:1.794E-43)
            r2.f228543a = r11
            r11 = 2132090353(0x7f151df1, float:1.9821044E38)
            r2.f228551i = r11
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.apps.gsa.opaonboarding.d.b r1 = (com.google.android.apps.gsa.opaonboarding.p6462d.C83915b) r1
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)
            goto L_0x033b
        L_0x0339:
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
        L_0x033b:
            if (r1 == 0) goto L_0x0478
            r13.f305996f = r1
            com.google.android.apps.gsa.opaonboarding.ar r1 = r0.f305925m
            boolean r1 = r1.mo77262g()
            r13.mo98135d(r1)
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.ae r1 = r0.f305928p
            com.google.assistant.at.ug r1 = r1.mo98113a()
            com.google.protobuf.z r1 = r1.f131104g
            r13.mo98134c(r1)
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.ae r1 = r0.f305928p
            com.google.common.base.ax r1 = r1.mo98114b()
            if (r1 == 0) goto L_0x0470
            r13.f305999i = r1
            com.google.android.apps.gsa.opaonboarding.ar r1 = r0.f305925m
            int r1 = r1.mo77267l()
            if (r1 == 0) goto L_0x0468
            r13.f306004n = r1
            byte r2 = r13.f306000j
            if (r2 != r12) goto L_0x03fc
            int r15 = r13.f306001k
            if (r15 == 0) goto L_0x03fc
            com.google.assistant.at.ud r2 = r13.f305992b
            if (r2 == 0) goto L_0x03fc
            com.google.common.b.gu r11 = r13.f305993c
            if (r11 == 0) goto L_0x03fc
            int r12 = r13.f306002l
            if (r12 == 0) goto L_0x03fc
            int r14 = r13.f306003m
            if (r14 == 0) goto L_0x03fc
            com.google.protobuf.z r3 = r13.f305998h
            if (r3 == 0) goto L_0x03fc
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.g r5 = new com.google.android.apps.gsa.staticplugins.opa.omniconsent.g
            com.google.common.base.ax r6 = r13.f305991a
            boolean r7 = r13.f305994d
            boolean r8 = r13.f305995e
            com.google.common.base.ax r9 = r13.f305996f
            boolean r10 = r13.f305997g
            com.google.common.base.ax r13 = r13.f305999i
            r23 = r14
            r14 = r5
            r16 = r6
            r17 = r2
            r18 = r11
            r19 = r7
            r20 = r8
            r21 = r12
            r22 = r9
            r24 = r10
            r25 = r3
            r26 = r13
            r27 = r1
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.au r1 = r0.f305919g
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.at r2 = new com.google.android.apps.gsa.staticplugins.opa.omniconsent.at
            g.a.a r3 = r1.f305958a
            java.lang.Object r3 = r3.mo17428b()
            r19 = r3
            com.google.android.apps.gsa.opaonboarding.b r19 = (com.google.android.apps.gsa.opaonboarding.C83893b) r19
            r19.getClass()
            g.a.a r3 = r1.f305959b
            java.lang.Object r3 = r3.mo17428b()
            r20 = r3
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.aj r20 = (com.google.android.apps.gsa.staticplugins.opa.omniconsent.C109790aj) r20
            r20.getClass()
            g.a.a r3 = r1.f305960c
            g.a.a r6 = r1.f305961d
            g.a.a r7 = r1.f305962e
            java.lang.Object r7 = r7.mo17428b()
            r23 = r7
            com.google.android.apps.gsa.staticplugins.opa.util.bc r23 = (com.google.android.apps.gsa.staticplugins.opa.util.C113787bc) r23
            r23.getClass()
            g.a.a r1 = r1.f305963f
            java.lang.Object r1 = r1.mo17428b()
            r24 = r1
            com.google.android.apps.gsa.search.core.i.t r24 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r24
            r24.getClass()
            r17 = r2
            r18 = r5
            r21 = r3
            r22 = r6
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r0.f305914a = r2
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.ag r1 = com.google.android.apps.gsa.staticplugins.opa.omniconsent.C109787ag.m182810b(r4, r2)
            goto L_0x05f4
        L_0x03fc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r13.f306001k
            if (r2 != 0) goto L_0x0408
            r1.append(r7)
        L_0x0408:
            com.google.assistant.at.ud r2 = r13.f305992b
            if (r2 != 0) goto L_0x040f
            r1.append(r10)
        L_0x040f:
            com.google.common.b.gu r2 = r13.f305993c
            if (r2 != 0) goto L_0x0418
            java.lang.String r2 = " multiConsentUi"
            r1.append(r2)
        L_0x0418:
            byte r2 = r13.f306000j
            r2 = r2 & r6
            if (r2 != 0) goto L_0x0422
            java.lang.String r2 = " useNeutralButtons"
            r1.append(r2)
        L_0x0422:
            byte r2 = r13.f306000j
            r2 = r2 & r5
            if (r2 != 0) goto L_0x042c
            java.lang.String r2 = " isEligibleForGoogleNow"
            r1.append(r2)
        L_0x042c:
            int r2 = r13.f306002l
            if (r2 != 0) goto L_0x0435
            java.lang.String r2 = " assistantSurface"
            r1.append(r2)
        L_0x0435:
            int r2 = r13.f306003m
            if (r2 != 0) goto L_0x043c
            r1.append(r9)
        L_0x043c:
            byte r2 = r13.f306000j
            r3 = 4
            r2 = r2 & r3
            if (r2 != 0) goto L_0x0447
            java.lang.String r2 = " shouldShowConfirmRejectFragment"
            r1.append(r2)
        L_0x0447:
            com.google.protobuf.z r2 = r13.f305998h
            if (r2 != 0) goto L_0x0450
            java.lang.String r2 = " sessionId"
            r1.append(r2)
        L_0x0450:
            int r2 = r13.f306004n
            if (r2 == 0) goto L_0x0455
            goto L_0x045a
        L_0x0455:
            java.lang.String r2 = " omniconsentUserType"
            r1.append(r2)
        L_0x045a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r8.concat(r1)
            r2.<init>(r1)
            throw r2
        L_0x0468:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null omniconsentUserType"
            r1.<init>(r2)
            throw r1
        L_0x0470:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null userProfileUrl"
            r1.<init>(r2)
            throw r1
        L_0x0478:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null confirmRejectDialog"
            r1.<init>(r2)
            throw r1
        L_0x0480:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null omniconsentScope"
            r1.<init>(r2)
            throw r1
        L_0x0488:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null assistantSurface"
            r1.<init>(r2)
            throw r1
        L_0x0490:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null consentUi"
            r1.<init>(r2)
            throw r1
        L_0x0498:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null flowId"
            r1.<init>(r2)
            throw r1
        L_0x04a0:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown ResponseStatus: "
            r2.<init>(r3)
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x04b4:
            com.google.android.apps.gsa.opaonboarding.ar r1 = r0.f305925m
            boolean r1 = r1.mo77261f()
            if (r1 == 0) goto L_0x003a
            g.a.a r1 = r0.f305924l
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.apps.gsa.opaonboarding.bm r1 = (com.google.android.apps.gsa.opaonboarding.C83907bm) r1
            com.google.android.apps.gsa.opaonboarding.t r1 = com.google.android.apps.gsa.opaonboarding.C83875ai.m133537b(r1)
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.ag r1 = com.google.android.apps.gsa.staticplugins.opa.omniconsent.C109787ag.m182810b(r11, r1)
            goto L_0x05f4
        L_0x04ce:
            com.google.android.apps.gsa.opaonboarding.b r1 = r0.f305918f
            com.google.common.base.ax r1 = r1.mo77278a()
            boolean r3 = r1.mo56113h()
            if (r3 != 0) goto L_0x04f4
            com.google.common.f.e r1 = f305913b
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "OmniSeqImpl"
            r1.mo56378ag(r2, r3)
            java.lang.String r2 = "No user account present"
            r3 = 25264(0x62b0, float:3.5402E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.ag r1 = com.google.android.apps.gsa.staticplugins.opa.omniconsent.C109787ag.m182809a()
            goto L_0x05f4
        L_0x04f4:
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.aj r3 = r0.f305917e
            java.lang.Object r1 = r1.mo56107c()
            android.accounts.Account r1 = (android.accounts.Account) r1
            com.google.android.apps.gsa.opaonboarding.ar r7 = r0.f305925m
            int r7 = r7.mo77266k()
            r3.mo98126h(r1, r7)
            com.google.android.apps.gsa.search.core.preferences.r r3 = r3.f305939a
            java.lang.String r8 = "oc:omniconsent_triggered"
            java.lang.String r1 = r1.name
            com.google.android.apps.gsa.opaonboarding.C83886at.m133603c(r3, r8, r1, r7)
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.ab r10 = r0.f305916d
            com.google.android.apps.gsa.opaonboarding.ar r15 = r0.f305925m
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.z r1 = new com.google.android.apps.gsa.staticplugins.opa.omniconsent.z
            r1.<init>()
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.z r3 = new com.google.android.apps.gsa.staticplugins.opa.omniconsent.z
            r3.<init>()
            com.google.android.libraries.gsa.k.g r7 = r10.f305907g
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.w r8 = new com.google.android.apps.gsa.staticplugins.opa.omniconsent.w
            r8.<init>(r10, r15, r1, r3)
            java.lang.String r9 = "fetchCmsThenSettingsUi"
            r7.mo28212l(r9, r8)
            com.google.common.util.concurrent.SettableFuture r11 = r1.f306122a
            com.google.common.util.concurrent.SettableFuture r12 = r3.f306122a
            int r1 = r15.mo77257b()
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r3 = r3.toLanguageTag()
            com.google.android.apps.gsa.search.core.i.t r7 = r10.f305904d
            com.google.android.apps.gsa.shared.m.h r8 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247517ie
            java.lang.String r7 = r7.mo79758x(r8)
            boolean r3 = android.text.TextUtils.equals(r3, r7)
            if (r3 == 0) goto L_0x055a
            java.lang.String r1 = r10.mo98109b(r1)
            java.lang.String r3 = r10.mo98109b(r2)
            if (r1 == 0) goto L_0x0555
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)
            goto L_0x055c
        L_0x0555:
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90833j(r3)
            goto L_0x055c
        L_0x055a:
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
        L_0x055c:
            boolean r3 = r1.mo56113h()
            if (r3 != 0) goto L_0x056a
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            r13 = r1
            goto L_0x05aa
        L_0x056a:
            java.lang.Object r1 = r1.mo56107c()
            java.lang.String r1 = (java.lang.String) r1
            com.google.common.util.concurrent.SettableFuture r3 = new com.google.common.util.concurrent.SettableFuture
            r3.<init>()
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.aa r7 = r10.f305905e
            android.webkit.WebView r8 = new android.webkit.WebView
            android.content.Context r7 = r7.f305900a
            r8.<init>(r7)
            com.google.android.apps.gsa.opaonboarding.ui.o r7 = new com.google.android.apps.gsa.opaonboarding.ui.o
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.u r9 = new com.google.android.apps.gsa.staticplugins.opa.omniconsent.u
            r9.<init>(r3, r1)
            r7.<init>(r9)
            r8.setWebViewClient(r7)
            android.webkit.WebSettings r7 = r8.getSettings()
            r7.setJavaScriptEnabled(r6)
            r8.loadUrl(r1)
            com.google.android.apps.gsa.search.core.i.t r1 = r10.f305904d
            com.google.android.apps.gsa.shared.m.f r7 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247514ib
            long r7 = r1.mo79743a(r7)
            com.google.android.libraries.gsa.k.g r1 = r10.f305907g
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.v r9 = new com.google.android.apps.gsa.staticplugins.opa.omniconsent.v
            r9.<init>(r3)
            java.lang.String r13 = "Cancel VP preload"
            r1.mo28213m(r13, r7, r9)
            r13 = r3
        L_0x05aa:
            com.google.android.libraries.gsa.k.g r1 = r10.f305907g
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.s r3 = new com.google.android.apps.gsa.staticplugins.opa.omniconsent.s
            r3.<init>(r10)
            java.lang.String r7 = "fetchGoogleNowEligibility"
            com.google.common.util.concurrent.cx r14 = r1.mo28201a(r7, r3)
            com.google.android.apps.gsa.search.core.i.t r1 = r10.f305904d
            com.google.android.apps.gsa.shared.m.f r3 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247514ib
            long r7 = r1.mo79743a(r3)
            com.google.android.libraries.gsa.k.g r1 = r10.f305907g
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.t r3 = new com.google.android.apps.gsa.staticplugins.opa.omniconsent.t
            r3.<init>(r14)
            java.lang.String r9 = "Cancel fetchGoogleNowEligibility"
            r1.mo28213m(r9, r7, r3)
            r1 = 4
            com.google.common.util.concurrent.cx[] r1 = new com.google.common.util.concurrent.C60870cx[r1]
            r1[r2] = r11
            r1[r6] = r12
            r1[r5] = r13
            r1[r4] = r14
            com.google.common.util.concurrent.cf r1 = com.google.common.util.concurrent.C60856cj.m92893b(r1)
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.y r2 = new com.google.android.apps.gsa.staticplugins.opa.omniconsent.y
            r9 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15)
            com.google.common.util.concurrent.bg r3 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r1 = r1.mo57334a(r2, r3)
            r0.f305927o = r1
            com.google.android.apps.gsa.opaonboarding.ui.u r2 = r0.f305915c
            g.a.a r3 = r0.f305921i
            com.google.android.apps.gsa.opaonboarding.ui.t r1 = r2.mo77487a(r1, r3)
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.ag r1 = com.google.android.apps.gsa.staticplugins.opa.omniconsent.C109787ag.m182810b(r5, r1)
        L_0x05f4:
            r0.f305926n = r1
            com.google.common.base.ax r1 = r1.f305911a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.omniconsent.C109788ah.mo77210d():com.google.common.base.ax");
    }

    /* renamed from: a */
    public final int mo77270a() {
        int i = this.f305926n.f305912b - 1;
        if (i == 0 || i == 1) {
            return 1;
        }
        if (i != 4) {
            if (i == 5) {
                return this.f305918f.mo77281d() ? 1 : 4;
            }
            if (i != 6) {
                C109800at atVar = this.f305914a;
                if (atVar != null) {
                    int i2 = atVar.f305957i;
                    int i3 = i2 - 1;
                    if (i2 == 0) {
                        throw null;
                    } else if (i3 != 0) {
                        if (i3 != 1) {
                            return i3 != 2 ? 5 : 3;
                        }
                        return 2;
                    }
                }
                return 1;
            }
        }
        return 5;
    }
}
