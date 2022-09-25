package com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b;

import com.evernote.android.state.BuildConfig;
import com.google.android.p10712d.C142331bj;
import com.google.android.p10712d.C142332bk;
import com.google.android.p10712d.C142349ca;
import com.google.android.p10712d.C142354cf;
import com.google.android.p10712d.C142355cg;
import com.google.common.base.C58869cf;
import com.google.common.base.C58890d;
import com.google.common.base.C58903m;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.a.b.f */
/* compiled from: PG */
public final class C124525f {
    /* renamed from: a */
    public static C124524e m203985a(C142355cg cgVar) {
        return new C124524e(m203989e(cgVar));
    }

    /* renamed from: b */
    public static C142332bk m203986b(C142332bk bkVar, String str) {
        C142349ca caVar = (C142349ca) m203988d(bkVar.f386157a, str, C124522c.f343591a);
        if (caVar == null) {
            return C142332bk.f386155b;
        }
        C142331bj bjVar = (C142331bj) C142332bk.f386155b.createBuilder();
        bjVar.copyOnWrite();
        C142332bk bkVar2 = (C142332bk) bjVar.instance;
        C62971cq cqVar = bkVar2.f386157a;
        if (!cqVar.mo58948c()) {
            bkVar2.f386157a = C62942bv.mutableCopy(cqVar);
        }
        bkVar2.f386157a.add(caVar);
        return (C142332bk) bjVar.build();
    }

    /* renamed from: c */
    public static C142355cg m203987c(C142355cg cgVar, String str) {
        C142349ca caVar = (C142349ca) m203988d(cgVar.f386265a, str, C124522c.f343591a);
        if (caVar == null) {
            return C142355cg.f386263b;
        }
        C142354cf cfVar = (C142354cf) C142355cg.f386263b.createBuilder();
        cfVar.copyOnWrite();
        C142355cg cgVar2 = (C142355cg) cfVar.instance;
        C62971cq cqVar = cgVar2.f386265a;
        if (!cqVar.mo58948c()) {
            cgVar2.f386265a = C62942bv.mutableCopy(cqVar);
        }
        cgVar2.f386265a.add(caVar);
        return (C142355cg) cfVar.build();
    }

    /* renamed from: d */
    public static Object m203988d(List list, String str, Function function) {
        String h = m203992h(str);
        Iterator it = C58869cf.m90936b(new C58903m('_')).mo56153g(h).iterator();
        String str2 = it.hasNext() ? (String) it.next() : BuildConfig.FLAVOR;
        Object obj = null;
        Object obj2 = null;
        for (Object next : list) {
            String h2 = m203992h((String) function.apply(next));
            if (C58890d.m90990e(h, h2)) {
                return next;
            }
            if (C58890d.m90990e(str2, h2)) {
                obj = next;
            } else if (C58890d.m90990e("en_US", h2)) {
                obj2 = next;
            }
        }
        return obj != null ? obj : obj2;
    }

    /* renamed from: e */
    public static String m203989e(C142355cg cgVar) {
        if (cgVar == null) {
            return null;
        }
        return m203990f(cgVar.f386265a);
    }

    /* renamed from: f */
    public static String m203990f(List list) {
        C142349ca caVar = (C142349ca) m203988d(list, m203991g(Locale.getDefault()), C124522c.f343591a);
        if (caVar == null) {
            return null;
        }
        return caVar.f386236b;
    }

    /* renamed from: g */
    public static String m203991g(Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        return language + "_" + country;
    }

    /* renamed from: h */
    public static String m203992h(String str) {
        return str.replace('-', '_');
    }
}
