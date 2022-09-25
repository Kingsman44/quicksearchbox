package com.google.p4129b.p4136c.p4137a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4129b.p4136c.p4138b.C54754f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

@Deprecated
/* renamed from: com.google.b.c.a.b */
/* compiled from: PG */
public final class C54745b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C54745b f143655a;

    /* renamed from: d */
    private static volatile C63010eb f143656d;

    /* renamed from: b */
    private C54754f f143657b;

    /* renamed from: c */
    private C54754f f143658c;

    static {
        C54745b bVar = new C54745b();
        f143655a = bVar;
        C62942bv.registerDefaultInstance(C54745b.class, bVar);
    }

    private C54745b() {
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
                return newMessageInfo(f143655a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C54745b();
            case 4:
                return new C54744a();
            case 5:
                return f143655a;
            case 6:
                C63010eb ebVar = f143656d;
                if (ebVar == null) {
                    synchronized (C54745b.class) {
                        ebVar = f143656d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143655a);
                            f143656d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
