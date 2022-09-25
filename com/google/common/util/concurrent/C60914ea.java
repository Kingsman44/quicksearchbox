package com.google.common.util.concurrent;

import java.util.concurrent.Callable;

/* renamed from: com.google.common.util.concurrent.ea */
/* compiled from: PG */
final class C60914ea extends C60869cw {

    /* renamed from: a */
    final /* synthetic */ C60915eb f165029a;

    /* renamed from: b */
    private final Callable f165030b;

    public C60914ea(C60915eb ebVar, Callable callable) {
        this.f165029a = ebVar;
        callable.getClass();
        this.f165030b = callable;
    }

    /* renamed from: a */
    public final Object mo57287a() {
        return this.f165030b.call();
    }

    /* renamed from: b */
    public final String mo57288b() {
        return this.f165030b.toString();
    }

    /* renamed from: d */
    public final void mo57290d(Throwable th) {
        this.f165029a.mo57357o(th);
    }

    /* renamed from: e */
    public final void mo57291e(Object obj) {
        this.f165029a.mo57356n(obj);
    }

    /* renamed from: g */
    public final boolean mo57293g() {
        return this.f165029a.isDone();
    }
}
