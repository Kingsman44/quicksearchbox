package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8113a;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.now.shared.p6421ui.C83413b;
import com.google.android.apps.gsa.now.shared.p6421ui.RoundedCornerFrameLayout;
import com.google.android.apps.gsa.staticplugins.nowcards.base.BottomSheetListView;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104457t;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104458u;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8106b.C104473i;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C44565p;
import com.google.common.base.C58833ax;
import com.google.p375ai.p378b.C7665fk;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.e.a.bj */
/* compiled from: PG */
public final class C104727bj extends C22939d {

    /* renamed from: a */
    public final C104457t f291705a;

    /* renamed from: b */
    private final C104473i f291706b;

    /* renamed from: c */
    private final Context f291707c;

    /* renamed from: d */
    private final boolean f291708d;

    /* renamed from: e */
    private C44565p f291709e;

    public C104727bj(C22945j jVar, C104473i iVar, C104457t tVar, Context context, boolean z) {
        super(jVar);
        this.f291706b = iVar;
        this.f291705a = tVar;
        this.f291707c = context;
        this.f291708d = z;
    }

    /* renamed from: e */
    public final void mo94328e() {
        if (this.f63126Q.mo28316z()) {
            C104457t tVar = this.f291705a;
            ((C104458u) tVar).f290578a.mo28345s("onBottomsheetDismissed", "FollowUpSurveyEventsDispatcher", new Bundle());
        }
    }

    /* renamed from: im */
    public final void mo28298im() {
        C44565p pVar = this.f291709e;
        if (pVar != null && pVar.isShowing()) {
            this.f291709e.dismiss();
            mo94328e();
            this.f291709e = null;
        }
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        mo28295iC(new View(this.f291707c));
    }

    /* renamed from: ix */
    public final void mo28300ix() {
        C44565p pVar;
        int i;
        if (this.f291708d) {
            pVar = new C44565p(this.f291707c, R.style.follow_up_survey_dark_theme);
        } else {
            pVar = new C44565p(this.f291707c, R.style.follow_up_survey_light_theme);
        }
        C58833ax axVar = (C58833ax) ((C104788dq) this.f291706b).f291936a.f63720e;
        if (axVar.mo56113h()) {
            RoundedCornerFrameLayout roundedCornerFrameLayout = new RoundedCornerFrameLayout(this.f291707c);
            roundedCornerFrameLayout.mo76724hc(3);
            roundedCornerFrameLayout.mo76723hb(C83413b.m132808a(this.f291707c));
            LinearLayout linearLayout = (LinearLayout) pVar.getLayoutInflater().inflate(R.layout.bottomsheet_survey, (ViewGroup) null);
            BottomSheetListView bottomSheetListView = (BottomSheetListView) linearLayout.findViewById(R.id.list_view);
            C7665fk fkVar = (C7665fk) axVar.mo56107c();
            ((TextView) linearLayout.findViewById(R.id.header_text_view)).setText(fkVar.f26614b);
            bottomSheetListView.setAdapter(new C104726bi(pVar.getLayoutInflater(), fkVar.f26615c));
            bottomSheetListView.setOnItemClickListener(new C104724bg(this, pVar, bottomSheetListView));
            roundedCornerFrameLayout.addView(linearLayout);
            pVar.setContentView(roundedCornerFrameLayout, new ViewGroup.LayoutParams(-1, -2));
            BottomSheetBehavior C = BottomSheetBehavior.m78767C((View) roundedCornerFrameLayout.getParent());
            int i2 = this.f291707c.getResources().getDisplayMetrics().heightPixels;
            C.mo47516N((i2 + i2) / 3);
            pVar.setOnDismissListener(new C104725bh(this));
            if (this.f291708d) {
                i = this.f291707c.getResources().getColor(R.color.back_of_card_dark_background_color);
            } else {
                i = this.f291707c.getResources().getColor(17170443);
            }
            linearLayout.setBackgroundColor(i);
            bottomSheetListView.addFooterView(pVar.getLayoutInflater().inflate(R.layout.bottomsheet_skip_button, (ViewGroup) null));
        }
        this.f291709e = pVar;
        pVar.show();
        C104457t tVar = this.f291705a;
        ((C104458u) tVar).f290578a.mo28345s("onSurveyShown", "FollowUpSurveyEventsDispatcher", new Bundle());
    }
}
