package com.google.assistant.p3803ag.p3809c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.gh */
/* compiled from: PG */
public final class C49096gh extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C49096gh f126964d;

    /* renamed from: f */
    private static volatile C63010eb f126965f;

    /* renamed from: a */
    public int f126966a;

    /* renamed from: b */
    public int f126967b;

    /* renamed from: c */
    public int f126968c;

    /* renamed from: e */
    private int f126969e;

    static {
        C49096gh ghVar = new C49096gh();
        f126964d = ghVar;
        C62942bv.registerDefaultInstance(C49096gh.class, ghVar);
    }

    private C49096gh() {
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
                return newMessageInfo(f126964d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0002\u0003င\u0001", new Object[]{"e", "a", C45240c.f118157a, "b"});
            case 3:
                return new C49096gh();
            case 4:
                return new C49095gg();
            case 5:
                return f126964d;
            case 6:
                C63010eb ebVar = f126965f;
                if (ebVar == null) {
                    synchronized (C49096gh.class) {
                        ebVar = f126965f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126964d);
                            f126965f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
