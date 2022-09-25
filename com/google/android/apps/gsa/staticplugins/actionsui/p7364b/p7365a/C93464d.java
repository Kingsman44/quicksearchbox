package com.google.android.apps.gsa.staticplugins.actionsui.p7364b.p7365a;

import com.google.android.apps.gsa.staticplugins.actionsui.p7364b.p7367c.C93472a;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23269n;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.b.a.d */
/* compiled from: PG */
public final class C93464d implements C93472a, C23252b {

    /* renamed from: a */
    public final C23251a f260843a;

    /* renamed from: b */
    private final List f260844b;

    public C93464d(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23251a aVar2 = new C23251a(cVar, "updateVoiceActionUiEventData", new C23268m(new C23269n()), true, false, false);
        this.f260843a = aVar2;
        aVar.mo28530a(aVar2);
        this.f260844b = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f260844b;
    }
}
