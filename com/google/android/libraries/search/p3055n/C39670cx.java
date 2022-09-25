package com.google.android.libraries.search.p3055n;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.n.cx */
/* compiled from: PG */
public final class C39670cx extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C39670cx f104424a;

    /* renamed from: c */
    private static volatile C63010eb f104425c;

    /* renamed from: b */
    private byte f104426b = 2;

    static {
        C39670cx cxVar = new C39670cx();
        f104424a = cxVar;
        C62942bv.registerDefaultInstance(C39670cx.class, cxVar);
    }

    private C39670cx() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f104426b);
            case 1:
                this.f104426b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f104424a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C39670cx();
            case 4:
                return new C39669cw();
            case 5:
                return f104424a;
            case 6:
                C63010eb ebVar = f104425c;
                if (ebVar == null) {
                    synchronized (C39670cx.class) {
                        ebVar = f104425c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f104424a);
                            f104425c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
