package com.google.android.libraries.assistant.auto.tng.p1322v.p1324b;

import com.google.common.base.C58817ah;
import p001a.p007b.p008a.p009a.p010a.C0009e;
import p001a.p007b.p008a.p009a.p010a.C0014j;
import p001a.p007b.p008a.p009a.p010a.C0015k;
import p001a.p007b.p008a.p009a.p010a.C0024t;

/* renamed from: com.google.android.libraries.assistant.auto.tng.v.b.b */
/* compiled from: PG */
public final /* synthetic */ class C16836b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f49294a;

    public /* synthetic */ C16836b(String str) {
        this.f49294a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f49294a;
        C0024t tVar = (C0024t) obj;
        C0009e eVar = (C0009e) tVar.toBuilder();
        C0015k kVar = tVar.f70b;
        if (kVar == null) {
            kVar = C0015k.f27g;
        }
        C0014j jVar = (C0014j) kVar.toBuilder();
        jVar.copyOnWrite();
        C0015k kVar2 = (C0015k) jVar.instance;
        str.getClass();
        kVar2.f29a |= 8;
        kVar2.f34f = str;
        eVar.copyOnWrite();
        C0024t tVar2 = (C0024t) eVar.instance;
        C0015k kVar3 = (C0015k) jVar.build();
        kVar3.getClass();
        tVar2.f70b = kVar3;
        tVar2.f69a |= 1;
        return (C0024t) eVar.build();
    }
}
