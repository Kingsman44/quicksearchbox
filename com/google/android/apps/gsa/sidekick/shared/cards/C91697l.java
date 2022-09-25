package com.google.android.apps.gsa.sidekick.shared.cards;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.google.android.apps.gsa.shared.util.p7184t.C91096f;
import com.google.android.googlequicksearchbox.R;
import com.google.p375ai.p378b.C7642eo;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.cards.l */
/* compiled from: PG */
final class C91697l implements C91096f {

    /* renamed from: a */
    final /* synthetic */ C91702q f255784a;

    public C91697l(C91702q qVar) {
        this.f255784a = qVar;
    }

    /* renamed from: hg */
    public final boolean mo17703hg(int i, Intent intent, Context context) {
        if (i == -1 && intent != null) {
            this.f255784a.f255779b.mo86165e().mo86208b(C7642eo.OPTIN_REFRESH);
            int intExtra = intent.getIntExtra("opt_in_result", -1);
            if (!(intExtra == 0 || intExtra == 3)) {
                Toast.makeText(this.f255784a.f255778a, R.string.setting_history_save_failed_toast, 0).show();
            }
        }
        return false;
    }
}
