package com.google.android.gms.cast.framework.media.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.RemoteException;
import com.google.android.gms.cast.framework.internal.C143439c;
import com.google.android.gms.cast.internal.C143566ae;

/* renamed from: com.google.android.gms.cast.framework.media.internal.d */
/* compiled from: PG */
public final class C143511d extends AsyncTask {

    /* renamed from: a */
    private static final C143566ae f389147a = new C143566ae("FetchBitmapTask");

    /* renamed from: b */
    private final C143513f f389148b;

    /* renamed from: c */
    private final C143509b f389149c;

    public C143511d(Context context, int i, int i2, C143509b bVar) {
        this.f389149c = bVar;
        this.f389148b = C143439c.m232821e(context.getApplicationContext(), this, new C143510c(this), i, i2);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Uri uri;
        C143513f fVar;
        Uri[] uriArr = (Uri[]) objArr;
        if (uriArr.length != 1 || (uri = uriArr[0]) == null || (fVar = this.f389148b) == null) {
            return null;
        }
        try {
            return fVar.mo118814e(uri);
        } catch (RemoteException e) {
            f389147a.mo118885c(e, "Unable to call %s on %s.", "doFetch", C143513f.class.getSimpleName());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C143509b bVar = this.f389149c;
        if (bVar != null) {
            bVar.f389140b = bitmap;
            bVar.f389141c = true;
            C143508a aVar = bVar.f389142d;
            if (aVar != null) {
                aVar.mo118807a(bVar.f389140b);
            }
            bVar.f389139a = null;
        }
    }
}
