package com.google.android.apps.gsa.nowoverlayservice;

import android.content.Context;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C87677ae;
import com.google.android.apps.gsa.search.shared.service.C88486g;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.libraries.gsa.p1859d.p1861b.C22756b;
import com.google.common.p4552o.amo;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.bl */
/* compiled from: PG */
public final class C83478bl extends C22756b {

    /* renamed from: a */
    private final C87673aa f227617a;

    /* renamed from: b */
    private boolean f227618b = false;

    /* renamed from: c */
    private boolean f227619c = false;

    public C83478bl(Context context, C87677ae aeVar) {
        C88486g gVar = new C88486g();
        gVar.f239199a = 4398046543873L;
        gVar.f239201c = amo.SEARCH_API_SERVICE;
        gVar.f239204f = "search";
        ClientConfig clientConfig = new ClientConfig(gVar);
        C83477bk bkVar = new C83477bk(context);
        this.f227617a = aeVar.mo81958a(bkVar, bkVar, clientConfig);
    }

    /* renamed from: a */
    public final void mo27980a() {
        if (this.f227618b) {
            this.f227617a.mo81948t(false);
            this.f227617a.mo81933e();
            this.f227618b = false;
        }
    }

    /* renamed from: b */
    public final void mo27981b(boolean z) {
        if (this.f227619c && this.f227618b) {
            this.f227617a.mo81943o(z);
        }
    }

    /* renamed from: c */
    public final void mo27982c(boolean z) {
        this.f227619c = z;
        if (!this.f227618b && z) {
            this.f227617a.mo81932c();
            this.f227617a.mo81944p();
            this.f227618b = true;
        }
    }
}
