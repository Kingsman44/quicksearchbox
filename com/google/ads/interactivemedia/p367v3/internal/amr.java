package com.google.ads.interactivemedia.p367v3.internal;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.util.Log;
import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.amr */
/* compiled from: PG */
final class amr extends AsyncTask {

    /* renamed from: a */
    Exception f20988a = null;

    /* renamed from: b */
    final /* synthetic */ amt f20989b;

    public amr(amt amt) {
        this.f20989b = amt;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        try {
            amt amt = this.f20989b;
            return amt.mo14979a(amt.f20992a.src());
        } catch (IOException e) {
            this.f20988a = e;
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null) {
            String src = this.f20989b.f20992a.src();
            String valueOf = String.valueOf(this.f20988a);
            StringBuilder sb = new StringBuilder(String.valueOf(src).length() + 33 + String.valueOf(valueOf).length());
            sb.append("Loading image companion ");
            sb.append(src);
            sb.append(" failed: ");
            sb.append(valueOf);
            Log.e("IMASDK", sb.toString());
            return;
        }
        amt.m19009c(this.f20989b);
        this.f20989b.setImageBitmap(bitmap);
    }
}
