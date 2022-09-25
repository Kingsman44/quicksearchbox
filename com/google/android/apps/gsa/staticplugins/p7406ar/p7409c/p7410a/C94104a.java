package com.google.android.apps.gsa.staticplugins.p7406ar.p7409c.p7410a;

import com.google.android.apps.gsa.staticplugins.p7406ar.p7409c.p7411b.C94114d;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23186f;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23248a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23272q;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.ar.c.a.a */
/* compiled from: PG */
public final class C94104a implements C94114d, C23252b {

    /* renamed from: a */
    private final C23186f f262914a;

    /* renamed from: b */
    private final C23251a f262915b;

    /* renamed from: c */
    private final C23251a f262916c;

    /* renamed from: d */
    private final List f262917d;

    public C94104a(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        this.f262914a = new C23186f("elementsChild", cVar, true);
        C23052c cVar2 = cVar;
        C23251a aVar2 = new C23251a(cVar2, "hasResults", new C23256a(), true, false, false);
        this.f262915b = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(cVar2, "headerTitleText", new C23272q(), true, false, false);
        this.f262916c = aVar3;
        aVar.mo28530a(aVar3);
        this.f262917d = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f262917d;
    }

    /* renamed from: b */
    public final /* synthetic */ C23248a mo88320b() {
        return this.f262914a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23250b mo88321c() {
        return this.f262915b;
    }

    /* renamed from: d */
    public final /* synthetic */ C23250b mo88322d() {
        return this.f262916c;
    }
}
