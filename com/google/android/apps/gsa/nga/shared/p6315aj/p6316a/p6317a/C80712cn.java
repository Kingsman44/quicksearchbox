package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.cn */
/* compiled from: PG */
public final class C80712cn extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80712cn f221586c;

    /* renamed from: d */
    private static volatile C63010eb f221587d;

    /* renamed from: a */
    public int f221588a;

    /* renamed from: b */
    public boolean f221589b;

    static {
        C80712cn cnVar = new C80712cn();
        f221586c = cnVar;
        C62942bv.registerDefaultInstance(C80712cn.class, cnVar);
    }

    private C80712cn() {
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
                return newMessageInfo(f221586c, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C80712cn();
            case 4:
                return new C80711cm();
            case 5:
                return f221586c;
            case 6:
                C63010eb ebVar = f221587d;
                if (ebVar == null) {
                    synchronized (C80712cn.class) {
                        ebVar = f221587d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221586c);
                            f221587d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
