package com.google.android.libraries.p10923ac.p10925b.p10934e;

import com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146821r;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4895aw.p4902b.C64063ds;
import com.google.protos.p4895aw.p4902b.C64064dt;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.ac.b.e.dc */
/* compiled from: PG */
public final class C146954dc extends C68247h {

    /* renamed from: a */
    private final C68283d f396692a;

    /* renamed from: c */
    private final C68283d f396693c;

    public C146954dc(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C146954dc.class), aVar);
        this.f396692a = C68236af.m98549d(dVar);
        this.f396693c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C146821r rVar = (C146821r) list.get(0);
        Long l = (Long) list.get(1);
        C64063ds dsVar = (C64063ds) C64064dt.f173207e.createBuilder();
        int a = rVar.mo123699a();
        dsVar.copyOnWrite();
        C64064dt dtVar = (C64064dt) dsVar.instance;
        dtVar.f173209a = 1 | dtVar.f173209a;
        dtVar.f173210b = a;
        if (rVar.mo123700b() != null) {
            long longValue = l.longValue();
            long longValue2 = rVar.mo123700b().longValue();
            dsVar.copyOnWrite();
            C64064dt dtVar2 = (C64064dt) dsVar.instance;
            dtVar2.f173209a |= 2;
            dtVar2.f173211c = longValue + longValue2;
        }
        if (rVar.mo123701c() != null) {
            long longValue3 = l.longValue();
            long longValue4 = rVar.mo123701c().longValue();
            dsVar.copyOnWrite();
            C64064dt dtVar3 = (C64064dt) dsVar.instance;
            dtVar3.f173209a |= 4;
            dtVar3.f173212d = longValue3 + longValue4;
        }
        return C60856cj.m92900i((C64064dt) dsVar.build());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f396692a.mo60297gq(), this.f396693c.mo60297gq());
    }
}
