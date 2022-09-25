package com.google.knowledge.p4671b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.knowledge.b.au */
/* compiled from: PG */
public final class C61802au extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C61802au f166944d;

    /* renamed from: e */
    private static volatile C63010eb f166945e;

    /* renamed from: a */
    public int f166946a;

    /* renamed from: b */
    public boolean f166947b;

    /* renamed from: c */
    public boolean f166948c;

    static {
        C61802au auVar = new C61802au();
        f166944d = auVar;
        C62942bv.registerDefaultInstance(C61802au.class, auVar);
    }

    private C61802au() {
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
                return newMessageInfo(f166944d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C61802au();
            case 4:
                return new C61801at();
            case 5:
                return f166944d;
            case 6:
                C63010eb ebVar = f166945e;
                if (ebVar == null) {
                    synchronized (C61802au.class) {
                        ebVar = f166945e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166944d);
                            f166945e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
