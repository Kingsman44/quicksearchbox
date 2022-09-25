package com.google.android.libraries.componentview.components.agsa;

import com.google.android.libraries.componentview.components.agsa.p1684a.C19844c;
import com.google.android.libraries.componentview.components.agsa.p1684a.C19845d;
import com.google.android.libraries.componentview.p1697d.C20477h;
import com.google.android.libraries.componentview.p1697d.C20483n;
import com.google.android.libraries.componentview.services.application.C20546a;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.C20613d;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.p4271bq.C56429h;

/* renamed from: com.google.android.libraries.componentview.components.agsa.e */
/* compiled from: PG */
public class C19866e extends C20483n {

    /* renamed from: a */
    public final C20537f f55577a;

    /* renamed from: b */
    public final C20601ca f55578b;

    /* renamed from: c */
    public final C20546a f55579c;

    /* renamed from: d */
    public C19845d f55580d;

    public C19866e(C56425d dVar, C20537f fVar, C20601ca caVar, C20546a aVar) {
        super(dVar);
        this.f55577a = fVar;
        this.f55578b = caVar;
        this.f55579c = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C56425d mo25107g(C56425d dVar) {
        if (dVar != null) {
            C19844c cVar = (C19844c) this.f55580d.toBuilder();
            cVar.copyOnWrite();
            C19845d dVar2 = (C19845d) cVar.instance;
            dVar2.f55486b = dVar;
            dVar2.f55485a |= 1;
            this.f55580d = (C19845d) cVar.build();
        }
        C56424c cVar2 = (C56424c) this.f57588z.toBuilder();
        cVar2.mo58885m(C19845d.f55483f, this.f55580d);
        return (C56425d) cVar2.build();
    }

    /* renamed from: kC */
    public final boolean mo25115kC(int i, C20477h hVar) {
        if (i != 3 || hVar == null || !(hVar instanceof C19841a)) {
            return false;
        }
        C19841a aVar = (C19841a) hVar;
        int a = aVar.mo25148a();
        C20546a aVar2 = this.f55579c;
        C19845d dVar = this.f55580d;
        String str = dVar.f55488d;
        aVar2.mo25478d(dVar.f55487c, a);
        String str2 = (String) this.f55580d.f55487c.get(a);
        C56429h b = aVar.mo25149b();
        if (b == null) {
            return true;
        }
        C20601ca caVar = this.f55578b;
        C20613d dVar2 = new C20613d();
        dVar2.mo25529b(str2);
        dVar2.mo25530c(b.f150556h);
        dVar2.f57816c = b.f150555g;
        dVar2.f57817d = b.f150558j;
        caVar.mo21037a(dVar2.mo25528a());
        return true;
    }

    /* renamed from: kx */
    public final void mo25108kx() {
    }
}
