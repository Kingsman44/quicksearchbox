package com.google.android.apps.gsa.staticplugins.messages.monet.p8035b;

import com.google.android.apps.gsa.staticplugins.messages.monet.p8037c.C102753e;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23193m;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23253c;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.messages.monet.b.b */
/* compiled from: PG */
public final class C102733b implements C102753e, C23252b {

    /* renamed from: a */
    private final C23193m f286810a;

    /* renamed from: b */
    private final List f286811b;

    public C102733b(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        this.f286810a = new C23193m("messageCards", cVar, true);
        this.f286811b = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f286811b;
    }

    /* renamed from: b */
    public final /* synthetic */ C23253c mo93403b() {
        return this.f286810a;
    }
}
