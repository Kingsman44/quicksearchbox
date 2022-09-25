package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.m */
/* compiled from: PG */
public final class C54922m extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C54922m f144374e;

    /* renamed from: f */
    private static volatile C63010eb f144375f;

    /* renamed from: a */
    public int f144376a;

    /* renamed from: b */
    public boolean f144377b;

    /* renamed from: c */
    public float f144378c;

    /* renamed from: d */
    public float f144379d;

    static {
        C54922m mVar = new C54922m();
        f144374e = mVar;
        C62942bv.registerDefaultInstance(C54922m.class, mVar);
    }

    private C54922m() {
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
                return newMessageInfo(f144374e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဇ\u0000\u0003ခ\u0001\u0004ခ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C54922m();
            case 4:
                return new C54921l();
            case 5:
                return f144374e;
            case 6:
                C63010eb ebVar = f144375f;
                if (ebVar == null) {
                    synchronized (C54922m.class) {
                        ebVar = f144375f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144374e);
                            f144375f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
