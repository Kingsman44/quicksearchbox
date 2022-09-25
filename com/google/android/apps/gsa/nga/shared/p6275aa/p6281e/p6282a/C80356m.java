package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.a.m */
/* compiled from: PG */
public final class C80356m extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C80356m f220482b;

    /* renamed from: c */
    private static volatile C63010eb f220483c;

    /* renamed from: a */
    public C62961ch f220484a = emptyIntList();

    static {
        C80356m mVar = new C80356m();
        f220482b = mVar;
        C62942bv.registerDefaultInstance(C80356m.class, mVar);
    }

    private C80356m() {
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
                return newMessageInfo(f220482b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001'", new Object[]{"a"});
            case 3:
                return new C80356m();
            case 4:
                return new C80355l();
            case 5:
                return f220482b;
            case 6:
                C63010eb ebVar = f220483c;
                if (ebVar == null) {
                    synchronized (C80356m.class) {
                        ebVar = f220483c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220482b);
                            f220483c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
