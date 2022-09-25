package com.google.android.apps.gsa.nga.engine.understanding.p6238e;

import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.understanding.C78983aj;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80513b;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82859db;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82860dc;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82861dd;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82862de;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.e.n */
/* compiled from: PG */
public final /* synthetic */ class C79100n implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C79086ak f217482a;

    /* renamed from: b */
    public final /* synthetic */ C74965n f217483b;

    public /* synthetic */ C79100n(C79086ak akVar, C74965n nVar) {
        this.f217482a = akVar;
        this.f217483b = nVar;
    }

    public final void accept(Object obj) {
        C79086ak akVar = this.f217482a;
        C74965n nVar = this.f217483b;
        C78983aj ajVar = (C78983aj) obj;
        if (!ajVar.mo73747b().isEmpty()) {
            C82859db dbVar = (C82859db) C82862de.f225943b.createBuilder();
            C82860dc dcVar = (C82860dc) C82861dd.f225934g.createBuilder();
            String c = ajVar.mo73746a().mo71152e().mo71141c().mo71146c();
            dcVar.copyOnWrite();
            C82861dd ddVar = (C82861dd) dcVar.instance;
            c.getClass();
            ddVar.f225936a |= 1;
            ddVar.f225937b = c;
            boolean o = ajVar.mo73746a().mo71162o();
            dcVar.copyOnWrite();
            C82861dd ddVar2 = (C82861dd) dcVar.instance;
            ddVar2.f225936a |= 2;
            ddVar2.f225938c = o;
            boolean isPresent = ajVar.mo73746a().mo71152e().mo71141c().mo71145b().isPresent();
            dcVar.copyOnWrite();
            C82861dd ddVar3 = (C82861dd) dcVar.instance;
            ddVar3.f225936a |= 16;
            ddVar3.f225941f = isPresent;
            C80513b bVar = (C80513b) ajVar.mo73747b().get();
            dcVar.copyOnWrite();
            C82861dd ddVar4 = (C82861dd) dcVar.instance;
            bVar.getClass();
            ddVar4.f225939d = bVar;
            ddVar4.f225936a |= 4;
            C82861dd ddVar5 = (C82861dd) dcVar.build();
            dbVar.copyOnWrite();
            C82862de deVar = (C82862de) dbVar.instance;
            ddVar5.getClass();
            deVar.mo76627a();
            deVar.f225945a.add(ddVar5);
            C82862de deVar2 = (C82862de) dbVar.build();
            C83334w wVar = akVar.f217449e;
            C82887ec ecVar = C82887ec.INTENT_GENERATORS_SENSITIVE;
            C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
            dzVar.copyOnWrite();
            C82885ea eaVar = (C82885ea) dzVar.instance;
            deVar2.getClass();
            eaVar.f225980b = deVar2;
            eaVar.f225979a = 26;
            wVar.mo75545c(ecVar, (C82885ea) dzVar.build(), nVar.mo71336k());
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
