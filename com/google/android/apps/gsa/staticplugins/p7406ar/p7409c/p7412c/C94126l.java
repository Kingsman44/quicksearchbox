package com.google.android.apps.gsa.staticplugins.p7406ar.p7409c.p7412c;

import com.google.android.apps.gsa.staticplugins.p7406ar.p7409c.p7411b.C94114d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.children.p1913b.C23219p;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23248a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23272q;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.ar.c.c.l */
/* compiled from: PG */
public final class C94126l implements C94114d, C23252b {

    /* renamed from: a */
    public final C23219p f262968a;

    /* renamed from: b */
    public final C23251a f262969b;

    /* renamed from: c */
    public final C23251a f262970c;

    /* renamed from: d */
    private final List f262971d;

    public C94126l(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        this.f262968a = new C23219p("elementsChild", jVar, false);
        C22945j jVar2 = jVar;
        C23251a aVar2 = new C23251a(jVar2, "hasResults", new C23256a(), false, true, false);
        this.f262969b = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(jVar2, "headerTitleText", new C23272q(), false, true, false);
        this.f262970c = aVar3;
        aVar.mo28530a(aVar3);
        this.f262971d = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f262971d;
    }

    /* renamed from: b */
    public final /* synthetic */ C23248a mo88320b() {
        return this.f262968a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23250b mo88321c() {
        return this.f262969b;
    }

    /* renamed from: d */
    public final /* synthetic */ C23250b mo88322d() {
        return this.f262970c;
    }
}
