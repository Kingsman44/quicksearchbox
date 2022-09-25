package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a;

import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105438h;
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
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.a.ac */
/* compiled from: PG */
public final class C105181ac implements C105438h, C23252b {

    /* renamed from: a */
    private final C23186f f293301a;

    /* renamed from: b */
    private final C23251a f293302b;

    /* renamed from: c */
    private final C23186f f293303c;

    /* renamed from: d */
    private final C23251a f293304d;

    /* renamed from: e */
    private final C23251a f293305e;

    /* renamed from: f */
    private final List f293306f;

    public C105181ac(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        this.f293301a = new C23186f("bottomSheetChild", cVar, true);
        C23251a aVar2 = new C23251a(cVar, "isPomoEnabled", new C23256a(), true, false, false);
        this.f293302b = aVar2;
        aVar.mo28530a(aVar2);
        this.f293303c = new C23186f("nowFeedChild", cVar, true);
        C23052c cVar2 = cVar;
        C23251a aVar3 = new C23251a(cVar2, "surviveOnStop", new C23256a(), true, false, false);
        this.f293304d = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(cVar2, "tabActive", new C23256a(), true, false, false);
        this.f293305e = aVar4;
        aVar.mo28530a(aVar4);
        this.f293306f = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f293306f;
    }

    /* renamed from: b */
    public final /* synthetic */ C23248a mo94599b() {
        return this.f293301a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23248a mo94600c() {
        return this.f293303c;
    }

    /* renamed from: d */
    public final /* synthetic */ C23250b mo94601d() {
        return this.f293302b;
    }

    /* renamed from: e */
    public final /* synthetic */ C23250b mo94602e() {
        return this.f293305e;
    }
}
