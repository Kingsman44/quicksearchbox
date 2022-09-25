package com.google.speech.recognizer.p5233a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5204e.C66499j;

/* renamed from: com.google.speech.recognizer.a.b */
/* compiled from: PG */
public final class C67454b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C67454b f183338d;

    /* renamed from: e */
    private static volatile C63010eb f183339e;

    /* renamed from: a */
    public int f183340a;

    /* renamed from: b */
    public int f183341b;

    /* renamed from: c */
    public C66499j f183342c;

    static {
        C67454b bVar = new C67454b();
        f183338d = bVar;
        C62942bv.registerDefaultInstance(C67454b.class, bVar);
    }

    private C67454b() {
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
                return newMessageInfo(f183338d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C67446ao.m97471b(), C45240c.f118157a});
            case 3:
                return new C67454b();
            case 4:
                return new C67431a();
            case 5:
                return f183338d;
            case 6:
                C63010eb ebVar = f183339e;
                if (ebVar == null) {
                    synchronized (C67454b.class) {
                        ebVar = f183339e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183338d);
                            f183339e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
