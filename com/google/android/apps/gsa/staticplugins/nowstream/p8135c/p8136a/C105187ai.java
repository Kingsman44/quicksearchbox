package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a;

import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105444n;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23266k;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.a.ai */
/* compiled from: PG */
public final class C105187ai implements C105444n, C23252b {

    /* renamed from: a */
    public final C23251a f293352a;

    /* renamed from: b */
    public final C23251a f293353b;

    /* renamed from: c */
    public final C23251a f293354c;

    /* renamed from: d */
    private final List f293355d;

    public C105187ai(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23052c cVar2 = cVar;
        C23251a aVar2 = new C23251a(cVar2, "isGestaltDarkThemeUi", new C23256a(), true, false, false);
        this.f293352a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(cVar2, "isGestaltNoHeaders", new C23256a(), true, false, false);
        this.f293353b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(cVar2, "lastChangeTimeMillis", new C23266k(), true, false, false);
        this.f293354c = aVar4;
        aVar.mo28530a(aVar4);
        this.f293355d = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f293355d;
    }
}
