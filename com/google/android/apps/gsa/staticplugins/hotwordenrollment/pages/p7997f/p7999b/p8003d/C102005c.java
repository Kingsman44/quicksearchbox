package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7997f.p7999b.p8003d;

import android.content.Context;
import com.android.p265e.C5114a;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.f.b.d.c */
/* compiled from: PG */
public final class C102005c implements C102019n {

    /* renamed from: a */
    private final Context f284606a;

    /* renamed from: b */
    private final C74555u f284607b;

    /* renamed from: c */
    private final C101860a f284608c;

    /* renamed from: d */
    private final C101497ae f284609d;

    /* renamed from: e */
    private final C92486a f284610e;

    /* renamed from: f */
    private final boolean f284611f;

    public C102005c(Context context, C74555u uVar, C101860a aVar, C101497ae aeVar, C92486a aVar2, boolean z) {
        this.f284606a = context;
        this.f284607b = uVar;
        this.f284608c = aVar;
        this.f284609d = aeVar;
        this.f284610e = aVar2;
        this.f284611f = z;
    }

    /* renamed from: a */
    public final C46851e mo92762a() {
        String str;
        String str2;
        String str3;
        String str4;
        C102017l i = C102018m.m168905i();
        if (this.f284608c.f284137d.get()) {
            str = this.f284606a.getResources().getString(R.string.wearos_hotword_screen_header_title_for_unicorn, new Object[]{this.f284609d.mo92329b(), this.f284610e.mo87230d()});
        } else {
            str = this.f284606a.getResources().getString(R.string.wearos_hotword_screen_header_title, new Object[]{this.f284610e.mo87230d()});
        }
        i.mo92784f(str);
        if (this.f284608c.f284137d.get()) {
            str2 = C5114a.m13988b(Locale.getDefault(), this.f284606a.getResources().getString(R.string.wearos_hotword_screen_header_description_for_unicorn, new Object[]{this.f284609d.mo92329b(), this.f284610e.mo87230d(), this.f284610e.mo87230d(), this.f284609d.mo92329b()}), "GENDER", this.f284609d.mo92330c());
        } else {
            str2 = this.f284606a.getResources().getString(R.string.wearos_hotword_screen_header_description, new Object[]{this.f284610e.mo87230d(), this.f284610e.mo87230d()});
        }
        i.mo92780b(str2);
        if (this.f284608c.f284137d.get()) {
            str3 = this.f284606a.getResources().getString(R.string.wearos_hotword_screen_misactivation_disclosure_for_unicorn, new Object[]{this.f284609d.mo92329b(), this.f284610e.mo87230d()});
        } else {
            str3 = this.f284606a.getResources().getString(R.string.wearos_hotword_screen_misactivation_disclosure, new Object[]{this.f284610e.mo87230d()});
        }
        if (this.f284607b.mo70887e().mo70853a().mo70879c()) {
            String valueOf = String.valueOf(str3);
            if (this.f284608c.f284137d.get()) {
                str4 = this.f284606a.getResources().getString(R.string.wearos_hotword_screen_battery_disclosure_for_unicorn, new Object[]{this.f284610e.mo87230d(), this.f284610e.mo87230d(), this.f284609d.mo92329b()});
            } else {
                str4 = this.f284606a.getResources().getString(R.string.wearos_hotword_screen_battery_disclosure, new Object[]{this.f284610e.mo87230d(), this.f284610e.mo87230d()});
            }
            str3 = valueOf + "\n\n" + str4;
        }
        C102010e eVar = (C102010e) i;
        eVar.f284626d = str3;
        i.mo92781c(C58485gu.m89845m());
        C102007c cVar = new C102007c();
        cVar.f284619a = new C102004b(this.f284611f);
        eVar.f284625c = cVar.mo92773a();
        i.mo92783e(this.f284606a.getResources().getString(R.string.hotword_screen_accept_button_i_agree));
        i.mo92782d(this.f284606a.getResources().getString(true != this.f284607b.mo70887e().mo70853a().mo70877a() ? R.string.hotword_screen_cancel_button_no_thanks : R.string.hotword_screen_cancel_button_skip));
        eVar.f284629g = true;
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
