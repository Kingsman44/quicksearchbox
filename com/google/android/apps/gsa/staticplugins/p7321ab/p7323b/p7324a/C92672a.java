package com.google.android.apps.gsa.staticplugins.p7321ab.p7323b.p7324a;

import com.google.android.apps.gsa.staticplugins.p7321ab.p7323b.p7325b.C92685a;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23255e;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1901b.C23160l;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.ab.b.a.a */
/* compiled from: PG */
public final class C92672a implements C92685a, C23252b {

    /* renamed from: a */
    private final C23160l f258685a;

    /* renamed from: b */
    private final C23251a f258686b;

    /* renamed from: c */
    private final List f258687c;

    public C92672a(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        this.f258685a = new C23160l("child", cVar);
        C23251a aVar2 = new C23251a(cVar, "isActivated", new C23256a(), true, false, false);
        this.f258686b = aVar2;
        aVar.mo28530a(aVar2);
        this.f258687c = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f258687c;
    }

    /* renamed from: b */
    public final /* synthetic */ C23255e mo87435b() {
        return this.f258685a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23251a mo87436c() {
        return this.f258686b;
    }
}
