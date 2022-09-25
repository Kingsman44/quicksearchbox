package android.support.p033v7.widget;

import android.view.View;

/* renamed from: android.support.v7.widget.gp */
/* compiled from: PG */
final class C0681gp {
    /* renamed from: a */
    static int m2385a(C0670ge geVar, C0626eo eoVar, View view, View view2, C0653fo foVar, boolean z) {
        if (foVar.getChildCount() == 0 || geVar.mo3052a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(foVar.getPosition(view) - foVar.getPosition(view2)) + 1;
        }
        return Math.min(eoVar.mo2848k(), eoVar.mo2838a(view2) - eoVar.mo2841d(view));
    }

    /* renamed from: b */
    static int m2386b(C0670ge geVar, C0626eo eoVar, View view, View view2, C0653fo foVar, boolean z, boolean z2) {
        int i;
        if (foVar.getChildCount() == 0 || geVar.mo3052a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(foVar.getPosition(view), foVar.getPosition(view2));
        int max = Math.max(foVar.getPosition(view), foVar.getPosition(view2));
        if (z2) {
            i = Math.max(0, (geVar.mo3052a() - max) - 1);
        } else {
            i = Math.max(0, min);
        }
        if (!z) {
            return i;
        }
        return Math.round((((float) i) * (((float) Math.abs(eoVar.mo2838a(view2) - eoVar.mo2841d(view))) / ((float) (Math.abs(foVar.getPosition(view) - foVar.getPosition(view2)) + 1)))) + ((float) (eoVar.mo2847j() - eoVar.mo2841d(view))));
    }

    /* renamed from: c */
    static int m2387c(C0670ge geVar, C0626eo eoVar, View view, View view2, C0653fo foVar, boolean z) {
        if (foVar.getChildCount() == 0 || geVar.mo3052a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return geVar.mo3052a();
        }
        return (int) ((((float) (eoVar.mo2838a(view2) - eoVar.mo2841d(view))) / ((float) (Math.abs(foVar.getPosition(view) - foVar.getPosition(view2)) + 1))) * ((float) geVar.mo3052a()));
    }
}
