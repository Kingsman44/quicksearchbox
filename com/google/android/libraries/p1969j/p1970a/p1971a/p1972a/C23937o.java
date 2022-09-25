package com.google.android.libraries.p1969j.p1970a.p1971a.p1972a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ImageView;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.URL;

/* renamed from: com.google.android.libraries.j.a.a.a.o */
/* compiled from: PG */
public final class C23937o extends AsyncTask {

    /* renamed from: a */
    private final String f65437a;

    /* renamed from: b */
    private final WeakReference f65438b;

    public C23937o(String str, ImageView imageView) {
        this.f65437a = str;
        this.f65438b = new WeakReference(imageView);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        try {
            return BitmapFactory.decodeStream((InputStream) new URL(this.f65437a).getContent());
        } catch (IOException e) {
            Log.e("DownloadBsnImageAsyncTask", "Error reading bitmap", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        ImageView imageView = (ImageView) this.f65438b.get();
        if (bitmap != null && imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
    }
}
