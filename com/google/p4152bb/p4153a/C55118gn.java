package com.google.p4152bb.p4153a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.gn */
/* compiled from: PG */
public final class C55118gn extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C55118gn f145047e;

    /* renamed from: g */
    private static volatile C63010eb f145048g;

    /* renamed from: a */
    public int f145049a;

    /* renamed from: b */
    public int f145050b;

    /* renamed from: c */
    public int f145051c;

    /* renamed from: d */
    public int f145052d;

    /* renamed from: f */
    private int f145053f;

    static {
        C55118gn gnVar = new C55118gn();
        f145047e = gnVar;
        C62942bv.registerDefaultInstance(C55118gn.class, gnVar);
    }

    private C55118gn() {
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
                return newMessageInfo(f145047e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဆ\u0000\u0002ဆ\u0001\u0003ဆ\u0002\u0004ဆ\u0003", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C55118gn();
            case 4:
                return new C55117gm();
            case 5:
                return f145047e;
            case 6:
                C63010eb ebVar = f145048g;
                if (ebVar == null) {
                    synchronized (C55118gn.class) {
                        ebVar = f145048g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145047e);
                            f145048g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
