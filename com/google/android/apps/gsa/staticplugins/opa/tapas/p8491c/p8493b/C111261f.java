package com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8493b;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.C4268a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.c.b.f */
/* compiled from: PG */
final class C111261f extends C4268a {

    /* renamed from: c */
    public final List f309606c = new ArrayList();

    /* renamed from: d */
    public final List f309607d = new ArrayList();

    /* renamed from: d */
    public final void mo646d(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    /* renamed from: gw */
    public final Object mo649gw(ViewGroup viewGroup, int i) {
        View view = (View) this.f309606c.get(i);
        viewGroup.addView(view);
        return view;
    }

    /* renamed from: i */
    public final boolean mo652i(View view, Object obj) {
        return view == obj;
    }

    /* renamed from: k */
    public final int mo9175k() {
        return this.f309606c.size();
    }

    /* renamed from: l */
    public final int mo9176l(Object obj) {
        for (int i = 0; i < this.f309606c.size(); i++) {
            if (((View) this.f309606c.get(i)) == obj) {
                return i;
            }
        }
        return -2;
    }

    /* renamed from: m */
    public final CharSequence mo9177m(int i) {
        if (i > mo9175k() - 1) {
            return null;
        }
        return (CharSequence) this.f309607d.get(i);
    }
}
