package com.google.apps.tiktok.experiments.phenotype;

import com.google.apps.tiktok.experiments.C46904p;
import com.google.common.p4522b.C58495hd;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p5462h.p5463a.C69505av;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.df */
/* compiled from: PG */
public final class C46993df implements C46940bg {

    /* renamed from: a */
    private final AtomicReference f122522a;

    public C46993df(Map map, C46947bn bnVar) {
        C69664n.m101061g(map, "map");
        C69664n.m101061g(bnVar, "metadata");
        this.f122522a = new AtomicReference(new C46992de(map, bnVar, false));
    }

    /* renamed from: a */
    public final C46904p mo50927a(String str) {
        C46992de deVar;
        C69664n.m101061g(str, "experimentId");
        C46992de deVar2 = null;
        while (true) {
            deVar = (C46992de) this.f122522a.get();
            C69664n.m101060f(deVar, "it");
            if (!deVar.f122520b) {
                if (deVar2 == null) {
                    deVar2 = new C46992de(deVar.f122521c, deVar.f122519a, true);
                } else {
                    C58495hd hdVar = deVar.f122521c;
                    C69664n.m101061g(hdVar, "<set-?>");
                    deVar2.f122521c = hdVar;
                    C46947bn bnVar = deVar.f122519a;
                    C69664n.m101061g(bnVar, "<set-?>");
                    deVar2.f122519a = bnVar;
                }
                if (C46991dd.m83639a(this.f122522a, deVar, deVar2)) {
                    deVar = deVar2;
                    break;
                }
            } else {
                break;
            }
        }
        return (C46904p) C69505av.m100865g(deVar.f122521c, str);
    }

    /* renamed from: b */
    public final C46947bn mo50928b() {
        return ((C46992de) this.f122522a.get()).f122519a;
    }

    /* renamed from: c */
    public final Map mo50929c() {
        return ((C46992de) this.f122522a.get()).f122521c;
    }

    /* renamed from: d */
    public final void mo50930d() {
        throw new UnsupportedOperationException("Can't change observed values");
    }

    /* renamed from: f */
    public final boolean mo50931f() {
        return false;
    }

    /* renamed from: g */
    public final boolean mo50932g(Map map, C46947bn bnVar) {
        C46992de deVar;
        C69664n.m101061g(map, "newExperimentValues");
        C46992de deVar2 = null;
        do {
            deVar = (C46992de) this.f122522a.get();
            if (deVar.f122520b) {
                return false;
            }
            if (deVar2 == null) {
                deVar2 = new C46992de(map, bnVar, false);
            }
        } while (!C46991dd.m83639a(this.f122522a, deVar, deVar2));
        return true;
    }
}
