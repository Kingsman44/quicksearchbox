package com.google.android.apps.gsa.staticplugins.messages.monet.p8038ui;

import com.google.android.apps.gsa.search.shared.p6927e.C87544b;
import com.google.android.apps.gsa.staticplugins.messages.monet.p8034a.C102725f;
import com.google.android.apps.gsa.staticplugins.messages.monet.p8037c.C102757i;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.children.p1913b.C23198ac;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23259d;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23265j;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.messages.monet.ui.z */
/* compiled from: PG */
public final class C102783z implements C102757i, C23252b {

    /* renamed from: a */
    public final C23198ac f286908a;

    /* renamed from: b */
    public final C23251a f286909b;

    /* renamed from: c */
    public final C23251a f286910c;

    /* renamed from: d */
    public final C23251a f286911d;

    /* renamed from: e */
    public final C23251a f286912e;

    /* renamed from: f */
    public final C23251a f286913f;

    /* renamed from: g */
    public final C23251a f286914g;

    /* renamed from: h */
    public final C23251a f286915h;

    /* renamed from: i */
    private final C23251a f286916i;

    /* renamed from: j */
    private final List f286917j;

    public C102783z(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        this.f286908a = new C23198ac("buttons", jVar);
        C22945j jVar2 = jVar;
        C23251a aVar2 = new C23251a(jVar2, "enablePuffyGame", new C23256a(), false, true, false);
        this.f286916i = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(jVar2, "explanationResId", new C23265j(), false, true, false);
        this.f286909b = aVar3;
        aVar.mo28530a(aVar3);
        C22945j jVar3 = jVar;
        C23251a aVar4 = new C23251a(jVar3, "gmmIntentFuseUiMode", new C23268m(new C23259d(C102725f.values())), false, true, false);
        this.f286910c = aVar4;
        aVar.mo28530a(aVar4);
        C23251a aVar5 = new C23251a(jVar3, "iconResId", new C23265j(), false, true, false);
        this.f286911d = aVar5;
        aVar.mo28530a(aVar5);
        C23251a aVar6 = new C23251a(jVar3, "showFeedbackLink", new C23256a(), false, true, false);
        this.f286912e = aVar6;
        aVar.mo28530a(aVar6);
        C23251a aVar7 = new C23251a(jVar3, "showPuffyIcon", new C23256a(), false, true, false);
        this.f286913f = aVar7;
        aVar.mo28530a(aVar7);
        C23251a aVar8 = new C23251a(jVar3, "titleResId", new C23265j(), false, true, false);
        this.f286914g = aVar8;
        aVar.mo28530a(aVar8);
        C23251a aVar9 = new C23251a(jVar, "type", new C23268m(new C23259d(C87544b.values())), false, true, false);
        this.f286915h = aVar9;
        aVar.mo28530a(aVar9);
        this.f286917j = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f286917j;
    }
}
