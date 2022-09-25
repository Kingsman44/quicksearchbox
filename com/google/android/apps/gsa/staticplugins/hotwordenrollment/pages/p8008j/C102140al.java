package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8008j;

import android.widget.ScrollView;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C83958a;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84010e;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84011f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102228q;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102229r;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102230s;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101783w;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.al */
/* compiled from: PG */
public final class C102140al {

    /* renamed from: a */
    public static final C59071e f284939a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.al");

    /* renamed from: b */
    public final C102134af f284940b;

    /* renamed from: c */
    public final C102230s f284941c;

    /* renamed from: d */
    public final Optional f284942d;

    /* renamed from: e */
    public final C102186q f284943e;

    /* renamed from: f */
    public final C89859i f284944f;

    /* renamed from: g */
    private boolean f284945g = false;

    public C102140al(C102134af afVar, C102230s sVar, Optional optional, C102186q qVar, C89859i iVar) {
        this.f284940b = afVar;
        this.f284942d = optional;
        this.f284941c = sVar;
        this.f284943e = qVar;
        this.f284944f = iVar;
    }

    /* renamed from: a */
    public final void mo92904a() {
        if (this.f284940b.getView() != null) {
            C47393f.m84236g(new C101783w(), this.f284940b);
        } else {
            ((C59052c) ((C59052c) f284939a.mo56225c()).mo56372aa(20586)).mo56389s("fragment.getView() is %s", this.f284940b.getView());
        }
    }

    /* renamed from: b */
    public final void mo92905b() {
        C59071e eVar = f284939a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(20588)).mo56386p("onScrollChanged");
        ScrollView c = this.f284941c.mo93021c();
        if (!this.f284945g && !c.canScrollVertically(1)) {
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(20590)).mo56386p("onScrolledToBottom");
            this.f284945g = true;
            C102230s sVar = this.f284941c;
            C102228q f = C102229r.m169429f();
            f.mo92319b(2);
            C84010e e = C84011f.m133882e();
            e.mo77375c(this.f284940b.getString(R.string.unified_opt_in_enrollment_agree));
            ((C83958a) e).f228734b = new C102138aj(this);
            f.mo92320c(e.mo77373a());
            C84010e e2 = C84011f.m133882e();
            e2.mo77375c(this.f284940b.getString(R.string.unified_opt_in_enrollment_no_thanks));
            ((C83958a) e2).f228734b = new C102137ai(this);
            e2.mo77374b(true);
            f.mo92321d(e2.mo77373a());
            sVar.mo93025g(f.mo92318a());
        }
    }
}
