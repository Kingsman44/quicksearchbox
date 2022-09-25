package com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.d.c.u */
/* compiled from: PG */
public final class C13075u extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C13075u f40569c;

    /* renamed from: d */
    private static volatile C63010eb f40570d;

    /* renamed from: a */
    public int f40571a = 0;

    /* renamed from: b */
    public Object f40572b;

    static {
        C13075u uVar = new C13075u();
        f40569c = uVar;
        C62942bv.registerDefaultInstance(C13075u.class, uVar);
    }

    private C13075u() {
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
                return newMessageInfo(f40569c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C13073s.class, C13071q.class});
            case 3:
                return new C13075u();
            case 4:
                return new C13069o();
            case 5:
                return f40569c;
            case 6:
                C63010eb ebVar = f40570d;
                if (ebVar == null) {
                    synchronized (C13075u.class) {
                        ebVar = f40570d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40569c);
                            f40570d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
