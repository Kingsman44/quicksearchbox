package com.google.protos.p4874ap.p4875a.p4876a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ap.a.a.o */
/* compiled from: PG */
public final class C63676o extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63676o f172173c;

    /* renamed from: d */
    private static volatile C63010eb f172174d;

    /* renamed from: a */
    public int f172175a;

    /* renamed from: b */
    public long f172176b = 104857600;

    static {
        C63676o oVar = new C63676o();
        f172173c = oVar;
        C62942bv.registerDefaultInstance(C63676o.class, oVar);
    }

    private C63676o() {
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
                return newMessageInfo(f172173c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C63676o();
            case 4:
                return new C63675n();
            case 5:
                return f172173c;
            case 6:
                C63010eb ebVar = f172174d;
                if (ebVar == null) {
                    synchronized (C63676o.class) {
                        ebVar = f172174d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172173c);
                            f172174d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
