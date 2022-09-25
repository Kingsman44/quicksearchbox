package com.google.android.apps.gsa.search.core.p6519al.p6767x.p6768a;

import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.x.a.a */
/* compiled from: PG */
public final class C85611a extends C86731k {

    /* renamed from: c */
    private final VoiceAction f231423c;

    /* renamed from: d */
    private final CardDecision f231424d;

    public C85611a(VoiceAction voiceAction, CardDecision cardDecision) {
        super("clockwork", "clockwork::buildActionResponse", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f231423c = voiceAction;
        this.f231424d = cardDecision;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C85612b) obj).mo79094a(this.f231423c, this.f231424d);
    }
}
