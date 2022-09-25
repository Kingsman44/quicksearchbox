package com.google.android.apps.gsa.shared.p6986aj;

import com.evernote.android.state.BuildConfig;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58758qx;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63088z;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.shared.aj.e */
/* compiled from: PG */
public final class C89186e {

    /* renamed from: a */
    private static final C59071e f241804a = C59071e.m91332i("com.google.android.apps.gsa.shared.aj.e");

    /* renamed from: a */
    public static C89184c m145056a(String str, Object obj) {
        C89183b bVar = (C89183b) C89184c.f241789k.createBuilder();
        bVar.copyOnWrite();
        C89184c cVar = (C89184c) bVar.instance;
        str.getClass();
        cVar.f241791a |= 1;
        cVar.f241792b = str;
        if (obj instanceof Boolean) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            bVar.copyOnWrite();
            C89184c cVar2 = (C89184c) bVar.instance;
            cVar2.f241791a |= 2;
            cVar2.f241793c = booleanValue;
        } else if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            bVar.copyOnWrite();
            C89184c cVar3 = (C89184c) bVar.instance;
            cVar3.f241791a |= 4;
            cVar3.f241794d = floatValue;
        } else if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            bVar.copyOnWrite();
            C89184c cVar4 = (C89184c) bVar.instance;
            cVar4.f241791a |= 8;
            cVar4.f241795e = intValue;
        } else if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            bVar.copyOnWrite();
            C89184c cVar5 = (C89184c) bVar.instance;
            cVar5.f241791a |= 16;
            cVar5.f241796f = longValue;
        } else if (obj instanceof String) {
            String str2 = (String) obj;
            bVar.copyOnWrite();
            C89184c cVar6 = (C89184c) bVar.instance;
            str2.getClass();
            cVar6.f241791a |= 32;
            cVar6.f241797g = str2;
        } else if (obj instanceof Set) {
            HashSet f = C58758qx.m90648f((Set) obj);
            String str3 = true != f.remove((Object) null) ? BuildConfig.FLAVOR : "null";
            bVar.copyOnWrite();
            C89184c cVar7 = (C89184c) bVar.instance;
            cVar7.mo83150a();
            cVar7.f241798h.add(str3);
            bVar.copyOnWrite();
            C89184c cVar8 = (C89184c) bVar.instance;
            cVar8.mo83150a();
            C62947c.addAll((Iterable) f, (List) cVar8.f241798h);
        } else if (obj instanceof C63088z) {
            C63088z zVar = (C63088z) obj;
            bVar.copyOnWrite();
            C89184c cVar9 = (C89184c) bVar.instance;
            zVar.getClass();
            cVar9.f241791a |= 64;
            cVar9.f241799i = zVar;
        } else if (obj instanceof List) {
            List list = (List) obj;
            bVar.copyOnWrite();
            C89184c cVar10 = (C89184c) bVar.instance;
            C62961ch chVar = cVar10.f241800j;
            if (!chVar.mo58948c()) {
                cVar10.f241800j = C62942bv.mutableCopy(chVar);
            }
            C62947c.addAll((Iterable) list, (List) cVar10.f241800j);
        } else {
            ((C59052c) ((C59052c) f241804a.mo56226d()).mo56372aa(11006)).mo56389s("createSharedPreferenceEntry: invalid entry class = %s", obj.getClass().getName());
        }
        return (C89184c) bVar.build();
    }

    /* renamed from: b */
    public static C89185d m145057b(Map map) {
        C89182a aVar = (C89182a) C89185d.f241801b.createBuilder();
        for (Map.Entry entry : map.entrySet()) {
            aVar.mo83149a(m145056a((String) entry.getKey(), entry.getValue()));
        }
        return (C89185d) aVar.build();
    }

    /* renamed from: c */
    public static Map m145058c(C89185d dVar) {
        HashMap hashMap = new HashMap();
        for (C89184c cVar : dVar.f241803a) {
            int i = cVar.f241791a;
            if ((i & 1) != 0) {
                String str = cVar.f241792b;
                if ((i & 2) != 0) {
                    hashMap.put(str, Boolean.valueOf(cVar.f241793c));
                } else if ((i & 4) != 0) {
                    hashMap.put(str, Float.valueOf(cVar.f241794d));
                } else if ((i & 8) != 0) {
                    hashMap.put(str, Integer.valueOf(cVar.f241795e));
                } else if ((i & 16) != 0) {
                    hashMap.put(str, Long.valueOf(cVar.f241796f));
                } else if ((i & 32) != 0) {
                    hashMap.put(str, cVar.f241797g);
                } else if (cVar.f241798h.size() != 0) {
                    int size = cVar.f241798h.size();
                    HashSet g = C58758qx.m90649g(size);
                    String str2 = (String) cVar.f241798h.get(0);
                    if (!str2.isEmpty()) {
                        if (str2.equals("null")) {
                            g.add((Object) null);
                        } else {
                            ((C59052c) ((C59052c) f241804a.mo56225c()).mo56372aa(11007)).mo56354G("dataToMap: invalid nullTag: %s->%s", str, str2);
                        }
                    }
                    for (int i2 = 1; i2 < size; i2++) {
                        g.add((String) cVar.f241798h.get(i2));
                    }
                    hashMap.put(str, g);
                } else if ((cVar.f241791a & 64) != 0) {
                    hashMap.put(str, cVar.f241799i);
                } else if (cVar.f241800j.size() != 0) {
                    hashMap.put(str, C58485gu.m89842j(cVar.f241800j));
                }
            } else {
                ((C59052c) ((C59052c) f241804a.mo56225c()).mo56372aa(11008)).mo56386p("dataToMap: null key.");
            }
        }
        return hashMap;
    }
}
