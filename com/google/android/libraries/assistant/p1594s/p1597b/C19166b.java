package com.google.android.libraries.assistant.p1594s.p1597b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.s.b.b */
/* compiled from: PG */
public final class C19166b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C19166b f53665d;

    /* renamed from: f */
    private static volatile C63010eb f53666f;

    /* renamed from: a */
    public boolean f53667a;

    /* renamed from: b */
    public C62971cq f53668b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public int f53669c;

    /* renamed from: e */
    private int f53670e;

    static {
        C19166b bVar = new C19166b();
        f53665d = bVar;
        C62942bv.registerDefaultInstance(C19166b.class, bVar);
    }

    private C19166b() {
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
                return newMessageInfo(f53665d, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0001\u0000\u0003ဇ\u0002\u0004\u001a\u0005ဌ\u0003", new Object[]{"e", "a", "b", C45240c.f118157a, C19192t.f53743a});
            case 3:
                return new C19166b();
            case 4:
                return new C19132a();
            case 5:
                return f53665d;
            case 6:
                C63010eb ebVar = f53666f;
                if (ebVar == null) {
                    synchronized (C19166b.class) {
                        ebVar = f53666f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53665d);
                            f53666f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
