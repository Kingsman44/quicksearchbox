package com.google.android.apps.gsa.staticplugins.s3request.p8690a;

import android.content.Context;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.speech.p7298l.C92473f;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4460h.p4461a.C58009ae;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.s3request.a.ao */
/* compiled from: PG */
public final class C116260ao extends C68247h {

    /* renamed from: a */
    private final C68283d f322356a;

    /* renamed from: c */
    private final C68283d f322357c;

    /* renamed from: d */
    private final C69464a f322358d;

    /* renamed from: e */
    private final C68283d f322359e;

    /* renamed from: f */
    private final C68283d f322360f;

    public C116260ao(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C69464a aVar3, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C116260ao.class), aVar);
        this.f322356a = C68236af.m98549d(dVar);
        this.f322357c = C68236af.m98549d(dVar2);
        this.f322358d = aVar3;
        this.f322359e = C68236af.m98549d(dVar3);
        this.f322360f = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        Context context = (Context) list.get(0);
        C92473f fVar = (C92473f) list.get(1);
        C68214a a = C68219e.m98518a(this.f322358d);
        C90476a aVar = (C90476a) list.get(2);
        C58009ae aeVar = (C58009ae) list.get(3);
        if (!fVar.f258009E.mo84370cC()) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        return aeVar.mo54597a(new C116258am(fVar, a, context));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f322356a.mo60297gq(), this.f322357c.mo60297gq(), this.f322359e.mo60297gq(), this.f322360f.mo60297gq());
    }
}
