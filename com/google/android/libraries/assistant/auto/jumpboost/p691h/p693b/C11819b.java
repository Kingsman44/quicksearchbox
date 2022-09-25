package com.google.android.libraries.assistant.auto.jumpboost.p691h.p693b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.h.b.b */
/* compiled from: PG */
public final class C11819b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C11819b f38001c;

    /* renamed from: d */
    private static volatile C63010eb f38002d;

    /* renamed from: a */
    public int f38003a;

    /* renamed from: b */
    public long f38004b;

    static {
        C11819b bVar = new C11819b();
        f38001c = bVar;
        C62942bv.registerDefaultInstance(C11819b.class, bVar);
    }

    private C11819b() {
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
                return newMessageInfo(f38001c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C11819b();
            case 4:
                return new C11818a();
            case 5:
                return f38001c;
            case 6:
                C63010eb ebVar = f38002d;
                if (ebVar == null) {
                    synchronized (C11819b.class) {
                        ebVar = f38002d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f38001c);
                            f38002d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
