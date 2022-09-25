package com.google.android.apps.gsa.assistant.settings.features.p553aj;

import android.content.Intent;
import android.view.View;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;
import com.google.android.libraries.assistant.p1535p.C18509a;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.aj.o */
/* compiled from: PG */
public final /* synthetic */ class C10156o implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C10166y f34540a;

    public /* synthetic */ C10156o(C10166y yVar) {
        this.f34540a = yVar;
    }

    public final void onClick(View view) {
        Intent intent;
        C10166y yVar = this.f34540a;
        if (yVar.f34553a.mo79746e(C90059dk.f249067ad)) {
            intent = new Intent("android.intent.action.APPLICATION_PREFERENCES").setPackage("com.google.android.apps.nexuslauncher").putExtra(":settings:fragment_args_key", "pref_smartspace").addFlags(268468224);
        } else {
            C18509a aVar = (C18509a) yVar.f34556d.mo17428b();
            aVar.mo24024f("ambient_assistant");
            intent = aVar.mo24020b().mo24031a();
        }
        yVar.startActivityForResult(intent, 0);
    }
}
