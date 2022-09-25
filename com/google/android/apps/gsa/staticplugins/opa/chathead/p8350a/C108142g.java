package com.google.android.apps.gsa.staticplugins.opa.chathead.p8350a;

import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chathead.a.g */
/* compiled from: PG */
public final /* synthetic */ class C108142g implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ boolean f300773a;

    public /* synthetic */ C108142g(boolean z) {
        this.f300773a = z;
    }

    public final void accept(Object obj) {
        boolean z = this.f300773a;
        C108150o oVar = (C108150o) obj;
        C28292j jVar = oVar.f300793a;
        int i = 1;
        if (true == z) {
            i = 3;
        }
        jVar.mo33794h(i);
        C89949q.m146521e(C28285c.m52875b(oVar.f300796d, 105250), false);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
