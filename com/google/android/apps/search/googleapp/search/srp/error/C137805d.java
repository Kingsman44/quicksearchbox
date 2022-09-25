package com.google.android.apps.search.googleapp.search.srp.error;

import com.google.android.apps.search.googleapp.search.srp.p10435e.C137751ab;
import com.google.android.libraries.web.contrib.errorpage.C43507a;
import com.google.android.libraries.web.contrib.errorpage.p3373a.C43508a;
import com.google.android.libraries.web.contrib.errorpage.p3373a.C43512b;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.error.d */
/* compiled from: PG */
public final /* synthetic */ class C137805d implements C43507a {

    /* renamed from: a */
    public static final /* synthetic */ C137805d f374918a = new C137805d();

    private /* synthetic */ C137805d() {
    }

    /* renamed from: a */
    public final C43512b mo46576a(Throwable th) {
        C58974d dVar = C137811j.f374924a;
        if (!(th instanceof C137751ab)) {
            return null;
        }
        C43508a aVar = (C43508a) C43512b.f113627a.createBuilder();
        aVar.mo58885m(C137825x.f374971a, C137824w.ERROR_REQUEST_DATA_UNAVAILABLE);
        return (C43512b) aVar.build();
    }
}
