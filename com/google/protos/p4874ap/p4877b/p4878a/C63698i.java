package com.google.protos.p4874ap.p4877b.p4878a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4184bj.p4204d.p4205a.C56008b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ap.b.a.i */
/* compiled from: PG */
public final class C63698i extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C63698i f172221d;

    /* renamed from: e */
    private static volatile C63010eb f172222e;

    /* renamed from: a */
    public int f172223a;

    /* renamed from: b */
    public int f172224b;

    /* renamed from: c */
    public C63697h f172225c;

    static {
        C63698i iVar = new C63698i();
        f172221d = iVar;
        C62942bv.registerDefaultInstance(C63698i.class, iVar);
    }

    private C63698i() {
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
                return newMessageInfo(f172221d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C56008b.f149169a, C45240c.f118157a});
            case 3:
                return new C63698i();
            case 4:
                return new C63695f();
            case 5:
                return f172221d;
            case 6:
                C63010eb ebVar = f172222e;
                if (ebVar == null) {
                    synchronized (C63698i.class) {
                        ebVar = f172222e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172221d);
                            f172222e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
