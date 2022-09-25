package com.google.android.apps.gsa.staticplugins.nga.p8065h;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80460h;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80465m;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.h.i */
/* compiled from: PG */
public final /* synthetic */ class C103280i implements C60931s {

    /* renamed from: a */
    public static final /* synthetic */ C103280i f288074a = new C103280i();

    private /* synthetic */ C103280i() {
    }

    public final C60870cx apply(Object obj) {
        List list = (List) obj;
        C80460h hVar = (C80460h) C80465m.f220842e.createBuilder();
        if (!((C80465m) list.get(0)).equals(C80465m.f220842e)) {
            C62971cq cqVar = ((C80465m) list.get(0)).f220844a;
            hVar.copyOnWrite();
            C80465m mVar = (C80465m) hVar.instance;
            mVar.mo74331a();
            C62947c.addAll((Iterable) cqVar, (List) mVar.f220844a);
        }
        if (!((C80465m) list.get(1)).equals(C80465m.f220842e)) {
            C62971cq cqVar2 = ((C80465m) list.get(1)).f220845b;
            hVar.copyOnWrite();
            C80465m mVar2 = (C80465m) hVar.instance;
            mVar2.mo74332b();
            C62947c.addAll((Iterable) cqVar2, (List) mVar2.f220845b);
        }
        if (!((C80465m) list.get(2)).equals(C80465m.f220842e)) {
            C62971cq cqVar3 = ((C80465m) list.get(2)).f220846c;
            hVar.copyOnWrite();
            C80465m mVar3 = (C80465m) hVar.instance;
            mVar3.mo74333c();
            C62947c.addAll((Iterable) cqVar3, (List) mVar3.f220846c);
        }
        if (!((C80465m) list.get(3)).equals(C80465m.f220842e)) {
            C62971cq cqVar4 = ((C80465m) list.get(3)).f220847d;
            hVar.copyOnWrite();
            C80465m mVar4 = (C80465m) hVar.instance;
            mVar4.mo74334d();
            C62947c.addAll((Iterable) cqVar4, (List) mVar4.f220847d);
        }
        return C60856cj.m92900i((C80465m) hVar.build());
    }
}
