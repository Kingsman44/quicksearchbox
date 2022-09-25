package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import android.support.p031v4.media.session.C0315q;
import android.support.p031v4.media.session.C0320v;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.cy */
/* compiled from: PG */
public final /* synthetic */ class C18879cy implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C18880cz f53150a;

    public /* synthetic */ C18879cy(C18880cz czVar) {
        this.f53150a = czVar;
    }

    public final void accept(Object obj) {
        C18880cz czVar = this.f53150a;
        C0315q e = ((C0320v) obj).mo1037e();
        long j = czVar.f53151a;
        if (j == 2) {
            e.mo1017b();
        } else if (j == 32) {
            e.mo1029n();
        } else if (j == 16) {
            e.mo1030o();
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
