package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p682e.p683a;

import android.os.RemoteException;
import com.google.android.gearhead.sdk.assistant.C142660f;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.e.a.f */
/* compiled from: PG */
public final /* synthetic */ class C11642f implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C11642f f37607a = new C11642f();

    private /* synthetic */ C11642f() {
    }

    public final Object apply(Object obj) {
        C142660f fVar = (C142660f) obj;
        if (fVar == null) {
            ((C59052c) ((C59052c) C11646j.f37611a.mo56225c()).mo56372aa(43403)).mo56386p("Failed to notify Gearhead due to unset ICarAssistantClientCallbacks");
            return Optional.empty();
        }
        try {
            ((C59052c) ((C59052c) C11646j.f37611a.mo56224b()).mo56372aa(43401)).mo56386p("Get Gearhead DirectActionProxy");
            return Optional.m71637of(fVar.mo117443e());
        } catch (RemoteException e) {
            ((C59052c) ((C59052c) ((C59052c) C11646j.f37611a.mo56225c()).mo56382g(e)).mo56372aa(43402)).mo56386p("Gearhead getGearheadDirectActionProxy failed");
            return Optional.empty();
        }
    }
}
