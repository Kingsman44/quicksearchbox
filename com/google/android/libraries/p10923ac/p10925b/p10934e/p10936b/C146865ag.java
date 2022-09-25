package com.google.android.libraries.p10923ac.p10925b.p10934e.p10936b;

import com.google.android.libraries.p10923ac.p10925b.p10934e.C146853aw;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147078aw;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;
import com.google.protos.p4895aw.p4902b.C64057dm;
import com.google.protos.p4895aw.p4902b.C64087ep;
import com.google.protos.p4895aw.p4902b.C64106x;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.ac.b.e.b.ag */
/* compiled from: PG */
public final class C146865ag extends C68247h {

    /* renamed from: a */
    private final C68283d f396440a;

    /* renamed from: c */
    private final C68283d f396441c;

    /* renamed from: d */
    private final C68283d f396442d;

    public C146865ag(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C146865ag.class), aVar);
        this.f396440a = C68236af.m98549d(dVar);
        this.f396441c = C68236af.m98549d(dVar2);
        this.f396442d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C146853aw awVar = (C146853aw) list.get(0);
        C58485gu guVar = (C58485gu) list.get(1);
        C64087ep epVar = (C64087ep) list.get(2);
        C64057dm dmVar = epVar.f173261b;
        if (dmVar == null) {
            dmVar = C64057dm.f173196c;
        }
        C147078aw b = awVar.mo123767a().mo123904b();
        try {
            C58597ky.m90217h(epVar.f173263d, C146897z.f396522a);
            C64106x xVar = epVar.f173262c;
            if (xVar == null) {
                xVar = C64106x.f173313c;
            }
            if ((1 & xVar.f173315a) != 0) {
                C64106x xVar2 = epVar.f173262c;
                if (xVar2 == null) {
                    xVar2 = C64106x.f173313c;
                }
                C63088z.m96143E(xVar2.f173316b).mo59174N();
            }
            awVar.mo123771e();
            awVar.mo123856k(b, dmVar);
            b.mo123901j();
            if (b != null) {
                b.close();
            }
            return C60856cj.m92900i(dmVar);
        } catch (Throwable th) {
            C146895x.m239405a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f396440a.mo60297gq(), this.f396441c.mo60297gq(), this.f396442d.mo60297gq());
    }
}
