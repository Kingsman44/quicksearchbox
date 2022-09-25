package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1089a;

import android.view.View;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14742l;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.a.j */
/* compiled from: PG */
public final /* synthetic */ class C15090j implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C15093m f45294a;

    public /* synthetic */ C15090j(C15093m mVar) {
        this.f45294a = mVar;
    }

    public final void onClick(View view) {
        C15093m mVar = this.f45294a;
        if (mVar.f45300d.isPresent()) {
            mVar.f45298b.mo21875g(C14742l.m31051g(mVar.f45300d.getAsInt()));
            return;
        }
        C59104x c = C15093m.f45297a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Morris.CallFullRend");
        ((C59052c) ((C59052c) c).mo56372aa(45944)).mo56386p("Unable to end call, unknown current call ID!");
    }
}
