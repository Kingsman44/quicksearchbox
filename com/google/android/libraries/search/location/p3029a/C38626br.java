package com.google.android.libraries.search.location.p3029a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.location.a.br */
/* compiled from: PG */
public final class C38626br extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C38626br f102069c;

    /* renamed from: d */
    private static volatile C63010eb f102070d;

    /* renamed from: a */
    public int f102071a;

    /* renamed from: b */
    public int f102072b;

    static {
        C38626br brVar = new C38626br();
        f102069c = brVar;
        C62942bv.registerDefaultInstance(C38626br.class, brVar);
    }

    private C38626br() {
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
                return newMessageInfo(f102069c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C38592al.f102017a});
            case 3:
                return new C38626br();
            case 4:
                return new C38625bq();
            case 5:
                return f102069c;
            case 6:
                C63010eb ebVar = f102070d;
                if (ebVar == null) {
                    synchronized (C38626br.class) {
                        ebVar = f102070d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f102069c);
                            f102070d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
