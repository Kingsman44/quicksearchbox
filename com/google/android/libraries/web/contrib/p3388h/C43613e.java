package com.google.android.libraries.web.contrib.p3388h;

import android.graphics.Bitmap;
import android.view.PixelCopy;
import android.view.View;
import androidx.p104d.p105a.C2164c;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.web.contrib.h.e */
/* compiled from: PG */
public final /* synthetic */ class C43613e implements PixelCopy.OnPixelCopyFinishedListener {

    /* renamed from: a */
    public final /* synthetic */ C2164c f113837a;

    /* renamed from: b */
    public final /* synthetic */ Bitmap f113838b;

    /* renamed from: c */
    public final /* synthetic */ C43624p f113839c;

    public /* synthetic */ C43613e(C2164c cVar, Bitmap bitmap, C43624p pVar) {
        this.f113837a = cVar;
        this.f113838b = bitmap;
        this.f113839c = pVar;
    }

    public final void onPixelCopyFinished(int i) {
        C2164c cVar = this.f113837a;
        Bitmap bitmap = this.f113838b;
        C43624p pVar = this.f113839c;
        if (i != 0) {
            View view = pVar.f113864a;
            if (view != null) {
                ((C59052c) ((C59052c) C43626r.f113870a.mo56226d()).mo56372aa(54115)).mo56387q("PixelCopy failed, result: %s", i);
                cVar.mo5437b(C43626r.m76983a(view));
                return;
            }
            cVar.mo5439d(new IllegalStateException("PixelCopy failed, result: " + i));
            return;
        }
        cVar.mo5437b(bitmap);
    }
}
