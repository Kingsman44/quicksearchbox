package com.google.android.apps.gsa.assistant.settings.features.calls;

import android.app.Activity;
import android.content.DialogInterface;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.assistant.p3861at.C50018hn;
import com.google.assistant.p3861at.C50019ho;
import com.google.assistant.p3861at.C50020hp;
import com.google.assistant.p3861at.C50021hq;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.calls.ay */
/* compiled from: PG */
public final /* synthetic */ class C73012ay implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ bw f193653a;

    public /* synthetic */ C73012ay(bw bwVar) {
        this.f193653a = bwVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        bw bwVar = this.f193653a;
        Activity fX = bwVar.mo17794fX();
        if (fX != null) {
            bwVar.p.a(fX, 3);
        }
        acw acw = (acw) acx.f128971H.createBuilder();
        C50018hn hnVar = (C50018hn) C50021hq.f130044d.createBuilder();
        C50019ho hoVar = (C50019ho) C50020hp.f130037f.createBuilder();
        hoVar.copyOnWrite();
        C50020hp hpVar = (C50020hp) hoVar.instance;
        hpVar.f130039a |= 1;
        hpVar.f130040b = false;
        hnVar.copyOnWrite();
        C50021hq hqVar = (C50021hq) hnVar.instance;
        C50020hp hpVar2 = (C50020hp) hoVar.build();
        hpVar2.getClass();
        hqVar.f130048c = hpVar2;
        hqVar.f130046a |= 4;
        acw.copyOnWrite();
        acx acx = (acx) acw.instance;
        C50021hq hqVar2 = (C50021hq) hnVar.build();
        hqVar2.getClass();
        acx.f129002s = hqVar2;
        acx.f128984a |= C89885b.NOW_VALUE;
        bwVar.mo17814y((acx) acw.build(), new bk(bwVar));
    }
}
