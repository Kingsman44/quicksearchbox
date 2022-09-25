package com.google.android.apps.gsa.search.core.p6494aa;

import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.p8885y.p8886a.C118828a;
import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.android.apps.gsa.shared.logger.p7051b.C89860j;
import com.google.android.libraries.gsa.p1864f.p1865a.C22804a;
import com.google.common.p4522b.C58541iw;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.aa.a */
/* compiled from: PG */
public final class C84382a implements C118827a, C89860j {

    /* renamed from: a */
    private final C118828a f229640a;

    public C84382a(C118828a aVar) {
        this.f229640a = aVar;
    }

    /* renamed from: a */
    public final C84392c mo77938a() {
        return this.f229640a.mo77938a();
    }

    /* renamed from: b */
    public final List mo77939b() {
        return this.f229640a.mo77939b();
    }

    /* renamed from: c */
    public final void mo77940c(C58541iw iwVar, C60548tz tzVar) {
        C22804a aVar = (C22804a) iwVar.iterator().next();
        if (aVar != null) {
            tzVar.copyOnWrite();
            C60555uf ufVar = C60555uf.f164065cO;
            ((C60555uf) tzVar.instance).f164098aE = C60555uf.emptyProtobufList();
            tzVar.mo57111a(this.f229640a.mo104014c(aVar.f62787b));
        }
    }

    /* renamed from: d */
    public final void mo77941d(C58541iw iwVar) {
        C58800sl lA = iwVar.iterator();
        while (lA.hasNext()) {
            this.f229640a.mo104015d(((C22804a) lA.next()).f62787b);
        }
    }

    /* renamed from: e */
    public final void mo77942e(C22804a aVar) {
        this.f229640a.mo104015d(aVar.f62787b);
    }

    /* renamed from: f */
    public final void mo77943f(C22804a aVar) {
    }

    /* renamed from: g */
    public final C118831d mo77944g(C118569b bVar, C118575h hVar) {
        return this.f229640a.mo77944g(bVar, hVar);
    }

    /* renamed from: h */
    public final C118831d mo77945h(C118569b bVar, C118575h hVar, C118575h hVar2) {
        return this.f229640a.mo77945h(bVar, hVar, hVar2);
    }

    /* renamed from: i */
    public final C118831d mo77946i(C118569b bVar, C118575h hVar, C118575h hVar2, int i) {
        return this.f229640a.mo77946i(bVar, hVar, hVar2, i);
    }

    /* renamed from: j */
    public final void mo77947j(C58541iw iwVar) {
    }
}
