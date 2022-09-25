package com.google.android.apps.gsa.staticplugins.actions;

import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.C85669bt;
import com.google.android.apps.gsa.search.core.C85741ce;
import com.google.android.apps.gsa.search.core.google.C85919cm;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84773a;
import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84809b;
import com.google.android.apps.gsa.search.core.p6774b.C85645c;
import com.google.android.apps.gsa.search.core.p6805i.C86106b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6822a.C86355a;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6826e.C86372a;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.actions.C87401c;
import com.google.android.apps.gsa.search.shared.actions.C87421i;
import com.google.android.apps.gsa.search.shared.actions.C87423k;
import com.google.android.apps.gsa.search.shared.actions.C87424l;
import com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.modular.C87469h;
import com.google.android.apps.gsa.search.shared.actions.modular.C87470i;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87456t;
import com.google.android.apps.gsa.search.shared.actions.p6920a.C87398b;
import com.google.android.apps.gsa.search.shared.actions.p6921b.C87400a;
import com.google.android.apps.gsa.search.shared.actions.util.C87490l;
import com.google.android.apps.gsa.search.shared.actions.util.C87491m;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo;
import com.google.android.apps.gsa.search.shared.contact.C87515c;
import com.google.android.apps.gsa.search.shared.contact.Contact;
import com.google.android.apps.gsa.search.shared.contact.Person;
import com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation;
import com.google.android.apps.gsa.search.shared.contact.PersonShortcut;
import com.google.android.apps.gsa.search.shared.contact.PersonShortcutKey;
import com.google.android.apps.gsa.search.shared.contact.Relationship;
import com.google.android.apps.gsa.search.shared.contact.RelationshipStatus;
import com.google.android.apps.gsa.search.shared.media.PlaybackStatus;
import com.google.android.apps.gsa.search.shared.p6926d.C87541c;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.p6930h.C87568k;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.UpdateVoiceActionUiEventParcelable;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87756ck;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87853g;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87880h;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87907i;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88206tb;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88207tc;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88208td;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88209te;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88226tv;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88300wo;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88301wp;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88357yr;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88358ys;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88359yt;
import com.google.android.apps.gsa.search.shared.service.p6935b.aab;
import com.google.android.apps.gsa.search.shared.service.p6935b.aad;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.logger.p7065j.C89930a;
import com.google.android.apps.gsa.shared.logger.p7065j.C89932c;
import com.google.android.apps.gsa.shared.logger.p7065j.C89933d;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.p7066m.C90139r;
import com.google.android.apps.gsa.shared.search.C90498f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.shared.util.C90738av;
import com.google.android.apps.gsa.shared.util.C90741ay;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.sidekick.main.actions.C91256o;
import com.google.android.apps.gsa.sidekick.main.p7227s.C91620i;
import com.google.android.apps.gsa.sidekick.shared.util.C91978bb;
import com.google.android.apps.gsa.staticplugins.actions.p7353a.C93271c;
import com.google.android.apps.gsa.staticplugins.actions.p7353a.C93276h;
import com.google.android.apps.gsa.staticplugins.actions.p7353a.C93286r;
import com.google.android.apps.gsa.staticplugins.actions.p7358d.C93322i;
import com.google.android.apps.gsa.staticplugins.actions.p7358d.C93324k;
import com.google.android.apps.gsa.staticplugins.actions.p7358d.C93330q;
import com.google.android.apps.gsa.staticplugins.actions.p7359e.C93350q;
import com.google.android.apps.gsa.staticplugins.actions.p7361g.C93390d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.speech.embedded.TaggerResult;
import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.C49923e;
import com.google.assistant.p3861at.C49950f;
import com.google.assistant.p3861at.C50274r;
import com.google.assistant.p3861at.C50301s;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.assistant.p3897e.p3917i.p3918a.C51305cu;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7708h;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7804ko;
import com.google.p375ai.p378b.C7805kp;
import com.google.p4152bb.p4153a.C54944ab;
import com.google.p4152bb.p4153a.C54946ad;
import com.google.p4152bb.p4153a.C54948af;
import com.google.p4152bb.p4153a.C54960ar;
import com.google.p4152bb.p4153a.C54976bg;
import com.google.p4152bb.p4153a.C55112gh;
import com.google.p4152bb.p4153a.C55240la;
import com.google.p4152bb.p4153a.C55244le;
import com.google.p4152bb.p4153a.C55252lm;
import com.google.p4152bb.p4153a.C55253ln;
import com.google.p4152bb.p4153a.C55265lz;
import com.google.p4152bb.p4153a.C55305nl;
import com.google.p4152bb.p4153a.C55349pb;
import com.google.p4152bb.p4153a.C55373pz;
import com.google.p4152bb.p4153a.C55421x;
import com.google.p4242bp.p4243a.p4244a.C56127a;
import com.google.p4242bp.p4243a.p4244a.C56128b;
import com.google.p4242bp.p4243a.p4244a.C56132f;
import com.google.p4242bp.p4243a.p4244a.C56133g;
import com.google.p4242bp.p4243a.p4244a.C56136j;
import com.google.p4242bp.p4243a.p4244a.C56137k;
import com.google.p4242bp.p4243a.p4244a.C56138l;
import com.google.p4242bp.p4243a.p4244a.C56139m;
import com.google.p4242bp.p4243a.p4244a.C56140n;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58163o;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58164p;
import com.google.p4500cm.p4518d.p4519a.C58179b;
import com.google.p4500cm.p4518d.p4519a.C58181d;
import com.google.p5277z.p5282c.C68024n;
import com.google.p5277z.p5282c.C68026p;
import com.google.p5277z.p5282c.C68032v;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.q */
/* compiled from: PG */
public final class C93421q extends C86734a implements C84809b {

    /* renamed from: a */
    public static final C59071e f260560a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.actions.q");

    /* renamed from: A */
    private final C68214a f260561A;

    /* renamed from: B */
    private final C68214a f260562B;

    /* renamed from: C */
    private final C68214a f260563C;

    /* renamed from: D */
    private final C68214a f260564D;

    /* renamed from: E */
    private final C68214a f260565E;

    /* renamed from: F */
    private final C58833ax f260566F;

    /* renamed from: G */
    private final C68214a f260567G;

    /* renamed from: H */
    private final C68214a f260568H;

    /* renamed from: I */
    private final C68214a f260569I;

    /* renamed from: J */
    private final Object f260570J = new Object();

    /* renamed from: K */
    private final C58881cr f260571K;

    /* renamed from: L */
    private C93420p f260572L;

    /* renamed from: M */
    private boolean f260573M;

    /* renamed from: N */
    private C87401c f260574N = null;

    /* renamed from: O */
    private final C84466a f260575O;

    /* renamed from: b */
    public final C68214a f260576b;

    /* renamed from: c */
    public final C68214a f260577c;

    /* renamed from: f */
    protected final C89932c f260578f;

    /* renamed from: g */
    public final C68214a f260579g;

    /* renamed from: h */
    public final C93298ad f260580h;

    /* renamed from: i */
    C93276h f260581i;

    /* renamed from: j */
    public C87421i f260582j = null;

    /* renamed from: k */
    private final C68214a f260583k;

    /* renamed from: l */
    private final C68214a f260584l;

    /* renamed from: m */
    private final C90931ca f260585m;

    /* renamed from: n */
    private final C22871g f260586n;

    /* renamed from: o */
    private final C86610af f260587o;

    /* renamed from: p */
    private final Context f260588p;

    /* renamed from: q */
    private C93350q f260589q;

    /* renamed from: r */
    private final C68214a f260590r;

    /* renamed from: s */
    private final C68214a f260591s;

    /* renamed from: t */
    private final C68214a f260592t;

    /* renamed from: u */
    private final C68214a f260593u;

    /* renamed from: v */
    private final C68214a f260594v;

    /* renamed from: w */
    private C93390d f260595w;

    /* renamed from: x */
    private final C93304aj f260596x;

    /* renamed from: y */
    private final C93302ah f260597y;

    /* renamed from: z */
    private final C93305b f260598z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93421q(C68214a aVar, C68214a aVar2, C90931ca caVar, C22871g gVar, C68214a aVar3, C68214a aVar4, Context context, C68214a aVar5, C68214a aVar6, C58881cr crVar, C86610af afVar, C68214a aVar7, C68214a aVar8, C68214a aVar9, C68214a aVar10, C93304aj ajVar, C93298ad adVar, C93302ah ahVar, C84466a aVar11, C93305b bVar, C68214a aVar12, C68214a aVar13, C68214a aVar14, C68214a aVar15, C68214a aVar16, C58833ax axVar, C68214a aVar17, C68214a aVar18, C68214a aVar19) {
        super(C118575h.WORKER_ACTION, "actions");
        this.f260584l = aVar;
        this.f260583k = aVar2;
        this.f260590r = aVar3;
        this.f260591s = aVar4;
        this.f260585m = caVar;
        this.f260586n = gVar;
        this.f260576b = aVar5;
        this.f260577c = aVar6;
        this.f260588p = context;
        this.f260579g = aVar7;
        C58881cr crVar2 = crVar;
        this.f260571K = C58886cw.m90973a(new C93401i(crVar, aVar6));
        this.f260578f = C89932c.f246391b;
        this.f260587o = afVar;
        this.f260592t = aVar8;
        this.f260593u = aVar9;
        this.f260594v = aVar10;
        this.f260596x = ajVar;
        this.f260580h = adVar;
        this.f260597y = ahVar;
        this.f260575O = aVar11;
        this.f260598z = bVar;
        this.f260561A = aVar12;
        this.f260562B = aVar13;
        this.f260563C = aVar14;
        this.f260564D = aVar15;
        this.f260565E = aVar16;
        this.f260566F = axVar;
        this.f260567G = aVar17;
        this.f260568H = aVar18;
        this.f260569I = aVar19;
    }

    /* renamed from: M */
    private final C85645c m153703M(Query query, ActionData actionData, PlaybackStatus playbackStatus, C86355a aVar, C86372a aVar2) {
        return this.f260598z.mo87627a(mo80351ic(this.f260575O, "action", C118575h.GRAPH_ACTION), query, actionData, C58836b.f156633a, playbackStatus, aVar, aVar2);
    }

    /* renamed from: N */
    private final C89930a m153704N(C84773a aVar) {
        this.f260573M = true;
        C89932c cVar = this.f260578f;
        cVar.f246400j = true;
        if (this.f260572L == null) {
            this.f260572L = new C93420p(aVar);
        }
        C93420p pVar = this.f260572L;
        C89930a aVar2 = cVar.f246401k;
        cVar.f246401k = pVar;
        return aVar2;
    }

    /* renamed from: O */
    private final C60870cx m153705O(VoiceAction voiceAction, boolean z) {
        return this.f260585m.mo85138c(new C93418n(this, String.format("[%s] refresh", new Object[]{"ActionWorker"}), voiceAction, z));
    }

    /* renamed from: P */
    private final void m153706P(C89930a aVar) {
        if (this.f260573M) {
            C89932c cVar = this.f260578f;
            C89930a aVar2 = cVar.f246401k;
            cVar.f246401k = aVar;
        }
    }

    /* renamed from: Q */
    private final void m153707Q() {
        if (this.f260595w == null) {
            C87398b bVar = (C87398b) this.f260593u.mo27525b();
            this.f260595w = new C93390d((byte[]) null);
        }
    }

    /* renamed from: A */
    public final void mo78473A() {
        this.f260587o.mo80228i(new C87684al(C88244um.REQUEST_LOG_UPDATE_CARD_IMPRESSION).mo81964a());
    }

