package com.google.android.libraries.p10923ac.p10925b.p10937f.p10938a.p10939a;

import android.accounts.Account;
import com.google.android.libraries.p10923ac.p10925b.p10943j.C147112i;
import com.google.android.libraries.p10923ac.p10925b.p10943j.C147116m;
import com.google.android.libraries.p10923ac.p10925b.p10945l.C147182p;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4895aw.p4902b.C64033cp;
import com.google.protos.p4895aw.p4902b.C64034cq;
import com.google.protos.p4895aw.p4902b.C64054dj;
import com.google.protos.p4895aw.p4902b.C64098p;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.ac.b.f.a.a.x */
/* compiled from: PG */
public final class C147024x extends C68247h {

    /* renamed from: a */
    private final C68283d f396977a;

    /* renamed from: c */
    private final C68283d f396978c;

    /* renamed from: d */
    private final C68283d f396979d;

    public C147024x(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C147024x.class), aVar);
        this.f396977a = C68236af.m98549d(dVar);
        this.f396978c = C68236af.m98549d(dVar2);
        this.f396979d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        Account account = (Account) list.get(0);
        Long l = (Long) list.get(2);
        C58480gp e = C58485gu.m89837e();
        for (C147112i iVar : ((C147116m) list.get(1)).mo123934b()) {
            C64054dj g = iVar.mo123929g();
            if (account.equals(iVar.mo123925d()) && g != null && C147182p.m240014b(g)) {
                C64033cp cpVar = (C64033cp) C64034cq.f173142d.createBuilder();
                C64098p f = iVar.mo123928f();
                cpVar.copyOnWrite();
                C64034cq cqVar = (C64034cq) cpVar.instance;
                f.getClass();
                cqVar.f173145b = f;
                cqVar.f173144a |= 1;
                int i = g.f173193e;
                cpVar.copyOnWrite();
                C64034cq cqVar2 = (C64034cq) cpVar.instance;
                cqVar2.f173144a |= 2;
                cqVar2.f173146c = i;
                e.mo55395g((C64034cq) cpVar.build());
            }
        }
        return C60856cj.m92900i(e.mo55394f());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f396977a.mo60297gq(), this.f396978c.mo60297gq(), this.f396979d.mo60297gq());
    }
}
