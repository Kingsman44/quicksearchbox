package com.google.protos.p4880aq;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aq.aq */
/* compiled from: PG */
public final class C63728aq extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C63728aq f172294e;

    /* renamed from: f */
    private static volatile C63010eb f172295f;

    /* renamed from: a */
    public int f172296a;

    /* renamed from: b */
    public C63756m f172297b;

    /* renamed from: c */
    public long f172298c;

    /* renamed from: d */
    public C62995dn f172299d = C62995dn.f170057a;

    static {
        C63728aq aqVar = new C63728aq();
        f172294e = aqVar;
        C62942bv.registerDefaultInstance(C63728aq.class, aqVar);
    }

    private C63728aq() {
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
                return newMessageInfo(f172294e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u00032", new Object[]{"a", "b", C45240c.f118157a, "d", C63727ap.f172293a});
            case 3:
                return new C63728aq();
            case 4:
                return new C63724am();
            case 5:
                return f172294e;
            case 6:
                C63010eb ebVar = f172295f;
                if (ebVar == null) {
                    synchronized (C63728aq.class) {
                        ebVar = f172295f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172294e);
                            f172295f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
