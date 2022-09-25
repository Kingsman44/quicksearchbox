package com.google.android.apps.search.googleapp.p10370p;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.p.bb */
/* compiled from: PG */
public final class C136862bb extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C136862bb f372511d;

    /* renamed from: e */
    private static volatile C63010eb f372512e;

    /* renamed from: a */
    public int f372513a;

    /* renamed from: b */
    public int f372514b;

    /* renamed from: c */
    public C62961ch f372515c = emptyIntList();

    static {
        C136862bb bbVar = new C136862bb();
        f372511d = bbVar;
        C62942bv.registerDefaultInstance(C136862bb.class, bbVar);
    }

    private C136862bb() {
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
                return newMessageInfo(f372511d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0018", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C136862bb();
            case 4:
                return new C136861ba();
            case 5:
                return f372511d;
            case 6:
                C63010eb ebVar = f372512e;
                if (ebVar == null) {
                    synchronized (C136862bb.class) {
                        ebVar = f372512e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f372511d);
                            f372512e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
