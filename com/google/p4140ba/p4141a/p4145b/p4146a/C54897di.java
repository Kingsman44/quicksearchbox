package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.di */
/* compiled from: PG */
public final class C54897di extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C54897di f144248e;

    /* renamed from: f */
    private static volatile C63010eb f144249f;

    /* renamed from: a */
    public int f144250a;

    /* renamed from: b */
    public boolean f144251b;

    /* renamed from: c */
    public int f144252c;

    /* renamed from: d */
    public float f144253d;

    static {
        C54897di diVar = new C54897di();
        f144248e = diVar;
        C62942bv.registerDefaultInstance(C54897di.class, diVar);
    }

    private C54897di() {
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
                return newMessageInfo(f144248e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ခ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C54897di();
            case 4:
                return new C54896dh();
            case 5:
                return f144248e;
            case 6:
                C63010eb ebVar = f144249f;
                if (ebVar == null) {
                    synchronized (C54897di.class) {
                        ebVar = f144249f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144248e);
                            f144249f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
