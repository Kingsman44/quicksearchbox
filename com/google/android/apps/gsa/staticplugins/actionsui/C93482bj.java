package com.google.android.apps.gsa.staticplugins.actionsui;

import android.content.Context;
import android.view.View;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.actions.C87423k;
import com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.core.CommunicationAction;
import com.google.android.apps.gsa.search.shared.actions.errors.VoiceSearchError;
import com.google.android.apps.gsa.search.shared.actions.p6921b.C87400a;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.search.shared.contact.Person;
import com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88512f;
import com.google.android.apps.gsa.search.shared.service.C87681ai;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87772d;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87799e;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87826f;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87862gi;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87863gj;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87864gk;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87899hs;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87900ht;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87901hu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87934j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87961k;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87984kw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87985kx;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87986ky;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87988l;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88213ti;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88214tj;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88215tk;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88227tw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88228tx;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88229ty;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7065j.C89932c;
import com.google.android.apps.gsa.shared.logger.p7065j.C89933d;
import com.google.android.apps.gsa.shared.p7195y.C91183ao;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90932cb;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.actions.p7361g.C93388b;
import com.google.android.apps.gsa.staticplugins.actions.p7361g.C93389c;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.android.speech.embedded.TaggerResult;
import com.google.common.base.C58881cr;
import com.google.common.p4552o.C59752ei;
import com.google.common.p4552o.C59753ej;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60480rl;
import com.google.common.p4552o.C60482rn;
import com.google.common.p4552o.C60527te;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.p4152bb.p4153a.C55421x;
import com.google.p4500cm.p4518d.p4519a.C58179b;
import com.google.p4500cm.p4518d.p4519a.C58181d;
import com.google.protobuf.C62940bt;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.bj */
/* compiled from: PG */
public final class C93482bj implements C88512f {

    /* renamed from: a */
    public boolean f260880a;

    /* renamed from: b */
    public Query f260881b = Query.f252741b;

    /* renamed from: c */
    public CardDecision f260882c = CardDecision.f236248b;

    /* renamed from: d */
    private final C89932c f260883d;

    /* renamed from: e */
    private final C91097g f260884e;

    /* renamed from: f */
    private final C87681ai f260885f;

    /* renamed from: g */
    private final C90932cb f260886g;

    /* renamed from: h */
    private final C68214a f260887h;

    /* renamed from: i */
    private final Context f260888i;

    /* renamed from: j */
    private boolean f260889j;

    /* renamed from: k */
    private ActionData f260890k;

    /* renamed from: l */
    private C93389c f260891l;

    /* renamed from: m */
    private boolean f260892m;

    /* renamed from: n */
    private boolean f260893n;

    /* renamed from: o */
    private boolean f260894o;

    /* renamed from: p */
    private boolean f260895p;

    /* renamed from: q */
    private C91189au f260896q;

    /* renamed from: r */
    private final C58881cr f260897r;

    public C93482bj(C90932cb cbVar, C58881cr crVar, ActionData actionData, C89932c cVar, C91097g gVar, C68214a aVar, C87681ai aiVar, Context context) {
        this.f260897r = crVar;
        this.f260890k = actionData;
        this.f260884e = gVar;
        cbVar.getClass();
        this.f260886g = cbVar;
        this.f260891l = new C93389c(cbVar);
        this.f260883d = cVar;
        this.f260887h = aVar;
        this.f260885f = aiVar;
        this.f260888i = context;
    }

    /* renamed from: U */
    private final void m153874U(Integer num, VoiceAction voiceAction) {
        voiceAction.mo81071hx(num.intValue(), (Long) null, this.f260882c, mo82096d());
    }

    /* renamed from: V */
    private final void m153875V(VoiceAction voiceAction, boolean z, boolean z2, boolean z3) {
        C88489j jVar = new C88489j(C87739bu.ACTION_CHANGED_EXTERNALLY);
        C62940bt btVar = C87772d.f237543a;
        C87799e eVar = (C87799e) C87826f.f237631e.createBuilder();
        eVar.copyOnWrite();
        C87826f fVar = (C87826f) eVar.instance;
        fVar.f237633a |= 1;
        fVar.f237634b = z;
        eVar.copyOnWrite();
        C87826f fVar2 = (C87826f) eVar.instance;
        fVar2.f237633a |= 2;
        fVar2.f237635c = z2;
        eVar.copyOnWrite();
        C87826f fVar3 = (C87826f) eVar.instance;
        fVar3.f237633a |= 4;
        fVar3.f237636d = z3;
        jVar.mo82014b(btVar, (C87826f) eVar.build());
        jVar.mo82015c(new ParcelableVoiceAction(voiceAction));
        this.f260885f.mo81937i(jVar.mo82013a());
    }

