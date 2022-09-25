package com.google.lens.p4707j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.az */
/* compiled from: PG */
public final class C62422az extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62422az f168500d;

    /* renamed from: e */
    private static volatile C63010eb f168501e;

    /* renamed from: a */
    public int f168502a;

    /* renamed from: b */
    public int f168503b;

    /* renamed from: c */
    public int f168504c;

    static {
        C62422az azVar = new C62422az();
        f168500d = azVar;
        C62942bv.registerDefaultInstance(C62422az.class, azVar);
    }

    private C62422az() {
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
                return newMessageInfo(f168500d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C62428be.f168520a, C45240c.f118157a, C62421ay.f168499a});
            case 3:
                return new C62422az();
            case 4:
                return new C62420ax();
            case 5:
                return f168500d;
            case 6:
                C63010eb ebVar = f168501e;
                if (ebVar == null) {
                    synchronized (C62422az.class) {
                        ebVar = f168501e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168500d);
                            f168501e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
