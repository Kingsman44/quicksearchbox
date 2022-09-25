package com.google.p4715m.p4716a.p4720b.p4721a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.m.a.b.a.af */
/* compiled from: PG */
public final class C62667af extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62667af f169193d;

    /* renamed from: e */
    private static volatile C63010eb f169194e;

    /* renamed from: a */
    public int f169195a;

    /* renamed from: b */
    public C62692t f169196b;

    /* renamed from: c */
    public C62673al f169197c;

    static {
        C62667af afVar = new C62667af();
        f169193d = afVar;
        C62942bv.registerDefaultInstance(C62667af.class, afVar);
    }

    private C62667af() {
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
                return newMessageInfo(f169193d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C62667af();
            case 4:
                return new C62666ae();
            case 5:
                return f169193d;
            case 6:
                C63010eb ebVar = f169194e;
                if (ebVar == null) {
                    synchronized (C62667af.class) {
                        ebVar = f169194e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169193d);
                            f169194e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
