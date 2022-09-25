package com.google.android.apps.search.assistant.surfaces.dictation.service.p9448h;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.h.al */
/* compiled from: PG */
public final /* synthetic */ class C125772al implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C125773am f346606a;

    /* renamed from: b */
    public final /* synthetic */ long f346607b;

    public /* synthetic */ C125772al(C125773am amVar, long j) {
        this.f346606a = amVar;
        this.f346607b = j;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C125773am amVar = this.f346606a;
        if (amVar.f346611d.getAndSet(-1) != this.f346607b) {
            return C60866ct.f164955a;
        }
        try {
            return ((C125799w) amVar.f346609b).f346715a.mo107112d();
        } catch (Exception e) {
            return C60856cj.m92899h(e);
        }
    }
}
