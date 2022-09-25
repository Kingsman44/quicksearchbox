package com.google.android.libraries.p579ar.faceviewer.p580a.p585e;

import com.google.android.libraries.p579ar.faceviewer.p580a.p583c.C10577b;
import com.google.android.libraries.p579ar.faceviewer.p588c.C10650a;
import com.google.android.libraries.p579ar.faceviewer.p588c.C10654e;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import java.util.List;

/* renamed from: com.google.android.libraries.ar.faceviewer.a.e.at */
/* compiled from: PG */
public final class C10599at implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ List f35429a;

    /* renamed from: b */
    final /* synthetic */ C10600au f35430b;

    public C10599at(C10600au auVar, List list) {
        this.f35430b = auVar;
        this.f35429a = list;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C10600au.f35431a.mo56225c()).mo56382g(th)).mo56372aa(42292)).mo56386p("Failed to activate effect.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        ((C10650a) this.f35430b.f35441k).f35549e.f35542a.mo18637f(C10654e.RENDER_INIT);
        ((C10650a) this.f35430b.f35441k).f35549e.f35542a.mo18636e();
        C10577b bVar = ((C10650a) this.f35430b.f35441k).f35549e.f35542a;
        bVar.f35391d = (String) this.f35429a.get(0);
        bVar.f35392e++;
        bVar.mo18637f(C10654e.ASSET_SWITCH);
        bVar.mo18638g(C10654e.ASSET);
    }
}
