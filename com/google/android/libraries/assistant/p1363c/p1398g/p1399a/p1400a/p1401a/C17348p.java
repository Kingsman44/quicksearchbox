package com.google.android.libraries.assistant.p1363c.p1398g.p1399a.p1400a.p1401a;

import androidx.p104d.p105a.C2164c;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.c.g.a.a.a.p */
/* compiled from: PG */
public final /* synthetic */ class C17348p implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Throwable f50193a;

    public /* synthetic */ C17348p(Throwable th) {
        this.f50193a = th;
    }

    public final void accept(Object obj) {
        Throwable th = this.f50193a;
        C2164c cVar = (C2164c) obj;
        if (th != null) {
            cVar.mo5439d(th);
        } else {
            cVar.mo5437b((Object) null);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
