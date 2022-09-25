package com.google.android.libraries.componentview.services.application;

import android.util.Log;
import android.widget.ImageView;
import com.google.android.libraries.componentview.p1675a.p1677b.C19744c;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.libraries.componentview.services.application.i */
/* compiled from: PG */
final class C20618i implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f57839a;

    /* renamed from: b */
    final /* synthetic */ SettableFuture f57840b;

    /* renamed from: c */
    final /* synthetic */ ImageView f57841c;

    /* renamed from: d */
    final /* synthetic */ C20619j f57842d;

    public C20618i(C20619j jVar, String str, SettableFuture settableFuture, ImageView imageView) {
        this.f57842d = jVar;
        this.f57839a = str;
        this.f57840b = settableFuture;
        this.f57841c = imageView;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        Log.e("BasicImageLoader", "Fetch failed for ".concat(String.valueOf(this.f57839a)), th);
        this.f57840b.mo57357o(new RuntimeException("Fetch failed"));
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C20578be beVar = (C20578be) obj;
        if (beVar == null || !beVar.f57759c) {
            Log.e("BasicImageLoader", "Fetch failed with no response for ".concat(String.valueOf(this.f57839a)));
            this.f57840b.mo57357o(new RuntimeException("Fetch failed with no response"));
            return;
        }
        this.f57842d.mo25564c(beVar.f57758b, this.f57841c);
        this.f57840b.mo57356n(new C19744c());
    }
}
