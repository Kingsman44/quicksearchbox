package com.google.android.p10712d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.b */
/* compiled from: PG */
public final class C142321b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C142321b f386110a;

    /* renamed from: b */
    private static volatile C63010eb f386111b;

    static {
        C142321b bVar = new C142321b();
        f386110a = bVar;
        C62942bv.registerDefaultInstance(C142321b.class, bVar);
    }

    private C142321b() {
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
                return newMessageInfo(f386110a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C142321b();
            case 4:
                return new C142294a();
            case 5:
                return f386110a;
            case 6:
                C63010eb ebVar = f386111b;
                if (ebVar == null) {
                    synchronized (C142321b.class) {
                        ebVar = f386111b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386110a);
                            f386111b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
