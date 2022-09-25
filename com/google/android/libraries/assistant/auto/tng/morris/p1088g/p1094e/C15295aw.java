package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1094e;

import android.view.View;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14742l;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.e.aw */
/* compiled from: PG */
public final /* synthetic */ class C15295aw implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C15297ay f45932a;

    public /* synthetic */ C15295aw(C15297ay ayVar) {
        this.f45932a = ayVar;
    }

    public final void onClick(View view) {
        C15297ay ayVar = this.f45932a;
        if (ayVar.f45938e.isPresent()) {
            ayVar.f45935b.mo21875g(C14742l.m31051g(ayVar.f45938e.getAsInt()));
            return;
        }
        C59104x c = C15297ay.f45934a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Morris.OngoingCallTileRndr");
        ((C59052c) ((C59052c) c).mo56372aa(46047)).mo56386p("Unable to end call, unknown current call ID!");
    }
}
