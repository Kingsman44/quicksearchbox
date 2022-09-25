package com.google.assistant.p3745ab.p3755g;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.g.i */
/* compiled from: PG */
public final class C48334i extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48334i f124984d;

    /* renamed from: e */
    private static volatile C63010eb f124985e;

    /* renamed from: a */
    public boolean f124986a;

    /* renamed from: b */
    public C48333h f124987b;

    /* renamed from: c */
    public C48333h f124988c;

    static {
        C48334i iVar = new C48334i();
        f124984d = iVar;
        C62942bv.registerDefaultInstance(C48334i.class, iVar);
    }

    private C48334i() {
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
                return newMessageInfo(f124984d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\t\u0003\t", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C48334i();
            case 4:
                return new C48331f();
            case 5:
                return f124984d;
            case 6:
                C63010eb ebVar = f124985e;
                if (ebVar == null) {
                    synchronized (C48334i.class) {
                        ebVar = f124985e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124984d);
                            f124985e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