    /* renamed from: B */
    public final void mo78474B(C88226tv tvVar) {
        C91620i iVar = (C91620i) this.f260561A.mo27525b();
        C7718hj hjVar = tvVar.f238464a;
        if (hjVar == null) {
            hjVar = C7718hj.f26927af;
        }
        C7718hj hjVar2 = hjVar;
        C55112gh ghVar = tvVar.f238465b;
        if (ghVar == null) {
            ghVar = C55112gh.f145017p;
        }
        C7804ko koVar = (C7804ko) C7805kp.f27284h.createBuilder();
        String str = ghVar.f145028j;
        if (!TextUtils.isEmpty(str)) {
            koVar.copyOnWrite();
            C7805kp kpVar = (C7805kp) koVar.instance;
            str.getClass();
            kpVar.f27286a |= 8;
            kpVar.f27290e = str;
        }
        Context context = iVar.f255546a;
        C7708h c = C91978bb.m150937c(hjVar2, C7681g.EDIT_HOME, C7681g.EDIT_WORK);
        c.getClass();
        new C91256o(context, hjVar2, c, (C7805kp) koVar.build(), iVar.f255547b, iVar.f255548c, iVar.f255549d).execute(new Void[0]);
    }

    /* renamed from: C */
    public final void mo78475C(PersonDisambiguation personDisambiguation, Query query) {
        C58838bb.m90869d(personDisambiguation.mo81544m(), "First step is not completed.");
        RelationshipStatus relationshipStatus = personDisambiguation.f236395k;
        Relationship relationship = relationshipStatus.f236410c;
        if (relationshipStatus.mo81601c()) {
            Parcelable parcelable = personDisambiguation.f236364c;
            parcelable.getClass();
            Person person = (Person) parcelable;
            C58976aa aaVar = C58975e.f156826a;
            if (!query.mo84403cj()) {
                ((C85741ce) this.f260562B.mo27525b()).mo79390b(relationship, person);
            } else {
                C49923e eVar = (C49923e) C49950f.f129847h.createBuilder();
                C50274r rVar = (C50274r) C50301s.f130893k.createBuilder();
                String b = relationship.mo81590b();
                rVar.copyOnWrite();
                C50301s sVar = (C50301s) rVar.instance;
                b.getClass();
                sVar.f130895a |= 1;
                sVar.f130896b = b;
                String lowerCase = relationship.f236405a.toLowerCase(relationship.f236407c);
                rVar.copyOnWrite();
                C50301s sVar2 = (C50301s) rVar.instance;
                lowerCase.getClass();
                sVar2.f130895a |= 2;
                sVar2.f130897c = lowerCase;
                String str = person.f236373d;
                if (!TextUtils.isEmpty(str)) {
                    rVar.copyOnWrite();
                    C50301s sVar3 = (C50301s) rVar.instance;
                    str.getClass();
                    sVar3.f130895a |= 4;
                    sVar3.f130898d = str;
                }
                if (!C58485gu.m89842j(person.f236378i).isEmpty()) {
                    String str2 = ((Contact) C58485gu.m89842j(person.f236378i).get(0)).f236354e;
                    if (!TextUtils.isEmpty(str2)) {
                        rVar.copyOnWrite();
                        C50301s sVar4 = (C50301s) rVar.instance;
                        str2.getClass();
                        sVar4.f130895a |= 8;
                        sVar4.f130899e = str2;
                    }
                }
                String b2 = ((C86106b) this.f260565E.mo27525b()).mo79727b();
                if (!TextUtils.isEmpty(b2)) {
                    rVar.copyOnWrite();
                    C50301s sVar5 = (C50301s) rVar.instance;
                    b2.getClass();
                    sVar5.f130895a |= 16;
                    sVar5.f130900f = b2;
                }
                for (Contact contact : C58485gu.m89842j(person.f236379j)) {
                    String str3 = contact.f236354e;
                    String str4 = contact.f236355f;
                    if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                        rVar.copyOnWrite();
                        C50301s sVar6 = (C50301s) rVar.instance;
                        str3.getClass();
                        C62971cq cqVar = sVar6.f130902h;
                        if (!cqVar.mo58948c()) {
                            sVar6.f130902h = C62942bv.mutableCopy(cqVar);
                        }
                        sVar6.f130902h.add(str3);
                        rVar.copyOnWrite();
                        C50301s sVar7 = (C50301s) rVar.instance;
                        str4.getClass();
                        C62971cq cqVar2 = sVar7.f130901g;
                        if (!cqVar2.mo58948c()) {
                            sVar7.f130901g = C62942bv.mutableCopy(cqVar2);
                        }
                        sVar7.f130901g.add(str4);
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (Contact contact2 : C58485gu.m89842j(person.f236374e)) {
                    String str5 = contact2.f236354e;
                    if (!TextUtils.isEmpty(str5)) {
                        arrayList.add(str5);
                    }
                }
                rVar.copyOnWrite();
                C50301s sVar8 = (C50301s) rVar.instance;
                C62971cq cqVar3 = sVar8.f130903i;
                if (!cqVar3.mo58948c()) {
                    sVar8.f130903i = C62942bv.mutableCopy(cqVar3);
                }
                C62947c.addAll((Iterable) arrayList, (List) sVar8.f130903i);
                ArrayList arrayList2 = new ArrayList();
                for (Contact contact3 : C58485gu.m89842j(person.f236375f)) {
                    String str6 = contact3.f236354e;
                    if (!TextUtils.isEmpty(str6)) {
                        arrayList2.add(str6);
                    }
                }
                rVar.copyOnWrite();
                C50301s sVar9 = (C50301s) rVar.instance;
                C62971cq cqVar4 = sVar9.f130904j;
                if (!cqVar4.mo58948c()) {
                    sVar9.f130904j = C62942bv.mutableCopy(cqVar4);
                }
                C62947c.addAll((Iterable) arrayList2, (List) sVar9.f130904j);
                eVar.copyOnWrite();
                C49950f fVar = (C49950f) eVar.instance;
                C50301s sVar10 = (C50301s) rVar.build();
                sVar10.getClass();
                fVar.f129855g = sVar10;
                fVar.f129849a |= 512;
                acw acw = (acw) acx.f128971H.createBuilder();
                acw.copyOnWrite();
                acx acx = (acx) acw.instance;
                C49950f fVar2 = (C49950f) eVar.build();
                fVar2.getClass();
                acx.f128989f = fVar2;
                acx.f128984a |= 8;
                ((l) this.f260563C.mo27525b()).l(((C86054o) this.f260564D.mo27525b()).mo79668a(), C49875cf.NEXUS, (acx) acw.build(), new C93419o(), getClass().getSimpleName());
            }
            personDisambiguation.f236395k.mo81599a();
        }
    }

    /* renamed from: D */
    public final void mo78476D(ActionData actionData) {
        C86775r rVar = this.f260587o.f233977l;
        if (rVar != null) {
            C87684al alVar = new C87684al(C88244um.UPDATE_ACTION_DATA);
            actionData.getClass();
            alVar.mo81966c(actionData);
            rVar.f234383e.mo80379b(alVar.mo81964a());
        }
    }

    /* renamed from: E */
    public final void mo78477E(ActionData actionData, Query query) {
        e eVar;
        Query query2;
        String str;
        C55349pb pbVar;
        String obj = query.f252768g.toString();
        if (obj.isEmpty() && (pbVar = actionData.f235993c) != null && pbVar.f145835d.size() > 0) {
            obj = ((C54946ad) pbVar.f145835d.get(0)).f144539g;
        }
        if (!obj.isEmpty()) {
            Query i = (query.f252780s == this.f260587o.f233970e.mo80559a().mo80460i().f252780s && query.mo84347bf("android.search.extra.EVENT_ID") == null) ? this.f260587o.f233970e.mo80559a().mo80460i() : query;
            String bf = i.mo84347bf("android.search.extra.EVENT_ID");
            C90498f i2 = i.mo84245H(0, false, (QueryTriggerType) null).mo84480i();
            i2.mo84546E(obj);
            i2.mo84580l("android.opa.extra.SHOULD_ADD_USER_BUBBLE", true);
            if (bf != null) {
                i2.mo84584p("android.search.extra.PARENT_EVENT_ID", bf);
            }
            Query a = i2.mo84568a();
            if (a.mo84347bf("android.search.extra.PARENT_EVENT_ID") == null && (str = actionData.f236000j) != null) {
                a = a.mo84278aO("android.search.extra.PARENT_EVENT_ID", str);
            }
            if (query.mo84420dA()) {
                query2 = a.mo84311aw("android.opa.extra.CLIENT_MODALITY_OVERRIDE", C51305cu.VOICE_MODALITY.f133565f).mo84311aw("android.opa.extra.TRIGGERED_BY", 4);
                eVar = e.aI;
            } else {
                query2 = a.mo84311aw("android.opa.extra.CLIENT_MODALITY_OVERRIDE", C51305cu.TYPING_MODALITY.f133565f).mo84311aw("android.opa.extra.TRIGGERED_BY", 121);
                eVar = e.aK;
            }
            C87565h hVar = new C87565h();
            hVar.f236560f = 4;
            hVar.f236509M = false;
            hVar.f236508L = true;
            hVar.f236523a = query2.mo84355bn();
            hVar.f236556b = eVar;
            hVar.f236558d = 4;
            hVar.f236565k = query2;
            hVar.f236534ae = obj;
            Bundle a2 = hVar.mo81685a();
            if (((C58833ax) this.f260568H.mo27525b()).mo56113h()) {
                if (((C86124t) this.f260577c.mo27525b()).mo79746e(C90139r.f251853a)) {
                    this.f260587o.f233970e.mo80559a().mo80461o();
                }
                ((C87568k) ((C58833ax) this.f260568H.mo27525b()).mo56107c()).mo81688b(this.f260588p, a2);
            }
        }
    }

    /* renamed from: F */
    public final void mo78478F(C88209te teVar) {
        this.f260596x.mo87626a(teVar);
    }

    /* renamed from: G */
    public final void mo78479G(ServiceEventData serviceEventData) {
        this.f260587o.mo80228i(serviceEventData);
    }

    /* renamed from: I */
    public final void mo78481I(C87541c cVar, C58179b bVar) {
        C68032v vVar;
        if (bVar != null) {
            vVar = bVar.f155541f;
            if (vVar == null) {
                vVar = C68032v.f184320b;
            }
        } else {
            vVar = null;
        }
        cVar.f236452n = vVar;
    }

    /* renamed from: J */
    public final void mo78482J(aad aad, UpdateVoiceActionUiEventParcelable updateVoiceActionUiEventParcelable) {
        C86775r rVar = this.f260587o.f233977l;
        if (this.f260587o.mo80227h() && rVar != null) {
            C87684al alVar = new C87684al(C88244um.UPDATE_VOICE_ACTION_UI);
            alVar.mo81965b(aab.f237058a, aad);
            alVar.mo81966c(updateVoiceActionUiEventParcelable);
            rVar.f234383e.mo80379b(alVar.mo81964a());
        }
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r8v3 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x04c9, code lost:
        if (((com.google.android.apps.gsa.p8889z.p8890a.C118843f) r0.f260567G.mo27525b()).mo71744e() != 0) goto L_0x04ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0121, code lost:
        if (r4.equals(com.google.android.apps.gsa.search.shared.actions.util.CardDecision.f236248b) == false) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x012f, code lost:
        r4 = r6.f260362b;
        r5 = new java.lang.Object[2];
        r5[r8] = r4.getString(com.google.android.googlequicksearchbox.R.string.no_speech_tts);
        r5[1] = r6.f260362b.getString(com.google.android.googlequicksearchbox.R.string.action_generic_canceled_tts);
        r4 = com.google.android.apps.gsa.search.shared.actions.util.CardDecision.m141963b(com.evernote.android.state.BuildConfig.FLAVOR, new com.google.android.apps.gsa.search.shared.actions.util.TtsRequest(r4.getString(com.google.android.googlequicksearchbox.R.string.action_generic_timeout_last_eyes_free_tts, r5), (boolean) r8), com.google.p4152bb.p4153a.C54944ab.UNKNOWN);
        r4.mo81463e();
        r4.f236289b = true;
        r4 = r4.mo81459a();
     */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0407  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0415  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0433  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x04b5  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x04bb  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x04cc  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01ce  */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo78483K(com.google.android.apps.gsa.search.shared.actions.VoiceAction r39, com.google.android.apps.gsa.search.shared.actions.ActionData r40, com.google.android.apps.gsa.shared.search.Query r41, com.google.android.apps.gsa.search.shared.actions.errors.C87413a r42, com.google.android.apps.gsa.search.shared.service.ClientConfig r43, boolean r44, boolean r45, boolean r46, boolean r47, boolean r48, boolean r49) {
        /*
            r38 = this;
            r0 = r38
            r1 = r39
            r2 = r40
            r15 = r41
            r14 = r45
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.staticplugins.actions.e.q r3 = r0.f260589q
            if (r3 != 0) goto L_0x003c
            com.google.android.apps.gsa.staticplugins.actions.e.q r3 = new com.google.android.apps.gsa.staticplugins.actions.e.q
            android.content.Context r5 = r0.f260588p
            dagger.a r6 = r0.f260577c
            dagger.a r4 = r0.f260584l
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.speech.n.i r4 = (com.google.android.apps.gsa.speech.p7311n.C92541i) r4
            com.google.al.c.c.b.w r4 = r4.mo87316a()
            com.google.al.c.c.b.bh r4 = r4.f29537g
            if (r4 != 0) goto L_0x0028
            com.google.al.c.c.b.bh r4 = com.google.p395al.p408c.p414c.p416b.C8492bh.f29458c
        L_0x0028:
            int r4 = r4.f29461b
            long r7 = (long) r4
            dagger.a r4 = r0.f260594v
            java.lang.Object r4 = r4.mo27525b()
            r9 = r4
            com.google.android.apps.gsa.staticplugins.actions.g.i r9 = (com.google.android.apps.gsa.staticplugins.actions.p7361g.C93395i) r9
            dagger.a r10 = r0.f260592t
            r4 = r3
            r4.<init>(r5, r6, r7, r9, r10)
            r0.f260589q = r3
        L_0x003c:
            com.google.android.apps.gsa.staticplugins.actions.e.q r13 = r0.f260589q
            java.lang.Class r3 = r39.getClass()
            r3.getSimpleName()
            boolean r3 = r40.mo81101l()
            if (r3 == 0) goto L_0x0051
            long r3 = r40.mo81090b()
        L_0x004f:
            r8 = r3
            goto L_0x005d
        L_0x0051:
            boolean r3 = r40.mo81099j()
            if (r3 == 0) goto L_0x005a
            r3 = 0
            goto L_0x004f
        L_0x005a:
            long r3 = r13.f260363c
            goto L_0x004f
        L_0x005d:
            com.google.android.apps.gsa.staticplugins.actions.e.p r12 = new com.google.android.apps.gsa.staticplugins.actions.e.p
            boolean r3 = r40.mo81105q()
            r11 = 0
            r10 = 1
            if (r3 != 0) goto L_0x0072
            boolean r3 = r41.mo84329bN()
            if (r3 != 0) goto L_0x0072
            if (r46 == 0) goto L_0x0070
            goto L_0x0072
        L_0x0070:
            r6 = 0
            goto L_0x0073
        L_0x0072:
            r6 = 1
        L_0x0073:
            boolean r3 = r39.mo81080s()
            boolean r16 = com.google.android.apps.gsa.staticplugins.actions.p7359e.C93350q.m153571a(r2, r15, r14, r11, r3)
            boolean r17 = r40.mo81103n()
            r3 = r12
            r4 = r13
            r5 = r49
            r7 = r41
            r0 = 1
            r10 = r44
            r11 = r16
            r19 = r12
            r12 = r47
            r20 = r13
            r13 = r17
            r14 = r42
            r3.<init>(r4, r5, r6, r7, r8, r10, r11, r12, r13, r14)
            r3 = 0
            if (r48 == 0) goto L_0x00be
            com.google.android.apps.gsa.search.shared.actions.util.b r4 = new com.google.android.apps.gsa.search.shared.actions.util.b
            r4.<init>()
            r4.f236289b = r0
            com.google.android.apps.gsa.search.shared.actions.util.TtsRequest r5 = new com.google.android.apps.gsa.search.shared.actions.util.TtsRequest
            r6 = r20
            android.content.res.Resources r7 = r6.f260362b
            r8 = 2132082889(0x7f1500c9, float:1.9805905E38)
            java.lang.String r7 = r7.getString(r8)
            r8 = 0
            r5.<init>((java.lang.String) r7, (boolean) r8)
            com.google.bb.a.ab r7 = com.google.p4152bb.p4153a.C54944ab.UNKNOWN
            r4.mo81467i(r5, r7)
            r4.f236294g = r0
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r4 = r4.mo81459a()
            goto L_0x00c2
        L_0x00be:
            r6 = r20
            r8 = 0
            r4 = r3
        L_0x00c2:
            if (r4 != 0) goto L_0x00d5
            if (r15 == 0) goto L_0x00d5
            boolean r5 = r41.mo84337bV()
            if (r5 == 0) goto L_0x00d5
            if (r42 == 0) goto L_0x0166
            boolean r4 = r42.mo81179a()
            if (r4 != 0) goto L_0x00d9
            r4 = r3
        L_0x00d5:
            r9 = r19
            goto L_0x0169
        L_0x00d9:
            com.google.common.b.gu r4 = com.google.android.apps.gsa.staticplugins.actions.p7359e.C93350q.f260361a
            r5 = r4
            com.google.common.b.pq r5 = (com.google.common.p4522b.C58724pq) r5
            int r5 = r5.f156474d
            r11 = 0
        L_0x00e1:
            if (r11 >= r5) goto L_0x0126
            int r7 = r11 + 1
            java.lang.Object r9 = r4.get(r11)
            java.lang.Class r9 = (java.lang.Class) r9
            boolean r9 = r9.isInstance(r1)
            if (r9 == 0) goto L_0x0124
            java.lang.Class r4 = r39.getClass()
            r4.getSimpleName()
            boolean r4 = r1 instanceof com.google.android.apps.gsa.search.shared.actions.VisitableAbstractVoiceAction
            if (r4 == 0) goto L_0x0108
            r4 = r1
            com.google.android.apps.gsa.search.shared.actions.VisitableAbstractVoiceAction r4 = (com.google.android.apps.gsa.search.shared.actions.VisitableAbstractVoiceAction) r4
            r9 = r19
            java.lang.Object r4 = r4.mo81132L(r9)
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r4 = (com.google.android.apps.gsa.search.shared.actions.util.CardDecision) r4
            goto L_0x0119
        L_0x0108:
            r9 = r19
            boolean r4 = r1 instanceof com.google.android.apps.gsa.search.shared.actions.core.NewVisitableAbstractVoiceAction
            if (r4 == 0) goto L_0x0118
            r4 = r1
            com.google.android.apps.gsa.search.shared.actions.core.NewVisitableAbstractVoiceAction r4 = (com.google.android.apps.gsa.search.shared.actions.core.NewVisitableAbstractVoiceAction) r4
            java.lang.Object r4 = r4.mo81146L(r9)
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r4 = (com.google.android.apps.gsa.search.shared.actions.util.CardDecision) r4
            goto L_0x0119
        L_0x0118:
            r4 = r3
        L_0x0119:
            if (r4 == 0) goto L_0x012f
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r5 = com.google.android.apps.gsa.search.shared.actions.util.CardDecision.f236248b
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0169
            goto L_0x012f
        L_0x0124:
            r11 = r7
            goto L_0x00e1
        L_0x0126:
            r9 = r19
            java.lang.Class r4 = r39.getClass()
            r4.getSimpleName()
        L_0x012f:
            android.content.res.Resources r4 = r6.f260362b
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r7 = 2132090127(0x7f151d0f, float:1.9820585E38)
            java.lang.String r7 = r4.getString(r7)
            r5[r8] = r7
            android.content.res.Resources r7 = r6.f260362b
            r10 = 2132082867(0x7f1500b3, float:1.980586E38)
            java.lang.String r7 = r7.getString(r10)
            r5[r0] = r7
            r7 = 2132082868(0x7f1500b4, float:1.9805862E38)
            java.lang.String r4 = r4.getString(r7, r5)
            com.google.android.apps.gsa.search.shared.actions.util.TtsRequest r5 = new com.google.android.apps.gsa.search.shared.actions.util.TtsRequest
            r5.<init>((java.lang.String) r4, (boolean) r8)
            java.lang.String r4 = ""
            com.google.bb.a.ab r7 = com.google.p4152bb.p4153a.C54944ab.UNKNOWN
            com.google.android.apps.gsa.search.shared.actions.util.b r4 = com.google.android.apps.gsa.search.shared.actions.util.CardDecision.m141963b(r4, r5, r7)
            r4.mo81463e()
            r4.f236289b = r0
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r4 = r4.mo81459a()
            goto L_0x0169
        L_0x0166:
            r9 = r19
            r4 = r3
        L_0x0169:
            if (r4 != 0) goto L_0x018f
            boolean r4 = r39.mo81082u()
            if (r4 != 0) goto L_0x018e
            boolean r4 = r39.mo81051A()
            if (r4 == 0) goto L_0x018e
            boolean r4 = r39.mo81080s()
            if (r4 != 0) goto L_0x018b
            if (r15 == 0) goto L_0x018e
            boolean r4 = r41.mo84397cd()
            if (r4 != 0) goto L_0x018b
            boolean r4 = r41.mo84381cN()
            if (r4 == 0) goto L_0x018e
        L_0x018b:
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r4 = com.google.android.apps.gsa.search.shared.actions.util.CardDecision.f236248b
            goto L_0x018f
        L_0x018e:
            r4 = r3
        L_0x018f:
            if (r4 != 0) goto L_0x01ac
            boolean r5 = r1 instanceof com.google.android.apps.gsa.search.shared.actions.VisitableAbstractVoiceAction
            if (r5 == 0) goto L_0x019f
            r4 = r1
            com.google.android.apps.gsa.search.shared.actions.VisitableAbstractVoiceAction r4 = (com.google.android.apps.gsa.search.shared.actions.VisitableAbstractVoiceAction) r4
            java.lang.Object r4 = r4.mo81132L(r9)
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r4 = (com.google.android.apps.gsa.search.shared.actions.util.CardDecision) r4
            goto L_0x01ac
        L_0x019f:
            boolean r5 = r1 instanceof com.google.android.apps.gsa.search.shared.actions.core.NewVisitableAbstractVoiceAction
            if (r5 == 0) goto L_0x01ac
            r4 = r1
            com.google.android.apps.gsa.search.shared.actions.core.NewVisitableAbstractVoiceAction r4 = (com.google.android.apps.gsa.search.shared.actions.core.NewVisitableAbstractVoiceAction) r4
            java.lang.Object r4 = r4.mo81146L(r9)
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r4 = (com.google.android.apps.gsa.search.shared.actions.util.CardDecision) r4
        L_0x01ac:
            boolean r5 = r41.mo84403cj()
            if (r5 == 0) goto L_0x01b6
            boolean r5 = r1 instanceof com.google.android.apps.gsa.search.shared.actions.core.VoiceDelightAction
            if (r5 != 0) goto L_0x01c2
        L_0x01b6:
            if (r44 != 0) goto L_0x01c2
            if (r4 == 0) goto L_0x01c2
            boolean r5 = r4.f236252f
            if (r5 == 0) goto L_0x01c2
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r4 = r4.mo81418d()
        L_0x01c2:
            if (r4 == 0) goto L_0x0304
            boolean r5 = r4.f236258l
            if (r5 != 0) goto L_0x0304
            boolean r5 = r40.mo81101l()
            if (r5 == 0) goto L_0x0304
            boolean r4 = r4.f236258l
            boolean r5 = r39.mo81080s()
            com.google.bb.a.ab r7 = com.google.p4152bb.p4153a.C54944ab.UNKNOWN
            com.google.bb.a.ab r9 = com.google.p4152bb.p4153a.C54944ab.UNKNOWN
            com.google.common.b.gu r10 = com.google.common.p4522b.C58485gu.m89845m()
            boolean r11 = r40.mo81108t()
            if (r11 == 0) goto L_0x0220
            com.google.bb.a.ad r11 = r40.mo81107s()
            if (r11 == 0) goto L_0x0220
            int r12 = r11.f144533a
            r12 = r12 & 32
            if (r12 == 0) goto L_0x0220
            com.google.bb.a.bg r10 = r11.f144537e
            if (r10 != 0) goto L_0x01f4
            com.google.bb.a.bg r10 = com.google.p4152bb.p4153a.C54976bg.f144641o
        L_0x01f4:
            int r11 = r10.f144643a
            r11 = r11 & 64
            if (r11 == 0) goto L_0x021e
            int r7 = r10.f144649g
            com.google.bb.a.ab r7 = com.google.p4152bb.p4153a.C54944ab.m87544a(r7)
            com.google.common.base.ax r7 = com.google.common.base.C58833ax.m90833j(r7)
            com.google.bb.a.ab r9 = com.google.p4152bb.p4153a.C54944ab.UNKNOWN
            java.lang.Object r7 = r7.mo56109e(r9)
            com.google.bb.a.ab r7 = (com.google.p4152bb.p4153a.C54944ab) r7
            int r9 = r10.f144650h
            com.google.bb.a.ab r9 = com.google.p4152bb.p4153a.C54944ab.m87544a(r9)
            com.google.common.base.ax r9 = com.google.common.base.C58833ax.m90833j(r9)
            com.google.bb.a.ab r11 = com.google.p4152bb.p4153a.C54944ab.UNKNOWN
            java.lang.Object r9 = r9.mo56109e(r11)
            com.google.bb.a.ab r9 = (com.google.p4152bb.p4153a.C54944ab) r9
        L_0x021e:
            com.google.protobuf.ch r10 = r10.f144651i
        L_0x0220:
            r28 = r7
            r29 = r9
            r30 = r10
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r7 = new com.google.android.apps.gsa.search.shared.actions.util.CardDecision
            boolean r9 = r40.mo81108t()
            if (r9 == 0) goto L_0x0233
            com.google.bb.a.ad r9 = r40.mo81107s()
            goto L_0x0234
        L_0x0233:
            r9 = r3
        L_0x0234:
            if (r9 == 0) goto L_0x024b
            com.google.bb.a.bg r10 = r9.f144537e
            if (r10 != 0) goto L_0x023c
            com.google.bb.a.bg r10 = com.google.p4152bb.p4153a.C54976bg.f144641o
        L_0x023c:
            int r10 = r10.f144643a
            r10 = r10 & 4096(0x1000, float:5.74E-42)
            if (r10 == 0) goto L_0x024b
            com.google.bb.a.bg r9 = r9.f144537e
            if (r9 != 0) goto L_0x0248
            com.google.bb.a.bg r9 = com.google.p4152bb.p4153a.C54976bg.f144641o
        L_0x0248:
            java.lang.String r9 = r9.f144654l
            goto L_0x025d
        L_0x024b:
            com.google.bb.a.pb r9 = r2.f235993c
            if (r9 == 0) goto L_0x0260
            int r10 = r9.f145832a
            r10 = r10 & 8
            if (r10 == 0) goto L_0x0260
            com.google.bb.a.pd r9 = r9.f145834c
            if (r9 != 0) goto L_0x025b
            com.google.bb.a.pd r9 = com.google.p4152bb.p4153a.C55351pd.f145839f
        L_0x025b:
            java.lang.String r9 = r9.f145842b
        L_0x025d:
            r17 = r9
            goto L_0x0262
        L_0x0260:
            r17 = r3
        L_0x0262:
            boolean r21 = r40.mo81103n()
            com.google.android.speech.embedded.TaggerResult r9 = r2.f235994d
            if (r9 == 0) goto L_0x0275
            java.lang.String r10 = "Negative"
            java.lang.String r9 = r9.f118518a
            boolean r9 = r10.equals(r9)
            if (r9 != 0) goto L_0x0275
            goto L_0x028c
        L_0x0275:
            boolean r9 = r40.mo81108t()
            if (r9 == 0) goto L_0x028c
            com.google.bb.a.ad r9 = r40.mo81107s()
            com.google.bb.a.bg r9 = r9.f144537e
            if (r9 != 0) goto L_0x0285
            com.google.bb.a.bg r9 = com.google.p4152bb.p4153a.C54976bg.f144641o
        L_0x0285:
            boolean r9 = r9.f144647e
            if (r9 == 0) goto L_0x028c
            r22 = 1
            goto L_0x028e
        L_0x028c:
            r22 = 0
        L_0x028e:
            boolean r9 = r40.mo81101l()
            r23 = r9 ^ 1
            r4 = r4 ^ r0
            r9 = r45
            boolean r24 = com.google.android.apps.gsa.staticplugins.actions.p7359e.C93350q.m153571a(r2, r15, r9, r4, r5)
            long r26 = r40.mo81090b()
            boolean r4 = r40.mo81108t()
            if (r4 != 0) goto L_0x02a8
        L_0x02a5:
            r32 = r3
            goto L_0x02e9
        L_0x02a8:
            com.google.bb.a.ad r4 = r40.mo81107s()
            com.google.bb.a.bg r5 = r4.f144537e
            if (r5 != 0) goto L_0x02b2
            com.google.bb.a.bg r5 = com.google.p4152bb.p4153a.C54976bg.f144641o
        L_0x02b2:
            com.google.protobuf.bt r10 = com.google.p4152bb.p4153a.C55263lx.f145544k
            com.google.protobuf.bt r10 = com.google.protobuf.C62942bv.checkIsLite(r10)
            r5.mo58887l(r10)
            com.google.protobuf.bf r5 = r5.f169962ag
            com.google.protobuf.bs r10 = r10.f169971d
            boolean r5 = r5.mo58857o(r10)
            if (r5 == 0) goto L_0x02a5
            com.google.bb.a.bg r4 = r4.f144537e
            if (r4 != 0) goto L_0x02cb
            com.google.bb.a.bg r4 = com.google.p4152bb.p4153a.C54976bg.f144641o
        L_0x02cb:
            com.google.protobuf.bt r5 = com.google.p4152bb.p4153a.C55263lx.f145544k
            com.google.protobuf.bt r5 = com.google.protobuf.C62942bv.checkIsLite(r5)
            r4.mo58887l(r5)
            com.google.protobuf.bf r4 = r4.f169962ag
            com.google.protobuf.bs r10 = r5.f169971d
            java.lang.Object r4 = r4.mo58854l(r10)
            if (r4 != 0) goto L_0x02e1
            java.lang.Object r4 = r5.f169969b
            goto L_0x02e5
        L_0x02e1:
            java.lang.Object r4 = r5.mo58889c(r4)
        L_0x02e5:
            com.google.bb.a.lx r4 = (com.google.p4152bb.p4153a.C55263lx) r4
            r32 = r4
        L_0x02e9:
            r18 = 0
            r19 = 0
            r20 = 1
            r25 = 0
            r31 = 0
            r33 = 0
            r34 = 0
            r35 = 1
            r36 = 0
            r37 = 0
            r16 = r7
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r4 = r7
            goto L_0x0306
        L_0x0304:
            r9 = r45
        L_0x0306:
            boolean r5 = r39.mo81054D()
            if (r5 == 0) goto L_0x0318
            if (r4 == 0) goto L_0x0318
            com.google.bb.a.x r5 = r2.f235998h
            com.google.bb.a.x r7 = com.google.p4152bb.p4153a.C55421x.THIRD_PARTY_VOICE_INTERACTION_API
            if (r5 != r7) goto L_0x0318
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r4 = r4.mo81418d()
        L_0x0318:
            r5 = 29
            if (r4 == 0) goto L_0x03b6
            boolean r7 = r4.f236258l
            if (r7 == 0) goto L_0x03b6
            boolean r7 = r4.f236255i
            if (r7 == 0) goto L_0x03b6
            boolean r7 = r39.mo81080s()
            boolean r7 = com.google.android.apps.gsa.staticplugins.actions.p7359e.C93350q.m153571a(r2, r15, r9, r8, r7)
            if (r7 != 0) goto L_0x03b6
            dagger.a r7 = r6.f260367g
            java.lang.Object r7 = r7.mo27525b()
            com.google.android.apps.gsa.shared.logger.f r7 = (com.google.android.apps.gsa.shared.logger.C89911f) r7
            r9 = 28168267(0x1add04b, float:6.384905E-38)
            com.google.android.apps.gsa.shared.logger.e r7 = r7.mo83755a(r3, r9, r5)
            r7.mo83721a()
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r7 = new com.google.android.apps.gsa.search.shared.actions.util.CardDecision
            r16 = r7
            java.lang.String r9 = r4.f236249c
            r17 = r9
            com.google.android.apps.gsa.search.shared.actions.util.TtsRequest r9 = r4.f236250d
            r18 = r9
            java.util.List r9 = r4.f236251e
            r19 = r9
            boolean r9 = r4.f236252f
            r20 = r9
            boolean r9 = r4.f236253g
            r21 = r9
            boolean r9 = r4.f236254h
            r22 = r9
            boolean r9 = r4.f236258l
            r23 = r9
            r24 = 0
            boolean r9 = r4.f236256j
            r25 = r9
            long r9 = r4.f236257k
            r26 = r9
            int r9 = r4.f236259m
            com.google.bb.a.ab r9 = com.google.p4152bb.p4153a.C54944ab.m87544a(r9)
            com.google.common.base.ax r9 = com.google.common.base.C58833ax.m90833j(r9)
            com.google.bb.a.ab r10 = com.google.p4152bb.p4153a.C54944ab.UNKNOWN
            java.lang.Object r9 = r9.mo56109e(r10)
            r28 = r9
            com.google.bb.a.ab r28 = (com.google.p4152bb.p4153a.C54944ab) r28
            int r9 = r4.f236260n
            com.google.bb.a.ab r9 = com.google.p4152bb.p4153a.C54944ab.m87544a(r9)
            com.google.common.base.ax r9 = com.google.common.base.C58833ax.m90833j(r9)
            com.google.bb.a.ab r10 = com.google.p4152bb.p4153a.C54944ab.UNKNOWN
            java.lang.Object r9 = r9.mo56109e(r10)
            r29 = r9
            com.google.bb.a.ab r29 = (com.google.p4152bb.p4153a.C54944ab) r29
            java.util.List r9 = r4.f236261o
            r30 = r9
            com.google.z.c.z r9 = r4.f236262p
            r31 = r9
            com.google.bb.a.lx r9 = r4.f236263q
            r32 = r9
            boolean r9 = r4.f236264r
            r33 = r9
            java.util.List r9 = r4.f236266t
            r34 = r9
            boolean r9 = r4.f236265s
            r35 = r9
            boolean r9 = r4.f236267u
            r36 = r9
            boolean r4 = r4.f236268v
            r37 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r4 = r7
        L_0x03b6:
            if (r44 == 0) goto L_0x044b
            boolean r7 = r39.mo81051A()
            if (r7 == 0) goto L_0x044b
            if (r15 == 0) goto L_0x044b
            boolean r7 = r41.mo84337bV()
            if (r7 == 0) goto L_0x044b
            if (r4 == 0) goto L_0x044b
            boolean r7 = r4.f236255i
            if (r7 != 0) goto L_0x044b
            boolean r7 = r4.f236258l
            if (r7 == 0) goto L_0x044b
            boolean r7 = r4.f236252f
            if (r7 == 0) goto L_0x03ec
            com.google.android.apps.gsa.search.shared.actions.util.TtsRequest r7 = r4.f236250d
            if (r7 == 0) goto L_0x03de
            boolean r7 = com.google.android.apps.gsa.search.shared.actions.util.TtsRequest.m141979c(r7)
            if (r7 != 0) goto L_0x03ec
        L_0x03de:
            boolean r7 = r40.mo81101l()
            if (r7 != 0) goto L_0x0431
            com.google.android.apps.gsa.search.shared.actions.util.TtsRequest r7 = r4.f236250d
            boolean r7 = com.google.android.apps.gsa.search.shared.actions.util.TtsRequest.m141979c(r7)
            if (r7 == 0) goto L_0x0431
        L_0x03ec:
            java.lang.Class r1 = r39.getClass()
            r1.getSimpleName()
            java.lang.CharSequence r1 = r15.f252768g
            java.lang.String r1 = r1.toString()
            int r7 = r1.length()
            if (r7 <= 0) goto L_0x0415
            int r7 = r1.length()
            r9 = 50
            if (r7 > r9) goto L_0x0415
            android.content.res.Resources r7 = r6.f260362b
            java.lang.Object[] r9 = new java.lang.Object[r0]
            r9[r8] = r1
            r1 = 2132082866(0x7f1500b2, float:1.9805858E38)
            java.lang.String r1 = r7.getString(r1, r9)
            goto L_0x041e
        L_0x0415:
            android.content.res.Resources r1 = r6.f260362b
            r7 = 2132082865(0x7f1500b1, float:1.9805856E38)
            java.lang.String r1 = r1.getString(r7)
        L_0x041e:
            dagger.a r6 = r6.f260367g
            java.lang.Object r6 = r6.mo27525b()
            com.google.android.apps.gsa.shared.logger.f r6 = (com.google.android.apps.gsa.shared.logger.C89911f) r6
            r7 = 21171471(0x1430d0f, float:3.5825213E-38)
            com.google.android.apps.gsa.shared.logger.e r3 = r6.mo83755a(r3, r7, r5)
            r3.mo83721a()
            r3 = r1
        L_0x0431:
            if (r3 == 0) goto L_0x044b
            com.google.android.apps.gsa.search.shared.actions.util.b r1 = new com.google.android.apps.gsa.search.shared.actions.util.b
            r1.<init>()
            r1.f236289b = r0
            com.google.android.apps.gsa.search.shared.actions.util.TtsRequest r0 = new com.google.android.apps.gsa.search.shared.actions.util.TtsRequest
            r0.<init>((java.lang.String) r3, (boolean) r8)
            com.google.bb.a.ab r3 = com.google.p4152bb.p4153a.C54944ab.UNKNOWN
            r1.mo81467i(r0, r3)
            r1.mo81463e()
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r4 = r1.mo81459a()
        L_0x044b:
            byte[] r0 = r40.mo81106r()
            if (r0 == 0) goto L_0x04b3
            if (r4 == 0) goto L_0x04b3
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r0 = new com.google.android.apps.gsa.search.shared.actions.util.CardDecision
            r5 = r0
            java.lang.String r6 = r4.f236249c
            com.google.android.apps.gsa.search.shared.actions.util.TtsRequest r7 = r4.f236250d
            java.util.List r8 = r4.f236251e
            boolean r9 = r4.f236252f
            boolean r10 = r4.f236253g
            boolean r11 = r4.f236254h
            boolean r12 = r4.f236258l
            boolean r13 = r4.f236255i
            boolean r14 = r4.f236256j
            long r1 = r4.f236257k
            r15 = r1
            int r1 = r4.f236259m
            com.google.bb.a.ab r1 = com.google.p4152bb.p4153a.C54944ab.m87544a(r1)
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90833j(r1)
            com.google.bb.a.ab r2 = com.google.p4152bb.p4153a.C54944ab.UNKNOWN
            java.lang.Object r1 = r1.mo56109e(r2)
            r17 = r1
            com.google.bb.a.ab r17 = (com.google.p4152bb.p4153a.C54944ab) r17
            int r1 = r4.f236260n
            com.google.bb.a.ab r1 = com.google.p4152bb.p4153a.C54944ab.m87544a(r1)
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90833j(r1)
            com.google.bb.a.ab r2 = com.google.p4152bb.p4153a.C54944ab.UNKNOWN
            java.lang.Object r1 = r1.mo56109e(r2)
            r18 = r1
            com.google.bb.a.ab r18 = (com.google.p4152bb.p4153a.C54944ab) r18
            java.util.List r1 = r4.f236261o
            r19 = r1
            com.google.z.c.z r1 = r4.f236262p
            r20 = r1
            com.google.bb.a.lx r1 = r4.f236263q
            r21 = r1
            boolean r1 = r4.f236264r
            r22 = r1
            java.util.List r1 = r4.f236266t
            r23 = r1
            boolean r1 = r4.f236265s
            r24 = r1
            r25 = 1
            r26 = 1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r4 = r0
        L_0x04b3:
            if (r4 != 0) goto L_0x04b7
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r4 = com.google.android.apps.gsa.search.shared.actions.util.CardDecision.f236248b
        L_0x04b7:
            boolean r0 = r4.f236252f
            if (r0 != 0) goto L_0x04cc
            r0 = r38
            dagger.a r1 = r0.f260567G
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.z.a.f r1 = (com.google.android.apps.gsa.p8889z.p8890a.C118843f) r1
            int r1 = r1.mo71744e()
            if (r1 == 0) goto L_0x04de
            goto L_0x04ce
        L_0x04cc:
            r0 = r38
        L_0x04ce:
            com.google.android.apps.gsa.search.shared.service.al r1 = new com.google.android.apps.gsa.search.shared.service.al
            com.google.android.apps.gsa.search.shared.service.b.um r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.CARD_DECISION_CONTAINING_TTS
            r1.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C88244um) r2)
            com.google.android.apps.gsa.search.shared.service.ServiceEventData r1 = r1.mo81964a()
            com.google.android.apps.gsa.search.core.service.af r2 = r0.f260587o
            r2.mo80228i(r1)
        L_0x04de:
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.actions.C93421q.mo78483K(com.google.android.apps.gsa.search.shared.actions.VoiceAction, com.google.android.apps.gsa.search.shared.actions.ActionData, com.google.android.apps.gsa.shared.search.Query, com.google.android.apps.gsa.search.shared.actions.errors.a, com.google.android.apps.gsa.search.shared.service.ClientConfig, boolean, boolean, boolean, boolean, boolean, boolean):com.google.common.util.concurrent.cx");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b  */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo87697L(com.google.android.apps.gsa.search.shared.actions.VoiceAction r7, com.google.common.base.C58833ax r8) {
        /*
            r6 = this;
            boolean r0 = r7.mo81086x()
            java.lang.String r1 = "voiceAction must be in its executing state"
            com.google.common.base.C58838bb.m90869d(r0, r1)
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r0 = r7.mo81065f()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            java.lang.String r3 = "voiceAction must have provider info"
            com.google.common.base.C58838bb.m90869d(r0, r3)
            int r0 = r7.mo81067ht()
            boolean r3 = r7.mo81133M()
            if (r3 != 0) goto L_0x0029
            if (r0 == r2) goto L_0x0026
            goto L_0x0029
        L_0x0026:
            r0 = 1
            r3 = 0
            goto L_0x002a
        L_0x0029:
            r3 = 1
        L_0x002a:
            if (r3 == 0) goto L_0x0036
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r3 = r7.mo81065f()
            boolean r3 = r3.mo81435e()
            if (r3 == 0) goto L_0x003c
        L_0x0036:
            r3 = 106(0x6a, float:1.49E-43)
            if (r0 != r3) goto L_0x003d
            r0 = 106(0x6a, float:1.49E-43)
        L_0x003c:
            r1 = 1
        L_0x003d:
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            if (r1 != 0) goto L_0x004b
            r7 = 2
            com.google.android.apps.gsa.search.shared.actions.i r7 = com.google.android.apps.gsa.search.shared.actions.C87421i.m141588a(r7)
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60856cj.m92900i(r7)
            return r7
        L_0x004b:
            boolean r1 = r8.mo56113h()
            if (r1 == 0) goto L_0x0098
            java.lang.Object r8 = r8.mo56107c()
            com.google.android.apps.gsa.search.shared.actions.c r8 = (com.google.android.apps.gsa.search.shared.actions.C87401c) r8
            java.lang.Object r1 = r6.f260570J
            monitor-enter(r1)
            com.google.android.apps.gsa.search.shared.actions.c r2 = r6.f260574N     // Catch:{ all -> 0x0095 }
            if (r8 != r2) goto L_0x0060
            monitor-exit(r1)     // Catch:{ all -> 0x0095 }
            goto L_0x0098
        L_0x0060:
            com.google.android.apps.gsa.staticplugins.actions.a.h r2 = r6.f260581i     // Catch:{ all -> 0x0095 }
            if (r2 == 0) goto L_0x0067
            r2.mo87607b()     // Catch:{ all -> 0x0095 }
        L_0x0067:
            com.google.android.apps.gsa.staticplugins.actions.a.h r2 = new com.google.android.apps.gsa.staticplugins.actions.a.h     // Catch:{ all -> 0x0095 }
            android.content.Context r3 = r6.f260588p     // Catch:{ all -> 0x0095 }
            dagger.a r4 = r6.f260577c     // Catch:{ all -> 0x0095 }
            java.lang.Object r4 = r4.mo27525b()     // Catch:{ all -> 0x0095 }
            com.google.android.apps.gsa.search.core.i.t r4 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r4     // Catch:{ all -> 0x0095 }
            r2.<init>(r3, r8, r4)     // Catch:{ all -> 0x0095 }
            r6.f260581i = r2     // Catch:{ all -> 0x0095 }
            android.content.BroadcastReceiver r3 = r2.f260111g     // Catch:{ all -> 0x0095 }
            if (r3 != 0) goto L_0x0091
            com.google.android.apps.gsa.staticplugins.actions.a.d r3 = new com.google.android.apps.gsa.staticplugins.actions.a.d     // Catch:{ all -> 0x0095 }
            r3.<init>(r2)     // Catch:{ all -> 0x0095 }
            r2.f260111g = r3     // Catch:{ all -> 0x0095 }
            android.content.Context r3 = r2.f260106b     // Catch:{ all -> 0x0095 }
            android.content.BroadcastReceiver r2 = r2.f260111g     // Catch:{ all -> 0x0095 }
            android.content.IntentFilter r4 = new android.content.IntentFilter     // Catch:{ all -> 0x0095 }
            java.lang.String r5 = "com.google.android.gms.appindex.action.APPINDEX_CONTEXT_UPDATED"
            r4.<init>(r5)     // Catch:{ all -> 0x0095 }
            r3.registerReceiver(r2, r4)     // Catch:{ all -> 0x0095 }
        L_0x0091:
            r6.f260574N = r8     // Catch:{ all -> 0x0095 }
            monitor-exit(r1)     // Catch:{ all -> 0x0095 }
            goto L_0x0098
        L_0x0095:
            r7 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0095 }
            throw r7
        L_0x0098:
            java.lang.Object r8 = r6.f260570J
            monitor-enter(r8)
            com.google.android.apps.gsa.staticplugins.actions.a.h r1 = r6.f260581i     // Catch:{ all -> 0x00ef }
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90833j(r1)     // Catch:{ all -> 0x00ef }
            monitor-exit(r8)     // Catch:{ all -> 0x00ef }
            dagger.a r8 = r6.f260583k
            java.lang.Object r8 = r8.mo27525b()
            com.google.android.apps.gsa.staticplugins.actions.a.c r8 = (com.google.android.apps.gsa.staticplugins.actions.p7353a.C93271c) r8
            com.google.android.apps.gsa.staticplugins.actions.a.a r8 = r8.mo87602a(r7, r1)
            com.google.android.apps.gsa.search.core.service.af r1 = r6.f260587o
            com.google.android.apps.gsa.search.core.service.r r1 = r1.f233977l
            if (r1 == 0) goto L_0x00b7
            com.google.android.apps.gsa.search.shared.service.ClientConfig r1 = r1.f234384f
            goto L_0x00b9
        L_0x00b7:
            com.google.android.apps.gsa.search.shared.service.ClientConfig r1 = com.google.android.apps.gsa.search.shared.service.ClientConfig.f236948a
        L_0x00b9:
            com.google.common.base.ax r2 = r6.f260566F
            boolean r2 = r2.mo56113h()
            if (r2 == 0) goto L_0x00da
            com.google.common.o.amo r2 = r1.f236951d
            com.google.common.o.amo r3 = com.google.common.p4552o.amo.ANDROID_AUTO_PHONE
            if (r2 == r3) goto L_0x00cd
            com.google.common.o.amo r1 = r1.f236951d
            com.google.common.o.amo r2 = com.google.common.p4552o.amo.ANDROID_AUTO_PROJECTED
            if (r1 != r2) goto L_0x00da
        L_0x00cd:
            com.google.common.base.ax r1 = r6.f260566F
            java.lang.Object r1 = r1.mo56107c()
            com.google.android.apps.gsa.search.core.carassistant.c.a r1 = (com.google.android.apps.gsa.search.core.carassistant.p6780c.C85700a) r1
            com.google.android.apps.gsa.shared.logger.b.ae r2 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_ACTION_V2_EXECUTION_START
            r1.mo79322d(r2)
        L_0x00da:
            com.google.android.apps.gsa.staticplugins.actions.ah r1 = r6.f260597y
            com.google.android.apps.gsa.staticplugins.actions.e r2 = new com.google.android.apps.gsa.staticplugins.actions.e
            r2.<init>(r6, r8, r7, r0)
            com.google.android.apps.gsa.staticplugins.actions.f r7 = new com.google.android.apps.gsa.staticplugins.actions.f
            r7.<init>(r6)
            java.lang.String r8 = "Execute action work request"
            r0 = 12
            com.google.common.util.concurrent.cx r7 = r1.mo87624a(r8, r0, r2, r7)
            return r7
        L_0x00ef:
            r7 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00ef }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.actions.C93421q.mo87697L(com.google.android.apps.gsa.search.shared.actions.VoiceAction, com.google.common.base.ax):com.google.common.util.concurrent.cx");
    }

    /* renamed from: a */
    public final C60870cx mo78484a(C89356b bVar, Query query, ActionData actionData, C58833ax axVar, PlaybackStatus playbackStatus, C86355a aVar, C86372a aVar2) {
        return C60856cj.m92900i(this.f260598z.mo87627a(bVar, query, actionData, axVar, playbackStatus, aVar, aVar2));
    }

    /* renamed from: c */
    public final C60870cx mo78485c(VoiceAction voiceAction, Query query) {
        return m153705O(voiceAction, query.mo84337bV());
    }

    /* JADX WARNING: type inference failed for: r7v11, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo78486e(com.google.android.apps.gsa.search.shared.actions.util.PromptSegment r6, java.lang.String r7, boolean r8) {
        /*
            r5 = this;
            com.google.android.apps.gsa.search.shared.service.b.wj r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88295wj.f238797g
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.gsa.search.shared.service.b.wi r0 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88294wi) r0
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 != 0) goto L_0x0020
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.gsa.search.shared.service.b.wj r1 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88295wj) r1
            r7.getClass()
            int r2 = r1.f238799a
            r2 = r2 | 4
            r1.f238799a = r2
            r1.f238803e = r7
        L_0x0020:
            java.lang.String r7 = r6.f236271a
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 != 0) goto L_0x003a
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.gsa.search.shared.service.b.wj r1 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88295wj) r1
            r7.getClass()
            int r2 = r1.f238799a
            r2 = r2 | 1
            r1.f238799a = r2
            r1.f238800b = r7
        L_0x003a:
            com.google.android.apps.gsa.search.shared.actions.util.ImageInfo r7 = r6.f236273c
            r1 = 0
            if (r7 == 0) goto L_0x0067
            java.lang.String r2 = r7.f236269a
            if (r2 != 0) goto L_0x0044
            goto L_0x0067
        L_0x0044:
            com.google.android.apps.gsa.search.shared.service.b.hj r1 = com.google.android.apps.gsa.search.shared.service.p6935b.C87890hj.f237764c
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.gsa.search.shared.service.b.hi r1 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87889hi) r1
            java.lang.String r7 = r7.f236269a
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.gsa.search.shared.service.b.hj r2 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87890hj) r2
            r7.getClass()
            int r3 = r2.f237766a
            r3 = r3 | 1
            r2.f237766a = r3
            r2.f237767b = r7
            com.google.protobuf.bv r7 = r1.build()
            r1 = r7
            com.google.android.apps.gsa.search.shared.service.b.hj r1 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87890hj) r1
        L_0x0067:
            if (r1 == 0) goto L_0x0078
            r0.copyOnWrite()
            com.google.protobuf.bv r7 = r0.instance
            com.google.android.apps.gsa.search.shared.service.b.wj r7 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88295wj) r7
            r7.f238802d = r1
            int r1 = r7.f238799a
            r1 = r1 | 2
            r7.f238799a = r1
        L_0x0078:
            java.util.List r6 = r6.f236274d
            if (r6 == 0) goto L_0x00e4
            r7 = 0
        L_0x007d:
            int r1 = r6.size()
            if (r7 >= r1) goto L_0x00e4
            com.google.android.apps.gsa.search.shared.service.b.xy r1 = com.google.android.apps.gsa.search.shared.service.p6935b.C88337xy.f238901d
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.gsa.search.shared.service.b.xx r1 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88336xx) r1
            java.lang.Object r2 = r6.get(r7)
            com.google.android.apps.gsa.search.shared.actions.util.Suggestion r2 = (com.google.android.apps.gsa.search.shared.actions.util.Suggestion) r2
            java.lang.String r2 = r2.f236275a
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.android.apps.gsa.search.shared.service.b.xy r3 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88337xy) r3
            r2.getClass()
            int r4 = r3.f238903a
            r4 = r4 | 1
            r3.f238903a = r4
            r3.f238904b = r2
            java.lang.Object r2 = r6.get(r7)
            com.google.android.apps.gsa.search.shared.actions.util.Suggestion r2 = (com.google.android.apps.gsa.search.shared.actions.util.Suggestion) r2
            com.google.bb.a.pt r2 = r2.f236276b
            int r2 = r2.f145897f
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.android.apps.gsa.search.shared.service.b.xy r3 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88337xy) r3
            int r4 = r3.f238903a
            r4 = r4 | 2
            r3.f238903a = r4
            r3.f238905c = r2
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.apps.gsa.search.shared.service.b.wj r2 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88295wj) r2
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.apps.gsa.search.shared.service.b.xy r1 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88337xy) r1
            r1.getClass()
            com.google.protobuf.cq r3 = r2.f238801c
            boolean r4 = r3.mo58948c()
            if (r4 != 0) goto L_0x00dc
            com.google.protobuf.cq r3 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r3)
            r2.f238801c = r3
        L_0x00dc:
            com.google.protobuf.cq r2 = r2.f238801c
            r2.add(r1)
            int r7 = r7 + 1
            goto L_0x007d
        L_0x00e4:
            r0.copyOnWrite()
            com.google.protobuf.bv r6 = r0.instance
            com.google.android.apps.gsa.search.shared.service.b.wj r6 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88295wj) r6
            int r7 = r6.f238799a
            r7 = r7 | 8
            r6.f238799a = r7
            r6.f238804f = r8
            com.google.protobuf.bv r6 = r0.build()
            com.google.android.apps.gsa.search.shared.service.b.wj r6 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88295wj) r6
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60856cj.m92900i(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.actions.C93421q.mo78486e(com.google.android.apps.gsa.search.shared.actions.util.PromptSegment, java.lang.String, boolean):com.google.common.util.concurrent.cx");
    }

    /* renamed from: f */
    public final C60870cx mo78487f(CardDecision cardDecision, int i, int i2, boolean z) {
        AudioManager audioManager = (AudioManager) this.f260588p.getSystemService("audio");
        boolean z2 = cardDecision.f236254h;
        boolean z3 = false;
        boolean z4 = z2 && i != 0 && i2 > 0;
        boolean z5 = z2 && z;
        boolean z6 = z4 || cardDecision.f236263q != null || audioManager.getStreamVolume(3) == 0;
        if (z5 || cardDecision.f236263q != null) {
            z3 = true;
        }
        C88300wo woVar = (C88300wo) C88301wp.f238811d.createBuilder();
        woVar.copyOnWrite();
        C88301wp wpVar = (C88301wp) woVar.instance;
        wpVar.f238813a |= 1;
        wpVar.f238814b = z6;
        woVar.copyOnWrite();
        C88301wp wpVar2 = (C88301wp) woVar.instance;
        wpVar2.f238813a |= 2;
        wpVar2.f238815c = z3;
        return C60856cj.m92900i((C88301wp) woVar.build());
    }

    /* renamed from: g */
    public final C60870cx mo78488g(VoiceAction voiceAction, Query query, C58833ax axVar) {
        Map map;
        VoiceAction voiceAction2 = voiceAction;
        C58833ax axVar2 = axVar;
        C85669bt btVar = (C85669bt) this.f260576b.mo27525b();
        PersonDisambiguation h = C85669bt.m137539h(voiceAction);
        if (h != null) {
            PersonShortcut personShortcut = h.f236397m;
            PersonShortcut personShortcut2 = null;
            if (personShortcut != null && h.mo81608D()) {
                Parcelable parcelable = h.f236412o;
                parcelable.getClass();
                Contact contact = (Contact) parcelable;
                if (!contact.f236350a.equals(personShortcut.f236402e) || contact.f236351b != personShortcut.f236399b || !TextUtils.equals(contact.f236354e, personShortcut.f236400c) || !TextUtils.equals(contact.f236356g, personShortcut.f236401d)) {
                    h.f236397m = null;
                }
            }
            if (h.f236397m == null) {
                if (h.mo81543l() && (map = h.f236396l) != null && !map.isEmpty()) {
                    Parcelable parcelable2 = h.f236364c;
                    parcelable2.getClass();
                    Person person = (Person) parcelable2;
                    long currentTimeMillis = System.currentTimeMillis();
                    List list = h.f236411n;
                    if (list == null || list.isEmpty()) {
                        PersonShortcutKey personShortcutKey = (PersonShortcutKey) map.get(C87515c.PERSON);
                        personShortcutKey.getClass();
                        personShortcut2 = new PersonShortcut(personShortcutKey, currentTimeMillis, person.f236371b, (String) null, (String) null);
                    } else {
                        Parcelable parcelable3 = h.f236412o;
                        parcelable3.getClass();
                        Contact contact2 = (Contact) parcelable3;
                        PersonShortcutKey personShortcutKey2 = (PersonShortcutKey) map.get(contact2.f236350a);
                        if (personShortcutKey2 != null) {
                            personShortcut2 = new PersonShortcut(personShortcutKey2, currentTimeMillis, person.f236371b, contact2.f236354e, contact2.f236356g);
                        }
                    }
                }
                if (personShortcut2 != null) {
                    PersonShortcut a = btVar.mo79198a(personShortcut2);
                    if (a != null) {
                        if (!a.equals(personShortcut2)) {
                            btVar.f231595a.remove(a);
                        }
                    }
                    C89949q.m146523g(308);
                    btVar.f231595a.add(personShortcut2);
                    btVar.mo79202e();
                }
            }
        }
        if (voiceAction.mo81065f() != null) {
            return mo87697L(voiceAction2, axVar2);
        }
        C90931ca caVar = this.f260585m;
        boolean z = true;
        if (!query.mo84337bV() && !query.mo84326bK()) {
            z = false;
        }
        return caVar.mo85140e(m153705O(voiceAction2, z), new C93405m(this, voiceAction2, axVar2));
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("ActionWorker");
        fVar.mo85279c("last execute result").mo85276a(C90752i.m148229c(String.valueOf(this.f260582j)));
    }

    /* renamed from: h */
    public final C60870cx mo78489h(ModularAction modularAction, List list) {
        C93286r rVar = (C93286r) ((C93271c) this.f260583k.mo27525b()).mo87602a(modularAction, C58836b.f156633a);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C55253ln lnVar = (C55253ln) it.next();
            C55240la laVar = (C55240la) rVar.f260141c.mo87628a(lnVar.f145510b, modularAction, (String) null).first;
            if (laVar != null) {
                C55252lm lmVar = (C55252lm) C55253ln.f145507e.createBuilder();
                lmVar.mo54221a(laVar);
                C55244le leVar = lnVar.f145511c;
                if (leVar == null) {
                    leVar = C55244le.f145466h;
                }
                lmVar.copyOnWrite();
                C55253ln lnVar2 = (C55253ln) lmVar.instance;
                leVar.getClass();
                lnVar2.f145511c = leVar;
                lnVar2.f145509a |= 1;
                C55244le leVar2 = lnVar.f145512d;
                if (leVar2 == null) {
                    leVar2 = C55244le.f145466h;
                }
                lmVar.copyOnWrite();
                C55253ln lnVar3 = (C55253ln) lmVar.instance;
                leVar2.getClass();
                lnVar3.f145512d = leVar2;
                lnVar3.f145509a |= 2;
                arrayList.add((C55253ln) lmVar.build());
            }
        }
        return C60856cj.m92900i(arrayList);
    }

    /* renamed from: hY */
    public final void mo79108hY() {
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f260570J) {
            C93276h hVar = this.f260581i;
            if (hVar != null) {
                hVar.mo87607b();
                this.f260581i = null;
            }
            this.f260574N = null;
        }
    }

    /* renamed from: i */
    public final C60870cx mo78490i(ActionData actionData, C87756ck ckVar, C87456t tVar, Query query) {
        C60870cx c = this.f260585m.mo85138c(new C93404l(this, tVar, ckVar));
        new C90873ag(c, this.f260586n, "ActionWorker [select person and apply shortcut]", new C93386g(this, tVar, actionData, query)).mo85223a(C93400h.f260502a);
        return C118826c.m197213c(c);
    }

    /* renamed from: j */
    public final C60870cx mo78491j(VoiceAction voiceAction) {
        C86775r rVar = this.f260587o.f233977l;
        if (rVar != null) {
            C87684al alVar = new C87684al(C88244um.UPDATE_TOP_VOICE_ACTION);
            alVar.mo81966c(new ParcelableVoiceAction(voiceAction));
            rVar.f234383e.mo80379b(alVar.mo81964a());
        }
        return C118826c.f331423b;
    }

    /* renamed from: k */
    public final C60870cx mo78492k(Query query, ActionData actionData, PlaybackStatus playbackStatus, C86355a aVar, C86372a aVar2) {
        C87880h hVar = (C87880h) C87907i.f237794c.createBuilder();
        int a = ((C90738av) this.f260569I.mo27525b()).mo85088a(actionData.f235996f);
        hVar.copyOnWrite();
        C87907i iVar = (C87907i) hVar.instance;
        iVar.f237797b = a - 2;
        iVar.f237796a |= 1;
        C87684al alVar = new C87684al(C88244um.ACTION_RECEIVED_EVENT);
        alVar.mo81965b(C87853g.f237693a, (C87907i) hVar.build());
        this.f260587o.mo80228i(alVar.mo81964a());
        return ((C93429y) m153703M(query, actionData, playbackStatus, aVar, aVar2)).f260645a.mo60297gq();
    }

    /* renamed from: l */
    public final C60870cx mo78493l(Query query, ActionData actionData, PlaybackStatus playbackStatus, C86355a aVar, C86372a aVar2) {
        C58838bb.m90869d(query.mo84435dP(), "calling processActionDataUsingSearchGraph() on a non-SearchGraph query");
        return C118826c.m197213c(m153703M(query, actionData, playbackStatus, aVar, aVar2).mo79125b());
    }

    /* renamed from: m */
    public final C60870cx mo78494m(Argument argument) {
        return C118826c.m197213c(this.f260597y.mo87624a("Process argument of modular voice action", 16, new C93402j(argument, (C93322i) this.f260571K.mo6453a()), new C93403k(this)));
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }

    /* renamed from: p */
    public final C60870cx mo78496p(ActionData actionData, int i, int i2, boolean z, boolean z2, C87541c cVar) {
        int a = cVar.mo81640a();
        TaggerResult taggerResult = actionData != null ? actionData.f235994d : null;
        int i3 = C89885b.ACTION_ERROR_NO_PROGRESS_VALUE;
        if (a > 0) {
            if (a <= i2 && i == 1114113) {
                i = C89885b.ACTION_ERROR_NO_PROGRESS_VALUE;
            }
            return C60856cj.m92900i(C58833ax.m90834k(Integer.valueOf(i3)));
        }
        if ((actionData == null || actionData.mo81089a() <= 0 || (actionData.mo81089a() <= i2 && i == 1114113)) && (taggerResult == null || !"OfflineFollowOnNoMatch".equals(taggerResult.f118518a))) {
            if (!z2 || z) {
                return C60856cj.m92900i(C58836b.f156633a);
            }
            i3 = C89885b.ACTION_ERROR_NO_AUDIO_VALUE;
        }
        return C60856cj.m92900i(C58833ax.m90834k(Integer.valueOf(i3)));
    }

    /* renamed from: q */
    public final void mo78497q(C87541c cVar) {
        cVar.mo81653o();
    }

    /* renamed from: r */
    public final void mo78498r(C87423k kVar) {
        C86775r rVar = this.f260587o.f233977l;
        if (rVar != null) {
            C88358ys ysVar = (C88358ys) C88359yt.f238950c.createBuilder();
            ysVar.copyOnWrite();
            C88359yt ytVar = (C88359yt) ysVar.instance;
            ytVar.f238953b = kVar;
            ytVar.f238952a |= 1;
            C87684al alVar = new C87684al(C88244um.UNDO_ACTION_USER_INTERACTION);
            alVar.mo81965b(C88357yr.f238949a, (C88359yt) ysVar.build());
            rVar.f234383e.mo80379b(alVar.mo81964a());
        }
    }

    /* renamed from: s */
    public final void mo78499s(VoiceAction voiceAction) {
        ModularActionMatchingProviderInfo modularActionMatchingProviderInfo;
        C93304aj ajVar = this.f260596x;
        if (ajVar.f260199e == null) {
            ajVar.f260199e = new C93330q(new C93324k());
        }
        C54946ad a = ajVar.f260199e.mo81493a(voiceAction, (CardDecision) null, (C54948af) null, (C54960ar) null, (C54976bg) null);
        C88208td tdVar = (C88208td) C88209te.f238431e.createBuilder();
        if (a != null) {
            tdVar.copyOnWrite();
            C88209te teVar = (C88209te) tdVar.instance;
            teVar.f238435c = a;
            teVar.f238433a |= 2;
        }
        MatchingProviderInfo a2 = ajVar.f260197c.mo87621a(voiceAction, false);
        if (a2 instanceof ModularActionMatchingProviderInfo) {
            modularActionMatchingProviderInfo = (ModularActionMatchingProviderInfo) a2;
        } else {
            modularActionMatchingProviderInfo = a2 != null ? new ModularActionMatchingProviderInfo(a2, (C55240la) null, (C55240la) null, (C55240la) null, (C55240la) null, (C55240la) null, (C55240la) null) : null;
        }
        if (modularActionMatchingProviderInfo != null) {
            C87469h hVar = (C87469h) C87470i.f236235i.createBuilder();
            C87490l lVar = (C87490l) C87491m.f236316d.createBuilder();
            C55373pz pzVar = modularActionMatchingProviderInfo.f236270h.f236313b;
            if (pzVar != null) {
                lVar.copyOnWrite();
                C87491m mVar = (C87491m) lVar.instance;
                mVar.f236320c = pzVar;
                mVar.f236318a |= 1;
            }
            List list = modularActionMatchingProviderInfo.f236270h.f236312a;
            lVar.copyOnWrite();
            C87491m mVar2 = (C87491m) lVar.instance;
            C62971cq cqVar = mVar2.f236319b;
            if (!cqVar.mo58948c()) {
                mVar2.f236319b = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) list, (List) mVar2.f236319b);
            C87491m mVar3 = (C87491m) lVar.build();
            hVar.copyOnWrite();
            C87470i iVar = (C87470i) hVar.instance;
            mVar3.getClass();
            iVar.f236238b = mVar3;
            iVar.f236237a |= 1;
            C55240la laVar = modularActionMatchingProviderInfo.f236115a;
            if (laVar != null) {
                hVar.copyOnWrite();
                C87470i iVar2 = (C87470i) hVar.instance;
                iVar2.f236239c = laVar;
                iVar2.f236237a |= 2;
            }
            C55240la laVar2 = modularActionMatchingProviderInfo.f236116b;
            if (laVar2 != null) {
                hVar.copyOnWrite();
                C87470i iVar3 = (C87470i) hVar.instance;
                iVar3.f236240d = laVar2;
                iVar3.f236237a |= 4;
            }
            C55240la laVar3 = modularActionMatchingProviderInfo.f236117c;
            if (laVar3 != null) {
                hVar.copyOnWrite();
                C87470i iVar4 = (C87470i) hVar.instance;
                iVar4.f236241e = laVar3;
                iVar4.f236237a |= 8;
            }
            C55240la laVar4 = modularActionMatchingProviderInfo.f236118d;
            if (laVar4 != null) {
                hVar.copyOnWrite();
                C87470i iVar5 = (C87470i) hVar.instance;
                iVar5.f236242f = laVar4;
                iVar5.f236237a |= 16;
            }
            C55240la laVar5 = modularActionMatchingProviderInfo.f236119e;
            if (laVar5 != null) {
                hVar.copyOnWrite();
                C87470i iVar6 = (C87470i) hVar.instance;
                iVar6.f236243g = laVar5;
                iVar6.f236237a |= 32;
            }
            C55240la laVar6 = modularActionMatchingProviderInfo.f236120f;
            if (laVar6 != null) {
                hVar.copyOnWrite();
                C87470i iVar7 = (C87470i) hVar.instance;
                iVar7.f236244h = laVar6;
                iVar7.f236237a |= 64;
            }
            C87470i iVar8 = (C87470i) hVar.build();
            tdVar.copyOnWrite();
            C88209te teVar2 = (C88209te) tdVar.instance;
            iVar8.getClass();
            teVar2.f238436d = iVar8;
            teVar2.f238433a |= 4;
        }
        ajVar.mo87626a((C88209te) tdVar.build());
    }

    /* renamed from: t */
    public final void mo78500t(VoiceAction voiceAction, ActionData actionData, CardDecision cardDecision, C87424l lVar, Query query) {
        m153707Q();
        C56127a a = C93390d.m153638a(actionData, lVar.f236090a, query);
        C56137k kVar = (C56137k) C56138l.f149554i.createBuilder();
        int i = lVar.f236092c;
        kVar.copyOnWrite();
        C56138l lVar2 = (C56138l) kVar.instance;
        int i2 = i - 1;
        if (i != 0) {
            lVar2.f149557b = i2;
            lVar2.f149556a |= 1;
            if (voiceAction != null) {
                int i3 = voiceAction.mo81066g().f146230cP;
                kVar.copyOnWrite();
                C56138l lVar3 = (C56138l) kVar.instance;
                lVar3.f149556a |= 4;
                lVar3.f149559d = i3;
                kVar.copyOnWrite();
                C56138l lVar4 = (C56138l) kVar.instance;
                lVar4.f149556a |= 64;
                lVar4.f149562g = voiceAction.mo81082u();
            } else if (actionData != null) {
                int i4 = actionData.f235998h.f146230cP;
                kVar.copyOnWrite();
                C56138l lVar5 = (C56138l) kVar.instance;
                lVar5.f149556a |= 4;
                lVar5.f149559d = i4;
                C54946ad s = actionData.mo81107s();
                boolean z = false;
                if (s != null) {
                    C62940bt r3 = C62942bv.checkIsLite(C55265lz.f145556m);
                    s.mo58887l(r3);
                    if (s.f169962ag.mo58857o(r3.f169971d)) {
                        z = true;
                    }
                }
                kVar.copyOnWrite();
                C56138l lVar6 = (C56138l) kVar.instance;
                lVar6.f149556a |= 64;
                lVar6.f149562g = z;
            }
            if (actionData != null && !actionData.mo81101l()) {
                kVar.copyOnWrite();
                C56138l lVar7 = (C56138l) kVar.instance;
                lVar7.f149563h = 1;
                lVar7.f149556a |= 128;
            }
            int i5 = lVar.f236093d;
            C56132f fVar = (C56132f) C56133g.f149545f.createBuilder();
            boolean dA = query.mo84420dA();
            fVar.copyOnWrite();
            C56133g gVar = (C56133g) fVar.instance;
            gVar.f149547a |= 64;
            gVar.f149551e = dA;
            fVar.copyOnWrite();
            C56133g gVar2 = (C56133g) fVar.instance;
            int i6 = i5 - 1;
            if (i5 != 0) {
                gVar2.f149548b = i6;
                gVar2.f149547a |= 1;
                if (i5 == 3) {
                    int i7 = lVar.f236094e;
                    fVar.copyOnWrite();
                    C56133g gVar3 = (C56133g) fVar.instance;
                    int i8 = i7 - 1;
                    if (i7 != 0) {
                        gVar3.f149549c = i8;
                        gVar3.f149547a |= 2;
                    } else {
                        throw null;
                    }
                } else if (i5 == 2) {
                    String str = query.f252770i;
                    fVar.copyOnWrite();
                    C56133g gVar4 = (C56133g) fVar.instance;
                    str.getClass();
                    gVar4.f149547a |= 4;
                    gVar4.f149550d = str;
                }
                C56133g gVar5 = (C56133g) fVar.build();
                kVar.copyOnWrite();
                C56138l lVar8 = (C56138l) kVar.instance;
                gVar5.getClass();
                lVar8.f149558c = gVar5;
                lVar8.f149556a |= 2;
                int a2 = C56136j.m87913a(lVar8.f149557b);
                if (a2 == 0) {
                    a2 = 1;
                }
                int i9 = a2 - 1;
                if (i9 == 1) {
                    C56138l lVar9 = (C56138l) kVar.build();
                } else if (i9 == 2) {
                    C56138l lVar10 = (C56138l) kVar.build();
                } else if (i9 == 3) {
                    long j = cardDecision.f236257k;
                    kVar.copyOnWrite();
                    C56138l lVar11 = (C56138l) kVar.instance;
                    lVar11.f149556a |= 8;
                    lVar11.f149560e = (int) j;
                } else if (i9 == 5) {
                    int i10 = C87424l.m141592f(cardDecision).f144530R;
                    kVar.copyOnWrite();
                    C56138l lVar12 = (C56138l) kVar.instance;
                    lVar12.f149556a |= 16;
                    lVar12.f149561f = i10;
                } else if (i9 == 6) {
                    C56138l lVar13 = (C56138l) kVar.build();
                }
                C56138l lVar14 = (C56138l) kVar.build();
                a.copyOnWrite();
                C56128b bVar = (C56128b) a.instance;
                C56128b bVar2 = C56128b.f149531j;
                lVar14.getClass();
                bVar.f149537e = lVar14;
                bVar.f149533a |= 16;
                C56128b bVar3 = (C56128b) a.build();
                C93390d.m153639b(bVar3);
                C56138l lVar15 = bVar3.f149537e;
                if (lVar15 == null) {
                    lVar15 = C56138l.f149554i;
                }
                lVar.f236095f = lVar.f236092c;
                lVar.f236091b = (C54944ab) C58833ax.m90833j(C54944ab.m87544a(lVar15.f149561f)).mo56109e(C54944ab.UNKNOWN);
                lVar.f236092c = 1;
                lVar.f236093d = 1;
                lVar.f236094e = 1;
                return;
            }
            throw null;
        }
        throw null;
    }

    /* renamed from: u */
    public final void mo78501u(ActionData actionData, C87424l lVar, Query query) {
        m153707Q();
        C56127a a = C93390d.m153638a(actionData, lVar.f236090a, query);
        C56139m mVar = (C56139m) C56140n.f149564c.createBuilder();
        mVar.copyOnWrite();
        C56140n nVar = (C56140n) mVar.instance;
        nVar.f149566a |= 1;
        nVar.f149567b = false;
        C56140n nVar2 = (C56140n) mVar.build();
        a.copyOnWrite();
        C56128b bVar = (C56128b) a.instance;
        C56128b bVar2 = C56128b.f149531j;
        nVar2.getClass();
        bVar.f149538f = nVar2;
        bVar.f149533a |= 32;
        C93390d.m153639b((C56128b) a.build());
    }

    /* renamed from: v */
    public final void mo78502v(int i, C58181d dVar, long j) {
        ((C85919cm) this.f260590r.mo27525b()).mo79545d(i, dVar, (String) null, Long.valueOf(j), (C85929cw) this.f260591s.mo27525b(), -1, -1);
    }

    /* renamed from: w */
    public final void mo78503w(Query query, ActionData actionData, VoiceAction voiceAction, CardDecision cardDecision, C87541c cVar, C84773a aVar) {
        C54946ad s;
        Object obj;
        boolean z = voiceAction != null && (voiceAction.mo81083v() || voiceAction.mo81084w());
        if ((voiceAction == null || voiceAction.mo81051A() || (query.mo84403cj() && z)) && actionData.mo81108t() && (s = actionData.mo81107s()) != null) {
            C62940bt r3 = C62942bv.checkIsLite(C55265lz.f145556m);
            s.mo58887l(r3);
            if (s.f169962ag.mo58857o(r3.f169971d)) {
                C62940bt r32 = C62942bv.checkIsLite(C55265lz.f145556m);
                s.mo58887l(r32);
                Object l = s.f169962ag.mo58854l(r32.f169971d);
                if (l == null) {
                    obj = r32.f169969b;
                } else {
                    obj = r32.mo58889c(l);
                }
                C55265lz lzVar = (C55265lz) obj;
                int i = lzVar.f145565h;
                ArrayList arrayList = new ArrayList();
                if (lzVar.f145560c.size() != 0) {
                    for (C55305nl nlVar : lzVar.f145560c) {
                        for (C55240la laVar : nlVar.f145692b) {
                            if (!(laVar == null || (laVar.f145451a & 32) == 0)) {
                                arrayList.add(Integer.valueOf(laVar.f145457g));
                            }
                        }
                    }
                    C89933d a = C87400a.m141528a(query, actionData, cVar.mo81640a(), voiceAction, cardDecision);
                    if (a != null) {
                        C89930a N = m153704N(aVar);
                        C89932c cVar2 = this.f260578f;
                        if (cVar2.f246397g) {
                            ArrayList arrayList2 = new ArrayList();
                            C58163o oVar = (C58163o) C58164p.f155504d.createBuilder();
                            oVar.copyOnWrite();
                            C58164p pVar = (C58164p) oVar.instance;
                            pVar.f155506a |= 1;
                            pVar.f155507b = i;
                            int i2 = 0;
                            while (i2 < arrayList.size()) {
                                i2++;
                                oVar.mo54678a(i2);
                            }
                            arrayList2.add((C58164p) oVar.build());
                            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                                C58163o oVar2 = (C58163o) C58164p.f155504d.createBuilder();
                                int intValue = ((Integer) arrayList.get(i3)).intValue();
                                oVar2.copyOnWrite();
                                C58164p pVar2 = (C58164p) oVar2.instance;
                                pVar2.f155506a |= 1;
                                pVar2.f155507b = intValue;
                                arrayList2.add((C58164p) oVar2.build());
                            }
                            cVar2.mo83777g(arrayList2, a);
                        }
                        m153706P(N);
                    }
                }
            }
        }
    }

