package com.google.android.apps.gsa.nga.engine.p6056o.p6095g;

import android.content.Intent;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80372b;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80373c;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.g.j */
/* compiled from: PG */
public final /* synthetic */ class C77397j implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80372b f213414a;

    public /* synthetic */ C77397j(C80372b bVar) {
        this.f213414a = bVar;
    }

    public final void accept(Object obj) {
        C80372b bVar = this.f213414a;
        int i = C77402o.f213420c;
        if ("android.intent.action.SEARCH".equals(((Intent) obj).getAction())) {
            bVar.copyOnWrite();
            C80373c cVar = C80373c.f220529m;
            ((C80373c) bVar.instance).f220535e = true;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
