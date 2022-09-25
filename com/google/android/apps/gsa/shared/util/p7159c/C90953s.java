package com.google.android.apps.gsa.shared.util.p7159c;

import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.shared.util.c.s */
/* compiled from: PG */
public abstract class C90953s implements C22868d {

    /* renamed from: a */
    private static final C59071e f254159a = C59071e.m91332i("com.google.android.apps.gsa.shared.util.c.s");

    /* renamed from: b */
    private final String f254160b;

    public C90953s(String str) {
        this.f254160b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo76757c(Object obj);

    /* renamed from: gl */
    public void mo17701gl(Throwable th) {
        C58976aa aaVar = C58975e.f156826a;
        mo76757c((Object) null);
    }

    /* renamed from: gm */
    public final void mo17702gm(Object obj) {
        C58976aa aaVar = C58975e.f156826a;
        if (obj == null) {
            C59052c cVar = (C59052c) f254159a.mo56226d();
            cVar.mo56378ag(C58975e.f156826a, this.f254160b);
            ((C59052c) cVar.mo56372aa(11361)).mo56386p("Null image returned");
        }
        mo76757c(obj);
    }
}
