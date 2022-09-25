package com.google.android.apps.gsa.staticplugins.p7706ct;

import com.google.android.apps.gsa.g.f.b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.ct.n */
/* compiled from: PG */
public final /* synthetic */ class C98544n implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C98555y f275168a;

    /* renamed from: b */
    public final /* synthetic */ Query f275169b;

    /* renamed from: c */
    public final /* synthetic */ b f275170c;

    /* renamed from: d */
    public final /* synthetic */ C58833ax f275171d;

    /* renamed from: e */
    public final /* synthetic */ boolean f275172e;

    /* renamed from: f */
    public final /* synthetic */ C86124t f275173f;

    public /* synthetic */ C98544n(C98555y yVar, Query query, b bVar, C58833ax axVar, boolean z, C86124t tVar) {
        this.f275168a = yVar;
        this.f275169b = query;
        this.f275170c = bVar;
        this.f275171d = axVar;
        this.f275172e = z;
        this.f275173f = tVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x030e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo17947a() {
        /*
            r16 = this;
            r0 = r16
            com.google.android.apps.gsa.staticplugins.ct.y r1 = r0.f275168a
            com.google.android.apps.gsa.shared.search.Query r2 = r0.f275169b
            com.google.android.apps.gsa.g.f.b r3 = r0.f275170c
            com.google.common.base.ax r4 = r0.f275171d
            boolean r5 = r0.f275172e
            com.google.android.apps.gsa.search.core.i.t r6 = r0.f275173f
            dagger.a r7 = r1.f275231k
            java.lang.Object r7 = r7.mo27525b()
            if (r7 != 0) goto L_0x0018
            r7 = 0
            goto L_0x0024
        L_0x0018:
            dagger.a r7 = r1.f275231k
            java.lang.Object r7 = r7.mo27525b()
            com.google.android.apps.gsa.search.shared.d.c r7 = (com.google.android.apps.gsa.search.shared.p6926d.C87541c) r7
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r7 = r7.mo81643e()
        L_0x0024:
            if (r7 != 0) goto L_0x0029
            com.google.bb.a.ab r7 = com.google.p4152bb.p4153a.C54944ab.UNKNOWN
            goto L_0x003b
        L_0x0029:
            int r7 = r7.f236259m
            com.google.bb.a.ab r7 = com.google.p4152bb.p4153a.C54944ab.m87544a(r7)
            com.google.common.base.ax r7 = com.google.common.base.C58833ax.m90833j(r7)
            com.google.bb.a.ab r9 = com.google.p4152bb.p4153a.C54944ab.UNKNOWN
            java.lang.Object r7 = r7.mo56109e(r9)
            com.google.bb.a.ab r7 = (com.google.p4152bb.p4153a.C54944ab) r7
        L_0x003b:
            int r9 = r3.b
            r13 = 1
            if (r9 != r13) goto L_0x0223
            com.google.android.speech.embedded.TaggerResult r9 = r3.c
            r9.getClass()
            com.google.common.f.e r14 = com.google.android.apps.gsa.staticplugins.p7706ct.C98555y.f275209a
            com.google.common.f.x r14 = r14.mo56224b()
            java.lang.String r15 = "Pumpkin returned a match."
            r10 = 30828(0x786c, float:4.3199E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56372aa(r10)).mo56386p(r15)
            boolean r10 = r1.f275210A
            com.google.common.f.e r10 = com.google.android.apps.gsa.staticplugins.p7706ct.C98555y.f275209a
            com.google.common.f.x r10 = r10.mo56224b()
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r5)
            r15 = 30829(0x786d, float:4.32E-41)
            java.lang.String r8 = "Offline Action Enabled: %b"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r15)).mo56389s(r8, r14)
            boolean r8 = r4.mo56113h()
            if (r8 == 0) goto L_0x00b5
            if (r5 == 0) goto L_0x00b5
            java.lang.Object r5 = r4.mo56107c()
            com.google.android.apps.gsa.search.core.ak.a.z r5 = (com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84599z) r5
            com.google.speech.grammar.pumpkin.s r8 = r3.e
            java.lang.CharSequence r10 = r2.f252768g
            com.google.android.apps.gsa.shared.util.C90741ay.m148210b(r10)
            com.google.bb.a.pb r5 = r5.mo78366a(r9, r8, r2)
            r8 = 1056964608(0x3f000000, float:0.5)
            if (r5 == 0) goto L_0x0088
            float r10 = r5.f145833b
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 > 0) goto L_0x00b6
        L_0x0088:
            java.util.List r10 = r3.d
            java.util.Iterator r10 = r10.iterator()
        L_0x008e:
            boolean r14 = r10.hasNext()
            if (r14 == 0) goto L_0x00b6
            java.lang.Object r14 = r10.next()
            com.google.android.speech.embedded.TaggerResult r14 = (com.google.android.speech.embedded.TaggerResult) r14
            java.lang.Object r15 = r4.mo56107c()
            com.google.android.apps.gsa.search.core.ak.a.z r15 = (com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84599z) r15
            com.google.speech.grammar.pumpkin.s r12 = r3.e
            java.lang.CharSequence r11 = r2.f252768g
            com.google.android.apps.gsa.shared.util.C90741ay.m148210b(r11)
            com.google.bb.a.pb r11 = r15.mo78366a(r14, r12, r2)
            if (r11 == 0) goto L_0x008e
            float r12 = r11.f145833b
            int r12 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r12 <= 0) goto L_0x008e
            r5 = r11
            goto L_0x00b6
        L_0x00b5:
            r5 = 0
        L_0x00b6:
            com.google.android.apps.gsa.shared.logger.b.i r3 = r1.f275235o
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OFFLINE_PUMPKIN_TAGGER_GET_ACTION_DATA
            r3.mo83702b(r4)
            boolean r3 = r2.mo84466dt()
            if (r3 == 0) goto L_0x00e1
            com.google.cm.d.a.b r3 = com.google.p4500cm.p4518d.p4519a.C58179b.f155534j
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.cm.d.a.a r3 = (com.google.p4500cm.p4518d.p4519a.C58178a) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.cm.d.a.b r4 = (com.google.p4500cm.p4518d.p4519a.C58179b) r4
            int r8 = r4.f155536a
            r8 = r8 | 2048(0x800, float:2.87E-42)
            r4.f155536a = r8
            r4.f155544i = r13
            com.google.protobuf.bv r3 = r3.build()
            com.google.cm.d.a.b r3 = (com.google.p4500cm.p4518d.p4519a.C58179b) r3
            goto L_0x00e2
        L_0x00e1:
            r3 = 0
        L_0x00e2:
            dagger.a r4 = r1.f275231k
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.search.shared.d.c r4 = (com.google.android.apps.gsa.search.shared.p6926d.C87541c) r4
            if (r5 == 0) goto L_0x011d
            com.google.protobuf.cq r8 = r5.f145835d
            int r8 = r8.size()
            if (r8 == 0) goto L_0x011d
            com.google.protobuf.cq r8 = r5.f145835d
            r10 = 0
            java.lang.Object r8 = r8.get(r10)
            com.google.bb.a.ad r8 = (com.google.p4152bb.p4153a.C54946ad) r8
            int r8 = r8.f144533a
            r8 = r8 & 16
            if (r8 == 0) goto L_0x011e
            com.google.protobuf.cq r4 = r5.f145835d
            java.lang.Object r4 = r4.get(r10)
            com.google.bb.a.ad r4 = (com.google.p4152bb.p4153a.C54946ad) r4
            com.google.bb.a.af r4 = r4.f144536d
            if (r4 != 0) goto L_0x0111
            com.google.bb.a.af r4 = com.google.p4152bb.p4153a.C54948af.f144541h
        L_0x0111:
            int r4 = r4.f144544b
            com.google.bb.a.x r4 = com.google.p4152bb.p4153a.C55421x.m87686a(r4)
            if (r4 != 0) goto L_0x01e9
            com.google.bb.a.x r4 = com.google.p4152bb.p4153a.C55421x.UNKNOWN_ACTION_TYPE
            goto L_0x01e9
        L_0x011d:
            r10 = 0
        L_0x011e:
            java.lang.String r8 = r9.f118518a
            java.lang.String r11 = "CallContact"
            boolean r11 = r11.equals(r8)
            if (r11 == 0) goto L_0x012c
            com.google.bb.a.x r4 = com.google.p4152bb.p4153a.C55421x.PHONE_CALL_CONTACT
            goto L_0x01e9
        L_0x012c:
            java.lang.String r11 = "AmbiguousCommunicationAction"
            boolean r11 = r11.equals(r8)
            if (r11 == 0) goto L_0x0138
            com.google.bb.a.x r4 = com.google.p4152bb.p4153a.C55421x.PHONE_CALL_CONTACT
            goto L_0x01e9
        L_0x0138:
            java.lang.String r11 = "CallNumber"
            boolean r11 = r11.equals(r8)
            if (r11 == 0) goto L_0x0144
            com.google.bb.a.x r4 = com.google.p4152bb.p4153a.C55421x.PHONE_CALL_NUMBER
            goto L_0x01e9
        L_0x0144:
            java.lang.String r11 = "OpenApp"
            boolean r11 = r11.equals(r8)
            if (r11 == 0) goto L_0x0150
            com.google.bb.a.x r4 = com.google.p4152bb.p4153a.C55421x.OPEN_APP
            goto L_0x01e9
        L_0x0150:
            java.lang.String r11 = "SendTextToContact"
            boolean r11 = r11.equals(r8)
            if (r11 == 0) goto L_0x015c
            com.google.bb.a.x r4 = com.google.p4152bb.p4153a.C55421x.SMS
            goto L_0x01e9
        L_0x015c:
            java.lang.String r11 = "Undo"
            boolean r11 = r11.equals(r8)
            if (r11 != 0) goto L_0x01e7
            java.lang.String r11 = "Redo"
            boolean r11 = r11.equals(r8)
            if (r11 != 0) goto L_0x01e7
            java.lang.String r11 = "Cancel"
            boolean r11 = r11.equals(r8)
            if (r11 == 0) goto L_0x0176
            goto L_0x01e7
        L_0x0176:
            java.lang.String r11 = "Selection"
            boolean r11 = r11.equals(r8)
            if (r11 != 0) goto L_0x01cd
            java.lang.String r11 = "SelectRecipient"
            boolean r11 = r11.equals(r8)
            if (r11 != 0) goto L_0x01cd
            java.lang.String r11 = "ConfirmRelationship"
            boolean r11 = r11.equals(r8)
            if (r11 != 0) goto L_0x01cd
            java.lang.String r11 = "SetMessage"
            boolean r11 = r11.equals(r8)
            if (r11 != 0) goto L_0x01cd
            java.lang.String r11 = "Affirmative"
            boolean r11 = r11.equals(r8)
            if (r11 != 0) goto L_0x01cd
            java.lang.String r11 = "Negative"
            boolean r11 = r11.equals(r8)
            if (r11 == 0) goto L_0x01a7
            goto L_0x01cd
        L_0x01a7:
            java.lang.String r4 = "AddRelationship"
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x01b2
            com.google.bb.a.x r4 = com.google.p4152bb.p4153a.C55421x.ADD_RELATIONSHIP
            goto L_0x01e9
        L_0x01b2:
            java.lang.String r4 = "RemoveRelationship"
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x01bd
            com.google.bb.a.x r4 = com.google.p4152bb.p4153a.C55421x.REMOVE_RELATIONSHIP
            goto L_0x01e9
        L_0x01bd:
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.p7706ct.C98555y.f275209a
            com.google.common.f.x r4 = r4.mo56226d()
            java.lang.String r11 = "Unknown action: %s"
            r12 = 30833(0x7871, float:4.3206E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r12)).mo56389s(r11, r8)
            com.google.bb.a.x r4 = com.google.p4152bb.p4153a.C55421x.UNKNOWN_ACTION_TYPE
            goto L_0x01e9
        L_0x01cd:
            if (r4 != 0) goto L_0x01d2
            com.google.bb.a.x r4 = com.google.p4152bb.p4153a.C55421x.UNKNOWN_ACTION_TYPE
            goto L_0x01e9
        L_0x01d2:
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r4 = r4.mo81641b()
            if (r4 == 0) goto L_0x01e4
            boolean r8 = r4.mo81077p()
            if (r8 != 0) goto L_0x01df
            goto L_0x01e4
        L_0x01df:
            com.google.bb.a.x r4 = r4.mo81066g()
            goto L_0x01e9
        L_0x01e4:
            com.google.bb.a.x r4 = com.google.p4152bb.p4153a.C55421x.UNKNOWN_ACTION_TYPE
            goto L_0x01e9
        L_0x01e7:
            com.google.bb.a.x r4 = com.google.p4152bb.p4153a.C55421x.UNKNOWN_ACTION_TYPE
        L_0x01e9:
            if (r5 != 0) goto L_0x021c
            dagger.a r8 = r1.f275231k
            java.lang.Object r8 = r8.mo27525b()
            if (r8 == 0) goto L_0x021c
            dagger.a r8 = r1.f275231k
            java.lang.Object r8 = r8.mo27525b()
            com.google.android.apps.gsa.search.shared.d.c r8 = (com.google.android.apps.gsa.search.shared.p6926d.C87541c) r8
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r8 = r8.mo81641b()
            if (r8 == 0) goto L_0x0213
            dagger.a r8 = r1.f275231k
            java.lang.Object r8 = r8.mo27525b()
            com.google.android.apps.gsa.search.shared.d.c r8 = (com.google.android.apps.gsa.search.shared.p6926d.C87541c) r8
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r8 = r8.mo81641b()
            if (r8 == 0) goto L_0x021c
            com.google.bb.a.ab r8 = com.google.p4152bb.p4153a.C54944ab.UNKNOWN
            if (r7 != r8) goto L_0x021c
        L_0x0213:
            boolean r7 = r2.mo84332bQ()
            if (r7 == 0) goto L_0x021c
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
            goto L_0x028b
        L_0x021c:
            com.google.android.apps.gsa.shared.s.a.a r7 = r1.f275234n
            com.google.common.base.ax r1 = r1.mo91176j(r9, r5, r4, r3)
            goto L_0x028b
        L_0x0223:
            r4 = 2
            r10 = 0
            if (r9 != r4) goto L_0x028d
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.p7706ct.C98555y.f275209a
            com.google.common.f.x r3 = r3.mo56224b()
            java.lang.String r4 = "Pumpkin returned no matches."
            r5 = 30827(0x786b, float:4.3198E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r5)).mo56386p(r4)
            r3 = 98
            com.google.android.apps.gsa.shared.logger.C89949q.m146523g(r3)
            boolean r3 = r2.mo84332bQ()
            if (r3 == 0) goto L_0x0289
            dagger.a r3 = r1.f275231k
            java.lang.Object r3 = r3.mo27525b()
            if (r3 == 0) goto L_0x0289
            dagger.a r3 = r1.f275231k
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.search.shared.d.c r3 = (com.google.android.apps.gsa.search.shared.p6926d.C87541c) r3
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r3 = r3.mo81641b()
            if (r3 == 0) goto L_0x0289
            com.google.bb.a.ab r3 = com.google.p4152bb.p4153a.C54944ab.UNKNOWN
            if (r7 == r3) goto L_0x0289
            com.google.speech.grammar.pumpkin.q r3 = com.google.speech.grammar.pumpkin.C66525q.f180929f
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.speech.grammar.pumpkin.p r3 = (com.google.speech.grammar.pumpkin.C66524p) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.speech.grammar.pumpkin.q r4 = (com.google.speech.grammar.pumpkin.C66525q) r4
            int r5 = r4.f180931a
            r7 = 2
            r5 = r5 | r7
            r4.f180931a = r5
            java.lang.String r5 = "OfflineFollowOnNoMatch"
            r4.f180932b = r5
            com.google.protobuf.bv r3 = r3.build()
            com.google.speech.grammar.pumpkin.q r3 = (com.google.speech.grammar.pumpkin.C66525q) r3
            com.google.android.speech.embedded.TaggerResult r4 = new com.google.android.speech.embedded.TaggerResult
            com.google.common.o.te r5 = com.google.common.p4552o.C60527te.f163903c
            r4.<init>(r3, r5)
            com.google.bb.a.x r3 = com.google.p4152bb.p4153a.C55421x.UNKNOWN_ACTION_TYPE
            com.google.android.apps.gsa.shared.s.a.a r5 = r1.f275234n
            r5 = 0
            com.google.common.base.ax r1 = r1.mo91176j(r4, r5, r3, r5)
            goto L_0x028b
        L_0x0289:
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
        L_0x028b:
            r4 = 3
            goto L_0x02e7
        L_0x028d:
            r4 = 3
            if (r9 != r4) goto L_0x02db
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.p7706ct.C98555y.f275209a
            com.google.common.f.x r3 = r3.mo56224b()
            java.lang.String r5 = "Pumpkin failed to disambiguate."
            r7 = 30826(0x786a, float:4.3196E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r7)).mo56386p(r5)
            r3 = 137(0x89, float:1.92E-43)
            com.google.android.apps.gsa.shared.logger.C89949q.m146523g(r3)
            boolean r3 = r2.mo84332bQ()
            if (r3 == 0) goto L_0x02d8
            com.google.speech.grammar.pumpkin.q r3 = com.google.speech.grammar.pumpkin.C66525q.f180929f
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.speech.grammar.pumpkin.p r3 = (com.google.speech.grammar.pumpkin.C66524p) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.speech.grammar.pumpkin.q r5 = (com.google.speech.grammar.pumpkin.C66525q) r5
            int r7 = r5.f180931a
            r8 = 2
            r7 = r7 | r8
            r5.f180931a = r7
            java.lang.String r7 = "OfflineDisambiguationFailure"
            r5.f180932b = r7
            com.google.protobuf.bv r3 = r3.build()
            com.google.speech.grammar.pumpkin.q r3 = (com.google.speech.grammar.pumpkin.C66525q) r3
            com.google.android.speech.embedded.TaggerResult r5 = new com.google.android.speech.embedded.TaggerResult
            com.google.common.o.te r7 = com.google.common.p4552o.C60527te.f163903c
            r5.<init>(r3, r7)
            com.google.bb.a.x r3 = com.google.p4152bb.p4153a.C55421x.UNKNOWN_ACTION_TYPE
            com.google.android.apps.gsa.shared.s.a.a r7 = r1.f275234n
            r7 = 0
            com.google.common.base.ax r1 = r1.mo91176j(r5, r7, r3, r7)
            goto L_0x02e7
        L_0x02d8:
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
            goto L_0x02e7
        L_0x02db:
            com.google.android.apps.gsa.g.f.b r1 = com.google.android.apps.gsa.g.f.b.a
            if (r3 != r1) goto L_0x02e1
            r1 = 1
            goto L_0x02e2
        L_0x02e1:
            r1 = 0
        L_0x02e2:
            com.google.common.base.C58838bb.m90868c(r1)
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
        L_0x02e7:
            boolean r3 = r2.mo84412cs()
            if (r3 != 0) goto L_0x030e
            boolean r3 = r2.mo84457dk()
            if (r3 != 0) goto L_0x030e
            java.lang.String r3 = "and.opa.screenless.proxyvoice"
            java.lang.String r5 = r2.mo84355bn()
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x030e
            java.lang.String r3 = "and.opa.appinteg.waze"
            java.lang.String r5 = r2.mo84355bn()
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x030c
            goto L_0x030e
        L_0x030c:
            r11 = 0
            goto L_0x030f
        L_0x030e:
            r11 = 1
        L_0x030f:
            boolean r3 = r1.mo56113h()
            if (r3 == 0) goto L_0x0385
            boolean r3 = r2.mo84403cj()
            if (r3 == 0) goto L_0x0385
            if (r11 != 0) goto L_0x0385
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247228dG
            boolean r3 = r6.mo79746e(r3)
            com.google.android.libraries.logging.j r5 = new com.google.android.libraries.logging.j
            r6 = 97240(0x17bd8, float:1.36262E-40)
            r5.<init>(r6)
            if (r3 == 0) goto L_0x032f
            r10 = 1
            goto L_0x0330
        L_0x032f:
            r10 = 3
        L_0x0330:
            r5.mo33794h(r10)
            com.google.common.b.gu r4 = com.google.common.p4522b.C58485gu.m89845m()
            com.google.android.libraries.logging.k r4 = com.google.android.libraries.logging.C28293k.m52907d(r5, r4)
            r5 = 97241(0x17bd9, float:1.36264E-40)
            com.google.common.o.oe r4 = com.google.android.libraries.logging.C28285c.m52875b(r4, r5)
            if (r4 == 0) goto L_0x037f
            com.google.common.o.uf r5 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.common.o.tz r5 = (com.google.common.p4552o.C60548tz) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.common.o.uf r6 = (com.google.common.p4552o.C60555uf) r6
            int r7 = r6.f164093a
            r8 = 2
            r7 = r7 | r8
            r6.f164093a = r7
            r7 = 472(0x1d8, float:6.61E-43)
            r6.f164258m = r7
            long r6 = r2.f252749G
            java.lang.String r2 = com.google.android.libraries.search.logging.p3043f.C39191a.m68623b(r6)
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.common.o.uf r6 = (com.google.common.p4552o.C60555uf) r6
            r2.getClass()
            int r7 = r6.f164093a
            r7 = r7 | 4
            r6.f164093a = r7
            r6.f164259n = r2
            com.google.protobuf.bv r2 = r5.build()
            com.google.common.o.uf r2 = (com.google.common.p4552o.C60555uf) r2
            r5 = 0
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r2, r4, r5, r5)
        L_0x037f:
            if (r3 != 0) goto L_0x0385
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
        L_0x0385:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7706ct.C98544n.mo17947a():java.lang.Object");
    }
}
