package com.google.android.libraries.elements.p1728g;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.libraries.elements.interfaces.ImageProxy;
import com.google.android.libraries.elements.interfaces.ImageSourceProxy;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.elements.g.v */
/* compiled from: PG */
public final class C21194v {
    /* renamed from: a */
    public static Drawable m39826a(Context context, byte[] bArr) {
        return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
    }

    /* renamed from: b */
    public static C58833ax m39827b(ImageProxy imageProxy) {
        ArrayList sources = imageProxy.sources();
        int size = sources.size();
        int i = 0;
        while (i < size) {
            ImageSourceProxy imageSourceProxy = (ImageSourceProxy) sources.get(i);
            i++;
            if (imageSourceProxy.imageData().length != 0) {
                return C58833ax.m90834k(imageSourceProxy.imageData());
            }
        }
        return C58836b.f156633a;
    }
}
