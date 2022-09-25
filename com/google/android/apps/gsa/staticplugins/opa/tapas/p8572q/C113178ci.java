package com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.libraries.searchbox.shared.suggestion.C41663ac;
import com.google.android.libraries.searchbox.shared.suggestion.C41693s;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4535g.C59203do;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.q.ci */
/* compiled from: PG */
public final class C113178ci {

    /* renamed from: a */
    public final C113169c f313497a;

    /* renamed from: b */
    private final C86124t f313498b;

    /* renamed from: c */
    private final C113168bz f313499c;

    public C113178ci(C86124t tVar, C113169c cVar, C113168bz bzVar) {
        this.f313498b = tVar;
        this.f313497a = cVar;
        this.f313499c = bzVar;
    }

    /* renamed from: b */
    public static boolean m187199b(String str) {
        return !str.equals("com.google.android.googlequicksearchbox") && !str.equals("com.google.android.apps.googleassistant");
    }

    /* renamed from: c */
    public static boolean m187200c(C113415ez ezVar) {
        boolean z = false;
        if (ezVar.mo100206f() == 84) {
            C41663ac acVar = ezVar.mo100209i().f109008b;
            if (acVar == null) {
                acVar = C41663ac.f108934g;
            }
            if (acVar.f108937b == 3) {
                C41693s sVar = ezVar.mo100209i().f109009c;
                if (sVar == null) {
                    sVar = C41693s.f109053h;
                }
                if ((sVar.f109055a & 8) != 0) {
                    C41693s sVar2 = ezVar.mo100209i().f109009c;
                    if (sVar2 == null) {
                        sVar2 = C41693s.f109053h;
                    }
                    if (m187199b(sVar2.f109059e)) {
                        z = true;
                    }
                }
            }
        }
        ezVar.mo100199L();
        return z;
    }

    /* renamed from: a */
    public final C58485gu mo99899a(Context context, Optional optional) {
        Map c = this.f313497a.mo99898c(context);
        HashMap hashMap = new HashMap();
        boolean e = this.f313498b.mo79746e(C90063do.f249286af);
        double d = Double.MIN_VALUE;
        double d2 = Double.MAX_VALUE;
        for (Map.Entry entry : c.entrySet()) {
            String str = (String) entry.getKey();
            C113142b bVar = (C113142b) entry.getValue();
            if (!TextUtils.isEmpty(str) && bVar != null) {
                if (!optional.isPresent() || ((Set) optional.get()).contains(str)) {
                    long j = bVar.f313458b;
                    if (e) {
                        j = Math.max(j, bVar.f313457a);
                    }
                    double a = this.f313499c.mo99895a(e, bVar.f313459c, j);
                    d = Math.max(d, a);
                    d2 = Math.min(d2, a);
                    hashMap.put(str, Double.valueOf(a));
                }
            }
        }
        if (e) {
            double d3 = d - d2;
            if (d3 > C59203do.f157270a) {
                C58485gu j2 = C58485gu.m89842j(hashMap.keySet());
                int size = j2.size();
                for (int i = 0; i < size; i++) {
                    Map.EL.compute(hashMap, (String) j2.get(i), new C113174ce(d2, d3));
                }
            }
        }
        return (C58485gu) Collection.EL.stream(hashMap.entrySet()).map(C113175cf.f313492a).sorted(Comparator.EL.reversed(Comparator.CC.comparing(C113176cg.f313493a))).collect(C58370cn.f155946a);
    }
}
