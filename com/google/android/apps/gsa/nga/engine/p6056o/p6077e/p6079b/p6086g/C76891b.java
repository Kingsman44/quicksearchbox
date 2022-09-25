package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6086g;

import android.content.Intent;
import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76564ah;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.g.b */
/* compiled from: PG */
public final /* synthetic */ class C76891b implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C76892c f212332a;

    /* renamed from: b */
    public final /* synthetic */ C76590bg f212333b;

    /* renamed from: c */
    public final /* synthetic */ C74965n f212334c;

    public /* synthetic */ C76891b(C76892c cVar, C76590bg bgVar, C74965n nVar) {
        this.f212332a = cVar;
        this.f212333b = bgVar;
        this.f212334c = nVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C76892c cVar = this.f212332a;
        C76590bg bgVar = this.f212333b;
        C74965n nVar = this.f212334c;
        Optional g = bgVar.mo72265g(C76564ah.f211801a, "keyword");
        int a = C76890a.m123509a(cVar.f212336b);
        if (a < 0 || g.isEmpty()) {
            ((C58970a) ((C58970a) C76892c.f212335a.mo56224b()).mo56372aa(3787)).mo56386p("recorder not installed or query is empty");
            return C80401n.f220656k;
        }
        Intent intent = new Intent("com.google.android.apps.recorder.VOICE_COMMAND_SEARCH");
        intent.setPackage("com.google.android.apps.recorder");
        intent.putExtra("query", (String) g.get());
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        lVar.copyOnWrite();
        ((C80401n) lVar.instance).f220663f = true;
        C81442m.m129557s(lVar, t.u(intent, C76890a.m123510b(a), nVar.mo71336k(), false, false));
        lVar.mo74319k(101891);
        return (C80401n) lVar.build();
    }
}
