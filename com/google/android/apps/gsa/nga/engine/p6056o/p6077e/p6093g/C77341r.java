package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6093g;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76565ai;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.understanding.teleport.C79326x;
import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import com.google.android.apps.gsa.nga.shared.p6274a.C80053ag;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.search.assistant.verticals.p10050e.p10051a.C132091e;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58338bi;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.util.concurrent.C60856cj;
import com.google.protos.p4883as.p4884a.C63774c;
import com.google.protos.p4883as.p4884a.C63775d;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.g.r */
/* compiled from: PG */
public final /* synthetic */ class C77341r implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C77349z f213297a;

    /* renamed from: b */
    public final /* synthetic */ C76590bg f213298b;

    /* renamed from: c */
    public final /* synthetic */ Locale f213299c;

    /* renamed from: d */
    public final /* synthetic */ C79326x f213300d;

    public /* synthetic */ C77341r(C77349z zVar, C76590bg bgVar, Locale locale, C79326x xVar) {
        this.f213297a = zVar;
        this.f213298b = bgVar;
        this.f213299c = locale;
        this.f213300d = xVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        List<List> biVar;
        int i;
        int i2;
        double d;
        C80053ag agVar;
        C77349z zVar = this.f213297a;
        C76590bg bgVar = this.f213298b;
        Locale locale = this.f213299c;
        C79326x xVar = this.f213300d;
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            return C60856cj.m92900i(optional);
        }
        if (!zVar.f213314c.mo85405j(C90126fx.f251485jh)) {
            Optional g = bgVar.mo72265g(C76565ai.f211802a, "app");
            if (g.isEmpty()) {
                return C60856cj.m92900i(Optional.empty());
            }
            xVar.mo73900a("Getting intent from database");
            return zVar.f213312a.mo72143l(C132091e.m214545a(C77349z.m124120d(bgVar), ((C63775d) g.get()).f172523d));
        }
        C58485gu a = bgVar.mo72259a("app");
        if (a.isEmpty()) {
            return C60856cj.m92900i(Optional.empty());
        }
        xVar.mo73900a("Getting intent from database");
        C58485gu guVar = (C58485gu) Collection.EL.stream(C77349z.m124119c(bgVar)).map(C77344u.f213305a).collect(C58370cn.f155946a);
        int size = guVar.size();
        int i3 = 1;
        for (int i4 = 0; i4 < size; i4++) {
            i3 *= ((List) guVar.get(i4)).size();
        }
        if (i3 * a.size() > 100) {
            xVar.mo73900a("Too many possible annotations");
            return C60856cj.m92900i(Optional.empty());
        }
        C58480gp e = C58485gu.m89837e();
        C58480gp gpVar = new C58480gp(guVar.size());
        Iterator it = guVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                biVar = new C58338bi(gpVar.mo55394f());
                break;
            }
            C58485gu j = C58485gu.m89842j((List) it.next());
            if (j.isEmpty()) {
                biVar = C58485gu.m89845m();
                break;
            }
            gpVar.mo55395g(j);
        }
        for (List<C80047aa> it2 : biVar) {
            C58480gp e2 = C58485gu.m89837e();
            double d2 = 1.0d;
            for (C80047aa aaVar : it2) {
                d2 *= aaVar.f219663g + 0.009999999776482582d;
                if (aaVar.f219657a == 10) {
                    agVar = (C80053ag) aaVar.f219658b;
                } else {
                    agVar = C80053ag.f219675f;
                }
                e2.mo55395g(agVar.f219677a);
            }
            e.mo55395g(new C77308a(d2, e2.mo55394f(), BuildConfig.FLAVOR));
        }
        C58480gp e3 = C58485gu.m89837e();
        C58485gu f = e.mo55394f();
        int i5 = ((C58724pq) f).f156474d;
        int i6 = 0;
        while (i6 < i5) {
            C77348y yVar = (C77348y) f.get(i6);
            int size2 = a.size();
            int i7 = 0;
            while (true) {
                i = i6 + 1;
                if (i7 >= size2) {
                    break;
                }
                C63775d dVar = (C63775d) a.get(i7);
                String str = dVar.f172523d;
                if (str.isEmpty()) {
                    i2 = i7;
                } else {
                    if ((dVar.f172520a & 8) != 0) {
                        d = (double) dVar.f172524e;
                        i2 = i7;
                    } else {
                        if (dVar.f172525f.size() <= 0) {
                            i2 = i7;
                        } else if ((((C63774c) dVar.f172525f.get(0)).f172515a & 1) != 0) {
                            i2 = i7;
                            d = (double) ((C63774c) dVar.f172525f.get(0)).f172516b;
                        } else {
                            i2 = i7;
                        }
                        d = 0.009999999776482582d;
                    }
                    e3.mo55395g(new C77308a(yVar.mo72515a() * d, yVar.mo72516b(), str));
                }
                i7 = i2 + 1;
            }
            i6 = i;
        }
        return zVar.f213312a.mo72132a((C58485gu) Collection.EL.stream(C58485gu.m89836F(Comparator.EL.reversed(Comparator.CC.comparingDouble(C77343t.f213304a)), e3.mo55394f())).map(C77345v.f213306a).collect(C58370cn.f155946a), locale);
    }
}
