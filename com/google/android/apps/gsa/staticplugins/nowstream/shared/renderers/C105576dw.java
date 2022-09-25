package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105433c;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23272q;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.dw */
/* compiled from: PG */
public final class C105576dw implements C105433c, C23252b {

    /* renamed from: a */
    public final C23251a f294533a;

    /* renamed from: b */
    public final C23251a f294534b;

    /* renamed from: c */
    public final C23251a f294535c;

    /* renamed from: d */
    private final List f294536d;

    public C105576dw(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        C22945j jVar2 = jVar;
        C23251a aVar2 = new C23251a(jVar2, "actionLabel", new C23272q(), false, true, false);
        this.f294533a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(jVar2, "message", new C23272q(), false, true, false);
        this.f294534b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(jVar2, "title", new C23272q(), false, true, false);
        this.f294535c = aVar4;
        aVar.mo28530a(aVar4);
        this.f294536d = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f294536d;
    }
}
