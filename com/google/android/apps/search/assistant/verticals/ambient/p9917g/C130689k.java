package com.google.android.apps.search.assistant.verticals.ambient.p9917g;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.g.k */
/* compiled from: PG */
public final class C130689k extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C130689k f357854c;

    /* renamed from: d */
    private static volatile C63010eb f357855d;

    /* renamed from: a */
    public int f357856a;

    /* renamed from: b */
    public boolean f357857b;

    static {
        C130689k kVar = new C130689k();
        f357854c = kVar;
        C62942bv.registerDefaultInstance(C130689k.class, kVar);
    }

    private C130689k() {
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
                return newMessageInfo(f357854c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C130689k();
            case 4:
                return new C130688j();
            case 5:
                return f357854c;
            case 6:
                C63010eb ebVar = f357855d;
                if (ebVar == null) {
                    synchronized (C130689k.class) {
                        ebVar = f357855d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f357854c);
                            f357855d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
