package com.google.android.apps.gsa.staticplugins.opa.p8282ap;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.apps.gsa.staticplugins.opa.C109036ff;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ap.r */
/* compiled from: PG */
public final /* synthetic */ class C107151r implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C107156w f298259a;

    /* renamed from: b */
    public final /* synthetic */ int f298260b;

    /* renamed from: c */
    public final /* synthetic */ List f298261c;

    /* renamed from: d */
    public final /* synthetic */ C109036ff f298262d;

    public /* synthetic */ C107151r(C107156w wVar, int i, List list, C109036ff ffVar) {
        this.f298259a = wVar;
        this.f298260b = i;
        this.f298261c = list;
        this.f298262d = ffVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C107156w wVar = this.f298259a;
        int i = this.f298260b;
        List list = this.f298261c;
        C109036ff ffVar = this.f298262d;
        int size = list.size();
        String str = (String) list.get(i);
        C60870cx i2 = wVar.f298274f.mo28209i(wVar.f298272b.mo85424l(Uri.parse(str), C58833ax.m90834k(Bitmap.CompressFormat.PNG)), "downloadPhoto", new C107153t(wVar, i, ffVar, size));
        return wVar.f298274f.mo28205e(i2, "handleDownloadPhotoFailure", Throwable.class, new C107154u(wVar, str));
    }
}
