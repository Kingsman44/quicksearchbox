package com.google.android.apps.gsa.nga.engine.p6044n.p6049c.p6050a;

import com.google.android.apps.gsa.nga.engine.p6044n.p6049c.C76288a;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6157b.C78177a;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6202p.C78747a;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80295aq;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80346cn;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5072a.p5073a.p5074a.p5075a.C65475b;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.c.a.ba */
/* compiled from: PG */
public final class C76317ba implements C76288a {

    /* renamed from: a */
    private static final C58974d f211387a = C58974d.m91136j();

    /* renamed from: b */
    private final C78177a f211388b;

    /* renamed from: c */
    private final C78747a f211389c;

    public C76317ba(C78177a aVar, C78747a aVar2) {
        this.f211388b = aVar;
        this.f211389c = aVar2;
    }

    /* renamed from: a */
    public final C60870cx mo72159a(C80295aq aqVar, C65475b bVar) {
        C80346cn cnVar;
        if (aqVar.f220359a == 11) {
            cnVar = (C80346cn) aqVar.f220360b;
        } else {
            cnVar = C80346cn.f220465b;
        }
        int i = cnVar.f220467a;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 4 : 3 : 2;
        if (i2 == 0) {
            i2 = 1;
        }
        int i3 = i2 - 2;
        if (i3 == 0) {
            ((C58970a) ((C58970a) f211387a.mo56226d()).mo56372aa(3533)).mo56386p("SystemUiAction was not specified, not doing anything.");
            return C60856cj.m92899h(new IllegalArgumentException());
        } else if (i3 == 1) {
            return C118826c.m197213c(this.f211388b.mo73116a(Duration.ofMillis(400)));
        } else {
            if (i3 != 2) {
                ((C58970a) ((C58970a) f211387a.mo56225c()).mo56372aa(3534)).mo56386p("SystemUiAction is corrupt or not parsable.");
                return C60856cj.m92899h(new IllegalArgumentException());
            }
            this.f211389c.mo73599a();
            return C118826c.f331423b;
        }
    }

    /* renamed from: b */
    public final int mo72160b() {
        return 60011;
    }
}
