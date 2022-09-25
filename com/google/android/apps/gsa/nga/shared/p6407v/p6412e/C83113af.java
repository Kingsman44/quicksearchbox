package com.google.android.apps.gsa.nga.shared.p6407v.p6412e;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80414af;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80417ai;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80426f;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.af */
/* compiled from: PG */
public final /* synthetic */ class C83113af implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80414af f226724a;

    public /* synthetic */ C83113af(C80414af afVar) {
        this.f226724a = afVar;
    }

    public final void accept(Object obj) {
        C80414af afVar = this.f226724a;
        C80426f fVar = (C80426f) obj;
        afVar.copyOnWrite();
        C80417ai aiVar = (C80417ai) afVar.instance;
        C80417ai aiVar2 = C80417ai.f220707g;
        fVar.getClass();
        aiVar.f220713e = fVar;
        aiVar.f220709a |= 16;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
