package com.google.protos.p4874ap.p4877b.p4878a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ap.b.a.p */
/* compiled from: PG */
public final class C63705p extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C63705p f172236d;

    /* renamed from: e */
    private static volatile C63010eb f172237e;

    /* renamed from: a */
    public int f172238a;

    /* renamed from: b */
    public C63698i f172239b;

    /* renamed from: c */
    public C63704o f172240c;

    static {
        C63705p pVar = new C63705p();
        f172236d = pVar;
        C62942bv.registerDefaultInstance(C63705p.class, pVar);
    }

    private C63705p() {
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
                return newMessageInfo(f172236d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C63705p();
            case 4:
                return new C63702m();
            case 5:
                return f172236d;
            case 6:
                C63010eb ebVar = f172237e;
                if (ebVar == null) {
                    synchronized (C63705p.class) {
                        ebVar = f172237e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172236d);
                            f172237e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
