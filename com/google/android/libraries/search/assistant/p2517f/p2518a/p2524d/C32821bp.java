package com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.f.a.d.bp */
/* compiled from: PG */
public final class C32821bp extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C32821bp f88014d;

    /* renamed from: f */
    private static volatile C63010eb f88015f;

    /* renamed from: a */
    public C32801aw f88016a;

    /* renamed from: b */
    public int f88017b;

    /* renamed from: c */
    public C62910ar f88018c;

    /* renamed from: e */
    private byte f88019e = 2;

    static {
        C32821bp bpVar = new C32821bp();
        f88014d = bpVar;
        C62942bv.registerDefaultInstance(C32821bp.class, bpVar);
    }

    private C32821bp() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f88019e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f88019e = b;
                return null;
            case 2:
                return newMessageInfo(f88014d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0001\u0001Љ\u0002\f\u0003\t", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C32821bp();
            case 4:
                return new C32819bn();
            case 5:
                return f88014d;
            case 6:
                C63010eb ebVar = f88015f;
                if (ebVar == null) {
                    synchronized (C32821bp.class) {
                        ebVar = f88015f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f88014d);
                            f88015f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
