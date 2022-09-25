package com.google.android.libraries.onegoogle.p2385d;

import android.content.Context;
import android.content.res.TypedArray;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.onegoogle.d.a */
/* compiled from: PG */
public final class C30940a {
    /* renamed from: a */
    public static int m57735a(Context context) {
        int i;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.colorAccent});
        try {
            if (obtainStyledAttributes.hasValue(0)) {
                i = obtainStyledAttributes.getColor(0, 0);
            } else {
                i = context.getResources().getColor(R.color.google_blue600);
            }
            return i;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
