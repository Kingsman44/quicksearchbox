package com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a;

import com.google.android.libraries.search.assistant.p2786t.p2798c.C36606i;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.search.assistant.t.c.a.ab */
/* compiled from: PG */
public final /* synthetic */ class C36556ab implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C36557ac f95348a;

    public /* synthetic */ C36556ab(C36557ac acVar) {
        this.f95348a = acVar;
    }

    public final void run() {
        C36557ac acVar = this.f95348a;
        C36606i iVar = acVar.f95350b;
        if (iVar != null) {
            acVar.f95350b = null;
            iVar.mo21529a();
            return;
        }
        ((C59052c) ((C59052c) C36557ac.f95349a.mo56226d()).mo56372aa(51508)).mo56386p("destroy called before delegate created");
    }
}
