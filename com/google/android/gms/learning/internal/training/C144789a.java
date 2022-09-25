package com.google.android.gms.learning.internal.training;

import com.google.common.base.C58839bc;
import org.chromium.net.CronetProvider;

/* renamed from: com.google.android.gms.learning.internal.training.a */
/* compiled from: PG */
public final /* synthetic */ class C144789a implements C58839bc {

    /* renamed from: a */
    public static final /* synthetic */ C144789a f391628a = new C144789a();

    private /* synthetic */ C144789a() {
    }

    /* renamed from: a */
    public final boolean mo5941a(Object obj) {
        CronetProvider cronetProvider = (CronetProvider) obj;
        return cronetProvider.isEnabled() && !CronetProvider.PROVIDER_NAME_FALLBACK.equals(cronetProvider.getName());
    }
}
