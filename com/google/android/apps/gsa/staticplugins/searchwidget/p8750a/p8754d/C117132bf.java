package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8754d;

import com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8753c.C117094f;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23265j;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.d.bf */
/* compiled from: PG */
public final class C117132bf implements C117094f, C23252b {

    /* renamed from: a */
    public final C23251a f325172a;

    /* renamed from: b */
    public final C23251a f325173b;

    /* renamed from: c */
    private final List f325174c;

    public C117132bf(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        C22945j jVar2 = jVar;
        C23251a aVar2 = new C23251a(jVar2, "alphaValue", new C23265j(), false, true, false);
        this.f325172a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(jVar2, "minimumAlphaValue", new C23265j(), false, true, false);
        this.f325173b = aVar3;
        aVar.mo28530a(aVar3);
        this.f325174c = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f325174c;
    }
}
