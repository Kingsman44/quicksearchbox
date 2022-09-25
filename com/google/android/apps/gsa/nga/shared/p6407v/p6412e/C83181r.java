package com.google.android.apps.gsa.nga.shared.p6407v.p6412e;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82822bs;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82823bt;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.r */
/* compiled from: PG */
public final /* synthetic */ class C83181r implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C82822bs f226797a;

    public /* synthetic */ C83181r(C82822bs bsVar) {
        this.f226797a = bsVar;
    }

    public final void accept(Object obj) {
        C82822bs bsVar = this.f226797a;
        String str = (String) obj;
        bsVar.copyOnWrite();
        C82823bt btVar = (C82823bt) bsVar.instance;
        C82823bt btVar2 = C82823bt.f225680i;
        str.getClass();
        btVar.f225682a |= 4;
        btVar.f225685d = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
