package com.google.apps.tiktok.tracing;

import android.view.MenuItem;

/* renamed from: com.google.apps.tiktok.tracing.cc */
/* compiled from: PG */
public final /* synthetic */ class C47579cc implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ C47770dh f123472a;

    /* renamed from: b */
    public final /* synthetic */ String f123473b;

    /* renamed from: c */
    public final /* synthetic */ MenuItem.OnMenuItemClickListener f123474c;

    public /* synthetic */ C47579cc(C47770dh dhVar, String str, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f123472a = dhVar;
        this.f123473b = str;
        this.f123474c = onMenuItemClickListener;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        C47770dh dhVar = this.f123472a;
        String str = this.f123473b;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f123474c;
        C47538ax c = dhVar.mo51613c(str);
        try {
            boolean onMenuItemClick = onMenuItemClickListener.onMenuItemClick(menuItem);
            if (c != null) {
                c.close();
            }
            return onMenuItemClick;
        } catch (Throwable th) {
            C47574by.m84679a(th, th);
        }
        throw th;
    }
}
