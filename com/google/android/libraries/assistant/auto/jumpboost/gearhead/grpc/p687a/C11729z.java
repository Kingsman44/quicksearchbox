package com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.a.z */
/* compiled from: PG */
public final class C11729z extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C11729z f37775b;

    /* renamed from: d */
    private static volatile C63010eb f37776d;

    /* renamed from: a */
    public int f37777a;

    /* renamed from: c */
    private C11685ap f37778c;

    static {
        C11729z zVar = new C11729z();
        f37775b = zVar;
        C62942bv.registerDefaultInstance(C11729z.class, zVar);
    }

    private C11729z() {
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
                return newMessageInfo(f37775b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", C45240c.f118157a});
            case 3:
                return new C11729z();
            case 4:
                return new C11728y();
            case 5:
                return f37775b;
            case 6:
                C63010eb ebVar = f37776d;
                if (ebVar == null) {
                    synchronized (C11729z.class) {
                        ebVar = f37776d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f37775b);
                            f37776d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
