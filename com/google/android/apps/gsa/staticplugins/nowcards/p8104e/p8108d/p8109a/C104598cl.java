package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a;

import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8106b.C104479o;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.p375ai.p378b.C7593ct;
import com.google.protobuf.C62921ba;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.d.a.cl */
/* compiled from: PG */
public final class C104598cl implements C104479o, C23252b {

    /* renamed from: a */
    public final C23251a f291208a;

    /* renamed from: b */
    public final C23251a f291209b;

    /* renamed from: c */
    private final List f291210c;

    public C104598cl(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23052c cVar2 = cVar;
        C23251a aVar2 = new C23251a(cVar2, "serverControlledReportFields", new C23268m(new C23271p(C7593ct.f26245g.getParserForType(), C62921ba.m95368a(), C7593ct.f26245g)), true, false, false);
        this.f291208a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(cVar2, "shouldDismissParentCard", new C23256a(), true, false, false);
        this.f291209b = aVar3;
        aVar.mo28530a(aVar3);
        this.f291210c = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f291210c;
    }
}
