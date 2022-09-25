package com.google.android.apps.gsa.staticplugins.bisto.p7459aa.p7461b;

import com.google.android.apps.gsa.staticplugins.bisto.p7459aa.C94785f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p3186j$.util.Objects;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.aa.b.aa */
/* compiled from: PG */
public final class C94670aa extends C68247h {

    /* renamed from: a */
    private final C68283d f264778a;

    /* renamed from: c */
    private final C68283d f264779c;

    /* renamed from: d */
    private final C68283d f264780d;

    /* renamed from: e */
    private final C68283d f264781e;

    public C94670aa(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C94670aa.class), aVar);
        this.f264778a = C68236af.m98549d(dVar);
        this.f264779c = C68236af.m98549d(dVar2);
        this.f264780d = C68236af.m98549d(dVar3);
        this.f264781e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        Object obj2;
        List list = (List) obj;
        boolean booleanValue = ((Boolean) list.get(0)).booleanValue();
        boolean booleanValue2 = ((Boolean) list.get(1)).booleanValue();
        C94785f fVar = (C94785f) list.get(2);
        C22871g gVar = (C22871g) list.get(3);
        if (booleanValue) {
            if (booleanValue2) {
                gVar.mo28212l("expectFollowOn", new C94762r(fVar));
            } else {
                Objects.requireNonNull(fVar);
                gVar.mo28212l("complete", new C94763s(fVar));
            }
            obj2 = C58833ax.m90834k(C94764t.f264994b);
        } else {
            obj2 = C58836b.f156633a;
        }
        return C60856cj.m92900i(obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f264778a.mo60297gq(), this.f264779c.mo60297gq(), this.f264780d.mo60297gq(), this.f264781e.mo60297gq());
    }
}
