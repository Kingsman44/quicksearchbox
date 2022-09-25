package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.me */
/* compiled from: PG */
public final class C50144me extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50144me f130361d;

    /* renamed from: e */
    private static volatile C63010eb f130362e;

    /* renamed from: a */
    public int f130363a;

    /* renamed from: b */
    public C50142mc f130364b;

    /* renamed from: c */
    public C50140ma f130365c;

    static {
        C50144me meVar = new C50144me();
        f130361d = meVar;
        C62942bv.registerDefaultInstance(C50144me.class, meVar);
    }

    private C50144me() {
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
                return newMessageInfo(f130361d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C50144me();
            case 4:
                return new C50143md();
            case 5:
                return f130361d;
            case 6:
                C63010eb ebVar = f130362e;
                if (ebVar == null) {
                    synchronized (C50144me.class) {
                        ebVar = f130362e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130361d);
                            f130362e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
