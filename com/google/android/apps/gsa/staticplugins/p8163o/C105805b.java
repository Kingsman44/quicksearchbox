package com.google.android.apps.gsa.staticplugins.p8163o;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.o.b */
/* compiled from: PG */
public final /* synthetic */ class C105805b implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C105831c f295167a;

    /* renamed from: b */
    public final /* synthetic */ String f295168b;

    public /* synthetic */ C105805b(C105831c cVar, String str) {
        this.f295167a = cVar;
        this.f295168b = str;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C105831c cVar = this.f295167a;
        String str = this.f295168b;
        Exception exc = (Exception) obj;
        ((C59052c) ((C59052c) C105831c.f295234a.mo56225c()).mo56372aa(14050)).mo56389s("Failed to load notification icon from URI %s", str);
        cVar.f295242i.put(str, (Object) null);
        cVar.f295241h.remove(str);
    }
}
