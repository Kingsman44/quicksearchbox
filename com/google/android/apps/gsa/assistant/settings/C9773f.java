package com.google.android.apps.gsa.assistant.settings;

import android.content.ComponentName;
import android.content.Intent;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.widget.ProgressBar;
import com.google.android.apps.gsa.assistant.settings.shared.g.d;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90088em;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.assistant.settings.f */
/* compiled from: PG */
final class C9773f implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ g f33743a;

    public C9773f(g gVar) {
        this.f33743a = gVar;
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [com.google.android.apps.gsa.assistant.settings.AssistantSettingsActivity, android.app.Activity] */
    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        g gVar = this.f33743a;
        C59104x c = g.a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "ASAPeer");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(301)).mo56386p("onStartupFailure");
        ((C89859i) gVar.i.mo27525b()).mo83702b(C89849ae.OPA_SETTINGS_STARTUP_NETWORK_ERROR);
        if (!gVar.t) {
            d.a(gVar.b, new C9733e(gVar));
        }
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [android.support.v4.app.am, com.google.android.apps.gsa.assistant.settings.AssistantSettingsActivity] */
    /* JADX WARNING: type inference failed for: r10v14, types: [android.support.v4.app.am, com.google.android.apps.gsa.assistant.settings.AssistantSettingsActivity] */
    /* JADX WARNING: type inference failed for: r1v37, types: [com.google.android.apps.gsa.assistant.settings.AssistantSettingsActivity, android.app.Activity] */
    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C73795v vVar = (C73795v) obj;
        g gVar = this.f33743a;
        C58976aa aaVar = C58975e.f156826a;
        if (!gVar.t) {
            ProgressBar progressBar = gVar.p;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            if (gVar.d.mo79746e(C90088em.f250535b)) {
                C28306ab abVar = gVar.k.f76997b;
                C28306ab.m52930f(gVar.b);
            }
            gVar.a();
            int a = vVar.mo65272a();
            int i = a - 1;
            if (a == 0) {
                throw null;
            } else if (i == 0) {
                try {
                    if (!gVar.n.mo64555i()) {
                        Fragment fragment = (Fragment) gVar.n.mo64552f().get();
                        gVar.c();
                        C0154a aVar = new C0154a(gVar.b.f727a.f739a.f744e);
                        int i2 = gVar.x;
                        int i3 = i2 - 1;
                        if (i2 != 0) {
                            aVar.mo689v((i3 == 1 || i3 == 2) ? R.id.assistant_settings_activity_container : 16908290, fragment, (String) null);
                            aVar.mo505b(true);
                            gVar.b.f727a.f739a.f744e.mo467ah();
                            ((C89859i) gVar.i.mo27525b()).mo83702b(C89849ae.OPA_SETTINGS_STARTUP_SUCCESS);
                            return;
                        }
                        throw null;
                    } else if (gVar.c.mo65233b() == 1) {
                        Intent putExtras = new Intent().setComponent(new ComponentName(gVar.o, "com.google.android.apps.search.assistant.surfaces.settings.deeplink.SettingsDeeplink")).putExtras(gVar.b.getIntent());
                        ((C89859i) gVar.i.mo27525b()).mo83702b(C89849ae.OPA_SETTINGS_STARTUP_REDIRECT_TNG);
                        gVar.l.mo65090b(putExtras, new C9524d(gVar));
                    } else {
                        C59104x c = g.a.mo56225c();
                        c.mo56378ag(C58975e.f156826a, "ASAPeer");
                        ((C59052c) ((C59052c) c).mo56372aa(295)).mo56386p("handleStartupResult: failed to open page from tng settings");
                        ((C89859i) gVar.i.mo27525b()).mo83702b(C89849ae.OPA_SETTINGS_STARTUP_REDIRECT_TNG_FAILED);
                        gVar.b.setResult(0);
                        gVar.b.finish();
                    }
                } catch (Exception e) {
                    C59104x c2 = g.a.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "ASAPeer");
                    ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(294)).mo56386p("Failed to show Settings fragment");
                    ((C89859i) gVar.i.mo27525b()).mo83702b(C89849ae.OPA_SETTINGS_STARTUP_FRAGMENT_FAILED_TO_START);
                    gVar.b.setResult(0);
                    gVar.b.finish();
                }
            } else if (i == 1) {
                C59104x c3 = g.a.mo56225c();
                c3.mo56378ag(C58975e.f156826a, "ASAPeer");
                ((C59052c) ((C59052c) c3).mo56372aa(297)).mo56389s("Failed to show Settings fragment: result = %s", vVar);
                ((C89859i) gVar.i.mo27525b()).mo83702b(C89849ae.OPA_SETTINGS_STARTUP_UNAUTHORIZED);
                gVar.b.setResult(0);
                gVar.b.finish();
            } else if (i == 2) {
                C59104x c4 = g.a.mo56225c();
                c4.mo56378ag(C58975e.f156826a, "ASAPeer");
                ((C59052c) ((C59052c) c4).mo56372aa(298)).mo56389s("Failed to show Settings fragment: result = %s", vVar);
                ((C89859i) gVar.i.mo27525b()).mo83702b(C89849ae.OPA_SETTINGS_STARTUP_INVALID_ACCOUNT);
                gVar.b.setResult(0);
                gVar.b.finish();
            } else if (i == 3) {
                ((C89859i) gVar.i.mo27525b()).mo83702b(C89849ae.OPA_SETTINGS_STARTUP_REDIRECT_ONBOARDING);
                gVar.b.startActivityForResult(vVar.mo65185b(), 1);
            }
        }
    }
}
