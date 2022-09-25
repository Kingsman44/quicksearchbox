package com.google.apps.tiktok.experiments.phenotype;

import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.experiments.C46904p;
import com.google.common.p4522b.C58479go;
import com.google.common.p4522b.C58495hd;
import java.util.Map;
import p5462h.p5463a.C69505av;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.do */
/* compiled from: PG */
public final class C47002do implements C46940bg {

    /* renamed from: a */
    private volatile C46947bn f122540a;

    /* renamed from: b */
    private C58495hd f122541b;

    /* renamed from: c */
    private boolean f122542c;

    /* renamed from: d */
    private C58495hd f122543d;

    /* renamed from: e */
    private C46947bn f122544e;

    public C47002do(Map map, C46947bn bnVar) {
        C69664n.m101061g(map, "initialValues");
        C69664n.m101061g(bnVar, "metadata");
        this.f122540a = bnVar;
        this.f122541b = C58479go.m89813e(map);
    }

    /* renamed from: a */
    public final C46904p mo50927a(String str) {
        C69664n.m101061g(str, "experimentId");
        C19559g.m37304c();
        Object g = C69505av.m100865g(this.f122541b, str);
        C69664n.m101060f(g, "experimentValues.getValue(experimentId)");
        C46904p pVar = (C46904p) g;
        this.f122542c = true;
        return pVar;
    }

    /* renamed from: b */
    public final C46947bn mo50928b() {
        return this.f122540a;
    }

    /* renamed from: c */
    public final Map mo50929c() {
        C19559g.m37304c();
        return this.f122541b;
    }

    /* renamed from: d */
    public final void mo50930d() {
        C19559g.m37304c();
        C58495hd hdVar = this.f122543d;
        C69664n.m101058d(hdVar);
        this.f122541b = hdVar;
        C46947bn bnVar = this.f122544e;
        C69664n.m101058d(bnVar);
        mo50966e(bnVar);
        this.f122542c = false;
        this.f122543d = null;
    }

    /* renamed from: e */
    public final void mo50966e(C46947bn bnVar) {
        C69664n.m101061g(bnVar, "<set-?>");
        this.f122540a = bnVar;
    }

    /* renamed from: f */
    public final boolean mo50931f() {
        C19559g.m37304c();
        return this.f122543d != null;
    }

    /* renamed from: g */
    public final boolean mo50932g(Map map, C46947bn bnVar) {
        C69664n.m101061g(map, "newExperimentValues");
        C19559g.m37304c();
        C58495hd e = C58479go.m89813e(map);
        if (this.f122542c) {
            this.f122543d = e;
            this.f122544e = bnVar;
            return false;
        }
        this.f122541b = e;
        mo50966e(bnVar);
        return true;
    }
}
