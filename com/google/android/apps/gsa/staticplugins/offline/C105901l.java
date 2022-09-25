package com.google.android.apps.gsa.staticplugins.offline;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4460h.p4461a.C58009ae;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.Locale;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.offline.l */
/* compiled from: PG */
public final class C105901l extends C68247h {

    /* renamed from: a */
    private final C68283d f295562a;

    /* renamed from: c */
    private final C68283d f295563c;

    /* renamed from: d */
    private final C68283d f295564d;

    /* renamed from: e */
    private final C68283d f295565e;

    /* renamed from: f */
    private final C68283d f295566f;

    /* renamed from: g */
    private final C68283d f295567g;

    public C105901l(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6) {
        super(aVar2, new C68277d(C105901l.class), aVar);
        this.f295562a = C68236af.m98549d(dVar);
        this.f295563c = C68236af.m98549d(dVar2);
        this.f295564d = C68236af.m98549d(dVar3);
        this.f295565e = C68236af.m98549d(dVar4);
        this.f295566f = C68236af.m98549d(dVar5);
        this.f295567g = C68236af.m98549d(dVar6);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        return ((C58009ae) list.get(0)).mo54597a(new C105897h((Context) list.get(1), (Locale) list.get(2), (C91123v) list.get(3), (C58833ax) list.get(4), (C86124t) list.get(5)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f295562a.mo60297gq(), this.f295563c.mo60297gq(), this.f295564d.mo60297gq(), this.f295565e.mo60297gq(), this.f295566f.mo60297gq(), this.f295567g.mo60297gq());
    }
}
