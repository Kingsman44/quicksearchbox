package com.google.apps.tiktok.dataservice.local;

import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2391v;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.dataservice.C46785db;
import com.google.apps.tiktok.lifecycle.C47439h;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
final class LocalSubscriptionMixinResultPropagator extends C46865s implements C2376g {

    /* renamed from: a */
    private final C46865s f122230a;

    /* renamed from: b */
    private final C46785db f122231b;

    /* renamed from: c */
    private final Executor f122232c;

    /* renamed from: d */
    private final Map f122233d;

    public LocalSubscriptionMixinResultPropagator(C46865s sVar, C47439h hVar, C46785db dbVar, Executor executor, C2384o oVar) {
        this.f122230a = sVar;
        this.f122231b = dbVar;
        this.f122232c = executor;
        this.f122233d = (Map) hVar.f123205a.mo51257g(R.id.result_propagator_map, C46868v.f122296a, C46869w.f122297a);
        oVar.mo5790b(this);
    }

    /* renamed from: gV */
    public final /* synthetic */ void mo3520gV(C2391v vVar) {
    }

    /* renamed from: gW */
    public final void mo3521gW(C2391v vVar) {
        C19559g.m37304c();
        for (C46847av avVar : this.f122233d.values()) {
            C19559g.m37304c();
            C58838bb.m90883r(!avVar.f122277e);
            avVar.f122275c = null;
        }
    }

    /* renamed from: gX */
    public final /* synthetic */ void mo3522gX(C2391v vVar) {
    }

    /* renamed from: gY */
    public final /* synthetic */ void mo3523gY(C2391v vVar) {
    }

    /* renamed from: gZ */
    public final void mo3524gZ(C2391v vVar) {
        C19559g.m37304c();
        for (C46847av avVar : this.f122233d.values()) {
            C19559g.m37304c();
            avVar.f122276d = true;
            C46846au auVar = avVar.f122274b;
            if (auVar != null) {
                auVar.mo50854b();
            }
        }
    }

    /* renamed from: ha */
    public final void mo3525ha(C2391v vVar) {
        C19559g.m37304c();
        for (C46847av avVar : this.f122233d.values()) {
            C19559g.m37304c();
            avVar.f122276d = false;
        }
    }

    /* renamed from: j */
    public final C46854h mo50826j(int i, C46852f fVar, C58833ax axVar) {
        C19559g.m37304c();
        C46854h j = this.f122230a.mo50826j(i, fVar, axVar);
        Map map = this.f122233d;
        Integer valueOf = Integer.valueOf(i);
        C46847av avVar = (C46847av) map.get(valueOf);
        if (avVar == null) {
            C46847av avVar2 = new C46847av(this.f122231b, this.f122232c);
            this.f122233d.put(valueOf, avVar2);
            if (axVar.mo56113h()) {
                avVar2.mo50856a((C46851e) axVar.mo56107c());
            }
            avVar = avVar2;
        }
        C19559g.m37304c();
        C58838bb.m90883r(!avVar.f122277e);
        avVar.f122275c = j;
        C46846au auVar = avVar.f122274b;
        if (auVar != null) {
            auVar.mo50854b();
        }
        return new C46870x(j, avVar);
    }
}
