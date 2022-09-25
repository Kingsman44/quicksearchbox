package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.google.android.apps.gsa.search.shared.service.p6935b.C87693ab;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.f */
/* compiled from: PG */
public final class C80404f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C80404f f220669d;

    /* renamed from: e */
    private static volatile C63010eb f220670e;

    /* renamed from: a */
    public int f220671a;

    /* renamed from: b */
    public C87693ab f220672b;

    /* renamed from: c */
    public int f220673c;

    static {
        C80404f fVar = new C80404f();
        f220669d = fVar;
        C62942bv.registerDefaultInstance(C80404f.class, fVar);
    }

    private C80404f() {
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
                return newMessageInfo(f220669d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C80149c.f219940a});
            case 3:
                return new C80404f();
            case 4:
                return new C80276e();
            case 5:
                return f220669d;
            case 6:
                C63010eb ebVar = f220670e;
                if (ebVar == null) {
                    synchronized (C80404f.class) {
                        ebVar = f220670e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220669d);
                            f220670e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
