package com.google.android.apps.gsa.nga.shared.p6407v.p6412e;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82822bs;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82823bt;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.m */
/* compiled from: PG */
public final /* synthetic */ class C83176m implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C82822bs f226792a;

    public /* synthetic */ C83176m(C82822bs bsVar) {
        this.f226792a = bsVar;
    }

    public final void accept(Object obj) {
        C82822bs bsVar = this.f226792a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        bsVar.copyOnWrite();
        C82823bt btVar = (C82823bt) bsVar.instance;
        C82823bt btVar2 = C82823bt.f225680i;
        btVar.f225682a |= 64;
        btVar.f225689h = booleanValue;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
