package com.google.android.apps.gsa.staticplugins.messages.monet.p8035b;

import com.google.android.apps.gsa.search.shared.p6927e.C87544b;
import com.google.android.apps.gsa.staticplugins.messages.monet.p8034a.C102725f;
import com.google.android.apps.gsa.staticplugins.messages.monet.p8037c.C102757i;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23193m;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23259d;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23265j;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.messages.monet.b.c */
/* compiled from: PG */
public final class C102734c implements C102757i, C23252b {

    /* renamed from: a */
    public final C23193m f286812a;

    /* renamed from: b */
    public final C23251a f286813b;

    /* renamed from: c */
    public final C23251a f286814c;

    /* renamed from: d */
    public final C23251a f286815d;

    /* renamed from: e */
    public final C23251a f286816e;

    /* renamed from: f */
    public final C23251a f286817f;

    /* renamed from: g */
    public final C23251a f286818g;

    /* renamed from: h */
    public final C23251a f286819h;

    /* renamed from: i */
    public final C23251a f286820i;

    /* renamed from: j */
    private final List f286821j;

    public C102734c(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        this.f286812a = new C23193m("buttons", cVar, true);
        C23052c cVar2 = cVar;
        C23251a aVar2 = new C23251a(cVar2, "enablePuffyGame", new C23256a(), true, false, false);
        this.f286813b = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(cVar2, "explanationResId", new C23265j(), true, false, false);
        this.f286814c = aVar3;
        aVar.mo28530a(aVar3);
        C23052c cVar3 = cVar;
        C23251a aVar4 = new C23251a(cVar3, "gmmIntentFuseUiMode", new C23268m(new C23259d(C102725f.values())), true, false, false);
        this.f286815d = aVar4;
        aVar.mo28530a(aVar4);
        C23251a aVar5 = new C23251a(cVar3, "iconResId", new C23265j(), true, false, false);
        this.f286816e = aVar5;
        aVar.mo28530a(aVar5);
        C23251a aVar6 = new C23251a(cVar3, "showFeedbackLink", new C23256a(), true, false, false);
        this.f286817f = aVar6;
        aVar.mo28530a(aVar6);
        C23251a aVar7 = new C23251a(cVar3, "showPuffyIcon", new C23256a(), true, false, false);
        this.f286818g = aVar7;
        aVar.mo28530a(aVar7);
        C23251a aVar8 = new C23251a(cVar3, "titleResId", new C23265j(), true, false, false);
        this.f286819h = aVar8;
        aVar.mo28530a(aVar8);
        C23251a aVar9 = new C23251a(cVar, "type", new C23268m(new C23259d(C87544b.values())), true, false, false);
        this.f286820i = aVar9;
        aVar.mo28530a(aVar9);
        this.f286821j = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f286821j;
    }
}
