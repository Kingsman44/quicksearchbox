package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d;

import android.view.View;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14742l;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14597pc;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.d.cs */
/* compiled from: PG */
public final /* synthetic */ class C15236cs implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C15241cx f45726a;

    public /* synthetic */ C15236cs(C15241cx cxVar) {
        this.f45726a = cxVar;
    }

    public final void onClick(View view) {
        C15241cx cxVar = this.f45726a;
        C14597pc pcVar = cxVar.f45739i;
        if (pcVar != null) {
            cxVar.f45732b.mo21875g(C14742l.m31051g(pcVar.f44125b));
            return;
        }
        C59104x c = C15241cx.f45731a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Morris.OngoingCallRndr");
        ((C59052c) ((C59052c) c).mo56372aa(46030)).mo56386p("Unable to end call, unknown current task!");
    }
}
