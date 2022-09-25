package com.google.android.apps.gsa.staticplugins.p7855dr.p7859d;

import com.google.android.apps.gsa.staticplugins.p7855dr.p7858c.C100032e;
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
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.dr.d.c */
/* compiled from: PG */
public final class C100060c implements C100032e, C23252b {

    /* renamed from: a */
    public final C23219p f279859a;

    /* renamed from: b */
    public final C23219p f279860b;

    /* renamed from: c */
    public final C23251a f279861c;

    /* renamed from: d */
    public final C23251a f279862d;

    /* renamed from: e */
    public final C23251a f279863e;

    /* renamed from: f */
    public final C23219p f279864f;

    /* renamed from: g */
    public final C23251a f279865g;

    /* renamed from: h */
    public final C23251a f279866h;

    /* renamed from: i */
    public final C23251a f279867i;

    /* renamed from: j */
    public final C23251a f279868j;

    /* renamed from: k */
    public final C23219p f279869k;

    /* renamed from: l */
    public final C23251a f279870l;

    /* renamed from: m */
    private final List f279871m;

    public C100060c(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        this.f279859a = new C23219p("bottomSheet", jVar, false);
        this.f279860b = new C23219p("corpusBar", jVar, false);
        C22945j jVar2 = jVar;
        C23251a aVar2 = new C23251a(jVar2, "dataSaverEnabledDialogEventData", new C23268m(new C23269n()), false, true, false);
        this.f279861c = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(jVar2, "hideHeader", new C23256a(), false, true, false);
        this.f279862d = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(jVar2, "ignoreHeaderPadding", new C23256a(), false, true, false);
        this.f279863e = aVar4;
        aVar.mo28530a(aVar4);
        this.f279864f = new C23219p("logoHeader", jVar, false);
        C22945j jVar3 = jVar;
        C23251a aVar5 = new C23251a(jVar3, "notificationsDisabledDialogEventData", new C23268m(new C23269n()), false, true, false);
        this.f279865g = aVar5;
        aVar.mo28530a(aVar5);
        C23251a aVar6 = new C23251a(jVar3, "recentlySrpScreenshotDelayMs", new C23268m(new C23265j()), false, true, false);
        this.f279866h = aVar6;
        aVar.mo28530a(aVar6);
        C23251a aVar7 = new C23251a(jVar3, "showBottomDialogEventData", new C23268m(new C23269n()), false, true, false);
        this.f279867i = aVar7;
        aVar.mo28530a(aVar7);
        C23251a aVar8 = new C23251a(jVar3, "showingWebView", new C23256a(), false, true, false);
        this.f279868j = aVar8;
        aVar.mo28530a(aVar8);
        this.f279869k = new C23219p("srpContent", jVar, false);
        C23251a aVar9 = new C23251a(jVar, "useHairlineForHeaderBackground", new C23256a(), false, true, false);
        this.f279870l = aVar9;
        aVar.mo28530a(aVar9);
        this.f279871m = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f279871m;
    }
}
