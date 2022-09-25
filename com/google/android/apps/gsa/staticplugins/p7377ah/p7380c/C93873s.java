package com.google.android.apps.gsa.staticplugins.p7377ah.p7380c;

import com.google.android.apps.gsa.staticplugins.p7377ah.p7379b.C93854d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23269n;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.ImmutableListUtils;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.ah.c.s */
/* compiled from: PG */
public final class C93873s implements C93854d, C23252b {

    /* renamed from: a */
    public final C23251a f262172a;

    /* renamed from: b */
    public final C23251a f262173b;

    /* renamed from: c */
    public final C23251a f262174c;

    /* renamed from: d */
    public final C23251a f262175d;

    /* renamed from: e */
    private final List f262176e;

    public C93873s(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        C22945j jVar2 = jVar;
        C23251a aVar2 = new C23251a(jVar2, "corporaList", new ImmutableListUtils(C93872r.f262171a), false, true, false);
        this.f262172a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(jVar2, "selectedCorpus", new C23268m(new C23269n()), false, true, false);
        this.f262173b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(jVar2, "showCorpusBar", new C23256a(), false, true, false);
        this.f262174c = aVar4;
        aVar.mo28530a(aVar4);
        C23251a aVar5 = new C23251a(jVar2, "useImprovedAccessibleCorpusBar", new C23256a(), false, true, false);
        this.f262175d = aVar5;
        aVar.mo28530a(aVar5);
        this.f262176e = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f262176e;
    }
}
