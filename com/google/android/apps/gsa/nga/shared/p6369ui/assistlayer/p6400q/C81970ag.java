package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import com.google.common.p4522b.C58724pq;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.q.ag */
/* compiled from: PG */
public final class C81970ag {
    /* renamed from: a */
    public static int m130211a(int i, int i2) {
        return Color.argb(i2, Color.red(i), Color.green(i), Color.blue(i));
    }

    /* renamed from: b */
    public static Drawable m130212b(List list) {
        int i = ((C58724pq) list).f156474d;
        if (i > 0) {
            int[] iArr = new int[i];
            float[] fArr = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                iArr[i2] = ((C81969af) list.get(i2)).mo75420b();
                fArr[i2] = ((C81969af) list.get(i2)).mo75419a();
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable();
            shapeDrawable.setShape(new RectShape());
            shapeDrawable.setShaderFactory(new C81968ae(iArr, fArr));
            return shapeDrawable;
        }
        throw new IllegalArgumentException("The size of colorsAndPositions should be >0.");
    }

    /* renamed from: c */
    public static Drawable m130213c(String str, String str2) {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(new RectShape());
        shapeDrawable.setShaderFactory(new C81967ad(str, str2));
        return shapeDrawable;
    }
}
