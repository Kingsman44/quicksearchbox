package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.bw */
/* compiled from: PG */
public final class C54857bw extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C54857bw f144092e;

    /* renamed from: f */
    private static volatile C63010eb f144093f;

    /* renamed from: a */
    public int f144094a;

    /* renamed from: b */
    public float f144095b = 1.0f;

    /* renamed from: c */
    public float f144096c = 1.0f;

    /* renamed from: d */
    public float f144097d;

    static {
        C54857bw bwVar = new C54857bw();
        f144092e = bwVar;
        C62942bv.registerDefaultInstance(C54857bw.class, bwVar);
    }

    private C54857bw() {
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
                return newMessageInfo(f144092e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C54857bw();
            case 4:
                return new C54856bv();
            case 5:
                return f144092e;
            case 6:
                C63010eb ebVar = f144093f;
                if (ebVar == null) {
                    synchronized (C54857bw.class) {
                        ebVar = f144093f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144092e);
                            f144093f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
