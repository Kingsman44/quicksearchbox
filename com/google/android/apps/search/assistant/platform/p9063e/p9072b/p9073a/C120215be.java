package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import com.google.android.libraries.search.assistant.p2511d.C32542e;
import com.google.assistant.p3897e.p3921j.C52079el;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.be */
/* compiled from: PG */
public final /* synthetic */ class C120215be implements C32542e {

    /* renamed from: a */
    public final /* synthetic */ C120221bk f334546a;

    /* renamed from: b */
    public final /* synthetic */ C32542e f334547b;

    public /* synthetic */ C120215be(C120221bk bkVar, C32542e eVar) {
        this.f334546a = bkVar;
        this.f334547b = eVar;
    }

    /* renamed from: a */
    public final C60870cx mo38138a(Object obj) {
        C120221bk bkVar = this.f334546a;
        C32542e eVar = this.f334547b;
        C52081en enVar = (C52081en) obj;
        C52079el elVar = (C52079el) enVar.toBuilder();
        elVar.copyOnWrite();
        ((C52081en) elVar.instance).f136684d = C52081en.emptyProtobufList();
        elVar.mo53784a((Iterable) Collection.EL.stream(enVar.f136684d).map(new C120219bi(bkVar)).collect(Collectors.toCollection(C120220bj.f334555a)));
        return eVar.mo38138a((C52081en) elVar.build());
    }
}
