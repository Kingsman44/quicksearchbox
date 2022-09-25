package com.google.android.gms.mdh.internal;

import com.google.android.gms.common.api.internal.C143784ce;
import com.google.android.gms.common.api.internal.C143796cq;
import com.google.android.gms.tasks.C146010af;
import com.google.android.libraries.gcoreclient.p1794s.p1795a.C21651p;

/* renamed from: com.google.android.gms.mdh.internal.ad */
/* compiled from: PG */
public final /* synthetic */ class C145037ad implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C145050aq f392065a;

    /* renamed from: b */
    public final /* synthetic */ C143784ce f392066b;

    /* renamed from: c */
    public final /* synthetic */ C145044ak f392067c;

    /* renamed from: d */
    public final /* synthetic */ C146010af f392068d;

    /* renamed from: e */
    public final /* synthetic */ C21651p f392069e;

    public /* synthetic */ C145037ad(C145050aq aqVar, C143784ce ceVar, C145044ak akVar, C21651p pVar, C146010af afVar) {
        this.f392065a = aqVar;
        this.f392066b = ceVar;
        this.f392067c = akVar;
        this.f392069e = pVar;
        this.f392068d = afVar;
    }

    public final void run() {
        C145050aq aqVar = this.f392065a;
        C143784ce ceVar = this.f392066b;
        C145044ak akVar = this.f392067c;
        C21651p pVar = this.f392069e;
        C146010af afVar = this.f392068d;
        C145073x xVar = aqVar.f392101d;
        C143796cq cqVar = new C143796cq();
        cqVar.f389833c = ceVar;
        cqVar.f389831a = new C145034aa(aqVar, akVar, pVar);
        cqVar.f389832b = new C145035ab(aqVar, akVar);
        cqVar.f389836f = 7512;
        xVar.mo119291v(cqVar.mo119255a()).mo122493l(aqVar.f392098a, new C145036ac(afVar));
    }
}