    /* renamed from: W */
    private final void m153876W(int i) {
        C88489j jVar = new C88489j(C87739bu.SET_GWS_LOGGABLE_EVENT);
        C62940bt btVar = C87862gi.f237708a;
        C87863gj gjVar = (C87863gj) C87864gk.f237709c.createBuilder();
        gjVar.copyOnWrite();
        C87864gk gkVar = (C87864gk) gjVar.instance;
        gkVar.f237711a |= 1;
        gkVar.f237712b = i;
        jVar.mo82014b(btVar, (C87864gk) gjVar.build());
        jVar.mo82015c(this.f260890k);
        this.f260885f.mo81937i(jVar.mo82013a());
    }

    /* renamed from: A */
    public final void mo82074A(boolean z) {
        this.f260892m = z;
    }

    /* renamed from: B */
    public final void mo82075B(VoiceAction voiceAction) {
        m153875V(voiceAction, false, true, true);
    }

    /* renamed from: C */
    public final void mo82076C(VoiceAction voiceAction) {
        m153875V(voiceAction, true, true, true);
    }

    /* renamed from: D */
    public final boolean mo82077D() {
        C93389c cVar = this.f260891l;
        boolean z = true;
        if (cVar.f260473c != 1) {
            z = false;
        }
        cVar.f260471a.mo85149n(cVar.f260472b);
        cVar.f260473c = 2;
        return z;
    }

    /* renamed from: E */
    public final boolean mo82078E() {
        return this.f260890k.mo81095g();
    }

    /* renamed from: F */
    public final boolean mo82079F() {
        return this.f260895p;
    }

    /* renamed from: G */
    public final boolean mo82080G() {
        return this.f260891l.f260473c == 1;
    }

    /* renamed from: H */
    public final boolean mo82081H() {
        ActionData actionData = this.f260890k;
        return actionData != null && actionData.mo81099j();
    }

    /* renamed from: I */
    public final boolean mo82082I() {
        return mo82081H() && this.f260890k.mo81089a() == 0;
    }

    /* renamed from: J */
    public final boolean mo82083J() {
        return this.f260892m;
    }

    /* renamed from: K */
    public final boolean mo82084K() {
        this.f260885f.mo81937i(new C88489j(C87739bu.HANDLE_ACTIONS_BACK_PRESS).mo82013a());
        return true;
    }

    /* renamed from: L */
    public final boolean mo82085L() {
        if (!this.f260880a) {
            return false;
        }
        this.f260880a = false;
        return true;
    }

    /* renamed from: M */
    public final boolean mo82086M() {
        return this.f260893n;
    }

    /* renamed from: N */
    public final boolean mo82087N() {
        return this.f260894o;
    }

