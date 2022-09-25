package com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80412ad;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80413ae;
import com.google.protobuf.C62962ci;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.a.av */
/* compiled from: PG */
public final /* synthetic */ class C83068av implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80412ad f226679a;

    public /* synthetic */ C83068av(C80412ad adVar) {
        this.f226679a = adVar;
    }

    public final void accept(Object obj) {
        C80412ad adVar = this.f226679a;
        String str = (String) obj;
        adVar.copyOnWrite();
        C80413ae aeVar = (C80413ae) adVar.instance;
        C62962ci ciVar = C80413ae.f220687l;
        str.getClass();
        aeVar.f220690a |= 2;
        aeVar.f220692c = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
