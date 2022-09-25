package com.google.android.apps.gsa.staticplugins.save.p8699ui;

import com.google.android.apps.gsa.staticplugins.save.p8697b.C116434e;
import com.google.android.apps.gsa.staticplugins.save.p8697b.C116435f;
import com.google.android.apps.gsa.staticplugins.save.p8697b.p8698a.C116426e;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23259d;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23272q;
import com.google.protobuf.C62921ba;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.ui.u */
/* compiled from: PG */
public final class C116468u implements C116434e, C23252b {

    /* renamed from: a */
    public final C23251a f322932a;

    /* renamed from: b */
    public final C23251a f322933b;

    /* renamed from: c */
    public final C23251a f322934c;

    /* renamed from: d */
    public final C23251a f322935d;

    /* renamed from: e */
    public final C23251a f322936e;

    /* renamed from: f */
    private final C23251a f322937f;

    /* renamed from: g */
    private final List f322938g;

    public C116468u(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        C22945j jVar2 = jVar;
        C23251a aVar2 = new C23251a(jVar2, "builtInLists", new C23271p(C116426e.f322830b.getParserForType(), C62921ba.m95368a(), C116426e.f322830b), false, true, false);
        this.f322937f = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(jVar2, "currentListTitle", new C23268m(new C23272q()), false, true, false);
        this.f322932a = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(jVar2, "enableFloatingSnackbar", new C23256a(), false, true, false);
        this.f322933b = aVar4;
        aVar.mo28530a(aVar4);
        C22945j jVar3 = jVar;
        C23251a aVar5 = new C23251a(jVar3, "lists", new C23268m(new C23271p(C116426e.f322830b.getParserForType(), C62921ba.m95368a(), C116426e.f322830b)), false, true, false);
        this.f322934c = aVar5;
        aVar.mo28530a(aVar5);
        C23251a aVar6 = new C23251a(jVar3, "snackbarMessage", new C23272q(), false, true, false);
        this.f322935d = aVar6;
        aVar.mo28530a(aVar6);
        C23251a aVar7 = new C23251a(jVar, "uiState", new C23268m(new C23259d(C116435f.values())), false, true, false);
        this.f322936e = aVar7;
        aVar.mo28530a(aVar7);
        this.f322938g = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f322938g;
    }

    /* renamed from: b */
    public final /* synthetic */ C23250b mo102657b() {
        return this.f322937f;
    }

    /* renamed from: c */
    public final /* synthetic */ C23250b mo102658c() {
        return this.f322932a;
    }

    /* renamed from: d */
    public final /* synthetic */ C23250b mo102659d() {
        return this.f322933b;
    }

    /* renamed from: e */
    public final /* synthetic */ C23250b mo102660e() {
        return this.f322934c;
    }

    /* renamed from: f */
    public final /* synthetic */ C23250b mo102661f() {
        return this.f322935d;
    }

    /* renamed from: g */
    public final /* synthetic */ C23250b mo102662g() {
        return this.f322936e;
    }
}
