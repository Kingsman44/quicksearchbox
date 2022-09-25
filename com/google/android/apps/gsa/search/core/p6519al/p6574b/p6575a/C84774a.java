package com.google.android.apps.gsa.search.core.p6519al.p6574b.p6575a;

import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84773a;
import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84809b;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6822a.C86355a;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6826e.C86372a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86727g;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.actions.C87421i;
import com.google.android.apps.gsa.search.shared.actions.C87423k;
import com.google.android.apps.gsa.search.shared.actions.C87424l;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.errors.C87413a;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87456t;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.search.shared.actions.util.PromptSegment;
import com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation;
import com.google.android.apps.gsa.search.shared.media.PlaybackStatus;
import com.google.android.apps.gsa.search.shared.p6926d.C87541c;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.UpdateVoiceActionUiEventParcelable;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87756ck;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88206tb;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88209te;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88226tv;
import com.google.android.apps.gsa.search.shared.service.p6935b.aad;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4152bb.p4153a.C55421x;
import com.google.p4500cm.p4518d.p4519a.C58179b;
import com.google.p4500cm.p4518d.p4519a.C58181d;
import dagger.C68214a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.al.b.a.a */
/* compiled from: PG */
public final class C84774a implements C84809b {

    /* renamed from: a */
    private final C68214a f230402a;

    public C84774a(C68214a aVar) {
        this.f230402a = aVar;
    }

    /* renamed from: A */
    public final void mo78473A() {
        ((C86727g) this.f230402a.mo27525b()).mo80313b(new C84807y());
    }

    /* renamed from: B */
    public final void mo78474B(C88226tv tvVar) {
        ((C86727g) this.f230402a.mo27525b()).mo80313b(new C84808z(tvVar));
    }

    /* renamed from: C */
    public final void mo78475C(PersonDisambiguation personDisambiguation, Query query) {
        ((C86727g) this.f230402a.mo27525b()).mo80313b(new C84775aa(personDisambiguation, query));
    }

    /* renamed from: D */
    public final void mo78476D(ActionData actionData) {
        ((C86727g) this.f230402a.mo27525b()).mo80313b(new C84776ab(actionData));
    }

    /* renamed from: E */
    public final void mo78477E(ActionData actionData, Query query) {
        ((C86727g) this.f230402a.mo27525b()).mo80313b(new C84777ac(actionData, query));
    }

    /* renamed from: F */
    public final void mo78478F(C88209te teVar) {
        ((C86727g) this.f230402a.mo27525b()).mo80313b(new C84778ad(teVar));
    }

    /* renamed from: G */
    public final void mo78479G(ServiceEventData serviceEventData) {
        ((C86727g) this.f230402a.mo27525b()).mo80313b(new C84779ae(serviceEventData));
    }

    /* renamed from: H */
    public final void mo78480H(C87541c cVar, ClientConfig clientConfig, Query query, ActionData actionData, VoiceAction voiceAction, CardDecision cardDecision, C55421x xVar, boolean z) {
        ((C86727g) this.f230402a.mo27525b()).mo80313b(new C84782ah(cVar, clientConfig, query, actionData, voiceAction, cardDecision, xVar, z));
    }

    /* renamed from: I */
    public final void mo78481I(C87541c cVar, C58179b bVar) {
        ((C86727g) this.f230402a.mo27525b()).mo80313b(new C84781ag(cVar, bVar));
    }

    /* renamed from: J */
    public final void mo78482J(aad aad, UpdateVoiceActionUiEventParcelable updateVoiceActionUiEventParcelable) {
        ((C86727g) this.f230402a.mo27525b()).mo80313b(new C84783ai(aad, updateVoiceActionUiEventParcelable));
    }

    /* renamed from: K */
    public final C60870cx mo78483K(VoiceAction voiceAction, ActionData actionData, Query query, C87413a aVar, ClientConfig clientConfig, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        C84786d dVar = new C84786d(voiceAction, actionData, query, aVar, clientConfig, z, z2, z3, z4, z5, z6);
        ((C86727g) this.f230402a.mo27525b()).mo80313b(dVar);
        return dVar;
    }

    /* renamed from: a */
    public final C60870cx mo78484a(C89356b bVar, Query query, ActionData actionData, C58833ax axVar, PlaybackStatus playbackStatus, C86355a aVar, C86372a aVar2) {
        C84785c cVar = new C84785c(bVar, query, actionData, axVar, playbackStatus, aVar, aVar2);
        ((C86727g) this.f230402a.mo27525b()).mo80313b(cVar);
        return cVar;
    }

    /* renamed from: c */
    public final C60870cx mo78485c(VoiceAction voiceAction, Query query) {
        C84787e eVar = new C84787e(voiceAction, query);
        ((C86727g) this.f230402a.mo27525b()).mo80313b(eVar);
        return eVar;
    }

    /* renamed from: e */
    public final C60870cx mo78486e(PromptSegment promptSegment, String str, boolean z) {
        C84788f fVar = new C84788f(promptSegment, str, z);
        ((C86727g) this.f230402a.mo27525b()).mo80313b(fVar);
        return fVar;
    }

