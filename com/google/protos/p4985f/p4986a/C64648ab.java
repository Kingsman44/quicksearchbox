package com.google.protos.p4985f.p4986a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.a.ab */
/* compiled from: PG */
public final class C64648ab extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C64648ab f175238d;

    /* renamed from: e */
    private static volatile C63010eb f175239e;

    /* renamed from: a */
    public int f175240a;

    /* renamed from: b */
    public int f175241b;

    /* renamed from: c */
    public String f175242c = BuildConfig.FLAVOR;

    static {
        C64648ab abVar = new C64648ab();
        f175238d = abVar;
        C62942bv.registerDefaultInstance(C64648ab.class, abVar);
    }

    private C64648ab() {
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
                return newMessageInfo(f175238d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C64716z.f175431a, C45240c.f118157a});
            case 3:
                return new C64648ab();
            case 4:
                return new C64715y();
            case 5:
                return f175238d;
            case 6:
                C63010eb ebVar = f175239e;
                if (ebVar == null) {
                    synchronized (C64648ab.class) {
                        ebVar = f175239e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175238d);
                            f175239e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
