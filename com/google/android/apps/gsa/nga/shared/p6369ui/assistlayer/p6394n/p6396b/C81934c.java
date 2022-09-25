package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6394n.p6396b;

import android.app.Presentation;
import android.content.Context;
import com.google.android.apps.gsa.opa.p6447h.C83695a;
import com.google.android.apps.gsa.opa.p6447h.C83701g;
import com.google.android.apps.gsa.opa.p6447h.C83707m;
import com.google.android.apps.gsa.shared.p7066m.C90040cs;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.n.b.c */
/* compiled from: PG */
public final class C81934c implements C83695a {

    /* renamed from: a */
    private final C91142g f224023a;

    /* renamed from: b */
    private final C58881cr f224024b;

    /* renamed from: c */
    private final C58881cr f224025c;

    public C81934c(Context context, C83707m mVar, C91142g gVar, C83701g gVar2, C81950s sVar) {
        this.f224023a = gVar;
        this.f224024b = C58886cw.m90973a(new C81932a(gVar2, context, mVar));
        this.f224025c = C58886cw.m90973a(new C81933b(sVar, context, mVar));
    }

    /* renamed from: a */
    public final Presentation mo75402a() {
        if (this.f224023a.mo85405j(C90040cs.f248679r)) {
            return ((C83695a) this.f224025c.mo6453a()).mo75402a();
        }
        return ((C83695a) this.f224024b.mo6453a()).mo75402a();
    }
}
