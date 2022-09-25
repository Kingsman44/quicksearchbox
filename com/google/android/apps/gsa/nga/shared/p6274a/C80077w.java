package com.google.android.apps.gsa.nga.shared.p6274a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.a.w */
/* compiled from: PG */
public final class C80077w extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C80077w f219725a;

    /* renamed from: b */
    private static volatile C63010eb f219726b;

    static {
        C80077w wVar = new C80077w();
        f219725a = wVar;
        C62942bv.registerDefaultInstance(C80077w.class, wVar);
    }

    private C80077w() {
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
                return newMessageInfo(f219725a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C80077w();
            case 4:
                return new C80076v();
            case 5:
                return f219725a;
            case 6:
                C63010eb ebVar = f219726b;
                if (ebVar == null) {
                    synchronized (C80077w.class) {
                        ebVar = f219726b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219725a);
                            f219726b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
