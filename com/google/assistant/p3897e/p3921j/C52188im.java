package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.im */
/* compiled from: PG */
public final class C52188im extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52188im f136973d;

    /* renamed from: e */
    private static volatile C63010eb f136974e;

    /* renamed from: a */
    public int f136975a;

    /* renamed from: b */
    public C52159hk f136976b;

    /* renamed from: c */
    public long f136977c;

    static {
        C52188im imVar = new C52188im();
        f136973d = imVar;
        C62942bv.registerDefaultInstance(C52188im.class, imVar);
    }

    private C52188im() {
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
                return newMessageInfo(f136973d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဂ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C52188im();
            case 4:
                return new C52187il();
            case 5:
                return f136973d;
            case 6:
                C63010eb ebVar = f136974e;
                if (ebVar == null) {
                    synchronized (C52188im.class) {
                        ebVar = f136974e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136973d);
                            f136974e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
