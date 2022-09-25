package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.e.j.ev */
/* compiled from: PG */
public final class C52089ev extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52089ev f136706c;

    /* renamed from: d */
    private static volatile C63010eb f136707d;

    /* renamed from: a */
    public int f136708a;

    /* renamed from: b */
    public C63088z f136709b = C63088z.f170246b;

    static {
        C52089ev evVar = new C52089ev();
        f136706c = evVar;
        C62942bv.registerDefaultInstance(C52089ev.class, evVar);
    }

    private C52089ev() {
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
                return newMessageInfo(f136706c, "\u0001\u0001\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0000\u0007ည\u0005", new Object[]{"a", "b"});
            case 3:
                return new C52089ev();
            case 4:
                return new C52088eu();
            case 5:
                return f136706c;
            case 6:
                C63010eb ebVar = f136707d;
                if (ebVar == null) {
                    synchronized (C52089ev.class) {
                        ebVar = f136707d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136706c);
                            f136707d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
