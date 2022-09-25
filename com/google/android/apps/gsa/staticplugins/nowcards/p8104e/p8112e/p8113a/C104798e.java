package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8113a;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.gsa.now.shared.p6421ui.C83413b;
import com.google.android.apps.gsa.now.shared.p6421ui.RoundedCornerFrameLayout;
import com.google.android.apps.gsa.staticplugins.nowcards.base.BottomSheetListView;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104423a;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104439b;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8106b.C104465a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C44565p;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.e.a.e */
/* compiled from: PG */
public final class C104798e extends C22939d {

    /* renamed from: a */
    public final C104423a f292015a;

    /* renamed from: b */
    public final Context f292016b;

    /* renamed from: c */
    private final C104465a f292017c;

    /* renamed from: d */
    private final boolean f292018d;

    /* renamed from: e */
    private C44565p f292019e;

    public C104798e(C22945j jVar, C104465a aVar, C104423a aVar2, Context context, boolean z) {
        super(jVar);
        this.f292017c = aVar;
        this.f292015a = aVar2;
        this.f292016b = context;
        this.f292018d = z;
    }

    /* renamed from: im */
    public final void mo28298im() {
        C44565p pVar = this.f292019e;
        if (pVar != null && pVar.isShowing()) {
            this.f292019e.dismiss();
            this.f292019e = null;
        }
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        C44565p pVar;
        int i;
        mo28295iC(new View(this.f292016b));
        if (this.f292018d) {
            pVar = new C44565p(this.f292016b, 2132148780);
        } else {
            pVar = new C44565p(this.f292016b, R.style.BottomSheetDialog);
        }
        RoundedCornerFrameLayout roundedCornerFrameLayout = new RoundedCornerFrameLayout(this.f292016b);
        roundedCornerFrameLayout.mo76724hc(3);
        roundedCornerFrameLayout.mo76723hb(C83413b.m132808a(this.f292016b));
        LinearLayout linearLayout = (LinearLayout) pVar.getLayoutInflater().inflate(R.layout.bottomsheet_survey, (ViewGroup) null);
        BottomSheetListView bottomSheetListView = (BottomSheetListView) linearLayout.findViewById(R.id.list_view);
        ((C104773db) this.f292017c).f291854a.mo28726b(new C104717b(this, linearLayout, bottomSheetListView, pVar));
        roundedCornerFrameLayout.addView(linearLayout);
        pVar.setContentView(roundedCornerFrameLayout, new ViewGroup.LayoutParams(-1, -2));
        BottomSheetBehavior C = BottomSheetBehavior.m78767C((View) roundedCornerFrameLayout.getParent());
        int i2 = this.f292016b.getResources().getDisplayMetrics().heightPixels;
        C.mo47516N((i2 + i2) / 3);
        pVar.setOnDismissListener(new C104744c(this));
        if (this.f292018d) {
            i = this.f292016b.getResources().getColor(R.color.back_of_card_dark_background_color);
        } else {
            i = this.f292016b.getResources().getColor(17170443);
        }
        linearLayout.setBackgroundColor(i);
        bottomSheetListView.addFooterView(LayoutInflater.from(this.f292016b).inflate(R.layout.bottomsheet_skip_button, (ViewGroup) null));
        this.f292019e = pVar;
    }

    /* renamed from: ix */
    public final void mo28300ix() {
        C44565p pVar = this.f292019e;
        if (pVar != null) {
            pVar.show();
            C104423a aVar = this.f292015a;
            ((C104439b) aVar).f290568a.mo28345s("onDialogShown", "AdDismissSurveyEventsDispatcher", new Bundle());
        }
    }
}
