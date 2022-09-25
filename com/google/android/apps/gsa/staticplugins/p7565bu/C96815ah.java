package com.google.android.apps.gsa.staticplugins.p7565bu;

import androidx.p104d.p105a.C2169h;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82305ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118475aj;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.bu.ah */
/* compiled from: PG */
public final /* synthetic */ class C96815ah implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C96828au f270751a;

    public /* synthetic */ C96815ah(C96828au auVar) {
        this.f270751a = auVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C58528ij<C65753ak> F;
        long j;
        int size;
        C96828au auVar = this.f270751a;
        synchronized (auVar.f270780g) {
            auVar.f270782i = Optional.empty();
            F = C58528ij.m90006F(auVar.f270781h);
            auVar.f270781h.clear();
            j = auVar.f270783j;
            auVar.f270783j = C96828au.f270779f.getAndIncrement();
        }
        C60870cx a = C2169h.m6027a(new C96824aq(auVar.f270784k, j));
        C118561t tVar = auVar.f270788o;
        C118522by byVar = C96828au.f270775b;
        C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
        long millis = C96828au.f270777d.toMillis();
        afVar.copyOnWrite();
        C118472ag agVar = (C118472ag) afVar.instance;
        agVar.f328821a |= 2;
        agVar.f328823c = millis;
        C118475aj ajVar = (C118475aj) C118476ak.f328838a.createBuilder();
        C62940bt btVar = C96833az.f270792i;
        C96830aw awVar = (C96830aw) C96833az.f270791h.createBuilder();
        awVar.copyOnWrite();
        C96833az azVar = (C96833az) awVar.instance;
        azVar.f270794a |= 8;
        azVar.f270799g = j;
        awVar.copyOnWrite();
        C96833az azVar2 = (C96833az) awVar.instance;
        C62961ch chVar = azVar2.f270795b;
        if (!chVar.mo58948c()) {
            azVar2.f270795b = C62942bv.mutableCopy(chVar);
        }
        for (C65753ak akVar : F) {
            azVar2.f270795b.mo58916g(akVar.f178757bE);
        }
        ajVar.mo58885m(btVar, (C96833az) awVar.build());
        C118476ak akVar2 = (C118476ak) ajVar.build();
        afVar.copyOnWrite();
        C118472ag agVar2 = (C118472ag) afVar.instance;
        akVar2.getClass();
        agVar2.f328827g = akVar2;
        agVar2.f328821a |= 32;
        Optional ofNullable = Optional.ofNullable(tVar.mo103751b(byVar, (C118472ag) afVar.build()));
        if (!ofNullable.isEmpty()) {
            int intValue = ((Integer) ofNullable.get()).intValue();
            ((C59052c) ((C59052c) C96828au.f270774a.mo56224b()).mo56372aa(20906)).mo56359L("Scheduled one-off task for batch; batchId=%d taskId=%d corpora=[%s]", Long.valueOf(j), Integer.valueOf(intValue), Collection.EL.stream(F).map(C96817aj.f270753a).collect(Collectors.joining(",")));
            C96826as asVar = auVar.f270784k;
            synchronized (asVar.f270772b) {
                size = asVar.f270773c.size();
            }
            ((C59052c) ((C59052c) C96828au.f270774a.mo56224b()).mo56372aa(20907)).mo56387q("Pending callbacks: %d", size);
            auVar.f270787n.ifPresent(new C96816ai(new C82305ag("GDD_TASK_SCHEDULER_TASK_COUNT", Double.valueOf((double) size))));
            C60870cx e = C90877ak.m148471e(a, C96828au.f270778e.toMillis(), TimeUnit.MILLISECONDS, auVar.f270786m);
            C90873ag agVar3 = new C90873ag(e, auVar.f270786m, "GddBackgroundTaskScheduler#batchRefresh logging", new C96818ak(auVar, j, intValue));
            agVar3.mo85225c(TimeoutException.class, new C96819al(auVar, intValue, j));
            agVar3.mo85223a(new C96820am(auVar, j, intValue));
            return e;
        }
        throw new C96827at();
    }
}
