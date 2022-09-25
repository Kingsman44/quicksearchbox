package com.google.android.libraries.assistant.auto.tng.p1008j.p1025d;

import com.google.android.libraries.assistant.auto.tng.p1008j.p1009a.C13643d;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1009a.p1010a.C13637a;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1009a.p1011b.C13641b;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.j.d.a */
/* compiled from: PG */
public final class C13709a {

    /* renamed from: a */
    private final C68214a f41815a;

    /* renamed from: b */
    private final C68214a f41816b;

    public C13709a(C68214a aVar, C68214a aVar2) {
        this.f41815a = aVar;
        this.f41816b = aVar2;
    }

    /* renamed from: a */
    public final void mo21227a(boolean z) {
        C46459k.m82829b(((C13643d) this.f41815a.mo27525b()).mo21197a(z), "Failed to set auto hotword fulfilment status", new Object[0]);
        C58976aa aaVar = C58975e.f156826a;
        ((C13637a) this.f41816b.mo27525b()).f41675a = z;
    }

    /* renamed from: b */
    public final void mo21228b(C13641b bVar) {
        C46459k.m82829b(((C13643d) this.f41815a.mo27525b()).mo21198b(bVar), "Failed to get auto hotword fulfilment status", new Object[0]);
        boolean z = bVar.f41681b;
        C58976aa aaVar = C58975e.f156826a;
        ((C13637a) this.f41816b.mo27525b()).f41676b = z;
    }
}
