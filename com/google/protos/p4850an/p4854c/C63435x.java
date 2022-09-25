package com.google.protos.p4850an.p4854c;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.c.x */
/* compiled from: PG */
public final class C63435x extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C63435x f171440e;

    /* renamed from: g */
    private static volatile C63010eb f171441g;

    /* renamed from: a */
    public boolean f171442a;

    /* renamed from: b */
    public boolean f171443b;

    /* renamed from: c */
    public boolean f171444c;

    /* renamed from: d */
    public boolean f171445d;

    /* renamed from: f */
    private int f171446f;

    static {
        C63435x xVar = new C63435x();
        f171440e = xVar;
        C62942bv.registerDefaultInstance(C63435x.class, xVar);
    }

    private C63435x() {
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
                return newMessageInfo(f171440e, "\u0001\u0004\u0000\u0001\b\u000b\u0004\u0000\u0000\u0000\bဇ\u0007\tဇ\b\nဇ\t\u000bဇ\n", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C63435x();
            case 4:
                return new C63434w();
            case 5:
                return f171440e;
            case 6:
                C63010eb ebVar = f171441g;
                if (ebVar == null) {
                    synchronized (C63435x.class) {
                        ebVar = f171441g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171440e);
                            f171441g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
