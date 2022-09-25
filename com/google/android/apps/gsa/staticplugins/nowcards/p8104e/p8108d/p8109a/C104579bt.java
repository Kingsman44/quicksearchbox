package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a;

import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8106b.C104465a;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.p375ai.p378b.C7529aq;
import com.google.p375ai.p378b.C7530ar;
import com.google.protobuf.C62921ba;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.d.a.bt */
/* compiled from: PG */
public final class C104579bt implements C104465a, C23252b {

    /* renamed from: a */
    public final C23251a f291058a;

    /* renamed from: b */
    public final C23251a f291059b;

    /* renamed from: c */
    public final C23251a f291060c;

    /* renamed from: d */
    private final List f291061d;

    public C104579bt(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23251a aVar2 = new C23251a(cVar, "adDismiss", new C23268m(new C23271p(C7530ar.f26069f.getParserForType(), C62921ba.m95368a(), C7530ar.f26069f)), true, false, false);
        this.f291058a = aVar2;
        aVar.mo28530a(aVar2);
        C23052c cVar2 = cVar;
        C23251a aVar3 = new C23251a(cVar2, "selectedReason", new C23268m(new C23271p(C7529aq.f26062d.getParserForType(), C62921ba.m95368a(), C7529aq.f26062d)), true, false, false);
        this.f291059b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(cVar2, "shouldDismissAdCard", new C23256a(), true, false, false);
        this.f291060c = aVar4;
        aVar.mo28530a(aVar4);
        this.f291061d = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f291061d;
    }
}
