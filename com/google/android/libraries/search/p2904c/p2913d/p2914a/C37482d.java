package com.google.android.libraries.search.p2904c.p2913d.p2914a;

import com.google.android.libraries.search.p2904c.C37325aa;
import com.google.android.libraries.search.p2904c.C37346ak;
import com.google.android.libraries.search.p2904c.p2933j.C37772b;
import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.search.c.d.a.d */
/* compiled from: PG */
public final class C37482d {

    /* renamed from: a */
    private static final C59071e f99510a = C59071e.m91332i("com.google.android.libraries.search.c.d.a.d");

    /* renamed from: b */
    private final C37490l f99511b;

    public C37482d(C37490l lVar) {
        this.f99511b = lVar;
    }

    /* renamed from: a */
    public final C37325aa mo40984a(C37346ak akVar) {
        C59104x b = f99510a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.AFClient");
        C59052c cVar = (C59052c) ((C59052c) b).mo56372aa(52688);
        C37773c cVar2 = akVar.f99203e;
        if (cVar2 == null) {
            cVar2 = C37773c.f100243c;
        }
        cVar.mo56389s("#audio# acquire audio focus for client(%s)", C37772b.m66674a(cVar2.f100245a).name());
        return this.f99511b.mo40987a(akVar);
    }
}
