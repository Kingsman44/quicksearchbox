package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8754d;

import com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8753c.C117089a;
import com.google.android.libraries.gsa.monet.shared.C23117m;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23272q;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.d.i */
/* compiled from: PG */
public final class C117168i implements C117089a, C23252b {

    /* renamed from: a */
    public final C23251a f325254a;

    /* renamed from: b */
    private final C23251a f325255b;

    /* renamed from: c */
    private final List f325256c;

    public C117168i(C23117m mVar) {
        C23087a aVar = new C23087a();
        C23251a aVar2 = new C23251a(mVar, "showDrawerExitDialog", new C23256a(), true, false, false);
        this.f325255b = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(mVar, "text", new C23272q(), true, false, false);
        this.f325254a = aVar3;
        aVar.mo28530a(aVar3);
        this.f325256c = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f325256c;
    }
}
