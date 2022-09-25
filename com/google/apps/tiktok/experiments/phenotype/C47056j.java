package com.google.apps.tiktok.experiments.phenotype;

import androidx.p060c.C0984n;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.experiments.C46904p;
import com.google.common.p4522b.C58490gz;
import java.util.Map;
import p5462h.p5463a.C69505av;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.j */
/* compiled from: PG */
public final class C47056j implements C46940bg {

    /* renamed from: a */
    public volatile C46947bn f122643a;

    /* renamed from: b */
    private C0984n f122644b = new C0984n(0);

    /* renamed from: c */
    private C0984n f122645c;

    /* renamed from: d */
    private C46947bn f122646d;

    public C47056j(Map map, C46947bn bnVar) {
        C69664n.m101061g(map, "initialValues");
        C69664n.m101061g(bnVar, "metadata");
        this.f122643a = bnVar;
        if (!mo50932g(map, this.f122643a)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* renamed from: a */
    public final C46904p mo50927a(String str) {
        C69664n.m101061g(str, "experimentId");
        Object obj = this.f122644b.get(str);
        C69664n.m101058d(obj);
        C47055i iVar = (C47055i) obj;
        iVar.f122642b = true;
        return iVar.f122641a;
    }

    /* renamed from: b */
    public final C46947bn mo50928b() {
        return this.f122643a;
    }

    /* renamed from: c */
    public final Map mo50929c() {
        C19559g.m37304c();
        C58490gz gzVar = new C58490gz(4);
        int i = this.f122644b.f3122d;
        for (int i2 = 0; i2 < i; i2++) {
            gzVar.mo55429h(this.f122644b.mo3702e(i2), ((C47055i) this.f122644b.mo3708h(i2)).f122641a);
        }
        return gzVar.mo55427f(true);
    }

    /* renamed from: d */
    public final void mo50930d() {
        C0984n nVar = this.f122645c;
        C69664n.m101058d(nVar);
        this.f122644b = nVar;
        C46947bn bnVar = this.f122646d;
        C69664n.m101058d(bnVar);
        mo50990e(bnVar);
    }

    /* renamed from: e */
    public final void mo50990e(C46947bn bnVar) {
        C69664n.m101061g(bnVar, "<set-?>");
        this.f122643a = bnVar;
    }

    /* renamed from: f */
    public final boolean mo50931f() {
        return this.f122645c != null;
    }

    /* renamed from: g */
    public final boolean mo50932g(Map map, C46947bn bnVar) {
        C69664n.m101061g(map, "newExperimentValues");
        C69664n.m101061g(bnVar, "metadata");
        int i = this.f122644b.f3122d;
        int i2 = 0;
        while (i2 < i) {
            C46904p pVar = (C46904p) C69505av.m100865g(map, (String) this.f122644b.mo3702e(i2));
            C47055i iVar = (C47055i) this.f122644b.mo3708h(i2);
            C69664n.m101061g(pVar, "newValue");
            if (C69664n.m101066l(iVar.f122641a, pVar) || !iVar.f122642b) {
                i2++;
            } else {
                C0984n nVar = new C0984n(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    nVar.put((String) entry.getKey(), new C47055i((C46904p) entry.getValue()));
                }
                this.f122645c = nVar;
                this.f122646d = bnVar;
                return false;
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            String str = (String) entry2.getKey();
            C46904p pVar2 = (C46904p) entry2.getValue();
            C47055i iVar2 = (C47055i) this.f122644b.get(str);
            if (iVar2 == null) {
                this.f122644b.put(str, new C47055i(pVar2));
            } else {
                C69664n.m101061g(pVar2, "newValue");
                iVar2.f122641a = pVar2;
            }
        }
        mo50990e(bnVar);
        this.f122645c = null;
        this.f122646d = null;
        return true;
    }
}
