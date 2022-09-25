package com.google.android.libraries.gsa.monet.internal.p1887a;

import com.google.android.libraries.gsa.monet.internal.shared.p1889a.C23032a;
import com.google.android.libraries.gsa.monet.shared.C23117m;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23267l;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23272q;
import java.util.List;

/* renamed from: com.google.android.libraries.gsa.monet.internal.a.a */
/* compiled from: PG */
public final class C22956a implements C23032a, C23252b {

    /* renamed from: a */
    public final C23251a f63134a;

    /* renamed from: b */
    private final C23251a f63135b;

    /* renamed from: c */
    private final List f63136c;

    public C22956a(C23117m mVar) {
        C23087a aVar = new C23087a();
        C23251a aVar2 = new C23251a(mVar, "rootControllerUp", new C23256a(), true, false, false);
        this.f63135b = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(mVar, "scope", new C23267l(new C23272q()), true, false, false);
        this.f63134a = aVar3;
        aVar.mo28530a(aVar3);
        this.f63136c = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f63136c;
    }
}
