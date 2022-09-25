package com.google.android.apps.gsa.staticplugins.messages.monet.p8035b;

import com.google.android.apps.gsa.staticplugins.messages.monet.p8034a.C102721b;
import com.google.android.apps.gsa.staticplugins.messages.monet.p8037c.C102752d;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23259d;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23265j;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.messages.monet.b.a */
/* compiled from: PG */
public final class C102729a implements C102752d, C23252b {

    /* renamed from: a */
    public final C23251a f286796a;

    /* renamed from: b */
    public final C23251a f286797b;

    /* renamed from: c */
    public final C23251a f286798c;

    /* renamed from: d */
    private final List f286799d;

    public C102729a(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23052c cVar2 = cVar;
        C23251a aVar2 = new C23251a(cVar2, "iconResId", new C23265j(), true, false, false);
        this.f286796a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(cVar2, "textResId", new C23265j(), true, false, false);
        this.f286797b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(cVar, "type", new C23268m(new C23259d(C102721b.values())), true, false, false);
        this.f286798c = aVar4;
        aVar.mo28530a(aVar4);
        this.f286799d = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f286799d;
    }
}
