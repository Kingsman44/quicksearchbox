package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.kt */
/* compiled from: PG */
public final class C14479kt extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C14479kt f43760e;

    /* renamed from: f */
    private static volatile C63010eb f43761f;

    /* renamed from: a */
    public int f43762a;

    /* renamed from: b */
    public int f43763b;

    /* renamed from: c */
    public boolean f43764c;

    /* renamed from: d */
    public int f43765d;

    static {
        C14479kt ktVar = new C14479kt();
        f43760e = ktVar;
        C62942bv.registerDefaultInstance(C14479kt.class, ktVar);
    }

    private C14479kt() {
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
                return newMessageInfo(f43760e, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002ဇ\u0000\u0003င\u0001", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C14479kt();
            case 4:
                return new C14478ks();
            case 5:
                return f43760e;
            case 6:
                C63010eb ebVar = f43761f;
                if (ebVar == null) {
                    synchronized (C14479kt.class) {
                        ebVar = f43761f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43760e);
                            f43761f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
