package com.google.android.libraries.search.assistant.performer.p2766i;

import android.accounts.Account;
import android.content.ContentResolver;
import android.os.Bundle;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.assistant.p3897e.p3921j.p3924c.C51747r;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.assistant.performer.i.aa */
/* compiled from: PG */
public final /* synthetic */ class C36122aa implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C51747r f94459a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f94460b;

    public /* synthetic */ C36122aa(C51747r rVar, Bundle bundle) {
        this.f94459a = rVar;
        this.f94460b = bundle;
    }

    public final Object call() {
        C51747r rVar = this.f94459a;
        ContentResolver.requestSync(new Account(rVar.f135760a, "com.google"), "com.android.calendar", this.f94460b);
        return C36180b.f94544a;
    }
}
