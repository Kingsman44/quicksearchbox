package com.google.android.apps.gsa.sidekick.shared.p7256ui;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.google.android.apps.gsa.now.shared.p6421ui.C83423l;
import com.google.android.apps.gsa.shared.util.p7187ui.C91113l;
import com.google.android.apps.gsa.shared.util.p7187ui.C91114m;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.ui.m */
/* compiled from: PG */
public final class C91937m extends C91114m implements C83423l {
    public C91937m(boolean z, C91113l lVar) {
        super(z, lVar);
    }

    /* renamed from: a */
    public final void mo76758a(Drawable drawable) {
        Bitmap bitmap;
        if (drawable instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) drawable).getBitmap();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                int i = 0;
                while (true) {
                    if (i >= numberOfLayers) {
                        break;
                    }
                    Drawable drawable2 = layerDrawable.getDrawable(i);
                    if (drawable2 instanceof BitmapDrawable) {
                        bitmap = ((BitmapDrawable) drawable2).getBitmap();
                        break;
                    }
                    i++;
                }
            }
            bitmap = null;
        }
        mo85383b(bitmap);
    }
}
