package com.google.android.apps.search.fedora.p10096d.p10098b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4017at.p4018a.p4019a.p4020a.C53773bd;
import com.google.p4017at.p4018a.p4019a.p4020a.C53791bv;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.fedora.d.b.g */
/* compiled from: PG */
public final class C132762g extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C132762g f362204d;

    /* renamed from: e */
    private static volatile C63010eb f362205e;

    /* renamed from: a */
    public int f362206a;

    /* renamed from: b */
    public int f362207b;

    /* renamed from: c */
    public C53791bv f362208c;

    static {
        C132762g gVar = new C132762g();
        f362204d = gVar;
        C62942bv.registerDefaultInstance(C132762g.class, gVar);
    }

    private C132762g() {
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
                return newMessageInfo(f362204d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C53773bd.f141150a, C45240c.f118157a});
            case 3:
                return new C132762g();
            case 4:
                return new C132761f();
            case 5:
                return f362204d;
            case 6:
                C63010eb ebVar = f362205e;
                if (ebVar == null) {
                    synchronized (C132762g.class) {
                        ebVar = f362205e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f362204d);
                            f362205e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
