package com.google.android.apps.gsa.shared.util.p7159c;

import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60873d;

/* renamed from: com.google.android.apps.gsa.shared.util.c.ac */
/* compiled from: PG */
final class C90869ac extends C60873d {

    /* renamed from: a */
    C58485gu f254075a;

    public C90869ac(C58485gu guVar) {
        this.f254075a = guVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo46268a() {
        C58485gu guVar = this.f254075a;
        this.f254075a = null;
        if (guVar != null && (this.value instanceof C60873d.C60875b)) {
            boolean q = mo57359q();
            int size = guVar.size();
            for (int i = 0; i < size; i++) {
                ((C60870cx) guVar.get(i)).cancel(q);
            }
        }
    }
}
