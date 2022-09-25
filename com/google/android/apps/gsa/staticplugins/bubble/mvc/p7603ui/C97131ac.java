package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui;

import android.view.View;
import com.google.android.apps.gsa.shared.p7129r.C90461c;
import com.google.android.apps.gsa.shared.p7129r.C90462d;
import com.google.common.p4526f.C59052c;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.ac */
/* compiled from: PG */
public final /* synthetic */ class C97131ac implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C97136ah f271392a;

    public /* synthetic */ C97131ac(C97136ah ahVar) {
        this.f271392a = ahVar;
    }

    public final void onClick(View view) {
        C97136ah ahVar = this.f271392a;
        ahVar.f271408f.mo90444e();
        C97146ar arVar = ahVar.f271410h;
        View view2 = ahVar.f271422t;
        C90461c cVar = new C90461c();
        cVar.f252689a = view2;
        cVar.f252699k = true;
        cVar.mo84200d("Entry point", "Sports Bubbles");
        ((C59052c) ((C59052c) C97146ar.f271451a.mo56224b()).mo56372aa(18417)).mo56386p("Launching send feedback activity.");
        C68214a aVar = arVar.f271453c;
        if (aVar == null) {
            ((C59052c) ((C59052c) C97146ar.f271451a.mo56226d()).mo56372aa(18418)).mo56386p("feedbackEntryPointLazy == null, should only happen in debug environment.");
        } else {
            ((C90462d) aVar.mo27525b()).mo84204a(arVar.f271452b, cVar);
        }
    }
}
