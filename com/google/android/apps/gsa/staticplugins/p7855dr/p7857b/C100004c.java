package com.google.android.apps.gsa.staticplugins.p7855dr.p7857b;

import com.google.android.apps.gsa.shared.monet.p7070b.p7073ab.p7074a.C90180e;
import com.google.android.apps.gsa.staticplugins.p7855dr.p7858c.C100031d;
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
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23265j;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23269n;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.ImmutableListUtils;
import com.google.protobuf.C62921ba;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.dr.b.c */
/* compiled from: PG */
public final class C100004c implements C100031d, C23252b {

    /* renamed from: a */
    private final C23186f f279679a;

    /* renamed from: b */
    private final C23251a f279680b;

    /* renamed from: c */
    private final C23186f f279681c;

    /* renamed from: d */
    private final C23186f f279682d;

    /* renamed from: e */
    private final C23251a f279683e;

    /* renamed from: f */
    private final C23251a f279684f;

    /* renamed from: g */
    private final C23251a f279685g;

    /* renamed from: h */
    private final C23251a f279686h;

    /* renamed from: i */
    private final C23251a f279687i;

    /* renamed from: j */
    private final C23251a f279688j;

    /* renamed from: k */
    private final C23251a f279689k;

    /* renamed from: l */
    private final C23251a f279690l;

    /* renamed from: m */
    private final List f279691m;

    public C100004c(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        this.f279679a = new C23186f("actions", cVar, true);
        C23251a aVar2 = new C23251a(cVar, "enabledFeatures", new C23271p(C90180e.f251949c.getParserForType(), C62921ba.m95368a(), C90180e.f251949c), true, false, false);
        this.f279680b = aVar2;
        aVar.mo28530a(aVar2);
        this.f279681c = new C23186f("messages", cVar, true);
        this.f279682d = new C23186f("nativeViews", cVar, true);
        C23052c cVar2 = cVar;
        C23251a aVar3 = new C23251a(cVar2, "scrollPadding", new ImmutableListUtils(C100003b.f279678a), true, false, false);
        this.f279683e = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(cVar2, "scrollPosition", new C23265j(), true, false, false);
        this.f279684f = aVar4;
        aVar.mo28530a(aVar4);
        C23251a aVar5 = new C23251a(cVar2, "showActionCards", new C23256a(), true, false, false);
        this.f279685g = aVar5;
        aVar.mo28530a(aVar5);
        C23251a aVar6 = new C23251a(cVar2, "showMessageCards", new C23256a(), true, false, false);
        this.f279686h = aVar6;
        aVar.mo28530a(aVar6);
        C23251a aVar7 = new C23251a(cVar2, "showNativeViews", new C23256a(), true, false, false);
        this.f279687i = aVar7;
        aVar.mo28530a(aVar7);
        C23251a aVar8 = new C23251a(cVar2, "showWebView", new C23256a(), true, false, false);
        this.f279688j = aVar8;
        aVar.mo28530a(aVar8);
        C23251a aVar9 = new C23251a(cVar2, "supportsActionsFully", new C23256a(), true, false, false);
        this.f279689k = aVar9;
        aVar.mo28530a(aVar9);
        C23251a aVar10 = new C23251a(cVar2, "webView", new C23268m(new C23269n()), true, false, false);
        this.f279690l = aVar10;
        aVar.mo28530a(aVar10);
        this.f279691m = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f279691m;
    }

    /* renamed from: b */
    public final /* synthetic */ C23248a mo91701b() {
        return this.f279679a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23248a mo91702c() {
        return this.f279681c;
    }

    /* renamed from: d */
    public final /* synthetic */ C23248a mo91703d() {
        return this.f279682d;
    }

    /* renamed from: e */
    public final /* synthetic */ C23250b mo91704e() {
        return this.f279683e;
    }

    /* renamed from: f */
    public final /* synthetic */ C23250b mo91705f() {
        return this.f279684f;
    }

    /* renamed from: g */
    public final /* synthetic */ C23250b mo91706g() {
        return this.f279685g;
    }

    /* renamed from: h */
    public final /* synthetic */ C23250b mo91707h() {
        return this.f279686h;
    }

    /* renamed from: i */
    public final /* synthetic */ C23250b mo91708i() {
        return this.f279687i;
    }

    /* renamed from: j */
    public final /* synthetic */ C23250b mo91709j() {
        return this.f279688j;
    }

    /* renamed from: k */
    public final /* synthetic */ C23250b mo91710k() {
        return this.f279689k;
    }

    /* renamed from: l */
    public final /* synthetic */ C23250b mo91711l() {
        return this.f279690l;
    }

    /* renamed from: m */
    public final /* synthetic */ C23251a mo91712m() {
        return this.f279680b;
    }
}
