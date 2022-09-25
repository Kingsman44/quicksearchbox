package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.cg */
/* compiled from: PG */
public final class C54868cg extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54868cg f144139c;

    /* renamed from: d */
    private static volatile C63010eb f144140d;

    /* renamed from: a */
    public int f144141a;

    /* renamed from: b */
    public float f144142b;

    static {
        C54868cg cgVar = new C54868cg();
        f144139c = cgVar;
        C62942bv.registerDefaultInstance(C54868cg.class, cgVar);
    }

    private C54868cg() {
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
                return newMessageInfo(f144139c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C54868cg();
            case 4:
                return new C54867cf();
            case 5:
                return f144139c;
            case 6:
                C63010eb ebVar = f144140d;
                if (ebVar == null) {
                    synchronized (C54868cg.class) {
                        ebVar = f144140d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144139c);
                            f144140d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
