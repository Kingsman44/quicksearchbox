package com.google.android.search.calypso;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.apps.gsa.shared.util.p7157a.C90716a;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class AppIndexingActivity extends Activity {
    /* renamed from: a */
    private final void m80567a(Intent intent) {
        if (!C90716a.m148161f(this, intent)) {
            Toast.makeText(getApplicationContext(), R.string.no_url_handler, 0).show();
        }
        finish();
    }

    public final void onCreate(Bundle bundle) {
        Intent intent = getIntent();
        super.onCreate(bundle);
        m80567a(intent);
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        m80567a(intent);
    }
}
