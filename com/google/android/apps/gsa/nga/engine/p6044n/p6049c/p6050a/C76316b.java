package com.google.android.apps.gsa.nga.engine.p6044n.p6049c.p6050a;

import android.os.Bundle;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.ae.e;
import com.google.android.apps.gsa.nga.engine.p6044n.p6049c.C76288a;
import com.google.android.apps.gsa.nga.engine.p6260x.C79853ak;
import com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79819do;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80295aq;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80363t;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80364u;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5072a.p5073a.p5074a.p5075a.C65475b;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.c.a.b */
/* compiled from: PG */
public final class C76316b implements C76288a {

    /* renamed from: a */
    public static final C58974d f211383a = C58974d.m91136j();

    /* renamed from: b */
    private final C79819do f211384b;

    /* renamed from: c */
    private final e f211385c;

    /* renamed from: d */
    private final C79853ak f211386d;

    public C76316b(C79819do doVar, e eVar, C79853ak akVar) {
        this.f211384b = doVar;
        this.f211385c = eVar;
        this.f211386d = akVar;
    }

    /* renamed from: a */
    public final C60870cx mo72159a(C80295aq aqVar, C65475b bVar) {
        C80364u uVar;
        C80364u uVar2;
        C80364u uVar3;
        Optional optional;
        if (aqVar.f220359a == 9) {
            uVar = (C80364u) aqVar.f220360b;
        } else {
            uVar = C80364u.f220516d;
        }
        int i = uVar.f220518a;
        int i2 = 3;
        if (i != 0) {
            i2 = i != 1 ? i != 3 ? 0 : 2 : 1;
        }
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        } else if (i3 == 0) {
            C79819do doVar = this.f211384b;
            C83320io ioVar = bVar.f177980a;
            if (ioVar == null) {
                ioVar = C83320io.f227132d;
            }
            doVar.f218883a.mo74237c(C89849ae.NGA_CLOUD_HANDOVER, ioVar);
            e eVar = this.f211385c;
            int i4 = aqVar.f220359a;
            if (i4 == 9) {
                uVar2 = (C80364u) aqVar.f220360b;
            } else {
                uVar2 = C80364u.f220516d;
            }
            String str = uVar2.f220518a == 1 ? (String) uVar2.f220519b : BuildConfig.FLAVOR;
            if (i4 == 9) {
                uVar3 = (C80364u) aqVar.f220360b;
            } else {
                uVar3 = C80364u.f220516d;
            }
            C80363t a = C80363t.m128122a(uVar3.f220520c);
            if (a == null) {
                a = C80363t.UNRECOGNIZED;
            }
            if (a != C80363t.GELLER_EVAL) {
                optional = Optional.empty();
            } else {
                Bundle bundle = new Bundle();
                C79853ak akVar = this.f211386d;
                C83320io ioVar2 = bVar.f177980a;
                if (ioVar2 == null) {
                    ioVar2 = C83320io.f227132d;
                }
                C60220t tVar = akVar.mo74220e(ioVar2).f162928b;
                if (tVar == null) {
                    tVar = C60220t.f162931e;
                }
                bundle.putLong("nga-request-timestamp", tVar.f162934b);
                optional = Optional.m71637of(bundle);
            }
            C60870cx b = eVar.b(str, optional);
            C80905at.m128763g(b, C76289a.f211319a);
            return b;
        } else if (i3 == 1) {
            ((C58970a) ((C58970a) f211383a.mo56226d()).mo56372aa(3509)).mo56386p("Cloud handover for client interactions is not supported.");
            return C118826c.f331423b;
        } else if (i3 == 2) {
            ((C58970a) ((C58970a) f211383a.mo56225c()).mo56372aa(3510)).mo56386p("Invalid CloudHandoverOp.");
            return C118826c.f331423b;
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: b */
    public final int mo72160b() {
        return 60010;
    }
}
