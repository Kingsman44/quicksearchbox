package com.google.android.apps.p471d.p472a.p473a.p474a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.d.a.a.a.h */
/* compiled from: PG */
public final class C9026h extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C9026h f31165b;

    /* renamed from: c */
    private static volatile C63010eb f31166c;

    /* renamed from: a */
    public C9025g f31167a;

    static {
        C9026h hVar = new C9026h();
        f31165b = hVar;
        C62942bv.registerDefaultInstance(C9026h.class, hVar);
    }

    private C9026h() {
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
                return newMessageInfo(f31165b, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0000\u0000\u0003\t", new Object[]{"a"});
            case 3:
                return new C9026h();
            case 4:
                return new C9019a();
            case 5:
                return f31165b;
            case 6:
                C63010eb ebVar = f31166c;
                if (ebVar == null) {
                    synchronized (C9026h.class) {
                        ebVar = f31166c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31165b);
                            f31166c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
