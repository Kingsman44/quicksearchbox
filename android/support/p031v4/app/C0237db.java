package android.support.p031v4.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v4.app.db */
/* compiled from: PG */
final class C0237db {
    /* renamed from: a */
    public static /* synthetic */ String m551a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED";
    }

    /* renamed from: b */
    static int m552b(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 4) {
            return 4;
        }
        if (i == 8) {
            return 3;
        }
        throw new IllegalArgumentException("Unknown visibility " + i);
    }

    /* renamed from: c */
    static int m553c(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return m552b(view.getVisibility());
    }

    /* renamed from: d */
    static void m554d(int i, View view) {
        int i2 = i - 1;
        if (i2 == 0) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (FragmentManager.m246Z(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
            }
        } else if (i2 == 1) {
            if (FragmentManager.m246Z(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            view.setVisibility(0);
        } else if (i2 != 2) {
            if (FragmentManager.m246Z(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
            }
            view.setVisibility(4);
        } else {
            if (FragmentManager.m246Z(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
        }
    }
}
