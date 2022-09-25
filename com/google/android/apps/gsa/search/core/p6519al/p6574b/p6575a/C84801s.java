package com.google.android.apps.gsa.search.core.p6519al.p6574b.p6575a;

import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84809b;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.b.a.s */
/* compiled from: PG */
public final class C84801s extends C86731k {

    /* renamed from: c */
    private final VoiceAction f230487c;

    public C84801s(VoiceAction voiceAction) {
        super("actions", "actions::notifyClientTopVoiceActionChange", C86732l.CONTROLLED_BY_USER, C86724d.SEARCH_VOICE);
        this.f230487c = voiceAction;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C84809b) obj).mo78491j(this.f230487c);
    }
}
