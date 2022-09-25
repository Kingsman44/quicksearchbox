package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.b.a.bz */
/* compiled from: PG */
public final class C56272bz extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56272bz f149968a;

    /* renamed from: b */
    private static volatile C63010eb f149969b;

    static {
        C56272bz bzVar = new C56272bz();
        f149968a = bzVar;
        C62942bv.registerDefaultInstance(C56272bz.class, bzVar);
    }

    private C56272bz() {
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
                return newMessageInfo(f149968a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C56272bz();
            case 4:
                return new C56271by();
            case 5:
                return f149968a;
            case 6:
                C63010eb ebVar = f149969b;
                if (ebVar == null) {
                    synchronized (C56272bz.class) {
                        ebVar = f149969b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149968a);
                            f149969b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
