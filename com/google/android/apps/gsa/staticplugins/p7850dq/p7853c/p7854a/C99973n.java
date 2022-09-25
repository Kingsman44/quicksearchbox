package com.google.android.apps.gsa.staticplugins.p7850dq.p7853c.p7854a;

import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119103al;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.dq.c.a.n */
/* compiled from: PG */
public final /* synthetic */ class C99973n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C99960a f279637a;

    /* renamed from: b */
    public final /* synthetic */ C119103al f279638b;

    /* renamed from: c */
    public final /* synthetic */ Object f279639c;

    /* renamed from: d */
    public final /* synthetic */ SettableFuture f279640d;

    public /* synthetic */ C99973n(C99960a aVar, C119103al alVar, Object obj, SettableFuture settableFuture) {
        this.f279637a = aVar;
        this.f279638b = alVar;
        this.f279639c = obj;
        this.f279640d = settableFuture;
    }

    public final void run() {
        C99960a aVar = this.f279637a;
        C119103al alVar = this.f279638b;
        Object obj = this.f279639c;
        SettableFuture settableFuture = this.f279640d;
        if (aVar.f279620a.mo56113h()) {
            C119103al alVar2 = aVar.f279622c.f231130b;
            if (alVar2 == null) {
                alVar2 = C119103al.f332227e;
            }
            if (alVar2.equals(alVar)) {
                aVar.mo91687c(obj);
                settableFuture.mo57356n((Object) null);
            }
        }
    }
}
