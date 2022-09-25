package com.google.android.apps.search.assistant.platform.appintegration.grpc;

import com.google.android.libraries.assistant.p1467d.p1472c.p1474b.p1475a.C17854d;
import com.google.android.libraries.assistant.p1467d.p1472c.p1474b.p1475a.C17859i;
import com.google.android.libraries.assistant.p1467d.p1472c.p1474b.p1475a.C17861k;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17909k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.grpc.b */
/* compiled from: PG */
public final class C119607b extends C17854d {

    /* renamed from: a */
    public static final C59071e f333351a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.appintegration.grpc.b");

    /* renamed from: b */
    public final C119587ag f333352b;

    public C119607b(C119587ag agVar) {
        this.f333352b = agVar;
    }

    /* renamed from: b */
    public final void mo23482b(C17859i iVar, C70862aj ajVar) {
        ((C59052c) ((C59052c) f333351a.mo56224b()).mo56372aa(34446)).mo56386p("sending event to service handler");
        C119587ag agVar = this.f333352b;
        if ((iVar.f51188a & 1) != 0) {
            C119617bc bcVar = agVar.f333296a;
            C17909k kVar = iVar.f51189b;
            if (kVar == null) {
                kVar = C17909k.f51314c;
            }
            bcVar.mo104461d(kVar);
        }
        ajVar.mo20123c(C17861k.f51191a);
        ajVar.mo20121a();
    }

    /* renamed from: c */
    public final C70862aj mo23483c() {
        return new C119576a(this);
    }
}
