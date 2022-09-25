package com.google.android.apps.gsa.staticplugins.p7377ah.p7378a;

import com.google.android.apps.gsa.staticplugins.p7377ah.p7379b.C93854d;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23269n;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.ImmutableListUtils;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.ah.a.b */
/* compiled from: PG */
public final class C93848b implements C93854d, C23252b {

    /* renamed from: a */
    public final C23251a f262110a;

    /* renamed from: b */
    public final C23251a f262111b;

    /* renamed from: c */
    public final C23251a f262112c;

    /* renamed from: d */
    public final C23251a f262113d;

    /* renamed from: e */
    private final List f262114e;

    public C93848b(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23052c cVar2 = cVar;
        C23251a aVar2 = new C23251a(cVar2, "corporaList", new ImmutableListUtils(C93847a.f262109a), true, false, false);
        this.f262110a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(cVar2, "selectedCorpus", new C23268m(new C23269n()), true, false, false);
        this.f262111b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(cVar2, "showCorpusBar", new C23256a(), true, false, false);
        this.f262112c = aVar4;
        aVar.mo28530a(aVar4);
        C23251a aVar5 = new C23251a(cVar2, "useImprovedAccessibleCorpusBar", new C23256a(), true, false, false);
        this.f262113d = aVar5;
        aVar.mo28530a(aVar5);
        this.f262114e = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f262114e;
    }
}
