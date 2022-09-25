package com.google.android.libraries.search.p2904c.p2967t.p2971c.p2972a;

import android.telephony.PhoneStateListener;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import p5462h.p5466c.C69577g;

/* renamed from: com.google.android.libraries.search.c.t.c.a.d */
/* compiled from: PG */
final class C38061d extends PhoneStateListener {

    /* renamed from: a */
    final /* synthetic */ C38070m f100844a;

    public C38061d(C38070m mVar) {
        this.f100844a = mVar;
    }

    public final void onCallStateChanged(int i, String str) {
        C59052c cVar = (C59052c) C38070m.f100861a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "ALT.MicStateReporter");
        cVar.mo56379ah(new C59094n(52948));
        cVar.mo56387q("#audio# on call state(%d) changed", i);
        C38070m mVar = this.f100844a;
        mVar.mo41237h(mVar.f100866f, "failed processing onCallStateChanged", new C38060c(mVar, i, (C69577g) null));
    }
}
