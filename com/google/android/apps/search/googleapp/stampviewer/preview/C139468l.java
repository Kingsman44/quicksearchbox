package com.google.android.apps.search.googleapp.stampviewer.preview;

import android.support.p031v4.app.Fragment;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.preview.l */
/* compiled from: PG */
public final class C139468l {
    /* renamed from: a */
    public static final Fragment m226674a(Fragment fragment) {
        while (fragment != null && !C69664n.m101066l(fragment.getTag(), "INLINE_STAMP_VIEWER_FRAGMENT")) {
            fragment = fragment.getParentFragment();
        }
        return fragment;
    }

    /* renamed from: b */
    public static final String m226675b(int i) {
        return "INLINE_STAMP_VIEWER_SLIDE_FRAGMENT" + i;
    }
}
