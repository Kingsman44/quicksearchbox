package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.so */
/* compiled from: PG */
public final class C52460so extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52460so f137714d;

    /* renamed from: e */
    private static volatile C63010eb f137715e;

    /* renamed from: a */
    public int f137716a;

    /* renamed from: b */
    public long f137717b;

    /* renamed from: c */
    public int f137718c;

    static {
        C52460so soVar = new C52460so();
        f137714d = soVar;
        C62942bv.registerDefaultInstance(C52460so.class, soVar);
    }

    private C52460so() {
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
                return newMessageInfo(f137714d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C52460so();
            case 4:
                return new C52459sn();
            case 5:
                return f137714d;
            case 6:
                C63010eb ebVar = f137715e;
                if (ebVar == null) {
                    synchronized (C52460so.class) {
                        ebVar = f137715e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137714d);
                            f137715e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
