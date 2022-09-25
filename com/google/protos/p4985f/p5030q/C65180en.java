package com.google.protos.p4985f.p5030q;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.en */
/* compiled from: PG */
public final class C65180en extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65180en f176389b;

    /* renamed from: c */
    private static volatile C63010eb f176390c;

    /* renamed from: a */
    public long f176391a;

    static {
        C65180en enVar = new C65180en();
        f176389b = enVar;
        C62942bv.registerDefaultInstance(C65180en.class, enVar);
    }

    private C65180en() {
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
                return newMessageInfo(f176389b, "\u0000\u0001\u0000\u0000\n\n\u0001\u0000\u0000\u0000\n\u0002", new Object[]{"a"});
            case 3:
                return new C65180en();
            case 4:
                return new C65179em();
            case 5:
                return f176389b;
            case 6:
                C63010eb ebVar = f176390c;
                if (ebVar == null) {
                    synchronized (C65180en.class) {
                        ebVar = f176390c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176389b);
                            f176390c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
