package com.google.android.apps.gsa.staticplugins.opa.ambient.activity;

import android.view.View;
import androidx.activity.result.C0816c;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.libraries.assistant.p1535p.C18509a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.activity.d */
/* compiled from: PG */
public final /* synthetic */ class C106406d implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C106410h f296812a;

    public /* synthetic */ C106406d(C106410h hVar) {
        this.f296812a = hVar;
    }

    public final void onClick(View view) {
        C106410h hVar = this.f296812a;
        if (hVar.f296823h.mo79746e(C90017bw.f247863E)) {
            C0816c cVar = hVar.f296831p;
            C18509a aVar = (C18509a) hVar.f296825j.mo17428b();
            aVar.mo24024f("ambient_assistant");
            cVar.mo526b(aVar.mo24020b().mo24031a());
            return;
        }
        hVar.f296826k.mo86769g();
    }
}
