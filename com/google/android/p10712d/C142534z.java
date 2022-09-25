package com.google.android.p10712d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.z */
/* compiled from: PG */
public final class C142534z extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C142534z f386765a;

    /* renamed from: g */
    private static volatile C63010eb f386766g;

    /* renamed from: b */
    private int f386767b;

    /* renamed from: c */
    private int f386768c;

    /* renamed from: d */
    private int f386769d;

    /* renamed from: e */
    private int f386770e;

    /* renamed from: f */
    private byte f386771f = 2;

    static {
        C142534z zVar = new C142534z();
        f386765a = zVar;
        C62942bv.registerDefaultInstance(C142534z.class, zVar);
    }

    private C142534z() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f386771f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f386771f = b;
                return null;
            case 2:
                return newMessageInfo(f386765a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002", new Object[]{"b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C142534z();
            case 4:
                return new C142533y();
            case 5:
                return f386765a;
            case 6:
                C63010eb ebVar = f386766g;
                if (ebVar == null) {
                    synchronized (C142534z.class) {
                        ebVar = f386766g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386765a);
                            f386766g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
