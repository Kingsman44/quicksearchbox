package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting.dataservice.impl;

import com.google.common.base.C58817ah;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.dataservice.impl.l */
/* compiled from: PG */
public final /* synthetic */ class C129198l implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C129198l f354893a = new C129198l();

    private /* synthetic */ C129198l() {
    }

    public final Object apply(Object obj) {
        boolean z = false;
        Optional optional = (Optional) ((List) obj).get(0);
        if (optional.isPresent() && ("1".equals(optional.get()) || "true".equals(optional.get()))) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
