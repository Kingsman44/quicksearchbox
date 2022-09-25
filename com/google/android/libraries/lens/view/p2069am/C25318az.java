package com.google.android.libraries.lens.view.p2069am;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.am.az */
/* compiled from: PG */
public final class C25318az extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C25318az f68885b;

    /* renamed from: c */
    private static volatile C63010eb f68886c;

    /* renamed from: a */
    public C25317ay f68887a;

    static {
        C25318az azVar = new C25318az();
        f68885b = azVar;
        C62942bv.registerDefaultInstance(C25318az.class, azVar);
    }

    private C25318az() {
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
                return newMessageInfo(f68885b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C25318az();
            case 4:
                return new C25315aw();
            case 5:
                return f68885b;
            case 6:
                C63010eb ebVar = f68886c;
                if (ebVar == null) {
                    synchronized (C25318az.class) {
                        ebVar = f68886c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f68885b);
                            f68886c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
