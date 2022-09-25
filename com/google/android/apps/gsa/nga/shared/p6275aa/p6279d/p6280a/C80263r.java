package com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.d.a.r */
/* compiled from: PG */
public final class C80263r extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C80263r f220202e;

    /* renamed from: f */
    private static volatile C63010eb f220203f;

    /* renamed from: a */
    public int f220204a;

    /* renamed from: b */
    public C80213bg f220205b;

    /* renamed from: c */
    public C80217bk f220206c;

    /* renamed from: d */
    public int f220207d;

    static {
        C80263r rVar = new C80263r();
        f220202e = rVar;
        C62942bv.registerDefaultInstance(C80263r.class, rVar);
    }

    private C80263r() {
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
                return newMessageInfo(f220202e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", C80248co.m128105b()});
            case 3:
                return new C80263r();
            case 4:
                return new C80262q();
            case 5:
                return f220202e;
            case 6:
                C63010eb ebVar = f220203f;
                if (ebVar == null) {
                    synchronized (C80263r.class) {
                        ebVar = f220203f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220202e);
                            f220203f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
