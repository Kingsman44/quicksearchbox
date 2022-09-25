package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.migration.p9868a;

import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.concurrent.C46464p;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60856cj;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.migration.a.a */
/* compiled from: PG */
public final class C130119a implements C46464p {

    /* renamed from: a */
    final /* synthetic */ C130120b f356774a;

    public C130119a(C130120b bVar) {
        this.f356774a = bVar;
    }

    /* renamed from: a */
    public final C46463o mo18057a() {
        Supplier supplier = (Supplier) this.f356774a.f356778d.get();
        if (supplier != null) {
            return new C46463o(new C60817ay(C60856cj.m92900i(supplier.get())));
        }
        throw new IllegalStateException("Supplier was not set");
    }
}
