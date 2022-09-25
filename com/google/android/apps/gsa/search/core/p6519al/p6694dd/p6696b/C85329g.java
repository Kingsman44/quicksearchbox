package com.google.android.apps.gsa.search.core.p6519al.p6694dd.p6696b;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90125fw;
import com.google.assistant.p3897e.p3921j.C52582xb;
import com.google.common.base.C58833ax;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58724pq;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.search.core.al.dd.b.g */
/* compiled from: PG */
public final class C85329g {

    /* renamed from: a */
    public static final /* synthetic */ int f231101a = 0;

    /* renamed from: b */
    private static final C58485gu f231102b = C58485gu.m89834D(1527462, 6725110, 10229355, 16005536, 6823336, 11492599, 31619, 5164518, 16408895, 15836817, 16497668, 16638611, 2105636, 12435910, 10817038, 15624028, 877869, 6011252, 11558912, 16420926);

    /* renamed from: a */
    public static C58485gu m136793a(C86124t tVar, String str, C58833ax axVar) {
        String str2 = (String) tVar.mo79752r(C90125fw.f250944w).get(str);
        C58485gu m = C58485gu.m89845m();
        if (str2 != null) {
            m = m136794b(str2, false, 0);
        }
        if (!m136798f(tVar, axVar)) {
            return m;
        }
        C58485gu b = m136794b((String) m136797e(tVar).getOrDefault(str, BuildConfig.FLAVOR), true, (int) tVar.mo79743a(C90125fw.f250936o));
        return b.isEmpty() ? m : b;
    }

    /* renamed from: b */
    public static C58485gu m136794b(String str, boolean z, int i) {
        if (str == null || str.length() == 0) {
            return C58485gu.m89845m();
        }
        List i2 = C58869cf.m90936b(new C58903m('@')).mo56155i(str);
        if (i2.isEmpty()) {
            return C58485gu.m89845m();
        }
        C58480gp e = C58485gu.m89837e();
        int size = i % i2.size();
        e.mo55395g(m136796d((String) i2.get(size), 0, z));
        for (int i3 = 0; i3 < i2.size(); i3++) {
            if (i3 != size) {
                e.mo55395g(m136796d((String) i2.get(i3), i3, z));
            }
        }
        return e.mo55394f();
    }

    /* renamed from: c */
    public static Map m136795c(C86124t tVar, C58833ax axVar) {
        Map map = (Map) Collection.EL.stream(tVar.mo79752r(C90125fw.f250944w).entrySet()).collect(Collectors.toMap(C85323a.f231095a, C85324b.f231096a));
        if (!m136798f(tVar, axVar)) {
            return map;
        }
        return (Map) Stream.CC.concat(Collection.EL.stream(map.entrySet()), Collection.EL.stream(((Map) Collection.EL.stream(m136797e(tVar).entrySet()).filter(C85325c.f231097a).collect(Collectors.toMap(C85323a.f231095a, new C85326d(tVar)))).entrySet())).collect(Collectors.toMap(C85323a.f231095a, C85327e.f231099a, C85328f.f231100a));
    }

    /* renamed from: d */
    private static C85333k m136796d(String str, int i, boolean z) {
        List i2 = C58869cf.m90936b(new C58903m('&')).mo56155i(str);
        C85332j jVar = (C85332j) C85333k.f231104g.createBuilder();
        if (!i2.isEmpty()) {
            String str2 = (String) i2.get(0);
            jVar.copyOnWrite();
            C85333k kVar = (C85333k) jVar.instance;
            str2.getClass();
            kVar.f231106a |= 1;
            kVar.f231107b = str2;
        }
        if (i2.size() > 1) {
            String str3 = (String) i2.get(1);
            jVar.copyOnWrite();
            C85333k kVar2 = (C85333k) jVar.instance;
            str3.getClass();
            kVar2.f231106a |= 4;
            kVar2.f231109d = str3;
        }
        if (i2.size() > 2) {
            List i3 = C58869cf.m90936b(new C58903m('|')).mo56155i((CharSequence) i2.get(2));
            jVar.copyOnWrite();
            C85333k kVar3 = (C85333k) jVar.instance;
            C62971cq cqVar = kVar3.f231110e;
            if (!cqVar.mo58948c()) {
                kVar3.f231110e = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) i3, (List) kVar3.f231110e);
        }
        if (z) {
            jVar.copyOnWrite();
            C85333k kVar4 = (C85333k) jVar.instance;
            kVar4.f231106a |= 2;
            kVar4.f231108c = -16777216;
            jVar.copyOnWrite();
            C85333k kVar5 = (C85333k) jVar.instance;
            kVar5.f231106a |= 8;
            kVar5.f231111f = true;
            return (C85333k) jVar.build();
        }
        C58485gu guVar = f231102b;
        int intValue = ((Integer) guVar.get(i % ((C58724pq) guVar).f156474d)).intValue();
        jVar.copyOnWrite();
        C85333k kVar6 = (C85333k) jVar.instance;
        kVar6.f231106a |= 2;
        kVar6.f231108c = -16777216 | intValue;
        return (C85333k) jVar.build();
    }

    /* renamed from: e */
    private static C58495hd m136797e(C86124t tVar) {
        return C58495hd.m89904r("en", tVar.mo79758x(C90125fw.f250933l), "iw", tVar.mo79758x(C90125fw.f250941t), "he", tVar.mo79758x(C90125fw.f250941t), "fr", tVar.mo79758x(C90125fw.f250938q), "es", tVar.mo79758x(C90125fw.f250904U));
    }

    /* renamed from: f */
    private static boolean m136798f(C86124t tVar, C58833ax axVar) {
        if (!axVar.mo56113h()) {
            return false;
        }
        return C58869cf.m90936b(new C58903m(',')).mo56155i(tVar.mo79758x(C90125fw.f250929h)).contains(((C52582xb) axVar.mo56107c()).name());
    }
}
