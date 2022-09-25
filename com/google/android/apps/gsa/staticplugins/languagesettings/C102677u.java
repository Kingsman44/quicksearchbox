package com.google.android.apps.gsa.staticplugins.languagesettings;

import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.languagesettings.u */
/* compiled from: PG */
public final class C102677u {

    /* renamed from: a */
    public static final C59071e f286597a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.languagesettings.u");

    /* renamed from: b */
    public final C102670o f286598b;

    /* renamed from: c */
    public final C22871g f286599c;

    public C102677u(C102670o oVar, C22871g gVar) {
        this.f286598b = oVar;
        this.f286599c = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo93378a(String str) {
        ((C59052c) ((C59052c) f286597a.mo56224b()).mo56372aa(20839)).mo56389s("Writing discover preferred language %s to store", str);
        return this.f286599c.mo28210j(this.f286598b.mo93376a(), "write to discover language store", new C102673q(str));
    }
}
