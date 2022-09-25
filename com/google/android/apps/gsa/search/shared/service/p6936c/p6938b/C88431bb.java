package com.google.android.apps.gsa.search.shared.service.p6936c.p6938b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.c.b.bb */
/* compiled from: PG */
public final class C88431bb extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C88431bb f239082a;

    /* renamed from: e */
    private static volatile C63010eb f239083e;

    /* renamed from: b */
    private int f239084b;

    /* renamed from: c */
    private C88433bd f239085c;

    /* renamed from: d */
    private byte f239086d = 2;

    static {
        C88431bb bbVar = new C88431bb();
        f239082a = bbVar;
        C62942bv.registerDefaultInstance(C88431bb.class, bbVar);
    }

    private C88431bb() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f239086d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f239086d = b;
                return null;
            case 2:
                return newMessageInfo(f239082a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C88431bb();
            case 4:
                return new C88430ba();
            case 5:
                return f239082a;
            case 6:
                C63010eb ebVar = f239083e;
                if (ebVar == null) {
                    synchronized (C88431bb.class) {
                        ebVar = f239083e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f239082a);
                            f239083e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
