package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a;

import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8106b.C104473i;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.p375ai.p378b.C7664fj;
import com.google.p375ai.p378b.C7665fk;
import com.google.protobuf.C62921ba;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.d.a.cd */
/* compiled from: PG */
public final class C104590cd implements C104473i, C23252b {

    /* renamed from: a */
    private final C23251a f291133a;

    /* renamed from: b */
    private final C23251a f291134b;

    /* renamed from: c */
    private final C23251a f291135c;

    /* renamed from: d */
    private final List f291136d;

    public C104590cd(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23052c cVar2 = cVar;
        C23251a aVar2 = new C23251a(cVar2, "selectedAnswer", new C23268m(new C23271p(C7664fj.f26601h.getParserForType(), C62921ba.m95368a(), C7664fj.f26601h)), true, false, false);
        this.f291133a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(cVar2, "shouldDelayLogging", new C23256a(), true, false, false);
        this.f291134b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(cVar, "surveyData", new C23268m(new C23271p(C7665fk.f26611e.getParserForType(), C62921ba.m95368a(), C7665fk.f26611e)), true, false, false);
        this.f291135c = aVar4;
        aVar.mo28530a(aVar4);
        this.f291136d = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f291136d;
    }

    /* renamed from: b */
    public final /* synthetic */ C23250b mo94212b() {
        return this.f291135c;
    }

    /* renamed from: c */
    public final /* synthetic */ C23251a mo94213c() {
        return this.f291133a;
    }

    /* renamed from: d */
    public final /* synthetic */ C23251a mo94214d() {
        return this.f291134b;
    }
}
