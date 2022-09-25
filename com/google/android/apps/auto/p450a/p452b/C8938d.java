package com.google.android.apps.auto.p450a.p452b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.auto.a.b.d */
/* compiled from: PG */
public final class C8938d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C8938d f30983b;

    /* renamed from: d */
    private static volatile C63010eb f30984d;

    /* renamed from: a */
    public C8940f f30985a;

    /* renamed from: c */
    private int f30986c;

    static {
        C8938d dVar = new C8938d();
        f30983b = dVar;
        C62942bv.registerDefaultInstance(C8938d.class, dVar);
    }

    private C8938d() {
        emptyProtobufList();
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
                return newMessageInfo(f30983b, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဉ\u0003", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C8938d();
            case 4:
                return new C8937c();
            case 5:
                return f30983b;
            case 6:
                C63010eb ebVar = f30984d;
                if (ebVar == null) {
                    synchronized (C8938d.class) {
                        ebVar = f30984d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30983b);
                            f30984d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
