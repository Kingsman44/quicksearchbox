package com.google.android.apps.gsa.assistant.settings.p515c;

import android.accounts.Account;
import android.app.Activity;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.settings.shared.h;
import com.google.android.apps.gsa.assistant.shared.p5829r.C73906a;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86314e;
import com.google.android.apps.gsa.search.shared.p6930h.C87562e;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7129r.C90461c;
import com.google.android.apps.gsa.shared.p7129r.C90465g;
import com.google.android.apps.gsa.shared.p7148ui.p7154f.C90676a;
import com.google.android.apps.gsa.shared.p7148ui.p7155g.C90685b;
import com.google.android.apps.gsa.shared.util.p7184t.C91095e;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.assistant.settings.c.g */
/* compiled from: PG */
public final class C9522g implements C9521f {

    /* renamed from: a */
    public final C86124t f33004a;

    /* renamed from: b */
    public final C73906a f33005b;

    /* renamed from: c */
    public C86314e f33006c;

    /* renamed from: d */
    private final Activity f33007d;

    /* renamed from: e */
    private final C68214a f33008e;

    /* renamed from: f */
    private final C68214a f33009f;

    /* renamed from: g */
    private final C68214a f33010g;

    /* renamed from: h */
    private final C68214a f33011h;

    /* renamed from: i */
    private final C68214a f33012i;

    /* renamed from: j */
    private final C90465g f33013j;

    /* renamed from: k */
    private final boolean f33014k;

    /* renamed from: l */
    private final C91097g f33015l;

    public C9522g(boolean z, Activity activity, C86124t tVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C90465g gVar, C73906a aVar6, C91097g gVar2) {
        this.f33014k = z;
        this.f33007d = activity;
        this.f33004a = tVar;
        this.f33008e = aVar;
        this.f33009f = aVar2;
        this.f33010g = aVar3;
        this.f33011h = aVar4;
        this.f33012i = aVar5;
        this.f33013j = gVar;
        this.f33005b = aVar6;
        this.f33015l = gVar2;
    }

    /* renamed from: b */
    private final void m24147b(int i) {
        C90461c cVar = new C90461c();
        cVar.f252689a = null;
        cVar.f252693e = true != C90685b.m148054b(this.f33007d, (C90021c) null) ? "com.google.android.googlequicksearchbox.NEXUS_OPA_FEEDBACK" : "com.google.android.googlequicksearchbox.ANDROID_TABLET_OPA_FEEDBACK";
        cVar.f252690b = "assistant_settings_help_pixel";
        cVar.mo84198b("genie-eng:app_pkg_name", "com.google.android.googlequicksearchbox.assistant");
        cVar.f252691c = ((h) this.f33008e.mo27525b()).a();
        cVar.f252692d = C87562e.m142218a(this.f33007d, "assistant_settings_help_pixel");
        this.f33013j.mo84210a(this.f33007d).mo84209b(cVar, i);
    }

    /* renamed from: a */
    public final boolean mo17834a(int i) {
        if (i == 16908332) {
            this.f33007d.onBackPressed();
            return true;
        }
        Account a = ((h) this.f33008e.mo27525b()).a();
        if (i == R.id.assistant_settings_menu_my_activity) {
            C85929cw cwVar = (C85929cw) this.f33010g.mo27525b();
            C86314e eVar = new C86314e(this.f33007d, (C86054o) this.f33009f.mo27525b(), this.f33011h, "https://myactivity.google.com/product/assistant/embed?utm_source=opa&utm_medium=er&utm_campaign=", a);
            this.f33006c = eVar;
            eVar.mo80029b();
            return true;
        } else if (i == R.id.assistant_settings_menu_activity_controls) {
            String str = a != null ? a.name : BuildConfig.FLAVOR;
            C90676a aVar = (C90676a) this.f33012i.mo27525b();
            C90676a.m148044a(this.f33007d, str);
            return true;
        } else if (i == R.id.assistant_settings_menu_privacy_advisor) {
            C91097g gVar = this.f33015l;
            C18509a c = C18522b.m35986c();
            ((C18523c) c).f52492a = "privacy_advisor";
            c.mo24023e("settings_options_menu");
            gVar.mo65090b(c.mo24020b().mo24031a(), new C91095e());
            return true;
        } else if (i == R.id.opa_menu_help || i == R.id.assistant_settings_menu_help_and_feedback) {
            m24147b(0);
            return true;
        } else if (i == R.id.opa_menu_feedback) {
            if (!this.f33004a.mo79746e(C90014bt.f247760nI) || !this.f33014k) {
                m24147b(1);
            } else {
                this.f33007d.setResult(1);
                this.f33007d.finish();
            }
            return true;
        } else {
            if (i == R.id.opa_menu_transparency_disclosure) {
                this.f33007d.startActivity(C73906a.m108547b());
            }
            return false;
        }
    }
}
