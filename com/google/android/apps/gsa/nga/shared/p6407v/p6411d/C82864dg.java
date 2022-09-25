package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.common.p4552o.aew;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.dg */
/* compiled from: PG */
public final class C82864dg extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C82864dg f225947c;

    /* renamed from: d */
    private static volatile C63010eb f225948d;

    /* renamed from: a */
    public int f225949a;

    /* renamed from: b */
    public aew f225950b;

    static {
        C82864dg dgVar = new C82864dg();
        f225947c = dgVar;
        C62942bv.registerDefaultInstance(C82864dg.class, dgVar);
    }

    private C82864dg() {
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
                return newMessageInfo(f225947c, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C82864dg();
            case 4:
                return new C82863df();
            case 5:
                return f225947c;
            case 6:
                C63010eb ebVar = f225948d;
                if (ebVar == null) {
                    synchronized (C82864dg.class) {
                        ebVar = f225948d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f225947c);
                            f225948d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
