package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8752b;

import com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8753c.C117095g;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23186f;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.b.l */
/* compiled from: PG */
public final class C117074l implements C117095g, C23252b {

    /* renamed from: a */
    public final C23186f f325047a;

    /* renamed from: b */
    public final C23186f f325048b;

    /* renamed from: c */
    private final List f325049c;

    public C117074l(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        this.f325047a = new C23186f("actionBarChild", cVar, false);
        this.f325048b = new C23186f("widgetPreviewChild", cVar, false);
        this.f325049c = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f325049c;
    }
}
