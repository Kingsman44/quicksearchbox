package com.google.android.apps.gsa.opa.p6435c;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90066dr;
import com.google.assistant.p3745ab.C48269bz;
import com.google.assistant.p3745ab.C48273ca;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.opa.c.n */
/* compiled from: PG */
public final class C83602n {

    /* renamed from: a */
    private static final C59071e f227923a = C59071e.m91332i("com.google.android.apps.gsa.opa.c.n");

    /* renamed from: a */
    public static C48273ca m133181a(C48273ca caVar, List list) {
        if (caVar == null || list.isEmpty()) {
            return caVar;
        }
        C48269bz bzVar = (C48269bz) caVar.toBuilder();
        float c = m133183c(caVar.f124854b, list);
        bzVar.copyOnWrite();
        C48273ca caVar2 = (C48273ca) bzVar.instance;
        caVar2.f124853a |= 1;
        caVar2.f124854b = c;
        float c2 = m133183c(caVar.f124855c, list);
        bzVar.copyOnWrite();
        C48273ca caVar3 = (C48273ca) bzVar.instance;
        caVar3.f124853a |= 2;
        caVar3.f124855c = c2;
        return (C48273ca) bzVar.build();
    }

    /* renamed from: b */
    public static List m133182b(C86124t tVar) {
        C58495hd r = tVar.mo79752r(C90066dr.f249673P);
        ArrayList arrayList = new ArrayList(r.size());
        for (Map.Entry entry : r.entrySet()) {
            if (TextUtils.isEmpty((CharSequence) entry.getKey()) || TextUtils.isEmpty((CharSequence) entry.getValue())) {
                C59104x c = f227923a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "communication.utils");
                ((C59052c) ((C59052c) c).mo56372aa(6787)).mo56354G("Invalid buckets value key: %s, value: %s", entry.getKey(), entry.getValue());
            } else {
                List i = C58869cf.m90936b(new C58903m('|')).mo56155i((CharSequence) entry.getValue());
                if (i.size() != 2) {
                    C59104x c2 = f227923a.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "communication.utils");
                    ((C59052c) ((C59052c) c2).mo56372aa(6790)).mo56354G("Invalid buckets value. Failed to split bucketsSizeAndEndTime correctly. key: %s, value: %s", entry.getKey(), entry.getValue());
                } else if (TextUtils.isEmpty((CharSequence) i.get(0)) || TextUtils.isEmpty((CharSequence) i.get(1))) {
                    C59104x c3 = f227923a.mo56225c();
                    c3.mo56378ag(C58975e.f156826a, "communication.utils");
                    ((C59052c) ((C59052c) c3).mo56372aa(6788)).mo56354G("Invalid buckets value. Failed to get buckets size or end time. key: %s, value: %s", entry.getKey(), entry.getValue());
                } else {
                    Integer valueOf = Integer.valueOf((String) entry.getKey());
                    Integer valueOf2 = Integer.valueOf((String) i.get(0));
                    Integer valueOf3 = Integer.valueOf((String) i.get(1));
                    while (valueOf.compareTo(valueOf3) < 0) {
                        arrayList.add(new C83588a(valueOf, valueOf2));
                        valueOf = Integer.valueOf(valueOf.intValue() + valueOf2.intValue());
                        C58976aa aaVar = C58975e.f156826a;
                    }
                }
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: c */
    private static float m133183c(float f, List list) {
        int intValue;
        C58976aa aaVar = C58975e.f156826a;
        if (f <= 0.0f) {
            return f;
        }
        Integer c = ((C83590b) C58557jl.m90131l(list)).mo76951c();
        if (((int) f) >= c.intValue()) {
            intValue = c.intValue();
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C83590b bVar = (C83590b) it.next();
                Float valueOf = Float.valueOf(f);
                boolean z = false;
                if (valueOf.floatValue() >= ((float) bVar.mo76947b().intValue()) && valueOf.floatValue() < ((float) bVar.mo76951c().intValue())) {
                    z = true;
                }
                if (Boolean.valueOf(z).booleanValue()) {
                    intValue = bVar.mo76951c().intValue();
                }
            }
            return -1.0f;
        }
        return (float) intValue;
    }
}
