package com.google.android.apps.gsa.staticplugins.backredirect.activity;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.h.g.e;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.shared.util.C90734ar;
import com.google.android.apps.p489g.p494d.C9141ad;

/* compiled from: PG */
public class BackRedirectActivity extends C94455b {

    /* renamed from: a */
    public C94456c f264050a;

    /* renamed from: b */
    private boolean f264051b = false;

    public final void onCreate(Bundle bundle) {
        Bundle extras;
        C9141ad adVar;
        C74504a.m120462a(f.P);
        super.onCreate(bundle);
        if (bundle == null && (extras = getIntent().getExtras()) != null && (adVar = (C9141ad) C90734ar.m148199b(extras, "com.google.android.apps.gsa.staticplugins.backredirect.activity.BackRedirectActivity", C9141ad.f31521K.getParserForType())) != null) {
            this.f264050a.mo88477a(adVar);
        }
    }

    public final void onResume() {
        super.onResume();
        if (this.f264051b) {
            startActivity(new Intent().setClassName(this, e.b()).setAction("android.intent.action.ASSIST"));
            finish();
        }
        this.f264051b = true;
    }
}
