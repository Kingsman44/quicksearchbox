package com.google.android.libraries.lens.ondevice.p2031h;

import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.libraries.lens.ondevice.h.b */
/* compiled from: PG */
public final /* synthetic */ class C24506b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C24509e f67120a;

    public /* synthetic */ C24506b(C24509e eVar) {
        this.f67120a = eVar;
    }

    public final void run() {
        C24509e eVar = this.f67120a;
        ((C58970a) ((C58970a) C24509e.f67127a.mo56224b()).mo56372aa(48820)).mo56386p("Shutting down all cascades");
        for (C24519o c : eVar.f67131e.values()) {
            c.mo29931c();
        }
        eVar.f67131e.clear();
    }
}
