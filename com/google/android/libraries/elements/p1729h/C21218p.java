package com.google.android.libraries.elements.p1729h;

import com.google.p4125ay.C54646d;
import java.util.List;

/* renamed from: com.google.android.libraries.elements.h.p */
/* compiled from: PG */
public final /* synthetic */ class C21218p implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C21219q f59538a;

    public /* synthetic */ C21218p(C21219q qVar) {
        this.f59538a = qVar;
    }

    public final void run() {
        C21219q qVar = this.f59538a;
        List a = C54646d.m87514a();
        List b = C54646d.m87515b();
        C21199ab abVar = C21199ab.COMPONENT_MATERIALIZATION;
        int i = C21213k.f59533a;
        for (C21227y yVar : C21219q.m39918a(a)) {
            yVar.mo26220b(C21199ab.NATIVE_LIBRARY_CHECK.f59483m);
            qVar.f59539a.mo26246e(qVar.f59541c, yVar.mo26219a());
        }
        for (C21227y yVar2 : C21219q.m39918a(b)) {
            yVar2.mo26220b(C21199ab.NATIVE_LIBRARY_LOAD.f59483m);
            qVar.f59539a.mo26246e(qVar.f59541c, yVar2.mo26219a());
        }
    }
}
