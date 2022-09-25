package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.eb */
/* compiled from: PG */
public final class C80754eb extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80754eb f221656c;

    /* renamed from: d */
    private static volatile C63010eb f221657d;

    /* renamed from: a */
    public int f221658a;

    /* renamed from: b */
    public long f221659b;

    static {
        C80754eb ebVar = new C80754eb();
        f221656c = ebVar;
        C62942bv.registerDefaultInstance(C80754eb.class, ebVar);
    }

    private C80754eb() {
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
                return newMessageInfo(f221656c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0002", new Object[]{"a", "b"});
            case 3:
                return new C80754eb();
            case 4:
                return new C80753ea();
            case 5:
                return f221656c;
            case 6:
                C63010eb ebVar = f221657d;
                if (ebVar == null) {
                    synchronized (C80754eb.class) {
                        ebVar = f221657d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221656c);
                            f221657d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
