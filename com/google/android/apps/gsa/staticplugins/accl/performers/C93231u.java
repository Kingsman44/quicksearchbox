package com.google.android.apps.gsa.staticplugins.accl.performers;

import android.accounts.Account;
import android.content.ContentResolver;
import android.os.Bundle;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.p3924c.C51747r;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.u */
/* compiled from: PG */
public final class C93231u extends C22538o {
    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        if (dyVar.f135936b.equals("calendar.FORCE_SYNC_CALENDAR")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            Bundle bundle = new Bundle(3);
            bundle.putBoolean("ignore_settings", true);
            bundle.putBoolean("expedited", true);
            bundle.putBoolean("ignore_backoff", true);
            ContentResolver.requestSync(new Account(((C51747r) m41992m(dwVar, "force_sync_calendar_args", C51747r.f135758b.getParserForType())).f135760a, "com.google"), "com.android.calendar", bundle);
            return C22538o.f62144n;
        }
        throw new C22428d(dyVar);
    }
}
