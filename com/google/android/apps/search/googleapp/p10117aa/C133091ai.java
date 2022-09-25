package com.google.android.apps.search.googleapp.p10117aa;

import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import com.google.apps.tiktok.dataservice.C46690ah;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.googleapp.aa.ai */
/* compiled from: PG */
public final /* synthetic */ class C133091ai implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Bitmap f362861a;

    /* renamed from: b */
    public final /* synthetic */ int f362862b;

    public /* synthetic */ C133091ai(Bitmap bitmap, int i) {
        this.f362861a = bitmap;
        this.f362862b = i;
    }

    public final Object call() {
        Bitmap bitmap = this.f362861a;
        int i = this.f362862b;
        C46690ah ahVar = C133103au.f362875a;
        return ThumbnailUtils.extractThumbnail(bitmap, i, i);
    }
}
