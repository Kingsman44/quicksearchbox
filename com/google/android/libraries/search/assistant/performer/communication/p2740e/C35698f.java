package com.google.android.libraries.search.assistant.performer.communication.p2740e;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.e.f */
/* compiled from: PG */
public final /* synthetic */ class C35698f implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C35701i f93593a;

    public /* synthetic */ C35698f(C35701i iVar) {
        this.f93593a = iVar;
    }

    public final Object call() {
        this.f93593a.mo39808b(new TimeoutException("Timeout while waiting for sms status"));
        return null;
    }
}
