package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6093g;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.nga.engine.ag.af;
import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76541a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76564ah;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76593e;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.android.apps.gsa.nga.engine.understanding.teleport.C79326x;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80403p;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80378h;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80379i;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4883as.p4884a.C63774c;
import com.google.protos.p4883as.p4884a.C63775d;
import com.google.protos.p4985f.p5047y.C65381b;
import java.util.Iterator;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.g.ai */
/* compiled from: PG */
public final class C77317ai implements C76591c {

    /* renamed from: a */
    public static final /* synthetic */ int f213235a = 0;

    /* renamed from: b */
    private static final C58974d f213236b = C58974d.m91136j();

    /* renamed from: c */
    private static final C58528ij f213237c = new C58759qy("com.google.android.apps.accessibility.voiceaccess");

    /* renamed from: d */
    private static final C58528ij f213238d = C58528ij.m90012L("/m/085n4", "/m/086nh", "/m/03gd5");

    /* renamed from: e */
    private final af f213239e;

    /* renamed from: f */
    private final C91142g f213240f;

    public C77317ai(af afVar, C91142g gVar) {
        this.f213239e = afVar;
        this.f213240f = gVar;
    }

    /* renamed from: d */
    public static boolean m124085d(C63775d dVar, C76590bg bgVar) {
        if (dVar.f172525f.isEmpty()) {
            return true;
        }
        return Collection.EL.stream(dVar.f172525f).anyMatch(new C77316ah(bgVar));
    }

    /* renamed from: e */
    public static final Optional m124086e(C80399l lVar, C76590bg bgVar, C74965n nVar, C79326x xVar) {
        Optional findFirst = Collection.EL.stream(bgVar.mo72275r()).filter(C77314af.f213232a).filter(new C77315ag(bgVar)).findFirst();
        if (!findFirst.isPresent()) {
            xVar.mo73900a("No valid url found");
            return Optional.empty();
        }
        xVar.mo73900a(String.format("Opening fallback url (%s)", new Object[]{((C63775d) findFirst.get()).f172526g}));
        Intent addFlags = new Intent("android.intent.action.VIEW", Uri.parse(((C63775d) findFirst.get()).f172526g)).addFlags(32768);
        addFlags.setIdentifier(nVar.mo71336k().f227136c);
        C81442m.m129557s(lVar, t.u(addFlags, 1, nVar.mo71336k(), false, false));
        lVar.mo74319k(30681);
        return Optional.m71637of(C60856cj.m92900i((C80401n) lVar.build()));
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        C80378h hVar = (C80378h) C80379i.f220555h.createBuilder();
        hVar.copyOnWrite();
        ((C80379i) hVar.instance).f220558b = false;
        h.mo72245d((C80379i) hVar.build());
        h.mo72277g("Open_app", C90126fx.f251254fO);
        h.mo72277g("OpenApp__2", C90126fx.f251254fO);
        h.mo72246e(Optional.m71637of(C82831ca.OPEN_APP));
        h.mo72244c(C58485gu.m89847o("Open_app", "OpenApp__2"));
        ((C76541a) h).f211766c = 10803;
        return h.mo72276f();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        Optional optional;
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        lVar.copyOnWrite();
        ((C80401n) lVar.instance).f220664g = C80403p.m128150a(5);
        if (!this.f213240f.mo85405j(C90126fx.f251763ou)) {
            lVar.copyOnWrite();
            ((C80401n) lVar.instance).f220663f = true;
        }
        C79326x a = new C79326x(Optional.m71637of(f213236b)).mo73900a("\nOpenAppFulfiller");
        a.mo73900a("Input FunctionCall").mo73900a(bgVar.f211837a.f166811b);
        Optional g = bgVar.mo72265g(C76564ah.f211801a, "app_phrase");
        if (!g.isPresent() || !f213238d.contains(g.get())) {
            optional = mo72521c(lVar, bgVar, nVar, a).mo43489or(new C77313ae(lVar, bgVar, nVar, a));
        } else {
            optional = m124086e(lVar, bgVar, nVar, a).mo43489or(new C77312ad(this, lVar, bgVar, nVar, a));
        }
        if (optional.isPresent()) {
            return (C60870cx) optional.get();
        }
        return C81442m.f222851a;
    }

    /* renamed from: c */
    public final Optional mo72521c(C80399l lVar, C76590bg bgVar, C74965n nVar, C79326x xVar) {
        int i;
        C58485gu guVar = (C58485gu) Collection.EL.stream(bgVar.mo72275r()).filter(C77309aa.f213220a).filter(new C77310ab(bgVar)).collect(C58370cn.f155946a);
        int size = guVar.size();
        int i2 = 0;
        while (i2 < size) {
            C63775d dVar = (C63775d) guVar.get(i2);
            Optional map = this.f213239e.g(dVar.f172523d).map(C77311ac.f213222a);
            i2++;
            if (map.isPresent()) {
                xVar.mo73900a(String.format("App(%s) is installed", new Object[]{dVar.f172523d}));
                xVar.mo73900a(String.format("Android Intent: %s", new Object[]{map.get()}));
                if (((C58759qy) f213237c).f156534a.equals(dVar.f172523d)) {
                    lVar.copyOnWrite();
                    C80401n nVar2 = C80401n.f220656k;
                    ((C80401n) lVar.instance).f220664g = C80403p.m128150a(6);
                    i = 2;
                } else {
                    i = 1;
                }
                C81442m.m129557s(lVar, t.u((Intent) map.get(), i, nVar.mo71336k(), false, false));
                lVar.mo74319k(30680);
                Iterator it = dVar.f172525f.iterator();
                int i3 = 0;
                while (true) {
                    if (it.hasNext()) {
                        C63774c cVar = (C63774c) it.next();
                        if ((cVar.f172515a & 16) != 0) {
                            C65381b bVar = cVar.f172517c;
                            if (bVar == null) {
                                bVar = C65381b.f177785d;
                            }
                            int i4 = bVar.f177789c;
                            char c = i4 != 0 ? i4 != 1 ? i4 != 2 ? (char) 0 : 4 : 3 : 2;
                            if (c == 0 || c != 3) {
                                break;
                            }
                            i3++;
                        }
                    } else if (i3 > 0) {
                        lVar.mo74319k(135948);
                    }
                }
                return Optional.m71637of(C60856cj.m92900i((C80401n) lVar.build()));
            }
        }
        return Optional.empty();
    }
}
