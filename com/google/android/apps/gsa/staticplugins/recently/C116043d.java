package com.google.android.apps.gsa.staticplugins.recently;

import com.google.android.apps.gsa.search.core.p6807j.C86133b;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.customtabs.C98585aj;
import com.google.android.libraries.gsa.p1875j.C22830a;
import com.google.android.libraries.gsa.p1875j.C22831b;
import com.google.android.libraries.gsa.p1875j.C22832c;
import com.google.android.libraries.gsa.p1875j.C22835f;
import com.google.android.libraries.gsa.p1875j.C22836g;
import com.google.android.libraries.gsa.p1875j.C22845p;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.d */
/* compiled from: PG */
public final /* synthetic */ class C116043d implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C116093h f321785a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f321786b;

    public /* synthetic */ C116043d(C116093h hVar, C60870cx cxVar) {
        this.f321785a = hVar;
        this.f321786b = cxVar;
    }

    public final Object call() {
        C116093h hVar = this.f321785a;
        C22831b bVar = (C22831b) C90877ak.m148475i(this.f321786b, (Object) null);
        boolean z = false;
        if (bVar == null) {
            return new byte[0];
        }
        ArrayList arrayList = new ArrayList();
        if (hVar.mo102479v()) {
            arrayList.addAll(bVar.f62862a);
        }
        if (hVar.mo102479v() && hVar.f321903m.mo80442b()) {
            C86133b a = ((C98585aj) ((C58833ax) hVar.f321902l.mo27525b()).mo56107c()).mo91202a();
            boolean z2 = a.mo79781e() && !a.mo79780c();
            boolean z3 = hVar.f321899i.getBoolean("cct_account_mismatch_removed", false);
            if (z2) {
                if (!z3) {
                    long j = hVar.f321899i.getLong("cct_account_mismatch_timestamp", -1);
                    if (j < 0) {
                        j = System.currentTimeMillis();
                        hVar.f321899i.edit().putLong("cct_account_mismatch_timestamp", j).apply();
                    }
                    if (System.currentTimeMillis() - j > TimeUnit.DAYS.toMillis(hVar.f321898h.mo79743a(C90110fh.f250671ba))) {
                        z = true;
                    }
                    C22832c cVar = (C22832c) C22845p.f62890o.createBuilder();
                    cVar.copyOnWrite();
                    C22845p pVar = (C22845p) cVar.instance;
                    pVar.f62894c = 15;
                    pVar.f62892a |= 2;
                    cVar.copyOnWrite();
                    C22845p pVar2 = (C22845p) cVar.instance;
                    pVar2.f62892a |= 1;
                    pVar2.f62893b = 15;
                    C22835f fVar = (C22835f) C22836g.f62864d.createBuilder();
                    String g = C58837ba.m90858g(hVar.f321897g.mo79659F());
                    fVar.copyOnWrite();
                    C22836g gVar = (C22836g) fVar.instance;
                    gVar.f62866a = 1 | gVar.f62866a;
                    gVar.f62867b = g;
                    fVar.copyOnWrite();
                    C22836g gVar2 = (C22836g) fVar.instance;
                    gVar2.f62866a |= 2;
                    gVar2.f62868c = "Chrome";
                    cVar.copyOnWrite();
                    C22845p pVar3 = (C22845p) cVar.instance;
                    C22836g gVar3 = (C22836g) fVar.build();
                    gVar3.getClass();
                    pVar3.f62904m = gVar3;
                    pVar3.f62892a |= 4096;
                    cVar.copyOnWrite();
                    C22845p pVar4 = (C22845p) cVar.instance;
                    pVar4.f62892a |= 2048;
                    pVar4.f62903l = j;
                    cVar.copyOnWrite();
                    C22845p pVar5 = (C22845p) cVar.instance;
                    pVar5.f62892a |= 4;
                    pVar5.f62895d = j;
                    cVar.copyOnWrite();
                    C22845p pVar6 = (C22845p) cVar.instance;
                    pVar6.f62892a |= 8192;
                    pVar6.f62905n = z;
                    arrayList.add((C22845p) cVar.build());
                }
            } else if (z3) {
                hVar.f321899i.edit().putBoolean("cct_account_mismatch_removed", false).apply();
            }
        }
        Collections.sort(arrayList, C116072e.f321857a);
        C22830a aVar = (C22830a) bVar.toBuilder();
        aVar.copyOnWrite();
        ((C22831b) aVar.instance).f62862a = C22831b.emptyProtobufList();
        aVar.mo28194a(arrayList);
        return ((C22831b) aVar.build()).toByteArray();
    }
}
