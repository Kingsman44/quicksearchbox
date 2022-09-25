package com.google.p3723ar.imp.view;

import android.view.View;
import com.google.common.base.C58817ah;

/* renamed from: com.google.ar.imp.view.j */
/* compiled from: PG */
public final /* synthetic */ class C48000j implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C47985ae f124226a;

    /* renamed from: b */
    public final /* synthetic */ C47993i f124227b;

    /* renamed from: c */
    public final /* synthetic */ View f124228c;

    public /* synthetic */ C48000j(C47985ae aeVar, C47993i iVar, View view) {
        this.f124226a = aeVar;
        this.f124227b = iVar;
        this.f124228c = view;
    }

    public final Object apply(Object obj) {
        C47985ae aeVar = this.f124226a;
        C47993i iVar = this.f124227b;
        View view = this.f124228c;
        View view2 = (View) obj;
        String str = C48004n.f124238a;
        View.nSetup(view2.f124179a, aeVar.f124193d);
        return new C48004n(new C47981aa(iVar, view, aeVar.f124192c, view2, aeVar.f124195f));
    }
}
