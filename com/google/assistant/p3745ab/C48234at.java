package com.google.assistant.p3745ab;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.at */
/* compiled from: PG */
public final class C48234at extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C48234at f124784e;

    /* renamed from: f */
    private static volatile C63010eb f124785f;

    /* renamed from: a */
    public int f124786a;

    /* renamed from: b */
    public int f124787b;

    /* renamed from: c */
    public int f124788c;

    /* renamed from: d */
    public int f124789d;

    static {
        C48234at atVar = new C48234at();
        f124784e = atVar;
        C62942bv.registerDefaultInstance(C48234at.class, atVar);
    }

    private C48234at() {
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
                return newMessageInfo(f124784e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C48234at();
            case 4:
                return new C48233as();
            case 5:
                return f124784e;
            case 6:
                C63010eb ebVar = f124785f;
                if (ebVar == null) {
                    synchronized (C48234at.class) {
                        ebVar = f124785f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124784e);
                            f124785f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
