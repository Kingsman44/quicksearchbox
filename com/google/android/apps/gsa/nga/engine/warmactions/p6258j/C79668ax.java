package com.google.android.apps.gsa.nga.engine.warmactions.p6258j;

import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.android.apps.gsa.nga.shared.p6331aq.p6333b.C81013d;
import com.google.android.apps.gsa.nga.shared.p6331aq.p6333b.C81014e;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82474gn;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82475go;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.j.ax */
/* compiled from: PG */
final class C79668ax implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C79690bs f218490a;

    /* renamed from: b */
    final /* synthetic */ C79672ba f218491b;

    public C79668ax(C79672ba baVar, C79690bs bsVar) {
        this.f218491b = baVar;
        this.f218490a = bsVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C58970a aVar = (C58970a) ((C58970a) ((C58970a) C79672ba.f218494a.mo56225c()).mo56382g(th)).mo56372aa(5735);
        String g = this.f218490a.mo74199g();
        C79570b a = C79570b.m127648a(this.f218490a.mo74195c().f218349c);
        if (a == null) {
            a = C79570b.CONTEXT_TYPE_UNSPECIFIED;
        }
        aVar.mo56354G("Unexpected error when executing #MWW query '%s' for context %s.", g, a.name());
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C79672ba baVar = this.f218491b;
        C79690bs bsVar = this.f218490a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C58970a aVar = (C58970a) ((C58970a) C79672ba.f218494a.mo56224b()).mo56372aa(5753);
        String g = bsVar.mo74199g();
        C79570b a = C79570b.m127648a(bsVar.mo74195c().f218349c);
        if (a == null) {
            a = C79570b.CONTEXT_TYPE_UNSPECIFIED;
        }
        aVar.mo56361N("#MWW Query '%s' for context %s was verified. %s executing command '%s' (after %d events).", g, a.name(), true != booleanValue ? "Failed" : "Succeeded", bsVar.mo74198f(), Long.valueOf(baVar.f218501h.get()));
        if (booleanValue) {
            double a2 = baVar.f218502i.mo74782a();
            bsVar.mo74199g();
            C79570b a3 = C79570b.m127648a(bsVar.mo74195c().f218349c);
            if (a3 == null) {
                a3 = C79570b.CONTEXT_TYPE_UNSPECIFIED;
            }
            a3.name();
            Double valueOf = Double.valueOf(a2);
            if (baVar.f218499f.mo85405j(C90126fx.f251783pn)) {
                C81013d dVar = baVar.f218498e;
                C79570b a4 = C79570b.m127648a(bsVar.mo74195c().f218349c);
                if (a4 == null) {
                    a4 = C79570b.CONTEXT_TYPE_UNSPECIFIED;
                }
                String f = bsVar.mo74198f();
                C83305i iVar = ((C81014e) dVar).f222055a;
                int i = a4.f218339o;
                if (f != null) {
                    iVar.mo75579d(new C82474gn("NGA_WARM_ACTIONS_TRIGGER_MEAN_AUDIO_LEVEL_SINCE_FINAL", valueOf, i, f));
                } else {
                    throw new NullPointerException("Null command");
                }
            }
            if (baVar.f218499f.mo85405j(C90126fx.f251782pm)) {
                C81013d dVar2 = baVar.f218498e;
                C79570b a5 = C79570b.m127648a(bsVar.mo74195c().f218349c);
                if (a5 == null) {
                    a5 = C79570b.CONTEXT_TYPE_UNSPECIFIED;
                }
                String f2 = bsVar.mo74198f();
                long j = baVar.f218501h.get();
                C83305i iVar2 = ((C81014e) dVar2).f222055a;
                int i2 = a5.f218339o;
                if (f2 != null) {
                    iVar2.mo75579d(new C82475go("NGA_WARM_ACTIONS_TRIGGER_SODA_EVENT_COUNT", Double.valueOf((double) j), i2, f2));
                    return;
                }
                throw new NullPointerException("Null command");
            }
        }
    }
}
