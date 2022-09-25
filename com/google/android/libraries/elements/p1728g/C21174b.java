package com.google.android.libraries.elements.p1728g;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import com.google.android.libraries.elements.interfaces.ClientResourceProxy;
import com.google.android.libraries.elements.interfaces.ImageProxy;
import com.google.android.libraries.elements.interfaces.ImageSourceProxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.elements.g.b */
/* compiled from: PG */
public final class C21174b {

    /* renamed from: a */
    private static final Map f59395a = new HashMap();

    /* renamed from: a */
    public static int m39767a(Context context, ImageProxy imageProxy) {
        String imageName;
        int i;
        ArrayList sources = imageProxy.sources();
        int size = sources.size();
        int i2 = 0;
        while (i2 < size) {
            ClientResourceProxy clientResource = ((ImageSourceProxy) sources.get(i2)).clientResource();
            if (clientResource == null || (imageName = clientResource.imageName()) == null) {
                i2++;
            } else {
                Map map = f59395a;
                synchronized (map) {
                    String str = "drawable" + imageName;
                    Integer num = (Integer) map.get(str);
                    if (num == null) {
                        i = context.getResources().getIdentifier(imageName, "drawable", context.getPackageName());
                        map.put(str, Integer.valueOf(i));
                    } else {
                        i = num.intValue();
                    }
                }
                return i;
            }
        }
        return 0;
    }

    /* renamed from: b */
    public static boolean m39768b(Context context, ImageProxy imageProxy) {
        try {
            Drawable drawable = context.getResources().getDrawable(m39767a(context, imageProxy), (Resources.Theme) null);
            if (drawable == null || (drawable instanceof BitmapDrawable) || (drawable instanceof NinePatchDrawable)) {
                return false;
            }
            return true;
        } catch (Resources.NotFoundException unused) {
        }
    }
}
