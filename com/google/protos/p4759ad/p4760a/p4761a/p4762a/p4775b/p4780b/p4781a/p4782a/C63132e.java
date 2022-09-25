package com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4775b.p4780b.p4781a.p4782a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ad.a.a.a.b.b.a.a.e */
/* compiled from: PG */
public final class C63132e extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C63132e f170478d;

    /* renamed from: e */
    private static volatile C63010eb f170479e;

    /* renamed from: a */
    public int f170480a;

    /* renamed from: b */
    public int f170481b;

    /* renamed from: c */
    public C62995dn f170482c = C62995dn.f170057a;

    static {
        C63132e eVar = new C63132e();
        f170478d = eVar;
        C62942bv.registerDefaultInstance(C63132e.class, eVar);
    }

    private C63132e() {
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
                return newMessageInfo(f170478d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001င\u0000\u00022", new Object[]{"a", "b", C45240c.f118157a, C63130c.f170477a});
            case 3:
                return new C63132e();
            case 4:
                return new C63131d();
            case 5:
                return f170478d;
            case 6:
                C63010eb ebVar = f170479e;
                if (ebVar == null) {
                    synchronized (C63132e.class) {
                        ebVar = f170479e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170478d);
                            f170479e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
