package com.google.assistant.p3824am;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.am.f */
/* compiled from: PG */
public final class C49247f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C49247f f127313a;

    /* renamed from: d */
    private static volatile C63010eb f127314d;

    /* renamed from: b */
    private int f127315b;

    /* renamed from: c */
    private C49245d f127316c;

    static {
        C49247f fVar = new C49247f();
        f127313a = fVar;
        C62942bv.registerDefaultInstance(C49247f.class, fVar);
    }

    private C49247f() {
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
                return newMessageInfo(f127313a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဉ\u0002", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C49247f();
            case 4:
                return new C49246e();
            case 5:
                return f127313a;
            case 6:
                C63010eb ebVar = f127314d;
                if (ebVar == null) {
                    synchronized (C49247f.class) {
                        ebVar = f127314d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127313a);
                            f127314d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
