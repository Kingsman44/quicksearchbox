package com.google.android.libraries.assistant.auto.tng.suggestions.p1263k;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3917i.p3918a.C51452if;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.k.u */
/* compiled from: PG */
public final class C16385u extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C16385u f48225d;

    /* renamed from: e */
    private static volatile C63010eb f48226e;

    /* renamed from: a */
    public int f48227a;

    /* renamed from: b */
    public int f48228b;

    /* renamed from: c */
    public boolean f48229c;

    static {
        C16385u uVar = new C16385u();
        f48225d = uVar;
        C62942bv.registerDefaultInstance(C16385u.class, uVar);
    }

    private C16385u() {
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
                return newMessageInfo(f48225d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C51452if.m86191b(), C45240c.f118157a});
            case 3:
                return new C16385u();
            case 4:
                return new C16384t();
            case 5:
                return f48225d;
            case 6:
                C63010eb ebVar = f48226e;
                if (ebVar == null) {
                    synchronized (C16385u.class) {
                        ebVar = f48226e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48225d);
                            f48226e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
