package com.google.apps.tiktok.inject.p3657c.p3658a;

import android.content.Context;
import com.google.android.apps.gsa.binaries.satin.app.C73961br;
import com.google.apps.tiktok.inject.p3657c.C47215a;
import com.google.common.base.C58838bb;
import dagger.hilt.C68286a;
import dagger.hilt.android.internal.managers.C68317c;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.apps.tiktok.inject.c.a.d */
/* compiled from: PG */
public final class C47219d implements C68288b {

    /* renamed from: a */
    private final Context f122879a;

    /* renamed from: b */
    private final C47215a f122880b;

    /* renamed from: c */
    private final C68288b f122881c;

    /* renamed from: d */
    private volatile Object f122882d;

    /* renamed from: e */
    private final Object f122883e = new Object();

    /* renamed from: com.google.apps.tiktok.inject.c.a.d$a */
    /* compiled from: PG */
    public interface C47220a {
        /* renamed from: b */
        C73961br mo51133b();
    }

    public C47219d(Context context, C47215a aVar) {
        this.f122879a = context;
        this.f122880b = aVar;
        this.f122881c = new C68317c(context, aVar);
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        if (this.f122882d == null) {
            synchronized (this.f122883e) {
                if (this.f122882d == null) {
                    Context applicationContext = this.f122879a.getApplicationContext();
                    C58838bb.m90887v(applicationContext instanceof C68288b, "TikTokFragmentHost must be created with a @Sting Application: Found: %s", applicationContext);
                    C73961br b = ((C47220a) C68286a.m98629a(this.f122881c, C47220a.class)).mo51133b();
                    b.f205467b = this.f122880b;
                    this.f122882d = b.mo69046a();
                }
            }
        }
        return this.f122882d;
    }
}
