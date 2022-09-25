package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32602g;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32871q;
import com.google.protos.p5068j.p5069a.p5070a.p5111b.p5112a.p5113a.p5114a.p5115a.p5116a.C65570b;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.search.assistant.f.a.b.cd */
/* compiled from: PG */
public final class C32662cd {
    /* renamed from: a */
    public static final C32663ce m60549a(List list) {
        C69664n.m101061g(list, "tags");
        Status status = Status.f186916n;
        C69664n.m101060f(status, "UNAVAILABLE");
        return new C32663ce(list, status, C65570b.ERROR_ACCESS_SESSION_DISCONNECTED, "AccessSession disconnected", (Throwable) null);
    }

    /* renamed from: b */
    public static final C32663ce m60550b(List list, String str) {
        C69664n.m101061g(list, "tags");
        Status status = Status.f186915m;
        C69664n.m101060f(status, "INTERNAL");
        return new C32663ce(list, status, C65570b.ERROR_INTERNAL_ASSERTION_FAILED, str, (Throwable) null);
    }

    /* renamed from: c */
    public static final C32663ce m60551c(List list, C32871q qVar) {
        C69664n.m101061g(list, "tags");
        C69664n.m101061g(qVar, "strategy");
        Status status = Status.f186906d;
        C69664n.m101060f(status, "INVALID_ARGUMENT");
        C65570b bVar = C65570b.ERROR_INVALID_CACHING_STRATEGY;
        new StringBuilder("Invalid caching strategy in ContextFetchRequest: ").append(qVar);
        return new C32663ce(list, status, bVar, "Invalid caching strategy in ContextFetchRequest: ".concat(String.valueOf(qVar)), (Throwable) null);
    }

    /* renamed from: d */
    public static final C32663ce m60552d(List list, C65570b bVar, Throwable th) {
        C69664n.m101061g(list, "tags");
        Status status = Status.f186905c;
        C69664n.m101060f(status, "UNKNOWN");
        String message = th.getMessage();
        if (message == null) {
            message = "ContextAPI unknown error";
        }
        return new C32663ce(list, status, bVar, message, th);
    }

    /* renamed from: e */
    public static final C32663ce m60553e(List list) {
        C69664n.m101061g(list, "tags");
        Status status = Status.f186916n;
        C69664n.m101060f(status, "UNAVAILABLE");
        return new C32663ce(list, status, C65570b.ERROR_SESSION_CLOSED, "Session closed", (Throwable) null);
    }

    /* renamed from: f */
    public static final C32663ce m60554f(List list, C32796ar arVar) {
        C69664n.m101061g(list, "tags");
        C69664n.m101061g(arVar, "key");
        Status status = Status.f186906d;
        C69664n.m101060f(status, "INVALID_ARGUMENT");
        return new C32663ce(list, status, C65570b.ERROR_UNSUPPORTED_CONTEXT_KEY, "Unsupported ContextKey in ContextFetchRequest: ".concat(String.valueOf(C32602g.m60429b(arVar))), (Throwable) null);
    }
}
