package com.google.android.apps.search.googleapp.discover.p10166a.p10171c;

import android.graphics.Rect;
import android.view.View;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.search.googleapp.discover.a.c.k */
/* compiled from: PG */
public final class C133988k {
    /* renamed from: a */
    public static final Rect m217337a(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight());
    }

    /* renamed from: b */
    public static final void m217338b(View view, int i) {
        view.setTag(R.id.googleapp_tag_view_actions_content_key, Integer.valueOf(i));
    }
}
