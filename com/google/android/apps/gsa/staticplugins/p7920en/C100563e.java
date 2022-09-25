package com.google.android.apps.gsa.staticplugins.p7920en;

import android.app.AlertDialog;
import android.os.Bundle;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1646ay.C19600b;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.en.e */
/* compiled from: PG */
public final class C100563e extends C19600b {

    /* renamed from: a */
    final C86338r f281155a;

    /* renamed from: b */
    private AlertDialog f281156b;

    public C100563e(C86338r rVar) {
        this.f281155a = rVar;
    }

    /* renamed from: b */
    public final void mo24895b(Bundle bundle) {
        C74504a.m120462a(f.bj);
        this.f54539k.setTheme(2132150887);
        this.f54539k.mo24861h(bundle);
        if (C100564f.m166672e(this.f281155a)) {
            this.f54539k.mo24855e();
            return;
        }
        AlertDialog create = new AlertDialog.Builder(this.f54539k).setTitle(R.string.vehicle_integration_confirmation_dialog_title).setMessage(R.string.vehicle_integration_confirmation_dialog_message).setPositiveButton(17039370, new C100562d(this)).setNegativeButton(17039360, new C100561c(this)).setCancelable(false).create();
        this.f281156b = create;
        create.show();
    }

    /* renamed from: g */
    public final void mo24900g() {
        AlertDialog alertDialog = this.f281156b;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.f281156b.dismiss();
        }
        this.f54539k.mo24862i();
    }

    /* renamed from: h */
    public final void mo91968h(boolean z) {
        if (z) {
            C100564f.m166673f(this.f281155a);
        }
        C86338r rVar = this.f281155a;
        C59071e eVar = C100564f.f281157a;
        C86337q b = rVar.mo80076b();
        b.mo80067b("vic_integration_allowed", z);
        b.commit();
        C86337q b2 = this.f281155a.mo80076b();
        b2.mo80067b("vic_dialog_presented", true);
        b2.commit();
        this.f54539k.mo24855e();
    }
}
