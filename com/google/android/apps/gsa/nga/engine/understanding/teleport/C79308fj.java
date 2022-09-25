package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.android.apps.gsa.nga.engine.au.ak;
import com.google.android.apps.gsa.nga.engine.au.al;
import com.google.android.apps.gsa.nga.engine.au.cf;
import com.google.android.apps.gsa.nga.engine.au.d;
import com.google.android.apps.gsa.nga.engine.au.e;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.knowledge.p4661a.p4662a.C61752n;
import p001a.p014d.p015a.p016a.C0056as;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.fj */
/* compiled from: PG */
public final class C79308fj {

    /* renamed from: b */
    private static final C58974d f217802b = C58974d.m91136j();

    /* renamed from: a */
    public C0056as f217803a;

    /* renamed from: c */
    private final al f217804c;

    /* renamed from: d */
    private final e f217805d;

    /* renamed from: e */
    private final cf f217806e;

    /* renamed from: f */
    private ak f217807f;

    /* renamed from: g */
    private d f217808g;

    public C79308fj(al alVar, e eVar, cf cfVar) {
        this.f217804c = alVar;
        this.f217807f = alVar.a();
        this.f217805d = eVar;
        this.f217808g = eVar.a();
        this.f217806e = cfVar;
        this.f217803a = cfVar.a();
    }

    /* renamed from: b */
    public static final C61752n m127239b(String str, Optional optional, Optional optional2) {
        if (optional.isPresent() && optional2.isPresent()) {
            return C79164aa.m127116c(str, Optional.m71637of((String) optional.get()), Optional.m71637of((String) optional2.get()));
        }
        if (optional.isPresent()) {
            return C79164aa.m127116c(str, Optional.m71637of((String) optional.get()), Optional.empty());
        }
        return C79164aa.m127116c(str, Optional.empty(), Optional.m71637of((String) optional2.get()));
    }

    /* renamed from: a */
    public final C58485gu mo73867a(C79298f fVar, C79325w wVar) {
        Optional optional;
        this.f217807f = this.f217804c.a();
        this.f217808g = this.f217805d.a();
        this.f217803a = this.f217806e.a();
        C79326x a = new C79326x(Optional.m71637of(f217802b)).mo73900a("Running webref deeplink logic (using foreground app/website).");
        String d = wVar.mo73886a().mo73873d();
        if (d.isEmpty()) {
            a.mo73900a("Foreground app is browser so giving up on generating Webref Deeplink intent.");
            return C58485gu.m89845m();
        }
        C58485gu guVar = (C58485gu) Collection.EL.stream(fVar.mo73863i()).filter(new C79292eu(this)).filter(new C79302fd(fVar)).collect(C58370cn.f155946a);
        C58528ij F = C58528ij.m90006F(this.f217803a.f149a);
        Stream map = Collection.EL.stream(guVar).map(C79303fe.f217797a);
        Objects.requireNonNull(F);
        if (map.filter(new C79304ff(F)).peek(new C79305fg(a)).findFirst().isPresent()) {
            return C58485gu.m89845m();
        }
        C58528ij F2 = C58528ij.m90006F(this.f217803a.f150b);
        Stream flatMap = Collection.EL.stream(guVar).flatMap(C79306fh.f217800a);
        Objects.requireNonNull(F2);
        if (flatMap.filter(new C79304ff(F2)).peek(new C79307fi(a)).findFirst().isPresent()) {
            return C58485gu.m89845m();
        }
        C79311i a2 = wVar.mo73886a();
        if (a2.mo73870a().equals(C79310h.URL)) {
            optional = this.f217807f.b(a2.mo73873d(), Optional.m71637of(this.f217808g));
        } else {
            optional = this.f217807f.b(a2.mo73873d(), Optional.empty());
        }
        Optional map2 = optional.map(C79293ev.f217781a);
        if (!map2.isPresent()) {
            return C58485gu.m89845m();
        }
        C58485gu guVar2 = (C58485gu) Collection.EL.stream(guVar).map(C79300fb.f217794a).flatMap(new C79299fa(this, map2, d, a)).collect(C58370cn.f155946a);
        if (!guVar2.isEmpty()) {
            return guVar2;
        }
        return (C58485gu) Collection.EL.stream(guVar).map(C79300fb.f217794a).map(new C79301fc(d)).collect(C58370cn.f155946a);
    }
}
