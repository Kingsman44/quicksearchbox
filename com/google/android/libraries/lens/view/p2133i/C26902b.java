package com.google.android.libraries.lens.view.p2133i;

import com.google.lens.p4707j.C62586t;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.i.b */
/* compiled from: PG */
public final class C26902b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C26902b f73332c;

    /* renamed from: d */
    private static volatile C63010eb f73333d;

    /* renamed from: a */
    public C62586t f73334a;

    /* renamed from: b */
    public boolean f73335b;

    static {
        C26902b bVar = new C26902b();
        f73332c = bVar;
        C62942bv.registerDefaultInstance(C26902b.class, bVar);
    }

    private C26902b() {
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
                return newMessageInfo(f73332c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u0007", new Object[]{"a", "b"});
            case 3:
                return new C26902b();
            case 4:
                return new C26895a();
            case 5:
                return f73332c;
            case 6:
                C63010eb ebVar = f73333d;
                if (ebVar == null) {
                    synchronized (C26902b.class) {
                        ebVar = f73333d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f73332c);
                            f73333d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
