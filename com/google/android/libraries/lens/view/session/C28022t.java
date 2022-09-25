package com.google.android.libraries.lens.view.session;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import com.google.android.libraries.lens.view.p2070an.p2072b.C25408f;
import com.google.android.libraries.lens.view.p2148l.C27228h;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.lens.view.session.t */
/* compiled from: PG */
public final /* synthetic */ class C28022t implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C28027y f76264a;

    /* renamed from: b */
    public final /* synthetic */ C27228h f76265b;

    /* renamed from: c */
    public final /* synthetic */ Matrix f76266c;

    public /* synthetic */ C28022t(C28027y yVar, C27228h hVar, Matrix matrix) {
        this.f76264a = yVar;
        this.f76265b = hVar;
        this.f76266c = matrix;
    }

    public final Object call() {
        C28027y yVar = this.f76264a;
        C27228h hVar = this.f76265b;
        Matrix matrix = this.f76266c;
        C25408f fVar = yVar.f76279b;
        ContentResolver contentResolver = yVar.f76280c;
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i = 1;
        options.inJustDecodeBounds = true;
        InputStream k = hVar.mo32728k(contentResolver);
        BitmapFactory.decodeStream(k, (Rect) null, options);
        k.close();
        Size a = fVar.mo30465a(new Size(options.outWidth, options.outHeight));
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        if (i3 > a.getHeight() || i2 > a.getWidth()) {
            int i4 = i3 / 2;
            int i5 = i2 / 2;
            while (i4 / i >= a.getHeight() && i5 / i >= a.getWidth()) {
                i += i;
            }
        }
        options.inSampleSize = i;
        options.inJustDecodeBounds = false;
        InputStream k2 = hVar.mo32728k(contentResolver);
        Bitmap decodeStream = BitmapFactory.decodeStream(k2, (Rect) null, options);
        decodeStream.getClass();
        k2.close();
        Bitmap createBitmap = Bitmap.createBitmap(decodeStream, 0, 0, decodeStream.getWidth(), decodeStream.getHeight(), matrix, false);
        if (createBitmap != decodeStream) {
            decodeStream.recycle();
        }
        return createBitmap;
    }
}
