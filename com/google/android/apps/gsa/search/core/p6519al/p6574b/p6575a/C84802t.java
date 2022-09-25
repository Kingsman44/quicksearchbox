package com.google.android.apps.gsa.search.core.p6519al.p6574b.p6575a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84809b;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.b.a.t */
/* compiled from: PG */
public final class C84802t extends C86731k {

    /* renamed from: c */
    private final VoiceAction f230488c;

    public C84802t(VoiceAction voiceAction) {
        super("actions", "actions::onCancelImplicitConfirmation", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230488c = voiceAction;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C84809b) obj).mo78506z(this.f230488c);
        return C118826c.f331423b;
    }
}
