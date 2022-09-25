package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8752b;

import com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8753c.C117091c;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23186f;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.b.h */
/* compiled from: PG */
public final class C117070h implements C117091c, C23252b {

    /* renamed from: a */
    public final C23186f f325036a;

    /* renamed from: b */
    public final C23186f f325037b;

    /* renamed from: c */
    private final List f325038c;

    public C117070h(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        this.f325036a = new C23186f("previewParentChild", cVar, false);
        this.f325037b = new C23186f("widgetCustomizationChild", cVar, false);
        this.f325038c = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f325038c;
    }
}
