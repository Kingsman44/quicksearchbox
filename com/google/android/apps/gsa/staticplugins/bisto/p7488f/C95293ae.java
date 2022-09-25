package com.google.android.apps.gsa.staticplugins.bisto.p7488f;

import android.content.Context;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89496ch;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7518t.p7519a.C95873a;
import com.google.android.apps.gsa.staticplugins.bisto.p7533x.C96625a;
import com.google.android.apps.gsa.staticplugins.bisto.p7533x.C96628d;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60238ll;
import com.google.common.p4552o.C60239lm;
import com.google.common.p4552o.C60298nk;
import com.google.common.p4552o.C60300nm;
import com.google.common.p4552o.C60306ns;
import com.google.common.p4552o.C60307nt;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60922j;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.f.ae */
/* compiled from: PG */
public final class C95293ae {

    /* renamed from: a */
    public static final C59071e f266614a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.f.ae");

    /* renamed from: b */
    static final C58528ij f266615b = C58528ij.m90015O(1, 3, 7, 8, 12, 15, 16, 19, 21, 22, 23, 26);

    /* renamed from: g */
    private static final C95319y f266616g = C95312r.f266692a;

    /* renamed from: h */
    private static final long f266617h = TimeUnit.HOURS.toMillis(1);

    /* renamed from: i */
    private static final long f266618i = TimeUnit.DAYS.toMillis(1);

    /* renamed from: j */
    private static final long f266619j = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: k */
    private static final long f266620k = TimeUnit.MINUTES.toMillis(15);

    /* renamed from: c */
    public final C58495hd f266621c;

    /* renamed from: d */
    public final C96628d f266622d;

    /* renamed from: e */
    public final C21370a f266623e;

    /* renamed from: f */
    public volatile C95296b f266624f;

    /* renamed from: l */
    private final C95307m f266625l;

    public C95293ae(C89496ch chVar, C95355bf bfVar, Executor executor, C96628d dVar, C21370a aVar, C95307m mVar) {
        Executor executor2 = executor;
        this.f266622d = dVar;
        this.f266623e = aVar;
        this.f266625l = mVar;
        C58490gz gzVar = new C58490gz(4);
        long j = f266617h;
        long j2 = f266619j;
        gzVar.mo55429h(1, new C95318x(this, 1, m157513m(4, j, j2, 0, dVar, aVar), new C95289aa(2), new C95289aa(2)));
        gzVar.mo55429h(3, new C95318x(this, 3, m157513m(3, j, j2, 0, dVar, aVar), new C95289aa(5)));
        C95319y yVar = f266616g;
        gzVar.mo55429h(4, new C95318x(this, 4, yVar, new C95289aa(2), new C95289aa(2), new C95289aa(2)));
        gzVar.mo55429h(5, new C95318x(this, 5, yVar, new C95289aa(2), new C95289aa(2), new C95289aa(2)));
        gzVar.mo55429h(6, new C95318x(this, 6, yVar, new C95289aa(2), new C95289aa(2), new C95289aa(2)));
        gzVar.mo55429h(7, new C95318x(this, 7, m157514n(dVar, aVar), new C95289aa(3)));
        long j3 = f266618i;
        gzVar.mo55429h(8, new C95318x(this, 8, m157513m(4, j, j3, j3, dVar, aVar), new C95289aa(1), new C95289aa(1)));
        gzVar.mo55429h(9, new C95318x(this, 9, m157514n(dVar, aVar), new C95289aa(1)));
        gzVar.mo55429h(10, new C95318x(this, 10, m157514n(dVar, aVar), new C95289aa(1)));
        gzVar.mo55429h(11, new C95318x(this, 11, m157514n(dVar, aVar), new C95289aa(1)));
        C95319y yVar2 = yVar;
        gzVar.mo55429h(12, new C95318x(this, 12, yVar2, new C95290ab()));
        gzVar.mo55429h(13, new C95318x(this, 13, yVar2, new C95290ab()));
        gzVar.mo55429h(14, new C95318x(this, 14, yVar2, new C95289aa(2), new C95290ab()));
        gzVar.mo55429h(15, new C95318x(this, 15, yVar2, new C95290ab()));
        gzVar.mo55429h(16, new C95318x(this, 16, yVar2, new C95290ab()));
        gzVar.mo55429h(19, new C95318x(this, 19, yVar2, new C95289aa(6), new C95290ab()));
        gzVar.mo55429h(21, new C95318x(this, 21, yVar2, new C95290ab()));
        gzVar.mo55429h(22, new C95318x(this, 22, yVar2, new C95290ab()));
        gzVar.mo55429h(23, new C95318x(this, 23, yVar2, new C95289aa(5), new C95290ab()));
        gzVar.mo55429h(24, new C95318x(this, 24, yVar2, new C95290ab()));
        gzVar.mo55429h(25, new C95318x(this, 25, yVar2, new C95290ab()));
        gzVar.mo55429h(26, new C95318x(this, 26, yVar2, new C95290ab()));
        this.f266621c = gzVar.mo55427f(false);
        C60856cj.m92911t(C60922j.m93044g(C60838bs.m92859i(chVar.mo83409o(bfVar.mo89270k())), C95313s.f266693a, executor2), new C95314t(this), executor2);
    }

