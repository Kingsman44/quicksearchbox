package com.google.android.apps.search.googleapp.p10117aa;

import android.graphics.Bitmap;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.protobuf.C63087y;
import com.google.protobuf.C63088z;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.googleapp.aa.m */
/* compiled from: PG */
public final /* synthetic */ class C133128m implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Bitmap f362937a;

    public /* synthetic */ C133128m(Bitmap bitmap) {
        this.f362937a = bitmap;
    }

    public final Object call() {
        Bitmap bitmap = this.f362937a;
        C46690ah ahVar = C133103au.f362875a;
        C63087y v = C63088z.m96150v();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, v);
        return v.mo59165b();
    }
}
