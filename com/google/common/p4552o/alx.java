package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.common.o.alx */
/* compiled from: PG */
public final class alx extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final alx f159111e;

    /* renamed from: f */
    public static final C62940bt f159112f;

    /* renamed from: g */
    private static volatile C63010eb f159113g;

    /* renamed from: a */
    public int f159114a;

    /* renamed from: b */
    public int f159115b = 0;

    /* renamed from: c */
    public Object f159116c;

    /* renamed from: d */
    public C62910ar f159117d;

    static {
        alx alx = new alx();
        f159111e = alx;
        C62942bv.registerDefaultInstance(alx.class, alx);
        f159112f = C62942bv.newSingularGeneratedExtension(aqs.f159780k, alx, alx, (C62958ce) null, 485, C63066gd.MESSAGE, alx.class);
    }

    private alx() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f159111e, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ဉ\u0001", new Object[]{C45240c.f118157a, "b", "a", alv.class, "d"});
            case 3:
                return new alx();
            case 4:
                return new alw();
            case 5:
                return f159111e;
            case 6:
                C63010eb ebVar = f159113g;
                if (ebVar == null) {
                    synchronized (alx.class) {
                        ebVar = f159113g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159111e);
                            f159113g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
