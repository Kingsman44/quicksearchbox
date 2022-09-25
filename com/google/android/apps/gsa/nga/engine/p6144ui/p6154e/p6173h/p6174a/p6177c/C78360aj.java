package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.aj */
/* compiled from: PG */
public final /* synthetic */ class C78360aj implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C59582aj f215732a;

    public /* synthetic */ C78360aj(C59582aj ajVar) {
        this.f215732a = ajVar;
    }

    public final void accept(Object obj) {
        C59582aj ajVar = this.f215732a;
        String str = (String) obj;
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        C59687cb cbVar2 = C59687cb.f160034bf;
        str.getClass();
        cbVar.f160062a |= 4;
        cbVar.f160127h = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
