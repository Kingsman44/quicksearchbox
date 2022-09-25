package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import com.google.android.apps.gsa.n.b;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80136bn;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80529z;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c.p8086a.C103651a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.x */
/* compiled from: PG */
public final class C103742x implements C103651a {

    /* renamed from: a */
    public static final C58974d f288903a = C58974d.m91136j();

    /* renamed from: b */
    private final b f288904b;

    /* renamed from: c */
    private final C22871g f288905c;

    public C103742x(b bVar, C22871g gVar) {
        this.f288904b = bVar;
        this.f288905c = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo93582a(C80136bn bnVar) {
        C80529z zVar;
        if (bnVar.f219917a == 10) {
            zVar = (C80529z) bnVar.f219918b;
        } else {
            zVar = C80529z.f221064f;
        }
        C80529z zVar2 = zVar;
        C65753ak b = C65753ak.m96797b(zVar2.f221068c);
        if (b == null) {
            b = C65753ak.UNKNOWN;
        }
        C60870cx j = this.f288905c.mo28210j(this.f288904b.b(), "[NGA] incrementElementUsed", new C103739u(zVar2, b, zVar2.f221069d, zVar2.f221070e));
        this.f288905c.mo28211k(j, "[NGA] incrementElementUsed", new C103741w());
        C60870cx g = C60922j.m93044g(j, new C103740v(b), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return g;
    }
}
