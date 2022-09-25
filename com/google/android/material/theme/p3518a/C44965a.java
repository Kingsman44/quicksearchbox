package com.google.android.material.theme.p3518a;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.p043a.p044a.C0782b;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.material.theme.a.a */
/* compiled from: PG */
public final class C44965a {

    /* renamed from: a */
    private static final int[] f117468a = {16842752, R.attr.theme};

    /* renamed from: b */
    private static final int[] f117469b = {R.attr.materialThemeOverlay};

    /* renamed from: a */
    public static Context m79936a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f117469b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        boolean z = (context instanceof C0782b) && ((C0782b) context).f2693a == resourceId;
        if (resourceId == 0 || z) {
            return context;
        }
        C0782b bVar = new C0782b(context, resourceId);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f117468a);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            bVar.getTheme().applyStyle(resourceId2, true);
        }
        return bVar;
    }
}
