package com.google.android.libraries.gsa.conversation.p1853g;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.gsa.conversation.g.v */
/* compiled from: PG */
public final /* synthetic */ class C22678v implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ Iterable f62466a;

    public /* synthetic */ C22678v(Iterable iterable) {
        this.f62466a = iterable;
    }

    public final C60870cx apply(Object obj) {
        Throwable th = (Throwable) obj;
        for (C60870cx cancel : this.f62466a) {
            cancel.cancel(false);
        }
        return C60856cj.m92899h(th);
    }
}
