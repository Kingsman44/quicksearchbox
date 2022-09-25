package com.google.android.libraries.onegoogle.account.disc;

import android.graphics.Rect;
import android.graphics.RectF;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.onegoogle.account.disc.au */
/* compiled from: PG */
public final class C30193au {
    /* renamed from: a */
    public static RectF m56125a(int i, Rect rect) {
        C58838bb.m90869d(rect.width() == rect.height(), "Width and height for ring bounds must be equal.");
        float f = ((float) (i + 1)) / 2.0f;
        float width = ((float) rect.width()) - f;
        return new RectF(f, f, width, width);
    }
}
