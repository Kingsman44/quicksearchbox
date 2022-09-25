package android.support.p033v7.widget.p041a;

import android.support.p033v7.widget.C0673gh;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;

/* renamed from: android.support.v7.widget.a.f */
/* compiled from: PG */
public abstract class C0496f {

    /* renamed from: a */
    private static final Interpolator f1983a = new C0495e();

    /* renamed from: b */
    private int f1984b = -1;

    /* renamed from: b */
    public static int m1855b(int i, int i2) {
        int i3;
        int i4 = i & 789516;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (i4 ^ -1);
        if (i2 == 0) {
            i3 = i4 << 2;
        } else {
            int i6 = i4 + i4;
            i5 |= -789517 & i6;
            i3 = (i6 & 789516) << 2;
        }
        return i5 | i3;
    }

    /* renamed from: c */
    public static int m1856c(int i, int i2) {
        int i3 = i2 | i;
        return (i << 16) | (i2 << 8) | i3;
    }

    /* renamed from: a */
    public final int mo2440a(int i, int i2) {
        int i3;
        int i4 = i & 3158064;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (i4 ^ -1);
        if (i2 == 0) {
            i3 = i4 >> 2;
        } else {
            int i6 = i4 >> 1;
            i5 |= -3158065 & i6;
            i3 = (i6 & 3158064) >> 2;
        }
        return i5 | i3;
    }

    /* renamed from: d */
    public void mo2441d(RecyclerView recyclerView, C0673gh ghVar) {
        View view = ghVar.itemView;
        Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            C2043bi.m5548ab(view, ((Float) tag).floatValue());
        }
        view.setTag(R.id.item_touch_helper_previous_elevation, (Object) null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    /* renamed from: e */
    public boolean mo2442e() {
        return true;
    }

    /* renamed from: f */
    public boolean mo2443f() {
        return true;
    }

    /* renamed from: g */
    public abstract boolean mo2444g(RecyclerView recyclerView, C0673gh ghVar, C0673gh ghVar2);

    /* renamed from: h */
    public abstract int mo2445h();

    /* renamed from: i */
    public final int mo2446i(RecyclerView recyclerView, int i, int i2, long j) {
        int i3 = this.f1984b;
        if (i3 == -1) {
            i3 = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            this.f1984b = i3;
        }
        int abs = Math.abs(i2);
        float f = ((float) abs) / ((float) i);
        float f2 = 1.0f;
        int signum = (int) (((float) (((int) Math.signum((float) i2)) * i3)) * f1983a.getInterpolation(Math.min(1.0f, f)));
        if (j <= 2000) {
            f2 = ((float) j) / 2000.0f;
        }
        int i4 = (int) (((float) signum) * f2 * f2 * f2 * f2 * f2);
        if (i4 != 0) {
            return i4;
        }
        if (i2 > 0) {
            return 1;
        }
        return -1;
    }

    /* renamed from: j */
    public final void mo2447j(RecyclerView recyclerView, C0673gh ghVar, float f, float f2, boolean z) {
        View view = ghVar.itemView;
        if (z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
            Float valueOf = Float.valueOf(C2043bi.m5533a(view));
            int childCount = recyclerView.getChildCount();
            float f3 = 0.0f;
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (childAt != view) {
                    float a = C2043bi.m5533a(childAt);
                    if (a > f3) {
                        f3 = a;
                    }
                }
            }
            C2043bi.m5548ab(view, f3 + 1.0f);
            view.setTag(R.id.item_touch_helper_previous_elevation, valueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    /* renamed from: k */
    public abstract void mo2448k(C0673gh ghVar);

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final int mo2449l(RecyclerView recyclerView) {
        return mo2440a(mo2445h(), C2043bi.m5577f(recyclerView));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo2450m(RecyclerView recyclerView) {
        return (mo2449l(recyclerView) & 16711680) != 0;
    }
}
