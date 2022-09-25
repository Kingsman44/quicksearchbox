package com.google.android.apps.gsa.nga.shared.p6321am.p6323b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Handler;
import android.view.View;
import com.google.android.apps.gsa.shared.util.C90736at;

/* renamed from: com.google.android.apps.gsa.nga.shared.am.b.d */
/* compiled from: PG */
final class C80934d {
    /* renamed from: a */
    static final void m128787a(View view, C90736at atVar, Handler handler) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        handler.post(new C80933c(atVar, createBitmap));
    }
}
