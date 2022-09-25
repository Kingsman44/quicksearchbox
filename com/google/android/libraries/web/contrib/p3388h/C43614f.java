package com.google.android.libraries.web.contrib.p3388h;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.PixelCopy;
import android.view.Window;
import androidx.p104d.p105a.C2164c;

/* renamed from: com.google.android.libraries.web.contrib.h.f */
/* compiled from: PG */
public final /* synthetic */ class C43614f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C43626r f113840a;

    /* renamed from: b */
    public final /* synthetic */ C43624p f113841b;

    /* renamed from: c */
    public final /* synthetic */ Rect f113842c;

    /* renamed from: d */
    public final /* synthetic */ Bitmap f113843d;

    /* renamed from: e */
    public final /* synthetic */ C2164c f113844e;

    public /* synthetic */ C43614f(C43626r rVar, C43624p pVar, Rect rect, Bitmap bitmap, C2164c cVar) {
        this.f113840a = rVar;
        this.f113841b = pVar;
        this.f113842c = rect;
        this.f113843d = bitmap;
        this.f113844e = cVar;
    }

    public final void run() {
        C43626r rVar = this.f113840a;
        C43624p pVar = this.f113841b;
        Rect rect = this.f113842c;
        Bitmap bitmap = this.f113843d;
        C2164c cVar = this.f113844e;
        Window window = pVar.f113865b;
        window.getClass();
        PixelCopy.request(window, rect, bitmap, new C43613e(cVar, bitmap, pVar), rVar.f113871b);
    }
}
