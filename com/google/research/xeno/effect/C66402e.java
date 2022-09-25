package com.google.research.xeno.effect;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.research.xeno.effect.e */
/* compiled from: PG */
public final class C66402e extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C66402e f180575a;

    /* renamed from: d */
    private static volatile C63010eb f180576d;

    /* renamed from: b */
    private C62995dn f180577b = C62995dn.f170057a;

    /* renamed from: c */
    private byte f180578c = 2;

    static {
        C66402e eVar = new C66402e();
        f180575a = eVar;
        C62942bv.registerDefaultInstance(C66402e.class, eVar);
    }

    private C66402e() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f180578c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f180578c = b;
                return null;
            case 2:
                return newMessageInfo(f180575a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001в", new Object[]{"b", C66401d.f180574a});
            case 3:
                return new C66402e();
            case 4:
                return new C66400c();
            case 5:
                return f180575a;
            case 6:
                C63010eb ebVar = f180576d;
                if (ebVar == null) {
                    synchronized (C66402e.class) {
                        ebVar = f180576d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180575a);
                            f180576d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
