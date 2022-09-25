package com.google.p4583d.p4584a.p4585a;

import com.google.android.gms.measurement.p10848a.C145152bc;
import com.google.android.gms.measurement.p10848a.C145153bd;
import com.google.p4583d.p4584a.p4588d.C60976c;
import com.google.p4583d.p4584a.p4588d.C60977d;
import com.google.p4583d.p4584a.p4588d.C60979f;
import com.google.p4583d.p4584a.p4588d.C60984k;
import com.google.p4583d.p4584a.p4588d.C60987n;
import com.google.p4583d.p4584a.p4588d.C60988o;
import com.google.p4583d.p4584a.p4588d.C60991r;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.d.a.a.a */
/* compiled from: PG */
public final class C60953a {
    /* renamed from: a */
    public static C60987n m93112a(C145153bd bdVar) {
        if (bdVar == null) {
            return C60987n.f165114f;
        }
        int a = C145152bc.m235830a(bdVar.f392327b);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        C62971cq<C145153bd> cqVar = bdVar.f392328c;
                        ArrayList arrayList = new ArrayList();
                        for (C145153bd a2 : cqVar) {
                            arrayList.add(m93112a(a2));
                        }
                        return new C60988o(bdVar.f392329d, arrayList);
                    }
                    throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
                } else if ((bdVar.f392326a & 8) != 0) {
                    return new C60977d(Boolean.valueOf(bdVar.f392331f));
                } else {
                    return new C60977d((Boolean) null);
                }
            } else if ((bdVar.f392326a & 16) != 0) {
                return new C60979f(Double.valueOf(bdVar.f392332g));
            } else {
                return new C60979f((Double) null);
            }
        } else if ((bdVar.f392326a & 4) != 0) {
            return new C60991r(bdVar.f392330e);
        } else {
            return C60987n.f165121m;
        }
    }

    /* renamed from: b */
    public static C60987n m93113b(Object obj) {
        if (obj == null) {
            return C60987n.f165115g;
        }
        if (obj instanceof String) {
            return new C60991r((String) obj);
        }
        if (obj instanceof Double) {
            return new C60979f((Double) obj);
        }
        if (obj instanceof Long) {
            return new C60979f(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C60979f(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C60977d((Boolean) obj);
        }
        if (obj instanceof Map) {
            C60984k kVar = new C60984k();
            Map map = (Map) obj;
            for (Object next : map.keySet()) {
                C60987n b = m93113b(map.get(next));
                if (next != null) {
                    if (!(next instanceof String)) {
                        next = next.toString();
                    }
                    kVar.mo57484q((String) next, b);
                }
            }
            return kVar;
        } else if (obj instanceof List) {
            C60976c cVar = new C60976c();
            for (Object b2 : (List) obj) {
                cVar.mo57483p(cVar.mo57467c(), m93113b(b2));
            }
            return cVar;
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }
}
