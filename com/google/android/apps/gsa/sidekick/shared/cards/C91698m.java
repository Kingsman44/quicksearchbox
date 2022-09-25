package com.google.android.apps.gsa.sidekick.shared.cards;

import android.widget.Toast;
import com.google.android.apps.gsa.shared.util.C91043j;
import com.google.android.googlequicksearchbox.R;
import com.google.p375ai.p378b.C7642eo;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.cards.m */
/* compiled from: PG */
public final class C91698m implements C91043j {

    /* renamed from: a */
    final /* synthetic */ C91702q f255785a;

    public C91698m(C91702q qVar) {
        this.f255785a = qVar;
    }

    /* renamed from: b */
    public final void mo17709a(Boolean bool) {
        if (bool == null || !bool.booleanValue()) {
            Toast.makeText(this.f255785a.f255778a, R.string.setting_history_save_failed_toast, 0).show();
            return;
        }
        this.f255785a.f255779b.mo86165e().mo86208b(C7642eo.OPTIN_REFRESH);
        Toast.makeText(this.f255785a.f255778a, R.string.enable_web_history_toast, 0).show();
    }
}
