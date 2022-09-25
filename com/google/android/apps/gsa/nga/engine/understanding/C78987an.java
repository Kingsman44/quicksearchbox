package com.google.android.apps.gsa.nga.engine.understanding;

import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80515d;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82856cz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82858da;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.an */
/* compiled from: PG */
final class C78987an implements C22868d {

    /* renamed from: a */
    final /* synthetic */ long f217255a;

    /* renamed from: b */
    final /* synthetic */ C74965n f217256b;

    /* renamed from: c */
    final /* synthetic */ C78988ao f217257c;

    public C78987an(C78988ao aoVar, long j, C74965n nVar) {
        this.f217257c = aoVar;
        this.f217255a = j;
        this.f217256b = nVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        if (th instanceof TimeoutException) {
            ((C58970a) ((C58970a) this.f217257c.f217258a.mo56225c()).mo56372aa(5456)).mo56394x("%s timed out after %s millis.", this.f217257c.f217259b.mo73713a().getNumber(), this.f217255a);
            C78988ao aoVar = this.f217257c;
            C83320io k = this.f217256b.mo71336k();
            long j = this.f217255a;
            C82856cz czVar = (C82856cz) C82858da.f225929d.createBuilder();
            C80515d a = aoVar.f217259b.mo73713a();
            czVar.copyOnWrite();
            C82858da daVar = (C82858da) czVar.instance;
            daVar.f225932b = a.getNumber();
            daVar.f225931a |= 1;
            czVar.copyOnWrite();
            C82858da daVar2 = (C82858da) czVar.instance;
            daVar2.f225931a |= 2;
            daVar2.f225933c = j;
            C82858da daVar3 = (C82858da) czVar.build();
            C83334w wVar = aoVar.f217260c;
            C82887ec ecVar = C82887ec.UNDERSTANDING_INTENT_GENERATOR_TIMEOUT;
            C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
            dzVar.copyOnWrite();
            C82885ea eaVar = (C82885ea) dzVar.instance;
            daVar3.getClass();
            eaVar.f225980b = daVar3;
            eaVar.f225979a = 64;
            wVar.mo75545c(ecVar, (C82885ea) dzVar.build(), k);
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        C58485gu guVar = (C58485gu) obj;
    }
}
