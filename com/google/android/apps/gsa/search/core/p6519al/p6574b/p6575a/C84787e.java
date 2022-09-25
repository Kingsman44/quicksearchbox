package com.google.android.apps.gsa.search.core.p6519al.p6574b.p6575a;

import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84809b;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.b.a.e */
/* compiled from: PG */
public final class C84787e extends C86731k {

    /* renamed from: c */
    private final VoiceAction f230447c;

    /* renamed from: d */
    private final Query f230448d;

    public C84787e(VoiceAction voiceAction, Query query) {
        super("actions", "actions::createMatchingProviderInfoForAction", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f230447c = voiceAction;
        this.f230448d = query;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C84809b) obj).mo78485c(this.f230447c, this.f230448d);
    }
}
