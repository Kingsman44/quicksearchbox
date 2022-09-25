package com.google.assistant.p3803ag.p3804a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.a.af */
/* compiled from: PG */
public final class C48798af extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48798af f126265b;

    /* renamed from: d */
    private static volatile C63010eb f126266d;

    /* renamed from: a */
    public int f126267a;

    /* renamed from: c */
    private int f126268c;

    static {
        C48798af afVar = new C48798af();
        f126265b = afVar;
        C62942bv.registerDefaultInstance(C48798af.class, afVar);
    }

    private C48798af() {
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
                return newMessageInfo(f126265b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C48875r.f126482a});
            case 3:
                return new C48798af();
            case 4:
                return new C48797ae();
            case 5:
                return f126265b;
            case 6:
                C63010eb ebVar = f126266d;
                if (ebVar == null) {
                    synchronized (C48798af.class) {
                        ebVar = f126266d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126265b);
                            f126266d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