    /* renamed from: O */
    public final boolean mo82088O(VoiceAction voiceAction) {
        int i;
        int i2;
        int i3;
        VoiceAction voiceAction2 = voiceAction;
        CardDecision cardDecision = this.f260882c;
        if (voiceAction.mo81081t()) {
            switch (cardDecision.f236259m) {
                case 1:
                    C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
                    tzVar.copyOnWrite();
                    C60555uf ufVar = (C60555uf) tzVar.instance;
                    ufVar.f164093a |= 2;
                    ufVar.f164258m = 143;
                    int i4 = mo82096d().f146230cP;
                    tzVar.copyOnWrite();
                    C60555uf ufVar2 = (C60555uf) tzVar.instance;
                    ufVar2.f164093a |= 256;
                    ufVar2.f164264s = i4;
                    C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
                    break;
                case 2:
                    C60548tz tzVar2 = (C60548tz) C60555uf.f164065cO.createBuilder();
                    tzVar2.copyOnWrite();
                    C60555uf ufVar3 = (C60555uf) tzVar2.instance;
                    ufVar3.f164093a |= 2;
                    ufVar3.f164258m = 141;
                    if (voiceAction2 instanceof CommunicationAction) {
                        C60480rl rlVar = (C60480rl) C60482rn.f163688e.createBuilder();
                        CommunicationAction communicationAction = (CommunicationAction) voiceAction2;
                        PersonDisambiguation personDisambiguation = communicationAction.f236042f;
                        if (personDisambiguation != null) {
                            i3 = personDisambiguation.f236363b.size();
                            i2 = 0;
                            for (Person s : personDisambiguation.f236363b) {
                                i2 = personDisambiguation.mo81583v() ? i2 + personDisambiguation.mo81579r(s).size() : i2 + 1;
                            }
                        } else {
                            i3 = 0;
                            i2 = 0;
                        }
                        rlVar.copyOnWrite();
                        C60482rn rnVar = (C60482rn) rlVar.instance;
                        rnVar.f163690a |= 2;
                        rnVar.f163692c = i3;
                        rlVar.copyOnWrite();
                        C60482rn rnVar2 = (C60482rn) rlVar.instance;
                        rnVar2.f163690a |= 1;
                        rnVar2.f163691b = i2;
                        switch (cardDecision.f236260n) {
                            case 24:
                                rlVar.copyOnWrite();
                                C60482rn rnVar3 = (C60482rn) rlVar.instance;
                                rnVar3.f163693d = 0;
                                rnVar3.f163690a |= 8;
                                break;
                            case 25:
                                rlVar.copyOnWrite();
                                C60482rn rnVar4 = (C60482rn) rlVar.instance;
                                rnVar4.f163693d = 1;
                                rnVar4.f163690a |= 8;
                                break;
                            case 26:
                                rlVar.copyOnWrite();
                                C60482rn rnVar5 = (C60482rn) rlVar.instance;
                                rnVar5.f163693d = 2;
                                rnVar5.f163690a |= 8;
                                break;
                            case 27:
                                rlVar.copyOnWrite();
                                C60482rn rnVar6 = (C60482rn) rlVar.instance;
                                rnVar6.f163693d = 3;
                                rnVar6.f163690a |= 8;
                                break;
                        }
                        int i5 = communicationAction.mo81066g().f146230cP;
                        tzVar2.copyOnWrite();
                        C60555uf ufVar4 = (C60555uf) tzVar2.instance;
                        ufVar4.f164093a |= 256;
                        ufVar4.f164264s = i5;
                        tzVar2.copyOnWrite();
                        C60555uf ufVar5 = (C60555uf) tzVar2.instance;
                        C60482rn rnVar7 = (C60482rn) rlVar.build();
                        rnVar7.getClass();
                        ufVar5.f164268w = rnVar7;
                        ufVar5.f164093a |= 524288;
                    }
                    C89949q.m146525j((C60555uf) tzVar2.build(), (C60321oe) null, (C63196b) null, (String) null);
                    break;
                case 3:
                    C60548tz tzVar3 = (C60548tz) C60555uf.f164065cO.createBuilder();
                    tzVar3.copyOnWrite();
                    C60555uf ufVar6 = (C60555uf) tzVar3.instance;
                    ufVar6.f164093a |= 2;
                    ufVar6.f164258m = 209;
                    int i6 = mo82096d().f146230cP;
                    tzVar3.copyOnWrite();
                    C60555uf ufVar7 = (C60555uf) tzVar3.instance;
                    ufVar7.f164093a |= 256;
                    ufVar7.f164264s = i6;
                    C89949q.m146525j((C60555uf) tzVar3.build(), (C60321oe) null, (C63196b) null, (String) null);
                    break;
                case 4:
                    C60548tz tzVar4 = (C60548tz) C60555uf.f164065cO.createBuilder();
                    tzVar4.copyOnWrite();
                    C60555uf ufVar8 = (C60555uf) tzVar4.instance;
                    ufVar8.f164093a |= 2;
                    ufVar8.f164258m = 142;
                    int i7 = mo82096d().f146230cP;
                    tzVar4.copyOnWrite();
                    C60555uf ufVar9 = (C60555uf) tzVar4.instance;
                    ufVar9.f164093a |= 256;
                    ufVar9.f164264s = i7;
                    C89949q.m146525j((C60555uf) tzVar4.build(), (C60321oe) null, (C63196b) null, (String) null);
                    break;
                case 5:
                    C60548tz tzVar5 = (C60548tz) C60555uf.f164065cO.createBuilder();
                    tzVar5.copyOnWrite();
                    C60555uf ufVar10 = (C60555uf) tzVar5.instance;
                    ufVar10.f164093a |= 2;
                    ufVar10.f164258m = 210;
                    int i8 = mo82096d().f146230cP;
                    tzVar5.copyOnWrite();
                    C60555uf ufVar11 = (C60555uf) tzVar5.instance;
                    ufVar11.f164093a |= 256;
                    ufVar11.f164264s = i8;
                    C89949q.m146525j((C60555uf) tzVar5.build(), (C60321oe) null, (C63196b) null, (String) null);
                    break;
                case 6:
                    C60548tz tzVar6 = (C60548tz) C60555uf.f164065cO.createBuilder();
                    tzVar6.copyOnWrite();
                    C60555uf ufVar12 = (C60555uf) tzVar6.instance;
                    ufVar12.f164093a |= 2;
                    ufVar12.f164258m = 155;
                    int i9 = mo82096d().f146230cP;
                    tzVar6.copyOnWrite();
                    C60555uf ufVar13 = (C60555uf) tzVar6.instance;
                    ufVar13.f164093a |= 256;
                    ufVar13.f164264s = i9;
                    C89949q.m146525j((C60555uf) tzVar6.build(), (C60321oe) null, (C63196b) null, (String) null);
                    break;
            }
            if (!cardDecision.f236255i && !this.f260889j) {
                C60548tz tzVar7 = (C60548tz) C60555uf.f164065cO.createBuilder();
                tzVar7.copyOnWrite();
                C60555uf ufVar14 = (C60555uf) tzVar7.instance;
                ufVar14.f164093a |= 2;
                ufVar14.f164258m = 157;
                String b = C39191a.m68623b(this.f260881b.f252749G);
                tzVar7.copyOnWrite();
                C60555uf ufVar15 = (C60555uf) tzVar7.instance;
                b.getClass();
                ufVar15.f164093a |= 4;
                ufVar15.f164259n = b;
                int i10 = mo82096d().f146230cP;
                tzVar7.copyOnWrite();
                C60555uf ufVar16 = (C60555uf) tzVar7.instance;
                ufVar16.f164093a |= 256;
                ufVar16.f164264s = i10;
                C89949q.m146525j((C60555uf) tzVar7.build(), (C60321oe) null, (C63196b) null, (String) null);
            }
        }
        if ((!voiceAction.mo81133M() || !cardDecision.f236255i) && this.f260890k.mo81104p()) {
            m153876W(256);
        }
        if (this.f260889j) {
            return false;
        }
        this.f260889j = true;
        if (voiceAction2 instanceof SearchError) {
            i = 433;
        } else {
            i = this.f260890k.mo81102m() ? 93 : 94;
        }
        if (i == 93) {
            m153876W(4096);
            C60548tz tzVar8 = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar8.copyOnWrite();
            C60555uf ufVar17 = (C60555uf) tzVar8.instance;
            ufVar17.f164093a |= 2;
            ufVar17.f164258m = 93;
            int i11 = mo82096d().f146230cP;
            tzVar8.copyOnWrite();
            C60555uf ufVar18 = (C60555uf) tzVar8.instance;
            ufVar18.f164093a |= 256;
            ufVar18.f164264s = i11;
            TaggerResult taggerResult = this.f260890k.f235994d;
            C60527te teVar = taggerResult != null ? taggerResult.f118519b : null;
            if (teVar != null) {
                tzVar8.copyOnWrite();
                C60555uf ufVar19 = (C60555uf) tzVar8.instance;
                ufVar19.f164069C = teVar;
                ufVar19.f164146b |= 2;
            }
            C89949q.m146525j((C60555uf) tzVar8.build(), (C60321oe) null, (C63196b) null, (String) null);
        } else {
            C60548tz tzVar9 = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar9.copyOnWrite();
            C60555uf ufVar20 = (C60555uf) tzVar9.instance;
            ufVar20.f164093a |= 2;
            ufVar20.f164258m = i;
            int i12 = mo82096d().f146230cP;
            tzVar9.copyOnWrite();
            C60555uf ufVar21 = (C60555uf) tzVar9.instance;
            ufVar21.f164093a |= 256;
            ufVar21.f164264s = i12;
            C89949q.m146525j((C60555uf) tzVar9.build(), (C60321oe) null, (C63196b) null, (String) null);
        }
        if (voiceAction2 instanceof VoiceSearchError) {
            C60548tz tzVar10 = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar10.copyOnWrite();
            C60555uf ufVar22 = (C60555uf) tzVar10.instance;
            ufVar22.f164093a |= 2;
            ufVar22.f164258m = 159;
            int i13 = mo82096d().f146230cP;
            tzVar10.copyOnWrite();
            C60555uf ufVar23 = (C60555uf) tzVar10.instance;
            ufVar23.f164093a |= 256;
            ufVar23.f164264s = i13;
            C89949q.m146525j((C60555uf) tzVar10.build(), (C60321oe) null, (C63196b) null, (String) null);
        }
        C58179b bVar = this.f260890k.f235995e;
        if (bVar != null) {
            C58181d dVar = bVar.f155537b;
            if (dVar == null) {
                dVar = C58181d.f155547j;
            }
            if (!dVar.f155556h.isEmpty()) {
                m153876W(128);
            }
        }
        return true;
    }

