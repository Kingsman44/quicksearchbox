package com.google.android.apps.gsa.staticplugins.p7932f.p7937e;

import com.google.android.apps.gsa.search.core.p6519al.p6725ds.C85454d;
import com.google.android.apps.gsa.search.core.webview.C87259e;
import com.google.android.libraries.assistant.ampactions.C11046s;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.f.e.d */
/* compiled from: PG */
public final class C100706d implements C11046s {

    /* renamed from: a */
    public final Map f281578a = new HashMap();

    /* renamed from: b */
    private final C85454d f281579b;

    public C100706d(C85454d dVar) {
        this.f281579b = dVar;
    }

    /* renamed from: a */
    public final C60870cx mo19512a(String str) {
        C58976aa aaVar = C58975e.f156826a;
        mo19514c(str);
        return C60922j.m93044g(this.f281579b.mo78961c(new C87259e("Amp Actions")), new C100705c(this, str), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo19513b(String str) {
        String str2 = (String) this.f281578a.get(str);
        if (str2 == null) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        return C60922j.m93044g(this.f281579b.mo78962d(str2), C100704b.f281575a, C60826bg.f164896a);
    }

    /* renamed from: c */
    public final void mo19514c(String str) {
        C58976aa aaVar = C58975e.f156826a;
        String str2 = (String) this.f281578a.get(str);
        if (str2 != null) {
            this.f281579b.mo78969k(str2);
            this.f281578a.remove(str);
        }
    }
}
