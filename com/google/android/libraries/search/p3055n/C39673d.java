package com.google.android.libraries.search.p3055n;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5218j.C67175t;

/* renamed from: com.google.android.libraries.search.n.d */
/* compiled from: PG */
public final class C39673d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C39673d f104428c;

    /* renamed from: d */
    private static volatile C63010eb f104429d;

    /* renamed from: a */
    public int f104430a;

    /* renamed from: b */
    public C67175t f104431b;

    static {
        C39673d dVar = new C39673d();
        f104428c = dVar;
        C62942bv.registerDefaultInstance(C39673d.class, dVar);
    }

    private C39673d() {
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
                return newMessageInfo(f104428c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C39673d();
            case 4:
                return new C39378c();
            case 5:
                return f104428c;
            case 6:
                C63010eb ebVar = f104429d;
                if (ebVar == null) {
                    synchronized (C39673d.class) {
                        ebVar = f104429d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f104428c);
                            f104429d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
