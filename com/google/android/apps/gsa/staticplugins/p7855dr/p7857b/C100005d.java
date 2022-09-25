package com.google.android.apps.gsa.staticplugins.p7855dr.p7857b;

import com.google.android.apps.gsa.staticplugins.p7855dr.p7858c.C100032e;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23186f;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23265j;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23269n;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.dr.b.d */
/* compiled from: PG */
public final class C100005d implements C100032e, C23252b {

    /* renamed from: a */
    public final C23186f f279692a;

    /* renamed from: b */
    public final C23186f f279693b;

    /* renamed from: c */
    public final C23251a f279694c;

    /* renamed from: d */
    public final C23251a f279695d;

    /* renamed from: e */
    public final C23251a f279696e;

    /* renamed from: f */
    public final C23186f f279697f;

    /* renamed from: g */
    public final C23251a f279698g;

    /* renamed from: h */
    public final C23251a f279699h;

    /* renamed from: i */
    public final C23251a f279700i;

    /* renamed from: j */
    public final C23186f f279701j;

    /* renamed from: k */
    public final C23251a f279702k;

    /* renamed from: l */
    private final C23251a f279703l;

    /* renamed from: m */
    private final List f279704m;

    public C100005d(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        this.f279692a = new C23186f("bottomSheet", cVar, true);
        this.f279693b = new C23186f("corpusBar", cVar, true);
        C23052c cVar2 = cVar;
        C23251a aVar2 = new C23251a(cVar2, "dataSaverEnabledDialogEventData", new C23268m(new C23269n()), true, false, false);
        this.f279694c = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(cVar2, "hideHeader", new C23256a(), true, false, false);
        this.f279695d = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(cVar2, "ignoreHeaderPadding", new C23256a(), true, false, false);
        this.f279696e = aVar4;
        aVar.mo28530a(aVar4);
        this.f279697f = new C23186f("logoHeader", cVar, true);
        C23052c cVar3 = cVar;
        C23251a aVar5 = new C23251a(cVar3, "notificationsDisabledDialogEventData", new C23268m(new C23269n()), true, false, false);
        this.f279698g = aVar5;
        aVar.mo28530a(aVar5);
        C23251a aVar6 = new C23251a(cVar3, "recentlySrpScreenshotDelayMs", new C23268m(new C23265j()), true, false, false);
        this.f279699h = aVar6;
        aVar.mo28530a(aVar6);
        C23251a aVar7 = new C23251a(cVar3, "showBottomDialogEventData", new C23268m(new C23269n()), true, false, false);
        this.f279700i = aVar7;
        aVar.mo28530a(aVar7);
        C23251a aVar8 = new C23251a(cVar3, "showingWebView", new C23256a(), true, false, false);
        this.f279703l = aVar8;
        aVar.mo28530a(aVar8);
        this.f279701j = new C23186f("srpContent", cVar, true);
        C23251a aVar9 = new C23251a(cVar, "useHairlineForHeaderBackground", new C23256a(), true, false, false);
        this.f279702k = aVar9;
        aVar.mo28530a(aVar9);
        this.f279704m = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f279704m;
    }
}
