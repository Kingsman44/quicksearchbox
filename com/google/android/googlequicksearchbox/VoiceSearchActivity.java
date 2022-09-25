package com.google.android.googlequicksearchbox;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a;

/* compiled from: PG */
public class VoiceSearchActivity extends Activity {
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C74504a.m120462a(f.aZ);
        super.onCreate(bundle);
        startActivity(C89429a.m145440B(this, "and.gsa.voice.search.icon").putExtra("com.google.android.googlequicksearchbox.extra.start_activity_elapsed_realtime_millis", SystemClock.elapsedRealtime()));
        finish();
    }
}
