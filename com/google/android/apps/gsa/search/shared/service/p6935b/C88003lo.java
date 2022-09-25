package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.lo */
/* compiled from: PG */
public final class C88003lo extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C88003lo f237985e;

    /* renamed from: f */
    private static volatile C63010eb f237986f;

    /* renamed from: a */
    public int f237987a;

    /* renamed from: b */
    public int f237988b;

    /* renamed from: c */
    public C62971cq f237989c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public C62961ch f237990d = emptyIntList();

    static {
        C88003lo loVar = new C88003lo();
        f237985e = loVar;
        C62942bv.registerDefaultInstance(C88003lo.class, loVar);
    }

    private C88003lo() {
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
                return newMessageInfo(f237985e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001င\u0000\u0002\u001a\u0003\u0016", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C88003lo();
            case 4:
                return new C88002ln();
            case 5:
                return f237985e;
            case 6:
                C63010eb ebVar = f237986f;
                if (ebVar == null) {
                    synchronized (C88003lo.class) {
                        ebVar = f237986f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237985e);
                            f237986f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
