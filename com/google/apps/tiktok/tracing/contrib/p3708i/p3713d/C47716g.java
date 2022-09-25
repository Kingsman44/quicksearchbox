package com.google.apps.tiktok.tracing.contrib.p3708i.p3713d;

import android.support.p033v7.widget.C0745iz;
import android.view.MenuItem;
import com.google.apps.tiktok.tracing.C47538ax;

/* renamed from: com.google.apps.tiktok.tracing.contrib.i.d.g */
/* compiled from: PG */
public final /* synthetic */ class C47716g implements C0745iz {

    /* renamed from: a */
    public final /* synthetic */ C47722m f123680a;

    /* renamed from: b */
    public final /* synthetic */ String f123681b;

    /* renamed from: c */
    public final /* synthetic */ C0745iz f123682c;

    public /* synthetic */ C47716g(C47722m mVar, String str, C0745iz izVar) {
        this.f123680a = mVar;
        this.f123681b = str;
        this.f123682c = izVar;
    }

    /* renamed from: a */
    public final boolean mo1222a(MenuItem menuItem) {
        C47722m mVar = this.f123680a;
        String str = this.f123681b;
        C0745iz izVar = this.f123682c;
        C47538ax c = mVar.f123692a.mo51613c(str);
        try {
            boolean a = izVar.mo1222a(menuItem);
            if (c != null) {
                c.close();
            }
            return a;
        } catch (Throwable th) {
            C47714e.m84866a(th, th);
        }
        throw th;
    }
}
