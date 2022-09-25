package com.google.android.libraries.assistant.p1363c.p1398g.p1434j.p1435a;

import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17477am;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17496be;
import com.google.android.libraries.search.assistant.p2498ac.p2499a.p2500a.C32432a;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.net.p4726a.p4727a.C62722b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.c.g.j.a.l */
/* compiled from: PG */
public final /* synthetic */ class C17460l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C17461m f50418a;

    /* renamed from: b */
    public final /* synthetic */ C17496be f50419b;

    public /* synthetic */ C17460l(C17461m mVar, C17496be beVar) {
        this.f50418a = mVar;
        this.f50419b = beVar;
    }

    public final void run() {
        C17461m mVar = this.f50418a;
        C17496be beVar = this.f50419b;
        if ((beVar.f50507a & 1) != 0) {
            mVar.f50421b.f50427f.mo23280l(beVar.f50508b);
            if (mVar.f50420a.compareAndSet(false, true)) {
                C17462n nVar = mVar.f50421b;
                C32432a aVar = nVar.f50424c;
                C17477am amVar = nVar.f50426e;
                C69664n.m101061g(amVar, "sessionToken");
                aVar.mo38058a(C37176a.f97049eH.mo40815i(C62722b.OK), amVar);
            }
        }
    }
}
