package com.google.android.libraries.play.unison.binding;

import android.view.View;
import android.view.ViewParent;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.play.unison.binding.t */
/* compiled from: PG */
public final class C31994t {
    /* renamed from: a */
    public static final boolean m59603a(View view, View view2) {
        C69664n.m101061g(view, "<this>");
        C69664n.m101061g(view2, "compositeView");
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return m59603a((View) parent, view2);
        }
        return false;
    }
}
