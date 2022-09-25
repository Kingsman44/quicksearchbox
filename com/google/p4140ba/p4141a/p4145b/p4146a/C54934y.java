package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.y */
/* compiled from: PG */
public final class C54934y extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54934y f144423d;

    /* renamed from: e */
    private static volatile C63010eb f144424e;

    /* renamed from: a */
    public int f144425a;

    /* renamed from: b */
    public float f144426b;

    /* renamed from: c */
    public float f144427c;

    static {
        C54934y yVar = new C54934y();
        f144423d = yVar;
        C62942bv.registerDefaultInstance(C54934y.class, yVar);
    }

    private C54934y() {
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
                return newMessageInfo(f144423d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C54934y();
            case 4:
                return new C54933x();
            case 5:
                return f144423d;
            case 6:
                C63010eb ebVar = f144424e;
                if (ebVar == null) {
                    synchronized (C54934y.class) {
                        ebVar = f144424e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144423d);
                            f144424e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
