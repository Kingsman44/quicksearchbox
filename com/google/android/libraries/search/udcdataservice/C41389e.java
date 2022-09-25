package com.google.android.libraries.search.udcdataservice;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62959cf;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.udcdataservice.e */
/* compiled from: PG */
public final class C41389e extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C41389e f108143e;

    /* renamed from: f */
    private static volatile C63010eb f108144f;

    /* renamed from: a */
    public int f108145a;

    /* renamed from: b */
    public int f108146b;

    /* renamed from: c */
    public int f108147c;

    /* renamed from: d */
    public int f108148d;

    static {
        C41389e eVar = new C41389e();
        f108143e = eVar;
        C62942bv.registerDefaultInstance(C41389e.class, eVar);
    }

    private C41389e() {
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
                Object[] objArr = new Object[7];
                objArr[0] = "a";
                objArr[1] = "b";
                objArr[2] = C41387c.m72381b();
                objArr[3] = C45240c.f118157a;
                C62959cf cfVar = C41390f.f108149a;
                objArr[6] = cfVar;
                objArr[4] = cfVar;
                objArr[5] = "d";
                return newMessageInfo(f108143e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", objArr);
            case 3:
                return new C41389e();
            case 4:
                return new C41388d();
            case 5:
                return f108143e;
            case 6:
                C63010eb ebVar = f108144f;
                if (ebVar == null) {
                    synchronized (C41389e.class) {
                        ebVar = f108144f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f108143e);
                            f108144f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
