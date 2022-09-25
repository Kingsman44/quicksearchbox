package com.google.fcp.client.http;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.fcp.client.http.v */
/* compiled from: PG */
public final class C61113v extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C61113v f165432c;

    /* renamed from: d */
    private static volatile C63010eb f165433d;

    /* renamed from: a */
    public long f165434a;

    /* renamed from: b */
    public long f165435b;

    static {
        C61113v vVar = new C61113v();
        f165432c = vVar;
        C62942bv.registerDefaultInstance(C61113v.class, vVar);
    }

    private C61113v() {
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
                return newMessageInfo(f165432c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", new Object[]{"a", "b"});
            case 3:
                return new C61113v();
            case 4:
                return new C61112u();
            case 5:
                return f165432c;
            case 6:
                C63010eb ebVar = f165433d;
                if (ebVar == null) {
                    synchronized (C61113v.class) {
                        ebVar = f165433d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f165432c);
                            f165433d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
