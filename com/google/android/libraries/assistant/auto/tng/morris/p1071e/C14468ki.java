package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.ki */
/* compiled from: PG */
public final class C14468ki extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C14468ki f43739c;

    /* renamed from: d */
    private static volatile C63010eb f43740d;

    /* renamed from: a */
    public int f43741a;

    /* renamed from: b */
    public int f43742b;

    static {
        C14468ki kiVar = new C14468ki();
        f43739c = kiVar;
        C62942bv.registerDefaultInstance(C14468ki.class, kiVar);
    }

    private C14468ki() {
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
                return newMessageInfo(f43739c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\f", new Object[]{"a", "b"});
            case 3:
                return new C14468ki();
            case 4:
                return new C14467kh();
            case 5:
                return f43739c;
            case 6:
                C63010eb ebVar = f43740d;
                if (ebVar == null) {
                    synchronized (C14468ki.class) {
                        ebVar = f43740d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43739c);
                            f43740d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
