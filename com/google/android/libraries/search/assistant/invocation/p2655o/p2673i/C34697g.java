package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.g */
/* compiled from: PG */
public final class C34697g extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C34697g f92115a;

    /* renamed from: c */
    private static volatile C63010eb f92116c;

    /* renamed from: b */
    private byte f92117b = 2;

    static {
        C34697g gVar = new C34697g();
        f92115a = gVar;
        C62942bv.registerDefaultInstance(C34697g.class, gVar);
    }

    private C34697g() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f92117b);
            case 1:
                this.f92117b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f92115a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C34697g();
            case 4:
                return new C34696f();
            case 5:
                return f92115a;
            case 6:
                C63010eb ebVar = f92116c;
                if (ebVar == null) {
                    synchronized (C34697g.class) {
                        ebVar = f92116c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f92115a);
                            f92116c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
