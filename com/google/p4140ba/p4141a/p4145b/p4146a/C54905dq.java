package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.dq */
/* compiled from: PG */
public final class C54905dq extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C54905dq f144296e;

    /* renamed from: f */
    private static volatile C63010eb f144297f;

    /* renamed from: a */
    public int f144298a;

    /* renamed from: b */
    public float f144299b;

    /* renamed from: c */
    public float f144300c;

    /* renamed from: d */
    public float f144301d;

    static {
        C54905dq dqVar = new C54905dq();
        f144296e = dqVar;
        C62942bv.registerDefaultInstance(C54905dq.class, dqVar);
    }

    private C54905dq() {
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
                return newMessageInfo(f144296e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C54905dq();
            case 4:
                return new C54904dp();
            case 5:
                return f144296e;
            case 6:
                C63010eb ebVar = f144297f;
                if (ebVar == null) {
                    synchronized (C54905dq.class) {
                        ebVar = f144297f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144296e);
                            f144297f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
