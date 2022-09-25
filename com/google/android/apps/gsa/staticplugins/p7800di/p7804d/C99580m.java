package com.google.android.apps.gsa.staticplugins.p7800di.p7804d;

import com.google.android.apps.gsa.staticplugins.p7800di.p7802b.C99556f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.io.File;
import java.util.List;
import java.util.Locale;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.di.d.m */
/* compiled from: PG */
public final class C99580m extends C68247h {

    /* renamed from: a */
    private final C68283d f278688a;

    /* renamed from: c */
    private final C68283d f278689c;

    public C99580m(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C99580m.class), aVar);
        this.f278688a = C68236af.m98549d(dVar);
        this.f278689c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        long longValue = ((Long) list.get(1)).longValue();
        return C60856cj.m92900i(new File(((C99556f) list.get(0)).f278548a, String.format(Locale.US, "%020d.binarypb", new Object[]{Long.valueOf(longValue)})));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f278688a.mo60297gq(), this.f278689c.mo60297gq());
    }
}
