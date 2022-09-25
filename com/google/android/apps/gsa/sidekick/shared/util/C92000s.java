package com.google.android.apps.gsa.sidekick.shared.util;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.util.s */
/* compiled from: PG */
final class C92000s {

    /* renamed from: a */
    public final ArrayList f256495a = new ArrayList();

    /* renamed from: b */
    public final ArrayList f256496b = new ArrayList();

    /* renamed from: c */
    public C58833ax f256497c;

    /* renamed from: d */
    public C58833ax f256498d;

    /* renamed from: e */
    public C58833ax f256499e;

    public C92000s() {
        C58836b bVar = C58836b.f156633a;
        this.f256497c = bVar;
        this.f256498d = bVar;
        this.f256499e = bVar;
    }

    /* renamed from: a */
    public final C92007z mo86671a() {
        C92006y yVar = (C92006y) C92007z.f256515g.createBuilder();
        ArrayList arrayList = this.f256495a;
        yVar.copyOnWrite();
        C92007z zVar = (C92007z) yVar.instance;
        C62971cq cqVar = zVar.f256518b;
        if (!cqVar.mo58948c()) {
            zVar.f256518b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) arrayList, (List) zVar.f256518b);
        ArrayList arrayList2 = this.f256496b;
        yVar.copyOnWrite();
        C92007z zVar2 = (C92007z) yVar.instance;
        C62971cq cqVar2 = zVar2.f256521e;
        if (!cqVar2.mo58948c()) {
            zVar2.f256521e = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) arrayList2, (List) zVar2.f256521e);
        if (this.f256497c.mo56113h()) {
            C92005x xVar = (C92005x) this.f256497c.mo56107c();
            yVar.copyOnWrite();
            C92007z zVar3 = (C92007z) yVar.instance;
            xVar.getClass();
            zVar3.f256519c = xVar;
            zVar3.f256517a |= 1;
        }
        if (this.f256498d.mo56113h()) {
            C92005x xVar2 = (C92005x) this.f256498d.mo56107c();
            yVar.copyOnWrite();
            C92007z zVar4 = (C92007z) yVar.instance;
            xVar2.getClass();
            zVar4.f256520d = xVar2;
            zVar4.f256517a |= 2;
        }
        if (this.f256499e.mo56113h()) {
            String str = (String) this.f256499e.mo56107c();
            yVar.copyOnWrite();
            C92007z zVar5 = (C92007z) yVar.instance;
            str.getClass();
            zVar5.f256517a |= 4;
            zVar5.f256522f = str;
        }
        return (C92007z) yVar.build();
    }
}
