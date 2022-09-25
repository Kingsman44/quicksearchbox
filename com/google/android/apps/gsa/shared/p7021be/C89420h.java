package com.google.android.apps.gsa.shared.p7021be;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.apps.tiktok.p3633d.p3634a.C46669g;
import com.google.protobuf.C62972cr;
import java.util.Map;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.shared.be.h */
/* compiled from: PG */
public final /* synthetic */ class C89420h implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C91006f f242405a;

    public /* synthetic */ C89420h(C91006f fVar) {
        this.f242405a = fVar;
    }

    public final void accept(Object obj) {
        C91006f fVar = this.f242405a;
        Map.Entry entry = (Map.Entry) obj;
        fVar.mo85292s(C90752i.m148229c("\t".concat(String.valueOf((String) entry.getKey()))));
        fVar.mo85292s(C90752i.m148229c("\t\t".concat(String.valueOf(((C46669g) entry.getValue()).mo50688b().mo59170I(C62972cr.f170009a)))));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
