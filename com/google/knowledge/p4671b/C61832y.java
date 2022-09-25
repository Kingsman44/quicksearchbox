package com.google.knowledge.p4671b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.knowledge.b.y */
/* compiled from: PG */
public final class C61832y extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C61832y f167087d;

    /* renamed from: e */
    private static volatile C63010eb f167088e;

    /* renamed from: a */
    public int f167089a;

    /* renamed from: b */
    public int f167090b;

    /* renamed from: c */
    public boolean f167091c;

    static {
        C61832y yVar = new C61832y();
        f167087d = yVar;
        C62942bv.registerDefaultInstance(C61832y.class, yVar);
    }

    private C61832y() {
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
                return newMessageInfo(f167087d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C61830w.f167086a, C45240c.f118157a});
            case 3:
                return new C61832y();
            case 4:
                return new C61829v();
            case 5:
                return f167087d;
            case 6:
                C63010eb ebVar = f167088e;
                if (ebVar == null) {
                    synchronized (C61832y.class) {
                        ebVar = f167088e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167087d);
                            f167088e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
