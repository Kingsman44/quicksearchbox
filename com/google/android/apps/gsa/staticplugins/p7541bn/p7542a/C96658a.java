package com.google.android.apps.gsa.staticplugins.p7541bn.p7542a;

import com.google.android.apps.gsa.staticplugins.p7541bn.p7543b.C96661a;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23186f;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.bn.a.a */
/* compiled from: PG */
public final class C96658a implements C96661a, C23252b {

    /* renamed from: a */
    public final C23186f f270441a;

    /* renamed from: b */
    public final C23186f f270442b;

    /* renamed from: c */
    private final List f270443c;

    public C96658a(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        this.f270441a = new C23186f("minusOneChild", cVar, true);
        this.f270442b = new C23186f("suggestChild", cVar, true);
        this.f270443c = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f270443c;
    }
}
