package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6092f;

import android.net.Uri;
import com.google.assistant.p3897e.p3921j.C52128gg;
import com.google.assistant.p3897e.p3921j.C52131gj;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.f.s */
/* compiled from: PG */
public final /* synthetic */ class C77299s implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C52128gg f213186a;

    public /* synthetic */ C77299s(C52128gg ggVar) {
        this.f213186a = ggVar;
    }

    public final void accept(Object obj) {
        C52128gg ggVar = this.f213186a;
        int i = C77301u.f213187c;
        String uri = ((Uri) obj).toString();
        ggVar.copyOnWrite();
        C52131gj gjVar = (C52131gj) ggVar.instance;
        C52131gj gjVar2 = C52131gj.f136789h;
        uri.getClass();
        gjVar.f136791a |= 16;
        gjVar.f136796f = uri;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
