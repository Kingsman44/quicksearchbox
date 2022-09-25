package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.assistant.p3897e.p3921j.p3926e.C51965fr;
import com.google.assistant.p3897e.p3921j.p3926e.C52003hb;
import com.google.assistant.p4008y.p4015e.C53670f;
import com.google.assistant.p4008y.p4015e.C53672h;
import com.google.assistant.p4008y.p4015e.C53674j;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C62974ct;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.nu */
/* compiled from: PG */
public final /* synthetic */ class C109747nu implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C109759oe f305754a;

    /* renamed from: b */
    public final /* synthetic */ C109040fj f305755b;

    /* renamed from: c */
    public final /* synthetic */ C109258hw f305756c;

    /* renamed from: d */
    public final /* synthetic */ C107698i f305757d;

    /* renamed from: e */
    public final /* synthetic */ int f305758e;

    public /* synthetic */ C109747nu(C109759oe oeVar, C109040fj fjVar, C109258hw hwVar, int i, C107698i iVar) {
        this.f305754a = oeVar;
        this.f305755b = fjVar;
        this.f305756c = hwVar;
        this.f305758e = i;
        this.f305757d = iVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C58833ax axVar;
        C109759oe oeVar = this.f305754a;
        C109040fj fjVar = this.f305755b;
        C109258hw hwVar = this.f305756c;
        int i = this.f305758e;
        C107698i iVar = this.f305757d;
        C58833ax axVar2 = (C58833ax) obj;
        if (axVar2.mo56113h()) {
            C53670f fVar = (C53670f) axVar2.mo56107c();
            if (fVar.f140876b.isEmpty()) {
                axVar = C58836b.f156633a;
            } else {
                int a = oeVar.f305816h.mo100728a();
                if (a >= fVar.f140876b.size()) {
                    a = 0;
                }
                C53674j jVar = (C53674j) fVar.f140876b.get(a);
                if (jVar.f140886a.isEmpty()) {
                    axVar = C58836b.f156633a;
                } else {
                    axVar = C58833ax.m90834k(jVar.f140886a);
                }
            }
            if (axVar.mo56113h()) {
                oeVar.f305817i.mo98053a(true);
                boolean z = false;
                for (C53672h hVar : (List) axVar.mo56107c()) {
                    int i2 = hVar.f140881b;
                    if (i2 == 1) {
                        hwVar.mo97723m((C52003hb) hVar.f140882c, C58836b.f156633a);
                    } else if (i2 == 2) {
                        try {
                            hwVar.mo97726s((C51965fr) hVar.f140882c, C58836b.f156633a, 73093);
                            if ((hVar.f140880a & 4) != 0) {
                                int i3 = hVar.f140883d;
                                C28292j jVar2 = new C28292j(27415);
                                C28292j jVar3 = new C28292j(i3);
                                jVar3.mo33794h(1);
                                C89949q.m146521e(C28285c.m52875b(C28293k.m52908e(jVar2, C28293k.m52908e(jVar3, new C28293k[0])), 73093), false);
                            }
                        } catch (C90452a | C62974ct e) {
                            ((C59052c) ((C59052c) ((C59052c) C109759oe.f305809a.mo56225c()).mo56382g(e)).mo56372aa(23017)).mo56386p("Argument not found");
                        }
                    } else {
                        ((C59052c) ((C59052c) C109759oe.f305809a.mo56225c()).mo56372aa(23016)).mo56386p("Missing a supported value for the ClientOpArgs provided.");
                    }
                    z = true;
                }
                if (z) {
                    fjVar.mo97503bM();
                    oeVar.f305810b.mo95369K(false, 0, C58836b.f156633a);
                    oeVar.f305816h.mo100730c();
                }
                return C60856cj.m92900i(true);
            }
        }
        return oeVar.mo98102i(fjVar, i, iVar);
    }
}
