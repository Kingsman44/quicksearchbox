package com.google.android.apps.search.assistant.libraries.p8956c.p8957a;

import com.google.android.libraries.social.populous.android.C42181t;
import org.chromium.net.NetworkException;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.libraries.c.a.a */
/* compiled from: PG */
public final class C119255a {
    /* renamed from: a */
    public final Optional mo104261a(Throwable th) {
        if (th instanceof NetworkException) {
            NetworkException networkException = (NetworkException) th;
            C69664n.m101061g(networkException, C42181t.f110467a);
            Optional of = Optional.m71637of(new C119256b(networkException));
            C69664n.m101060f(of, "of(create(t))");
            return of;
        } else if (th != null) {
            return mo104261a(th.getCause());
        } else {
            Optional empty = Optional.empty();
            C69664n.m101060f(empty, "empty()");
            return empty;
        }
    }
}
