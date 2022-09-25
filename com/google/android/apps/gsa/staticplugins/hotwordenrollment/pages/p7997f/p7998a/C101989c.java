package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7997f.p7998a;

import android.content.Context;
import com.android.p265e.C5114a;
import com.google.android.apps.gsa.h.s.z;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101497ae;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101860a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7997f.C102007c;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7997f.C102010e;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.f.a.c */
/* compiled from: PG */
public final class C101989c implements C102019n {

    /* renamed from: a */
    private final Context f284558a;

    /* renamed from: b */
    private final C74555u f284559b;

    /* renamed from: c */
    private final C101860a f284560c;

    /* renamed from: d */
    private final C101497ae f284561d;

    /* renamed from: e */
    private final boolean f284562e;

    public C101989c(Context context, C74555u uVar, C101860a aVar, C101497ae aeVar, boolean z) {
        this.f284558a = context;
        this.f284559b = uVar;
        this.f284560c = aVar;
        this.f284561d = aeVar;
        this.f284562e = z;
    }

    /* renamed from: a */
    public final C46851e mo92762a() {
        C102017l lVar;
        if (this.f284560c.f284134a.get()) {
            if (this.f284560c.f284137d.get()) {
                String string = this.f284558a.getResources().getString(R.string.home_hotword_screen_header_title_for_cloud_unicorn, new Object[]{this.f284561d.mo92329b()});
                String b = C5114a.m13988b(Locale.getDefault(), this.f284558a.getResources().getString(R.string.home_hotword_screen_header_description_for_cloud_unicorn, new Object[]{this.f284561d.mo92329b()}), "GENDER", this.f284561d.mo92330c());
                lVar = C102018m.m168905i();
                lVar.mo92784f(string);
                ((C102010e) lVar).f284624b = b;
            } else {
                String string2 = this.f284558a.getResources().getString(this.f284559b.mo70885c().mo70898b() == z.d ? R.string.home_hotword_screen_header_title_for_cloud_first : R.string.home_hotword_screen_header_title_for_cloud);
                String string3 = this.f284558a.getResources().getString(R.string.home_hotword_screen_header_description_for_cloud);
                lVar = C102018m.m168905i();
                lVar.mo92784f(string2);
                lVar.mo92780b(string3);
            }
        } else if (this.f284560c.f284137d.get()) {
            String string4 = this.f284558a.getResources().getString(R.string.home_hotword_screen_header_title_for_non_cloud_unicorn, new Object[]{this.f284561d.mo92329b()});
            String string5 = this.f284558a.getResources().getString(R.string.home_hotword_screen_header_description_for_non_cloud_unicorn, new Object[]{this.f284561d.mo92329b()});
            lVar = C102018m.m168905i();
            lVar.mo92784f(string4);
            lVar.mo92780b(string5);
        } else {
            String string6 = this.f284558a.getResources().getString(this.f284559b.mo70885c().mo70898b() == z.d ? R.string.home_hotword_screen_header_title_for_non_cloud_first : R.string.home_hotword_screen_header_title_for_non_cloud);
            String string7 = this.f284558a.getResources().getString(R.string.home_hotword_screen_header_description_for_non_cloud);
            lVar = C102018m.m168905i();
            lVar.mo92784f(string6);
            lVar.mo92780b(string7);
        }
        lVar.mo92781c(C58485gu.m89845m());
        C102007c cVar = new C102007c();
        cVar.f284619a = new C101988b(this.f284562e);
        C102010e eVar = (C102010e) lVar;
        eVar.f284625c = cVar.mo92773a();
        lVar.mo92783e(this.f284558a.getResources().getString(R.string.hotword_screen_accept_button_next));
        lVar.mo92782d(this.f284558a.getResources().getString(R.string.hotword_screen_cancel_button_cancel));
        eVar.f284629g = false;
        return new C102020o(C60856cj.m92900i(lVar.mo92779a()));
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
