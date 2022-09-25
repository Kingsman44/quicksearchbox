package com.google.apps.tiktok.tracing.contrib.p3708i.p3713d;

import android.support.p033v7.widget.C0701hi;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47831fm;

/* renamed from: com.google.apps.tiktok.tracing.contrib.i.d.k */
/* compiled from: PG */
public final class C47720k implements C0701hi {

    /* renamed from: a */
    final /* synthetic */ C0701hi f123686a;

    /* renamed from: b */
    final /* synthetic */ String f123687b = "Setting Search text changed";

    /* renamed from: c */
    final /* synthetic */ C47722m f123688c;

    public C47720k(C47722m mVar, C0701hi hiVar) {
        this.f123688c = mVar;
        this.f123686a = hiVar;
    }

    /* renamed from: a */
    public final boolean mo3186a(String str) {
        if (C47831fm.m85027v()) {
            return this.f123686a.mo3186a(str);
        }
        C47538ax c = this.f123688c.f123692a.mo51613c(this.f123687b);
        try {
            boolean a = this.f123686a.mo3186a(str);
            if (c != null) {
                c.close();
            }
            return a;
        } catch (Throwable th) {
            C47719j.m84870a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    public final boolean mo3187b(String str) {
        if (C47831fm.m85027v()) {
            return this.f123686a.mo3187b(str);
        }
        C47538ax c = this.f123688c.f123692a.mo51613c(this.f123687b);
        try {
            boolean b = this.f123686a.mo3187b(str);
            if (c != null) {
                c.close();
            }
            return b;
        } catch (Throwable th) {
            C47719j.m84870a(th, th);
        }
        throw th;
    }
}
