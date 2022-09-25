package com.google.android.libraries.lens.view.p2070an.p2072b;

import com.google.p4017at.p4056g.p4057a.p4058a.C53984as;
import com.google.p4017at.p4056g.p4057a.p4058a.C54002bj;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56243ax;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56244ay;

/* renamed from: com.google.android.libraries.lens.view.an.b.w */
/* compiled from: PG */
public final /* synthetic */ class C25425w implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C25396af f69286a;

    public /* synthetic */ C25425w(C25396af afVar) {
        this.f69286a = afVar;
    }

    public final void run() {
        C25396af afVar = this.f69286a;
        if (afVar.f69194p) {
            C53984as asVar = (C53984as) C54002bj.f141677q.createBuilder();
            C56243ax axVar = (C56243ax) C56244ay.f149802e.createBuilder();
            long j = afVar.f69191m;
            axVar.copyOnWrite();
            C56244ay ayVar = (C56244ay) axVar.instance;
            ayVar.f149804a |= 1;
            ayVar.f149805b = j;
            asVar.copyOnWrite();
            C56244ay ayVar2 = (C56244ay) axVar.build();
            ayVar2.getClass();
            ((C54002bj) asVar.instance).f141679a = ayVar2;
            afVar.f69184f.mo30209a((C54002bj) asVar.build());
            afVar.mo30442j();
        }
    }
}
