package com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e;

import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3124a.C40137i;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.e.u */
/* compiled from: PG */
public final /* synthetic */ class C40240u implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C40165ak f105706a;

    public /* synthetic */ C40240u(C40165ak akVar) {
        this.f105706a = akVar;
    }

    public final void run() {
        C40165ak akVar = this.f105706a;
        if (akVar.f105511r == null || akVar.f105512s == null || akVar.f105514u == null) {
            ((C59052c) ((C59052c) C40165ak.f105489a.mo56225c()).mo56372aa(53235)).mo56386p("onClick: called without onCreate()");
        } else if (akVar.mo42284o()) {
            C28443m mVar = akVar.f105505l;
            C28442l a = C28442l.m53142h().mo33894a();
            C28439i iVar = akVar.f105518y.f105747b;
            iVar.getClass();
            mVar.mo33853c(a, iVar);
            akVar.f105510q.mo42180c();
        } else {
            C28443m mVar2 = akVar.f105505l;
            C28442l a2 = C28442l.m53142h().mo33894a();
            C28439i iVar2 = akVar.f105517x.f105747b;
            iVar2.getClass();
            mVar2.mo33853c(a2, iVar2);
            akVar.f105510q.mo42178a();
            C40137i iVar3 = akVar.f105512s;
            iVar3.f105424e.mo42257d(iVar3);
        }
    }
}
