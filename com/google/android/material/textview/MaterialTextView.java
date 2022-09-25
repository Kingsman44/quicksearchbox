package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.p033v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3512i.C44693c;
import com.google.android.material.p3512i.C44694d;
import com.google.android.material.theme.p3518a.C44965a;

/* compiled from: PG */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private static int m79927a(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < 2 && i < 0; i2++) {
            i = C44694d.m79229a(context, typedArray, iArr[i2], -1);
        }
        return i;
    }

    /* renamed from: b */
    private final void m79928b(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, C44964a.f117466a);
        int a = m79927a(getContext(), obtainStyledAttributes, 1, 2);
        obtainStyledAttributes.recycle();
        if (a >= 0) {
            setLineHeight(a);
        }
    }

    /* renamed from: c */
    private final void m79929c(AttributeSet attributeSet, int i, int i2) {
        Context context = getContext();
        if (m79930d(context)) {
            Resources.Theme theme = context.getTheme();
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C44964a.f117467b, i, i2);
            int a = m79927a(context, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (a == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, C44964a.f117467b, i, i2);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    m79928b(theme, resourceId);
                }
            }
        }
    }

    /* renamed from: d */
    private static boolean m79930d(Context context) {
        return C44693c.m79228d(context, R.attr.textAppearanceLineHeightEnabled, true);
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (m79930d(context)) {
            m79928b(context.getTheme(), i);
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i) {
        super(C44965a.m79936a(context, attributeSet, i, 0), attributeSet, i);
        m79929c(attributeSet, i, 0);
    }

    @Deprecated
    public MaterialTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(C44965a.m79936a(context, attributeSet, i, i2), attributeSet, i);
        m79929c(attributeSet, i, i2);
    }
}
