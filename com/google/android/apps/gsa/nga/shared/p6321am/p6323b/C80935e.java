package com.google.android.apps.gsa.nga.shared.p6321am.p6323b;

import android.graphics.Bitmap;
import android.view.PixelCopy;
import com.google.android.apps.gsa.shared.util.C90736at;

/* renamed from: com.google.android.apps.gsa.nga.shared.am.b.e */
/* compiled from: PG */
public final /* synthetic */ class C80935e implements PixelCopy.OnPixelCopyFinishedListener {

    /* renamed from: a */
    public final /* synthetic */ C90736at f221909a;

    /* renamed from: b */
    public final /* synthetic */ Bitmap f221910b;

    public /* synthetic */ C80935e(C90736at atVar, Bitmap bitmap) {
        this.f221909a = atVar;
        this.f221910b = bitmap;
    }

    public final void onPixelCopyFinished(int i) {
        C90736at atVar = this.f221909a;
        Bitmap bitmap = this.f221910b;
        if (i == 0) {
            atVar.mo17700a(bitmap);
        } else {
            atVar.mo17700a((Object) null);
        }
    }
}
