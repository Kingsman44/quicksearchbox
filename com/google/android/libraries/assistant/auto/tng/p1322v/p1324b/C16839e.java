package com.google.android.libraries.assistant.auto.tng.p1322v.p1324b;

import com.google.common.base.C58817ah;
import p001a.p007b.p008a.p009a.p010a.C0009e;
import p001a.p007b.p008a.p009a.p010a.C0016l;
import p001a.p007b.p008a.p009a.p010a.C0023s;
import p001a.p007b.p008a.p009a.p010a.C0024t;

/* renamed from: com.google.android.libraries.assistant.auto.tng.v.b.e */
/* compiled from: PG */
public final /* synthetic */ class C16839e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ boolean f49299a;

    public /* synthetic */ C16839e(boolean z) {
        this.f49299a = z;
    }

    public final Object apply(Object obj) {
        boolean z = this.f49299a;
        C0024t tVar = (C0024t) obj;
        C0009e eVar = (C0009e) tVar.toBuilder();
        C0023s sVar = tVar.f74f;
        if (sVar == null) {
            sVar = C0023s.f58h;
        }
        C0016l lVar = (C0016l) sVar.toBuilder();
        lVar.copyOnWrite();
        C0023s sVar2 = (C0023s) lVar.instance;
        sVar2.f60a |= 2;
        sVar2.f62c = z;
        eVar.copyOnWrite();
        C0024t tVar2 = (C0024t) eVar.instance;
        C0023s sVar3 = (C0023s) lVar.build();
        sVar3.getClass();
        tVar2.f74f = sVar3;
        tVar2.f69a |= 16;
        return (C0024t) eVar.build();
    }
}
