package com.google.android.apps.gsa.staticplugins.p7845do.p7846a;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.do.a.aa */
/* compiled from: PG */
public final /* synthetic */ class C99901aa implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C99902ab f279468a;

    /* renamed from: b */
    public final /* synthetic */ int f279469b;

    public /* synthetic */ C99901aa(C99902ab abVar, int i) {
        this.f279468a = abVar;
        this.f279469b = i;
    }

    public final void run() {
        C99902ab abVar = this.f279468a;
        int i = this.f279469b;
        if (i < 0 || i >= 100) {
            abVar.f279470a.f279494o.mo83702b(C89849ae.SILKYTAB_PAGE_LOAD_END);
            ((C23251a) abVar.f279470a.f279481b.mo91662d()).mo28730f(false, false);
            return;
        }
        abVar.f279470a.f279494o.mo83702b(C89849ae.SILKYTAB_PAGE_LOAD_START);
        ((C23251a) abVar.f279470a.f279481b.mo91663e()).mo28730f(Integer.valueOf(i), false);
        ((C23251a) abVar.f279470a.f279481b.mo91662d()).mo28730f(true, false);
    }
}