    /* renamed from: x */
    public final void mo78504x(ModularAction modularAction, C84773a aVar) {
        C55240la laVar = ((ModularActionMatchingProviderInfo) modularAction.f235986b).f236115a;
        int i = laVar != null ? laVar.f145457g : 0;
        if (i == 0) {
            i = modularAction.f236108n;
        }
        C89930a N = m153704N(aVar);
        C89932c cVar = this.f260578f;
        if (cVar.f246397g) {
            cVar.mo83779i(i, -1, 34);
        }
        m153706P(N);
    }

    /* renamed from: y */
    public final void mo78505y(C87421i iVar) {
        C93304aj ajVar = this.f260596x;
        if (ajVar.f260200f) {
            C87684al alVar = new C87684al(C88244um.REMOTE_ACTION_RESPONSE);
            C62940bt btVar = C88207tc.f238430a;
            C88208td tdVar = (C88208td) C88209te.f238431e.createBuilder();
            int i = iVar.f236082d;
            tdVar.copyOnWrite();
            C88209te teVar = (C88209te) tdVar.instance;
            teVar.f238433a |= 1;
            teVar.f238434b = i;
            alVar.mo81965b(btVar, (C88209te) tdVar.build());
            ajVar.f260196b.mo80228i(alVar.mo81964a());
            ajVar.f260200f = false;
        }
    }

