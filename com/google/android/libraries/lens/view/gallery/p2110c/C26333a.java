package com.google.android.libraries.lens.view.gallery.p2110c;

import android.graphics.Point;
import android.util.Size;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.gallery.data.C26403v;
import com.google.android.libraries.lens.view.gallery.data.C26406y;
import com.google.android.libraries.lens.view.gallery.p2108a.C26296a;
import com.google.android.libraries.lens.view.p2052ac.C24974a;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import java.util.Collections;

/* renamed from: com.google.android.libraries.lens.view.gallery.c.a */
/* compiled from: PG */
public final /* synthetic */ class C26333a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C26334b f71582a;

    public /* synthetic */ C26333a(C26334b bVar) {
        this.f71582a = bVar;
    }

    public final Object apply(Object obj) {
        Size size;
        int i;
        C26334b bVar = this.f71582a;
        C26406y yVar = (C26406y) obj;
        C26335c cVar = bVar.f71585c;
        WindowManager windowManager = (WindowManager) cVar.f71591b.getSystemService("window");
        windowManager.getClass();
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        C24974a aVar = cVar.f71590a;
        if (C24974a.m46226b(aVar.f68124c, aVar.f68123b, aVar.f68122a) || point.x <= point.y) {
            size = new Size(point.x, point.y);
        } else {
            size = new Size(point.y, point.x);
        }
        int a = C26296a.m48541a(bVar.f71583a.getResources(), size.getWidth());
        bVar.f71584b.mo19974a(C37194a.f98504bN);
        C58485gu f = yVar.mo31606f(C26403v.f71834a);
        C58485gu c = yVar.mo31580c();
        int height = (int) ((1.0f - (true != bVar.f71588f ? 0.25f : 0.38f)) * ((float) size.getHeight()));
        int width = size.getWidth();
        C58480gp e = C58485gu.m89837e();
        int i2 = width / a;
        int i3 = width % a;
        int dimensionPixelSize = bVar.f71583a.getResources().getDimensionPixelSize(R.dimen.lens_gallery_inner_padding);
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 <= a; i6++) {
            i5 += i3;
            if (i5 <= 0 || a - i5 >= i3) {
                i = i2;
            } else {
                i = i2 + 1;
                i5 -= a;
            }
            e.mo55395g(Integer.valueOf(i - (dimensionPixelSize + dimensionPixelSize)));
        }
        C58485gu f2 = e.mo55394f();
        int intValue = ((Integer) Collections.max(f2)).intValue();
        int i7 = (int) (((float) intValue) * 1.5f);
        int i8 = 0;
        while (true) {
            if (i8 < (true != bVar.f71588f ? 2 : 1) && bVar.mo31530a(f, i8, f2, i7)) {
                height -= i7;
                if (height <= 0) {
                    return null;
                }
                i8++;
            }
        }
        while (i4 < 10 && bVar.mo31530a(c, i4, f2, intValue) && (height = height - intValue) > 0) {
            i4++;
        }
        return null;
    }
}
