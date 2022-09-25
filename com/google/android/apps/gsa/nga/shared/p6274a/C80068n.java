package com.google.android.apps.gsa.nga.shared.p6274a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.a.n */
/* compiled from: PG */
public final class C80068n extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80068n f219712c;

    /* renamed from: d */
    private static volatile C63010eb f219713d;

    /* renamed from: a */
    public int f219714a;

    /* renamed from: b */
    public int f219715b;

    static {
        C80068n nVar = new C80068n();
        f219712c = nVar;
        C62942bv.registerDefaultInstance(C80068n.class, nVar);
    }

    private C80068n() {
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
                return newMessageInfo(f219712c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"a", "b"});
            case 3:
                return new C80068n();
            case 4:
                return new C80067m();
            case 5:
                return f219712c;
            case 6:
                C63010eb ebVar = f219713d;
                if (ebVar == null) {
                    synchronized (C80068n.class) {
                        ebVar = f219713d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219712c);
                            f219713d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
