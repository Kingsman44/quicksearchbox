package com.google.android.libraries.onegoogle.account.disc;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.google.android.libraries.onegoogle.p2378b.C30829f;

/* renamed from: com.google.android.libraries.onegoogle.account.disc.r */
/* compiled from: PG */
public final /* synthetic */ class C30218r implements C30829f {

    /* renamed from: a */
    public final /* synthetic */ C30224x f81684a;

    /* renamed from: b */
    public final /* synthetic */ String f81685b;

    public /* synthetic */ C30218r(C30224x xVar, String str) {
        this.f81684a = xVar;
        this.f81685b = str;
    }

    /* renamed from: a */
    public final void mo35687a(Bitmap bitmap) {
        C30224x xVar = this.f81684a;
        String str = this.f81685b;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(xVar.mo35693a(bitmap));
        C30225y.f81709b.put(str, bitmapDrawable);
        xVar.mo35696d(bitmapDrawable, true);
    }
}
