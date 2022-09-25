package com.google.android.gms.analytics.internal;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.common.internal.C143919bh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.analytics.internal.ao */
/* compiled from: PG */
public final class C142718ao {

    /* renamed from: a */
    public final Map f387287a;

    /* renamed from: b */
    public final List f387288b;

    /* renamed from: c */
    public final long f387289c;

    /* renamed from: d */
    public final long f387290d;

    /* renamed from: e */
    public final int f387291e;

    /* renamed from: f */
    public final boolean f387292f;

    /* renamed from: g */
    private final String f387293g;

    public C142718ao(C142736f fVar, Map map, long j, boolean z) {
        this(fVar, map, j, z, 0, 0, (List) null);
    }

    /* renamed from: b */
    private static String m231565b(C142736f fVar, Object obj) {
        if (obj == null) {
            return null;
        }
        String obj2 = obj.toString();
        if (obj2.startsWith("&")) {
            obj2 = obj2.substring(1);
        }
        int length = obj2.length();
        if (length > 256) {
            obj2 = obj2.substring(0, 256);
            fVar.mo117536i(5, "Hit param name is too long and will be trimmed", Integer.valueOf(length), obj2, (Object) null);
        }
        if (TextUtils.isEmpty(obj2)) {
            return null;
        }
        return obj2;
    }

    /* renamed from: c */
    private static String m231566c(C142736f fVar, Object obj) {
        String obj2 = obj == null ? BuildConfig.FLAVOR : obj.toString();
        int length = obj2.length();
        if (length <= 8192) {
            return obj2;
        }
        String substring = obj2.substring(0, 8192);
        fVar.mo117536i(5, "Hit param value is too long and will be trimmed", Integer.valueOf(length), substring, (Object) null);
        return substring;
    }

    /* renamed from: d */
    private static boolean m231567d(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj.toString().startsWith("&");
    }

    /* renamed from: a */
    public final String mo117507a(String str, String str2) {
        C143919bh.m233969l(str);
        C143919bh.m233960c(!str.startsWith("&"), "Short param name required");
        String str3 = (String) this.f387287a.get(str);
        return str3 != null ? str3 : str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ht=");
        sb.append(this.f387290d);
        if (this.f387289c != 0) {
            sb.append(", dbId=");
            sb.append(this.f387289c);
        }
        if (this.f387291e != 0) {
            sb.append(", appUID=");
            sb.append(this.f387291e);
        }
        ArrayList arrayList = new ArrayList(this.f387287a.keySet());
        Collections.sort(arrayList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            sb.append(", ");
            sb.append(str);
            sb.append("=");
            sb.append((String) this.f387287a.get(str));
        }
        return sb.toString();
    }

    public C142718ao(C142736f fVar, Map map, long j, boolean z, long j2, int i, List list) {
        List list2;
        String str;
        String b;
        String b2;
        C143919bh.m233958a(fVar);
        C143919bh.m233958a(map);
        this.f387290d = j;
        this.f387292f = z;
        this.f387289c = j2;
        this.f387291e = i;
        if (list != null) {
            list2 = list;
        } else {
            list2 = Collections.emptyList();
        }
        this.f387288b = list2;
        String str2 = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Command command = (Command) it.next();
                if ("appendVersion".equals(command.f387221a)) {
                    str = command.f387222b;
                    break;
                }
            }
        }
        str = null;
        this.f387293g = true != TextUtils.isEmpty(str) ? str : str2;
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (m231567d(entry.getKey()) && (b2 = m231565b(fVar, entry.getKey())) != null) {
                hashMap.put(b2, m231566c(fVar, entry.getValue()));
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (!m231567d(entry2.getKey()) && (b = m231565b(fVar, entry2.getKey())) != null) {
                hashMap.put(b, m231566c(fVar, entry2.getValue()));
            }
        }
        if (!TextUtils.isEmpty(this.f387293g)) {
            C142731ba.m231604d(hashMap, "_v", this.f387293g);
            if (this.f387293g.equals("ma4.0.0") || this.f387293g.equals("ma4.0.1")) {
                hashMap.remove("adid");
            }
        }
        this.f387287a = Collections.unmodifiableMap(hashMap);
    }
}
