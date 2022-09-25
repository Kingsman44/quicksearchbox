package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.content.Context;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8149a.C105414v;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.p1886a.C22946k;
import com.google.android.libraries.gsa.monet.shared.C23115k;
import com.google.android.libraries.gsa.monet.tools.recycling.p1927c.C23294j;
import com.google.android.libraries.gsa.monet.tools.recycling.p1927c.C23297m;
import com.google.common.base.C58881cr;
import dagger.p5294a.C68221g;
import java.util.HashMap;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.fd */
/* compiled from: PG */
public final class C105611fd implements C22946k {

    /* renamed from: a */
    private final C69464a f294672a;

    /* renamed from: b */
    private final C69464a f294673b;

    public C105611fd(C69464a aVar, C69464a aVar2) {
        this.f294672a = aVar;
        this.f294673b = aVar2;
    }

    /* renamed from: a */
    public final C23115k mo28317a() {
        HashMap hashMap = new HashMap();
        hashMap.put(C23294j.class, new C23297m());
        return new C23115k(hashMap);
    }

    /* renamed from: b */
    public final /* synthetic */ C22939d mo28318b(C22945j jVar) {
        return new C105610fc(jVar, new C105590ej(jVar), new C105414v(jVar), (Context) ((C68221g) this.f294672a).f184583a, (C58881cr) this.f294673b.mo17428b());
    }
}
