package com.google.android.apps.gsa.assistant.settings.devices.shared;

import android.content.DialogInterface;
import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.C49897da;
import com.google.assistant.p3861at.C49898db;
import com.google.assistant.p3861at.C49902df;
import com.google.assistant.p3861at.C49903dg;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.shared.a */
/* compiled from: PG */
public final /* synthetic */ class C9728a implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C9730c f33613a;

    /* renamed from: b */
    public final /* synthetic */ String f33614b;

    /* renamed from: c */
    public final /* synthetic */ C49875cf f33615c;

    public /* synthetic */ C9728a(C9730c cVar, String str, C49875cf cfVar) {
        this.f33613a = cVar;
        this.f33614b = str;
        this.f33615c = cfVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C9730c cVar = this.f33613a;
        String str = this.f33614b;
        C49875cf cfVar = this.f33615c;
        C49902df dfVar = (C49902df) C49903dg.f129712g.createBuilder();
        dfVar.copyOnWrite();
        C49903dg dgVar = (C49903dg) dfVar.instance;
        dgVar.f129714a |= 1;
        dgVar.f129715b = str;
        dfVar.copyOnWrite();
        C49903dg dgVar2 = (C49903dg) dfVar.instance;
        dgVar2.f129716c = cfVar.f129621v;
        dgVar2.f129714a |= 2;
        dfVar.copyOnWrite();
        C49903dg dgVar3 = (C49903dg) dfVar.instance;
        dgVar3.f129717d = 2;
        dgVar3.f129714a |= 8;
        C49897da daVar = (C49897da) C49898db.f129704b.createBuilder();
        daVar.mo53372c((C49903dg) dfVar.build());
        C49898db dbVar = (C49898db) daVar.build();
        acw acw = (acw) acx.f128971H.createBuilder();
        acw.copyOnWrite();
        acx acx = (acx) acw.instance;
        dbVar.getClass();
        acx.f128991h = dbVar;
        acx.f128984a |= 32;
        cVar.mo17814y((acx) acw.build(), new C9729b(cVar));
    }
}
