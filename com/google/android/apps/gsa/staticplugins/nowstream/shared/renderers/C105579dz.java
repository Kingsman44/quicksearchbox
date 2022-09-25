package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105438h;
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
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.dz */
/* compiled from: PG */
public final class C105579dz implements C105438h, C23252b {

    /* renamed from: a */
    public final C23219p f294561a;

    /* renamed from: b */
    public final C23251a f294562b;

    /* renamed from: c */
    public final C23219p f294563c;

    /* renamed from: d */
    public final C23251a f294564d;

    /* renamed from: e */
    private final C23251a f294565e;

    /* renamed from: f */
    private final List f294566f;

    public C105579dz(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        this.f294561a = new C23219p("bottomSheetChild", jVar, false);
        C23251a aVar2 = new C23251a(jVar, "isPomoEnabled", new C23256a(), false, true, false);
        this.f294562b = aVar2;
        aVar.mo28530a(aVar2);
        this.f294563c = new C23219p("nowFeedChild", jVar, false);
        C22945j jVar2 = jVar;
        C23251a aVar3 = new C23251a(jVar2, "surviveOnStop", new C23256a(), false, true, false);
        this.f294565e = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(jVar2, "tabActive", new C23256a(), false, true, false);
        this.f294564d = aVar4;
        aVar.mo28530a(aVar4);
        this.f294566f = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f294566f;
    }

    /* renamed from: b */
    public final /* synthetic */ C23248a mo94599b() {
        return this.f294561a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23248a mo94600c() {
        return this.f294563c;
    }

    /* renamed from: d */
    public final /* synthetic */ C23250b mo94601d() {
        return this.f294562b;
    }

    /* renamed from: e */
    public final /* synthetic */ C23250b mo94602e() {
        return this.f294564d;
    }
}