    /* renamed from: P */
    public final CardDecision mo82089P() {
        return this.f260882c;
    }

    /* renamed from: Q */
    public final boolean mo82090Q() {
        CardDecision cardDecision = this.f260882c;
        return cardDecision.f236252f || cardDecision.f236254h;
    }

    /* renamed from: R */
    public final void mo82091R(VoiceAction voiceAction) {
        m153874U(13, voiceAction);
        m153876W(1);
    }

    /* renamed from: S */
    public final void mo82092S() {
        Query af = Query.f252741b.mo84275aL("immersive-actions").mo84294af();
        C87681ai aiVar = this.f260885f;
        C88489j jVar = new C88489j(C87739bu.QUERY_COMMIT);
        jVar.mo82015c(af);
        aiVar.mo81937i(jVar.mo82013a());
    }

    /* renamed from: T */
    public final C89933d mo87778T(VoiceAction voiceAction) {
        CardDecision cardDecision = this.f260882c;
        Query query = this.f260881b;
        ActionData actionData = this.f260890k;
        C89933d a = C87400a.m141528a(query, actionData, actionData.mo81089a(), voiceAction, cardDecision);
        a.getClass();
        return a;
    }

    /* renamed from: a */
    public final long mo82093a(VoiceAction voiceAction) {
        C93389c cVar = this.f260891l;
        C93481bi biVar = new C93481bi(this, voiceAction);
        CardDecision cardDecision = this.f260882c;
        if (cVar.f260473c != 0) {
            return 0;
        }
        cVar.f260472b = new C93388b(cVar, biVar);
        cVar.f260473c = 1;
        long j = cardDecision.f236257k;
        if (j > 0) {
            cVar.f260471a.mo85150o(cVar.f260472b, j);
        } else {
            cVar.f260472b.run();
        }
        return cardDecision.f236257k;
    }

