package com.google.android.apps.gsa.search.core.p6805i.p6806a;

import com.google.android.apps.gsa.search.core.p6805i.C86109e;
import com.google.android.apps.gsa.search.core.p6805i.C86117m;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118475aj;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58724pq;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import dagger.C68214a;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.search.core.i.a.b */
/* compiled from: PG */
public final class C86095b implements C86109e {

    /* renamed from: a */
    private final C68214a f232721a;

    public C86095b(C68214a aVar) {
        this.f232721a = aVar;
    }

    /* renamed from: a */
    public final void mo70818a(C86124t tVar, C86117m mVar) {
        C58528ij ijVar = mVar.f232764c;
        C58485gu guVar = C86094a.f232710j;
        int i = ((C58724pq) guVar).f156474d;
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 + 1;
            if (ijVar.contains(Integer.valueOf(((Integer) guVar.get(i2)).intValue()))) {
                C118561t tVar2 = (C118561t) this.f232721a.mo27525b();
                C118522by byVar = C118522by.ON_EXPERIMENTS_UPDATED;
                C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
                long millis = TimeUnit.SECONDS.toMillis(10);
                afVar.copyOnWrite();
                C118472ag agVar = (C118472ag) afVar.instance;
                agVar.f328821a |= 2;
                agVar.f328823c = millis;
                C118475aj ajVar = (C118475aj) C118476ak.f328838a.createBuilder();
                C62940bt btVar = C86099f.f232725a;
                C86097d dVar = (C86097d) C86098e.f232722b.createBuilder();
                C58528ij ijVar2 = mVar.f232764c;
                dVar.copyOnWrite();
                C86098e eVar = (C86098e) dVar.instance;
                C62961ch chVar = eVar.f232724a;
                if (!chVar.mo58948c()) {
                    eVar.f232724a = C62942bv.mutableCopy(chVar);
                }
                C62947c.addAll((Iterable) ijVar2, (List) eVar.f232724a);
                ajVar.mo58885m(btVar, (C86098e) dVar.build());
                C118476ak akVar = (C118476ak) ajVar.build();
                afVar.copyOnWrite();
                C118472ag agVar2 = (C118472ag) afVar.instance;
                akVar.getClass();
                agVar2.f328827g = akVar;
                agVar2.f328821a |= 32;
                tVar2.mo103754e(byVar, (C118472ag) afVar.build());
                return;
            }
            i2 = i3;
        }
    }

    /* renamed from: b */
    public final /* synthetic */ void mo70819b(C86124t tVar) {
    }
}
