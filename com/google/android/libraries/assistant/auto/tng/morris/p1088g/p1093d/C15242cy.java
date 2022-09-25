package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d;

import android.view.View;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14742l;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14599pe;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.d.cy */
/* compiled from: PG */
public final /* synthetic */ class C15242cy implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C15243cz f45740a;

    public /* synthetic */ C15242cy(C15243cz czVar) {
        this.f45740a = czVar;
    }

    public final void onClick(View view) {
        C15243cz czVar = this.f45740a;
        C14599pe peVar = czVar.f45745e;
        if (peVar != null) {
            czVar.f45742b.mo21875g(C14742l.m31051g(peVar.f44131b));
            return;
        }
        C59104x c = C15243cz.f45741a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Morris.OutgoingCallRndr");
        ((C59052c) ((C59052c) c).mo56372aa(46031)).mo56386p("Unable to end call, unknown current task!");
    }
}
