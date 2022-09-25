package com.google.android.gms.contextmanager.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.contextmanager.C144024a;
import com.google.android.gms.contextmanager.C144053i;

/* renamed from: com.google.android.gms.contextmanager.internal.p */
/* compiled from: PG */
final class C144074p implements C144053i {

    /* renamed from: a */
    final /* synthetic */ DataHolder f390349a;

    /* renamed from: b */
    final /* synthetic */ Status f390350b;

    /* renamed from: c */
    private final C144024a f390351c;

    public C144074p(DataHolder dataHolder, Status status) {
        this.f390349a = dataHolder;
        this.f390350b = status;
        this.f390351c = dataHolder == null ? null : new C144024a(dataHolder);
    }

    /* renamed from: a */
    public final Status mo117629a() {
        return this.f390350b;
    }

    /* renamed from: b */
    public final C144024a mo119577b() {
        return this.f390351c;
    }
}
