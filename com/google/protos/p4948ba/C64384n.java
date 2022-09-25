package com.google.protos.p4948ba;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ba.n */
/* compiled from: PG */
public final class C64384n extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64384n f174622b;

    /* renamed from: d */
    private static volatile C63010eb f174623d;

    /* renamed from: a */
    public int f174624a;

    /* renamed from: c */
    private int f174625c;

    static {
        C64384n nVar = new C64384n();
        f174622b = nVar;
        C62942bv.registerDefaultInstance(C64384n.class, nVar);
    }

    private C64384n() {
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
                return newMessageInfo(f174622b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C64383m.m96398b()});
            case 3:
                return new C64384n();
            case 4:
                return new C64381k();
            case 5:
                return f174622b;
            case 6:
                C63010eb ebVar = f174623d;
                if (ebVar == null) {
                    synchronized (C64384n.class) {
                        ebVar = f174623d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174622b);
                            f174623d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
