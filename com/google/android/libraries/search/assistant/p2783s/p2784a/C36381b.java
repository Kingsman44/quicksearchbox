package com.google.android.libraries.search.assistant.p2783s.p2784a;

import com.google.android.libraries.search.assistant.p2705n.C34819a;
import com.google.android.libraries.search.assistant.p2705n.p2706a.C34820a;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.search.assistant.s.a.b */
/* compiled from: PG */
public final class C36381b extends Exception implements C34820a {

    /* renamed from: a */
    public final Throwable f94995a;

    /* renamed from: b */
    public final C34819a f94996b;

    public C36381b(Throwable th, C34819a aVar) {
        super(th);
        this.f94995a = th;
        this.f94996b = aVar;
    }

    /* renamed from: a */
    public final C34819a mo23265a() {
        return this.f94996b;
    }

    /* renamed from: b */
    public final boolean mo40149b() {
        Throwable th = this.f94995a;
        if (!(th instanceof C70761fa)) {
            return false;
        }
        if (((C70761fa) th).f188571a.getCode() == Status.Code.UNAUTHENTICATED || ((C70761fa) this.f94995a).f188571a.getCode() == Status.Code.INVALID_ARGUMENT) {
            return true;
        }
        return false;
    }

    public final Throwable getCause() {
        return this.f94995a;
    }
}
