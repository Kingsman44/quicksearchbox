package com.google.android.libraries.search.assistant.p2786t.p2787a.p2788a.p2789a;

import com.google.android.libraries.search.assistant.p2786t.p2787a.C36453d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.t.a.a.a.f */
/* compiled from: PG */
public final class C36412f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C36412f f95096c;

    /* renamed from: d */
    private static volatile C63010eb f95097d;

    /* renamed from: a */
    public int f95098a;

    /* renamed from: b */
    public C36453d f95099b;

    static {
        C36412f fVar = new C36412f();
        f95096c = fVar;
        C62942bv.registerDefaultInstance(C36412f.class, fVar);
    }

    private C36412f() {
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
                return newMessageInfo(f95096c, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C36412f();
            case 4:
                return new C36411e();
            case 5:
                return f95096c;
            case 6:
                C63010eb ebVar = f95097d;
                if (ebVar == null) {
                    synchronized (C36412f.class) {
                        ebVar = f95097d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f95096c);
                            f95097d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