    /* renamed from: z */
    public final void mo78506z(VoiceAction voiceAction) {
        ((C85669bt) this.f260576b.mo27525b()).mo79201d(voiceAction);
    }

    /* renamed from: H */
    public final void mo78480H(C87541c cVar, ClientConfig clientConfig, Query query, ActionData actionData, VoiceAction voiceAction, CardDecision cardDecision, C55421x xVar, boolean z) {
        C68032v vVar;
        Object obj;
        ActionData actionData2 = actionData;
        C55421x xVar2 = xVar;
        if (voiceAction == null) {
            cVar.mo81653o();
        } else if (actionData2 != null) {
            C68032v vVar2 = null;
            C54946ad s = actionData.mo81108t() ? actionData.mo81107s() : null;
            C58179b bVar = actionData2.f235995e;
            if (bVar != null && (vVar2 = bVar.f155541f) == null) {
                vVar2 = C68032v.f184320b;
            }
            if ((query.mo84326bK() || clientConfig.f236953f.equals("clockwork")) && bVar == null && s != null) {
                C54976bg bgVar = s.f144537e;
                if (bgVar == null) {
                    bgVar = C54976bg.f144641o;
                }
                C62940bt r5 = C62942bv.checkIsLite(C68026p.f184307c);
                bgVar.mo58887l(r5);
                Object l = bgVar.f169962ag.mo58854l(r5.f169971d);
                if (l == null) {
                    obj = r5.f169969b;
                } else {
                    obj = r5.mo58889c(l);
                }
                C68026p pVar = (C68026p) obj;
                if (pVar.f184309a.size() > 0) {
                    C68032v vVar3 = ((C68024n) pVar.f184309a.get(0)).f184300a;
                    if (vVar3 == null) {
                        vVar3 = C68032v.f184320b;
                    }
                    vVar = vVar3;
                    cVar.mo81661w(s, voiceAction, vVar, cardDecision, actionData2.f236000j, z, C90741ay.m148210b(query.f252768g), actionData2.f235994d);
                }
            }
            vVar = vVar2;
            cVar.mo81661w(s, voiceAction, vVar, cardDecision, actionData2.f236000j, z, C90741ay.m148210b(query.f252768g), actionData2.f235994d);
        }
        if (xVar2 != C55421x.UNKNOWN_ACTION_TYPE) {
            C87541c cVar2 = cVar;
            cVar.mo81659u(xVar2);
        }
    }

    /* renamed from: n */
    public final C60870cx mo78495n(C88206tb tbVar) {
        C93304aj ajVar = this.f260596x;
        if (ajVar.f260200f) {
            return C60856cj.m92899h(new IllegalStateException("Action is already executing"));
        }
        Query aL = Query.f252741b.mo84275aL("com.google.android.apps.gsa.search.core.service.SearchService");
        ajVar.f260200f = true;
        return ajVar.f260198d.mo85138c(new C93303ai(ajVar, tbVar, aL));
    }
}
