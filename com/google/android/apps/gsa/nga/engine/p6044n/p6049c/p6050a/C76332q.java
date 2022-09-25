package com.google.android.apps.gsa.nga.engine.p6044n.p6049c.p6050a;

import com.google.android.apps.gsa.nga.engine.p6044n.p6049c.C76288a;
import com.google.android.apps.gsa.nga.engine.p6144ui.C78018a;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80295aq;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80297as;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80298at;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5072a.p5073a.p5074a.p5075a.C65475b;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.c.a.q */
/* compiled from: PG */
public final class C76332q implements C76288a {

    /* renamed from: a */
    private static final C58974d f211408a = C58974d.m91136j();

    /* renamed from: b */
    private final C78018a f211409b;

    public C76332q(C78018a aVar) {
        this.f211409b = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo72159a(C80295aq aqVar, C65475b bVar) {
        C80298at atVar;
        if (aqVar.f220359a == 17) {
            atVar = (C80298at) aqVar.f220360b;
        } else {
            atVar = C80298at.f220368b;
        }
        C80297as asVar = C80297as.ACTION_UNSPECIFIED;
        C80297as a = C80297as.m128116a(atVar.f220370a);
        if (a == null) {
            a = C80297as.UNRECOGNIZED;
        }
        int ordinal = a.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                this.f211409b.mo72963b();
            } else if (ordinal == 2) {
                this.f211409b.mo72964c();
            } else if (ordinal == 3) {
                ((C58970a) ((C58970a) f211408a.mo56225c()).mo56372aa(3515)).mo56386p("PopupAction is corrupt or not parsable.");
                return C60856cj.m92899h(new IllegalArgumentException());
            }
            return C118826c.f331423b;
        }
        ((C58970a) ((C58970a) f211408a.mo56226d()).mo56372aa(3514)).mo56386p("PopupAction was not specified, not doing anything.");
        return C60856cj.m92899h(new IllegalArgumentException());
    }

    /* renamed from: b */
    public final int mo72160b() {
        return 60018;
    }
}
