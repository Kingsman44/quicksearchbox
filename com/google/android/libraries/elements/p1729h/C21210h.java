package com.google.android.libraries.elements.p1729h;

import com.facebook.litho.C6381hf;
import com.facebook.litho.C6411u;
import com.google.android.libraries.elements.interfaces.C21251au;
import com.google.android.libraries.elements.interfaces.C21303j;
import com.google.android.libraries.elements.interfaces.C21305l;
import com.google.android.libraries.elements.interfaces.C21307n;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3138g.C40369aa;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.elements.h.h */
/* compiled from: PG */
final class C21210h implements C21305l {

    /* renamed from: b */
    final /* synthetic */ C21211i f59525b;

    public C21210h(C21211i iVar) {
        this.f59525b = iVar;
    }

    /* renamed from: a */
    public final C21307n mo26262a(C6411u uVar, int i) {
        if (((C21199ab) C21208f.f59507b.get(i)) != null) {
            int i2 = C21213k.f59533a;
            if (C21211i.f59526b.compareAndSet(true, false)) {
                C21219q qVar = this.f59525b.f59531g;
                qVar.f59540b.execute(new C21218p(qVar));
            }
            C21251au auVar = (C21251au) uVar.mo13469d(C21251au.class);
            if (auVar != null && auVar.f59571b.compareAndSet(true, false)) {
                C21211i iVar = this.f59525b;
                String str = iVar.f59529e;
                C40369aa aaVar = iVar.f59530f;
                C21203af afVar = iVar.f59527c;
                Executor executor = iVar.f59528d;
                C21226x xVar = C21226x.f59558b;
                return new C21208f(i, str, aaVar, afVar, executor);
            }
        }
        return C21307n.f59677a;
    }

    /* renamed from: b */
    public final boolean mo26263b() {
        return true;
    }

    /* renamed from: c */
    public final /* synthetic */ Map mo26264c(C6381hf hfVar) {
        return C21303j.m40229a(this, hfVar);
    }
}
