package com.google.apps.tiktok.tracing;

import android.view.MenuItem;
import android.widget.PopupMenu;

/* renamed from: com.google.apps.tiktok.tracing.cl */
/* compiled from: PG */
public final /* synthetic */ class C47588cl implements PopupMenu.OnMenuItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ C47770dh f123499a;

    /* renamed from: b */
    public final /* synthetic */ String f123500b;

    /* renamed from: c */
    public final /* synthetic */ PopupMenu.OnMenuItemClickListener f123501c;

    public /* synthetic */ C47588cl(C47770dh dhVar, String str, PopupMenu.OnMenuItemClickListener onMenuItemClickListener) {
        this.f123499a = dhVar;
        this.f123500b = str;
        this.f123501c = onMenuItemClickListener;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        C47770dh dhVar = this.f123499a;
        String str = this.f123500b;
        PopupMenu.OnMenuItemClickListener onMenuItemClickListener = this.f123501c;
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
