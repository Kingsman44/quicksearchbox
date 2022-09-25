package com.google.android.libraries.search.assistant.performer.p2766i;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36183e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3899b.p3900a.C50873b;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;

/* renamed from: com.google.android.libraries.search.assistant.performer.i.aj */
/* compiled from: PG */
public final class C36131aj implements C35472h {

    /* renamed from: a */
    private final C60887da f94470a;

    public C36131aj(C60887da daVar) {
        this.f94470a = daVar;
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        C36183e.m64586d(dyVar, "reminder.SYNC_CLIENT");
        C50873b bVar = (C50873b) C36183e.m64584b(dyVar, "client_sync_args", C50873b.f132459b.getParserForType());
        if (!bVar.f132461a.isEmpty()) {
            Account account = new Account(bVar.f132461a, "com.google");
            Bundle bundle = new Bundle();
            bundle.putBoolean("expedited", true);
            bundle.putBoolean("force", true);
            bundle.putString("feed", "reminders-android");
            C36130ai aiVar = new C36130ai(account, bundle);
            return C60856cj.m92904m(C47810es.m84978r(aiVar), this.f94470a);
        }
        throw new C35471g("E-mail ID is an empty string");
    }
}
