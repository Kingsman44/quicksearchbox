package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105434d;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105435e;
import com.google.android.libraries.gsa.monet.shared.C23110f;
import com.google.android.libraries.gsa.monet.shared.C23117m;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.children.p1913b.C23194a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23259d;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.aq */
/* compiled from: PG */
public final class C105489aq implements C105435e, C23252b {

    /* renamed from: a */
    public final C23194a f294264a;

    /* renamed from: b */
    private final C23251a f294265b;

    /* renamed from: c */
    private final C23251a f294266c;

    /* renamed from: d */
    private final List f294267d;

    public C105489aq(C23117m mVar, C23110f fVar) {
        C23087a aVar = new C23087a();
        new C23194a("bottomSheetChild", mVar, fVar);
        C23117m mVar2 = mVar;
        C23251a aVar2 = new C23251a(mVar2, "doodleStatusBarIconColor", new C23268m(new C23259d(C105434d.values())), true, false, false);
        this.f294265b = aVar2;
        aVar.mo28530a(aVar2);
        this.f294264a = new C23194a("nowFeedChild", mVar, fVar);
        new C23194a("promotionsChild", mVar, fVar);
        C23251a aVar3 = new C23251a(mVar2, "tabActive", new C23256a(), true, false, false);
        this.f294266c = aVar3;
        aVar.mo28530a(aVar3);
        this.f294267d = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f294267d;
    }
}
