package com.google.android.apps.gsa.nga.engine.p6056o.p6059c;

import com.google.android.apps.gsa.nga.engine.am.v;
import com.google.android.apps.gsa.nga.engine.am.z.a;
import com.google.android.apps.gsa.nga.engine.p5913am.p5943x.C74976a;
import com.google.android.apps.gsa.nga.engine.understanding.C79330v;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58486gv;
import com.google.common.p4522b.C58512hu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4535g.C59203do;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.knowledge.p4661a.p4662a.C61758t;
import com.google.protobuf.C62917ay;
import com.google.protos.p4850an.p4855d.p4857b.C63490p;
import com.google.protos.p4850an.p4865e.C63590d;
import com.google.protos.p4850an.p4865e.C63593g;
import com.google.protos.p4850an.p4865e.C63594h;
import java.util.Locale;
import p3186j$.util.Collection;
import p3186j$.util.DesugarArrays;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.c.bg */
/* compiled from: PG */
public final class C76590bg {

    /* renamed from: c */
    private static final C58974d f211836c = C58974d.m91136j();

    /* renamed from: a */
    public final C61752n f211837a;

    /* renamed from: b */
    public final C79330v f211838b;

    /* renamed from: d */
    private final C58512hu f211839d;

    public C76590bg(C61752n nVar) {
        this.f211837a = nVar;
        this.f211838b = C79330v.m127277b(nVar.f166811b);
        C58486gv gvVar = new C58486gv();
        for (C61746h hVar : nVar.f166812c) {
            gvVar.mo55419c(hVar.f166796d, hVar);
        }
        this.f211839d = gvVar.mo55417a();
    }

    /* renamed from: o */
    public static Optional m123211o(C61746h hVar) {
        C61758t tVar;
        C61748j jVar = hVar.f166797e;
        if (jVar == null) {
            jVar = C61748j.f166800d;
        }
        if (jVar.f166802a == 3) {
            tVar = (C61758t) jVar.f166803b;
        } else {
            tVar = C61758t.f166824c;
        }
        if (tVar.f166826a == 1) {
            return Optional.m71637of((String) tVar.f166827b);
        }
        return Optional.empty();
    }

    /* renamed from: a */
    public final C58485gu mo72259a(String... strArr) {
        return (C58485gu) mo72273p(0, strArr).filter(C76606r.f211853a).map(C76559ac.f211796a).map(C76570an.f211807a).flatMap(C76580ax.f211820a).collect(C58370cn.f155946a);
    }

    /* renamed from: b */
    public final C58485gu mo72260b(String... strArr) {
        return (C58485gu) mo72273p(0, strArr).filter(C76613y.f211860a).map(C76614z.f211861a).map(C76557aa.f211794a).collect(C58370cn.f155946a);
    }

    /* renamed from: c */
    public final C58485gu mo72261c(String str, C62917ay ayVar) {
        return (C58485gu) Collection.EL.stream(this.f211839d.mo55423a(str)).map(C76602n.f211849a).filter(new C76603o(ayVar)).map(new C76604p(ayVar)).collect(C58370cn.f155946a);
    }

    /* renamed from: d */
    public final C58485gu mo72262d(String... strArr) {
        return (C58485gu) mo72273p(0, strArr).filter(C76578av.f211818a).map(C76579aw.f211819a).map(C76581ay.f211821a).collect(C58370cn.f155946a);
    }

    /* renamed from: e */
    public final C58485gu mo72263e(String... strArr) {
        return (C58485gu) Collection.EL.stream((C58485gu) mo72274q(strArr).map(C76600l.f211847a).map(C76601m.f211848a).flatMap(C76580ax.f211820a).collect(C58370cn.f155946a)).map(C76595g.f211842a).collect(C58370cn.f155946a);
    }

    /* renamed from: f */
    public final Optional mo72264f(String... strArr) {
        return mo72274q(strArr).map(C76600l.f211847a).map(C76601m.f211848a).flatMap(C76580ax.f211820a).findAny();
    }

    /* renamed from: g */
    public final Optional mo72265g(Function function, String... strArr) {
        return (Optional) DesugarArrays.stream((T[]) strArr).map(new C76576at(this, function)).filter(C76561ae.f211798a).findAny().orElse(Optional.empty());
    }

    /* renamed from: h */
    public final Optional mo72266h(String str) {
        return Collection.EL.stream(this.f211839d.mo55423a(str)).findAny();
    }

    /* renamed from: i */
    public final Optional mo72267i(String... strArr) {
        return mo72264f(strArr).map(C76595g.f211842a);
    }

