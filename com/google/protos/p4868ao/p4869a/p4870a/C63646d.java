package com.google.protos.p4868ao.p4869a.p4870a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ao.a.a.d */
/* compiled from: PG */
public final class C63646d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63646d f172127c;

    /* renamed from: d */
    private static volatile C63010eb f172128d;

    /* renamed from: a */
    public int f172129a;

    /* renamed from: b */
    public C63644b f172130b;

    static {
        C63646d dVar = new C63646d();
        f172127c = dVar;
        C62942bv.registerDefaultInstance(C63646d.class, dVar);
    }

    private C63646d() {
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
                return newMessageInfo(f172127c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C63646d();
            case 4:
                return new C63645c();
            case 5:
                return f172127c;
            case 6:
                C63010eb ebVar = f172128d;
                if (ebVar == null) {
                    synchronized (C63646d.class) {
                        ebVar = f172128d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172127c);
                            f172128d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
