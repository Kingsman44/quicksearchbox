package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8754d;

import com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8753c.C117091c;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.children.p1913b.C23219p;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.d.bc */
/* compiled from: PG */
public final class C117129bc implements C117091c, C23252b {

    /* renamed from: a */
    public final C23219p f325165a;

    /* renamed from: b */
    public final C23219p f325166b;

    /* renamed from: c */
    private final List f325167c;

    public C117129bc(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        this.f325165a = new C23219p("previewParentChild", jVar, false);
        this.f325166b = new C23219p("widgetCustomizationChild", jVar, false);
        this.f325167c = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f325167c;
    }
}
