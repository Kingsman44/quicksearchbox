package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7996e;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.google.android.apps.gsa.h.s.ac;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84011f;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.util.C90743b;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102228q;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102229r;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102230s;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102231t;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102232u;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.logoview.LogoView;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.setupdesign.GlifLoadingLayout;
import com.google.android.setupdesign.p3555d.C45301i;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.e.f */
/* compiled from: PG */
public final class C101965f {

    /* renamed from: a */
    public static final C59071e f284518a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.e.f");

    /* renamed from: b */
    public final C22871g f284519b;

    /* renamed from: c */
    public final C101970k f284520c;

    /* renamed from: d */
    public final C89859i f284521d;

    /* renamed from: e */
    public final C102230s f284522e;

    /* renamed from: f */
    public final Runnable f284523f;

    /* renamed from: g */
    public int f284524g = 1;

    /* renamed from: h */
    private final C90743b f284525h;

    /* renamed from: i */
    private final C74555u f284526i;

    /* renamed from: j */
    private final C89994f f284527j;

    /* renamed from: k */
    private final C90021c f284528k;

    public C101965f(C22871g gVar, C101970k kVar, C90743b bVar, C89859i iVar, C102230s sVar, Runnable runnable, C74555u uVar, C89994f fVar, C90021c cVar) {
        this.f284519b = gVar;
        this.f284520c = kVar;
        this.f284525h = bVar;
        this.f284521d = iVar;
        this.f284522e = sVar;
        this.f284523f = runnable;
        this.f284526i = uVar;
        this.f284527j = fVar;
        this.f284528k = cVar;
    }

    /* renamed from: a */
    public final void mo92741a(View view) {
        View view2;
        if (mo92745e()) {
            view2 = this.f284522e.mo93022d();
        } else {
            view2 = view.findViewById(R.id.hotword_enrollment_query);
        }
        C90743b.m148214a(view2, 500);
    }

    /* renamed from: b */
    public final void mo92742b(View view, int i) {
        if (mo92745e()) {
            this.f284522e.mo93022d().setImportantForAccessibility(i);
        } else {
            view.findViewById(R.id.hotword_enrollment_query).setImportantForAccessibility(i);
        }
        view.findViewById(R.id.circular_progress_bar).setImportantForAccessibility(i);
    }

    /* renamed from: c */
    public final void mo92743c(View view) {
        ac a = this.f284526i.mo70886d().mo70847a();
        if (a.d() == 2) {
            ViewFlipper viewFlipper = (ViewFlipper) view.findViewById(R.id.fresh_enroll_view_flipper);
            this.f284520c.getActivity().getLayoutInflater().inflate(true != this.f284526i.mo70886d().mo70847a().c() ? R.layout.hotword_enrollment_enroll_screen_glif_loading_layout_no_partner_theme : R.layout.hotword_enrollment_enroll_screen_glif_loading_layout, (ViewGroup) viewFlipper.findViewById(R.id.fresh_enroll_glif_loading), true);
            if (!a.equals(ac.c)) {
                GlifLoadingLayout glifLoadingLayout = (GlifLoadingLayout) viewFlipper.findViewById(R.id.fresh_enroll_loading);
                glifLoadingLayout.mo49203x();
                ((C45301i) glifLoadingLayout.mo49129j(C45301i.class)).mo49235c(true);
            }
            viewFlipper.setDisplayedChild(viewFlipper.indexOfChild(viewFlipper.findViewById(R.id.fresh_enroll_glif_loading)));
            return;
        }
        view.findViewById(R.id.circular_progress_bar).setVisibility(4);
        view.findViewById(R.id.user_input_logoview).setVisibility(4);
        view.findViewById(R.id.check_mark_view).setVisibility(4);
        C102230s sVar = this.f284522e;
        C102231t e = C102232u.m169449e();
        e.mo92352d(this.f284520c.getString(R.string.hotword_enrollment_enrollment_waiting_screen_header_title));
        sVar.mo93026h(e.mo92349a());
        C102230s sVar2 = this.f284522e;
        C102228q f = C102229r.m169429f();
        f.mo92319b(2);
        f.mo92320c(C84011f.f228856a);
        f.mo92321d(C84011f.f228856a);
        sVar2.mo93025g(f.mo92318a());
        ((ProgressBar) view.findViewById(R.id.loading_circular_progress_bar)).setVisibility(0);
    }

    /* renamed from: d */
    public final void mo92744d(View view, String str, boolean z) {
        TextView textView;
        String str2;
        if (mo92745e()) {
            C102230s sVar = this.f284522e;
            C102231t e = C102232u.m169449e();
            if (this.f284525h.mo85090c()) {
                str2 = str;
            } else {
                str2 = String.format(this.f284520c.getString(z ? R.string.hotword_enrollment_utterance_title_with_query_first : R.string.hotword_enrollment_utterance_title_with_query_second), new Object[]{str});
            }
            e.mo92352d(str2);
            e.mo92353e(TextView.BufferType.SPANNABLE);
            sVar.mo93026h(e.mo92349a());
            textView = this.f284522e.mo93022d();
        } else {
            C102230s sVar2 = this.f284522e;
            C102231t e2 = C102232u.m169449e();
            e2.mo92352d(this.f284520c.getString(z ? R.string.hotword_enrollment_utterance_title_first : R.string.hotword_enrollment_utterance_title_second));
            sVar2.mo93026h(e2.mo92349a());
            this.f284522e.mo93022d().setImportantForAccessibility(2);
            textView = (TextView) view.findViewById(R.id.hotword_enrollment_query);
            textView.setText(str, TextView.BufferType.SPANNABLE);
        }
        Context context = view.getContext();
        if (this.f284527j.mo83851N()) {
            textView.setContentDescription(context.getString(R.string.hotword_enrollment_enroll_tisid_talkback_query_readout, new Object[]{str}));
        }
        if (this.f284525h.mo85090c()) {
            if (this.f284527j.mo83851N() && this.f284528k.mo79746e(C90082eg.f250016cZ)) {
                mo92741a(view);
            } else if (z) {
                C90743b.m148214a(textView, 500);
            } else {
                this.f284525h.mo85089b(context, str);
            }
        }
        ((LogoView) view.findViewById(R.id.user_input_logoview)).setVisibility(0);
        ((ImageView) view.findViewById(R.id.check_mark_view)).setVisibility(8);
    }

    /* renamed from: e */
    public final boolean mo92745e() {
        return this.f284526i.mo70886d().mo70847a().d() == 2;
    }
}
