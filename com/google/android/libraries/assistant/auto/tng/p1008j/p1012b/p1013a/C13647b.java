package com.google.android.libraries.assistant.auto.tng.p1008j.p1012b.p1013a;

import com.google.android.gms.car.C143118bb;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1009a.C13643d;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1009a.p1010a.C13637a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.j.b.a.b */
/* compiled from: PG */
public final class C13647b {

    /* renamed from: a */
    public static final C59071e f41686a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.j.b.a.b");

    /* renamed from: b */
    public final C68214a f41687b;

    /* renamed from: c */
    public final C68214a f41688c;

    /* renamed from: d */
    private C143118bb f41689d;

    public C13647b(C68214a aVar, C68214a aVar2) {
        this.f41687b = aVar;
        this.f41688c = aVar2;
    }

    /* renamed from: c */
    private final void m29919c(boolean z) {
        C46459k.m82829b(((C13643d) this.f41687b.mo27525b()).mo21197a(z), "Failed to set auto hotword fulfilment status", new Object[0]);
        C58976aa aaVar = C58975e.f156826a;
        ((C13637a) this.f41688c.mo27525b()).f41675a = z;
    }

    /* renamed from: a */
    public final void mo21200a(C143118bb bbVar) {
        this.f41689d = bbVar;
        bbVar.mo118051a(new C13646a(this));
        m29919c(true);
    }

    /* renamed from: b */
    public final void mo21201b() {
        C143118bb bbVar = this.f41689d;
        if (bbVar != null) {
            bbVar.mo118054d();
            this.f41689d.mo118052b();
        }
        m29919c(false);
    }
}
