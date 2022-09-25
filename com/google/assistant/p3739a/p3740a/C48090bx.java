package com.google.assistant.p3739a.p3740a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.a.a.bx */
/* compiled from: PG */
public final class C48090bx extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C48090bx f124451f;

    /* renamed from: g */
    private static volatile C63010eb f124452g;

    /* renamed from: a */
    public int f124453a;

    /* renamed from: b */
    public int f124454b;

    /* renamed from: c */
    public C48045af f124455c;

    /* renamed from: d */
    public int f124456d;

    /* renamed from: e */
    public C48041ab f124457e;

    static {
        C48090bx bxVar = new C48090bx();
        f124451f = bxVar;
        C62942bv.registerDefaultInstance(C48090bx.class, bxVar);
    }

    private C48090bx() {
        C63088z zVar = C63088z.f170246b;
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
                return newMessageInfo(f124451f, "\u0000\u0005\u0000\u0000\u0001\n\u0005\u0000\u0000\u0000\u0001\u0004\u0002\f\u0004\t\u0005\u0004\n\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C48090bx();
            case 4:
                return new C48088bv();
            case 5:
                return f124451f;
            case 6:
                C63010eb ebVar = f124452g;
                if (ebVar == null) {
                    synchronized (C48090bx.class) {
                        ebVar = f124452g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124451f);
                            f124452g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
