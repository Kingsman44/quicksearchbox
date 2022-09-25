package com.google.android.libraries.lens.view.p2067ak;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.ak.bl */
/* compiled from: PG */
public final class C25233bl extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C25233bl f68683b;

    /* renamed from: c */
    private static volatile C63010eb f68684c;

    /* renamed from: a */
    public boolean f68685a;

    static {
        C25233bl blVar = new C25233bl();
        f68683b = blVar;
        C62942bv.registerDefaultInstance(C25233bl.class, blVar);
    }

    private C25233bl() {
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
                return newMessageInfo(f68683b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"a"});
            case 3:
                return new C25233bl();
            case 4:
                return new C25232bk();
            case 5:
                return f68683b;
            case 6:
                C63010eb ebVar = f68684c;
                if (ebVar == null) {
                    synchronized (C25233bl.class) {
                        ebVar = f68684c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f68683b);
                            f68684c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
