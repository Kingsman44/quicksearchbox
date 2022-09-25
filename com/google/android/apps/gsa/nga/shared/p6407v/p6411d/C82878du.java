package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.du */
/* compiled from: PG */
public final class C82878du extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C82878du f225968a;

    /* renamed from: b */
    private static volatile C63010eb f225969b;

    static {
        C82878du duVar = new C82878du();
        f225968a = duVar;
        C62942bv.registerDefaultInstance(C82878du.class, duVar);
    }

    private C82878du() {
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
                return newMessageInfo(f225968a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C82878du();
            case 4:
                return new C82877dt();
            case 5:
                return f225968a;
            case 6:
                C63010eb ebVar = f225969b;
                if (ebVar == null) {
                    synchronized (C82878du.class) {
                        ebVar = f225969b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f225968a);
                            f225969b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
