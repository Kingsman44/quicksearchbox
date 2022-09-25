package com.google.android.libraries.gsa.conversation.clientop.p1846f;

import android.accounts.Account;
import android.content.ContentResolver;
import android.os.Bundle;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22534k;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.assistant.p3897e.p3899b.p3900a.C50873b;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.f.af */
/* compiled from: PG */
public final class C22465af extends C22538o {
    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        if (dyVar.f135936b.equals("reminder.SYNC_CLIENT")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C50873b bVar = (C50873b) m41992m(dwVar, "client_sync_args", C50873b.f132459b.getParserForType());
            if (!bVar.f132461a.isEmpty()) {
                Account account = new Account(bVar.f132461a, "com.google");
                Bundle bundle = new Bundle();
                bundle.putBoolean("expedited", true);
                bundle.putBoolean("force", true);
                bundle.putString("feed", "reminders-android");
                ContentResolver.requestSync(account, "com.google.android.gms.reminders", bundle);
                return C60856cj.m92900i(C22402a.f61893a);
            }
            throw new C22534k();
        }
        throw new C22428d(dyVar);
    }
}
