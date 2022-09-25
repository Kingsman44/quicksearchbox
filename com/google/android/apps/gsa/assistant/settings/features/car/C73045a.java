package com.google.android.apps.gsa.assistant.settings.features.car;

import android.content.DialogInterface;
import com.google.assistant.p3861at.C50029hy;
import com.google.assistant.p3861at.C50032ia;
import com.google.assistant.p3861at.C50057iz;
import com.google.assistant.p3861at.C50059ja;
import com.google.assistant.p3861at.C50060jb;
import com.google.assistant.p3861at.C50065jg;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.car.a */
/* compiled from: PG */
public final /* synthetic */ class C73045a implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C73051e f193726a;

    /* renamed from: b */
    public final /* synthetic */ C50032ia f193727b;

    public /* synthetic */ C73045a(C73051e eVar, C50032ia iaVar) {
        this.f193726a = eVar;
        this.f193727b = iaVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C73051e eVar = this.f193726a;
        C50032ia iaVar = this.f193727b;
        if (!iaVar.f130077k) {
            C58976aa aaVar = C58975e.f156826a;
            String str = iaVar.f130072f;
            return;
        }
        acw acw = (acw) acx.f128971H.createBuilder();
        C50060jb jbVar = (C50060jb) C50065jg.f130162f.createBuilder();
        C50057iz izVar = (C50057iz) C50059ja.f130153d.createBuilder();
        String str2 = iaVar.f130068b;
        izVar.copyOnWrite();
        C50059ja jaVar = (C50059ja) izVar.instance;
        str2.getClass();
        jaVar.f130155a |= 1;
        jaVar.f130156b = str2;
        C50029hy hyVar = iaVar.f130073g;
        if (hyVar == null) {
            hyVar = C50029hy.f130060d;
        }
        izVar.copyOnWrite();
        C50059ja jaVar2 = (C50059ja) izVar.instance;
        hyVar.getClass();
        jaVar2.f130157c = hyVar;
        jaVar2.f130155a |= 2;
        jbVar.copyOnWrite();
        C50065jg jgVar = (C50065jg) jbVar.instance;
        C50059ja jaVar3 = (C50059ja) izVar.build();
        jaVar3.getClass();
        jgVar.f130166c = jaVar3;
        jgVar.f130164a |= 2;
        acw.copyOnWrite();
        acx acx = (acx) acw.instance;
        C50065jg jgVar2 = (C50065jg) jbVar.build();
        jgVar2.getClass();
        acx.f129006w = jgVar2;
        acx.f128984a |= 134217728;
        eVar.mo17814y((acx) acw.build(), new d(eVar));
    }
}
