package com.google.android.apps.gsa.search.core.state;

import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.search.core.state.ig */
/* compiled from: PG */
final class C87139ig {

    /* renamed from: a */
    final /* synthetic */ C87140ih f235426a;

    /* renamed from: b */
    private final Object f235427b;

    /* renamed from: c */
    private final int f235428c;

    /* renamed from: d */
    private final int f235429d;

    public C87139ig(C87140ih ihVar, Object obj, int i, int i2) {
        this.f235426a = ihVar;
        this.f235427b = obj;
        this.f235428c = i;
        this.f235429d = i2;
    }

    public final String toString() {
        List list;
        int i = this.f235428c;
        if (i != -1) {
            int[] iArr = {i};
            BitSet bitSet = new BitSet(250);
            for (int i2 = 0; i2 <= 0; i2++) {
                bitSet.set(iArr[i2]);
            }
            C87116hk hkVar = new C87116hk(bitSet);
            C87140ih ihVar = this.f235426a;
            if (ihVar.f235437g == null) {
                ihVar.f235437g = new C87117hl(ihVar.f235432b);
            }
            list = ihVar.f235437g.mo80745a(hkVar.mo80741b());
        } else {
            list = Collections.emptyList();
        }
        return String.format(Locale.US, "Observer %s notified state %s during round %d", new Object[]{this.f235427b.getClass().getSimpleName(), list.toString(), Integer.valueOf(this.f235429d)});
    }
}
