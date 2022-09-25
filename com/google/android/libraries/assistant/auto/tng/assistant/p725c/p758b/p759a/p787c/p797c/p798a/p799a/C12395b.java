package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p797c.p798a.p799a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.recognizer.p5233a.C67451at;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.c.c.a.a.b */
/* compiled from: PG */
public final class C12395b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C12395b f39242e;

    /* renamed from: f */
    private static volatile C63010eb f39243f;

    /* renamed from: a */
    public int f39244a;

    /* renamed from: b */
    public int f39245b;

    /* renamed from: c */
    public int f39246c;

    /* renamed from: d */
    public int f39247d;

    static {
        C12395b bVar = new C12395b();
        f39242e = bVar;
        C62942bv.registerDefaultInstance(C12395b.class, bVar);
    }

    private C12395b() {
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
                return newMessageInfo(f39242e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", C67451at.m97474b(), C45240c.f118157a, "d"});
            case 3:
                return new C12395b();
            case 4:
                return new C12394a();
            case 5:
                return f39242e;
            case 6:
                C63010eb ebVar = f39243f;
                if (ebVar == null) {
                    synchronized (C12395b.class) {
                        ebVar = f39243f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f39242e);
                            f39243f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
