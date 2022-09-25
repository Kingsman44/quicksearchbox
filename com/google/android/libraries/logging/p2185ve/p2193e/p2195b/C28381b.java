package com.google.android.libraries.logging.p2185ve.p2193e.p2195b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.logging.ve.e.b.b */
/* compiled from: PG */
public final class C28381b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C28381b f77118c;

    /* renamed from: d */
    private static volatile C63010eb f77119d;

    /* renamed from: a */
    public int f77120a;

    /* renamed from: b */
    public long f77121b;

    static {
        C28381b bVar = new C28381b();
        f77118c = bVar;
        C62942bv.registerDefaultInstance(C28381b.class, bVar);
    }

    private C28381b() {
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
                return newMessageInfo(f77118c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C28381b();
            case 4:
                return new C28364a();
            case 5:
                return f77118c;
            case 6:
                C63010eb ebVar = f77119d;
                if (ebVar == null) {
                    synchronized (C28381b.class) {
                        ebVar = f77119d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f77118c);
                            f77119d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
