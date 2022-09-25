package com.google.android.libraries.p1649b.p1651b;

import com.google.android.libraries.p1649b.p1650a.C19607d;
import com.google.android.libraries.p1649b.p1650a.C19610g;
import com.google.android.libraries.p1649b.p1653d.C19623a;
import com.google.android.libraries.p1649b.p1655f.C19628b;
import com.google.android.libraries.p1649b.p1655f.C19632f;

/* renamed from: com.google.android.libraries.b.b.g */
/* compiled from: PG */
public final class C19617g extends C19611a {

    /* renamed from: b */
    final /* synthetic */ C19618h f54584b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19617g(C19618h hVar) {
        super(hVar.f54586b, 8, C19632f.class);
        this.f54584b = hVar;
    }

    /* renamed from: b */
    public final void mo24948b(C19628b bVar) {
        if (this.f54584b.f54586b.f54574e && bVar != null && this.f54577a.f54554a) {
            long currentTimeMillis = System.currentTimeMillis();
            C19632f fVar = (C19632f) bVar;
            C19610g gVar = this.f54584b.f54586b;
            if (gVar.f54572c != fVar.f54618a || gVar.f54573d != fVar.f54619b) {
                gVar.mo24943c();
                C19610g gVar2 = this.f54584b.f54586b;
                int i = fVar.f54618a;
                gVar2.f54572c = i;
                int i2 = fVar.f54619b;
                gVar2.f54573d = i2;
                this.f54577a.mo24936c(C19607d.m37425a(currentTimeMillis, i, i2, gVar2.f54571b));
                this.f54584b.f54587c.mo24960a(new C19623a(2), (C19628b) null);
            }
        }
    }
}
