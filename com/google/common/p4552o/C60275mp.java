package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62959cf;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.mp */
/* compiled from: PG */
public final class C60275mp extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C60275mp f163069f;

    /* renamed from: g */
    private static volatile C63010eb f163070g;

    /* renamed from: a */
    public int f163071a;

    /* renamed from: b */
    public long f163072b;

    /* renamed from: c */
    public int f163073c;

    /* renamed from: d */
    public int f163074d;

    /* renamed from: e */
    public int f163075e;

    static {
        C60275mp mpVar = new C60275mp();
        f163069f = mpVar;
        C62942bv.registerDefaultInstance(C60275mp.class, mpVar);
    }

    private C60275mp() {
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
                Object[] objArr = new Object[8];
                objArr[0] = "a";
                objArr[1] = "b";
                objArr[2] = C45240c.f118157a;
                C62959cf cfVar = C60274mo.f163068a;
                objArr[5] = cfVar;
                objArr[3] = cfVar;
                objArr[4] = "d";
                objArr[6] = "e";
                objArr[7] = C60272mm.f163067a;
                return newMessageInfo(f163069f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003", objArr);
            case 3:
                return new C60275mp();
            case 4:
                return new C60273mn();
            case 5:
                return f163069f;
            case 6:
                C63010eb ebVar = f163070g;
                if (ebVar == null) {
                    synchronized (C60275mp.class) {
                        ebVar = f163070g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163069f);
                            f163070g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
