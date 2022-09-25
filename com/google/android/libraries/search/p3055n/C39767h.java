package com.google.android.libraries.search.p3055n;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.n.h */
/* compiled from: PG */
public final class C39767h extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C39767h f104595d;

    /* renamed from: e */
    private static volatile C63010eb f104596e;

    /* renamed from: a */
    public int f104597a;

    /* renamed from: b */
    public C39274ax f104598b;

    /* renamed from: c */
    public C39357bf f104599c;

    static {
        C39767h hVar = new C39767h();
        f104595d = hVar;
        C62942bv.registerDefaultInstance(C39767h.class, hVar);
    }

    private C39767h() {
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
                return newMessageInfo(f104595d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C39767h();
            case 4:
                return new C39713g();
            case 5:
                return f104595d;
            case 6:
                C63010eb ebVar = f104596e;
                if (ebVar == null) {
                    synchronized (C39767h.class) {
                        ebVar = f104596e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f104595d);
                            f104596e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
