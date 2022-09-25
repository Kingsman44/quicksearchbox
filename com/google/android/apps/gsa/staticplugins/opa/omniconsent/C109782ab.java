package com.google.android.apps.gsa.staticplugins.opa.omniconsent;

import android.content.res.Resources;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.opaonboarding.p8654a.C115850g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3861at.adn;
import com.google.assistant.p3861at.ado;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.omniconsent.ab */
/* compiled from: PG */
public final class C109782ab {

    /* renamed from: a */
    public static final C59071e f305901a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.omniconsent.ab");

    /* renamed from: b */
    public final C83893b f305902b;

    /* renamed from: c */
    public final l f305903c;

    /* renamed from: d */
    public final C86124t f305904d;

    /* renamed from: e */
    public final C109781aa f305905e;

    /* renamed from: f */
    public final C109814j f305906f;

    /* renamed from: g */
    public final C22871g f305907g;

    /* renamed from: h */
    public final C85651bb f305908h;

    /* renamed from: i */
    public final C115850g f305909i;

    /* renamed from: j */
    private final Resources f305910j;

    public C109782ab(C83893b bVar, C115850g gVar, l lVar, C86124t tVar, C109781aa aaVar, C109814j jVar, C22871g gVar2, C85651bb bbVar, Resources resources) {
        this.f305902b = bVar;
        this.f305909i = gVar;
        this.f305903c = lVar;
        this.f305904d = tVar;
        this.f305905e = aaVar;
        this.f305906f = jVar;
        this.f305907g = gVar2;
        this.f305908h = bbVar;
        this.f305910j = resources;
    }

    /* renamed from: c */
    private static ado m182794c(Resources resources, int i, String str, int i2, int i3) {
        adn adn = (adn) ado.f129050g.createBuilder();
        String string = resources.getString(i);
        adn.copyOnWrite();
        ado ado = (ado) adn.instance;
        string.getClass();
        ado.f129052a |= 2;
        ado.f129054c = string;
        adn.copyOnWrite();
        ado ado2 = (ado) adn.instance;
        ado2.f129052a |= 8;
        ado2.f129057f = str;
        String string2 = resources.getString(i2);
        adn.copyOnWrite();
        ado ado3 = (ado) adn.instance;
        string2.getClass();
        C62971cq cqVar = ado3.f129055d;
        if (!cqVar.mo58948c()) {
            ado3.f129055d = C62942bv.mutableCopy(cqVar);
        }
        ado3.f129055d.add(string2);
        String string3 = resources.getString(i3);
        adn.copyOnWrite();
        ado ado4 = (ado) adn.instance;
        string3.getClass();
        C62971cq cqVar2 = ado4.f129056e;
        if (!cqVar2.mo58948c()) {
            ado4.f129056e = C62942bv.mutableCopy(cqVar2);
        }
        ado4.f129056e.add(string3);
        return (ado) adn.build();
    }

