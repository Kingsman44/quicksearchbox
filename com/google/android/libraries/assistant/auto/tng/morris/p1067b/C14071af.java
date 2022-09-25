package com.google.android.libraries.assistant.auto.tng.morris.p1067b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.b.af */
/* compiled from: PG */
public final class C14071af extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C14071af f42714f;

    /* renamed from: g */
    private static volatile C63010eb f42715g;

    /* renamed from: a */
    public int f42716a;

    /* renamed from: b */
    public int f42717b;

    /* renamed from: c */
    public C63042fg f42718c;

    /* renamed from: d */
    public int f42719d;

    /* renamed from: e */
    public int f42720e;

    static {
        C14071af afVar = new C14071af();
        f42714f = afVar;
        C62942bv.registerDefaultInstance(C14071af.class, afVar);
    }

    private C14071af() {
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
                return newMessageInfo(f42714f, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C14071af();
            case 4:
                return new C14069ad();
            case 5:
                return f42714f;
            case 6:
                C63010eb ebVar = f42715g;
                if (ebVar == null) {
                    synchronized (C14071af.class) {
                        ebVar = f42715g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f42714f);
                            f42715g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
