package com.google.android.apps.gsa.assistant.settings.features.car;

import android.content.Intent;
import android.view.View;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.util.p7184t.C91095e;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.car.p */
/* compiled from: PG */
public final /* synthetic */ class C73057p implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C73058r f193739a;

    public /* synthetic */ C73057p(C73058r rVar) {
        this.f193739a = rVar;
    }

    public final void onClick(View view) {
        C73058r rVar = this.f193739a;
        rVar.f193755j.mo83702b(C89849ae.OPA_SETTINGS_CAR_SETUP_SUCCESS);
        C18509a c = C18522b.m35986c();
        ((C18523c) c).f52492a = "device_hub";
        Intent a = c.mo24020b().mo24031a();
        C91097g f = rVar.mo17793f();
        if (f != null) {
            f.mo65090b(a, new C91095e());
        }
        rVar.mo17798i();
    }
}
