package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8006h;

import android.text.method.LinkMovementMethod;
import android.view.View;
import com.google.android.apps.gsa.shared.p7148ui.talkback.LinkTextView;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.h.u */
/* compiled from: PG */
public final class C102072u implements C102076y {

    /* renamed from: a */
    private final C102071t f284764a;

    public C102072u(C102071t tVar) {
        this.f284764a = tVar;
    }

    /* renamed from: c */
    private static void m169025c(View view, int i, int i2) {
        View findViewById = view.findViewById(i);
        if (findViewById == null) {
            C58838bb.m90883r(i2 == 8);
        } else {
            findViewById.setVisibility(i2);
        }
    }

    /* renamed from: a */
    public final int mo92846a() {
        return R.layout.hotword_enroll_phone_summary_contents;
    }

    /* renamed from: b */
    public final void mo92847b(View view) {
        if (((C102055d) this.f284764a).f284738b - 1 != 2) {
            m169025c(view, R.id.hotword_enrollment_summary_success_img, 0);
            m169025c(view, R.id.hotword_enrollment_summary_success_img_new, 8);
        } else {
            m169025c(view, R.id.hotword_enrollment_summary_top_spacer, 0);
            m169025c(view, R.id.hotword_enrollment_summary_success_img, 8);
            m169025c(view, R.id.hotword_enrollment_summary_success_img_new, 0);
        }
        LinkTextView linkTextView = (LinkTextView) view.findViewById(R.id.hotword_enrollment_summary_footer);
        linkTextView.setVisibility(0);
        linkTextView.setText(((C102055d) this.f284764a).f284737a);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
        linkTextView.setClickable(true);
    }
}
