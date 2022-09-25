package com.google.android.apps.gsa.shared.util.p7159c.p7160a;

import com.google.android.apps.gsa.shared.util.debug.C91030n;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.shared.util.c.a.i */
/* compiled from: PG */
public final /* synthetic */ class C90849i implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C90850j f254028a;

    /* renamed from: b */
    public final /* synthetic */ Callable f254029b;

    public /* synthetic */ C90849i(C90850j jVar, Callable callable) {
        this.f254028a = jVar;
        this.f254029b = callable;
    }

    public final Object call() {
        C90850j jVar = this.f254028a;
        Callable callable = this.f254029b;
        C91030n.m148695a(jVar.f254030a, jVar.f254031b);
        try {
            return callable.call();
        } finally {
            C91030n.m148696b(jVar.f254031b);
        }
    }
}
