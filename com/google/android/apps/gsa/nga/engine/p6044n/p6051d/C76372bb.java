package com.google.android.apps.gsa.nga.engine.p6044n.p6051d;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80280ab;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80281ac;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4580v.C60948g;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.d.bb */
/* compiled from: PG */
public final /* synthetic */ class C76372bb implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C76374bd f211495a;

    public /* synthetic */ C76372bb(C76374bd bdVar) {
        this.f211495a = bdVar;
    }

    public final void run() {
        C76374bd bdVar = this.f211495a;
        C80280ab abVar = (C80280ab) C80281ac.f220298c.createBuilder();
        C60948g gVar = C60948g.f165068a;
        long epochMilli = Instant.now().toEpochMilli();
        abVar.copyOnWrite();
        ((C80281ac) abVar.instance).f220301b = epochMilli;
        abVar.copyOnWrite();
        ((C80281ac) abVar.instance).f220300a = BuildConfig.FLAVOR;
        bdVar.mo72179b((C80281ac) abVar.build());
    }
}