    /* renamed from: f */
    public final C60870cx mo78487f(CardDecision cardDecision, int i, int i2, boolean z) {
        C84789g gVar = new C84789g(cardDecision, i, i2, z);
        ((C86727g) this.f230402a.mo27525b()).mo80313b(gVar);
        return gVar;
    }

    /* renamed from: g */
    public final C60870cx mo78488g(VoiceAction voiceAction, Query query, C58833ax axVar) {
        C84790h hVar = new C84790h(voiceAction, query, axVar);
        ((C86727g) this.f230402a.mo27525b()).mo80313b(hVar);
        return hVar;
    }

    /* renamed from: h */
    public final C60870cx mo78489h(ModularAction modularAction, List list) {
        C84791i iVar = new C84791i(modularAction, list);
        ((C86727g) this.f230402a.mo27525b()).mo80313b(iVar);
        return iVar;
    }

    /* renamed from: i */
    public final C60870cx mo78490i(ActionData actionData, C87756ck ckVar, C87456t tVar, Query query) {
        C84793k kVar = new C84793k(actionData, ckVar, tVar, query);
        ((C86727g) this.f230402a.mo27525b()).mo80313b(kVar);
        return kVar;
    }

    /* renamed from: j */
    public final C60870cx mo78491j(VoiceAction voiceAction) {
        C84801s sVar = new C84801s(voiceAction);
        ((C86727g) this.f230402a.mo27525b()).mo80313b(sVar);
        return sVar;
    }

    /* renamed from: k */
    public final C60870cx mo78492k(Query query, ActionData actionData, PlaybackStatus playbackStatus, C86355a aVar, C86372a aVar2) {
        C84803u uVar = new C84803u(query, actionData, playbackStatus, aVar, aVar2);
        ((C86727g) this.f230402a.mo27525b()).mo80313b(uVar);
        return uVar;
    }

    /* renamed from: l */
    public final C60870cx mo78493l(Query query, ActionData actionData, PlaybackStatus playbackStatus, C86355a aVar, C86372a aVar2) {
        C84804v vVar = new C84804v(query, actionData, playbackStatus, aVar, aVar2);
        ((C86727g) this.f230402a.mo27525b()).mo80313b(vVar);
        return vVar;
    }

    /* renamed from: m */
    public final C60870cx mo78494m(Argument argument) {
        C84805w wVar = new C84805w(argument);
        ((C86727g) this.f230402a.mo27525b()).mo80313b(wVar);
        return wVar;
    }

    /* renamed from: n */
    public final C60870cx mo78495n(C88206tb tbVar) {
        C84806x xVar = new C84806x(tbVar);
        ((C86727g) this.f230402a.mo27525b()).mo80313b(xVar);
        return xVar;
    }

    /* renamed from: p */
    public final C60870cx mo78496p(ActionData actionData, int i, int i2, boolean z, boolean z2, C87541c cVar) {
        C84780af afVar = new C84780af(actionData, i, i2, z, z2, cVar);
        ((C86727g) this.f230402a.mo27525b()).mo80313b(afVar);
        return afVar;
    }

    /* renamed from: q */
    public final void mo78497q(C87541c cVar) {
        ((C86727g) this.f230402a.mo27525b()).mo80313b(new C84784b(cVar));
    }

    /* renamed from: r */
    public final void mo78498r(C87423k kVar) {
        ((C86727g) this.f230402a.mo27525b()).mo80313b(new C84792j(kVar));
    }

    /* renamed from: s */
    public final void mo78499s(VoiceAction voiceAction) {
        ((C86727g) this.f230402a.mo27525b()).mo80313b(new C84794l(voiceAction));
    }

    /* renamed from: t */
    public final void mo78500t(VoiceAction voiceAction, ActionData actionData, CardDecision cardDecision, C87424l lVar, Query query) {
        ((C86727g) this.f230402a.mo27525b()).mo80313b(new C84795m(voiceAction, actionData, cardDecision, lVar, query));
    }

    /* renamed from: u */
    public final void mo78501u(ActionData actionData, C87424l lVar, Query query) {
        ((C86727g) this.f230402a.mo27525b()).mo80313b(new C84796n(actionData, lVar, query));
    }

    /* renamed from: v */
    public final void mo78502v(int i, C58181d dVar, long j) {
        ((C86727g) this.f230402a.mo27525b()).mo80313b(new C84797o(i, dVar, j));
    }

    /* renamed from: w */
    public final void mo78503w(Query query, ActionData actionData, VoiceAction voiceAction, CardDecision cardDecision, C87541c cVar, C84773a aVar) {
        ((C86727g) this.f230402a.mo27525b()).mo80313b(new C84798p(query, actionData, voiceAction, cardDecision, cVar, aVar));
    }

    /* renamed from: x */
    public final void mo78504x(ModularAction modularAction, C84773a aVar) {
        ((C86727g) this.f230402a.mo27525b()).mo80313b(new C84799q(modularAction, aVar));
    }

    /* renamed from: y */
    public final void mo78505y(C87421i iVar) {
        ((C86727g) this.f230402a.mo27525b()).mo80313b(new C84800r(iVar));
    }

    /* renamed from: z */
    public final void mo78506z(VoiceAction voiceAction) {
        ((C86727g) this.f230402a.mo27525b()).mo80313b(new C84802t(voiceAction));
    }
}
