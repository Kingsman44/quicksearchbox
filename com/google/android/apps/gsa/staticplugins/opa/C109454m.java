package com.google.android.apps.gsa.staticplugins.opa;

import android.view.View;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.p3926e.C52040il;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.m */
/* compiled from: PG */
public final /* synthetic */ class C109454m implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C109753o f304879a;

    /* renamed from: b */
    public final /* synthetic */ C52040il f304880b;

    public /* synthetic */ C109454m(C109753o oVar, C52040il ilVar) {
        this.f304879a = oVar;
        this.f304880b = ilVar;
    }

    public final void onClick(View view) {
        C109753o oVar = this.f304879a;
        C52040il ilVar = this.f304880b;
        oVar.f305774b.mo96219b(new C88489j(C87739bu.STOP_SPEAKING).mo82013a());
        oVar.f305774b.mo96219b(new C88489j(C87739bu.STOP_LISTENING).mo82013a());
        oVar.f305774b.mo96219b(new C88489j(C87739bu.CANCEL).mo82013a());
        C109040fj fjVar = oVar.f305773a;
        C51805du duVar = ilVar.f136590d;
        if (duVar == null) {
            duVar = C51805du.f135924e;
        }
        fjVar.mo97441aC(duVar.toByteArray());
        oVar.f305773a.mo97484at();
        oVar.f305775c.mo95252d().setOnClickListener((View.OnClickListener) null);
        if (oVar.f305773a.mo97523bp()) {
            ((C109258hw) oVar.f305773a.f303236V.f303912g.mo6453a()).mo97714d();
            oVar.f305773a.mo97504bN(false);
        }
    }
}
