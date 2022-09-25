package com.google.android.libraries.componentview.components.p1693e.p1695b;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.C4268a;
import java.util.List;

/* renamed from: com.google.android.libraries.componentview.components.e.b.c */
/* compiled from: PG */
public final class C20357c extends C4268a {

    /* renamed from: c */
    public final List f57240c;

    public C20357c(List list) {
        this.f57240c = list;
    }

    /* renamed from: d */
    public final void mo646d(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    /* renamed from: gw */
    public final Object mo649gw(ViewGroup viewGroup, int i) {
        View view = (View) this.f57240c.get(i);
        viewGroup.addView(view);
        return view;
    }

    /* renamed from: i */
    public final boolean mo652i(View view, Object obj) {
        return view == obj;
    }

    /* renamed from: k */
    public final int mo9175k() {
        return this.f57240c.size();
    }
}
