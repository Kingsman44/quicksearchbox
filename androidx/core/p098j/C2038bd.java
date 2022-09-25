package androidx.core.p098j;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

/* renamed from: androidx.core.j.bd */
/* compiled from: PG */
final class C2038bd {
    /* renamed from: a */
    static View.AccessibilityDelegate m5496a(View view) {
        return view.getAccessibilityDelegate();
    }

    /* renamed from: b */
    static List m5497b(View view) {
        return view.getSystemGestureExclusionRects();
    }

    /* renamed from: c */
    static void m5498c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
    }

    /* renamed from: d */
    static void m5499d(View view, List list) {
        view.setSystemGestureExclusionRects(list);
    }
}
