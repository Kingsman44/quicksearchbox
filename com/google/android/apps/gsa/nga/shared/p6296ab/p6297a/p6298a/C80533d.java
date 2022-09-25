package com.google.android.apps.gsa.nga.shared.p6296ab.p6297a.p6298a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.ab.a.a.d */
/* compiled from: PG */
public final class C80533d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C80533d f221073b;

    /* renamed from: c */
    private static volatile C63010eb f221074c;

    /* renamed from: a */
    public C62961ch f221075a = emptyIntList();

    static {
        C80533d dVar = new C80533d();
        f221073b = dVar;
        C62942bv.registerDefaultInstance(C80533d.class, dVar);
    }

    private C80533d() {
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
                return newMessageInfo(f221073b, "\u0001\u0001\u0000\u0000\u0004\u0004\u0001\u0000\u0001\u0000\u0004\u0016", new Object[]{"a"});
            case 3:
                return new C80533d();
            case 4:
                return new C80532c();
            case 5:
                return f221073b;
            case 6:
                C63010eb ebVar = f221074c;
                if (ebVar == null) {
                    synchronized (C80533d.class) {
                        ebVar = f221074c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221073b);
                            f221074c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
