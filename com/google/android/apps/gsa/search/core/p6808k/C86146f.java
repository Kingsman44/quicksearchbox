package com.google.android.apps.gsa.search.core.p6808k;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.android.libraries.flashmanagement.cleardatadetector.C21387a;
import com.google.android.libraries.flashmanagement.cleardatadetector.C21388b;
import com.google.android.libraries.flashmanagement.cleardatadetector.C21389c;
import com.google.android.libraries.flashmanagement.cleardatadetector.C21390d;
import com.google.android.libraries.flashmanagement.cleardatadetector.C21391e;
import com.google.android.libraries.flashmanagement.cleardatadetector.C21392f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.k.f */
/* compiled from: PG */
public final class C86146f implements C118549h {

    /* renamed from: a */
    private final C68214a f232818a;

    public C86146f(C68214a aVar) {
        this.f232818a = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        C21391e eVar;
        C21388b bVar = (C21388b) this.f232818a.mo27525b();
        C21390d dVar = bVar.f59780a;
        C21392f fVar = dVar.f59789g;
        if (fVar.f59793a.contains(fVar.f59794b)) {
            eVar = new C21391e(fVar.f59793a.getBoolean(fVar.f59794b, false), fVar.f59793a.getLong(fVar.f59795c, C21391e.f59790a.f59792c));
        } else {
            eVar = C21391e.f59790a;
        }
        C60856cj.m92911t(C60922j.m93044g(C60856cj.m92900i(eVar), C47810es.m84963c(new C21389c(dVar)), dVar.f59785c), new C21387a(bVar), bVar.f59780a.f59785c);
        return C118826c.f331423b;
    }
}
