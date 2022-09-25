package com.google.android.apps.gsa.staticplugins.p7816dl.p7820d;

import com.google.android.apps.gsa.staticplugins.p7816dl.p7819c.C99679d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.children.p1913b.C23219p;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23265j;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23269n;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23272q;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.dl.d.s */
/* compiled from: PG */
public final class C99711s implements C99679d, C23252b {

    /* renamed from: a */
    public final C23251a f279021a;

    /* renamed from: b */
    public final C23251a f279022b;

    /* renamed from: c */
    public final C23251a f279023c;

    /* renamed from: d */
    public final C23251a f279024d;

    /* renamed from: e */
    public final C23251a f279025e;

    /* renamed from: f */
    public final C23251a f279026f;

    /* renamed from: g */
    public final C23251a f279027g;

    /* renamed from: h */
    public final C23251a f279028h;

    /* renamed from: i */
    public final C23219p f279029i;

    /* renamed from: j */
    public final C23251a f279030j;

    /* renamed from: k */
    public final C23251a f279031k;

    /* renamed from: l */
    private final C23251a f279032l;

    /* renamed from: m */
    private final List f279033m;

    public C99711s(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        C22945j jVar2 = jVar;
        C23251a aVar2 = new C23251a(jVar2, "contentState", new C23268m(new C23269n()), false, true, false);
        this.f279021a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(jVar2, "isFetchingViewVisibility", new C23256a(), false, true, false);
        this.f279022b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(jVar2, "isRestoringState", new C23256a(), false, true, false);
        this.f279023c = aVar4;
        aVar.mo28530a(aVar4);
        C23251a aVar5 = new C23251a(jVar2, "partialUpdate", new C23256a(), false, true, false);
        this.f279024d = aVar5;
        aVar.mo28530a(aVar5);
        C23251a aVar6 = new C23251a(jVar2, "partnerPackageName", new C23272q(), false, true, false);
        this.f279032l = aVar6;
        aVar.mo28530a(aVar6);
        C23251a aVar7 = new C23251a(jVar2, "playerMaxHeightLandscapePx", new C23265j(), false, true, false);
        this.f279025e = aVar7;
        aVar.mo28530a(aVar7);
        C23251a aVar8 = new C23251a(jVar2, "playerMaxWidthPortraitPx", new C23265j(), false, true, false);
        this.f279026f = aVar8;
        aVar.mo28530a(aVar8);
        C23251a aVar9 = new C23251a(jVar2, "playerType", new C23265j(), false, true, false);
        this.f279027g = aVar9;
        aVar.mo28530a(aVar9);
        C23251a aVar10 = new C23251a(jVar2, "remoteViews", new C23268m(new C23269n()), false, true, false);
        this.f279028h = aVar10;
        aVar.mo28530a(aVar10);
        this.f279029i = new C23219p("videoChild", jVar, false);
        C22945j jVar3 = jVar;
        C23251a aVar11 = new C23251a(jVar3, "videoUrl", new C23272q(), false, true, false);
        this.f279030j = aVar11;
        aVar.mo28530a(aVar11);
        C23251a aVar12 = new C23251a(jVar3, "viewportTopBound", new C23265j(), false, true, false);
        this.f279031k = aVar12;
        aVar.mo28530a(aVar12);
        this.f279033m = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f279033m;
    }
}
