package com.google.android.libraries.p10923ac.p10925b.p10937f;

import android.accounts.Account;
import android.os.SystemClock;
import com.google.android.libraries.p10923ac.p10925b.p10927b.C146772b;
import com.google.android.libraries.p10923ac.p10925b.p10933d.C146822a;
import com.google.android.libraries.p10923ac.p10925b.p10944k.C147159s;
import com.google.android.libraries.p10923ac.p10925b.p10944k.C147160t;
import com.google.android.libraries.p10923ac.p10925b.p10945l.C147176j;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10963e.C147266a;
import com.google.common.base.C58885cv;
import com.google.common.p4522b.C58331bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4552o.p4566l.C60161bz;
import com.google.common.p4552o.p4566l.C60165cc;
import com.google.common.p4552o.p4566l.C60166cd;
import com.google.common.p4552o.p4566l.C60167ce;
import com.google.common.p4552o.p4566l.C60168cf;
import com.google.common.p4552o.p4566l.C60169cg;
import com.google.common.p4552o.p4566l.C60170ch;
import com.google.common.p4552o.p4566l.C60192dc;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protos.p4895aw.p4902b.C64008br;
import com.google.protos.p4895aw.p4902b.C64098p;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.ac.b.f.l */
/* compiled from: PG */
public final /* synthetic */ class C147048l implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C147051o f397039a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f397040b;

    /* renamed from: c */
    public final /* synthetic */ Set f397041c;

    public /* synthetic */ C147048l(C147051o oVar, C58485gu guVar, Set set) {
        this.f397039a = oVar;
        this.f397040b = guVar;
        this.f397041c = set;
    }

    public final Object call() {
        int i;
        C58485gu guVar;
        boolean z;
        C147051o oVar = this.f397039a;
        C58485gu guVar2 = this.f397040b;
        Set set = this.f397041c;
        C58331bb bbVar = new C58331bb();
        int i2 = ((C58724pq) guVar2).f156474d;
        char c = 0;
        int i3 = 0;
        while (i3 < i2) {
            C147044h hVar = (C147044h) ((C60870cx) guVar2.get(i3)).get();
            Account a = hVar.mo123842a();
            C64098p b = hVar.mo123843b();
            if (a == null) {
                guVar = guVar2;
                i = i3;
                ((C147256m) oVar.f397045a.mo27525b()).mo124066i("Received mistaken notification for unknown account; channelId=%s", b);
            } else if (set.contains(new C146772b(a, b))) {
                Object[] objArr = new Object[2];
                objArr[c] = a;
                objArr[1] = b;
                ((C147256m) oVar.f397045a.mo27525b()).mo124066i("Received valid notification; account=%s, channelId=%s", objArr);
                C147160t tVar = oVar.f397048d;
                hVar.mo123846e();
                hVar.mo123845d();
                synchronized (tVar.f397318i) {
                    C147159s a2 = tVar.mo123988a(new C146772b(a, b));
                    int j = C147160t.m239973j();
                    long longValue = ((Long) new C58885cv(120L).f156729a).longValue() * 1000;
                    i = i3;
                    double d = (double) longValue;
                    double doubleValue = ((Double) new C58885cv(Double.valueOf(0.5d)).f156729a).doubleValue();
                    Double.isNaN(d);
                    long j2 = (long) (d * doubleValue);
                    guVar = guVar2;
                    long max = Math.max(longValue, j2 + 1000);
                    if (C147266a.m240139j()) {
                        a2.f397297a.mo123963g(SystemClock.elapsedRealtime());
                        a2.mo123979c(C60192dc.SYNC_TRIGGER_PUSH_NOTIFICATION);
                    }
                    a2.mo123978b();
                    a2.mo123986j(true, j2, max, j);
                }
                z = true;
                C64008br c2 = hVar.mo123844c();
                C60166cd cdVar = (C60166cd) C60167ce.f162759d.createBuilder();
                C60161bz a3 = C147176j.m240000a(b);
                cdVar.copyOnWrite();
                C60167ce ceVar = (C60167ce) cdVar.instance;
                a3.getClass();
                ceVar.f162762b = a3;
                ceVar.f162761a |= 1;
                cdVar.copyOnWrite();
                C60167ce ceVar2 = (C60167ce) cdVar.instance;
                ceVar2.f162761a |= 2;
                ceVar2.f162763c = !z;
                bbVar.mo54920x(c2, (C60167ce) cdVar.build());
                i3 = i + 1;
                guVar2 = guVar;
                c = 0;
            } else {
                guVar = guVar2;
                i = i3;
                ((C147256m) oVar.f397045a.mo27525b()).mo124066i("Received mistaken notification; account=%s, channelId=%s", a, b);
                oVar.f397049e.mo123836d(a);
            }
            z = false;
            C64008br c22 = hVar.mo123844c();
            C60166cd cdVar2 = (C60166cd) C60167ce.f162759d.createBuilder();
            C60161bz a32 = C147176j.m240000a(b);
            cdVar2.copyOnWrite();
            C60167ce ceVar3 = (C60167ce) cdVar2.instance;
            a32.getClass();
            ceVar3.f162762b = a32;
            ceVar3.f162761a |= 1;
            cdVar2.copyOnWrite();
            C60167ce ceVar22 = (C60167ce) cdVar2.instance;
            ceVar22.f162761a |= 2;
            ceVar22.f162763c = !z;
            bbVar.mo54920x(c22, (C60167ce) cdVar2.build());
            i3 = i + 1;
            guVar2 = guVar;
            c = 0;
        }
        C60169cg cgVar = (C60169cg) C60170ch.f162767b.createBuilder();
        for (Collection collection : bbVar.mo54950C().values()) {
            C60165cc ccVar = (C60165cc) C60168cf.f162764b.createBuilder();
            ccVar.copyOnWrite();
            C60168cf cfVar = (C60168cf) ccVar.instance;
            C62971cq cqVar = cfVar.f162766a;
            if (!cqVar.mo58948c()) {
                cfVar.f162766a = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) collection, (List) cfVar.f162766a);
            cgVar.copyOnWrite();
            C60170ch chVar = (C60170ch) cgVar.instance;
            C60168cf cfVar2 = (C60168cf) ccVar.build();
            cfVar2.getClass();
            C62971cq cqVar2 = chVar.f162769a;
            if (!cqVar2.mo58948c()) {
                chVar.f162769a = C62942bv.mutableCopy(cqVar2);
            }
            chVar.f162769a.add(cfVar2);
        }
        ((C146822a) oVar.f397046b.mo27525b()).mo123716b((C60170ch) cgVar.build());
        return null;
    }
}
