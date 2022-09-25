package com.google.android.apps.gsa.staticplugins.opa.morris2.framework.controllers.features;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;

/* compiled from: PG */
public final class AssistantSettingsIntentLauncherActivity extends Activity {
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        Intent intent;
        C74504a.m120462a(f.av);
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras == null || extras.getString("screenKey") == null) {
            finish();
            return;
        }
        String string = extras.getString("screenKey");
        if ("driving".equals(string)) {
            C18509a c = C18522b.m35986c();
            ((C18523c) c).f52492a = "driving";
            intent = c.mo24020b().mo24031a();
        } else if ("privacy".equals(string)) {
            Intent putExtra = new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.screenId", 10004);
            String string2 = extras.getString("accountKey");
            if (string2 != null) {
                putExtra.putExtra("extra.accountName", string2);
            }
            intent = putExtra;
        } else {
            intent = null;
        }
        if (intent != null) {
            startActivityForResult(intent, 0);
        }
        finish();
    }
}
