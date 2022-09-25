package com.google.android.apps.gsa.staticplugins.hotwordenrollment;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.apps.gsa.h.s.ac;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84011f;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84012g;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LegacyOpaStandardPage;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.googlequicksearchbox.R;
import com.google.android.setupcompat.template.C45275b;
import com.google.android.setupcompat.template.C45276c;
import com.google.android.setupcompat.template.C45277d;
import com.google.android.setupdesign.GlifLayout;
import com.google.android.setupdesign.p3555d.C45296d;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.s */
/* compiled from: PG */
public final class C102230s {

    /* renamed from: b */
    private static final C59071e f285264b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.hotwordenrollment.s");

    /* renamed from: a */
    public View f285265a;

    /* renamed from: c */
    private final C74555u f285266c;

    /* renamed from: d */
    private final C58833ax f285267d;

    public C102230s(C74555u uVar, C58833ax axVar) {
        this.f285266c = uVar;
        this.f285267d = axVar;
    }

    /* renamed from: i */
    private static C45277d m169435i(Context context, C84011f fVar, C58833ax axVar) {
        C45276c cVar = new C45276c(context);
        cVar.f118280a = fVar.mo77416b().toString();
        cVar.f118281b = fVar.mo77415a();
        if (axVar.mo56113h()) {
            cVar.f118283d = ((Integer) axVar.mo56107c()).intValue();
        }
        C45277d a = cVar.mo49180a();
        a.mo49183b(true != fVar.mo77418d() ? 8 : 0);
        return a;
    }

    /* renamed from: a */
    public final View mo93019a(LayoutInflater layoutInflater) {
        return mo93020b(layoutInflater, R.layout.hotword_enrollment_page_opa, R.layout.hotword_enrollment_page_glif, R.layout.hotword_enrollment_page_glif_no_partner, (ViewGroup) null, 0, 0);
    }

    @Deprecated
    /* renamed from: b */
    public final View mo93020b(LayoutInflater layoutInflater, int i, int i2, int i3, ViewGroup viewGroup, int i4, int i5) {
        if (this.f285265a == null) {
            ac a = this.f285266c.mo70886d().mo70847a();
            if (a.d() != 2) {
                this.f285265a = layoutInflater.inflate(i, viewGroup, true);
            } else if (a.c()) {
                this.f285265a = layoutInflater.inflate(i2, viewGroup, true);
            } else {
                this.f285265a = layoutInflater.inflate(i3, viewGroup, true);
            }
            if (!(i4 == 0 || i5 == 0)) {
                View view = this.f285265a;
                if (a.d() == 2) {
                    i4 = i5;
                }
                this.f285265a = view.findViewById(i4);
            }
            return this.f285265a;
        }
        ((C59052c) ((C59052c) f285264b.mo56225c()).mo56372aa(20246)).mo56386p("View is already inflated!");
        throw new IllegalStateException("View is already inflated!");
    }

    /* renamed from: c */
    public final ScrollView mo93021c() {
        if (this.f285266c.mo70886d().mo70847a().d() == 2) {
            mo93023e();
            return ((GlifLayout) this.f285265a).mo49190m();
        }
        mo93023e();
        return ((OpaPageLayout) this.f285265a).f228727b;
    }

    /* renamed from: d */
    public final TextView mo93022d() {
        mo93023e();
        if (this.f285266c.mo70886d().mo70847a().d() == 2) {
            return ((GlifLayout) this.f285265a).mo49192o();
        }
        return ((HeaderLayout) this.f285265a.findViewById(R.id.opa_header)).f228718a;
    }

    /* renamed from: e */
    public final void mo93023e() {
        if (this.f285265a == null) {
            ((C59052c) ((C59052c) f285264b.mo56225c()).mo56372aa(20247)).mo56386p("View has not been inflated!");
            throw new IllegalStateException("View has not been inflated!");
        }
    }

    /* renamed from: f */
    public final void mo93024f(int i) {
        mo93023e();
        Context context = this.f285265a.getContext();
        mo93023e();
        View.inflate(context, i, (ViewGroup) this.f285265a.findViewById(R.id.enroll_page_content));
    }

