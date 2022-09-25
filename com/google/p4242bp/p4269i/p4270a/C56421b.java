package com.google.p4242bp.p4269i.p4270a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.i.a.b */
/* compiled from: PG */
public final class C56421b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56421b f150530a;

    /* renamed from: b */
    private static volatile C63010eb f150531b;

    static {
        C56421b bVar = new C56421b();
        f150530a = bVar;
        C62942bv.registerDefaultInstance(C56421b.class, bVar);
    }

    private C56421b() {
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
                return newMessageInfo(f150530a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C56421b();
            case 4:
                return new C56420a();
            case 5:
                return f150530a;
            case 6:
                C63010eb ebVar = f150531b;
                if (ebVar == null) {
                    synchronized (C56421b.class) {
                        ebVar = f150531b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150530a);
                            f150531b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
