package com.google.p4280bt;

import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bt.b */
/* compiled from: PG */
public final class C56486b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56486b f150873b;

    /* renamed from: c */
    private static volatile C63010eb f150874c;

    /* renamed from: a */
    public C62910ar f150875a;

    static {
        C56486b bVar = new C56486b();
        f150873b = bVar;
        C62942bv.registerDefaultInstance(C56486b.class, bVar);
    }

    private C56486b() {
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
                return newMessageInfo(f150873b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C56486b();
            case 4:
                return new C56485a();
            case 5:
                return f150873b;
            case 6:
                C63010eb ebVar = f150874c;
                if (ebVar == null) {
                    synchronized (C56486b.class) {
                        ebVar = f150874c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150873b);
                            f150874c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
