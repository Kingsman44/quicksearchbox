package com.google.android.apps.gsa.staticplugins.smartspace.p8767h;

import android.os.Process;
import com.google.android.apps.gsa.publicsearch.C84198a;
import com.google.android.apps.gsa.publicsearch.C84212l;
import com.google.android.apps.gsa.search.shared.service.C88486g;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.common.p4552o.amo;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.h.a */
/* compiled from: PG */
public final class C117424a implements C84198a {

    /* renamed from: a */
    private static final ClientConfig f325928a;

    static {
        C88486g gVar = new C88486g();
        gVar.f239201c = amo.SMARTSPACE;
        gVar.f239199a = 0;
        gVar.f239204f = "smartspace_generic_update_session";
        f325928a = new ClientConfig(gVar);
    }

    /* renamed from: a */
    public final ClientConfig mo77666a(int i) {
        if (i == Process.myUid()) {
            return null;
        }
        return f325928a;
    }

    /* renamed from: b */
    public final void mo77667b(C84212l lVar) {
    }
}
