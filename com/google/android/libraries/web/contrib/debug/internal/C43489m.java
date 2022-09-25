package com.google.android.libraries.web.contrib.debug.internal;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.web.base.C43271v;
import com.google.android.libraries.web.base.p3348b.p3350b.C43242a;
import com.google.android.libraries.web.contrib.debug.C43474f;
import com.google.common.base.C58880cq;
import com.google.common.base.C58893dc;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.web.contrib.debug.internal.m */
/* compiled from: PG */
public final class C43489m {
    /* renamed from: a */
    public static String m76738a(C43474f fVar) {
        String str = fVar.f113567f;
        return "Web debug data for " + str + ":\n";
    }

    /* renamed from: b */
    public static String m76739b(String str, Map map, String str2) {
        if (str.isEmpty()) {
            return BuildConfig.FLAVOR;
        }
        if (!map.containsKey(str)) {
            int size = map.size();
            map.put(str, "[" + str2 + "_" + (size + 1) + "]");
        }
        return (String) map.get(str);
    }

    /* renamed from: c */
    public static String m76740c(C43502z zVar, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        C43271v vVar = ((C43478b) zVar.f113609a).f113577a;
        boolean z = vVar == C43271v.WEB_LAYER;
        sb.append(str);
        sb.append("  ");
        sb.append(String.format("Web implementation: %s\n", new Object[]{vVar}));
        if (z) {
            sb.append(str);
            sb.append("  ");
            sb.append(String.format("Windows count: %s\n", new Object[]{Integer.valueOf(zVar.f113611c)}));
        }
        if (zVar.f113612d != C43242a.NONE) {
            sb.append(str);
            sb.append("  ");
            sb.append(String.format("Web content destroyed because %s.\n", new Object[]{zVar.f113612d.f113005f}));
        }
        C58485gu<C43501y> a = zVar.mo46575a();
        int size = a.size();
        String str3 = BuildConfig.FLAVOR;
        if (size == 0) {
            str2 = "No recent WebStates found.\n";
        } else {
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(size);
            objArr[1] = size > 1 ? C59002s.f156871a : str3;
            str2 = String.format("Recent WebStates (%s item%s):\n", objArr);
        }
        sb.append(str + "  " + str2);
        if (!a.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put("timestamp", C43480d.f113582a);
            linkedHashMap3.put("current_url", new C43481e(linkedHashMap));
            linkedHashMap3.put("load_state", C43482f.f113584a);
            linkedHashMap3.put("trigger_type", C43483g.f113585a);
            linkedHashMap3.put("progress", C43484h.f113586a);
            linkedHashMap3.put("title", new C43485i(linkedHashMap2));
            linkedHashMap3.put("error", C43486j.f113588a);
            linkedHashMap3.put("pending_request", new C43487k(linkedHashMap));
            if (z) {
                linkedHashMap3.put("window_id", C43488l.f113590a);
            }
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (C43501y yVar : a) {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry entry : linkedHashMap3.entrySet()) {
                    String str4 = (String) ((Function) entry.getValue()).apply(yVar);
                    int length = str4.length();
                    String str5 = (String) entry.getKey();
                    if (!hashMap.containsKey(str5) || ((Integer) hashMap.get(str5)).intValue() < length) {
                        hashMap.put(str5, Integer.valueOf(length));
                    }
                    hashMap2.put(str5, str4);
                }
                arrayList.add(hashMap2);
            }
            HashMap hashMap3 = new HashMap();
            HashMap hashMap4 = new HashMap();
            for (Map.Entry entry2 : hashMap.entrySet()) {
                if (((Integer) entry2.getValue()).intValue() > 0) {
                    String str6 = (String) entry2.getKey();
                    int max = Math.max(((Integer) entry2.getValue()).intValue(), str6.length());
                    hashMap3.put(str6, str6);
                    int i = max + 1;
                    hashMap4.put(str6, C58880cq.m90966b("-", i));
                    entry2.setValue(Integer.valueOf(i));
                }
            }
            arrayList.add(0, hashMap3);
            arrayList.add(1, hashMap4);
            StringBuilder sb2 = new StringBuilder();
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Map map = (Map) arrayList.get(i2);
                sb2.append(str);
                sb2.append("  ");
                for (String str7 : linkedHashMap3.keySet()) {
                    Integer num = (Integer) hashMap.get(str7);
                    C58893dc.m90996a(num);
                    int intValue = num.intValue();
                    if (intValue > 0) {
                        String str8 = (String) map.get(str7);
                        C58893dc.m90996a(str8);
                        sb2.append("|");
                        sb2.append(str8);
                        sb2.append(C58880cq.m90966b(" ", intValue - str8.length()));
                    }
                }
                sb2.append("|\n");
            }
            str3 = sb2.toString();
        }
        sb.append(str3);
        return sb.toString();
    }
}
