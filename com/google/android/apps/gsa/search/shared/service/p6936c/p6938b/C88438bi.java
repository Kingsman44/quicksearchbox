package com.google.android.apps.gsa.search.shared.service.p6936c.p6938b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.c.b.bi */
/* compiled from: PG */
public final class C88438bi extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88438bi f239100c;

    /* renamed from: d */
    private static volatile C63010eb f239101d;

    /* renamed from: a */
    public int f239102a;

    /* renamed from: b */
    public int f239103b;

    static {
        C88438bi biVar = new C88438bi();
        f239100c = biVar;
        C62942bv.registerDefaultInstance(C88438bi.class, biVar);
    }

    private C88438bi() {
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
                return newMessageInfo(f239100c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C88439bj.f239104a});
            case 3:
                return new C88438bi();
            case 4:
                return new C88437bh();
            case 5:
                return f239100c;
            case 6:
                C63010eb ebVar = f239101d;
                if (ebVar == null) {
                    synchronized (C88438bi.class) {
                        ebVar = f239101d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f239100c);
                            f239101d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