    /* renamed from: a */
    public static int m157509a(int i) {
        if (i == 11 || i == 10) {
            return 9;
        }
        return i;
    }

    /* renamed from: b */
    public static int m157510b(int i, C96628d dVar) {
        return dVar.mo90296i("interaction-count-" + m157509a(i));
    }

    /* renamed from: d */
    public static long m157511d(C96628d dVar, C21370a aVar) {
        long a = dVar.mo90289a("TaperingHelper", "initial-usage", -1);
        if (a >= 0) {
            return a;
        }
        long b = aVar.mo26870b();
        dVar.mo90291d("TaperingHelper", "initial-usage", b);
        return b;
    }

    /* renamed from: h */
    public static Long m157512h(int i, C96628d dVar) {
        long a = dVar.mo90289a("TaperingHelper", "timestamp-" + m157509a(i), -1);
        if (a >= 0) {
            return Long.valueOf(a);
        }
        return null;
    }

    /* renamed from: m */
    private static C95319y m157513m(int i, long j, long j2, long j3, C96628d dVar, C21370a aVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C95315u(i));
        arrayList.add(new C95317w(j2, aVar));
        arrayList.add(new C95316v(j, aVar));
        if (j3 > 0 && dVar != null) {
            arrayList.add(new C95292ad(j3, dVar, aVar));
        }
        return new C95320z(arrayList);
    }

    /* renamed from: n */
    private static C95319y m157514n(C96628d dVar, C21370a aVar) {
        return m157513m(4, f266617h, f266618i, 0, dVar, aVar);
    }

    /* renamed from: o */
    private static int m157515o(int i) {
        switch (i) {
            case 1:
                return 3;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 14;
            case 9:
                return 11;
            case 10:
                return 12;
            case 11:
                return 13;
            case 12:
                return 15;
            default:
                return 1;
        }
    }

    /* renamed from: c */
    public final int mo89212c(int i) {
        C96628d dVar = this.f266622d;
        if (dVar == null) {
            return 0;
        }
        return dVar.mo90296i("count-" + m157509a(i));
    }

    /* renamed from: e */
    public final C60239lm mo89213e(int i, String str) {
        C60238ll llVar = (C60238ll) C60239lm.f162973e.createBuilder();
        llVar.copyOnWrite();
        C60239lm lmVar = (C60239lm) llVar.instance;
        str.getClass();
        lmVar.f162975a |= 8;
        lmVar.f162978d = str;
        int c = mo89212c(i);
        llVar.copyOnWrite();
        C60239lm lmVar2 = (C60239lm) llVar.instance;
        lmVar2.f162975a |= 2;
        lmVar2.f162977c = c;
        llVar.copyOnWrite();
        C60239lm lmVar3 = (C60239lm) llVar.instance;
        lmVar3.f162976b = m157515o(i) - 1;
        lmVar3.f162975a |= 1;
        return (C60239lm) llVar.build();
    }

    /* renamed from: f */
    public final Integer mo89214f(int i) {
        C58976aa aaVar = C58975e.f156826a;
        C95318x xVar = (C95318x) this.f266621c.get(Integer.valueOf(i));
        if (xVar == null) {
            C59104x d = f266614a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "EduPromptHelper");
            ((C59052c) ((C59052c) d).mo56372aa(14887)).mo56386p("No prompt");
            int i2 = C90755l.f253831a;
            return 1;
        }
        int i3 = C95873a.f268446a;
        return xVar.mo89250b();
    }

    /* renamed from: g */
    public final Integer mo89215g(int i) {
        C58976aa aaVar = C58975e.f156826a;
        C58528ij ijVar = f266615b;
        Integer valueOf = Integer.valueOf(i);
        if (ijVar.contains(valueOf)) {
            C59104x d = f266614a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "EduPromptHelper");
            ((C59052c) ((C59052c) d).mo56372aa(14891)).mo56386p("Requested res ID for customizable prompt");
            int i2 = C90755l.f253831a;
        }
        C95318x xVar = (C95318x) this.f266621c.get(valueOf);
        if (xVar == null) {
            C59104x d2 = f266614a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "EduPromptHelper");
            ((C59052c) ((C59052c) d2).mo56372aa(14890)).mo56386p("No prompt");
            int i3 = C90755l.f253831a;
            return null;
        }
        int i4 = C95873a.f268446a;
        Integer b = xVar.mo89250b();
        if (b == null || xVar.f266703d.f266624f == null) {
            return null;
        }
        return xVar.f266703d.f266624f.mo89223a(xVar.f266700a, b.intValue());
    }

    /* renamed from: i */
    public final String mo89216i(Context context, int i) {
        C58976aa aaVar = C58975e.f156826a;
        C95318x xVar = (C95318x) this.f266621c.get(Integer.valueOf(i));
        if (xVar == null) {
            C59104x d = f266614a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "EduPromptHelper");
            ((C59052c) ((C59052c) d).mo56372aa(14893)).mo56386p("No prompt");
            int i2 = C90755l.f253831a;
            return null;
        }
        int i3 = C95873a.f268446a;
        Integer b = xVar.mo89250b();
        if (b == null || xVar.f266703d.f266624f == null) {
            return null;
        }
        return xVar.f266703d.f266624f.mo89224b(context, xVar.f266700a, b.intValue());
    }

    /* renamed from: j */
    public final String mo89217j(Context context, int i, int i2) {
        C95318x xVar = (C95318x) this.f266621c.get(Integer.valueOf(i));
        if (xVar == null) {
            C59104x d = f266614a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "EduPromptHelper");
            ((C59052c) ((C59052c) d).mo56372aa(14894)).mo56386p("No prompt");
            int i3 = C90755l.f253831a;
            return null;
        } else if (i2 <= 0 || i2 > xVar.f266702c.length || xVar.f266703d.f266624f == null) {
            return null;
        } else {
            return xVar.f266703d.f266624f.mo89224b(context, xVar.f266700a, i2);
        }
    }

    /* renamed from: k */
    public final void mo89218k(int i) {
        C96628d dVar = this.f266622d;
        if (dVar != null) {
            int a = m157509a(i);
            Long h = m157512h(a, dVar);
            C96625a b = this.f266622d.mo90290b();
            int b2 = m157510b(a, this.f266622d);
            C58976aa aaVar = C58975e.f156826a;
            b.mo90285b("interaction-count-" + a, b2 + 1);
            b.mo90286c("TaperingHelper", "interaction-timestamp-" + a, this.f266623e.mo26870b());
            b.mo90284a();
            if (h != null) {
                long b3 = this.f266623e.mo26870b() - h.longValue();
                if (b3 > 0 && b3 < f266620k) {
                    C60306ns nsVar = (C60306ns) C60307nt.f163185d.createBuilder();
                    nsVar.copyOnWrite();
                    C60307nt ntVar = (C60307nt) nsVar.instance;
                    ntVar.f163188b = m157515o(a) - 1;
                    ntVar.f163187a |= 1;
                    nsVar.copyOnWrite();
                    C60307nt ntVar2 = (C60307nt) nsVar.instance;
                    ntVar2.f163187a |= 2;
                    ntVar2.f163189c = (int) b3;
                    C95307m mVar = this.f266625l;
                    C60298nk nkVar = (C60298nk) C60300nm.f163138H.createBuilder();
                    nkVar.copyOnWrite();
                    C60300nm nmVar = (C60300nm) nkVar.instance;
                    C60307nt ntVar3 = (C60307nt) nsVar.build();
                    ntVar3.getClass();
                    nmVar.f163158l = ntVar3;
                    nmVar.f163147a |= C89885b.NOW_VALUE;
                    mVar.mo83545c(nkVar);
                }
            }
        }
    }

    /* renamed from: l */
    public final void mo89219l(int i) {
        int i2 = C95873a.f268446a;
        if (this.f266622d != null) {
            int a = m157509a(i);
            int c = mo89212c(a);
            C58976aa aaVar = C58975e.f156826a;
            C96625a b = this.f266622d.mo90290b();
            b.mo90285b("count-" + a, c + 1);
            b.mo90286c("TaperingHelper", "timestamp-" + a, this.f266623e.mo26870b());
            b.mo90284a();
        }
    }
}
