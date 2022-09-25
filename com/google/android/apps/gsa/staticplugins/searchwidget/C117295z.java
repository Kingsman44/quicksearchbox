package com.google.android.apps.gsa.staticplugins.searchwidget;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C89972ak;
import com.google.android.apps.gsa.shared.p7192v.C91149b;
import com.google.android.apps.gsa.shared.p7192v.C91165r;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60545tw;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.util.concurrent.C60826bg;
import com.google.protos.p4816ai.p4818b.C63196b;
import p3186j$.time.Instant;
import p3186j$.time.temporal.ChronoUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.z */
/* compiled from: PG */
public final /* synthetic */ class C117295z implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C117187ab f325596a;

    /* renamed from: b */
    public final /* synthetic */ C60548tz f325597b;

    /* renamed from: c */
    public final /* synthetic */ C42876ab f325598c;

    public /* synthetic */ C117295z(C117187ab abVar, C60548tz tzVar, C42876ab abVar2) {
        this.f325596a = abVar;
        this.f325597b = tzVar;
        this.f325598c = abVar2;
    }

    public final Object apply(Object obj) {
        C117187ab abVar = this.f325596a;
        C60548tz tzVar = this.f325597b;
        C42876ab abVar2 = this.f325598c;
        C60545tw twVar = (C60545tw) obj;
        if (abVar.f325301a.mo79746e(C89972ak.f246573n)) {
            C58833ax a = abVar.f325304d.mo79719a();
            if (a.mo56113h()) {
                int intValue = ((Integer) a.mo56107c()).intValue();
                tzVar.copyOnWrite();
                C60555uf ufVar = (C60555uf) tzVar.instance;
                C60555uf ufVar2 = C60555uf.f164065cO;
                ufVar.f164255j |= 16777216;
                ufVar.f164204cE = intValue;
            } else {
                abVar.f325304d.mo79720b();
            }
        }
        tzVar.copyOnWrite();
        C60555uf ufVar3 = (C60555uf) tzVar.instance;
        C60555uf ufVar4 = C60555uf.f164065cO;
        twVar.getClass();
        ufVar3.f164243cu = twVar;
        ufVar3.f164255j |= 4096;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        C21370a aVar = abVar.f325303c;
        C86124t tVar = abVar.f325301a;
        if (!C91165r.m148938m(tVar)) {
            C118826c cVar = C118826c.f331422a;
        } else {
            C118826c.m197213c(abVar2.mo46039a(new C91149b(Instant.ofEpochMilli(aVar.mo26870b()).truncatedTo(ChronoUnit.DAYS).minus(C91165r.m148934i((int) tVar.mo79743a(C89972ak.f246559ag), tVar))), C60826bg.f164896a));
        }
        C58976aa aaVar = C58975e.f156826a;
        return C118826c.f331422a;
    }
}
