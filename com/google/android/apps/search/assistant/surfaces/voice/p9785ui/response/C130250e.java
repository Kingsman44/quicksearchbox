package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response;

import android.os.Handler;
import android.support.p031v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.p098j.C2100o;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127118j;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.e */
/* compiled from: PG */
public final class C130250e extends C130265f {

    /* renamed from: a */
    public static final C59071e f357078a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.response.e");

    /* renamed from: b */
    public final DynamicResponseLayerView f357079b;

    /* renamed from: c */
    public final C127118j f357080c;

    /* renamed from: d */
    public final Fragment f357081d;

    /* renamed from: e */
    public final C2100o f357082e;

    /* renamed from: f */
    public final C130274k f357083f;

    /* renamed from: g */
    public final boolean f357084g;

    public C130250e(Fragment fragment, DynamicResponseLayerView dynamicResponseLayerView, C127118j jVar, boolean z) {
        this.f357081d = fragment;
        this.f357079b = dynamicResponseLayerView;
        this.f357080c = jVar;
        this.f357084g = z;
        C130274k kVar = new C130274k(fragment, dynamicResponseLayerView, jVar);
        this.f357083f = kVar;
        this.f357082e = new C2100o(dynamicResponseLayerView.getContext(), new C130185c(kVar), (Handler) null);
    }

    /* renamed from: c */
    private final int m212649c(int i) {
        View findViewById = this.f357079b.findViewById(i);
        if (findViewById == null || findViewById.getVisibility() == 8) {
            return 0;
        }
        return findViewById.getMeasuredHeight();
    }

    /* renamed from: a */
    public final int mo109608a() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f357079b.getLayoutParams();
        int i = 0;
        int i2 = this.f357079b.getResources().getDisplayMetrics().heightPixels - (layoutParams != null ? layoutParams.topMargin : 0);
        if (layoutParams != null) {
            i = layoutParams.bottomMargin;
        }
        return (((((((i2 - i) - m212649c(R.id.assistant_drl_top_container)) - m212649c(R.id.assistant_drl_bottom_container)) - m212649c(R.id.assistant_csat_container)) - m212649c(R.id.assistant_suggestion_container)) - m212649c(R.id.assistant_response_layer_transcription_container)) - m212649c(R.id.assistant_response_lock_affordance)) - m212649c(R.id.assistant_response_layer_input_bar_container);
    }

    /* renamed from: b */
    public final void mo109609b(boolean z) {
        ContentScrollView contentScrollView = (ContentScrollView) this.f357079b.findViewById(R.id.assistant_response_layer_scrollable_content);
        contentScrollView.getClass();
        ViewGroup.LayoutParams layoutParams = contentScrollView.getLayoutParams();
        layoutParams.getClass();
        int a = z ? mo109608a() : -2;
        if (layoutParams.height != a) {
            ((C59052c) ((C59052c) f357078a.mo56224b()).mo56372aa(38738)).mo56387q("Sets DRL full height: %d", a);
            layoutParams.height = a;
            contentScrollView.requestLayout();
        }
    }
}
