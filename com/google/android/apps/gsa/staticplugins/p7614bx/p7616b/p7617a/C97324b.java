package com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7617a;

import com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7618b.C97356h;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23269n;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23272q;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.bx.b.a.b */
/* compiled from: PG */
public final class C97324b implements C97356h, C23252b {

    /* renamed from: a */
    public final C23251a f271847a;

    /* renamed from: b */
    public final C23251a f271848b;

    /* renamed from: c */
    public final C23251a f271849c;

    /* renamed from: d */
    private final List f271850d;

    public C97324b(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23052c cVar2 = cVar;
        C23251a aVar2 = new C23251a(cVar2, "anchorViewBounds", new C23268m(new C23269n()), true, false, false);
        this.f271847a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(cVar2, "isShowing", new C23256a(), true, false, false);
        this.f271848b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(cVar2, "text", new C23272q(), true, false, false);
        this.f271849c = aVar4;
        aVar.mo28530a(aVar4);
        this.f271850d = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f271850d;
    }
}
