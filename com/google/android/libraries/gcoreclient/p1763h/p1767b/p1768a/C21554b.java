package com.google.android.libraries.gcoreclient.p1763h.p1767b.p1768a;

import com.google.android.gms.common.data.C143861a;
import com.google.android.gms.common.data.C143864d;
import com.google.android.gms.contextmanager.C144024a;
import java.util.Collections;
import java.util.Iterator;

@Deprecated
/* renamed from: com.google.android.libraries.gcoreclient.h.b.a.b */
/* compiled from: PG */
public abstract class C21554b implements Iterable {

    /* renamed from: a */
    public final C143861a f59949a;

    protected C21554b(C143861a aVar) {
        this.f59949a = aVar;
    }

    /* renamed from: a */
    public abstract Object mo26978a(Object obj);

    /* renamed from: b */
    public final Object mo27009b(int i) {
        C143861a aVar = this.f59949a;
        if (aVar != null) {
            return mo26978a(((C144024a) aVar).mo119538e(i));
        }
        return null;
    }

    /* renamed from: c */
    public final void mo27010c() {
        C143861a aVar = this.f59949a;
        if (aVar != null) {
            aVar.mo119102b();
        }
    }

    public final Iterator iterator() {
        C143861a aVar = this.f59949a;
        return aVar != null ? new C21553a(this, new C143864d(aVar)) : new C21553a(this, Collections.emptyList().listIterator());
    }
}
