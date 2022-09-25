package com.google.android.apps.gsa.search.core.p6519al.p6574b.p6575a;

import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84809b;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.b.a.h */
/* compiled from: PG */
public final class C84790h extends C86731k {

    /* renamed from: c */
    private final VoiceAction f230456c;

    /* renamed from: d */
    private final Query f230457d;

    /* renamed from: e */
    private final C58833ax f230458e;

    public C84790h(VoiceAction voiceAction, Query query, C58833ax axVar) {
        super("actions", "actions::executeActionWithQuery", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f230456c = voiceAction;
        this.f230457d = query;
        this.f230458e = axVar;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C84809b) obj).mo78488g(this.f230456c, this.f230457d, this.f230458e);
    }
}
