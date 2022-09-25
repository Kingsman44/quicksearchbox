package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.util.Pair;
import com.google.android.apps.gsa.opaonboarding.C83870ad;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.ce */
/* compiled from: PG */
public final class C108605ce extends C83870ad {

    /* renamed from: a */
    int f302107a = 1;

    /* renamed from: b */
    private final C108606cf f302108b;

    /* renamed from: c */
    private final C108556ar f302109c;

    /* renamed from: d */
    private final C69464a f302110d;

    /* renamed from: e */
    private final C69464a f302111e;

    /* renamed from: f */
    private final C69464a f302112f;

    /* renamed from: g */
    private final C69464a f302113g;

    /* renamed from: h */
    private final C69464a f302114h;

    /* renamed from: i */
    private final C69464a f302115i;

    /* renamed from: j */
    private final C69464a f302116j;

    /* renamed from: k */
    private final C69464a f302117k;

    /* renamed from: l */
    private final C69464a f302118l;

    /* renamed from: m */
    private final C69464a f302119m;

    /* renamed from: n */
    private final C69464a f302120n;

    /* renamed from: o */
    private final C69464a f302121o;

    public C108605ce(C108606cf cfVar, C108556ar arVar, C69464a aVar, C69464a aVar2, C69464a aVar3, C69464a aVar4, C69464a aVar5, C69464a aVar6, C69464a aVar7, C69464a aVar8, C69464a aVar9, C69464a aVar10, C69464a aVar11, C69464a aVar12) {
        this.f302108b = cfVar;
        this.f302109c = arVar;
        this.f302110d = aVar;
        this.f302111e = aVar2;
        this.f302112f = aVar3;
        this.f302113g = aVar4;
        this.f302114h = aVar5;
        this.f302115i = aVar6;
        this.f302116j = aVar7;
        this.f302117k = aVar8;
        this.f302118l = aVar9;
        this.f302119m = aVar10;
        this.f302121o = aVar11;
        this.f302120n = aVar12;
    }

    /* renamed from: d */
    public final C58833ax mo77210d() {
        int i = this.f302107a;
        int i2 = i - 1;
        if (i != 0) {
            switch (i2) {
                case 0:
                    this.f302107a = 2;
                    return C58833ax.m90834k((C83956t) this.f302110d.mo17428b());
                case 1:
                    this.f302107a = 3;
                    return C58833ax.m90834k((C83956t) this.f302111e.mo17428b());
                case 2:
                    this.f302107a = 4;
                    return C58833ax.m90834k((C83956t) this.f302112f.mo17428b());
                case 3:
                    this.f302107a = 5;
                    return C58833ax.m90834k((C83956t) this.f302113g.mo17428b());
                case 4:
                    this.f302107a = 8;
                    return C58833ax.m90834k((C83956t) this.f302115i.mo17428b());
                case 5:
                    this.f302107a = 7;
                    return C58833ax.m90834k((C83956t) this.f302121o.mo17428b());
                case 6:
                    this.f302107a = 11;
                    return C58833ax.m90834k((C83956t) this.f302118l.mo17428b());
                case 7:
                    this.f302107a = 9;
                    return C58833ax.m90834k((C83956t) this.f302116j.mo17428b());
                case 8:
                    this.f302107a = 10;
                    return C58833ax.m90834k((C83956t) this.f302117k.mo17428b());
                case 9:
                    this.f302107a = 6;
                    return C58833ax.m90834k((C83956t) this.f302114h.mo17428b());
                case 10:
                    this.f302107a = 12;
                    return C58833ax.m90834k((C83956t) this.f302119m.mo17428b());
                case 11:
                    this.f302107a = 13;
                    return C58833ax.m90834k((C83956t) this.f302120n.mo17428b());
                case 12:
                    if (!this.f302108b.f302122a) {
                        return C58836b.f156633a;
                    }
                    this.f302107a = 2;
                    C108556ar arVar = this.f302109c;
                    C108741i iVar = arVar.f302004l;
                    if (iVar != null && !C58837ba.m90859h(iVar.mo97110n()) && !C58837ba.m90859h(iVar.mo97104g())) {
                        arVar.f301995c.add(Pair.create(iVar.mo97110n(), iVar.mo97104g()));
                    }
                    return C58833ax.m90834k((C83956t) this.f302110d.mo17428b());
                default:
                    throw new IllegalArgumentException("Unknown State.");
            }
        } else {
            throw null;
        }
    }
}
