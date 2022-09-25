package com.google.android.libraries.search.p2476a.p2478b;

import com.google.android.apps.p464c.p465a.p466a.p467a.p468a.C9015a;
import com.google.android.apps.p464c.p465a.p466a.p467a.p468a.C9016b;
import com.google.android.libraries.storage.protostore.C43019v;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.search.a.b.a */
/* compiled from: PG */
public final class C32161a implements C43019v {

    /* renamed from: a */
    private final C58881cr f86349a;

    /* renamed from: b */
    private final C58881cr f86350b;

    public C32161a(C58881cr crVar, C58881cr crVar2) {
        this.f86349a = crVar;
        this.f86350b = crVar2;
    }

    /* renamed from: a */
    public final C60870cx mo18054a() {
        return C60866ct.f164955a;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C60870cx mo18055b(MessageLite messageLite) {
        C9015a aVar = (C9015a) ((C9016b) messageLite).toBuilder();
        aVar.copyOnWrite();
        C9016b bVar = (C9016b) aVar.instance;
        bVar.f31145a &= -2;
        bVar.f31146b = C9016b.f31143e.f31146b;
        aVar.copyOnWrite();
        C9016b bVar2 = (C9016b) aVar.instance;
        bVar2.f31145a &= -3;
        bVar2.f31147c = false;
        aVar.copyOnWrite();
        ((C9016b) aVar.instance).f31148d = C62942bv.emptyProtobufList();
        C58833ax axVar = (C58833ax) this.f86349a.mo6453a();
        if (axVar.mo56113h()) {
            String str = (String) axVar.mo56107c();
            aVar.copyOnWrite();
            C9016b bVar3 = (C9016b) aVar.instance;
            str.getClass();
            bVar3.f31145a |= 1;
            bVar3.f31146b = str;
        }
        C58833ax axVar2 = (C58833ax) this.f86350b.mo6453a();
        if (axVar2.mo56113h()) {
            aVar.copyOnWrite();
            C9016b bVar4 = (C9016b) aVar.instance;
            bVar4.f31145a |= 2;
            bVar4.f31147c = true;
            aVar.mo17310a((Iterable) axVar2.mo56107c());
        }
        return C60856cj.m92900i((C9016b) aVar.build());
    }

    /* renamed from: c */
    public final C60870cx mo18056c() {
        return C60856cj.m92900i(true);
    }
}
