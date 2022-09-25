package com.google.assistant.p3838ao.p3839a.p3845e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62959cf;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ao.a.e.dn */
/* compiled from: PG */
public final class C49611dn extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C49611dn f128019d;

    /* renamed from: e */
    private static volatile C63010eb f128020e;

    /* renamed from: a */
    public int f128021a;

    /* renamed from: b */
    public int f128022b;

    /* renamed from: c */
    public int f128023c;

    static {
        C49611dn dnVar = new C49611dn();
        f128019d = dnVar;
        C62942bv.registerDefaultInstance(C49611dn.class, dnVar);
    }

    private C49611dn() {
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
                Object[] objArr = new Object[5];
                objArr[0] = "a";
                objArr[1] = "b";
                C62959cf cfVar = C49608dk.f128018a;
                objArr[4] = cfVar;
                objArr[2] = cfVar;
                objArr[3] = C45240c.f118157a;
                return newMessageInfo(f128019d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", objArr);
            case 3:
                return new C49611dn();
            case 4:
                return new C49610dm();
            case 5:
                return f128019d;
            case 6:
                C63010eb ebVar = f128020e;
                if (ebVar == null) {
                    synchronized (C49611dn.class) {
                        ebVar = f128020e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128019d);
                            f128020e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
