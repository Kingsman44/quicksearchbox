package com.google.android.libraries.p1969j.p1970a.p1971a.p1972a;

import android.app.Dialog;
import android.os.Bundle;
import android.support.p031v4.app.C0167am;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C44566q;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.j.a.a.a.f */
/* compiled from: PG */
public class C23928f extends C44566q {
    /* renamed from: k */
    public static void m44505k(View view) {
        if (view != null) {
            DisplayMetrics displayMetrics = view.getContext().getResources().getDisplayMetrics();
            double d = (double) displayMetrics.heightPixels;
            Double.isNaN(d);
            int i = (int) (d * 0.6d);
            int i2 = displayMetrics.heightPixels;
            BottomSheetBehavior C = BottomSheetBehavior.m78767C((View) view.getParent());
            int height = view.getHeight();
            double d2 = (double) i2;
            Double.isNaN(d2);
            if (height > ((int) (d2 * 0.7d))) {
                C.mo47516N(i);
                ((C23939q) view).mo29354j(true);
                return;
            }
            C.mo47516N(view.getHeight());
            ((C23939q) view).mo29354j(false);
        }
    }

    /* renamed from: l */
    public static void m44506l(View view, Dialog dialog) {
        if (view != null && dialog != null) {
            DisplayMetrics displayMetrics = view.getContext().getResources().getDisplayMetrics();
            int applyDimension = (int) TypedValue.applyDimension(1, 552.0f, displayMetrics);
            int i = displayMetrics.widthPixels;
            dialog.getWindow().setLayout(i >= applyDimension ? applyDimension : -1, -1);
            if (i >= applyDimension) {
                dialog.getWindow().setNavigationBarColor(-16777216);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: jO */
    public void mo29334jO() {
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        C23927e eVar = new C23927e(this, getContext());
        eVar.setOnShowListener(new C23926d(this));
        return eVar;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        C0167am activity = getActivity();
        C58838bb.m90884s(activity instanceof C0167am, "Context of SingleSettingMaterialView is not an instance of FragmentActivity");
        return new C23939q(activity);
    }

    public void onResume() {
        super.onResume();
        View view = getView();
        Dialog dialog = getDialog();
        m44505k(view);
        m44506l(view, dialog);
    }

    public void onViewCreated(View view, Bundle bundle) {
        view.addOnLayoutChangeListener(new C23925c(this));
    }
}
