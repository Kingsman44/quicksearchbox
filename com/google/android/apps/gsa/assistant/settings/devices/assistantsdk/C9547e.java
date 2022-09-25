package com.google.android.apps.gsa.assistant.settings.devices.assistantsdk;

import android.content.DialogInterface;
import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.C49902df;
import com.google.assistant.p3861at.C49903dg;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.assistantsdk.e */
/* compiled from: PG */
final class C9547e implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C9549g f33078a;

    public C9547e(C9549g gVar) {
        this.f33078a = gVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C9549g gVar = this.f33078a;
        if (gVar.f33082k != null) {
            C49902df dfVar = (C49902df) C49903dg.f129712g.createBuilder();
            String str = gVar.f33082k;
            dfVar.copyOnWrite();
            C49903dg dgVar = (C49903dg) dfVar.instance;
            str.getClass();
            dgVar.f129714a |= 1;
            dgVar.f129715b = str;
            C49875cf cfVar = C49875cf.ASSISTANT_SDK;
            dfVar.copyOnWrite();
            C49903dg dgVar2 = (C49903dg) dfVar.instance;
            dgVar2.f129716c = cfVar.f129621v;
            dgVar2.f129714a |= 2;
            dfVar.copyOnWrite();
            C49903dg dgVar3 = (C49903dg) dfVar.instance;
            dgVar3.f129717d = 2;
            dgVar3.f129714a |= 8;
            gVar.mo17866H((C49903dg) dfVar.build(), new C9548f(gVar));
        }
    }
}
