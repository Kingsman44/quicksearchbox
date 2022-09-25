package com.google.apps.tiktok.tracing.contrib.p3708i.p3713d;

import android.support.p033v7.widget.C0631et;
import android.view.MenuItem;
import com.google.apps.tiktok.tracing.C47538ax;

/* renamed from: com.google.apps.tiktok.tracing.contrib.i.d.f */
/* compiled from: PG */
public final /* synthetic */ class C47715f implements C0631et {

    /* renamed from: a */
    public final /* synthetic */ C47722m f123677a;

    /* renamed from: b */
    public final /* synthetic */ String f123678b;

    /* renamed from: c */
    public final /* synthetic */ C0631et f123679c;

    public /* synthetic */ C47715f(C47722m mVar, String str, C0631et etVar) {
        this.f123677a = mVar;
        this.f123678b = str;
        this.f123679c = etVar;
    }

    /* renamed from: a */
    public final boolean mo2855a(MenuItem menuItem) {
        C47722m mVar = this.f123677a;
        String str = this.f123678b;
        C0631et etVar = this.f123679c;
        C47538ax c = mVar.f123692a.mo51613c(str);
        try {
            boolean a = etVar.mo2855a(menuItem);
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
