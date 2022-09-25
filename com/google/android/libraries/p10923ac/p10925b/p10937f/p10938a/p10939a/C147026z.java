package com.google.android.libraries.p10923ac.p10925b.p10937f.p10938a.p10939a;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import com.google.protos.p4895aw.p4902b.C64008br;
import com.google.protos.p4895aw.p4902b.C64014bx;
import com.google.protos.p4895aw.p4902b.C64015by;
import com.google.protos.p4895aw.p4902b.C64032co;
import com.google.protos.p4895aw.p4902b.C64035cr;
import com.google.protos.p4895aw.p4902b.C64037ct;
import dagger.p5294a.C68219e;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.libraries.ac.b.f.a.a.z */
/* compiled from: PG */
public final class C147026z extends C68247h {

    /* renamed from: a */
    private final C69464a f396984a;

    /* renamed from: c */
    private final C68283d f396985c;

    /* renamed from: d */
    private final C68283d f396986d;

    /* renamed from: e */
    private final C68283d f396987e;

    /* renamed from: f */
    private final C68283d f396988f;

    /* renamed from: g */
    private final C68283d f396989g;

    /* renamed from: h */
    private final C68283d f396990h;

    public C147026z(C69464a aVar, C69464a aVar2, C69464a aVar3, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6) {
        super(aVar2, new C68277d(C147026z.class), aVar);
        this.f396984a = aVar3;
        this.f396985c = C68236af.m98549d(dVar);
        this.f396986d = C68236af.m98549d(dVar2);
        this.f396987e = C68236af.m98549d(dVar3);
        this.f396988f = C68236af.m98549d(dVar4);
        this.f396989g = C68236af.m98549d(dVar5);
        this.f396990h = C68236af.m98549d(dVar6);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C68219e.m98518a(this.f396984a);
        C64014bx bxVar = (C64014bx) list.get(0);
        String str = (String) list.get(1);
        String str2 = (String) list.get(2);
        String str3 = (String) list.get(3);
        List list2 = (List) list.get(5);
        C64032co coVar = (C64032co) C64035cr.f173147h.createBuilder();
        coVar.copyOnWrite();
        C64035cr crVar = (C64035cr) coVar.instance;
        str.getClass();
        crVar.f173150b = 2;
        crVar.f173151c = str;
        coVar.copyOnWrite();
        C64035cr crVar2 = (C64035cr) coVar.instance;
        str2.getClass();
        crVar2.f173149a |= 4;
        crVar2.f173152d = str2;
        coVar.copyOnWrite();
        C64035cr crVar3 = (C64035cr) coVar.instance;
        str3.getClass();
        crVar3.f173149a |= 8;
        crVar3.f173153e = str3;
        C63088z byteString = ((C64008br) list.get(4)).toByteString();
        coVar.copyOnWrite();
        C64035cr crVar4 = (C64035cr) coVar.instance;
        byteString.getClass();
        crVar4.f173149a |= 16;
        crVar4.f173154f = byteString;
        coVar.copyOnWrite();
        C64035cr crVar5 = (C64035cr) coVar.instance;
        C62971cq cqVar = crVar5.f173155g;
        if (!cqVar.mo58948c()) {
            crVar5.f173155g = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) list2, (List) crVar5.f173155g);
        C64035cr crVar6 = (C64035cr) coVar.build();
        C70888j jVar = bxVar.f189039a;
        C70338di diVar = C64015by.f173105c;
        if (diVar == null) {
            synchronized (C64015by.class) {
                diVar = C64015by.f173105c;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("search.mdh.MobileDataHubCore", "SetUpNotifications");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C64035cr.f173147h);
                    d.f187486b = C70850d.m103697c(C64037ct.f173156a);
                    C70338di a = d.mo62040a();
                    C64015by.f173105c = a;
                    diVar = a;
                }
            }
        }
        return C70876o.m103760a(jVar.mo39510a(diVar, bxVar.f189040b), crVar6);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f396985c.mo60297gq(), this.f396986d.mo60297gq(), this.f396987e.mo60297gq(), this.f396988f.mo60297gq(), this.f396989g.mo60297gq(), this.f396990h.mo60297gq());
    }
}
