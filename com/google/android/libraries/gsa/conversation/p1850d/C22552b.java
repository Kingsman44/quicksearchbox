package com.google.android.libraries.gsa.conversation.p1850d;

import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.libraries.gsa.conversation.d.b */
/* compiled from: PG */
public final /* synthetic */ class C22552b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ SettableFuture f62163a;

    /* renamed from: b */
    public final /* synthetic */ String f62164b;

    /* renamed from: c */
    public final /* synthetic */ long f62165c;

    public /* synthetic */ C22552b(SettableFuture settableFuture, String str, long j) {
        this.f62163a = settableFuture;
        this.f62164b = str;
        this.f62165c = j;
    }

    public final void run() {
        SettableFuture settableFuture = this.f62163a;
        String str = this.f62164b;
        long j = this.f62165c;
        C59071e eVar = C22559i.f62180a;
        if (!settableFuture.isDone()) {
            settableFuture.mo57357o(new TimeoutException(str + " after " + j + "ms"));
        }
    }
}
