package com.google.android.apps.gsa.assistant.settings.features.p562ao;

import android.view.View;
import android.view.ViewGroup;
import com.google.assistant.p3861at.C50277rc;
import com.google.assistant.p3861at.C50286rl;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ao.c */
/* compiled from: PG */
public final /* synthetic */ class C10179c implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C10180d f34590a;

    /* renamed from: b */
    public final /* synthetic */ C50277rc f34591b;

    /* renamed from: c */
    public final /* synthetic */ View f34592c;

    /* renamed from: d */
    public final /* synthetic */ Function f34593d;

    public /* synthetic */ C10179c(C10180d dVar, C50277rc rcVar, View view, Function function) {
        this.f34590a = dVar;
        this.f34591b = rcVar;
        this.f34592c = view;
        this.f34593d = function;
    }

    public final void onClick(View view) {
        C10180d dVar = this.f34590a;
        C50277rc rcVar = this.f34591b;
        View view2 = this.f34592c;
        Function function = this.f34593d;
        dVar.f34594a.mo18313b(rcVar);
        ((ViewGroup) view2.getParent()).removeView(view2);
        C50286rl a = C50286rl.m85798a(rcVar.f130743b);
        if (a == null) {
            a = C50286rl.PAGE_ID_UNSPECIFIED;
        }
        ((View.OnClickListener) function.apply(a)).onClick(view);
    }
}
