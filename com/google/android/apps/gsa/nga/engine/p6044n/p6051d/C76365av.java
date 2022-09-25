package com.google.android.apps.gsa.nga.engine.p6044n.p6051d;

import com.google.android.apps.gsa.nga.engine.p6056o.C76536ad;
import com.google.android.apps.gsa.nga.shared.p6407v.C83319in;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.util.concurrent.C60856cj;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.d.av */
/* compiled from: PG */
public final /* synthetic */ class C76365av implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C76374bd f211484a;

    public /* synthetic */ C76365av(C76374bd bdVar) {
        this.f211484a = bdVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C76374bd bdVar = this.f211484a;
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            return C60856cj.m92900i(optional);
        }
        C76536ad adVar = bdVar.f211499c;
        C83319in inVar = (C83319in) C83320io.f227132d.createBuilder();
        inVar.copyOnWrite();
        C83320io ioVar = (C83320io) inVar.instance;
        ioVar.f227134a |= 2;
        ioVar.f227136c = "UtteranceIdForFeedback";
        return bdVar.f211500d.mo28209i(adVar.mo72227f(false, (C83320io) inVar.build()).mo72559b(), "[NGA] take background screenshot", C76367ax.f211486a);
    }
}
