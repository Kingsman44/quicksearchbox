package com.google.android.apps.gsa.search.core.p6517ak.p6518a;

import com.google.common.p4526f.C59052c;
import java.util.TimerTask;

/* renamed from: com.google.android.apps.gsa.search.core.ak.a.u */
/* compiled from: PG */
final class C84594u extends TimerTask {

    /* renamed from: a */
    final /* synthetic */ C84598y f230228a;

    public C84594u(C84598y yVar) {
        this.f230228a = yVar;
    }

    public final void run() {
        ((C59052c) ((C59052c) C84598y.f230232a.mo56226d()).mo56372aa(9497)).mo56386p("Time limit exceeded.");
        C84598y yVar = this.f230228a;
        yVar.onError(yVar.f230242k);
    }
}
