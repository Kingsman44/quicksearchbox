package com.google.android.apps.gsa.staticplugins.bisto.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* compiled from: PG */
public class IntentLauncherActivity extends Activity {

    /* renamed from: a */
    private static final C59071e f269805a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.util.IntentLauncherActivity");

    /* renamed from: a */
    static boolean m159794a(Intent intent, Context context) {
        return intent.resolveActivity(context.getPackageManager()) != null;
    }

    public final void onCreate(Bundle bundle) {
        C74504a.m120462a(f.S);
        super.onCreate(bundle);
        Intent intent = (Intent) getIntent().getParcelableExtra("EXTRA_INTENT");
        if (intent == null) {
            C59104x c = f269805a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "IntentLauncherActivity");
            ((C59052c) ((C59052c) c).mo56372aa(17147)).mo56386p("Unable to launch activity; provided intent is null");
        } else if (!m159794a(intent, this)) {
            C59104x c2 = f269805a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "IntentLauncherActivity");
            ((C59052c) ((C59052c) c2).mo56372aa(17146)).mo56389s("Cannot start activity: %s", intent);
        } else {
            C59104x c3 = f269805a.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "IntentLauncherActivity");
            ((C59052c) ((C59052c) c3).mo56372aa(17145)).mo56389s("Launching activity: %s", intent);
            if (getIntent().getBooleanExtra("EXTRA_START_ACTIVITY_FOR_RESULT", false)) {
                startActivityForResult(intent, 0);
            } else {
                startActivity(intent);
            }
        }
        finish();
    }
}
