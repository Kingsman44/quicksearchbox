package com.google.android.apps.gsa.staticplugins.opa.p8336bf;

import android.content.DialogInterface;
import com.google.android.apps.gsa.shared.p7129r.C90461c;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108430ik;
import com.google.android.apps.gsa.staticplugins.opa.p8621x.C114513a;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bf.e */
/* compiled from: PG */
public final class C108050e implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C108430ik f300558a;

    /* renamed from: b */
    final /* synthetic */ C108051f f300559b;

    public C108050e(C108051f fVar, C108430ik ikVar) {
        this.f300559b = fVar;
        this.f300558a = ikVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.f300559b.f300563d.mo56113h()) {
            C108430ik ikVar = this.f300558a;
            C90461c cVar = new C90461c();
            cVar.f252699k = true;
            cVar.f252693e = "com.google.android.googlequicksearchbox.SUGGESTIONS_FEEDBACK_CATEGORY";
            cVar.f252713y = String.format("Title:\nDetailed feedback:\n\n\nSuggestions debug details:\n%s", new Object[]{C108051f.m179382b(ikVar.f301596A)});
            cVar.mo84200d("Suggestion feedback", "True");
            cVar.mo84199c("Suggestion debug data", C108051f.m179382b(ikVar.f301596A));
            ((C114513a) this.f300559b.f300563d.mo56107c()).mo101362b(cVar, C58833ax.m90834k("com.google.android.googlequicksearchbox.SUGGESTIONS_FEEDBACK_CATEGORY"));
        }
    }
}
