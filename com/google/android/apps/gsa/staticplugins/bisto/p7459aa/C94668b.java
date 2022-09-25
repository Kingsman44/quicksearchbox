package com.google.android.apps.gsa.staticplugins.bisto.p7459aa;

import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84809b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import dagger.C68214a;
import java.util.ArrayDeque;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.aa.b */
/* compiled from: PG */
public final class C94668b {

    /* renamed from: a */
    public final C84809b f264772a;

    /* renamed from: b */
    public final C68214a f264773b;

    /* renamed from: c */
    public final C22871g f264774c;

    /* renamed from: d */
    public final ArrayDeque f264775d = new ArrayDeque();

    /* renamed from: e */
    public int f264776e;

    public C94668b(C84809b bVar, C68214a aVar, C22871g gVar) {
        this.f264772a = bVar;
        this.f264773b = aVar;
        this.f264774c = gVar;
    }

    /* renamed from: a */
    public final int mo88605a() {
        if (this.f264775d.isEmpty()) {
            return 0;
        }
        return ((Integer) this.f264775d.peek()).intValue();
    }
}
