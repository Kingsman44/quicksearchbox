package com.google.android.apps.gsa.staticplugins.opa.p8312ax;

import com.google.android.apps.gsa.search.core.p6816p.C86217b;
import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.search.core.p6816p.C86254i;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.assistant.p3897e.p3921j.p3926e.C51971fx;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ax.m */
/* compiled from: PG */
public final class C107637m extends C68247h {

    /* renamed from: a */
    private final C68283d f299466a;

    /* renamed from: c */
    private final C68283d f299467c;

    public C107637m(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C107637m.class), aVar);
        this.f299466a = C68236af.m98549d(dVar);
        this.f299467c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        Boolean bool;
        List list = (List) obj;
        boolean z = false;
        C86232bo boVar = (C86232bo) list.get(0);
        C58833ax axVar = (C58833ax) list.get(1);
        if (axVar.mo56113h()) {
            C51971fx a = C86217b.m138691a((C51195j) axVar.mo56107c());
            if (a != null && (C86217b.m138693c(a) || (a.f136382a & 8) != 0)) {
                z = true;
            }
            bool = Boolean.valueOf(!z);
        } else {
            if ((boVar instanceof C86254i) && C90877ak.m148480n(boVar.mo79893q()) && ((C58833ax) C90877ak.m148474h(boVar.mo79893q())).mo56113h()) {
                z = true;
            }
            bool = Boolean.valueOf(z);
        }
        return C60856cj.m92900i(bool);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f299466a.mo60297gq(), this.f299467c.mo60297gq());
    }
}
