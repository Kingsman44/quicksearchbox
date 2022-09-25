package com.google.android.libraries.lens.ondevice.p2034k;

import android.graphics.Bitmap;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.lens.p4701g.C62254ad;
import com.google.lens.p4701g.C62255ae;
import com.google.lens.p4701g.C62281bd;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p3186j$.util.Collection;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.ondevice.k.ag */
/* compiled from: PG */
public final class C24542ag extends C68247h {

    /* renamed from: a */
    private final C68283d f67219a;

    /* renamed from: c */
    private final C68283d f67220c;

    /* renamed from: d */
    private final C68283d f67221d;

    public C24542ag(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C24542ag.class), aVar);
        this.f67219a = C68236af.m98549d(dVar);
        this.f67220c = C68236af.m98549d(dVar2);
        this.f67221d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C62281bd bdVar = (C62281bd) list.get(0);
        int sum = Collection.EL.stream(bdVar.f168143a).flatMap(C24536aa.f67204a).mapToInt(C24537ab.f67205a).sum();
        C62254ad adVar = (C62254ad) C62255ae.f168077e.createBuilder();
        C58485gu guVar = (C58485gu) Collection.EL.stream(bdVar.f168143a).map(new C24543ah(((C24551ap) list.get(2)).f67232b, (Bitmap) list.get(1))).collect(C58370cn.f155946a);
        adVar.copyOnWrite();
        C62255ae aeVar = (C62255ae) adVar.instance;
        C62971cq cqVar = aeVar.f168080b;
        if (!cqVar.mo58948c()) {
            aeVar.f168080b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) guVar, (List) aeVar.f168080b);
        adVar.copyOnWrite();
        C62255ae aeVar2 = (C62255ae) adVar.instance;
        aeVar2.f168079a |= 2;
        aeVar2.f168082d = sum;
        return C60856cj.m92900i((C62255ae) adVar.build());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f67219a.mo60297gq(), this.f67220c.mo60297gq(), this.f67221d.mo60297gq());
    }
}
