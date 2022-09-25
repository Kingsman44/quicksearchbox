package com.google.android.apps.gsa.staticplugins.p7638ca.p7641c;

import com.google.android.apps.gsa.staticplugins.p7638ca.p7640b.C97506a;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23259d;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23269n;
import com.google.speech.p5208h.C66554ak;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.ca.c.g */
/* compiled from: PG */
public final class C97513g implements C97506a, C23252b {

    /* renamed from: a */
    private final C23251a f272326a;

    /* renamed from: b */
    private final C23251a f272327b;

    /* renamed from: c */
    private final List f272328c;

    public C97513g(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        C22945j jVar2 = jVar;
        C23251a aVar2 = new C23251a(jVar2, "currentNetworkType", new C23268m(new C23259d(C66554ak.values())), false, true, false);
        this.f272326a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(jVar2, "updateTimeStampUiEventData", new C23268m(new C23269n()), false, true, false);
        this.f272327b = aVar3;
        aVar.mo28530a(aVar3);
        this.f272328c = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f272328c;
    }

    /* renamed from: b */
    public final /* synthetic */ C23250b mo90735b() {
        return this.f272326a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23250b mo90736c() {
        return this.f272327b;
    }
}
