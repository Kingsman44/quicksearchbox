package com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.e.a.bw */
/* compiled from: PG */
public final class C79975bw extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C79975bw f219358e;

    /* renamed from: f */
    private static volatile C63010eb f219359f;

    /* renamed from: a */
    public int f219360a;

    /* renamed from: b */
    public C79946au f219361b;

    /* renamed from: c */
    public C79974bv f219362c;

    /* renamed from: d */
    public C79946au f219363d;

    static {
        C79975bw bwVar = new C79975bw();
        f219358e = bwVar;
        C62942bv.registerDefaultInstance(C79975bw.class, bwVar);
    }

    private C79975bw() {
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
                return newMessageInfo(f219358e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C79975bw();
            case 4:
                return new C79972bt();
            case 5:
                return f219358e;
            case 6:
                C63010eb ebVar = f219359f;
                if (ebVar == null) {
                    synchronized (C79975bw.class) {
                        ebVar = f219359f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219358e);
                            f219359f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
