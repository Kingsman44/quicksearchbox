package com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e;

import android.content.Context;
import android.view.View;
import com.google.android.libraries.search.rendering.xuikit.bubbles.view.C40259a;
import com.google.android.material.snackbar.Snackbar;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.e.ax */
/* compiled from: PG */
public final /* synthetic */ class C40178ax implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C40180az f105551a;

    /* renamed from: b */
    public final /* synthetic */ C40259a f105552b;

    /* renamed from: c */
    public final /* synthetic */ String f105553c;

    /* renamed from: d */
    public final /* synthetic */ String f105554d;

    /* renamed from: e */
    public final /* synthetic */ View.OnClickListener f105555e;

    public /* synthetic */ C40178ax(C40180az azVar, C40259a aVar, String str, String str2, View.OnClickListener onClickListener) {
        this.f105551a = azVar;
        this.f105552b = aVar;
        this.f105553c = str;
        this.f105554d = str2;
        this.f105555e = onClickListener;
    }

    public final void run() {
        C40180az azVar = this.f105551a;
        C40259a aVar = this.f105552b;
        String str = this.f105553c;
        String str2 = this.f105554d;
        View.OnClickListener onClickListener = this.f105555e;
        Snackbar q = Snackbar.m79661q((Context) null, aVar, str, 0);
        q.mo48348m(new C40179ay(azVar, aVar));
        q.mo48352s(str2, onClickListener);
        q.mo48343h();
    }
}