    /* renamed from: g */
    public final void mo93025g(C102229r rVar) {
        C58833ax axVar;
        mo93023e();
        if (this.f285266c.mo70886d().mo70847a().d() == 2) {
            GlifLayout glifLayout = (GlifLayout) this.f285265a;
            if (rVar.mo92340a() != 0 && rVar.mo92340a() != 3) {
                C45275b bVar = (C45275b) glifLayout.mo49129j(C45275b.class);
                bVar.mo49175f(m169435i(glifLayout.getContext(), rVar.mo92341b(), this.f285267d));
                Context context = glifLayout.getContext();
                C84011f c = rVar.mo92342c();
                if (rVar.mo92342c().mo77417c()) {
                    axVar = this.f285267d;
                } else {
                    axVar = C58836b.f156633a;
                }
                bVar.mo49176g(m169435i(context, c, axVar), rVar.mo92342c().mo77417c());
                return;
            }
            return;
        }
        View view = this.f285265a;
        if (!(view instanceof LegacyOpaStandardPage)) {
            OpaPageLayout opaPageLayout = (OpaPageLayout) view;
            C84012g a = opaPageLayout.mo77369a();
            int a2 = rVar.mo92340a();
            a.mo77475d(a2);
            if (a2 != 0 && a2 != 3) {
                a.mo77472a(rVar.mo92341b());
                a.mo77473b(rVar.mo92342c());
                opaPageLayout.f228726a.mo77360a().setContentDescription(rVar.mo92343d());
                opaPageLayout.f228726a.mo77361b().setContentDescription(rVar.mo92344e());
            }
        }
    }

    /* renamed from: h */
    public final void mo93026h(C102232u uVar) {
        mo93023e();
        if (this.f285266c.mo70886d().mo70847a().d() == 2) {
            GlifLayout glifLayout = (GlifLayout) this.f285265a;
            glifLayout.mo49192o().setText(uVar.mo92541c(), uVar.mo92539a());
            CharSequence b = uVar.mo92540b();
            if (TextUtils.isEmpty(b)) {
                glifLayout.mo49191n().setVisibility(8);
            } else {
                glifLayout.mo49195q(b);
            }
            if (uVar.mo92542d()) {
                glifLayout.mo49191n().setMovementMethod(LinkMovementMethod.getInstance());
            }
            Drawable drawable = glifLayout.getContext().getDrawable(R.drawable.opa_logo);
            if (drawable != null) {
                C45296d dVar = (C45296d) glifLayout.mo49129j(C45296d.class);
                ImageView b2 = dVar.mo49230b();
                if (b2 != null) {
                    drawable.applyTheme(dVar.f118346a.getTheme());
                    b2.setImageDrawable(drawable);
                    b2.setVisibility(0);
                    dVar.mo49231c(b2.getVisibility());
                    dVar.mo49232d();
                    return;
                }
                return;
            }
            ((C59052c) ((C59052c) f285264b.mo56225c()).mo56372aa(20248)).mo56386p("Drawable is null.");
            return;
        }
        View view = this.f285265a;
        if (view instanceof LegacyOpaStandardPage) {
            LegacyOpaStandardPage legacyOpaStandardPage = (LegacyOpaStandardPage) view;
            CharSequence c = uVar.mo92541c();
            HeaderLayout headerLayout = legacyOpaStandardPage.f228723b;
            C84018m.m133908c(headerLayout.f228718a, c, TextView.BufferType.NORMAL, headerLayout);
            CharSequence b3 = uVar.mo92540b();
            HeaderLayout headerLayout2 = legacyOpaStandardPage.f228723b;
            C84018m.m133908c(headerLayout2.f228719b, b3, TextView.BufferType.NORMAL, headerLayout2);
            return;
        }
        HeaderLayout headerLayout3 = (HeaderLayout) view.findViewById(R.id.opa_header);
        C84018m.m133908c(headerLayout3.f228718a, uVar.mo92541c(), uVar.mo92539a(), headerLayout3);
        CharSequence b4 = uVar.mo92540b();
        if (TextUtils.isEmpty(b4)) {
            headerLayout3.f228719b.setVisibility(8);
        } else {
            C84018m.m133908c(headerLayout3.f228719b, b4, TextView.BufferType.NORMAL, headerLayout3);
        }
        if (uVar.mo92542d()) {
            headerLayout3.f228719b.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }
}
