package com.google.android.libraries.searchbox.shared.suggestion;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.searchbox.shared.suggestion.m */
/* compiled from: PG */
public final class C41687m extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C41687m f109037b;

    /* renamed from: d */
    private static volatile C63010eb f109038d;

    /* renamed from: a */
    public boolean f109039a;

    /* renamed from: c */
    private int f109040c;

    static {
        C41687m mVar = new C41687m();
        f109037b = mVar;
        C62942bv.registerDefaultInstance(C41687m.class, mVar);
    }

    private C41687m() {
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
                return newMessageInfo(f109037b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C41687m();
            case 4:
                return new C41686l();
            case 5:
                return f109037b;
            case 6:
                C63010eb ebVar = f109038d;
                if (ebVar == null) {
                    synchronized (C41687m.class) {
                        ebVar = f109038d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f109037b);
                            f109038d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
