package com.google.android.apps.gsa.nga.engine.p6044n.p6049c.p6050a;

import com.google.android.apps.gsa.nga.engine.am.h.ct;
import com.google.android.apps.gsa.nga.engine.p6044n.p6049c.C76288a;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80295aq;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80306ba;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80307bb;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4152bb.p4153a.C55421x;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5072a.p5073a.p5074a.p5075a.C65475b;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.c.a.w */
/* compiled from: PG */
public final class C76338w implements C76288a {

    /* renamed from: a */
    private static final C58974d f211428a = C58974d.m91136j();

    /* renamed from: b */
    private final ct f211429b;

    public C76338w(ct ctVar) {
        this.f211429b = ctVar;
    }

    /* renamed from: a */
    public final C60870cx mo72159a(C80295aq aqVar, C65475b bVar) {
        C80307bb bbVar;
        if (aqVar.f220359a == 6) {
            bbVar = (C80307bb) aqVar.f220360b;
        } else {
            bbVar = C80307bb.f220382e;
        }
        int a = C80306ba.m128119a(bbVar.f220385b);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 1) {
            ct ctVar = this.f211429b;
            C55421x a2 = C55421x.m87686a(bbVar.f220386c);
            if (a2 == null) {
                a2 = C55421x.UNKNOWN_ACTION_TYPE;
            }
            C83320io ioVar = bVar.f177980a;
            if (ioVar == null) {
                ioVar = C83320io.f227132d;
            }
            return ctVar.a(a2, ioVar, bbVar.f220387d);
        } else if (i != 2) {
            ((C58970a) ((C58970a) f211428a.mo56225c()).mo56372aa(3518)).mo56386p("AUM results present, but with UNKNOWN outcome.");
            return C118826c.f331423b;
        } else {
            ct ctVar2 = this.f211429b;
            C55421x a3 = C55421x.m87686a(bbVar.f220386c);
            if (a3 == null) {
                a3 = C55421x.UNKNOWN_ACTION_TYPE;
            }
            C83320io ioVar2 = bVar.f177980a;
            if (ioVar2 == null) {
                ioVar2 = C83320io.f227132d;
            }
            return ctVar2.b(a3, ioVar2, bbVar.f220387d);
        }
    }

    /* renamed from: b */
    public final int mo72160b() {
        return 60006;
    }
}
