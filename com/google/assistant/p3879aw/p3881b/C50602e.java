package com.google.assistant.p3879aw.p3881b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.aw.b.e */
/* compiled from: PG */
public final class C50602e extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50602e f131657b;

    /* renamed from: d */
    private static volatile C63010eb f131658d;

    /* renamed from: a */
    public int f131659a;

    /* renamed from: c */
    private int f131660c;

    static {
        C50602e eVar = new C50602e();
        f131657b = eVar;
        C62942bv.registerDefaultInstance(C50602e.class, eVar);
    }

    private C50602e() {
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
                return newMessageInfo(f131657b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C50600c.f131656a});
            case 3:
                return new C50602e();
            case 4:
                return new C50599b();
            case 5:
                return f131657b;
            case 6:
                C63010eb ebVar = f131658d;
                if (ebVar == null) {
                    synchronized (C50602e.class) {
                        ebVar = f131658d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131657b);
                            f131658d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
