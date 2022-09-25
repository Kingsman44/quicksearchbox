package com.google.android.libraries.gsa.monet.internal.service;

import com.google.android.libraries.gsa.monet.internal.shared.p1889a.C23032a;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23267l;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23272q;
import java.util.List;

/* renamed from: com.google.android.libraries.gsa.monet.internal.service.a */
/* compiled from: PG */
public final class C23003a implements C23032a, C23252b {

    /* renamed from: a */
    public final C23251a f63272a;

    /* renamed from: b */
    public final C23251a f63273b;

    /* renamed from: c */
    private final List f63274c;

    public C23003a(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23052c cVar2 = cVar;
        C23251a aVar2 = new C23251a(cVar2, "rootControllerUp", new C23256a(), true, false, false);
        this.f63272a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(cVar2, "scope", new C23267l(new C23272q()), true, false, false);
        this.f63273b = aVar3;
        aVar.mo28530a(aVar3);
        this.f63274c = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f63274c;
    }
}
