package com.google.android.apps.gsa.staticplugins.nga.p8092ui.account;

import android.app.KeyguardManager;
import android.os.Bundle;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.account.p8094a.C104140a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.ui.account.PrimaryAccountFixActivity */
/* compiled from: PG */
public class PrimaryAccountFixActivity extends C104142b {

    /* renamed from: k */
    public static final C59071e f289688k = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nga.ui.account.PrimaryAccountFixActivity");

    /* renamed from: l */
    public C22871g f289689l;

    /* renamed from: m */
    public C89994f f289690m;

    /* renamed from: n */
    public C104140a f289691n;

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C74504a.m120462a(f.ag);
        super.onCreate(bundle);
        C59071e eVar = f289688k;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(21827)).mo56386p("#onCreate.");
        getWindow().addFlags(524288);
        KeyguardManager keyguardManager = (KeyguardManager) getSystemService(KeyguardManager.class);
        if (keyguardManager == null || !keyguardManager.isKeyguardLocked()) {
            mo93962w();
            finish();
            return;
        }
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(21829)).mo56386p("Calling requestDismissKeyguard.");
        keyguardManager.requestDismissKeyguard(this, new C104145e(this));
    }

    /* renamed from: w */
    public final void mo93962w() {
        C22871g gVar = this.f289689l;
        gVar.mo28211k(this.f289689l.mo28210j(gVar.mo28201a("[NGA] PrimaryAccountFixActivity.account", new C104143c(this)), "[NGA] PrimaryAccountFixActivity.tokenDetails", new C104144d(this)), "[NGA] tryLaunchAccountRecoveryActivity", new C104146f(this));
    }
}
