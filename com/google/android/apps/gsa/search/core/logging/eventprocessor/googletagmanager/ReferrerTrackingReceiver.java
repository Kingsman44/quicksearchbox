package com.google.android.apps.gsa.search.core.logging.eventprocessor.googletagmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;

/* compiled from: PG */
public final class ReferrerTrackingReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        String stringExtra;
        C74507e.m120467c(21);
        if (intent != null && intent.getAction() != null && TextUtils.equals(intent.getAction(), "com.android.vending.INSTALL_REFERRER") && (stringExtra = intent.getStringExtra("referrer")) != null) {
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 610;
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            ufVar2.f164250e |= 1048576;
            ufVar2.f164102aI = stringExtra;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        }
    }
}
