package com.google.android.libraries.p10923ac.p10925b.p10934e.p10936b;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58557jl;
import com.google.protobuf.C62947c;
import com.google.protos.p4895aw.p4902b.C64027cj;
import com.google.protos.p4895aw.p4902b.C64028ck;
import com.google.protos.p4895aw.p4902b.C64039cv;
import com.google.protos.p4895aw.p4902b.C64099q;
import com.google.protos.p4895aw.p4902b.C64100r;
import com.google.protos.p4895aw.p4902b.C64104v;
import java.util.List;

/* renamed from: com.google.android.libraries.ac.b.e.b.i */
/* compiled from: PG */
public final /* synthetic */ class C146880i implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C146872an f396484a;

    public /* synthetic */ C146880i(C146872an anVar) {
        this.f396484a = anVar;
    }

    public final Object apply(Object obj) {
        C146872an anVar = this.f396484a;
        C64104v vVar = (C64104v) obj;
        C64099q qVar = (C64099q) C64100r.f173296f.createBuilder();
        int i = vVar.f173309b;
        qVar.copyOnWrite();
        C64100r rVar = (C64100r) qVar.instance;
        rVar.f173298a |= 1;
        rVar.f173299b = i;
        if ((vVar.f173308a & 2) != 0) {
            int i2 = vVar.f173310c;
            qVar.copyOnWrite();
            C64100r rVar2 = (C64100r) qVar.instance;
            rVar2.f173298a |= 2;
            rVar2.f173300c = i2;
        }
        if ((vVar.f173308a & 4) != 0) {
            long j = anVar.f396468a;
            long j2 = vVar.f173311d;
            qVar.copyOnWrite();
            C64100r rVar3 = (C64100r) qVar.instance;
            rVar3.f173298a |= 4;
            rVar3.f173301d = j + j2;
        }
        if ((vVar.f173308a & 8) != 0) {
            C64039cv cvVar = vVar.f173312e;
            if (cvVar == null) {
                cvVar = C64039cv.f173158b;
            }
            Iterable h = C58557jl.m90127h(cvVar.f173160a, C146871am.f396467a);
            C64027cj cjVar = (C64027cj) C64028ck.f173133b.createBuilder();
            cjVar.copyOnWrite();
            C64028ck ckVar = (C64028ck) cjVar.instance;
            ckVar.mo59250a();
            C62947c.addAll(h, (List) ckVar.f173135a);
            C64028ck ckVar2 = (C64028ck) cjVar.build();
            qVar.copyOnWrite();
            C64100r rVar4 = (C64100r) qVar.instance;
            ckVar2.getClass();
            rVar4.f173302e = ckVar2;
            rVar4.f173298a |= 8;
        }
        return (C64100r) qVar.build();
    }
}
