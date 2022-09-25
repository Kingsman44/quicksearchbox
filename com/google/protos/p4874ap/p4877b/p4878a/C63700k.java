package com.google.protos.p4874ap.p4877b.p4878a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.protos.ap.b.a.k */
/* compiled from: PG */
public final class C63700k extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C63700k f172226e;

    /* renamed from: f */
    private static volatile C63010eb f172227f;

    /* renamed from: a */
    public int f172228a;

    /* renamed from: b */
    public int f172229b = 0;

    /* renamed from: c */
    public Object f172230c;

    /* renamed from: d */
    public C63042fg f172231d;

    static {
        C63700k kVar = new C63700k();
        f172226e = kVar;
        C62942bv.registerDefaultInstance(C63700k.class, kVar);
    }

    private C63700k() {
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
                return newMessageInfo(f172226e, "\u0001\u0005\u0001\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001်\u0000\u0002့\u0000\u0003ျ\u0000\u0004့\u0000\u0007ဉ\u0005", new Object[]{C45240c.f118157a, "b", "a", "d"});
            case 3:
                return new C63700k();
            case 4:
                return new C63699j();
            case 5:
                return f172226e;
            case 6:
                C63010eb ebVar = f172227f;
                if (ebVar == null) {
                    synchronized (C63700k.class) {
                        ebVar = f172227f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172226e);
                            f172227f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
