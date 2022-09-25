package com.google.android.apps.gsa.staticplugins.save.p8694a;

import com.google.android.apps.gsa.staticplugins.save.p8697b.C116434e;
import com.google.android.apps.gsa.staticplugins.save.p8697b.C116435f;
import com.google.android.apps.gsa.staticplugins.save.p8697b.p8698a.C116426e;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.save.a.aa */
/* compiled from: PG */
public final class C116370aa implements C116434e, C23252b {

    /* renamed from: a */
    private final C23251a f322695a;

    /* renamed from: b */
    private final C23251a f322696b;

    /* renamed from: c */
    private final C23251a f322697c;

    /* renamed from: d */
    private final C23251a f322698d;

    /* renamed from: e */
    private final C23251a f322699e;

    /* renamed from: f */
    private final C23251a f322700f;

    /* renamed from: g */
    private final List f322701g;

    public C116370aa(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23052c cVar2 = cVar;
        C23251a aVar2 = new C23251a(cVar2, "builtInLists", new C23271p(C116426e.f322830b.getParserForType(), C62921ba.m95368a(), C116426e.f322830b), true, false, false);
        this.f322695a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(cVar2, "currentListTitle", new C23268m(new C23272q()), true, false, false);
        this.f322696b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(cVar2, "enableFloatingSnackbar", new C23256a(), true, false, false);
        this.f322697c = aVar4;
        aVar.mo28530a(aVar4);
        C23052c cVar3 = cVar;
        C23251a aVar5 = new C23251a(cVar3, "lists", new C23268m(new C23271p(C116426e.f322830b.getParserForType(), C62921ba.m95368a(), C116426e.f322830b)), true, false, false);
        this.f322698d = aVar5;
        aVar.mo28530a(aVar5);
        C23251a aVar6 = new C23251a(cVar3, "snackbarMessage", new C23272q(), true, false, false);
        this.f322699e = aVar6;
        aVar.mo28530a(aVar6);
        C23251a aVar7 = new C23251a(cVar, "uiState", new C23268m(new C23259d(C116435f.values())), true, false, false);
        this.f322700f = aVar7;
        aVar.mo28530a(aVar7);
        this.f322701g = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f322701g;
    }

    /* renamed from: b */
    public final /* synthetic */ C23250b mo102657b() {
        return this.f322695a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23250b mo102658c() {
        return this.f322696b;
    }

    /* renamed from: d */
    public final /* synthetic */ C23250b mo102659d() {
        return this.f322697c;
    }

    /* renamed from: e */
    public final /* synthetic */ C23250b mo102660e() {
        return this.f322698d;
    }

    /* renamed from: f */
    public final /* synthetic */ C23250b mo102661f() {
        return this.f322699e;
    }

    /* renamed from: g */
    public final /* synthetic */ C23250b mo102662g() {
        return this.f322700f;
    }
}
