package com.google.android.apps.gsa.staticplugins.settings;

import android.accounts.Account;
import android.app.ActionBar;
import android.content.Intent;
import android.databinding.C0118a;
import android.os.Bundle;
import androidx.core.p098j.C2069cc;
import com.google.android.apps.gsa.assist.p501a.C9325m;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28423g;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.p2186a.C28297a;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* compiled from: PG */
public final class AssistantAndroidSettingsActivity extends C117331v {

    /* renamed from: o */
    private static final C59071e f325599o = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.settings.AssistantAndroidSettingsActivity");

    /* renamed from: j */
    public C117311c f325600j;

    /* renamed from: k */
    public C28310af f325601k;

    /* renamed from: l */
    public C86054o f325602l;

    /* renamed from: m */
    public C9325m f325603m;

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C74504a.m120462a(f.aJ);
        super.onCreate(bundle);
        Account a = this.f325602l.mo79668a();
        C28423g c = a == null ? C28297a.m52923c() : C28297a.m52922b(a.name);
        C28313c a2 = this.f325601k.f76997b.mo33800a(C28427h.m53115a(85444));
        a2.mo33859g(c);
        a2.mo33859g(C28375ak.m53061c(85520));
        a2.mo33810c(this);
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        super.setContentView((int) R.layout.assistant_android_settings_activity);
        C2069cc.m5650a(getWindow(), false);
    }

    public final boolean onNavigateUp() {
        finish();
        return super.onNavigateUp();
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        if (!this.f325603m.mo17534a()) {
            this.f325600j.mo103255e();
            C0118a.m108p(f325599o.mo56226d(), "GSA is not current assistant, redirecting to settings dialog...", 32816, C58975e.f156826a, "AssistantSettings");
            Bundle bundle = new Bundle();
            bundle.putString(":settings:fragment_args_key", "default_assist");
            Intent intent = new Intent("android.settings.VOICE_INPUT_SETTINGS");
            intent.putExtra(":settings:show_fragment_args", bundle);
            if (!getPackageManager().queryIntentActivities(intent, C89885b.S3REQUEST_VALUE).isEmpty()) {
                startActivity(intent);
            }
            finish();
        }
    }
}
