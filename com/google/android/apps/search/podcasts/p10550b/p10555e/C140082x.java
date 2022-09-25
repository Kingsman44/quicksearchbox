package com.google.android.apps.search.podcasts.p10550b.p10555e;

import androidx.p060c.C0984n;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97880af;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97881ag;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97885ak;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97898ax;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97899ay;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97900az;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97902ba;
import com.google.android.apps.search.podcasts.p10550b.p10554d.C140055e;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protos.p4757ac.p4758a.C63113l;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.apps.search.podcasts.b.e.x */
/* compiled from: PG */
final class C140082x {

    /* renamed from: a */
    public final C21370a f380679a;

    /* renamed from: b */
    public final C60870cx f380680b;

    /* renamed from: c */
    public final C60870cx f380681c;

    public C140082x(C140055e eVar, C60870cx cxVar, C21370a aVar) {
        this.f380679a = aVar;
        this.f380680b = cxVar;
        C140081w wVar = new C140081w(eVar);
        this.f380681c = C60922j.m93044g(cxVar, C47810es.m84963c(wVar), C60826bg.f164896a);
    }

    /* renamed from: a */
    public final void mo115429a(C140083y yVar) {
        C140075q qVar = yVar.f380682a;
        C97900az azVar = (C97900az) C97902ba.f273351e.createBuilder();
        long j = yVar.f380689h;
        azVar.copyOnWrite();
        C97902ba baVar = (C97902ba) azVar.instance;
        baVar.f273353a |= 1;
        baVar.f273356d = j;
        int i = 0;
        while (true) {
            C0984n nVar = qVar.f380669a;
            if (i >= nVar.f3122d) {
                break;
            }
            String str = (String) nVar.mo3702e(i);
            C97880af afVar = (C97880af) C97881ag.f273295e.createBuilder();
            afVar.copyOnWrite();
            C97881ag agVar = (C97881ag) afVar.instance;
            str.getClass();
            agVar.f273297a |= 1;
            agVar.f273298b = str;
            C140074p pVar = (C140074p) qVar.f380669a.mo3708h(i);
            C63113l lVar = pVar.f380667b;
            if (lVar != null) {
                afVar.copyOnWrite();
                C97881ag agVar2 = (C97881ag) afVar.instance;
                agVar2.f273300d = lVar;
                agVar2.f273297a |= 4;
            }
            int i2 = 0;
            while (true) {
                C0984n nVar2 = pVar.f380666a;
                if (i2 >= nVar2.f3122d) {
                    break;
                }
                C97885ak akVar = (C97885ak) nVar2.mo3708h(i2);
                afVar.copyOnWrite();
                C97881ag agVar3 = (C97881ag) afVar.instance;
                akVar.getClass();
                C62971cq cqVar = agVar3.f273299c;
                if (!cqVar.mo58948c()) {
                    agVar3.f273299c = C62942bv.mutableCopy(cqVar);
                }
                agVar3.f273299c.add(akVar);
                i2++;
            }
            azVar.copyOnWrite();
            C97902ba baVar2 = (C97902ba) azVar.instance;
            C97881ag agVar4 = (C97881ag) afVar.build();
            agVar4.getClass();
            C62971cq cqVar2 = baVar2.f273354b;
            if (!cqVar2.mo58948c()) {
                baVar2.f273354b = C62942bv.mutableCopy(cqVar2);
            }
            baVar2.f273354b.add(agVar4);
            i++;
        }
        int i3 = 0;
        while (true) {
            C0984n nVar3 = yVar.f380685d;
            if (i3 < nVar3.f3122d) {
                String str2 = (String) nVar3.mo3702e(i3);
                Set set = (Set) yVar.f380685d.mo3708h(i3);
                C97898ax axVar = (C97898ax) C97899ay.f273345d.createBuilder();
                axVar.copyOnWrite();
                C97899ay ayVar = (C97899ay) axVar.instance;
                str2.getClass();
                ayVar.f273347a |= 1;
                ayVar.f273349c = str2;
                axVar.copyOnWrite();
                C97899ay ayVar2 = (C97899ay) axVar.instance;
                C62971cq cqVar3 = ayVar2.f273348b;
                if (!cqVar3.mo58948c()) {
                    ayVar2.f273348b = C62942bv.mutableCopy(cqVar3);
                }
                C62947c.addAll((Iterable) set, (List) ayVar2.f273348b);
                azVar.copyOnWrite();
                C97902ba baVar3 = (C97902ba) azVar.instance;
                C97899ay ayVar3 = (C97899ay) axVar.build();
                ayVar3.getClass();
                C62971cq cqVar4 = baVar3.f273355c;
                if (!cqVar4.mo58948c()) {
                    baVar3.f273355c = C62942bv.mutableCopy(cqVar4);
                }
                baVar3.f273355c.add(ayVar3);
                i3++;
            } else {
                C46459k.m82829b(C47633f.m84733g(this.f380681c).mo51516i(new C140078t(azVar), C60826bg.f164896a), "saveToLocalStorage failed", new Object[0]);
                return;
            }
        }
    }
}
