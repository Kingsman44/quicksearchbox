package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.ci */
/* compiled from: PG */
public final class C54870ci extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C54870ci f144143f;

    /* renamed from: g */
    private static volatile C63010eb f144144g;

    /* renamed from: a */
    public int f144145a;

    /* renamed from: b */
    public C54868cg f144146b;

    /* renamed from: c */
    public C54868cg f144147c;

    /* renamed from: d */
    public C54868cg f144148d;

    /* renamed from: e */
    public C54868cg f144149e;

    static {
        C54870ci ciVar = new C54870ci();
        f144143f = ciVar;
        C62942bv.registerDefaultInstance(C54870ci.class, ciVar);
    }

    private C54870ci() {
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
                return newMessageInfo(f144143f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C54870ci();
            case 4:
                return new C54869ch();
            case 5:
                return f144143f;
            case 6:
                C63010eb ebVar = f144144g;
                if (ebVar == null) {
                    synchronized (C54870ci.class) {
                        ebVar = f144144g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144143f);
                            f144144g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
