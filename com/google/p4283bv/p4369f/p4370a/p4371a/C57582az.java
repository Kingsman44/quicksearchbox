package com.google.p4283bv.p4369f.p4370a.p4371a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.f.a.a.az */
/* compiled from: PG */
public final class C57582az extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C57582az f153835d;

    /* renamed from: f */
    private static volatile C63010eb f153836f;

    /* renamed from: a */
    public int f153837a;

    /* renamed from: b */
    public int f153838b;

    /* renamed from: c */
    public C62995dn f153839c = C62995dn.f170057a;

    /* renamed from: e */
    private C62995dn f153840e = C62995dn.f170057a;

    static {
        C57582az azVar = new C57582az();
        f153835d = azVar;
        C62942bv.registerDefaultInstance(C57582az.class, azVar);
    }

    private C57582az() {
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
                return newMessageInfo(f153835d, "\u0000\u0004\u0000\u0000\u0001\u0006\u0004\u0002\u0000\u0000\u0001\f\u0002\f\u00052\u00062", new Object[]{"a", "b", "e", C57581ay.f153834a, C45240c.f118157a, C57580ax.f153833a});
            case 3:
                return new C57582az();
            case 4:
                return new C57579aw();
            case 5:
                return f153835d;
            case 6:
                C63010eb ebVar = f153836f;
                if (ebVar == null) {
                    synchronized (C57582az.class) {
                        ebVar = f153836f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153835d);
                            f153836f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
