package com.google.android.libraries.search.assistant.p2566g;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.g.f */
/* compiled from: PG */
public final class C33411f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C33411f f89478d;

    /* renamed from: e */
    private static volatile C63010eb f89479e;

    /* renamed from: a */
    public int f89480a;

    /* renamed from: b */
    public long f89481b;

    /* renamed from: c */
    public long f89482c;

    static {
        C33411f fVar = new C33411f();
        f89478d = fVar;
        C62942bv.registerDefaultInstance(C33411f.class, fVar);
    }

    private C33411f() {
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
                return newMessageInfo(f89478d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C33411f();
            case 4:
                return new C33410e();
            case 5:
                return f89478d;
            case 6:
                C63010eb ebVar = f89479e;
                if (ebVar == null) {
                    synchronized (C33411f.class) {
                        ebVar = f89479e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f89478d);
                            f89479e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
