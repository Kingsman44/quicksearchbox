package com.google.android.libraries.elements.p1714d.p1719e.p1720a.p1722b;

import com.google.android.libraries.elements.interfaces.CommandRunCompletionCallback;
import p5488io.grpc.Status;
import p5488io.p5490b.p5496d.C69821c;

/* renamed from: com.google.android.libraries.elements.d.e.a.b.b */
/* compiled from: PG */
public final /* synthetic */ class C20965b implements C69821c {

    /* renamed from: a */
    public final /* synthetic */ CommandRunCompletionCallback f58761a;

    public /* synthetic */ C20965b(CommandRunCompletionCallback commandRunCompletionCallback) {
        this.f58761a = commandRunCompletionCallback;
    }

    /* renamed from: a */
    public final void mo25818a(Object obj) {
        this.f58761a.completion(Status.m102100d((Throwable) obj));
    }
}
