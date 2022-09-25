package com.google.android.p10712d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.d.db */
/* compiled from: PG */
public final class C142377db extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C142377db f386340b;

    /* renamed from: e */
    private static volatile C63010eb f386341e;

    /* renamed from: a */
    public C63088z f386342a = C63088z.f170246b;

    /* renamed from: c */
    private int f386343c;

    /* renamed from: d */
    private byte f386344d = 2;

    static {
        C142377db dbVar = new C142377db();
        f386340b = dbVar;
        C62942bv.registerDefaultInstance(C142377db.class, dbVar);
    }

    private C142377db() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f386344d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f386344d = b;
                return null;
            case 2:
                return newMessageInfo(f386340b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔊ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C142377db();
            case 4:
                return new C142376da();
            case 5:
                return f386340b;
            case 6:
                C63010eb ebVar = f386341e;
                if (ebVar == null) {
                    synchronized (C142377db.class) {
                        ebVar = f386341e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386340b);
                            f386341e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
