package com.google.android.apps.gsa.soundsearchwidget;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.content.p090a.C1847b;
import androidx.core.content.p090a.C1848c;
import androidx.core.content.p090a.C1850e;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class AddShortcutActivity extends Activity {
    public final void onCreate(Bundle bundle) {
        C74504a.m120462a(f.M);
        super.onCreate(bundle);
        C1848c cVar = new C1848c();
        cVar.f5711a = this;
        cVar.f5712b = "com.google.android.apps.gsa.soundsearchwidget";
        cVar.f5716f = IconCompat.m5206i(this, R.drawable.ic_soundsearch_selector);
        C1847b.m5066b(new Intent("com.google.android.googlequicksearchbox.MUSIC_SEARCH"), cVar);
        cVar.f5714d = getString(R.string.soundsearch_widget_name);
        setResult(-1, C1850e.m5068a(this, C1847b.m5065a(cVar)));
        finish();
    }
}
