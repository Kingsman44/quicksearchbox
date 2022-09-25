package com.google.android.apps.gsa.nga.engine.recognition.p6110c;

import com.google.android.apps.gsa.nga.engine.p6144ui.C78018a;
import com.google.android.apps.gsa.nga.engine.p6144ui.answer.C78070i;
import com.google.android.apps.gsa.nga.engine.p6144ui.answer.C78071j;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.logging.C28260b;
import com.google.common.p4552o.C60320od;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.aql;
import com.google.common.p4552o.aqm;
import com.google.common.p4552o.aqp;
import com.google.common.p4552o.aqs;
import com.google.common.p4552o.p4566l.C60218r;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.c.p */
/* compiled from: PG */
public final /* synthetic */ class C77597p implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C77598q f213795a;

    public /* synthetic */ C77597p(C77598q qVar) {
        this.f213795a = qVar;
    }

    public final void run() {
        C77598q qVar = this.f213795a;
        C60320od odVar = (C60320od) C60321oe.f163224i.createBuilder();
        C60218r a = C28260b.m52825a();
        odVar.copyOnWrite();
        C60321oe oeVar = (C60321oe) odVar.instance;
        a.getClass();
        oeVar.f163227b = a;
        oeVar.f163226a |= 1;
        aql aql = (aql) aqm.f159760n.createBuilder();
        aql.copyOnWrite();
        aqm aqm = (aqm) aql.instance;
        aqm.f159762a |= 4;
        aqm.f159765d = 133059;
        odVar.copyOnWrite();
        C60321oe oeVar2 = (C60321oe) odVar.instance;
        aqm aqm2 = (aqm) aql.build();
        aqm2.getClass();
        oeVar2.f163230e = aqm2;
        oeVar2.f163226a |= 16;
        aqp aqp = (aqp) aqs.f159780k.createBuilder();
        aqp.copyOnWrite();
        aqs aqs = (aqs) aqp.instance;
        aqs.f159782a |= 1;
        aqs.f159783b = 133058;
        odVar.mo57082b(aqp);
        qVar.f213800e.mo74227b((C60321oe) odVar.build());
        C78018a aVar = qVar.f213799d;
        String string = qVar.f213798c.mo75121a(qVar.f213797b.mo72021b().mo72039e()).getString(R.string.nga_greeting_speech_engine_reset, new Object[0]);
        C78070i d = C78071j.m125368d();
        d.mo73057e(string);
        d.mo73008d(true);
        aVar.mo72967f(d.mo73005a());
    }
}
