package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.content.Context;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.p1886a.C22946k;
import com.google.android.libraries.gsa.monet.shared.C23115k;
import com.google.android.libraries.gsa.monet.tools.recycling.p1927c.C23294j;
import com.google.android.libraries.gsa.monet.tools.recycling.p1927c.C23297m;
import com.google.android.libraries.p1730f.p1731a.C21378h;
import com.google.common.base.C58881cr;
import dagger.p5294a.C68221g;
import java.util.HashMap;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.cs */
/* compiled from: PG */
public final class C105545cs implements C22946k {

    /* renamed from: a */
    private final C69464a f294467a;

    /* renamed from: b */
    private final C69464a f294468b;

    /* renamed from: c */
    private final C69464a f294469c;

    public C105545cs(C69464a aVar, C69464a aVar2, C69464a aVar3) {
        this.f294467a = aVar;
        this.f294468b = aVar2;
        this.f294469c = aVar3;
    }

    /* renamed from: a */
    public final C23115k mo28317a() {
        HashMap hashMap = new HashMap();
        hashMap.put(C23294j.class, new C23297m());
        return new C23115k(hashMap);
    }

    /* renamed from: b */
    public final /* synthetic */ C22939d mo28318b(C22945j jVar) {
        return new C105544cr(jVar, new C105585ee(jVar), (Context) ((C68221g) this.f294467a).f184583a, (C21378h) this.f294468b.mo17428b(), (C58881cr) this.f294469c.mo17428b());
    }
}
