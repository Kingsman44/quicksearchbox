package com.google.android.apps.gsa.search.core.p6519al.p6574b.p6575a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84809b;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.actions.C87424l;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.b.a.m */
/* compiled from: PG */
public final class C84795m extends C86731k {

    /* renamed from: c */
    private final VoiceAction f230467c;

    /* renamed from: d */
    private final ActionData f230468d;

    /* renamed from: e */
    private final CardDecision f230469e;

    /* renamed from: f */
    private final C87424l f230470f;

    /* renamed from: g */
    private final Query f230471g;

    public C84795m(VoiceAction voiceAction, ActionData actionData, CardDecision cardDecision, C87424l lVar, Query query) {
        super("actions", "actions::logCardDecision", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230467c = voiceAction;
        this.f230468d = actionData;
        this.f230469e = cardDecision;
        this.f230470f = lVar;
        this.f230471g = query;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C84809b) obj).mo78500t(this.f230467c, this.f230468d, this.f230469e, this.f230470f, this.f230471g);
        return C118826c.f331423b;
    }
}
