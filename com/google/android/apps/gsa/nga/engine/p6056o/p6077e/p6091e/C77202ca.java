package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import android.net.Uri;
import com.google.android.apps.gsa.nga.engine.am.c.a.ac;
import com.google.android.apps.gsa.nga.engine.am.c.a.at;
import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.engine.p5913am.p5917c.C74885bc;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6407v.C83044e;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82835ce;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3897e.p3917i.p3918a.C51559me;
import com.google.assistant.p3897e.p3917i.p3918a.C51560mf;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.ca */
/* compiled from: PG */
public final /* synthetic */ class C77202ca implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C77205cd f213019a;

    /* renamed from: b */
    public final /* synthetic */ C74965n f213020b;

    public /* synthetic */ C77202ca(C77205cd cdVar, C74965n nVar) {
        this.f213019a = cdVar;
        this.f213020b = nVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C77205cd cdVar = this.f213019a;
        C74965n nVar = this.f213020b;
        C58485gu b = ((C74885bc) obj).mo71274b();
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        lVar.mo74319k(79953);
        lVar.copyOnWrite();
        ((C80401n) lVar.instance).f220663f = true;
        if (b.size() != 1) {
            ((C58970a) ((C58970a) C77205cd.f213023a.mo56226d()).mo56372aa(3839)).mo56387q("Found %d stopwatches, can only handle exactly 1.", b.size());
            cdVar.f213024b.mo76648a(nVar.mo71336k(), C82835ce.QUANTIFIERS_NOT_IMPLEMENTED, C83044e.f226656a);
            return C80401n.f220656k;
        }
        C51560mf mfVar = (C51560mf) b.get(0);
        C51559me a = C51559me.m86216a(mfVar.f134386c);
        if (a == null) {
            a = C51559me.UNDEFINED;
        }
        if (a.equals(C51559me.PAUSED)) {
            C81442m.m129557s(lVar, t.r(cdVar.f213025c.mo75121a(nVar.mo71342q()).getString(R.string.nga_productivity_mark_lap_paused_stopwatch, new Object[0])));
            return (C80401n) lVar.build();
        }
        Collection.EL.stream(ac.b(new Uri[]{at.a(mfVar, "lap"), at.a(mfVar, "view")})).map(new C77203cb(nVar)).forEach(new C77204cc(lVar));
        return (C80401n) lVar.build();
    }
}
