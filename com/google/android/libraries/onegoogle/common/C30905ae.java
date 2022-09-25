package com.google.android.libraries.onegoogle.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.C1929b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.onegoogle.common.ae */
/* compiled from: PG */
public final class C30905ae {
    /* renamed from: a */
    public static int m57695a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.actionBarItemBackground});
        try {
            return obtainStyledAttributes.getResourceId(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static void m57696b(Drawable drawable, int i) {
        boolean z = true;
        if (!C19559g.m37305d(Thread.currentThread()) && drawable.getCallback() != null) {
            z = false;
        }
        C58838bb.m90884s(z, "Tinting drawables with callback from background thread might trigger UI code on the background thread.");
        C1929b.m5225f(drawable.mutate(), i);
    }
}
