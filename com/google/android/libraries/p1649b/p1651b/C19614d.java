package com.google.android.libraries.p1649b.p1651b;

import com.google.android.libraries.p1649b.p1650a.C19607d;
import com.google.android.libraries.p1649b.p1650a.C19610g;
import com.google.android.libraries.p1649b.p1655f.C19628b;
import com.google.android.libraries.p1649b.p1655f.C19629c;
import com.google.common.p4552o.p4566l.C60218r;

/* renamed from: com.google.android.libraries.b.b.d */
/* compiled from: PG */
public final class C19614d extends C19611a {

    /* renamed from: b */
    final /* synthetic */ C19618h f54582b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19614d(C19618h hVar) {
        super(hVar.f54586b, 7, C19629c.class);
        this.f54582b = hVar;
    }

    /* renamed from: b */
    public final void mo24948b(C19628b bVar) {
        C60218r rVar;
        C19607d dVar = this.f54577a;
        if (dVar.f54554a) {
            C19629c cVar = (C19629c) bVar;
            String str = cVar.f54612b;
            if (str == null || !str.equals(dVar.f54561h)) {
                C60218r rVar2 = cVar.f54611a;
                if (rVar2 == null || !rVar2.equals(this.f54577a.f54560g)) {
                    C19607d dVar2 = this.f54577a;
                    if (dVar2.f54560g != null || (rVar = cVar.f54611a) == null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        boolean f = this.f54582b.f54586b.mo24946f();
                        if (f) {
                            this.f54577a.mo24936c(C19607d.m37426d(currentTimeMillis, 5));
                            this.f54577a.mo24936c(C19607d.m37425a(currentTimeMillis, 0, 0, 0));
                        }
                        this.f54577a.mo24935b();
                        String str2 = cVar.f54612b;
                        if (str2 != null) {
                            this.f54577a.f54561h = str2;
                        }
                        C60218r rVar3 = cVar.f54611a;
                        if (rVar3 != null) {
                            this.f54577a.f54560g = rVar3;
                        }
                        C19607d dVar3 = this.f54577a;
                        dVar3.f54557d = 1;
                        dVar3.f54558e.clear();
                        dVar3.f54563j = dVar3.f54562i.nextInt();
                        dVar3.f54559f.clear();
                        dVar3.f54556c = 1;
                        if (f) {
                            C19610g gVar = this.f54582b.f54586b;
                            this.f54577a.mo24936c(C19607d.m37425a(currentTimeMillis, gVar.f54572c, gVar.f54573d, gVar.f54571b));
                            return;
                        }
                        return;
                    }
                    dVar2.f54560g = rVar;
                }
            }
        }
    }
}
