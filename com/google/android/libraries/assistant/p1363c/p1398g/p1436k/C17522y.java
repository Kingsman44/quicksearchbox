package com.google.android.libraries.assistant.p1363c.p1398g.p1436k;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.c.g.k.y */
/* compiled from: PG */
public final class C17522y extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C17522y f50535c;

    /* renamed from: d */
    private static volatile C63010eb f50536d;

    /* renamed from: a */
    public int f50537a;

    /* renamed from: b */
    public int f50538b;

    static {
        C17522y yVar = new C17522y();
        f50535c = yVar;
        C62942bv.registerDefaultInstance(C17522y.class, yVar);
    }

    private C17522y() {
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
                return newMessageInfo(f50535c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C17522y();
            case 4:
                return new C17521x();
            case 5:
                return f50535c;
            case 6:
                C63010eb ebVar = f50536d;
                if (ebVar == null) {
                    synchronized (C17522y.class) {
                        ebVar = f50536d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f50535c);
                            f50536d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
