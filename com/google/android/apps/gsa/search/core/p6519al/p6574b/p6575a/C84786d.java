package com.google.android.apps.gsa.search.core.p6519al.p6574b.p6575a;

import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84809b;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.errors.C87413a;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.b.a.d */
/* compiled from: PG */
public final class C84786d extends C86731k {

    /* renamed from: c */
    private final VoiceAction f230436c;

    /* renamed from: d */
    private final ActionData f230437d;

    /* renamed from: e */
    private final Query f230438e;

    /* renamed from: f */
    private final ClientConfig f230439f;

    /* renamed from: g */
    private final boolean f230440g;

    /* renamed from: h */
    private final boolean f230441h;

    /* renamed from: i */
    private final boolean f230442i;

    /* renamed from: l */
    private final boolean f230443l;

    /* renamed from: m */
    private final boolean f230444m;

    /* renamed from: n */
    private final boolean f230445n;

    /* renamed from: o */
    private final C87413a f230446o;

    public C84786d(VoiceAction voiceAction, ActionData actionData, Query query, C87413a aVar, ClientConfig clientConfig, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        super("actions", "actions::createCardDecision", C86732l.CONTROLLED_BY_USER, C86724d.SEARCH_VOICE);
        this.f230436c = voiceAction;
        this.f230437d = actionData;
        this.f230438e = query;
        this.f230446o = aVar;
        this.f230439f = clientConfig;
        this.f230440g = z;
        this.f230441h = z2;
        this.f230442i = z3;
        this.f230443l = z4;
        this.f230444m = z5;
        this.f230445n = z6;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C84809b) obj).mo78483K(this.f230436c, this.f230437d, this.f230438e, this.f230446o, this.f230439f, this.f230440g, this.f230441h, this.f230442i, this.f230443l, this.f230444m, this.f230445n);
    }
}
