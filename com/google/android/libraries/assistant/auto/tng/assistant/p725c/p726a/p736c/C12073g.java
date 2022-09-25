package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p736c;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p744a.p745a.C12113b;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.c.g */
/* compiled from: PG */
final class C12073g implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C12113b f38638a;

    /* renamed from: b */
    final /* synthetic */ C12074h f38639b;

    public C12073g(C12074h hVar, C12113b bVar) {
        this.f38639b = hVar;
        this.f38638a = bVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C46459k.m82829b(this.f38639b.f38644e.mo20370a(), "Error playing back microphone open failure earcon", new Object[0]);
        ((C59052c) ((C59052c) ((C59052c) C12074h.f38640a.mo56225c()).mo56382g(th)).mo56372aa(43977)).mo56386p("Error obtaining listening session");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        if (!this.f38638a.f38732g) {
            C46459k.m82829b(this.f38639b.f38644e.mo20371b(), "Error playing back microphone open success earcon", new Object[0]);
        } else {
            ((C59052c) ((C59052c) C12074h.f38640a.mo56224b()).mo56372aa(43978)).mo56386p("Mic open earcon suppressed.");
        }
    }
}
