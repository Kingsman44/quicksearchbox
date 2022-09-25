package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8113a;

import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8106b.C104479o;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.p375ai.p378b.C7593ct;
import com.google.protobuf.C62921ba;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.e.a.dy */
/* compiled from: PG */
public final class C104796dy implements C104479o, C23252b {

    /* renamed from: a */
    public final C23251a f292008a;

    /* renamed from: b */
    private final C23251a f292009b;

    /* renamed from: c */
    private final List f292010c;

    public C104796dy(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        C22945j jVar2 = jVar;
        C23251a aVar2 = new C23251a(jVar2, "serverControlledReportFields", new C23268m(new C23271p(C7593ct.f26245g.getParserForType(), C62921ba.m95368a(), C7593ct.f26245g)), false, true, false);
        this.f292008a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(jVar2, "shouldDismissParentCard", new C23256a(), false, true, false);
        this.f292009b = aVar3;
        aVar.mo28530a(aVar3);
        this.f292010c = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f292010c;
    }
}
