package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.dc */
/* compiled from: PG */
public final class C54891dc extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C54891dc f144227e;

    /* renamed from: f */
    private static volatile C63010eb f144228f;

    /* renamed from: a */
    public int f144229a;

    /* renamed from: b */
    public float f144230b;

    /* renamed from: c */
    public float f144231c;

    /* renamed from: d */
    public float f144232d;

    static {
        C54891dc dcVar = new C54891dc();
        f144227e = dcVar;
        C62942bv.registerDefaultInstance(C54891dc.class, dcVar);
    }

    private C54891dc() {
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
                return newMessageInfo(f144227e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C54891dc();
            case 4:
                return new C54890db();
            case 5:
                return f144227e;
            case 6:
                C63010eb ebVar = f144228f;
                if (ebVar == null) {
                    synchronized (C54891dc.class) {
                        ebVar = f144228f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144227e);
                            f144228f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
