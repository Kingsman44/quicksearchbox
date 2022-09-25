package com.google.android.libraries.gsa.monet.tools.p1897b.p1898a.p1899a;

import com.google.android.libraries.gsa.monet.shared.C23117m;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.ImmutableListUtils;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1898a.p1899a.p1900a.C23141d;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1902c.p1903a.C23163b;
import com.google.protobuf.C62921ba;
import java.util.List;

/* renamed from: com.google.android.libraries.gsa.monet.tools.b.a.a.h */
/* compiled from: PG */
public final class C23148h implements C23252b {

    /* renamed from: a */
    public final C23251a f63498a;

    /* renamed from: b */
    public final C23251a f63499b;

    /* renamed from: c */
    private final List f63500c;

    public C23148h(C23117m mVar, String str) {
        C62921ba baVar = new C62921ba();
        baVar.mo58832e(C23163b.f63525b);
        C23251a aVar = new C23251a(mVar, str.concat("_data"), new C23271p(C23141d.f63489b.getParserForType(), baVar, C23141d.f63489b));
        this.f63498a = aVar;
        C23251a aVar2 = new C23251a(mVar, str.concat("_snapshots"), new ImmutableListUtils(C23145e.f63494a));
        this.f63499b = aVar2;
        this.f63500c = C23088b.m43271a(aVar, aVar2);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f63500c;
    }

    /* renamed from: b */
    public final int mo28590b() {
        return ((C23141d) this.f63498a.f63720e).f63491a.size();
    }

    /* renamed from: c */
    public final void mo28591c() {
        C23143c.m43325a(this.f63498a, C23146f.f63495a);
    }
}
