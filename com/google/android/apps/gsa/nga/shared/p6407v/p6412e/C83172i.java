package com.google.android.apps.gsa.nga.shared.p6407v.p6412e;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80517f;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82822bs;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82823bt;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.i */
/* compiled from: PG */
public final /* synthetic */ class C83172i implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C82822bs f226788a;

    public /* synthetic */ C83172i(C82822bs bsVar) {
        this.f226788a = bsVar;
    }

    public final void accept(Object obj) {
        C82822bs bsVar = this.f226788a;
        bsVar.copyOnWrite();
        C82823bt btVar = (C82823bt) bsVar.instance;
        C82823bt btVar2 = C82823bt.f225680i;
        btVar.f225687f = ((C80517f) obj).getNumber();
        btVar.f225682a |= 16;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
