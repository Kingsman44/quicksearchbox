package com.google.android.apps.gsa.staticplugins.opa.zerostate.cards;

import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3902c.p3907c.C51011db;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3994s.p3995a.C53114bx;
import com.google.assistant.p3994s.p3995a.C53115by;
import com.google.assistant.p3994s.p3995a.C53116bz;
import com.google.assistant.p3994s.p3995a.C53118ca;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.ae */
/* compiled from: PG */
final class C114620ae implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C114623ah f317975a;

    public C114620ae(C114623ah ahVar) {
        this.f317975a = ahVar;
    }

    public final void onClick(View view) {
        C53116bz bzVar = (C53116bz) C53118ca.f139194b.createBuilder();
        C53114bx bxVar = (C53114bx) C53115by.f139186f.createBuilder();
        String string = this.f317975a.f317980a.getString(R.string.zero_state_send_feedback);
        bxVar.copyOnWrite();
        C53115by byVar = (C53115by) bxVar.instance;
        string.getClass();
        byVar.f139188a |= 1;
        byVar.f139189b = string;
        C51011db dbVar = (C51011db) C51012dc.f132813k.createBuilder();
        dbVar.copyOnWrite();
        C51012dc dcVar = (C51012dc) dbVar.instance;
        dcVar.f132815a |= 2;
        dcVar.f132817c = "https://www.gstatic.com/images/icons/material/system/2x/feedback_black_48dp.png";
        C51012dc dcVar2 = (C51012dc) dbVar.build();
        bxVar.copyOnWrite();
        C53115by byVar2 = (C53115by) bxVar.instance;
        dcVar2.getClass();
        byVar2.f139190c = dcVar2;
        byVar2.f139188a |= 2;
        bxVar.copyOnWrite();
        C53115by byVar3 = (C53115by) bxVar.instance;
        byVar3.f139188a |= 8;
        byVar3.f139192e = "opa-android://send_feedback";
        C53115by byVar4 = (C53115by) bxVar.build();
        bzVar.copyOnWrite();
        C53118ca caVar = (C53118ca) bzVar.instance;
        byVar4.getClass();
        caVar.mo53960a();
        caVar.f139196a.add(byVar4);
        C114623ah ahVar = this.f317975a;
        ahVar.f317987h.mo101479a((C53118ca) bzVar.build(), ahVar.f317985f, ahVar).mo101478c();
    }
}