    /* renamed from: j */
    public final Optional mo72268j(String str) {
        Optional g = mo72265g(C76564ah.f211801a, str);
        if (g.isEmpty()) {
            ((C58970a) ((C58970a) f211836c.mo56225c()).mo56372aa(3611)).mo56389s("no arg %s found in query", str);
            return Optional.empty();
        }
        String upperCase = ((String) g.get()).toUpperCase(Locale.US);
        Optional a = v.a(C63490p.class, upperCase);
        if (a.isEmpty()) {
            ((C58970a) ((C58970a) f211836c.mo56225c()).mo56372aa(3610)).mo56389s("No DeviceSetting found with name %s", upperCase);
        }
        return a;
    }

    /* renamed from: k */
    public final Optional mo72269k(String str) {
        C61758t tVar;
        Optional optional;
        C63594h hVar;
        int a;
        Optional h = mo72266h(str);
        if (h.isEmpty()) {
            ((C58970a) ((C58970a) f211836c.mo56225c()).mo56372aa(3613)).mo56389s("No DeviceSettingValue argument found with name %s", str);
            return Optional.empty();
        }
        C61748j jVar = ((C61746h) h.get()).f166797e;
        if (jVar == null) {
            jVar = C61748j.f166800d;
        }
        if (jVar.f166802a == 3) {
            tVar = (C61758t) jVar.f166803b;
        } else {
            tVar = C61758t.f166824c;
        }
        if (tVar.f166826a == 3) {
            optional = Optional.m71637of(Double.valueOf(((Double) tVar.f166827b).doubleValue()));
        } else {
            optional = Optional.empty();
        }
        if (optional.isPresent()) {
            return Optional.m71637of(new a(((Double) optional.get()).doubleValue() / 100.0d));
        }
        C61748j jVar2 = ((C61746h) h.get()).f166797e;
        if (jVar2 == null) {
            jVar2 = C61748j.f166800d;
        }
        if (jVar2.f166802a == 6) {
            C63590d dVar = (C63590d) jVar2.f166803b;
            if (dVar.f172005a == 1) {
                hVar = (C63594h) dVar.f172006b;
            } else {
                hVar = C63594h.f172008d;
            }
            try {
                double parseDouble = Double.parseDouble(hVar.f172012c);
                int i = hVar.f172011b;
                int a2 = C63593g.m96257a(i);
                if ((a2 != 0 && a2 == 5) || ((a = C63593g.m96257a(i)) != 0 && a == 3)) {
                    return Optional.m71637of(new a(parseDouble));
                }
                return Optional.m71637of(new a(parseDouble / 10.0d));
            } catch (NumberFormatException unused) {
                ((C58970a) ((C58970a) f211836c.mo56225c()).mo56372aa(3612)).mo56386p("DeviceSetting normalizedValue could not be parsed as a double");
                return Optional.empty();
            }
        } else {
            Optional o = m123211o((C61746h) h.get());
            if (o.isPresent()) {
                if (((String) o.get()).equals("MAXIMUM")) {
                    return Optional.m71637of(new a(1.0d));
                }
                if (((String) o.get()).equals("MINIMUM")) {
                    return Optional.m71637of(new a(C59203do.f157270a));
                }
                if (((String) o.get()).equals("A_LITTLE")) {
                    return Optional.m71637of(C74976a.f209198b);
                }
                if (((String) o.get()).equals("A_LOT")) {
                    return Optional.m71637of(C74976a.f209199c);
                }
            }
            return Optional.empty();
        }
    }

    /* renamed from: l */
    public final Optional mo72270l(String... strArr) {
        return mo72274q(strArr).filter(C76567ak.f211804a).map(C76568al.f211805a).map(C76598j.f211845a).findAny();
    }

    /* renamed from: m */
    public final Optional mo72271m(String... strArr) {
        return mo72265g(C76564ah.f211801a, strArr).map(C76566aj.f211803a);
    }

    /* renamed from: n */
    public final Optional mo72272n(String... strArr) {
        return mo72265g(C76573aq.f211812a, strArr).map(C76558ab.f211795a);
    }

    /* renamed from: p */
    public final Stream mo72273p(int i, String[] strArr) {
        int length = strArr.length - i;
        if (length == 0 || length == 2) {
            return Stream.CC.empty();
        }
        Stream map = Collection.EL.stream(this.f211839d.mo55423a(strArr[i])).map(C76563ag.f211800a);
        if (length > 2) {
            return map.filter(C76585bb.f211831a).map(C76586bc.f211832a).map(C76569am.f211806a).filter(new C76571ao(strArr, i)).flatMap(new C76572ap(i, strArr));
        }
        return map;
    }

    /* renamed from: q */
    public final Stream mo72274q(String... strArr) {
        return DesugarArrays.stream((T[]) strArr).map(new C76560ad(this)).filter(C76561ae.f211798a).map(C76562af.f211799a).map(C76563ag.f211800a);
    }

    /* renamed from: r */
    public final C58485gu mo72275r() {
        return (C58485gu) mo72266h("app").map(C76607s.f211854a).orElse(C58485gu.m89845m());
    }
}
