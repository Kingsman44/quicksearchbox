package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a;

import com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a.p8083c.C103551m;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.ax */
/* compiled from: PG */
public final class C103488ax extends C68247h {

    /* renamed from: a */
    private final C68283d f288388a;

    /* renamed from: c */
    private final C68283d f288389c;

    /* renamed from: d */
    private final C68283d f288390d;

    public C103488ax(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C103488ax.class), aVar);
        this.f288388a = C68236af.m98549d(dVar);
        this.f288389c = C68236af.m98549d(dVar2);
        this.f288390d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        String str = (String) list.get(0);
        String str2 = (String) list.get(1);
        C103551m mVar = C103551m.TEXT;
        int ordinal = ((C103551m) list.get(2)).ordinal();
        if (ordinal == 0) {
            str = str2;
        } else if (ordinal != 1) {
            throw new AssertionError();
        }
        return C60856cj.m92900i(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f288388a.mo60297gq(), this.f288389c.mo60297gq(), this.f288390d.mo60297gq());
    }
}
