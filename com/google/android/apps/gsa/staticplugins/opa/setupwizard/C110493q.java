package com.google.android.apps.gsa.staticplugins.opa.setupwizard;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.C73842bi;
import com.google.android.apps.gsa.assistant.shared.bg;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.apps.gsa.staticplugins.opa.util.C113760ac;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.p10905k.C146606e;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.setupwizard.q */
/* compiled from: PG */
public final class C110493q implements C73842bi {

    /* renamed from: a */
    private static final C59071e f308039a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.setupwizard.q");

    /* renamed from: b */
    private final Context f308040b;

    /* renamed from: c */
    private final C21370a f308041c;

    /* renamed from: d */
    private final C68214a f308042d;

    /* renamed from: e */
    private final C68214a f308043e;

    /* renamed from: f */
    private final C68214a f308044f;

    /* renamed from: g */
    private final C68214a f308045g;

    /* renamed from: h */
    private final C68214a f308046h;

    /* renamed from: i */
    private final C68214a f308047i;

    /* renamed from: j */
    private final C58881cr f308048j;

    /* renamed from: k */
    private final String f308049k;

    public C110493q(Context context, C21370a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7, String str) {
        this.f308040b = context;
        this.f308041c = aVar;
        this.f308046h = aVar2;
        this.f308047i = aVar3;
        this.f308042d = aVar4;
        this.f308043e = aVar5;
        this.f308044f = aVar6;
        this.f308048j = new C110492p(context);
        this.f308045g = aVar7;
        this.f308049k = str;
    }

    /* renamed from: b */
    public static boolean m184060b(Context context) {
        try {
            return C146606e.m238844f(context.getContentResolver(), "google_setup:enable_deferred_setup_suggestion", true) || C146606e.m238844f(context.getContentResolver(), "google_setup:enable_deferred_setup_notification", true);
        } catch (SecurityException e) {
            C59104x c = f308039a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "OpaDefSetupHlpr");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(26384)).mo56386p("Unable to check Gservices");
            return false;
        }
    }

    /* renamed from: c */
    private final void m184061c(Context context, String str, int i) {
        context.getPackageManager().setComponentEnabledSetting(new ComponentName(this.f308049k, str), i, 1);
    }

    /* renamed from: a */
    public final void mo65324a() {
        boolean booleanValue = Boolean.valueOf(m184060b(((C110492p) this.f308048j).f308038a)).booleanValue();
        boolean e = ((C86124t) this.f308042d.mo27525b()).mo79746e(C90014bt.f247526in);
        C58976aa aaVar = C58975e.f156826a;
        if (booleanValue && e && ((bm) this.f308045g.mo27525b()).u()) {
            if (!((SharedPreferences) this.f308047i.mo27525b()).contains("opa_deferred_setup_eligible")) {
                ((SharedPreferences) this.f308047i.mo27525b()).edit().putLong("opa_deferred_setup_eligible", Math.max(1, this.f308041c.mo26870b())).apply();
            }
            long j = ((SharedPreferences) this.f308047i.mo27525b()).getLong("opa_deferred_setup_eligible", 1);
            if (j != 0) {
                if (Math.max(1, this.f308041c.mo26870b() - j) / 3600000 >= ((C86124t) this.f308042d.mo27525b()).mo79743a(C90014bt.f247527io)) {
                    ((SharedPreferences) this.f308047i.mo27525b()).edit().putLong("opa_deferred_setup_eligible", 0).apply();
                    Context context = this.f308040b;
                    m184061c(context, "com.google.android.apps.gsa.staticplugins.opa.setupwizard.SetupWizardDeferredUdc", 0);
                    m184061c(context, "com.google.android.apps.gsa.staticplugins.opa.setupwizard.SetupWizardDeferredHotword", 0);
                    return;
                }
                boolean c = ((bg) this.f308043e.mo27525b()).c(((SharedPreferences) this.f308046h.mo27525b()).getString(C90507o.f253011a, BuildConfig.FLAVOR));
                boolean a = ((C113760ac) this.f308044f.mo27525b()).mo100604a();
                Context context2 = this.f308040b;
                int i = 2;
                m184061c(context2, "com.google.android.apps.gsa.staticplugins.opa.setupwizard.SetupWizardDeferredUdc", true != c ? 1 : 2);
                if (true != a) {
                    i = 1;
                }
                m184061c(context2, "com.google.android.apps.gsa.staticplugins.opa.setupwizard.SetupWizardDeferredHotword", i);
            }
        }
    }
}
