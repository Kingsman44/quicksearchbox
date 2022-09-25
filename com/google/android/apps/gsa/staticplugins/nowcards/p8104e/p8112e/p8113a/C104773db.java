package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8113a;

import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8106b.C104465a;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.p375ai.p378b.C7529aq;
import com.google.p375ai.p378b.C7530ar;
import com.google.protobuf.C62921ba;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.e.a.db */
/* compiled from: PG */
public final class C104773db implements C104465a, C23252b {

    /* renamed from: a */
    public final C23251a f291854a;

    /* renamed from: b */
    private final C23251a f291855b;

    /* renamed from: c */
    private final C23251a f291856c;

    /* renamed from: d */
    private final List f291857d;

    public C104773db(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        C23251a aVar2 = new C23251a(jVar, "adDismiss", new C23268m(new C23271p(C7530ar.f26069f.getParserForType(), C62921ba.m95368a(), C7530ar.f26069f)), false, true, false);
        this.f291854a = aVar2;
        aVar.mo28530a(aVar2);
        C22945j jVar2 = jVar;
        C23251a aVar3 = new C23251a(jVar2, "selectedReason", new C23268m(new C23271p(C7529aq.f26062d.getParserForType(), C62921ba.m95368a(), C7529aq.f26062d)), false, true, false);
        this.f291855b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(jVar2, "shouldDismissAdCard", new C23256a(), false, true, false);
        this.f291856c = aVar4;
        aVar.mo28530a(aVar4);
        this.f291857d = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f291857d;
    }
}
