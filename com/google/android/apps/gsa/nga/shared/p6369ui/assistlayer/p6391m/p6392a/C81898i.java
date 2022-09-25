package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6391m.p6392a;

import android.graphics.Rect;
import android.support.constraint.C0129a;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81826s;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C81978ao;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C81979ap;
import com.google.android.apps.gsa.nga.shared.p6369ui.p6406c.C82194a;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.p6glow.AssistantP6GlowView;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.m.a.i */
/* compiled from: PG */
public final /* synthetic */ class C81898i implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C81889aq f223965a;

    /* renamed from: b */
    public final /* synthetic */ AssistantP6GlowView f223966b;

    /* renamed from: c */
    public final /* synthetic */ LottieAnimationView f223967c;

    public /* synthetic */ C81898i(C81889aq aqVar, AssistantP6GlowView assistantP6GlowView, LottieAnimationView lottieAnimationView) {
        this.f223965a = aqVar;
        this.f223966b = assistantP6GlowView;
        this.f223967c = lottieAnimationView;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        int i;
        C81889aq aqVar = this.f223965a;
        AssistantP6GlowView assistantP6GlowView = this.f223966b;
        LottieAnimationView lottieAnimationView = this.f223967c;
        C81978ao aoVar = (C81978ao) obj;
        C81826s b = aoVar.mo75412b();
        int i2 = 0;
        int i3 = b.mo75360b() ? b.mo75359a().bottom : 0;
        ViewGroup.LayoutParams layoutParams = assistantP6GlowView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams.bottomMargin != i3) {
                marginLayoutParams.bottomMargin = i3;
                assistantP6GlowView.requestLayout();
            }
        }
        aqVar.f223932q.mo75425a(assistantP6GlowView, aoVar);
        C81979ap apVar = aqVar.f223932q;
        if (!aoVar.mo75413c() || apVar.f224126a >= aoVar.mo75411a().mo75337e()) {
            i = aoVar.mo75411a().mo75337e();
        } else {
            i = apVar.f224126a;
        }
        assistantP6GlowView.mo42037n((float) i);
        C81826s b2 = aoVar.mo75412b();
        if (aoVar.mo75413c()) {
            C82194a aVar = aqVar.f223933r;
            Rect a = b2.mo75359a();
            int e = aoVar.mo75411a().mo75337e();
            int i4 = aqVar.f223932q.f224126a;
            boolean b3 = b2.mo75360b();
            int i5 = a.left;
            int i6 = a.right;
            int i7 = (e - a.left) - a.right;
            if (i7 > i4) {
                int i8 = (i7 - i4) / 2;
                i5 += i8;
                i6 += i8;
            }
            C0129a b4 = aVar.mo75536b();
            b4.bottomMargin = (b3 ? a.bottom : 0) + aVar.f224653a.getResources().getDimensionPixelOffset(R.dimen.nga_assist_animated_p6glow_logo_icon_bottom_margin);
            b4.leftMargin = i5;
            b4.rightMargin = i6;
            lottieAnimationView.setLayoutParams(b4);
        } else {
            C82194a aVar2 = aqVar.f223933r;
            Rect a2 = b2.mo75359a();
            boolean b5 = b2.mo75360b();
            C0129a b6 = aVar2.mo75536b();
            b6.bottomMargin = (b5 ? a2.bottom : 0) + aVar2.f224653a.getResources().getDimensionPixelOffset(R.dimen.nga_assist_animated_p6glow_logo_icon_bottom_margin);
            b6.leftMargin = a2.left;
            b6.rightMargin = a2.right;
            lottieAnimationView.setLayoutParams(b6);
        }
        int dimensionPixelOffset = aqVar.f223933r.f224653a.getResources().getDimensionPixelOffset(R.dimen.nga_assist_logo_view_horizontal_padding);
        lottieAnimationView.setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
        if (!b2.mo75360b()) {
            i2 = b2.mo75359a().bottom;
        }
        aqVar.f223939x = i2;
        aqVar.mo75389g();
        lottieAnimationView.requestLayout();
    }
}
