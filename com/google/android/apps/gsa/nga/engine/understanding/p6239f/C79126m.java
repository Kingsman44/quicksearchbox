package com.google.android.apps.gsa.nga.engine.understanding.p6239f;

import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6260x.C79850ah;
import com.google.android.apps.gsa.nga.engine.p6260x.C79851ai;
import com.google.android.apps.gsa.nga.engine.understanding.C79330v;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80515d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.knowledge.p4661a.p4662a.C61751m;
import com.google.knowledge.p4661a.p4662a.C61752n;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.f.m */
/* compiled from: PG */
abstract class C79126m implements C79131r {

    /* renamed from: a */
    protected final C22871g f217522a;

    /* renamed from: b */
    private final C79851ai f217523b;

    public C79126m(C79851ai aiVar, C22871g gVar) {
        this.f217523b = aiVar;
        this.f217522a = gVar;
    }

    /* renamed from: d */
    private final C60870cx m127044d(C61752n nVar, C80515d dVar, C79330v vVar) {
        C60870cx cxVar;
        C61752n nVar2;
        C60870cx i = C60856cj.m92900i((C61751m) nVar.toBuilder());
        for (int i2 = 0; i2 < nVar.f166812c.size(); i2++) {
            C61746h hVar = (C61746h) nVar.f166812c.get(i2);
            C61748j jVar = hVar.f166797e;
            if (jVar == null) {
                jVar = C61748j.f166800d;
            }
            if (jVar.f166802a == 2) {
                C22871g gVar = this.f217522a;
                C61748j jVar2 = hVar.f166797e;
                if (jVar2 == null) {
                    jVar2 = C61748j.f166800d;
                }
                if (jVar2.f166802a == 2) {
                    nVar2 = (C61752n) jVar2.f166803b;
                } else {
                    nVar2 = C61752n.f166808f;
                }
                cxVar = gVar.mo28209i(m127044d(nVar2, dVar, vVar), "[NGA] ArgumentValueResolver.resolveRecursively", new C79122i(hVar));
            } else {
                C61748j jVar3 = hVar.f166797e;
                if (jVar3 == null) {
                    jVar3 = C61748j.f166800d;
                }
                if (!mo73805a(jVar3, dVar)) {
                } else {
                    C61748j jVar4 = hVar.f166797e;
                    if (jVar4 == null) {
                        jVar4 = C61748j.f166800d;
                    }
                    cxVar = mo73806b(jVar4);
                }
            }
            i = this.f217522a.mo28210j(cxVar, "[NGA] ArgumentValueResolver.resolveRecursively.updateBuilder", new C79123j(this, i, i2, hVar));
        }
        return this.f217522a.mo28205e(this.f217522a.mo28209i(i, "[NGA] ArgumentValueResolver.build", C79124k.f217520a), "[NGA] ArgumentValueResolver.catchUnresolved", CancellationException.class, C79125l.f217521a);
    }

    /* renamed from: a */
    public abstract boolean mo73805a(C61748j jVar, C80515d dVar);

    /* renamed from: b */
    public abstract C60870cx mo73806b(C61748j jVar);

    /* renamed from: c */
    public final C60870cx mo73807c(C61752n nVar, C80515d dVar, C74965n nVar2) {
        C79850ah c = this.f217523b.mo74252c(8, nVar2.mo71336k());
        try {
            C60870cx i = this.f217522a.mo28209i(m127044d(nVar, dVar, C79330v.m127277b(nVar.f166811b)), "[NGA] ArgumentValueResolver.resolve", C79118e.f217509a);
            if (c != null) {
                c.mo74255b();
            }
            return i;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