    /* JADX WARNING: type inference failed for: r4v17, types: [com.google.protobuf.bv] */
    /* JADX WARNING: type inference failed for: r4v29, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0539, code lost:
        r4 = com.google.assistant.p3861at.C50151ml.m85780a(r6.f130388c);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.gsa.staticplugins.opa.omniconsent.C109786af mo98108a(com.google.common.util.concurrent.C60870cx r18, com.google.common.util.concurrent.C60870cx r19, com.google.common.util.concurrent.C60870cx r20, com.google.common.util.concurrent.C60870cx r21, com.google.android.apps.gsa.opaonboarding.C83884ar r22) {
        /*
            r17 = this;
            r1 = r17
            java.lang.String r2 = "OmniConsentReqHelper"
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            boolean r0 = r18.isDone()
            com.google.common.base.C58838bb.m90883r(r0)
            boolean r0 = r19.isDone()
            com.google.common.base.C58838bb.m90883r(r0)
            boolean r0 = r20.isDone()
            com.google.common.base.C58838bb.m90883r(r0)
            r3 = 0
            r4 = 0
            r5 = 1
            java.lang.Object r0 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148472f(r18)     // Catch:{ CancellationException -> 0x05fd, Exception -> 0x05e3 }
            com.google.assistant.at.act r0 = (com.google.assistant.p3861at.act) r0     // Catch:{ CancellationException -> 0x05fd, Exception -> 0x05e3 }
            java.lang.Object r6 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148472f(r19)     // Catch:{ CancellationException -> 0x05fd, Exception -> 0x05e3 }
            com.google.assistant.at.mn r6 = (com.google.assistant.p3861at.C50153mn) r6     // Catch:{ CancellationException -> 0x05fd, Exception -> 0x05e3 }
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a
            r3 = r20
            java.lang.Object r2 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148475i(r3, r2)
            com.google.common.base.ax r2 = (com.google.common.base.C58833ax) r2
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)
            r7 = r21
            java.lang.Object r3 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148475i(r7, r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            int r7 = r0.f128894a
            r8 = 134217728(0x8000000, float:3.85186E-34)
            r7 = r7 & r8
            r8 = 3
            r9 = 2
            if (r7 == 0) goto L_0x0055
            com.google.assistant.at.ug r7 = r0.f128917x
            if (r7 != 0) goto L_0x051f
            com.google.assistant.at.ug r7 = com.google.assistant.p3861at.C50362ug.f131096h
            goto L_0x051f
        L_0x0055:
            com.google.assistant.at.adv r7 = r0.f128909p
            if (r7 != 0) goto L_0x005b
            com.google.assistant.at.adv r7 = com.google.assistant.p3861at.adv.f129073f
        L_0x005b:
            int r10 = r7.f129077c
            int r10 = com.google.assistant.p3861at.adu.m85734a(r10)
            if (r10 != 0) goto L_0x0064
            r10 = 1
        L_0x0064:
            int r10 = r10 + -1
            r11 = 2132090484(0x7f151e74, float:1.982131E38)
            r12 = 4
            if (r10 == 0) goto L_0x0487
            if (r10 == r5) goto L_0x0153
            if (r10 == r9) goto L_0x0153
            if (r10 == r12) goto L_0x0487
            r7 = 5
            if (r10 == r7) goto L_0x0487
            r7 = 6
            if (r10 == r7) goto L_0x0487
            com.google.assistant.at.ug r7 = com.google.assistant.p3861at.C50362ug.f131096h
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.assistant.at.tl r7 = (com.google.assistant.p3861at.C50340tl) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r10 = r7.instance
            com.google.assistant.at.ug r10 = (com.google.assistant.p3861at.C50362ug) r10
            r10.f131099b = r8
            int r13 = r10.f131098a
            r13 = r13 | r5
            r10.f131098a = r13
            android.content.res.Resources r10 = r1.f305910j
            com.google.assistant.at.tk r13 = com.google.assistant.p3861at.C50339tk.f131012h
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.assistant.at.tj r13 = (com.google.assistant.p3861at.C50338tj) r13
            r14 = 2132090500(0x7f151e84, float:1.9821342E38)
            java.lang.String r14 = r10.getString(r14)
            r13.copyOnWrite()
            com.google.protobuf.bv r15 = r13.instance
            com.google.assistant.at.tk r15 = (com.google.assistant.p3861at.C50339tk) r15
            r14.getClass()
            int r8 = r15.f131014a
            r8 = r8 | r9
            r15.f131014a = r8
            r15.f131016c = r14
            r8 = 2132090496(0x7f151e80, float:1.9821334E38)
            java.lang.String r8 = r10.getString(r8)
            r13.copyOnWrite()
            com.google.protobuf.bv r14 = r13.instance
            com.google.assistant.at.tk r14 = (com.google.assistant.p3861at.C50339tk) r14
            r8.getClass()
            int r15 = r14.f131014a
            r15 = r15 | r12
            r14.f131014a = r15
            r14.f131017d = r8
            r8 = 2132085822(0x7f150c3e, float:1.9811854E38)
            java.lang.String r8 = r10.getString(r8)
            r14 = 2132090493(0x7f151e7d, float:1.9821328E38)
            java.lang.String r14 = r10.getString(r14)
            java.lang.Object[] r15 = new java.lang.Object[r9]
            r15[r4] = r14
            r15[r5] = r8
            java.lang.String r8 = "<a href=\"%s\">%s</a>"
            java.lang.String r8 = java.lang.String.format(r8, r15)
            r13.copyOnWrite()
            com.google.protobuf.bv r14 = r13.instance
            com.google.assistant.at.tk r14 = (com.google.assistant.p3861at.C50339tk) r14
            r8.getClass()
            int r15 = r14.f131014a
            r15 = r15 | 8
            r14.f131014a = r15
            r14.f131018e = r8
            r13.copyOnWrite()
            com.google.protobuf.bv r8 = r13.instance
            com.google.assistant.at.tk r8 = (com.google.assistant.p3861at.C50339tk) r8
            int r14 = r8.f131014a
            r14 = r14 | r5
            r8.f131014a = r14
            r14 = 46426(0xb55a, float:6.5057E-41)
            r8.f131015b = r14
            r8 = 2132090485(0x7f151e75, float:1.9821311E38)
            java.lang.String r8 = r10.getString(r8)
            r13.copyOnWrite()
            com.google.protobuf.bv r14 = r13.instance
            com.google.assistant.at.tk r14 = (com.google.assistant.p3861at.C50339tk) r14
            r8.getClass()
            int r15 = r14.f131014a
            r15 = r15 | 32
            r14.f131014a = r15
            r14.f131020g = r8
            java.lang.String r8 = r10.getString(r11)
            r13.copyOnWrite()
            com.google.protobuf.bv r10 = r13.instance
            com.google.assistant.at.tk r10 = (com.google.assistant.p3861at.C50339tk) r10
            r8.getClass()
            int r11 = r10.f131014a
            r11 = r11 | 16
            r10.f131014a = r11
            r10.f131019f = r8
            com.google.protobuf.bv r8 = r13.build()
            com.google.assistant.at.tk r8 = (com.google.assistant.p3861at.C50339tk) r8
            r7.copyOnWrite()
            com.google.protobuf.bv r10 = r7.instance
            com.google.assistant.at.ug r10 = (com.google.assistant.p3861at.C50362ug) r10
            r8.getClass()
            r10.f131102e = r8
            int r8 = r10.f131098a
            r8 = r8 | r12
            r10.f131098a = r8
            com.google.protobuf.bv r7 = r7.build()
            com.google.assistant.at.ug r7 = (com.google.assistant.p3861at.C50362ug) r7
            goto L_0x051f
        L_0x0153:
            com.google.assistant.at.ug r8 = com.google.assistant.p3861at.C50362ug.f131096h
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.at.tl r8 = (com.google.assistant.p3861at.C50340tl) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.assistant.at.ug r10 = (com.google.assistant.p3861at.C50362ug) r10
            r10.f131099b = r5
            int r11 = r10.f131098a
            r11 = r11 | r5
            r10.f131098a = r11
            int r10 = r7.f129075a
            if (r10 != r12) goto L_0x0172
            java.lang.Object r10 = r7.f129076b
            com.google.assistant.at.adp r10 = (com.google.assistant.p3861at.adp) r10
            goto L_0x0174
        L_0x0172:
            com.google.assistant.at.adp r10 = com.google.assistant.p3861at.adp.f129058h
        L_0x0174:
            com.google.assistant.at.ud r11 = com.google.assistant.p3861at.C50359ud.f131080h
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.assistant.at.to r11 = (com.google.assistant.p3861at.C50343to) r11
            int r13 = r7.f129077c
            int r13 = com.google.assistant.p3861at.adu.m85734a(r13)
            if (r13 != 0) goto L_0x0186
            goto L_0x03b6
        L_0x0186:
            if (r13 != r9) goto L_0x03b6
            boolean r13 = r22.mo77264i()
            if (r13 == 0) goto L_0x03b6
            com.google.assistant.at.uc r13 = com.google.assistant.p3861at.C50358uc.f131066m
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.assistant.at.tv r13 = (com.google.assistant.p3861at.C50350tv) r13
            java.lang.String r15 = r10.f129060a
            r13.copyOnWrite()
            com.google.protobuf.bv r4 = r13.instance
            com.google.assistant.at.uc r4 = (com.google.assistant.p3861at.C50358uc) r4
            r15.getClass()
            int r14 = r4.f131068a
            r14 = r14 | 8
            r4.f131068a = r14
            r4.f131072e = r15
            java.lang.String r4 = r10.f129062c
            r13.copyOnWrite()
            com.google.protobuf.bv r14 = r13.instance
            com.google.assistant.at.uc r14 = (com.google.assistant.p3861at.C50358uc) r14
            r4.getClass()
            int r15 = r14.f131068a
            r15 = r15 | 16
            r14.f131068a = r15
            r14.f131074g = r4
            com.google.protobuf.z r4 = r7.f129078d
            r13.copyOnWrite()
            com.google.protobuf.bv r14 = r13.instance
            com.google.assistant.at.uc r14 = (com.google.assistant.p3861at.C50358uc) r14
            r4.getClass()
            int r15 = r14.f131068a
            r15 = r15 | r9
            r14.f131068a = r15
            r14.f131070c = r4
            com.google.protobuf.z r4 = r7.f129079e
            r13.copyOnWrite()
            com.google.protobuf.bv r14 = r13.instance
            com.google.assistant.at.uc r14 = (com.google.assistant.p3861at.C50358uc) r14
            r4.getClass()
            int r15 = r14.f131068a
            r15 = r15 | r12
            r14.f131068a = r15
            r14.f131071d = r4
            r13.copyOnWrite()
            com.google.protobuf.bv r4 = r13.instance
            com.google.assistant.at.uc r4 = (com.google.assistant.p3861at.C50358uc) r4
            int r14 = r4.f131068a
            r14 = r14 | r5
            r4.f131068a = r14
            r14 = 46422(0xb556, float:6.5051E-41)
            r4.f131069b = r14
            com.google.protobuf.cq r4 = r10.f129061b
            int r4 = r4.size()
            if (r4 == 0) goto L_0x0219
            com.google.protobuf.cq r4 = r10.f129061b
            r13.copyOnWrite()
            com.google.protobuf.bv r14 = r13.instance
            com.google.assistant.at.uc r14 = (com.google.assistant.p3861at.C50358uc) r14
            com.google.protobuf.cq r15 = r14.f131073f
            boolean r16 = r15.mo58948c()
            if (r16 != 0) goto L_0x0214
            com.google.protobuf.cq r15 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r15)
            r14.f131073f = r15
        L_0x0214:
            com.google.protobuf.cq r14 = r14.f131073f
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r4, (java.util.List) r14)
        L_0x0219:
            com.google.protobuf.cq r4 = r10.f129063d
            int r4 = r4.size()
            if (r4 == 0) goto L_0x023d
            com.google.protobuf.cq r4 = r10.f129063d
            r13.copyOnWrite()
            com.google.protobuf.bv r14 = r13.instance
            com.google.assistant.at.uc r14 = (com.google.assistant.p3861at.C50358uc) r14
            com.google.protobuf.cq r15 = r14.f131079l
            boolean r16 = r15.mo58948c()
            if (r16 != 0) goto L_0x0238
            com.google.protobuf.cq r15 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r15)
            r14.f131079l = r15
        L_0x0238:
            com.google.protobuf.cq r14 = r14.f131079l
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r4, (java.util.List) r14)
        L_0x023d:
            com.google.protobuf.cq r4 = r10.f129066g
            int r4 = r4.size()
            if (r4 == 0) goto L_0x0261
            com.google.protobuf.cq r4 = r10.f129066g
            r13.copyOnWrite()
            com.google.protobuf.bv r10 = r13.instance
            com.google.assistant.at.uc r10 = (com.google.assistant.p3861at.C50358uc) r10
            com.google.protobuf.cq r14 = r10.f131078k
            boolean r15 = r14.mo58948c()
            if (r15 != 0) goto L_0x025c
            com.google.protobuf.cq r14 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r14)
            r10.f131078k = r14
        L_0x025c:
            com.google.protobuf.cq r10 = r10.f131078k
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r4, (java.util.List) r10)
        L_0x0261:
            r11.copyOnWrite()
            com.google.protobuf.bv r4 = r11.instance
            com.google.assistant.at.ud r4 = (com.google.assistant.p3861at.C50359ud) r4
            com.google.protobuf.bv r10 = r13.build()
            com.google.assistant.at.uc r10 = (com.google.assistant.p3861at.C50358uc) r10
            r10.getClass()
            r4.f131083b = r10
            int r10 = r4.f131082a
            r10 = r10 | r5
            r4.f131082a = r10
            android.content.res.Resources r4 = r1.f305910j
            com.google.assistant.at.ts r10 = com.google.assistant.p3861at.C50347ts.f131027k
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.assistant.at.tr r10 = (com.google.assistant.p3861at.C50346tr) r10
            r13 = 2132090499(0x7f151e83, float:1.982134E38)
            java.lang.String r13 = r4.getString(r13)
            r10.copyOnWrite()
            com.google.protobuf.bv r14 = r10.instance
            com.google.assistant.at.ts r14 = (com.google.assistant.p3861at.C50347ts) r14
            r13.getClass()
            int r15 = r14.f131029a
            r15 = r15 | r5
            r14.f131029a = r15
            r14.f131030b = r13
            r13 = 2132090492(0x7f151e7c, float:1.9821326E38)
            java.lang.String r13 = r4.getString(r13)
            r10.copyOnWrite()
            com.google.protobuf.bv r14 = r10.instance
            com.google.assistant.at.ts r14 = (com.google.assistant.p3861at.C50347ts) r14
            r13.getClass()
            int r15 = r14.f131029a
            r15 = r15 | r9
            r14.f131029a = r15
            r14.f131031c = r13
            r13 = 2132090490(0x7f151e7a, float:1.9821321E38)
            java.lang.String r13 = r4.getString(r13)
            r10.copyOnWrite()
            com.google.protobuf.bv r14 = r10.instance
            com.google.assistant.at.ts r14 = (com.google.assistant.p3861at.C50347ts) r14
            r13.getClass()
            int r15 = r14.f131029a
            r15 = r15 | r12
            r14.f131029a = r15
            r14.f131032d = r13
            r13 = 2132090491(0x7f151e7b, float:1.9821324E38)
            java.lang.String r13 = r4.getString(r13)
            r10.copyOnWrite()
            com.google.protobuf.bv r14 = r10.instance
            com.google.assistant.at.ts r14 = (com.google.assistant.p3861at.C50347ts) r14
            r13.getClass()
            int r15 = r14.f131029a
            r15 = r15 | 8
            r14.f131029a = r15
            r14.f131033e = r13
            r13 = 2132090489(0x7f151e79, float:1.982132E38)
            java.lang.String r13 = r4.getString(r13)
            r10.copyOnWrite()
            com.google.protobuf.bv r14 = r10.instance
            com.google.assistant.at.ts r14 = (com.google.assistant.p3861at.C50347ts) r14
            r13.getClass()
            int r15 = r14.f131029a
            r15 = r15 | 16
            r14.f131029a = r15
            r14.f131034f = r13
            r13 = 2132090488(0x7f151e78, float:1.9821317E38)
            java.lang.String r13 = r4.getString(r13)
            r10.copyOnWrite()
            com.google.protobuf.bv r14 = r10.instance
            com.google.assistant.at.ts r14 = (com.google.assistant.p3861at.C50347ts) r14
            r13.getClass()
            int r15 = r14.f131029a
            r15 = r15 | 32
            r14.f131029a = r15
            r14.f131035g = r13
            r13 = 2132090487(0x7f151e77, float:1.9821315E38)
            java.lang.String r13 = r4.getString(r13)
            r10.copyOnWrite()
            com.google.protobuf.bv r14 = r10.instance
            com.google.assistant.at.ts r14 = (com.google.assistant.p3861at.C50347ts) r14
            r13.getClass()
            int r15 = r14.f131029a
            r15 = r15 | 64
            r14.f131029a = r15
            r14.f131036h = r13
            r13 = 2132090486(0x7f151e76, float:1.9821313E38)
            java.lang.String r13 = r4.getString(r13)
            r10.copyOnWrite()
            com.google.protobuf.bv r14 = r10.instance
            com.google.assistant.at.ts r14 = (com.google.assistant.p3861at.C50347ts) r14
            r13.getClass()
            int r15 = r14.f131029a
            r15 = r15 | 128(0x80, float:1.794E-43)
            r14.f131029a = r15
            r14.f131037i = r13
            r13 = 2132090797(0x7f151fad, float:1.9821944E38)
            java.lang.String r4 = r4.getString(r13)
            r10.copyOnWrite()
            com.google.protobuf.bv r13 = r10.instance
            com.google.assistant.at.ts r13 = (com.google.assistant.p3861at.C50347ts) r13
            r4.getClass()
            int r14 = r13.f131029a
            r14 = r14 | 256(0x100, float:3.59E-43)
            r13.f131029a = r14
            r13.f131038j = r4
            com.google.protobuf.bv r4 = r10.build()
            com.google.assistant.at.ts r4 = (com.google.assistant.p3861at.C50347ts) r4
            r11.copyOnWrite()
            com.google.protobuf.bv r10 = r11.instance
            com.google.assistant.at.ud r10 = (com.google.assistant.p3861at.C50359ud) r10
            r4.getClass()
            r10.f131084c = r4
            int r4 = r10.f131082a
            r4 = r4 | r9
            r10.f131082a = r4
            int r4 = r7.f129075a
            if (r4 != r12) goto L_0x0380
            java.lang.Object r4 = r7.f129076b
            com.google.assistant.at.adp r4 = (com.google.assistant.p3861at.adp) r4
            goto L_0x0382
        L_0x0380:
            com.google.assistant.at.adp r4 = com.google.assistant.p3861at.adp.f129058h
        L_0x0382:
            java.lang.String r4 = r4.f129064e
            r11.copyOnWrite()
            com.google.protobuf.bv r10 = r11.instance
            com.google.assistant.at.ud r10 = (com.google.assistant.p3861at.C50359ud) r10
            r4.getClass()
            int r13 = r10.f131082a
            r13 = r13 | 16
            r10.f131082a = r13
            r10.f131087f = r4
            int r4 = r7.f129075a
            if (r4 != r12) goto L_0x039f
            java.lang.Object r4 = r7.f129076b
            com.google.assistant.at.adp r4 = (com.google.assistant.p3861at.adp) r4
            goto L_0x03a1
        L_0x039f:
            com.google.assistant.at.adp r4 = com.google.assistant.p3861at.adp.f129058h
        L_0x03a1:
            java.lang.String r4 = r4.f129065f
            r11.copyOnWrite()
            com.google.protobuf.bv r7 = r11.instance
            com.google.assistant.at.ud r7 = (com.google.assistant.p3861at.C50359ud) r7
            r4.getClass()
            int r10 = r7.f131082a
            r10 = r10 | 32
            r7.f131082a = r10
            r7.f131088g = r4
            goto L_0x03d1
        L_0x03b6:
            android.content.res.Resources r4 = r1.f305910j
            r7 = 2132090797(0x7f151fad, float:1.9821944E38)
            java.lang.String r4 = r4.getString(r7)
            r11.copyOnWrite()
            com.google.protobuf.bv r7 = r11.instance
            com.google.assistant.at.ud r7 = (com.google.assistant.p3861at.C50359ud) r7
            r4.getClass()
            int r10 = r7.f131082a
            r10 = r10 | 16
            r7.f131082a = r10
            r7.f131087f = r4
        L_0x03d1:
            android.content.res.Resources r4 = r1.f305910j
            java.lang.String r7 = com.google.android.apps.gsa.assistant.p509a.C9437a.m23954b(r4)
            java.lang.String r10 = com.google.android.apps.gsa.assistant.p509a.C9437a.m23953a(r4)
            java.lang.Object[] r13 = new java.lang.Object[r9]
            r14 = 0
            r13[r14] = r7
            r13[r5] = r10
            r7 = 2132092932(0x7f152804, float:1.9826274E38)
            java.lang.String r4 = r4.getString(r7, r13)
            r11.copyOnWrite()
            com.google.protobuf.bv r7 = r11.instance
            com.google.assistant.at.ud r7 = (com.google.assistant.p3861at.C50359ud) r7
            r4.getClass()
            int r10 = r7.f131082a
            r10 = r10 | 8
            r7.f131082a = r10
            r7.f131086e = r4
            android.content.res.Resources r4 = r1.f305910j
            com.google.assistant.at.tq r7 = com.google.assistant.p3861at.C50345tq.f131022d
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.assistant.at.tp r7 = (com.google.assistant.p3861at.C50344tp) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r10 = r7.instance
            com.google.assistant.at.tq r10 = (com.google.assistant.p3861at.C50345tq) r10
            int r13 = r10.f131024a
            r13 = r13 | r5
            r10.f131024a = r13
            r13 = 46423(0xb557, float:6.5052E-41)
            r10.f131025b = r13
            com.google.android.apps.gsa.opaonboarding.d.l r10 = r22.mo77258c()
            int r13 = r10.f228577a
            r13 = r13 & r5
            if (r13 == 0) goto L_0x0435
            boolean r13 = r10.f228578b
            if (r13 == 0) goto L_0x0435
            r13 = 2132090649(0x7f151f19, float:1.9821644E38)
            r14 = 2132090648(0x7f151f18, float:1.9821642E38)
            r15 = 2132090650(0x7f151f1a, float:1.9821646E38)
            java.lang.String r5 = "https://www.gstatic.com/images/icons/material/system/2x/domain_grey600_48dp.png"
            com.google.assistant.at.ado r5 = m182794c(r4, r15, r5, r13, r14)
            r7.mo53399a(r5)
        L_0x0435:
            int r5 = r10.f228577a
            r5 = r5 & r9
            if (r5 == 0) goto L_0x0450
            boolean r5 = r10.f228579c
            if (r5 == 0) goto L_0x0450
            r5 = 2132090652(0x7f151f1c, float:1.982165E38)
            r10 = 2132090651(0x7f151f1b, float:1.9821648E38)
            r13 = 2132090653(0x7f151f1d, float:1.9821652E38)
            java.lang.String r14 = "https://www.gstatic.com/images/icons/material/system/2x/https_grey600_48dp.png"
            com.google.assistant.at.ado r4 = m182794c(r4, r13, r14, r5, r10)
            r7.mo53399a(r4)
        L_0x0450:
            com.google.protobuf.bv r4 = r7.build()
            com.google.assistant.at.tq r4 = (com.google.assistant.p3861at.C50345tq) r4
            r11.copyOnWrite()
            com.google.protobuf.bv r5 = r11.instance
            com.google.assistant.at.ud r5 = (com.google.assistant.p3861at.C50359ud) r5
            r4.getClass()
            r5.f131085d = r4
            int r4 = r5.f131082a
            r4 = r4 | r12
            r5.f131082a = r4
            com.google.protobuf.bv r4 = r11.build()
            com.google.assistant.at.ud r4 = (com.google.assistant.p3861at.C50359ud) r4
            r8.copyOnWrite()
            com.google.protobuf.bv r5 = r8.instance
            com.google.assistant.at.ug r5 = (com.google.assistant.p3861at.C50362ug) r5
            r4.getClass()
            r5.f131100c = r4
            int r4 = r5.f131098a
            r4 = r4 | r9
            r5.f131098a = r4
            com.google.protobuf.bv r4 = r8.build()
            r7 = r4
            com.google.assistant.at.ug r7 = (com.google.assistant.p3861at.C50362ug) r7
            goto L_0x051f
        L_0x0487:
            com.google.assistant.at.ug r4 = com.google.assistant.p3861at.C50362ug.f131096h
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.assistant.at.tl r4 = (com.google.assistant.p3861at.C50340tl) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.assistant.at.ug r5 = (com.google.assistant.p3861at.C50362ug) r5
            r5.f131099b = r12
            int r7 = r5.f131098a
            r8 = 1
            r7 = r7 | r8
            r5.f131098a = r7
            android.content.res.Resources r5 = r1.f305910j
            com.google.assistant.at.uf r7 = com.google.assistant.p3861at.C50361uf.f131089f
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.assistant.at.ue r7 = (com.google.assistant.p3861at.C50360ue) r7
            r8 = 2132090497(0x7f151e81, float:1.9821336E38)
            java.lang.String r8 = r5.getString(r8)
            r7.copyOnWrite()
            com.google.protobuf.bv r10 = r7.instance
            com.google.assistant.at.uf r10 = (com.google.assistant.p3861at.C50361uf) r10
            r8.getClass()
            int r13 = r10.f131091a
            r13 = r13 | r9
            r10.f131091a = r13
            r10.f131093c = r8
            r8 = 2132090494(0x7f151e7e, float:1.982133E38)
            java.lang.String r8 = r5.getString(r8)
            r7.copyOnWrite()
            com.google.protobuf.bv r10 = r7.instance
            com.google.assistant.at.uf r10 = (com.google.assistant.p3861at.C50361uf) r10
            r8.getClass()
            int r13 = r10.f131091a
            r12 = r12 | r13
            r10.f131091a = r12
            r10.f131094d = r8
            java.lang.String r5 = r5.getString(r11)
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.assistant.at.uf r8 = (com.google.assistant.p3861at.C50361uf) r8
            r5.getClass()
            int r10 = r8.f131091a
            r10 = r10 | 8
            r8.f131091a = r10
            r8.f131095e = r5
            r7.copyOnWrite()
            com.google.protobuf.bv r5 = r7.instance
            com.google.assistant.at.uf r5 = (com.google.assistant.p3861at.C50361uf) r5
            int r8 = r5.f131091a
            r10 = 1
            r8 = r8 | r10
            r5.f131091a = r8
            r8 = 46427(0xb55b, float:6.5058E-41)
            r5.f131092b = r8
            com.google.protobuf.bv r5 = r7.build()
            com.google.assistant.at.uf r5 = (com.google.assistant.p3861at.C50361uf) r5
            r4.copyOnWrite()
            com.google.protobuf.bv r7 = r4.instance
            com.google.assistant.at.ug r7 = (com.google.assistant.p3861at.C50362ug) r7
            r5.getClass()
            r7.f131103f = r5
            int r5 = r7.f131098a
            r5 = r5 | 8
            r7.f131098a = r5
            com.google.protobuf.bv r4 = r4.build()
            r7 = r4
            com.google.assistant.at.ug r7 = (com.google.assistant.p3861at.C50362ug) r7
        L_0x051f:
            int r4 = r0.f128894a
            r4 = r4 & 16
            if (r4 == 0) goto L_0x0532
            com.google.assistant.at.b r0 = r0.f128899f
            if (r0 != 0) goto L_0x052b
            com.google.assistant.at.b r0 = com.google.assistant.p3861at.C49842b.f129519l
        L_0x052b:
            java.lang.String r0 = r0.f129528h
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x0534
        L_0x0532:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x0534:
            int r4 = r6.f130386a
            r4 = r4 & r9
            if (r4 == 0) goto L_0x0546
            int r4 = r6.f130388c
            int r4 = com.google.assistant.p3861at.C50151ml.m85780a(r4)
            if (r4 != 0) goto L_0x0542
            goto L_0x0546
        L_0x0542:
            if (r4 != r9) goto L_0x0546
            r4 = 1
            goto L_0x0547
        L_0x0546:
            r4 = 0
        L_0x0547:
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.c r5 = new com.google.android.apps.gsa.staticplugins.opa.omniconsent.c
            r5.<init>()
            com.google.common.base.b r6 = com.google.common.base.C58836b.f156633a
            r5.f305978a = r6
            com.google.assistant.at.ug r6 = com.google.assistant.p3861at.C50362ug.f131096h
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.assistant.at.tl r6 = (com.google.assistant.p3861at.C50340tl) r6
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.assistant.at.ug r8 = (com.google.assistant.p3861at.C50362ug) r8
            r8.f131099b = r9
            int r10 = r8.f131098a
            r11 = 1
            r10 = r10 | r11
            r8.f131098a = r10
            com.google.protobuf.bv r6 = r6.build()
            com.google.assistant.at.ug r6 = (com.google.assistant.p3861at.C50362ug) r6
            r5.mo98111b(r6)
            com.google.common.base.b r6 = com.google.common.base.C58836b.f156633a
            r5.f305980c = r6
            r6 = 0
            r5.mo98110a(r6)
            r5.mo98112c(r6)
            if (r2 == 0) goto L_0x05db
            r5.f305978a = r2
            r5.mo98110a(r3)
            r5.mo98111b(r7)
            r5.f305980c = r0
            r5.mo98112c(r4)
            byte r0 = r5.f305983f
            r2 = 3
            if (r0 != r2) goto L_0x05a8
            com.google.assistant.at.ug r12 = r5.f305979b
            if (r12 != 0) goto L_0x0594
            goto L_0x05a8
        L_0x0594:
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.d r0 = new com.google.android.apps.gsa.staticplugins.opa.omniconsent.d
            com.google.common.base.ax r11 = r5.f305978a
            com.google.common.base.ax r13 = r5.f305980c
            boolean r14 = r5.f305981d
            boolean r15 = r5.f305982e
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.e r2 = new com.google.android.apps.gsa.staticplugins.opa.omniconsent.e
            r2.<init>(r9, r0)
            return r2
        L_0x05a8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.google.assistant.at.ug r2 = r5.f305979b
            if (r2 != 0) goto L_0x05b6
            java.lang.String r2 = " omniconsentUi"
            r0.append(r2)
        L_0x05b6:
            byte r2 = r5.f305983f
            r3 = 1
            r2 = r2 & r3
            if (r2 != 0) goto L_0x05c1
            java.lang.String r2 = " isEligibleForGoogleNow"
            r0.append(r2)
        L_0x05c1:
            byte r2 = r5.f305983f
            r2 = r2 & r9
            if (r2 != 0) goto L_0x05cb
            java.lang.String r2 = " useNeutralButtons"
            r0.append(r2)
        L_0x05cb:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Missing required properties:"
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r3.concat(r0)
            r2.<init>(r0)
            throw r2
        L_0x05db:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r2 = "Null valuePropUrl"
            r0.<init>(r2)
            throw r0
        L_0x05e3:
            r0 = move-exception
            com.google.common.f.e r4 = f305901a
            com.google.common.f.x r4 = r4.mo56225c()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r5, r2)
            java.lang.String r2 = "combine: settingsUi failed"
            r5 = 25257(0x62a9, float:3.5393E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56382g(r0)).mo56372aa(r5)).mo56386p(r2)
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.e r0 = new com.google.android.apps.gsa.staticplugins.opa.omniconsent.e
            r2 = 0
            r0.<init>(r2, r3)
            return r0
        L_0x05fd:
            r0 = move-exception
            com.google.common.f.e r4 = f305901a
            com.google.common.f.x r4 = r4.mo56225c()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r5, r2)
            java.lang.String r2 = "combine: settingsUi timed out"
            r5 = 25256(0x62a8, float:3.5391E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56382g(r0)).mo56372aa(r5)).mo56386p(r2)
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.e r0 = new com.google.android.apps.gsa.staticplugins.opa.omniconsent.e
            r2 = 1
            r0.<init>(r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.omniconsent.C109782ab.mo98108a(com.google.common.util.concurrent.cx, com.google.common.util.concurrent.cx, com.google.common.util.concurrent.cx, com.google.common.util.concurrent.cx, com.google.android.apps.gsa.opaonboarding.ar):com.google.android.apps.gsa.staticplugins.opa.omniconsent.af");
    }

    /* renamed from: b */
    public final String mo98109b(int i) {
        return (String) this.f305904d.mo79752r(C90014bt.f247516id).get(Integer.toString(i));
    }
}
