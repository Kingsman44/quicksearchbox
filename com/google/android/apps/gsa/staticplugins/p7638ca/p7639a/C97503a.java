package com.google.android.apps.gsa.staticplugins.p7638ca.p7639a;

import com.google.android.apps.gsa.staticplugins.p7638ca.p7640b.C97506a;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23259d;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23269n;
import com.google.speech.p5208h.C66554ak;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.ca.a.a */
/* compiled from: PG */
public final class C97503a implements C97506a, C23252b {

    /* renamed from: a */
    public final C23251a f272306a;

    /* renamed from: b */
    public final C23251a f272307b;

    /* renamed from: c */
    private final List f272308c;

    public C97503a(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23052c cVar2 = cVar;
        C23251a aVar2 = new C23251a(cVar2, "currentNetworkType", new C23268m(new C23259d(C66554ak.values())), true, false, false);
        this.f272306a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(cVar2, "updateTimeStampUiEventData", new C23268m(new C23269n()), true, false, false);
        this.f272307b = aVar3;
        aVar.mo28530a(aVar3);
        this.f272308c = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f272308c;
    }

    /* renamed from: b */
    public final /* synthetic */ C23250b mo90735b() {
        return this.f272306a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23250b mo90736c() {
        return this.f272307b;
    }
}
