package com.google.p4591e.p4592a.p4593a;

import com.evernote.android.state.BuildConfig;
import com.google.p4591e.p4592a.p4603d.C61054h;
import com.google.p4591e.p4592a.p4603d.p4604a.C61040a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.google.e.a.a.b */
/* compiled from: PG */
public final class C61015b {

    /* renamed from: a */
    public static final Map f165232a = new HashMap();

    static {
        C61014a.values();
    }

    /* renamed from: a */
    public static String m93272a(String str, Iterator it, boolean z, C61014a aVar) {
        String str2;
        if (!it.hasNext()) {
            return BuildConfig.FLAVOR;
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            str2 = aVar.f165229k;
        } else {
            if (aVar.f165230l) {
                sb.append(C61040a.f165277b.mo57591a(str));
                sb.append("=");
            }
            str2 = ",";
        }
        while (it.hasNext()) {
            if (z && aVar.f165230l) {
                sb.append(C61040a.f165277b.mo57591a(str));
                sb.append("=");
            }
            sb.append(aVar.mo57532a(it.next().toString()));
            if (it.hasNext()) {
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static Map m93273b(Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : C61054h.m93412f(obj).entrySet()) {
            Object value = entry.getValue();
            if (value != null && !C61054h.m93415i(value)) {
                linkedHashMap.put((String) entry.getKey(), value);
            }
        }
        return linkedHashMap;
    }
}
