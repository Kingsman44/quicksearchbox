package com.google.p4152bb.p4153a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4653i.p4654a.C61702l;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.ap */
/* compiled from: PG */
public final class C54958ap extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C54958ap f144573a;

    /* renamed from: e */
    private static volatile C63010eb f144574e;

    /* renamed from: b */
    private int f144575b;

    /* renamed from: c */
    private C61702l f144576c;

    /* renamed from: d */
    private byte f144577d = 2;

    static {
        C54958ap apVar = new C54958ap();
        f144573a = apVar;
        C62942bv.registerDefaultInstance(C54958ap.class, apVar);
    }

    private C54958ap() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f144577d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f144577d = b;
                return null;
            case 2:
                return newMessageInfo(f144573a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C54958ap();
            case 4:
                return new C54957ao();
            case 5:
                return f144573a;
            case 6:
                C63010eb ebVar = f144574e;
                if (ebVar == null) {
                    synchronized (C54958ap.class) {
                        ebVar = f144574e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144573a);
                            f144574e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
