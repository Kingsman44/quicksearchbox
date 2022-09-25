package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.a.cl */
/* compiled from: PG */
public final class C80344cl extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C80344cl f220460d;

    /* renamed from: e */
    private static volatile C63010eb f220461e;

    /* renamed from: a */
    public int f220462a;

    /* renamed from: b */
    public int f220463b;

    /* renamed from: c */
    public C80342cj f220464c;

    static {
        C80344cl clVar = new C80344cl();
        f220460d = clVar;
        C62942bv.registerDefaultInstance(C80344cl.class, clVar);
    }

    private C80344cl() {
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
                return newMessageInfo(f220460d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C80344cl();
            case 4:
                return new C80343ck();
            case 5:
                return f220460d;
            case 6:
                C63010eb ebVar = f220461e;
                if (ebVar == null) {
                    synchronized (C80344cl.class) {
                        ebVar = f220461e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220460d);
                            f220461e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
