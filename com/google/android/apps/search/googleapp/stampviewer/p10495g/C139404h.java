package com.google.android.apps.search.googleapp.stampviewer.p10495g;

import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60856cj;
import com.google.p4017at.p4027c.p4031b.p4041d.p4042a.C53904a;
import com.google.p4017at.p4027c.p4031b.p4041d.p4042a.C53907b;
import com.google.p4017at.p4027c.p4031b.p4041d.p4042a.C53908c;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57338u;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57340w;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import java.util.List;
import java.util.concurrent.Callable;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.g.h */
/* compiled from: PG */
public final /* synthetic */ class C139404h implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C139409m f379051a;

    /* renamed from: b */
    public final /* synthetic */ List f379052b;

    /* renamed from: c */
    public final /* synthetic */ int f379053c;

    /* renamed from: d */
    public final /* synthetic */ C47633f f379054d;

    /* renamed from: e */
    public final /* synthetic */ C47633f f379055e;

    /* renamed from: f */
    public final /* synthetic */ int f379056f;

    public /* synthetic */ C139404h(C139409m mVar, List list, int i, int i2, C47633f fVar, C47633f fVar2) {
        this.f379051a = mVar;
        this.f379052b = list;
        this.f379056f = i;
        this.f379053c = i2;
        this.f379054d = fVar;
        this.f379055e = fVar2;
    }

    public final Object call() {
        C139409m mVar = this.f379051a;
        List list = this.f379052b;
        int i = this.f379056f;
        int i2 = this.f379053c;
        C47633f fVar = this.f379054d;
        C47633f fVar2 = this.f379055e;
        C53904a aVar = (C53904a) C53908c.f141452g.createBuilder();
        Iterable iterable = (Iterable) Collection.EL.stream(list).map(C139402f.f379049a).collect(Collectors.toCollection(C139400d.f379047a));
        aVar.copyOnWrite();
        C53908c cVar = (C53908c) aVar.instance;
        C62971cq cqVar = cVar.f141455b;
        if (!cqVar.mo58948c()) {
            cVar.f141455b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) cVar.f141455b);
        int i3 = i - 1;
        if (i != 0) {
            int i4 = 2;
            if (i3 != 0) {
                if (i3 == 1) {
                    i4 = 3;
                } else if (i3 != 2) {
                    i4 = 5;
                    if (i3 != 3) {
                        if (i3 == 4) {
                            i4 = 6;
                        } else if (i3 == 5) {
                            i4 = 7;
                        } else {
                            throw new IllegalArgumentException("unknown enum value: ".concat(Integer.toString(i3)));
                        }
                    }
                } else {
                    i4 = 4;
                }
            }
            aVar.copyOnWrite();
            ((C53908c) aVar.instance).f141454a = C53907b.m87058a(i4);
            aVar.copyOnWrite();
            ((C53908c) aVar.instance).f141456c = i2;
            C57338u uVar = (C57338u) C60856cj.m92909r(fVar);
            aVar.copyOnWrite();
            uVar.getClass();
            ((C53908c) aVar.instance).f141457d = uVar;
            C57340w wVar = (C57340w) C60856cj.m92909r(fVar2);
            aVar.copyOnWrite();
            wVar.getClass();
            ((C53908c) aVar.instance).f141458e = wVar;
            C63042fg b = C62950b.m95471b(mVar.f379065d);
            aVar.copyOnWrite();
            b.getClass();
            ((C53908c) aVar.instance).f141459f = b;
            return (C53908c) aVar.build();
        }
        throw null;
    }
}
