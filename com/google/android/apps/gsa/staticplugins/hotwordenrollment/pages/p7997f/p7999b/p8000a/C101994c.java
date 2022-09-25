package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7997f.p7999b.p8000a;

import android.content.Context;
import android.content.res.Resources;
import com.android.p265e.C5114a;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101497ae;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101860a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7997f.C102007c;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7997f.C102010e;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7997f.C102012g;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7997f.C102013h;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7997f.C102017l;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7997f.C102018m;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7997f.C102019n;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7997f.C102020o;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.local.C46851e;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.f.b.a.c */
/* compiled from: PG */
public final class C101994c implements C102019n {

    /* renamed from: a */
    private final Resources f284568a;

    /* renamed from: b */
    private final C74555u f284569b;

    /* renamed from: c */
    private final C101860a f284570c;

    /* renamed from: d */
    private final C101497ae f284571d;

    /* renamed from: e */
    private final C92486a f284572e;

    /* renamed from: f */
    private final boolean f284573f;

    public C101994c(Context context, C74555u uVar, C101860a aVar, C101497ae aeVar, C92486a aVar2, boolean z) {
        this.f284568a = context.getResources();
        this.f284569b = uVar;
        this.f284570c = aVar;
        this.f284571d = aeVar;
        this.f284572e = aVar2;
        this.f284573f = z;
    }

    /* renamed from: a */
    public final C46851e mo92762a() {
        C102017l i = C102018m.m168905i();
        if (this.f284570c.f284137d.get()) {
            i.mo92784f(this.f284568a.getString(R.string.phone_hotword_screen_header_title_for_unicorn, new Object[]{this.f284571d.mo92329b(), this.f284572e.mo87230d()}));
            C102010e eVar = (C102010e) i;
            eVar.f284624b = C5114a.m13988b(Locale.getDefault(), this.f284568a.getString(R.string.phone_hotword_screen_header_description_for_unicorn, new Object[]{this.f284571d.mo92329b(), this.f284572e.mo87230d(), this.f284572e.mo87230d(), this.f284571d.mo92329b()}), "GENDER", this.f284571d.mo92330c());
            C58480gp e = C58485gu.m89837e();
            C102012g c = C102013h.m168888c();
            c.mo92761c(this.f284568a.getString(R.string.phone_hotword_screen_example_query_1_title));
            c.mo92760b(this.f284568a.getString(R.string.phone_hotword_screen_example_query_1_subtitle_for_unicorn));
            e.mo55395g(c.mo92759a());
            C102012g c2 = C102013h.m168888c();
            c2.mo92761c(this.f284568a.getString(R.string.phone_hotword_screen_example_query_2_title_for_unicorn));
            c2.mo92760b(this.f284568a.getString(R.string.phone_hotword_screen_example_query_2_subtitle_for_unicorn));
            e.mo55395g(c2.mo92759a());
            C102012g c3 = C102013h.m168888c();
            c3.mo92761c(this.f284568a.getString(R.string.phone_hotword_screen_example_query_3_title));
            c3.mo92760b(this.f284568a.getString(R.string.phone_hotword_screen_example_query_3_subtitle_for_unicorn));
            e.mo55395g(c3.mo92759a());
            i.mo92781c(e.mo55394f());
            eVar.f284626d = this.f284568a.getString(R.string.phone_hotword_screen_footer_disclosure_for_unicorn, new Object[]{this.f284571d.mo92329b(), this.f284572e.mo87230d(), this.f284572e.mo87230d(), this.f284571d.mo92329b()});
        } else {
            i.mo92784f(this.f284568a.getString(R.string.phone_hotword_screen_header_title, new Object[]{this.f284572e.mo87230d()}));
            i.mo92780b(this.f284568a.getString(R.string.phone_hotword_screen_header_description, new Object[]{this.f284572e.mo87230d(), this.f284572e.mo87230d()}));
            C58480gp e2 = C58485gu.m89837e();
            C102012g c4 = C102013h.m168888c();
            c4.mo92761c(this.f284568a.getString(R.string.phone_hotword_screen_example_query_1_title));
            c4.mo92760b(this.f284568a.getString(R.string.phone_hotword_screen_example_query_1_subtitle));
            e2.mo55395g(c4.mo92759a());
            C102012g c5 = C102013h.m168888c();
            c5.mo92761c(this.f284568a.getString(R.string.phone_hotword_screen_example_query_2_title));
            c5.mo92760b(this.f284568a.getString(R.string.phone_hotword_screen_example_query_2_subtitle));
            e2.mo55395g(c5.mo92759a());
            C102012g c6 = C102013h.m168888c();
            c6.mo92761c(this.f284568a.getString(R.string.phone_hotword_screen_example_query_3_title));
            c6.mo92760b(this.f284568a.getString(R.string.phone_hotword_screen_example_query_3_subtitle));
            e2.mo55395g(c6.mo92759a());
            i.mo92781c(e2.mo55394f());
            ((C102010e) i).f284626d = this.f284568a.getString(R.string.phone_hotword_screen_footer_disclosure, new Object[]{this.f284572e.mo87230d(), this.f284572e.mo87230d()});
        }
        i.mo92783e(this.f284568a.getString(R.string.hotword_screen_accept_button_i_agree));
        i.mo92782d(this.f284568a.getString(true != this.f284569b.mo70887e().mo70853a().mo70877a() ? R.string.hotword_screen_cancel_button_no_thanks : R.string.hotword_screen_cancel_button_skip));
        C102007c cVar = new C102007c();
        cVar.f284619a = new C101993b(this.f284573f);
        C102010e eVar2 = (C102010e) i;
        eVar2.f284625c = cVar.mo92773a();
        eVar2.f284629g = true;
        return new C102020o(C60856cj.m92900i(i.mo92779a()));
    }

    /* renamed from: b */
    public final /* synthetic */ C60870cx mo92763b() {
        return null;
    }

    /* renamed from: c */
    public final /* synthetic */ C60870cx mo92764c() {
        return null;
    }
}
