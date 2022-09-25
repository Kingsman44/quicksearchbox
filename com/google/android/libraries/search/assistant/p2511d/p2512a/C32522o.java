package com.google.android.libraries.search.assistant.p2511d.p2512a;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.assistant.d.a.o */
/* compiled from: PG */
public final /* synthetic */ class C32522o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C32525r f87121a;

    public /* synthetic */ C32522o(C32525r rVar) {
        this.f87121a = rVar;
    }

    public final void run() {
        C32525r rVar = this.f87121a;
        if (!rVar.f87126c) {
            rVar.f87126c = true;
            for (C60870cx cancel : rVar.f87127d.values()) {
                cancel.cancel(false);
            }
            rVar.f87127d.clear();
        }
    }
}
