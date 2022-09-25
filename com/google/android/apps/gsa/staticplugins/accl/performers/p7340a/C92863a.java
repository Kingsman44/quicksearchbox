package com.google.android.apps.gsa.staticplugins.accl.performers.p7340a;

import com.google.android.apps.p471d.p482b.p483a.C9049j;
import com.google.android.apps.p471d.p482b.p483a.C9050k;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.a.a */
/* compiled from: PG */
public final /* synthetic */ class C92863a implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C92863a f259083a = new C92863a();

    private /* synthetic */ C92863a() {
    }

    public final Object apply(Object obj) {
        C59104x b = C92864b.f259084a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ExecAppAutoPerf");
        C59052c cVar = (C59052c) ((C59052c) b).mo56372aa(13147);
        C9049j a = C9049j.m23587a(((C9050k) obj).f31266a);
        if (a == null) {
            a = C9049j.UNKNOWN;
        }
        cVar.mo56389s("#perform success - %s", a);
        return C22402a.f61894b;
    }
}
