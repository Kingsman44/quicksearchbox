package com.google.android.apps.gsa.search.core.p6519al.p6574b.p6575a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84809b;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.search.shared.p6926d.C87541c;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4152bb.p4153a.C55421x;

/* renamed from: com.google.android.apps.gsa.search.core.al.b.a.ah */
/* compiled from: PG */
public final class C84782ah extends C86731k {

    /* renamed from: c */
    private final C87541c f230418c;

    /* renamed from: d */
    private final ClientConfig f230419d;

    /* renamed from: e */
    private final Query f230420e;

    /* renamed from: f */
    private final ActionData f230421f;

    /* renamed from: g */
    private final VoiceAction f230422g;

    /* renamed from: h */
    private final CardDecision f230423h;

    /* renamed from: i */
    private final C55421x f230424i;

    /* renamed from: l */
    private final boolean f230425l;

    public C84782ah(C87541c cVar, ClientConfig clientConfig, Query query, ActionData actionData, VoiceAction voiceAction, CardDecision cardDecision, C55421x xVar, boolean z) {
        super("actions", "actions::updateDiscourseContext", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230418c = cVar;
        this.f230419d = clientConfig;
        this.f230420e = query;
        this.f230421f = actionData;
        this.f230422g = voiceAction;
        this.f230423h = cardDecision;
        this.f230424i = xVar;
        this.f230425l = z;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C84809b) obj).mo78480H(this.f230418c, this.f230419d, this.f230420e, this.f230421f, this.f230422g, this.f230423h, this.f230424i, this.f230425l);
        return C118826c.f331423b;
    }
}
