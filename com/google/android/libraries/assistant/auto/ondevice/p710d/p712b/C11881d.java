package com.google.android.libraries.assistant.auto.ondevice.p710d.p712b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.d.b.d */
/* compiled from: PG */
public final class C11881d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C11881d f38238c;

    /* renamed from: d */
    private static volatile C63010eb f38239d;

    /* renamed from: a */
    public int f38240a;

    /* renamed from: b */
    public int f38241b;

    static {
        C11881d dVar = new C11881d();
        f38238c = dVar;
        C62942bv.registerDefaultInstance(C11881d.class, dVar);
    }

    private C11881d() {
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
                return newMessageInfo(f38238c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C11878a.f38237a});
            case 3:
                return new C11881d();
            case 4:
                return new C11880c();
            case 5:
                return f38238c;
            case 6:
                C63010eb ebVar = f38239d;
                if (ebVar == null) {
                    synchronized (C11881d.class) {
                        ebVar = f38239d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f38238c);
                            f38239d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
