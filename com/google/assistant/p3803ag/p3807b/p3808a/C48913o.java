package com.google.assistant.p3803ag.p3807b.p3808a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.b.a.o */
/* compiled from: PG */
public final class C48913o extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48913o f126569d;

    /* renamed from: e */
    private static volatile C63010eb f126570e;

    /* renamed from: a */
    public int f126571a;

    /* renamed from: b */
    public C48908j f126572b;

    /* renamed from: c */
    public C48912n f126573c;

    static {
        C48913o oVar = new C48913o();
        f126569d = oVar;
        C62942bv.registerDefaultInstance(C48913o.class, oVar);
    }

    private C48913o() {
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
                return newMessageInfo(f126569d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C48913o();
            case 4:
                return new C48909k();
            case 5:
                return f126569d;
            case 6:
                C63010eb ebVar = f126570e;
                if (ebVar == null) {
                    synchronized (C48913o.class) {
                        ebVar = f126570e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126569d);
                            f126570e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
