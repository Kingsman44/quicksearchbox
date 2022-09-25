package com.google.android.apps.gsa.staticplugins.p7855dr.p7859d;

import com.google.android.apps.gsa.staticplugins.p7855dr.p7858c.C100031d;
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
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23265j;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23269n;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.ImmutableListUtils;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.dr.d.b */
/* compiled from: PG */
public final class C100059b implements C100031d, C23252b {

    /* renamed from: a */
    public final C23219p f279847a;

    /* renamed from: b */
    public final C23219p f279848b;

    /* renamed from: c */
    public final C23219p f279849c;

    /* renamed from: d */
    public final C23251a f279850d;

    /* renamed from: e */
    public final C23251a f279851e;

    /* renamed from: f */
    public final C23251a f279852f;

    /* renamed from: g */
    public final C23251a f279853g;

    /* renamed from: h */
    public final C23251a f279854h;

    /* renamed from: i */
    public final C23251a f279855i;

    /* renamed from: j */
    public final C23251a f279856j;

    /* renamed from: k */
    public final C23251a f279857k;

    /* renamed from: l */
    private final List f279858l;

    public C100059b(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        this.f279847a = new C23219p("actions", jVar, false);
        this.f279848b = new C23219p("messages", jVar, false);
        this.f279849c = new C23219p("nativeViews", jVar, false);
        C22945j jVar2 = jVar;
        C23251a aVar2 = new C23251a(jVar2, "scrollPadding", new ImmutableListUtils(C100033a.f279761a), false, true, false);
        this.f279850d = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(jVar2, "scrollPosition", new C23265j(), false, true, false);
        this.f279851e = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(jVar2, "showActionCards", new C23256a(), false, true, false);
        this.f279852f = aVar4;
        aVar.mo28530a(aVar4);
        C23251a aVar5 = new C23251a(jVar2, "showMessageCards", new C23256a(), false, true, false);
        this.f279853g = aVar5;
        aVar.mo28530a(aVar5);
        C23251a aVar6 = new C23251a(jVar2, "showNativeViews", new C23256a(), false, true, false);
        this.f279854h = aVar6;
        aVar.mo28530a(aVar6);
        C23251a aVar7 = new C23251a(jVar2, "showWebView", new C23256a(), false, true, false);
        this.f279855i = aVar7;
        aVar.mo28530a(aVar7);
        C23251a aVar8 = new C23251a(jVar2, "supportsActionsFully", new C23256a(), false, true, false);
        this.f279856j = aVar8;
        aVar.mo28530a(aVar8);
        C23251a aVar9 = new C23251a(jVar2, "webView", new C23268m(new C23269n()), false, true, false);
        this.f279857k = aVar9;
        aVar.mo28530a(aVar9);
        this.f279858l = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f279858l;
    }

    /* renamed from: b */
    public final /* synthetic */ C23248a mo91701b() {
        return this.f279847a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23248a mo91702c() {
        return this.f279848b;
    }

    /* renamed from: d */
    public final /* synthetic */ C23248a mo91703d() {
        return this.f279849c;
    }

    /* renamed from: e */
    public final /* synthetic */ C23250b mo91704e() {
        return this.f279850d;
    }

    /* renamed from: f */
    public final /* synthetic */ C23250b mo91705f() {
        return this.f279851e;
    }

    /* renamed from: g */
    public final /* synthetic */ C23250b mo91706g() {
        return this.f279852f;
    }

    /* renamed from: h */
    public final /* synthetic */ C23250b mo91707h() {
        return this.f279853g;
    }

    /* renamed from: i */
    public final /* synthetic */ C23250b mo91708i() {
        return this.f279854h;
    }

    /* renamed from: j */
    public final /* synthetic */ C23250b mo91709j() {
        return this.f279855i;
    }

    /* renamed from: k */
    public final /* synthetic */ C23250b mo91710k() {
        return this.f279856j;
    }

    /* renamed from: l */
    public final /* synthetic */ C23250b mo91711l() {
        return this.f279857k;
    }

    /* renamed from: m */
    public final C23251a mo91712m() {
        throw new UnsupportedOperationException("This field can only be accessed in the controller model.");
    }
}
