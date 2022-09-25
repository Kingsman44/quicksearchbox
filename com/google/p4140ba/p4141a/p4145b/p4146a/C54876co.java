package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62960cg;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.co */
/* compiled from: PG */
public final class C54876co extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54876co f144164d;

    /* renamed from: e */
    private static volatile C63010eb f144165e;

    /* renamed from: a */
    public C62960cg f144166a = emptyFloatList();

    /* renamed from: b */
    public C62960cg f144167b = emptyFloatList();

    /* renamed from: c */
    public C62961ch f144168c = emptyIntList();

    static {
        C54876co coVar = new C54876co();
        f144164d = coVar;
        C62942bv.registerDefaultInstance(C54876co.class, coVar);
    }

    private C54876co() {
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
                return newMessageInfo(f144164d, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u0013\u0002\u0013\u0003\u0016", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C54876co();
            case 4:
                return new C54875cn();
            case 5:
                return f144164d;
            case 6:
                C63010eb ebVar = f144165e;
                if (ebVar == null) {
                    synchronized (C54876co.class) {
                        ebVar = f144165e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144164d);
                            f144165e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
