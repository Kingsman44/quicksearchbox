package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.de */
/* compiled from: PG */
public final class C57434de extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57434de f153411b;

    /* renamed from: d */
    private static volatile C63010eb f153412d;

    /* renamed from: a */
    public int f153413a;

    /* renamed from: c */
    private int f153414c;

    static {
        C57434de deVar = new C57434de();
        f153411b = deVar;
        C62942bv.registerDefaultInstance(C57434de.class, deVar);
    }

    private C57434de() {
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
                return newMessageInfo(f153411b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C57432dc.f153410a});
            case 3:
                return new C57434de();
            case 4:
                return new C57431db();
            case 5:
                return f153411b;
            case 6:
                C63010eb ebVar = f153412d;
                if (ebVar == null) {
                    synchronized (C57434de.class) {
                        ebVar = f153412d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153411b);
                            f153412d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
