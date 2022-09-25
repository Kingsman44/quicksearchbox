package com.google.android.apps.search.googleapp.pixelsuggest;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.google.android.apps.search.googleapp.pixelsuggest.a */
/* compiled from: PG */
public final class C136891a {
    /* renamed from: a */
    public static final int m222563a(View view, ViewGroup viewGroup) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        viewGroup.offsetDescendantRectToMyCoords(view, rect);
        return rect.top;
    }
}
