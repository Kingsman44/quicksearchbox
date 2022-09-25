package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images;

import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.C60870cx;
import java.io.File;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images.s */
/* compiled from: PG */
public final /* synthetic */ class C138293s implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ OneSearchImageProvider f376247a;

    /* renamed from: b */
    public final /* synthetic */ String f376248b;

    /* renamed from: c */
    public final /* synthetic */ Optional f376249c;

    public /* synthetic */ C138293s(OneSearchImageProvider oneSearchImageProvider, String str, Optional optional) {
        this.f376247a = oneSearchImageProvider;
        this.f376248b = str;
        this.f376249c = optional;
    }

    public final Object apply(Object obj) {
        OneSearchImageProvider oneSearchImageProvider = this.f376247a;
        String str = this.f376248b;
        Optional optional = this.f376249c;
        File file = (File) obj;
        C46459k.m82829b((C60870cx) Objects.requireNonNull((C60870cx) oneSearchImageProvider.f376212f.remove(str)), "Failed to remove %s from pending downloads", str);
        optional.ifPresent(new C138290p(oneSearchImageProvider));
        return file;
    }
}
