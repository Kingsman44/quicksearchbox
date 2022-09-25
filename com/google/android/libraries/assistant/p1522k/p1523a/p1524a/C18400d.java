package com.google.android.libraries.assistant.p1522k.p1523a.p1524a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.k.a.a.d */
/* compiled from: PG */
public final class C18400d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C18400d f52227b;

    /* renamed from: d */
    private static volatile C63010eb f52228d;

    /* renamed from: a */
    public int f52229a;

    /* renamed from: c */
    private int f52230c;

    static {
        C18400d dVar = new C18400d();
        f52227b = dVar;
        C62942bv.registerDefaultInstance(C18400d.class, dVar);
    }

    private C18400d() {
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
                return newMessageInfo(f52227b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C18398b.f52226a});
            case 3:
                return new C18400d();
            case 4:
                return new C18397a();
            case 5:
                return f52227b;
            case 6:
                C63010eb ebVar = f52228d;
                if (ebVar == null) {
                    synchronized (C18400d.class) {
                        ebVar = f52228d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f52227b);
                            f52228d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
