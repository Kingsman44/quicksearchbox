package com.google.android.apps.gsa.search.shared.service.p6936c.p6938b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.c.b.z */
/* compiled from: PG */
public final class C88476z extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88476z f239182c;

    /* renamed from: d */
    private static volatile C63010eb f239183d;

    /* renamed from: a */
    public int f239184a;

    /* renamed from: b */
    public boolean f239185b;

    static {
        C88476z zVar = new C88476z();
        f239182c = zVar;
        C62942bv.registerDefaultInstance(C88476z.class, zVar);
    }

    private C88476z() {
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
                return newMessageInfo(f239182c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C88476z();
            case 4:
                return new C88475y();
            case 5:
                return f239182c;
            case 6:
                C63010eb ebVar = f239183d;
                if (ebVar == null) {
                    synchronized (C88476z.class) {
                        ebVar = f239183d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f239182c);
                            f239183d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
