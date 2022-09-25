package com.google.android.libraries.elements.internal;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.facebook.litho.C6159cg;
import com.google.android.libraries.elements.interfaces.DimensionEdgesProxy;
import com.google.android.libraries.elements.interfaces.DimensionProxy;
import com.google.android.libraries.elements.interfaces.DimensionUnit;

/* renamed from: com.google.android.libraries.elements.internal.e */
/* compiled from: PG */
public final class C21344e {
    /* renamed from: a */
    public static int m40353a(float f, DisplayMetrics displayMetrics) {
        return C6159cg.m16231a(TypedValue.applyDimension(1, f, displayMetrics));
    }

    /* renamed from: b */
    public static int m40354b(Resources resources, DimensionProxy dimensionProxy) {
        if (dimensionProxy == null || dimensionProxy.unit() == DimensionUnit.DIMENSION_UNIT_FRACTION || dimensionProxy.value() <= 0.0f) {
            return -1;
        }
        return m40353a(dimensionProxy.value(), resources.getDisplayMetrics());
    }

    /* renamed from: c */
    public static void m40355c(DimensionEdgesProxy dimensionEdgesProxy, C21343d dVar) {
        boolean z = false;
        m40356d(dimensionEdgesProxy.all() != null, 9, dimensionEdgesProxy.all(), dVar);
        m40356d(dimensionEdgesProxy.horizontal() != null, 7, dimensionEdgesProxy.horizontal(), dVar);
        m40356d(dimensionEdgesProxy.vertical() != null, 8, dimensionEdgesProxy.vertical(), dVar);
        m40356d(dimensionEdgesProxy.start() != null, 5, dimensionEdgesProxy.start(), dVar);
        m40356d(dimensionEdgesProxy.end() != null, 6, dimensionEdgesProxy.end(), dVar);
        m40356d(dimensionEdgesProxy.top() != null, 2, dimensionEdgesProxy.top(), dVar);
        m40356d(dimensionEdgesProxy.right() != null, 3, dimensionEdgesProxy.right(), dVar);
        m40356d(dimensionEdgesProxy.bottom() != null, 4, dimensionEdgesProxy.bottom(), dVar);
        if (dimensionEdgesProxy.left() != null) {
            z = true;
        }
        m40356d(z, 1, dimensionEdgesProxy.left(), dVar);
    }

    /* renamed from: d */
    private static void m40356d(boolean z, int i, DimensionProxy dimensionProxy, C21343d dVar) {
        if (z) {
            dVar.mo26055a(i, dimensionProxy);
        }
    }
}
