package com.google.android.libraries.search.p2998g.p2999a.p3001b.p3002a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.g.a.b.a.c */
/* compiled from: PG */
public final class C38348c extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C38348c f101533a;

    /* renamed from: c */
    private static volatile C63010eb f101534c;

    /* renamed from: b */
    private byte f101535b = 2;

    static {
        C38348c cVar = new C38348c();
        f101533a = cVar;
        C62942bv.registerDefaultInstance(C38348c.class, cVar);
    }

    private C38348c() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f101535b);
            case 1:
                this.f101535b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f101533a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C38348c();
            case 4:
                return new C38347b();
            case 5:
                return f101533a;
            case 6:
                C63010eb ebVar = f101534c;
                if (ebVar == null) {
                    synchronized (C38348c.class) {
                        ebVar = f101534c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f101533a);
                            f101534c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
