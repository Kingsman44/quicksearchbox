package com.google.android.apps.gsa.staticplugins.opa.smartspace.oobe;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0167am;
import android.support.p033v7.app.C0395p;
import com.google.android.apps.gsa.binaries.satin.app.aqy;
import com.google.android.apps.gsa.binaries.satin.app.ast;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.oobe.C110855k;
import com.google.apps.tiktok.inject.C47266f;
import dagger.p5294a.C68225k;

/* compiled from: PG */
public class SmartspaceWidgetConfigActivity extends C0395p {

    /* renamed from: j */
    public C86124t f308827j;

    /* renamed from: k */
    public C86127w f308828k;

    /* renamed from: l */
    private int f308829l = 0;

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C74504a.m120462a(f.aD);
        super.onCreate(bundle);
        C110855k kVar = new C110855k(this);
        if (kVar.f308849b == null) {
            ((C110855k.C110856a) C47266f.m84076a(kVar.f308848a, C110855k.C110856a.class)).mo98903qL(kVar);
        }
        ast ast = kVar.f308849b;
        ast.f203981b = this;
        ast.f203982c = this;
        ast.f203983d = this;
        C68225k.m98529a(ast.f203981b, Context.class);
        C68225k.m98529a(ast.f203982c, C0395p.class);
        C68225k.m98529a(ast.f203983d, C0167am.class);
        aqy aqy = ast.f203980a;
        this.f308827j = (C86124t) aqy.a.f202006C.mo17428b();
        this.f308828k = (C86127w) aqy.a.f203497r.mo17428b();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f308829l = extras.getInt("appWidgetId", 0);
        }
        if (this.f308829l != 0) {
            Intent intent = new Intent();
            intent.putExtra("appWidgetId", this.f308829l);
            setResult(-1, intent);
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        super.onDestroy();
        C86338r a = this.f308828k.f232790a.mo79722a();
        if (this.f308827j.mo79746e(C90017bw.f247899aN) && !a.getBoolean("smartspace_oobe_dismissed", false)) {
            Intent intent = new Intent();
            intent.setClassName(this, "com.google.android.apps.gsa.staticplugins.opa.smartspace.oobe.SmartspaceOOBEActivity");
            startActivity(intent);
        }
    }
}
