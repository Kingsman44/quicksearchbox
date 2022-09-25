package com.google.android.apps.gsa.nga.engine.p6029g.p6030a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58833ax;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.g.a.aj */
/* compiled from: PG */
public final /* synthetic */ class C76035aj implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C76043ar f210886a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f210887b;

    public /* synthetic */ C76035aj(C76043ar arVar, C58833ax axVar) {
        this.f210886a = arVar;
        this.f210887b = axVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        Optional optional;
        C76043ar arVar = this.f210886a;
        C58833ax axVar = this.f210887b;
        Optional optional2 = (Optional) obj;
        AtomicReference atomicReference = arVar.f210912m;
        if (axVar.mo56113h()) {
            optional = Optional.m71637of((String) axVar.mo56107c());
        } else {
            optional = Optional.empty();
        }
        atomicReference.set(new C76025a(optional2, optional));
        return C118826c.f331422a;
    }
}
