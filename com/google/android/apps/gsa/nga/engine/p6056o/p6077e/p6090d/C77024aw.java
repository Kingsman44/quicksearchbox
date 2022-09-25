package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80303ay;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.aw */
/* compiled from: PG */
public final /* synthetic */ class C77024aw implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C77027az f212583a;

    /* renamed from: b */
    public final /* synthetic */ C74965n f212584b;

    /* renamed from: c */
    public final /* synthetic */ C58485gu f212585c;

    /* renamed from: d */
    public final /* synthetic */ Optional f212586d;

    /* renamed from: e */
    public final /* synthetic */ Optional f212587e;

    /* renamed from: f */
    public final /* synthetic */ String f212588f;

    /* renamed from: g */
    public final /* synthetic */ C80399l f212589g;

    /* renamed from: h */
    public final /* synthetic */ C80303ay f212590h;

    public /* synthetic */ C77024aw(C77027az azVar, C74965n nVar, C58485gu guVar, Optional optional, Optional optional2, String str, C80399l lVar, C80303ay ayVar) {
        this.f212583a = azVar;
        this.f212584b = nVar;
        this.f212585c = guVar;
        this.f212586d = optional;
        this.f212587e = optional2;
        this.f212588f = str;
        this.f212589g = lVar;
        this.f212590h = ayVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C77027az azVar = this.f212583a;
        C74965n nVar = this.f212584b;
        C58485gu guVar = this.f212585c;
        Optional optional = this.f212586d;
        Optional optional2 = this.f212587e;
        String str = this.f212588f;
        C80399l lVar = this.f212589g;
        C80303ay ayVar = this.f212590h;
        Optional optional3 = (Optional) obj;
        C77087de k = C77088df.m123740k();
        C77129j jVar = (C77129j) k;
        jVar.f212874b = Optional.m71637of(azVar.f212605k);
        k.mo72404f(nVar);
        k.mo72402d(guVar);
        k.mo72401c(optional);
        if (optional2 != null) {
            jVar.f212873a = optional2;
            k.mo72400b(optional3);
            C77088df a = k.mo72399a();
            Locale q = nVar.mo71342q();
            boolean z = true;
            if (!azVar.f212601g.mo85405j(C90126fx.f251705np) && azVar.f212597c.mo72422j(a)) {
                z = false;
            }
            C58480gp e = C58485gu.m89837e();
            if (z) {
                e.mo55395g(new C77010ai(azVar, a));
                e.mo55395g(new C77018aq(azVar, a));
            } else {
                e.mo55395g(new C77019ar(azVar, a));
                e.mo55395g(new C77020as(azVar, a));
            }
            e.mo55395g(new C77021at(azVar, a, ayVar));
            return azVar.f212600f.mo28210j(C80905at.m128760d(azVar.f212600f, "[NGA] get messaging target", e.mo55394f()), "[NGA] fulfill sending message to a target", new C77022au(azVar, str, q, lVar, ayVar, a));
        }
        throw new NullPointerException("Null person");
    }
}
