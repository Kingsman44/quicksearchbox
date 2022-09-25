package com.google.android.apps.search.assistant.platform.p9005b.p9041d.p9042a;

import androidx.p104d.p105a.C2169h;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119794ap;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119798at;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.C62912at;

/* renamed from: com.google.android.apps.search.assistant.platform.b.d.a.v */
/* compiled from: PG */
public final /* synthetic */ class C120008v implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C120012z f334150a;

    public /* synthetic */ C120008v(C120012z zVar) {
        this.f334150a = zVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C120012z zVar = this.f334150a;
        C119944aa aaVar = zVar.f334156c;
        if (aaVar.f334029d) {
            return C60856cj.m92899h(new IllegalStateException("Client is not connected"));
        }
        if (zVar.f334155b != null) {
            return C60856cj.m92899h(new IllegalStateException("Commit already started"));
        }
        C119794ap apVar = (C119794ap) C119798at.f333687d.createBuilder();
        long j = zVar.f334154a;
        apVar.copyOnWrite();
        ((C119798at) apVar.instance).f333691c = j;
        C62912at atVar = C62912at.f169862a;
        apVar.copyOnWrite();
        C119798at atVar2 = (C119798at) apVar.instance;
        atVar.getClass();
        atVar2.f333690b = atVar;
        atVar2.f333689a = 3;
        aaVar.mo104583b((C119798at) apVar.build());
        return C2169h.m6027a(new C120011y(zVar));
    }
}
