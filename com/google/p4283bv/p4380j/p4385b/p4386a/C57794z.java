package com.google.p4283bv.p4380j.p4385b.p4386a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.bv.j.b.a.z */
/* compiled from: PG */
public final class C57794z extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57794z f154407c;

    /* renamed from: d */
    private static volatile C63010eb f154408d;

    /* renamed from: a */
    public int f154409a;

    /* renamed from: b */
    public C63088z f154410b = C63088z.f170246b;

    static {
        C57794z zVar = new C57794z();
        f154407c = zVar;
        C62942bv.registerDefaultInstance(C57794z.class, zVar);
    }

    private C57794z() {
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
                return newMessageInfo(f154407c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            case 3:
                return new C57794z();
            case 4:
                return new C57793y();
            case 5:
                return f154407c;
            case 6:
                C63010eb ebVar = f154408d;
                if (ebVar == null) {
                    synchronized (C57794z.class) {
                        ebVar = f154408d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154407c);
                            f154408d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
