package com.google.android.libraries.componentview.services;

import android.content.Context;
import android.util.DisplayMetrics;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.componentview.services.a */
/* compiled from: PG */
public final class C20526a implements C68220f {

    /* renamed from: a */
    private final C69464a f57669a;

    public C20526a(C69464a aVar) {
        this.f57669a = aVar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        DisplayMetrics displayMetrics = ((Context) this.f57669a.mo17428b()).getResources().getDisplayMetrics();
        C68225k.m98532d(displayMetrics);
        return displayMetrics;
    }
}
