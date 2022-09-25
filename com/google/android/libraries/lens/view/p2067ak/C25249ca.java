package com.google.android.libraries.lens.view.p2067ak;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.ak.ca */
/* compiled from: PG */
public final class C25249ca extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C25249ca f68710b;

    /* renamed from: c */
    private static volatile C63010eb f68711c;

    /* renamed from: a */
    public int f68712a;

    static {
        C25249ca caVar = new C25249ca();
        f68710b = caVar;
        C62942bv.registerDefaultInstance(C25249ca.class, caVar);
    }

    private C25249ca() {
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
                return newMessageInfo(f68710b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
            case 3:
                return new C25249ca();
            case 4:
                return new C25247bz();
            case 5:
                return f68710b;
            case 6:
                C63010eb ebVar = f68711c;
                if (ebVar == null) {
                    synchronized (C25249ca.class) {
                        ebVar = f68711c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f68710b);
                            f68711c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
