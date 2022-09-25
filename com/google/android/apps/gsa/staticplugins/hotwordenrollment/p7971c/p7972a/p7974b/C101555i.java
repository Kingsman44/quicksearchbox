package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7974b;

import com.google.android.apps.gsa.shared.p6968aa.C89057m;
import com.google.android.apps.gsa.speech.hotword.p7285c.p7288c.C92367e;
import com.google.android.apps.gsa.speech.hotword.p7285c.p7288c.C92368f;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58894dd;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.b.i */
/* compiled from: PG */
public final /* synthetic */ class C101555i implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C101555i f283398a = new C101555i();

    private /* synthetic */ C101555i() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C89057m mVar = (C89057m) obj;
        C92367e a = C92368f.m151685a(mVar);
        ((C59052c) ((C59052c) C101560n.f283404a.mo56224b()).mo56372aa(20335)).mo56354G("#parseAuthCheckResponseFuture: httpResponse = %s, checkReadyStatusResponse = %s", mVar, a);
        if (!a.equals(C92368f.f257545a)) {
            return a;
        }
        throw new C58894dd("Exception when parsing the response of the auth token check (verify account linked) request!");
    }
}
