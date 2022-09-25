package com.google.android.apps.gsa.assistant.handoff;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;

/* compiled from: PG */
public class BrowserReturnActivity extends Activity {
    public final void onCreate(Bundle bundle) {
        C74504a.m120462a(f.d);
        super.onCreate(bundle);
        Uri data = getIntent().getData();
        if (!C9450ag.m23977c(data)) {
            finish();
            return;
        }
        Intent intent = new Intent(this, BrowserControlActivity.class);
        intent.setData(data);
        startActivity(intent);
        finish();
    }
}
