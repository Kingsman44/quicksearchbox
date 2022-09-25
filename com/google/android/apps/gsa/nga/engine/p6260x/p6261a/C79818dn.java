package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.dn */
/* compiled from: PG */
public final /* synthetic */ class C79818dn implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C59582aj f218881a;

    public /* synthetic */ C79818dn(C59582aj ajVar) {
        this.f218881a = ajVar;
    }

    public final void accept(Object obj) {
        C59582aj ajVar = this.f218881a;
        String str = (String) obj;
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        C59687cb cbVar2 = C59687cb.f160034bf;
        str.getClass();
        cbVar.f160122c |= 2;
        cbVar.f160097ai = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
