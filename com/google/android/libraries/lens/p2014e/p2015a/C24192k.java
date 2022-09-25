package com.google.android.libraries.lens.p2014e.p2015a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.e.a.k */
/* compiled from: PG */
public final class C24192k extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C24192k f66120b;

    /* renamed from: c */
    private static volatile C63010eb f66121c;

    /* renamed from: a */
    public C62971cq f66122a = emptyProtobufList();

    static {
        C24192k kVar = new C24192k();
        f66120b = kVar;
        C62942bv.registerDefaultInstance(C24192k.class, kVar);
    }

    private C24192k() {
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
                return newMessageInfo(f66120b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C24197p.class});
            case 3:
                return new C24192k();
            case 4:
                return new C24191j();
            case 5:
                return f66120b;
            case 6:
                C63010eb ebVar = f66121c;
                if (ebVar == null) {
                    synchronized (C24192k.class) {
                        ebVar = f66121c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f66120b);
                            f66121c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
