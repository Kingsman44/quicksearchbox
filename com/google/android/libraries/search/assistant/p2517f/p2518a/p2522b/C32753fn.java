package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71604be;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.f.a.b.fn */
/* compiled from: PG */
public final class C32753fn implements C32682cx {

    /* renamed from: a */
    public final C71604be f87885a;

    public /* synthetic */ C32753fn(C71604be beVar) {
        this.f87885a = beVar;
    }

    /* renamed from: a */
    public final Object mo38242a() {
        return this.f87885a.mo62826f();
    }

    /* renamed from: b */
    public final String mo38243b() {
        return C32692dg.m60596b(this.f87885a);
    }

    /* renamed from: c */
    public final void mo38244c() {
        this.f87885a.mo62723u((CancellationException) null);
    }

    /* renamed from: d */
    public final boolean mo38245d() {
        return this.f87885a.mo62868mk();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C32753fn) && C69664n.m101066l(this.f87885a, ((C32753fn) obj).f87885a);
    }

    public final int hashCode() {
        return this.f87885a.hashCode();
    }

    public final String toString() {
        C71604be beVar = this.f87885a;
        return "WrappedDeferred(impl=" + beVar + ")";
    }
}
