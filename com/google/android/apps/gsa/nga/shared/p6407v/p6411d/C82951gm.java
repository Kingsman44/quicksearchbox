package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.common.p4552o.agz;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.gm */
/* compiled from: PG */
public final class C82951gm extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C82951gm f226316c;

    /* renamed from: d */
    private static volatile C63010eb f226317d;

    /* renamed from: a */
    public int f226318a;

    /* renamed from: b */
    public agz f226319b;

    static {
        C82951gm gmVar = new C82951gm();
        f226316c = gmVar;
        C62942bv.registerDefaultInstance(C82951gm.class, gmVar);
    }

    private C82951gm() {
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
                return newMessageInfo(f226316c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C82951gm();
            case 4:
                return new C82950gl();
            case 5:
                return f226316c;
            case 6:
                C63010eb ebVar = f226317d;
                if (ebVar == null) {
                    synchronized (C82951gm.class) {
                        ebVar = f226317d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f226316c);
                            f226317d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
