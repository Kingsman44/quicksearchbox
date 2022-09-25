package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared;

import android.graphics.Bitmap;
import android.view.View;
import java.io.ByteArrayOutputStream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.a */
/* compiled from: PG */
public final class C115612a {
    /* renamed from: a */
    public static byte[] m191748a(View view) {
        view.setDrawingCacheEnabled(true);
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Bitmap createBitmap = Bitmap.createBitmap(drawingCache);
        view.setDrawingCacheEnabled(false);
        createBitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
