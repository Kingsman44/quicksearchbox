package com.google.android.apps.gsa.search.core.p6519al.p6574b.p6575a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84773a;
import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84809b;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.search.shared.p6926d.C87541c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.b.a.p */
/* compiled from: PG */
public final class C84798p extends C86731k {

    /* renamed from: c */
    private final Query f230478c;

    /* renamed from: d */
    private final ActionData f230479d;

    /* renamed from: e */
    private final VoiceAction f230480e;

    /* renamed from: f */
    private final CardDecision f230481f;

    /* renamed from: g */
    private final C87541c f230482g;

    /* renamed from: h */
    private final C84773a f230483h;

    public C84798p(Query query, ActionData actionData, VoiceAction voiceAction, CardDecision cardDecision, C87541c cVar, C84773a aVar) {
        super("actions", "actions::logNonVisualAndOpaModularAction", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230478c = query;
        this.f230479d = actionData;
        this.f230480e = voiceAction;
        this.f230481f = cardDecision;
        this.f230482g = cVar;
        this.f230483h = aVar;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C84809b) obj).mo78503w(this.f230478c, this.f230479d, this.f230480e, this.f230481f, this.f230482g, this.f230483h);
        return C118826c.f331423b;
    }
}
