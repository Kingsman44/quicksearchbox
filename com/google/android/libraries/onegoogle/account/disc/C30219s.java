package com.google.android.libraries.onegoogle.account.disc;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.google.android.libraries.onegoogle.common.C30914an;
import com.google.android.libraries.onegoogle.p2378b.C30829f;
import com.google.android.libraries.onegoogle.p2378b.C30830g;
import com.google.android.libraries.onegoogle.p2378b.C30832i;
import com.google.android.libraries.onegoogle.p2378b.C30833j;

/* renamed from: com.google.android.libraries.onegoogle.account.disc.s */
/* compiled from: PG */
public final /* synthetic */ class C30219s implements C30829f {

    /* renamed from: a */
    public final /* synthetic */ C30224x f81686a;

    /* renamed from: b */
    public final /* synthetic */ String f81687b;

    /* renamed from: c */
    public final /* synthetic */ Drawable f81688c;

    /* renamed from: d */
    public final /* synthetic */ C30830g f81689d;

    /* renamed from: e */
    public final /* synthetic */ int f81690e;

    public /* synthetic */ C30219s(C30224x xVar, String str, Drawable drawable, C30830g gVar, int i) {
        this.f81686a = xVar;
        this.f81687b = str;
        this.f81688c = drawable;
        this.f81689d = gVar;
        this.f81690e = i;
    }

    /* renamed from: a */
    public final void mo35687a(Bitmap bitmap) {
        C30224x xVar = this.f81686a;
        String str = this.f81687b;
        Drawable drawable = this.f81688c;
        C30830g gVar = this.f81689d;
        int i = this.f81690e;
        if (!xVar.f81706e) {
            if (bitmap != null) {
                xVar.mo35695c(new C30220t(xVar, bitmap, str));
            } else if (drawable != null) {
                xVar.mo35696d(drawable, true);
            } else if (C30832i.m57582b(C30833j.m57584g(xVar.f81703b, xVar.f81705d))) {
                xVar.mo35695c(new C30221u(xVar, gVar, i, str));
            } else {
                C30914an.m57706a(new C30222v(xVar));
            }
        }
    }
}
