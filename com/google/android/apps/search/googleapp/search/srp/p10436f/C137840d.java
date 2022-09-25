package com.google.android.apps.search.googleapp.search.srp.p10436f;

import android.content.res.Resources;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.web.contrib.p3389i.C43627a;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.f.d */
/* compiled from: PG */
public final /* synthetic */ class C137840d implements C43627a {

    /* renamed from: a */
    public final /* synthetic */ C137843g f375022a;

    public /* synthetic */ C137840d(C137843g gVar) {
        this.f375022a = gVar;
    }

    /* renamed from: a */
    public final void mo33711a(int i) {
        C137843g gVar = this.f375022a;
        Resources resources = gVar.f375028c.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.googleapp_search_header_height);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.googleapp_search_box_height);
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(R.dimen.googleapp_search_box_vertical_padding);
        if (i > (dimensionPixelOffset - dimensionPixelOffset2) - (dimensionPixelOffset3 + dimensionPixelOffset3)) {
            if (((Boolean) C137843g.f375026b.getAndSet(false)).booleanValue()) {
                LottieAnimationView b = gVar.mo113998b();
                if (b == null) {
                    ((C58970a) ((C58970a) C137843g.f375025a.mo56226d()).mo56372aa(41062)).mo56386p("searchOrSuperGIcon is null");
                    return;
                }
                b.f15138d.f15342b.f15712b = 1.0f;
                b.mo9695f();
            }
        } else if (!((Boolean) C137843g.f375026b.getAndSet(true)).booleanValue()) {
            LottieAnimationView b2 = gVar.mo113998b();
            if (b2 == null) {
                ((C58970a) ((C58970a) C137843g.f375025a.mo56226d()).mo56372aa(41063)).mo56386p("searchOrSuperGIcon is null");
                return;
            }
            b2.f15138d.f15342b.f15712b = -1.0f;
            b2.mo9695f();
        }
    }
}