    /* renamed from: b */
    public final C91189au mo82094b() {
        if (this.f260896q == null) {
            this.f260896q = ((C91183ao) this.f260887h.mo27525b()).mo85410a(this.f260888i);
        }
        return this.f260896q;
    }

    /* renamed from: c */
    public final C91097g mo82095c() {
        return this.f260884e;
    }

    /* renamed from: d */
    public final C55421x mo82096d() {
        return this.f260890k.equals(ActionData.f235991b) ? C55421x.UNKNOWN_ACTION_TYPE : this.f260890k.f235998h;
    }

    /* renamed from: e */
    public final void mo82097e(int i) {
        C88489j jVar = new C88489j(C87739bu.ACQUIRE_KEYBOARD_FOCUS);
        C62940bt btVar = C87899hs.f237783a;
        C87900ht htVar = (C87900ht) C87901hu.f237784c.createBuilder();
        htVar.copyOnWrite();
        C87901hu huVar = (C87901hu) htVar.instance;
        huVar.f237786a |= 1;
        huVar.f237787b = i;
        jVar.mo82014b(btVar, (C87901hu) htVar.build());
        this.f260885f.mo81937i(jVar.mo82013a());
    }

    /* renamed from: f */
    public final void mo82098f(VoiceAction voiceAction) {
        if (voiceAction != null && voiceAction.mo81055E()) {
            mo82075B(voiceAction);
            this.f260885f.mo81937i(new C88489j(C87739bu.ACTION_COUNTDOWN_CANCELED).mo82013a());
        }
    }

