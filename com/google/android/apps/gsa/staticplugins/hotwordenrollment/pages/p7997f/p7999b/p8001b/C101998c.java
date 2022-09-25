package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7997f.p7999b.p8001b;

import android.content.Context;
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
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.f.b.b.c */
/* compiled from: PG */
public final class C101998c implements C102019n {

    /* renamed from: a */
    private final Context f284575a;

    /* renamed from: b */
    private final C74555u f284576b;

    /* renamed from: c */
    private final C101860a f284577c;

    /* renamed from: d */
    private final C101497ae f284578d;

    /* renamed from: e */
    private final C92486a f284579e;

    public C101998c(Context context, C74555u uVar, C101860a aVar, C101497ae aeVar, C92486a aVar2) {
        this.f284575a = context;
        this.f284576b = uVar;
        this.f284577c = aVar;
        this.f284578d = aeVar;
        this.f284579e = aVar2;
    }

    /* renamed from: a */
    public final C46851e mo92762a() {
        C102017l i = C102018m.m168905i();
        if (this.f284577c.f284137d.get()) {
            i.mo92784f(this.f284575a.getResources().getString(R.string.rohan_hotword_screen_header_title_for_unicorn, new Object[]{this.f284578d.mo92329b(), this.f284579e.mo87230d()}));
            C102010e eVar = (C102010e) i;
            eVar.f284624b = C5114a.m13988b(Locale.getDefault(), this.f284575a.getResources().getString(R.string.rohan_hotword_screen_header_description_for_unicorn, new Object[]{this.f284578d.mo92329b(), this.f284579e.mo87230d(), this.f284579e.mo87230d(), this.f284578d.mo92329b()}), "GENDER", this.f284578d.mo92330c());
            C102012g c = C102013h.m168888c();
            c.mo92761c(this.f284575a.getResources().getString(R.string.rohan_hotword_screen_example_query_1_title));
            c.mo92760b(this.f284575a.getResources().getString(R.string.rohan_hotword_screen_example_query_1_subtitle_for_unicorn));
            C102013h a = c.mo92759a();
            C102012g c2 = C102013h.m168888c();
            c2.mo92761c(this.f284575a.getResources().getString(R.string.rohan_hotword_screen_example_query_2_title_for_unicorn));
            c2.mo92760b(this.f284575a.getResources().getString(R.string.rohan_hotword_screen_example_query_2_subtitle_for_unicorn));
            C102013h a2 = c2.mo92759a();
            C102012g c3 = C102013h.m168888c();
            c3.mo92761c(this.f284575a.getResources().getString(R.string.rohan_hotword_screen_example_query_3_title));
            c3.mo92760b(this.f284575a.getResources().getString(R.string.rohan_hotword_screen_example_query_3_subtitle_for_unicorn));
            i.mo92781c(C58485gu.m89848p(a, a2, c3.mo92759a()));
            eVar.f284626d = C5114a.m13988b(Locale.getDefault(), this.f284575a.getResources().getString(R.string.rohan_hotword_screen_footer_disclosure_for_unicorn, new Object[]{this.f284578d.mo92329b(), this.f284579e.mo87230d(), this.f284579e.mo87230d(), this.f284578d.mo92329b()}), "GENDER", this.f284578d.mo92330c());
        } else {
            i.mo92784f(this.f284575a.getResources().getString(R.string.rohan_hotword_screen_header_title, new Object[]{this.f284579e.mo87230d()}));
            i.mo92780b(this.f284575a.getResources().getString(R.string.rohan_hotword_screen_header_description, new Object[]{this.f284579e.mo87230d(), this.f284579e.mo87230d()}));
            C102012g c4 = C102013h.m168888c();
            c4.mo92761c(this.f284575a.getResources().getString(R.string.rohan_hotword_screen_example_query_1_title));
            c4.mo92760b(this.f284575a.getResources().getString(R.string.rohan_hotword_screen_example_query_1_subtitle));
            C102013h a3 = c4.mo92759a();
            C102012g c5 = C102013h.m168888c();
            c5.mo92761c(this.f284575a.getResources().getString(R.string.rohan_hotword_screen_example_query_2_title));
            c5.mo92760b(this.f284575a.getResources().getString(R.string.rohan_hotword_screen_example_query_2_subtitle));
            C102013h a4 = c5.mo92759a();
            C102012g c6 = C102013h.m168888c();
            c6.mo92761c(this.f284575a.getResources().getString(R.string.rohan_hotword_screen_example_query_3_title));
            c6.mo92760b(this.f284575a.getResources().getString(R.string.rohan_hotword_screen_example_query_3_subtitle));
            i.mo92781c(C58485gu.m89848p(a3, a4, c6.mo92759a()));
            ((C102010e) i).f284626d = this.f284575a.getResources().getString(R.string.rohan_hotword_screen_footer_disclosure, new Object[]{this.f284579e.mo87230d(), this.f284579e.mo87230d()});
        }
        C102007c cVar = new C102007c();
        cVar.f284619a = new C101997b();
        C102010e eVar2 = (C102010e) i;
        eVar2.f284625c = cVar.mo92773a();
        i.mo92783e(this.f284575a.getResources().getString(R.string.hotword_screen_accept_button_i_agree));
        i.mo92782d(this.f284575a.getResources().getString(true != this.f284576b.mo70887e().mo70853a().mo70877a() ? R.string.hotword_screen_cancel_button_no_thanks : R.string.hotword_screen_cancel_button_skip));
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
