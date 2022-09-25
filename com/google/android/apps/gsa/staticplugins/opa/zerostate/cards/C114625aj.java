package com.google.android.apps.gsa.staticplugins.opa.zerostate.cards;

import android.view.View;
import com.google.assistant.p3994s.p3995a.C53115by;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.aj */
/* compiled from: PG */
public final /* synthetic */ class C114625aj implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C114626ak f317996a;

    /* renamed from: b */
    public final /* synthetic */ int f317997b;

    public /* synthetic */ C114625aj(C114626ak akVar, int i) {
        this.f317996a = akVar;
        this.f317997b = i;
    }

    public final void onClick(View view) {
        C114626ak akVar = this.f317996a;
        int i = this.f317997b;
        C114629an anVar = akVar.f318001d;
        if (anVar != null) {
            C53115by[] byVarArr = akVar.f318000c;
            if (i < byVarArr.length) {
                anVar.mo101477b(byVarArr[i]);
                akVar.f317999b.dismiss();
            }
        }
        ((C59052c) ((C59052c) C114626ak.f317998a.mo56226d()).mo56372aa(29281)).mo56386p("Click handler is not provided to Overflow menu.");
        akVar.f317999b.dismiss();
    }
}
