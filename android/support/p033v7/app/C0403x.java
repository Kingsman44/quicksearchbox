package android.support.p033v7.app;

import android.graphics.Rect;
import android.support.p033v7.widget.ActionBarContextView;
import android.support.p033v7.widget.C0763jq;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.C1878d;
import androidx.core.p098j.C2010ad;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2082cp;
import com.google.android.googlequicksearchbox.R;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.app.x */
/* compiled from: PG */
final class C0403x implements C2010ad {

    /* renamed from: a */
    final /* synthetic */ C0356aq f1367a;

    public C0403x(C0356aq aqVar) {
        this.f1367a = aqVar;
    }

    /* renamed from: a */
    public final C2082cp mo1337a(View view, C2082cp cpVar) {
        boolean z;
        View view2;
        C2082cp cpVar2;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        int i3;
        int d = cpVar.mo5242d();
        C0356aq aqVar = this.f1367a;
        int d2 = cpVar.mo5242d();
        ActionBarContextView actionBarContextView = aqVar.f1219s;
        int i4 = 8;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aqVar.f1219s.getLayoutParams();
            if (aqVar.f1219s.isShown()) {
                if (aqVar.f1186K == null) {
                    aqVar.f1186K = new Rect();
                    aqVar.f1187L = new Rect();
                }
                Rect rect = aqVar.f1186K;
                Rect rect2 = aqVar.f1187L;
                rect.set(cpVar.mo5240b(), cpVar.mo5242d(), cpVar.mo5241c(), cpVar.mo5239a());
                ViewGroup viewGroup = aqVar.f1224x;
                Method method = C0763jq.f2653a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, new Object[]{rect, rect2});
                    } catch (Exception e) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                    }
                }
                int i5 = rect.top;
                int i6 = rect.left;
                int i7 = rect.right;
                C2082cp z4 = C2043bi.m5597z(aqVar.f1224x);
                if (z4 == null) {
                    i = 0;
                } else {
                    i = z4.mo5240b();
                }
                if (z4 == null) {
                    i2 = 0;
                } else {
                    i2 = z4.mo5241c();
                }
                if (marginLayoutParams.topMargin == i5 && marginLayoutParams.leftMargin == i6 && marginLayoutParams.rightMargin == i7) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i5;
                    marginLayoutParams.leftMargin = i6;
                    marginLayoutParams.rightMargin = i7;
                    z2 = true;
                }
                if (i5 <= 0 || aqVar.f1225y != null) {
                    View view3 = aqVar.f1225y;
                    if (view3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        if (!(marginLayoutParams2.height == marginLayoutParams.topMargin && marginLayoutParams2.leftMargin == i && marginLayoutParams2.rightMargin == i2)) {
                            marginLayoutParams2.height = marginLayoutParams.topMargin;
                            marginLayoutParams2.leftMargin = i;
                            marginLayoutParams2.rightMargin = i2;
                            aqVar.f1225y.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    aqVar.f1225y = new View(aqVar.f1212l);
                    aqVar.f1225y.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i;
                    layoutParams.rightMargin = i2;
                    aqVar.f1224x.addView(aqVar.f1225y, -1, layoutParams);
                }
                View view4 = aqVar.f1225y;
                z = view4 != null;
                if (z && view4.getVisibility() != 0) {
                    View view5 = aqVar.f1225y;
                    if ((C2043bi.m5584m(view5) & 8192) != 0) {
                        i3 = C1878d.m5128a(aqVar.f1212l, R.color.abc_decor_view_status_guard_light);
                    } else {
                        i3 = C1878d.m5128a(aqVar.f1212l, R.color.abc_decor_view_status_guard);
                    }
                    view5.setBackgroundColor(i3);
                }
                if (!aqVar.f1177B && z) {
                    d2 = 0;
                }
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z3 = true;
                } else {
                    z3 = false;
                }
                z = false;
            }
            if (z2) {
                aqVar.f1219s.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = aqVar.f1225y;
        if (view6 != null) {
            if (true == z) {
                i4 = 0;
            }
            view6.setVisibility(i4);
        }
        if (d != d2) {
            cpVar2 = cpVar.mo5245g(cpVar.mo5240b(), d2, cpVar.mo5241c(), cpVar.mo5239a());
            view2 = view;
        } else {
            view2 = view;
            cpVar2 = cpVar;
        }
        return C2043bi.m5507A(view2, cpVar2);
    }
}
