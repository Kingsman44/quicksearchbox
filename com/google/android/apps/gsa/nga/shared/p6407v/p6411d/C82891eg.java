package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.eg */
/* compiled from: PG */
public final class C82891eg extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C82891eg f226106b;

    /* renamed from: d */
    private static volatile C63010eb f226107d;

    /* renamed from: a */
    public C62971cq f226108a = emptyProtobufList();

    /* renamed from: c */
    private byte f226109c = 2;

    static {
        C82891eg egVar = new C82891eg();
        f226106b = egVar;
        C62942bv.registerDefaultInstance(C82891eg.class, egVar);
    }

    private C82891eg() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f226109c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f226109c = b;
                return null;
            case 2:
                return newMessageInfo(f226106b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C82889ee.class});
            case 3:
                return new C82891eg();
            case 4:
                return new C82890ef();
            case 5:
                return f226106b;
            case 6:
                C63010eb ebVar = f226107d;
                if (ebVar == null) {
                    synchronized (C82891eg.class) {
                        ebVar = f226107d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f226106b);
                            f226107d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
