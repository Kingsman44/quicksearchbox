package com.google.android.libraries.assistant.p1522k.p1523a.p1524a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.k.a.a.f */
/* compiled from: PG */
public final class C18402f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C18402f f52231c;

    /* renamed from: d */
    private static volatile C63010eb f52232d;

    /* renamed from: a */
    public int f52233a;

    /* renamed from: b */
    public long f52234b;

    static {
        C18402f fVar = new C18402f();
        f52231c = fVar;
        C62942bv.registerDefaultInstance(C18402f.class, fVar);
    }

    private C18402f() {
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
                return newMessageInfo(f52231c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဃ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C18402f();
            case 4:
                return new C18401e();
            case 5:
                return f52231c;
            case 6:
                C63010eb ebVar = f52232d;
                if (ebVar == null) {
                    synchronized (C18402f.class) {
                        ebVar = f52232d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f52231c);
                            f52232d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
