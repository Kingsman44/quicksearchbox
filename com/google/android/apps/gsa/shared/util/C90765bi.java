package com.google.android.apps.gsa.shared.util;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.shared.util.bi */
/* compiled from: PG */
final class C90765bi implements InvocationHandler {

    /* renamed from: a */
    final /* synthetic */ Object f253853a;

    /* renamed from: b */
    final /* synthetic */ Class f253854b;

    /* renamed from: c */
    final /* synthetic */ C22871g f253855c;

    public C90765bi(Object obj, Class cls, C22871g gVar) {
        this.f253853a = obj;
        this.f253854b = cls;
        this.f253855c = gVar;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        C90767bk bkVar = new C90767bk(this.f253853a, method, objArr, this.f253854b);
        Objects.requireNonNull(bkVar);
        this.f253855c.mo28212l("Thread-switched call to " + String.valueOf(method) + " on " + this.f253854b.toString(), new C90764bh(bkVar));
        return null;
    }
}
