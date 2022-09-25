package com.google.android.apps.gsa.nga.shared.android;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;

/* compiled from: PG */
public class IntentLauncherActivity extends Activity {

    /* renamed from: a */
    private static final C58974d f221914a = C58974d.m91136j();

    /* renamed from: a */
    public static boolean m128791a(Context context, Intent intent, boolean z, Bundle bundle) {
        if (!m128792b(intent, context)) {
            return false;
        }
        Intent addFlags = new Intent().putExtra("EXTRA_INTENT", intent).putExtra("EXTRA_START_ACTIVITY_FOR_RESULT", z).setClass(context, IntentLauncherActivity.class).addFlags(32768).addFlags(268435456);
        if (bundle == null) {
            context.startActivity(addFlags);
            return true;
        }
        context.startActivity(addFlags, bundle);
        return true;
    }

    /* renamed from: b */
    private static boolean m128792b(Intent intent, Context context) {
        return intent.resolveActivity(context.getPackageManager()) != null;
    }

    public final void onCreate(Bundle bundle) {
        C74504a.m120462a(f.A);
        super.onCreate(bundle);
        Intent intent = (Intent) getIntent().getParcelableExtra("EXTRA_INTENT");
        if (intent == null || intent.getBooleanExtra("EXTRA_DISMISS_KEYGUARD", true)) {
            KeyguardManager keyguardManager = (KeyguardManager) getSystemService(KeyguardManager.class);
            if (keyguardManager.isKeyguardLocked()) {
                keyguardManager.requestDismissKeyguard(this, (KeyguardManager.KeyguardDismissCallback) null);
            }
        }
        if (intent == null) {
            ((C58970a) ((C58970a) f221914a.mo56225c()).mo56372aa(5792)).mo56386p("Unable to launch activity; provided intent is null");
        } else if (!m128792b(intent, this)) {
            ((C58970a) ((C58970a) f221914a.mo56225c()).mo56372aa(5791)).mo56389s("Cannot start activity: %s", intent);
        } else {
            ((C58970a) ((C58970a) f221914a.mo56225c()).mo56372aa(5790)).mo56389s("Launching activity: %s", intent);
            if (getIntent().getBooleanExtra("EXTRA_START_ACTIVITY_FOR_RESULT", false)) {
                startActivityForResult(intent, 0);
            } else {
                startActivity(intent);
            }
        }
        finish();
    }
}
