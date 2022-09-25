package com.google.android.libraries.p1649b.p1651b;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.p1649b.p1650a.C19607d;
import com.google.android.libraries.p1649b.p1655f.C19628b;
import com.google.android.libraries.p1649b.p1655f.C19630d;
import com.google.protos.p4816ai.p4817a.C63188b;
import com.google.protos.p4816ai.p4817a.C63192f;

/* renamed from: com.google.android.libraries.b.b.e */
/* compiled from: PG */
public final class C19615e extends C19611a {
    public C19615e(C19618h hVar) {
        super(hVar.f54586b, 4, C19630d.class);
    }

    /* renamed from: b */
    public final void mo24948b(C19628b bVar) {
        if (bVar != null && this.f54577a.f54554a) {
            C63188b bVar2 = (C63188b) C19607d.m37427e(System.currentTimeMillis(), 4).toBuilder();
            C19630d dVar = (C19630d) bVar;
            bVar2.copyOnWrite();
            C63192f fVar = (C63192f) bVar2.instance;
            fVar.f170701a |= 128;
            fVar.f170711k = 0;
            bVar2.copyOnWrite();
            C63192f fVar2 = (C63192f) bVar2.instance;
            fVar2.f170701a |= 64;
            fVar2.f170710j = 0;
            bVar2.copyOnWrite();
            C63192f fVar3 = (C63192f) bVar2.instance;
            fVar3.f170701a |= C89885b.S3REQUEST_VALUE;
            fVar3.f170716p = false;
            this.f54577a.mo24936c((C63192f) bVar2.build());
        }
    }
}
