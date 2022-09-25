package com.google.android.libraries.search.assistant.performer.p2766i;

import android.accounts.Account;
import android.content.ContentResolver;
import android.os.Bundle;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.assistant.performer.i.ai */
/* compiled from: PG */
public final /* synthetic */ class C36130ai implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Account f94468a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f94469b;

    public /* synthetic */ C36130ai(Account account, Bundle bundle) {
        this.f94468a = account;
        this.f94469b = bundle;
    }

    public final Object call() {
        ContentResolver.requestSync(this.f94468a, "com.google.android.gms.reminders", this.f94469b);
        return C36180b.f94544a;
    }
}
