package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.by */
/* compiled from: PG */
public final class C54859by extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54859by f144098d;

    /* renamed from: e */
    private static volatile C63010eb f144099e;

    /* renamed from: a */
    public int f144100a;

    /* renamed from: b */
    public C54857bw f144101b;

    /* renamed from: c */
    public C54857bw f144102c;

    static {
        C54859by byVar = new C54859by();
        f144098d = byVar;
        C62942bv.registerDefaultInstance(C54859by.class, byVar);
    }

    private C54859by() {
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
                return newMessageInfo(f144098d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C54859by();
            case 4:
                return new C54858bx();
            case 5:
                return f144098d;
            case 6:
                C63010eb ebVar = f144099e;
                if (ebVar == null) {
                    synchronized (C54859by.class) {
                        ebVar = f144099e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144098d);
                            f144099e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
