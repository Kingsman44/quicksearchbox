package com.google.android.libraries.gcoreclient.p1800v.p1801a.p1802a;

import com.google.android.gms.common.data.C143864d;
import com.google.android.gms.people.p10855b.C145642a;
import java.util.Collections;
import java.util.Iterator;

@Deprecated
/* renamed from: com.google.android.libraries.gcoreclient.v.a.a.b */
/* compiled from: PG */
public final class C21701b implements Iterable {

    /* renamed from: a */
    public final C145642a f60019a;

    public C21701b(C145642a aVar) {
        this.f60019a = aVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo27071a(int i) {
        return new C21702c(this.f60019a.mo119329d(i));
    }

    public final Iterator iterator() {
        C145642a aVar = this.f60019a;
        return aVar != null ? new C21700a(new C143864d(aVar)) : new C21700a(Collections.emptyList().listIterator());
    }
}
