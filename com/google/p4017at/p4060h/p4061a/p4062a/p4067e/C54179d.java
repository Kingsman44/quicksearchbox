package com.google.p4017at.p4060h.p4061a.p4062a.p4067e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.at.h.a.a.e.d */
/* compiled from: PG */
public final class C54179d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54179d f142190b;

    /* renamed from: e */
    private static volatile C63010eb f142191e;

    /* renamed from: a */
    public C63088z f142192a = C63088z.f170246b;

    /* renamed from: c */
    private int f142193c;

    /* renamed from: d */
    private byte f142194d = 2;

    static {
        C54179d dVar = new C54179d();
        f142190b = dVar;
        C62942bv.registerDefaultInstance(C54179d.class, dVar);
    }

    private C54179d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f142194d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f142194d = b;
                return null;
            case 2:
                return newMessageInfo(f142190b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C54179d();
            case 4:
                return new C54178c();
            case 5:
                return f142190b;
            case 6:
                C63010eb ebVar = f142191e;
                if (ebVar == null) {
                    synchronized (C54179d.class) {
                        ebVar = f142191e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142190b);
                            f142191e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
