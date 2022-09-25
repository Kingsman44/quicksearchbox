package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.a.bu */
/* compiled from: PG */
public final class C80326bu extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C80326bu f220419b;

    /* renamed from: c */
    private static volatile C63010eb f220420c;

    /* renamed from: a */
    public C80321bp f220421a;

    static {
        C80326bu buVar = new C80326bu();
        f220419b = buVar;
        C62942bv.registerDefaultInstance(C80326bu.class, buVar);
    }

    private C80326bu() {
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
                return newMessageInfo(f220419b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C80326bu();
            case 4:
                return new C80325bt();
            case 5:
                return f220419b;
            case 6:
                C63010eb ebVar = f220420c;
                if (ebVar == null) {
                    synchronized (C80326bu.class) {
                        ebVar = f220420c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220419b);
                            f220420c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
