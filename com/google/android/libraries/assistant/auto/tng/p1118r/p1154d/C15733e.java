package com.google.android.libraries.assistant.auto.tng.p1118r.p1154d;

import com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.p1161e.C15734a;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.p1161e.C15735b;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.p1161e.C15736c;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.p1161e.C15737d;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.d.e */
/* compiled from: PG */
public final /* synthetic */ class C15733e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C15755h f46913a;

    /* renamed from: b */
    public final /* synthetic */ String f46914b;

    /* renamed from: c */
    public final /* synthetic */ int f46915c;

    public /* synthetic */ C15733e(C15755h hVar, String str, int i) {
        this.f46913a = hVar;
        this.f46914b = str;
        this.f46915c = i;
    }

    public final Object apply(Object obj) {
        C15755h hVar = this.f46913a;
        String str = this.f46914b;
        int i = this.f46915c;
        C15735b bVar = (C15735b) obj;
        if (Collection.EL.stream(bVar.f46918a).anyMatch(new C15691d(hVar, str, i))) {
            return bVar;
        }
        ((C58970a) ((C58970a) C15755h.f46951a.mo56224b()).mo56372aa(46256)).mo56352E("Adding LanguagePack %s-v%d to cache record", str, i);
        C15734a aVar = (C15734a) bVar.toBuilder();
        C15736c cVar = (C15736c) C15737d.f46919f.createBuilder();
        cVar.copyOnWrite();
        C15737d dVar = (C15737d) cVar.instance;
        str.getClass();
        dVar.f46921a |= 1;
        dVar.f46922b = str;
        cVar.copyOnWrite();
        C15737d dVar2 = (C15737d) cVar.instance;
        dVar2.f46921a |= 2;
        dVar2.f46923c = (long) i;
        String str2 = hVar.f46953c;
        cVar.copyOnWrite();
        C15737d dVar3 = (C15737d) cVar.instance;
        str2.getClass();
        dVar3.f46921a |= 4;
        dVar3.f46924d = str2;
        String str3 = hVar.f46954d;
        cVar.copyOnWrite();
        C15737d dVar4 = (C15737d) cVar.instance;
        str3.getClass();
        dVar4.f46921a |= 8;
        dVar4.f46925e = str3;
        aVar.copyOnWrite();
        C15735b bVar2 = (C15735b) aVar.instance;
        C15737d dVar5 = (C15737d) cVar.build();
        dVar5.getClass();
        C62971cq cqVar = bVar2.f46918a;
        if (!cqVar.mo58948c()) {
            bVar2.f46918a = C62942bv.mutableCopy(cqVar);
        }
        bVar2.f46918a.add(dVar5);
        return (C15735b) aVar.build();
    }
}
