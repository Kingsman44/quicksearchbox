package com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations;

import com.google.common.base.C58817ah;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.z */
/* compiled from: PG */
public final /* synthetic */ class C123989z implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C123989z f342457a = new C123989z();

    private /* synthetic */ C123989z() {
    }

    public final Object apply(Object obj) {
        return Collection.EL.stream((Set) obj).map(C123985v.f342452a).min(Comparator.CC.naturalOrder());
    }
}
