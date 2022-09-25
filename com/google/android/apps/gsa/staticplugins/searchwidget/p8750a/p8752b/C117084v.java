package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8752b;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6995aq.C89283z;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8753c.C117094f;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.protobuf.C62921ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.b.v */
/* compiled from: PG */
public final class C117084v extends C23056g {

    /* renamed from: a */
    public C117058af f325088a;

    /* renamed from: b */
    private final C117094f f325089b;

    /* renamed from: c */
    private final C86124t f325090c;

    public C117084v(C23052c cVar, C117094f fVar, C86124t tVar) {
        super(cVar);
        this.f325089b = fVar;
        this.f325090c = tVar;
    }

    /* renamed from: N */
    public final void mo28493N(String str, String str2, Parcelable parcelable) {
        if ("CLOSE".equals(str)) {
            C117058af afVar = this.f325088a;
            afVar.getClass();
            afVar.f324999a.mo103124f();
        } else if ("VALUE_CHANGED".equals(str)) {
            mo103135e(((Bundle) parcelable).getInt("ALPHA"));
        }
    }

    /* renamed from: e */
    public final void mo103135e(int i) {
        C23251a aVar = ((C117073k) this.f325089b).f325044a;
        Integer valueOf = Integer.valueOf(i);
        aVar.mo28730f(valueOf, false);
        C117058af afVar = this.f325088a;
        afVar.getClass();
        ((C117077o) afVar.f324999a.f325004d.f325094b.f325013a).f325066d.mo28730f(valueOf, false);
        C117060ah ahVar = afVar.f324999a;
        ((C117076n) ahVar.f325001a).f325061j.mo28730f(Boolean.valueOf(ahVar.f325004d.f325094b.mo103125e()), false);
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        ((C117073k) this.f325089b).f325045b.mo28730f(Integer.valueOf((int) this.f325090c.mo79743a(C89985ax.f246667U)), false);
        C89283z zVar = (C89283z) C23245b.m43557b(protoParcelable, C89283z.f242073n.getParserForType(), C62921ba.m95368a(), true);
        C23251a aVar = ((C117073k) this.f325089b).f325044a;
        zVar.getClass();
        aVar.mo28730f(Integer.valueOf(zVar.f242076b), false);
    }
}