    /* renamed from: g */
    public final void mo82099g(VoiceAction voiceAction) {
        m153874U(4, voiceAction);
    }

    /* renamed from: h */
    public final void mo82100h(boolean z, VoiceAction voiceAction) {
        C58881cr crVar = this.f260897r;
        if (crVar == null) {
            return;
        }
        if (z) {
            this.f260883d.mo83776f((View) crVar.mo6453a(), mo87778T(voiceAction));
        } else {
            this.f260883d.mo83775e((View) crVar.mo6453a());
        }
    }

    /* renamed from: i */
    public final void mo82101i(VoiceAction voiceAction) {
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 50;
        int i = mo82096d().f146230cP;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        ufVar2.f164093a |= 256;
        ufVar2.f164264s = i;
        if (voiceAction instanceof SearchError) {
            int N = ((SearchError) voiceAction).mo81135N();
            C59752ei eiVar = (C59752ei) C59753ej.f161449e.createBuilder();
            eiVar.copyOnWrite();
            C59753ej ejVar = (C59753ej) eiVar.instance;
            ejVar.f161451a |= 1;
            ejVar.f161452b = N;
            tzVar.copyOnWrite();
            C60555uf ufVar3 = (C60555uf) tzVar.instance;
            C59753ej ejVar2 = (C59753ej) eiVar.build();
            ejVar2.getClass();
            ufVar3.f164076J = ejVar2;
            ufVar3.f164146b |= 8192;
        }
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        m153876W(4);
    }

    /* renamed from: j */
    public final void mo82102j(VoiceAction voiceAction) {
        m153874U(72, voiceAction);
        this.f260885f.mo81937i(new C88489j(C87739bu.ACTION_COUNTDOWN_CANCELED).mo82013a());
        C88489j jVar = new C88489j(C87739bu.SUPPRESS_GWS_LOGGABLE_EVENT);
        C62940bt btVar = C87862gi.f237708a;
        C87863gj gjVar = (C87863gj) C87864gk.f237709c.createBuilder();
        gjVar.copyOnWrite();
        C87864gk gkVar = (C87864gk) gjVar.instance;
        gkVar.f237711a |= 1;
        gkVar.f237712b = 64;
        jVar.mo82014b(btVar, (C87864gk) gjVar.build());
        jVar.mo82015c(this.f260890k);
        this.f260885f.mo81937i(jVar.mo82013a());
        m153876W(16);
        this.f260880a = true;
    }

    /* renamed from: k */
    public final void mo82103k() {
        this.f260885f.mo81937i(new C88489j(C87739bu.ESCAPE_HATCH_CLICKED).mo82013a());
    }

    /* renamed from: l */
    public final void mo82104l(int i, String str) {
        C87985kx kxVar = (C87985kx) C87986ky.f237947d.createBuilder();
        kxVar.copyOnWrite();
        C87986ky kyVar = (C87986ky) kxVar.instance;
        kyVar.f237949a |= 1;
        kyVar.f237950b = i;
        if (str != null) {
            kxVar.copyOnWrite();
            C87986ky kyVar2 = (C87986ky) kxVar.instance;
            kyVar2.f237949a |= 2;
            kyVar2.f237951c = str;
        }
        C88489j jVar = new C88489j(C87739bu.EXECUTE_MEDIA);
        jVar.mo82014b(C87984kw.f237946a, (C87986ky) kxVar.build());
        this.f260885f.mo81937i(jVar.mo82013a());
    }

    /* renamed from: m */
    public final void mo82105m(int i, int i2) {
        mo82106n(i, i2, (C87423k) null);
    }

