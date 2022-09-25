package com.google.android.apps.gsa.search.core.p6519al.p6574b.p6575a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84809b;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.search.shared.service.UpdateVoiceActionUiEventParcelable;
import com.google.android.apps.gsa.search.shared.service.p6935b.aad;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.b.a.ai */
/* compiled from: PG */
public final class C84783ai extends C86731k {

    /* renamed from: c */
    private final aad f230426c;

    /* renamed from: d */
    private final UpdateVoiceActionUiEventParcelable f230427d;

    public C84783ai(aad aad, UpdateVoiceActionUiEventParcelable updateVoiceActionUiEventParcelable) {
        super("actions", "actions::updateLegacyVoiceActionUi", C86732l.FIRE_AND_FORGET, C86724d.SEARCH_VOICE);
        this.f230426c = aad;
        this.f230427d = updateVoiceActionUiEventParcelable;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C84809b) obj).mo78482J(this.f230426c, this.f230427d);
        return C118826c.f331423b;
    }
}
