package com.google.android.apps.gsa.search.core.p6519al.p6574b.p6575a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84809b;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.b.a.l */
/* compiled from: PG */
public final class C84794l extends C86731k {

    /* renamed from: c */
    private final VoiceAction f230466c;

    public C84794l(VoiceAction voiceAction) {
        super("actions", "actions::handleRemoteAction", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230466c = voiceAction;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C84809b) obj).mo78499s(this.f230466c);
        return C118826c.f331423b;
    }
}
