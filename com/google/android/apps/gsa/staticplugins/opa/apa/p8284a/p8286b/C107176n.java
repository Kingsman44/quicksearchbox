package com.google.android.apps.gsa.staticplugins.opa.apa.p8284a.p8286b;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.p7139a.C90523o;
import com.google.android.apps.gsa.staticplugins.opa.apa.p8284a.p8287c.C107189b;
import com.google.android.apps.gsa.staticplugins.opa.apa.p8284a.p8287c.C107190c;
import com.google.android.apps.gsa.staticplugins.opa.apa.p8284a.p8287c.C107191d;
import com.google.android.apps.gsa.staticplugins.opa.apa.p8284a.p8287c.C107192e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.C57981b;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.apa.a.b.n */
/* compiled from: PG */
public final class C107176n extends C68247h {

    /* renamed from: a */
    private final C68283d f298329a;

    /* renamed from: c */
    private final C68283d f298330c;

    public C107176n(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C107176n.class), aVar);
        this.f298329a = C68236af.m98549d(dVar);
        this.f298330c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        Optional map = Optional.ofNullable((C107191d) ((C107192e) list.get(1)).f298369a.get()).filter(new C107189b(((Query) list.get(0)).f252749G)).map(C107190c.f298368a);
        if (!map.isEmpty()) {
            return C60856cj.m92900i((C57981b) map.get());
        }
        throw new C90523o("No source of S3 responses registered for the query", (int) C89885b.OPA_HANDOVER_FROM_APA_FAILED_NO_RESPONSES_SOURCE_VALUE);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f298329a.mo60297gq(), this.f298330c.mo60297gq());
    }
}
