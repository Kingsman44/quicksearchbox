package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p677b.p678a;

import com.google.android.gms.car.C143197dn;
import com.google.android.gms.car.C143198do;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p677b.C11552b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.b.a.a */
/* compiled from: PG */
public final /* synthetic */ class C11531a implements C143198do {

    /* renamed from: a */
    public final /* synthetic */ Consumer f37410a;

    /* renamed from: b */
    public final /* synthetic */ C11552b f37411b;

    public /* synthetic */ C11531a(Consumer consumer, C11552b bVar) {
        this.f37410a = consumer;
        this.f37411b = bVar;
    }

    /* renamed from: a */
    public final void mo20040a(C143197dn dnVar) {
        Consumer consumer = this.f37410a;
        C11552b bVar = this.f37411b;
        C59104x d = C11534d.f37417a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "CarClientTokenFactory");
        ((C59052c) ((C59052c) d).mo56372aa(43363)).mo56389s("ConnectableCarClientToken#onConnectionFailed: result=%s", dnVar);
        consumer.accept(new RuntimeException("Token connection failed : ".concat(dnVar.toString())));
        bVar.mo20010b();
    }
}
