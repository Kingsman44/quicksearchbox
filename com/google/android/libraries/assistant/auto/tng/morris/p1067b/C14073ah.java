package com.google.android.libraries.assistant.auto.tng.morris.p1067b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.b.ah */
/* compiled from: PG */
public final class C14073ah extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C14073ah f42721c;

    /* renamed from: d */
    private static volatile C63010eb f42722d;

    /* renamed from: a */
    public int f42723a;

    /* renamed from: b */
    public C63042fg f42724b;

    static {
        C14073ah ahVar = new C14073ah();
        f42721c = ahVar;
        C62942bv.registerDefaultInstance(C14073ah.class, ahVar);
    }

    private C14073ah() {
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
                return newMessageInfo(f42721c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C14073ah();
            case 4:
                return new C14072ag();
            case 5:
                return f42721c;
            case 6:
                C63010eb ebVar = f42722d;
                if (ebVar == null) {
                    synchronized (C14073ah.class) {
                        ebVar = f42722d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f42721c);
                            f42722d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
