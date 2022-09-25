package com.google.protos.p4985f.p5043v.p5044a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.v.a.f */
/* compiled from: PG */
public final class C65364f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65364f f177756a;

    /* renamed from: d */
    private static volatile C63010eb f177757d;

    /* renamed from: b */
    private C62995dn f177758b = C62995dn.f170057a;

    /* renamed from: c */
    private C62995dn f177759c = C62995dn.f170057a;

    static {
        C65364f fVar = new C65364f();
        f177756a = fVar;
        C62942bv.registerDefaultInstance(C65364f.class, fVar);
    }

    private C65364f() {
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
                return newMessageInfo(f177756a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0002\u0000\u0000\u00012\u00022", new Object[]{"b", C65360b.f177752a, C45240c.f118157a, C65363e.f177755a});
            case 3:
                return new C65364f();
            case 4:
                return new C65359a();
            case 5:
                return f177756a;
            case 6:
                C63010eb ebVar = f177757d;
                if (ebVar == null) {
                    synchronized (C65364f.class) {
                        ebVar = f177757d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177756a);
                            f177757d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
