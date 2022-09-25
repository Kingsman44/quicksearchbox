package com.google.android.apps.gsa.staticplugins.p8793w.p8794a;

import com.google.common.base.C58817ah;
import p001a.p007b.p008a.p009a.p010a.C0009e;
import p001a.p007b.p008a.p009a.p010a.C0016l;
import p001a.p007b.p008a.p009a.p010a.C0023s;
import p001a.p007b.p008a.p009a.p010a.C0024t;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.a.u */
/* compiled from: PG */
public final /* synthetic */ class C117707u implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ boolean f326701a;

    public /* synthetic */ C117707u(boolean z) {
        this.f326701a = z;
    }

    public final Object apply(Object obj) {
        boolean z = this.f326701a;
        C0024t tVar = (C0024t) obj;
        C0023s sVar = tVar.f74f;
        if (sVar == null) {
            sVar = C0023s.f58h;
        }
        C0016l lVar = (C0016l) sVar.toBuilder();
        C0009e eVar = (C0009e) tVar.toBuilder();
        lVar.copyOnWrite();
        C0023s sVar2 = (C0023s) lVar.instance;
        sVar2.f60a |= 32;
        sVar2.f64e = z;
        C0023s sVar3 = (C0023s) lVar.build();
        eVar.copyOnWrite();
        C0024t tVar2 = (C0024t) eVar.instance;
        sVar3.getClass();
        tVar2.f74f = sVar3;
        tVar2.f69a |= 16;
        return (C0024t) eVar.build();
    }
}
