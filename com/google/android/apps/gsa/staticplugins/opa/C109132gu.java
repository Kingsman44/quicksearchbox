package com.google.android.apps.gsa.staticplugins.opa;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108369gd;
import com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120948d;
import com.google.assistant.p3897e.p3921j.ady;
import com.google.assistant.p3931f.p3940d.p3941a.C52856af;
import com.google.assistant.p3931f.p3940d.p3941a.C52857ag;
import com.google.assistant.p3931f.p3940d.p3941a.C52858ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.gu */
/* compiled from: PG */
public final /* synthetic */ class C109132gu implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C120948d f303899a;

    /* renamed from: b */
    public final /* synthetic */ ady f303900b;

    public /* synthetic */ C109132gu(C120948d dVar, ady ady) {
        this.f303899a = dVar;
        this.f303900b = ady;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C120948d dVar = this.f303899a;
        ady ady = this.f303900b;
        C108369gd gdVar = new C108369gd(new C109079gp(dVar, cVar));
        C52856af afVar = (C52856af) C52858ah.f138677h.createBuilder();
        C52857ag agVar = C52857ag.MOBILE;
        afVar.copyOnWrite();
        ((C52858ah) afVar.instance).f138684f = agVar.getNumber();
        dVar.mo105014c(ady, gdVar, (C52858ah) afVar.build());
        return "ActionsService background execution";
    }
}
