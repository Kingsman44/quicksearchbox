package com.google.apps.tiktok.concurrent.futuresmixin;

import android.support.p031v4.app.Fragment;
import p3186j$.util.Objects;

/* renamed from: com.google.apps.tiktok.concurrent.futuresmixin.l */
/* compiled from: PG */
public final class C46446l {
    /* renamed from: a */
    public static C46439e m82821a(Fragment fragment) {
        Objects.requireNonNull(fragment);
        return new FuturesMixinImpl(new C46445k(fragment), fragment, fragment.getLifecycle());
    }
}
