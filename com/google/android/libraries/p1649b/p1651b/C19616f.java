package com.google.android.libraries.p1649b.p1651b;

import com.google.android.libraries.p1649b.p1650a.C19607d;
import com.google.android.libraries.p1649b.p1650a.C19610g;
import com.google.android.libraries.p1649b.p1653d.C19623a;
import com.google.android.libraries.p1649b.p1655f.C19628b;
import com.google.android.libraries.p1649b.p1655f.C19632f;

/* renamed from: com.google.android.libraries.b.b.f */
/* compiled from: PG */
public final class C19616f extends C19611a {

    /* renamed from: b */
    final /* synthetic */ C19618h f54583b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19616f(C19618h hVar) {
        super(hVar.f54586b, 5, C19632f.class);
        this.f54583b = hVar;
    }

    /* renamed from: b */
    public final void mo24948b(C19628b bVar) {
        if (this.f54577a.f54554a && !this.f54583b.f54586b.mo24946f()) {
            C19610g gVar = this.f54583b.f54586b;
            gVar.f54574e = true;
            if (bVar != null) {
                C19632f fVar = (C19632f) bVar;
                gVar.f54572c = fVar.f54618a;
                gVar.f54573d = fVar.f54619b;
                gVar.f54571b = 0;
                if (!gVar.mo24946f()) {
                    return;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            C19610g gVar2 = this.f54583b.f54586b;
            this.f54577a.mo24936c(C19607d.m37425a(currentTimeMillis, gVar2.f54572c, gVar2.f54573d, gVar2.f54571b));
            C19619i iVar = this.f54583b.f54589e;
            if (iVar != null) {
                iVar.mo24947a(new C19623a(5), (C19628b) null);
            }
        }
    }
}