    /* renamed from: n */
    public final void mo82106n(int i, int i2, C87423k kVar) {
        C87961k kVar2 = (C87961k) C87988l.f237953e.createBuilder();
        kVar2.copyOnWrite();
        C87988l lVar = (C87988l) kVar2.instance;
        lVar.f237955a |= 1;
        lVar.f237956b = i;
        kVar2.copyOnWrite();
        C87988l lVar2 = (C87988l) kVar2.instance;
        lVar2.f237955a |= 2;
        lVar2.f237957c = i2;
        if (kVar != null) {
            kVar2.copyOnWrite();
            C87988l lVar3 = (C87988l) kVar2.instance;
            lVar3.f237958d = kVar;
            lVar3.f237955a |= 4;
        }
        C88489j jVar = new C88489j(C87739bu.ACTION_USER_INTERACTION);
        jVar.mo82014b(C87934j.f237849a, (C87988l) kVar2.build());
        this.f260885f.mo81937i(jVar.mo82013a());
    }

    /* renamed from: o */
    public final void mo82107o() {
        this.f260885f.mo81937i(new C88489j(C87739bu.ACTION_DRAG_BEGIN).mo82013a());
    }

    /* renamed from: p */
    public final void mo82108p(int i) {
        C88489j jVar = new C88489j(C87739bu.RELEASE_KEYBOARD_FOCUS);
        C62940bt btVar = C87899hs.f237783a;
        C87900ht htVar = (C87900ht) C87901hu.f237784c.createBuilder();
        htVar.copyOnWrite();
        C87901hu huVar = (C87901hu) htVar.instance;
        huVar.f237786a |= 1;
        huVar.f237787b = i;
        jVar.mo82014b(btVar, (C87901hu) htVar.build());
        this.f260885f.mo81937i(jVar.mo82013a());
    }

    /* renamed from: q */
    public final void mo82109q(VoiceAction voiceAction, int i, boolean z) {
        C87681ai aiVar = this.f260885f;
        C88489j jVar = new C88489j(C87739bu.REQUEST_EXECUTE_ACTION);
        jVar.mo82015c(new ParcelableVoiceAction(voiceAction));
        C62940bt btVar = C88213ti.f238443a;
        C88214tj tjVar = (C88214tj) C88215tk.f238444d.createBuilder();
        tjVar.copyOnWrite();
        C88215tk tkVar = (C88215tk) tjVar.instance;
        tkVar.f238446a |= 1;
        tkVar.f238447b = i;
        tjVar.copyOnWrite();
        C88215tk tkVar2 = (C88215tk) tjVar.instance;
        tkVar2.f238446a |= 2;
        tkVar2.f238448c = z;
        jVar.mo82014b(btVar, (C88215tk) tjVar.build());
        aiVar.mo81937i(jVar.mo82013a());
    }

    /* renamed from: r */
    public final void mo82110r(VoiceAction voiceAction, boolean z) {
        m153875V(voiceAction, true, z, false);
    }

    /* renamed from: s */
    public final void mo82111s(VoiceAction voiceAction) {
        if (voiceAction != null && voiceAction.mo81056F()) {
            mo82075B(voiceAction);
        }
    }

    /* renamed from: t */
    public final void mo82112t(PersonDisambiguation personDisambiguation) {
        C88489j jVar = new C88489j(C87739bu.SAVE_RELATIONSHIP);
        jVar.mo82015c(personDisambiguation);
        this.f260885f.mo81937i(jVar.mo82013a());
    }

    /* renamed from: u */
    public final void mo82113u(C87423k kVar) {
        C88228tx txVar = (C88228tx) C88229ty.f238469c.createBuilder();
        if (kVar != null) {
            txVar.copyOnWrite();
            C88229ty tyVar = (C88229ty) txVar.instance;
            tyVar.f238472b = kVar;
            tyVar.f238471a |= 1;
        }
        C88489j jVar = new C88489j(C87739bu.SAVE_USER_INTERACTION);
        jVar.mo82014b(C88227tw.f238468a, (C88229ty) txVar.build());
        this.f260885f.mo81937i(jVar.mo82013a());
    }

    /* renamed from: v */
    public final void mo82114v(ActionData actionData) {
        this.f260890k = actionData;
        this.f260891l = new C93389c(this.f260886g);
    }

    /* renamed from: w */
    public final void mo82115w(boolean z) {
        this.f260895p = z;
    }

    /* renamed from: x */
    public final void mo82116x(Query query, CardDecision cardDecision) {
        this.f260881b = query;
        this.f260882c = cardDecision;
    }

    /* renamed from: y */
    public final void mo82117y(boolean z) {
        this.f260893n = z;
    }

    /* renamed from: z */
    public final void mo82118z(boolean z) {
        this.f260894o = z;
    }
}
