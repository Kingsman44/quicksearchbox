package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import com.google.android.apps.gsa.assistant.shared.p.i;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui.C113565h;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui.C113572o;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui.C113576s;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113427g;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113323t;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.eq */
/* compiled from: PG */
public final /* synthetic */ class C112845eq implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C112846er f312772a;

    /* renamed from: b */
    public final /* synthetic */ C113323t f312773b;

    /* renamed from: c */
    public final /* synthetic */ String f312774c;

    /* renamed from: d */
    public final /* synthetic */ C113427g f312775d;

    /* renamed from: e */
    public final /* synthetic */ C0673gh f312776e;

    public /* synthetic */ C112845eq(C112846er erVar, C113323t tVar, String str, C113427g gVar, C0673gh ghVar) {
        this.f312772a = erVar;
        this.f312773b = tVar;
        this.f312774c = str;
        this.f312775d = gVar;
        this.f312776e = ghVar;
    }

    public final void run() {
        C112846er erVar = this.f312772a;
        C113323t tVar = this.f312773b;
        String str = this.f312774c;
        C113427g gVar = this.f312775d;
        C0673gh ghVar = this.f312776e;
        ((i) erVar.f312777a.f312783f.f312793d.mo27525b()).b(tVar.mo100101d(), str);
        erVar.f312777a.f312783f.f312799j.mo99375jB();
        int bindingAdapterPosition = ghVar.getBindingAdapterPosition();
        C113572o oVar = (C113572o) gVar;
        oVar.f314465b.f313868b.remove(bindingAdapterPosition);
        ((C0640fb) gVar).notifyItemRemoved(bindingAdapterPosition);
        if (oVar.f314465b.f313868b.isEmpty()) {
            C113576s sVar = oVar.f314470g;
            C113427g gVar2 = sVar.f314475a;
            int bindingAdapterPosition2 = sVar.f314476b.getBindingAdapterPosition();
            ((C113565h) gVar2).f314448a.remove(bindingAdapterPosition2);
            ((C0640fb) gVar2).notifyItemRemoved(bindingAdapterPosition2);
        }
    }
}
