package com.google.android.apps.gsa.nga.engine.understanding.p6237d;

import com.google.android.apps.gsa.nga.engine.geniefm.C76105k;
import com.google.android.apps.gsa.nga.engine.geniefm.C76106l;
import com.google.android.apps.gsa.nga.engine.geniefm.C76107m;
import com.google.android.apps.gsa.nga.engine.geniefm.C76108n;
import com.google.android.apps.gsa.nga.engine.grammar.C76129g;
import com.google.android.apps.gsa.nga.engine.grammar.C76143u;
import com.google.common.p4522b.C58529ik;
import com.google.nlp.p4735b.p4736a.p4738b.C62825g;
import com.google.nlp.p4735b.p4736a.p4738b.C62829k;
import com.google.nlp.p4735b.p4736a.p4738b.C62830l;
import com.google.nlp.p4735b.p4736a.p4738b.C62831m;
import com.google.nlp.p4735b.p4736a.p4738b.C62832n;
import com.google.nlp.p4735b.p4736a.p4738b.C62833o;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.d.z */
/* compiled from: PG */
public final class C79073z {

    /* renamed from: a */
    public final Map f217422a = new HashMap();

    /* renamed from: b */
    public final Map f217423b = new HashMap();

    /* renamed from: c */
    public final C58529ik f217424c = new C58529ik();

    /* renamed from: d */
    private final C76143u f217425d;

    /* renamed from: e */
    private final C62833o f217426e;

    /* renamed from: f */
    private final C76108n f217427f;

    public C79073z(C76143u uVar, C62833o oVar, C76108n nVar) {
        this.f217425d = uVar;
        this.f217426e = oVar;
        this.f217427f = nVar;
    }

    /* renamed from: a */
    public final C79058k mo73797a() {
        Optional.empty();
        for (C62831m mVar : this.f217426e.f169675a) {
            this.f217422a.put(mVar.f169669b, (C62830l) mVar.toBuilder());
        }
        Collection.EL.stream(this.f217426e.f169676b).forEach(new C79059l(this));
        C62832n nVar = (C62832n) C62833o.f169673c.createBuilder();
        Stream filter = Collection.EL.stream(this.f217422a.values()).map(C79064q.f217411a).filter(C79065r.f217412a);
        Objects.requireNonNull(nVar);
        filter.forEach(new C79066s(nVar));
        C62833o oVar = (C62833o) nVar.build();
        if (oVar != null) {
            for (C76106l lVar : this.f217427f.f211003a) {
                this.f217423b.put(lVar.f210998a, (C76105k) lVar.toBuilder());
            }
            Collection.EL.stream(this.f217427f.f211004b).forEach(new C79067t(this, this.f217424c.mo55493a()));
            C76107m mVar2 = (C76107m) C76108n.f211001c.createBuilder();
            Stream filter2 = Collection.EL.stream(this.f217423b.values()).map(C79068u.f217416a).filter(C79069v.f217417a);
            Objects.requireNonNull(mVar2);
            filter2.forEach(new C79070w(mVar2));
            return new C79045a(oVar, Optional.ofNullable((C76108n) Optional.m71637of((C76108n) mVar2.build()).orElse(null)));
        }
        throw new NullPointerException("Null intentPackages");
    }

    /* renamed from: b */
    public final boolean mo73798b(C62829k kVar) {
        try {
            C62825g gVar = kVar.f169664a;
            if (gVar == null) {
                gVar = C62825g.f169654c;
            }
            if (!C76129g.m122710b(gVar).mo72075a(this.f217425d).isEmpty()) {
                return true;
            }
            return false;
        } catch (IOException unused) {
        }
    }
}
