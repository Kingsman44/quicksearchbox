package com.google.apps.tiktok.tracing.contrib.p3708i.p3713d;

import android.support.p033v7.widget.C0658ft;
import android.support.p033v7.widget.RecyclerView;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47831fm;

/* renamed from: com.google.apps.tiktok.tracing.contrib.i.d.i */
/* compiled from: PG */
public final class C47718i extends C0658ft {

    /* renamed from: a */
    final /* synthetic */ C0658ft f123683a;

    /* renamed from: b */
    final /* synthetic */ String f123684b;

    /* renamed from: c */
    final /* synthetic */ C47722m f123685c;

    public C47718i(C47722m mVar, C0658ft ftVar, String str) {
        this.f123685c = mVar;
        this.f123683a = ftVar;
        this.f123684b = str;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (C47831fm.m85027v()) {
            this.f123683a.onScrollStateChanged(recyclerView, i);
            return;
        }
        C47538ax c = this.f123685c.f123692a.mo51613c(this.f123684b);
        try {
            this.f123683a.onScrollStateChanged(recyclerView, i);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47717h.m84869a(th, th);
        }
        throw th;
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        if (C47831fm.m85027v()) {
            this.f123683a.onScrolled(recyclerView, i, i2);
            return;
        }
        C47538ax c = this.f123685c.f123692a.mo51613c(this.f123684b);
        try {
            this.f123683a.onScrolled(recyclerView, i, i2);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47717h.m84869a(th, th);
        }
        throw th;
    }
}
