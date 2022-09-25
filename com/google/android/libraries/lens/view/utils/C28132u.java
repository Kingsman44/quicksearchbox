package com.google.android.libraries.lens.view.utils;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.core.content.C1878d;
import androidx.core.graphics.C1924a;
import androidx.p176n.p177a.C3795f;
import androidx.p176n.p177a.C3798i;
import androidx.p176n.p177a.C3799j;
import com.bumptech.glide.C5543d;
import com.google.android.googlequicksearchbox.R;
import com.p307c.C6009b;
import java.nio.IntBuffer;

/* renamed from: com.google.android.libraries.lens.view.utils.u */
/* compiled from: PG */
public final class C28132u {
    /* renamed from: a */
    public static Bitmap m52414a(Context context, Bitmap bitmap, boolean z) {
        if (bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            return null;
        }
        float width = ((float) bitmap.getWidth()) / ((float) bitmap.getHeight());
        int i = 64;
        int i2 = width < 1.0f ? (int) (width * 64.0f) : 64;
        if (width > 1.0f) {
            i = (int) (width * 64.0f);
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i2, i, true);
        Bitmap a = C5543d.m14321a(context).f16788a.mo12113a(i2, i, Bitmap.Config.ARGB_8888);
        C6009b.m15460a(createScaledBitmap, a, 2);
        C6009b.m15460a(a, a, 4);
        C3798i a2 = new C3795f(a).mo8023a();
        int a3 = C1878d.m5128a(context, R.color.lens_color_surface);
        int a4 = a2.mo8030a(C3799j.f12255c, a3);
        if (z) {
            if (C28110al.m52391c(context)) {
                a4 = a2.mo8030a(C3799j.f12255c, a3);
            } else {
                a4 = a2.mo8030a(C3799j.f12253a, a3);
            }
        }
        int e = C1924a.m5186e(a4, a3, 0.85f);
        IntBuffer allocate = IntBuffer.allocate(a.getWidth() * a.getHeight());
        a.getPixels(allocate.array(), 0, a.getWidth(), 0, 0, a.getWidth(), a.getHeight());
        int[] array = allocate.array();
        for (int i3 = 0; i3 < allocate.array().length; i3++) {
            array[i3] = C1924a.m5186e(array[i3], e, 0.85f);
        }
        a.setPixels(allocate.array(), 0, a.getWidth(), 0, 0, a.getWidth(), a.getHeight());
        return a;
    }
}
