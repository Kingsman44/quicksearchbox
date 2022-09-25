package com.google.android.apps.gsa.p8889z.p8893c.p8895b;

import com.google.common.base.C58839bc;
import com.google.speech.p5208h.C66610ch;
import com.google.speech.p5208h.C66611ci;

/* renamed from: com.google.android.apps.gsa.z.c.b.h */
/* compiled from: PG */
public final /* synthetic */ class C118860h implements C58839bc {

    /* renamed from: a */
    public static final /* synthetic */ C118860h f331510a = new C118860h();

    private /* synthetic */ C118860h() {
    }

    /* renamed from: a */
    public final boolean mo5941a(Object obj) {
        C66611ci ciVar = (C66611ci) obj;
        C66610ch a = C66610ch.m97260a(ciVar.f181209b);
        if (a == null) {
            a = C66610ch.IN_PROGRESS;
        }
        if (a == C66610ch.DONE_ERROR) {
            return true;
        }
        C66610ch a2 = C66610ch.m97260a(ciVar.f181209b);
        if (a2 == null) {
            a2 = C66610ch.IN_PROGRESS;
        }
        return a2 == C66610ch.DONE_SUCCESS;
    }
}
