package com.google.android.apps.gsa.staticplugins.searchwidget;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C89972ak;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7192v.C91165r;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60512sq;
import com.google.common.p4552o.C60523ta;
import com.google.common.p4552o.C60540tr;
import com.google.common.p4552o.C60541ts;
import com.google.common.p4552o.C60544tv;
import com.google.common.p4552o.C60545tw;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p4816ai.p4818b.C63196b;
import java.util.Map;
import p3186j$.time.Instant;
import p3186j$.time.temporal.ChronoUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.aa */
/* compiled from: PG */
public final /* synthetic */ class C117186aa implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C117187ab f325300a;

    public /* synthetic */ C117186aa(C117187ab abVar) {
        this.f325300a = abVar;
    }

    public final C60870cx apply(Object obj) {
        C117187ab abVar = this.f325300a;
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 1312;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        C60523ta taVar = (C60523ta) ((C60512sq) obj).build();
        taVar.getClass();
        ufVar2.f164158bL = taVar;
        ufVar2.f164253h |= 16777216;
        C42876ab abVar2 = (C42876ab) abVar.f325302b.mo27525b();
        if (abVar.f325301a.mo79746e(C89972ak.f246570k)) {
            C60870cx g = C60922j.m93044g(C91165r.m148930e(Instant.ofEpochMilli(abVar.f325303c.mo26870b()).truncatedTo(ChronoUnit.DAYS), abVar.f325301a, abVar2), new C117295z(abVar, tzVar, abVar2), C60826bg.f164896a);
            C90476a aVar = C91018d.f254254a;
            return g;
        }
        if (abVar.f325301a.mo79746e(C89972ak.f246580u)) {
            Map l = C91165r.m148937l(abVar.f325301a, abVar2);
            C60540tr trVar = (C60540tr) C60545tw.f164030b.createBuilder();
            for (Map.Entry entry : l.entrySet()) {
                C60541ts tsVar = (C60541ts) C60544tv.f164021h.createBuilder();
                int intValue = ((Integer) entry.getKey()).intValue();
                tsVar.copyOnWrite();
                C60544tv tvVar = (C60544tv) tsVar.instance;
                tvVar.f164023a |= 1;
                tvVar.f164024b = intValue;
                long longValue = ((Long) entry.getValue()).longValue();
                tsVar.copyOnWrite();
                C60544tv tvVar2 = (C60544tv) tsVar.instance;
                tvVar2.f164023a |= 2;
                tvVar2.f164025c = longValue;
                C60544tv tvVar3 = (C60544tv) tsVar.build();
                trVar.copyOnWrite();
                C60545tw twVar = (C60545tw) trVar.instance;
                tvVar3.getClass();
                twVar.mo57109a();
                twVar.f164032a.add(tvVar3);
            }
            C60545tw twVar2 = (C60545tw) trVar.build();
            tzVar.copyOnWrite();
            C60555uf ufVar3 = (C60555uf) tzVar.instance;
            twVar2.getClass();
            ufVar3.f164243cu = twVar2;
            ufVar3.f164255j |= 4096;
            C58976aa aaVar = C58975e.f156826a;
        }
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        return C118826c.f331423b;
    }
}
