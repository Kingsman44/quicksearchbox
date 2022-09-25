package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122415bg;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122416bh;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.j.au */
/* compiled from: PG */
public final /* synthetic */ class C123000au implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C123001av f340544a;

    /* renamed from: b */
    public final /* synthetic */ long f340545b;

    /* renamed from: c */
    public final /* synthetic */ int f340546c;

    public /* synthetic */ C123000au(C123001av avVar, int i, long j) {
        this.f340544a = avVar;
        this.f340546c = i;
        this.f340545b = j;
    }

    public final Object apply(Object obj) {
        C123001av avVar = this.f340544a;
        int i = this.f340546c;
        long j = this.f340545b;
        long a = avVar.f340547a.mo26884a();
        C122415bg bgVar = (C122415bg) C122416bh.f339381d.createBuilder();
        bgVar.copyOnWrite();
        ((C122416bh) bgVar.instance).f339383a = i - 2;
        bgVar.copyOnWrite();
        ((C122416bh) bgVar.instance).f339384b = j;
        bgVar.copyOnWrite();
        ((C122416bh) bgVar.instance).f339385c = a - j;
        avVar.mo105819b((C122416bh) bgVar.build());
        return obj;
    }
}
