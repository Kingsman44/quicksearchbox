package com.google.android.apps.gsa.search.core.p6519al.p6574b;

import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6822a.C86355a;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6826e.C86372a;
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
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.al.b.b */
/* compiled from: PG */
public interface C84809b {
    /* renamed from: A */
    void mo78473A();

    /* renamed from: B */
    void mo78474B(C88226tv tvVar);

    /* renamed from: C */
    void mo78475C(PersonDisambiguation personDisambiguation, Query query);

    /* renamed from: D */
    void mo78476D(ActionData actionData);

    /* renamed from: E */
    void mo78477E(ActionData actionData, Query query);

    /* renamed from: F */
    void mo78478F(C88209te teVar);

    /* renamed from: G */
    void mo78479G(ServiceEventData serviceEventData);

    /* renamed from: H */
    void mo78480H(C87541c cVar, ClientConfig clientConfig, Query query, ActionData actionData, VoiceAction voiceAction, CardDecision cardDecision, C55421x xVar, boolean z);

    /* renamed from: I */
    void mo78481I(C87541c cVar, C58179b bVar);

    /* renamed from: J */
    void mo78482J(aad aad, UpdateVoiceActionUiEventParcelable updateVoiceActionUiEventParcelable);

    /* renamed from: K */
    C60870cx mo78483K(VoiceAction voiceAction, ActionData actionData, Query query, C87413a aVar, ClientConfig clientConfig, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6);

    /* renamed from: a */
    C60870cx mo78484a(C89356b bVar, Query query, ActionData actionData, C58833ax axVar, PlaybackStatus playbackStatus, C86355a aVar, C86372a aVar2);

    /* renamed from: c */
    C60870cx mo78485c(VoiceAction voiceAction, Query query);

    /* renamed from: e */
    C60870cx mo78486e(PromptSegment promptSegment, String str, boolean z);

    /* renamed from: f */
    C60870cx mo78487f(CardDecision cardDecision, int i, int i2, boolean z);

    /* renamed from: g */
    C60870cx mo78488g(VoiceAction voiceAction, Query query, C58833ax axVar);

    /* renamed from: h */
    C60870cx mo78489h(ModularAction modularAction, List list);

    /* renamed from: i */
    C60870cx mo78490i(ActionData actionData, C87756ck ckVar, C87456t tVar, Query query);

    /* renamed from: j */
    C60870cx mo78491j(VoiceAction voiceAction);

    /* renamed from: k */
    C60870cx mo78492k(Query query, ActionData actionData, PlaybackStatus playbackStatus, C86355a aVar, C86372a aVar2);

    /* renamed from: l */
    C60870cx mo78493l(Query query, ActionData actionData, PlaybackStatus playbackStatus, C86355a aVar, C86372a aVar2);

    /* renamed from: m */
    C60870cx mo78494m(Argument argument);

    /* renamed from: n */
    C60870cx mo78495n(C88206tb tbVar);

    /* renamed from: p */
    C60870cx mo78496p(ActionData actionData, int i, int i2, boolean z, boolean z2, C87541c cVar);

    /* renamed from: q */
    void mo78497q(C87541c cVar);

    /* renamed from: r */
    void mo78498r(C87423k kVar);

    /* renamed from: s */
    void mo78499s(VoiceAction voiceAction);

    /* renamed from: t */
    void mo78500t(VoiceAction voiceAction, ActionData actionData, CardDecision cardDecision, C87424l lVar, Query query);

    /* renamed from: u */
    void mo78501u(ActionData actionData, C87424l lVar, Query query);

    /* renamed from: v */
    void mo78502v(int i, C58181d dVar, long j);

    /* renamed from: w */
    void mo78503w(Query query, ActionData actionData, VoiceAction voiceAction, CardDecision cardDecision, C87541c cVar, C84773a aVar);

    /* renamed from: x */
    void mo78504x(ModularAction modularAction, C84773a aVar);

    /* renamed from: y */
    void mo78505y(C87421i iVar);

    /* renamed from: z */
    void mo78506z(VoiceAction voiceAction);
}
