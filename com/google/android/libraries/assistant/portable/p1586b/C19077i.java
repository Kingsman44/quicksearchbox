package com.google.android.libraries.assistant.portable.p1586b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.portable.b.i */
/* compiled from: PG */
public final class C19077i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C19077i f53509c;

    /* renamed from: d */
    private static volatile C63010eb f53510d;

    /* renamed from: a */
    public int f53511a;

    /* renamed from: b */
    public int f53512b;

    static {
        C19077i iVar = new C19077i();
        f53509c = iVar;
        C62942bv.registerDefaultInstance(C19077i.class, iVar);
    }

    private C19077i() {
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
                return newMessageInfo(f53509c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C19077i();
            case 4:
                return new C19076h();
            case 5:
                return f53509c;
            case 6:
                C63010eb ebVar = f53510d;
                if (ebVar == null) {
                    synchronized (C19077i.class) {
                        ebVar = f53510d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53509c);
                            f53510d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
