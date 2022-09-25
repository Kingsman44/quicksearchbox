package com.google.android.apps.search.podcasts;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.C1926c;
import androidx.core.p098j.C2010ad;
import androidx.core.p098j.C2082cp;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: com.google.android.apps.search.podcasts.q */
/* compiled from: PG */
public final /* synthetic */ class C140941q implements C2010ad {

    /* renamed from: a */
    public final /* synthetic */ C141182w f382696a;

    /* renamed from: b */
    public final /* synthetic */ BottomSheetBehavior f382697b;

    public /* synthetic */ C140941q(C141182w wVar, BottomSheetBehavior bottomSheetBehavior) {
        this.f382696a = wVar;
        this.f382697b = bottomSheetBehavior;
    }

    /* renamed from: a */
    public final C2082cp mo1337a(View view, C2082cp cpVar) {
        C141182w wVar = this.f382696a;
        BottomSheetBehavior bottomSheetBehavior = this.f382697b;
        if (wVar.f383288b.getActivity() != null) {
            C1926c a = cpVar.f5994b.mo5216a(7);
            view.setPadding(a.f5821b, view.getPaddingTop(), a.f5823d, view.getPaddingBottom());
            View findViewById = view.findViewById(R.id.podcasts_bottom_nav);
            findViewById.setPadding(findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight(), a.f5824e);
            bottomSheetBehavior.mo47516N(C141182w.m229194a(wVar.f383288b) + wVar.f383288b.getResources().getDimensionPixelSize(R.dimen.podcasts_collapsed_player_height) + a.f5824e);
            int i = a.f5824e;
            int a2 = C141182w.m229194a(wVar.f383288b);
            View findViewById2 = view.findViewById(R.id.podcasts_nav_host_container);
            findViewById2.setPadding(findViewById2.getPaddingLeft(), findViewById2.getPaddingTop(), findViewById2.getPaddingRight(), i + a2);
            int dimensionPixelOffset = wVar.f383288b.getResources().getDimensionPixelOffset(R.dimen.podcasts_main_page_content_margin);
            int dimensionPixelOffset2 = wVar.f383288b.getResources().getDimensionPixelOffset(R.dimen.podcasts_page_padding);
            if (dimensionPixelOffset >= dimensionPixelOffset2 + dimensionPixelOffset2) {
                int width = wVar.f383288b.requireView().getWidth();
                View findViewById3 = wVar.f383288b.requireView().findViewById(R.id.podcasts_expanded_player_panel_container);
                ViewGroup.LayoutParams layoutParams = findViewById3.getLayoutParams();
                layoutParams.width = (width - (dimensionPixelOffset + dimensionPixelOffset)) + dimensionPixelOffset2;
                findViewById3.setLayoutParams(layoutParams);
            }
        }
        return cpVar;
    }
}
