package com.google.android.libraries.onegoogle.account.disc;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: com.google.android.libraries.onegoogle.account.disc.t */
/* compiled from: PG */
public final /* synthetic */ class C30220t implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C30224x f81691a;

    /* renamed from: b */
    public final /* synthetic */ Bitmap f81692b;

    /* renamed from: c */
    public final /* synthetic */ String f81693c;

    public /* synthetic */ C30220t(C30224x xVar, Bitmap bitmap, String str) {
        this.f81691a = xVar;
        this.f81692b = bitmap;
        this.f81693c = str;
    }

    public final void run() {
        C30224x xVar = this.f81691a;
        Bitmap bitmap = this.f81692b;
        String str = this.f81693c;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(xVar.mo35693a(bitmap));
        C30225y.f81708a.put(str, bitmapDrawable);
        C30225y.f81709b.remove(str);
        xVar.mo35696d(bitmapDrawable, true);
    }
}
