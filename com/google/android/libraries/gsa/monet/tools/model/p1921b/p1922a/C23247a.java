package com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a;

import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.p1886a.C22947l;
import com.google.android.libraries.gsa.monet.shared.C23118n;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;

/* renamed from: com.google.android.libraries.gsa.monet.tools.model.b.a.a */
/* compiled from: PG */
public final class C23247a implements C22947l, C23118n {

    /* renamed from: a */
    private final C23252b f63715a;

    private C23247a(C23252b bVar) {
        this.f63715a = bVar;
    }

    /* renamed from: d */
    public static void m43563d(C22945j jVar, C23252b bVar) {
        C23247a aVar = new C23247a(bVar);
        jVar.mo28343n(aVar);
        jVar.mo28312m(aVar);
    }

    /* renamed from: a */
    public final void mo28563a(C23120p pVar) {
        C23123s sVar;
        for (C23251a c : this.f63715a.mo28329a()) {
            c.mo28727c(pVar);
        }
        for (C23251a aVar : this.f63715a.mo28329a()) {
            boolean z = aVar.f63721f;
            aVar.f63721f = false;
            if (z && (sVar = aVar.f63723h) != null) {
                sVar.mo28366a(aVar.f63720e);
            }
        }
    }

    /* renamed from: b */
    public final void mo28288b() {
        for (C23251a aVar : this.f63715a.mo28329a()) {
            aVar.f63722g = false;
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void mo28289c() {
    }

    /* renamed from: h */
    public final /* synthetic */ void mo28290h() {
    }
}
