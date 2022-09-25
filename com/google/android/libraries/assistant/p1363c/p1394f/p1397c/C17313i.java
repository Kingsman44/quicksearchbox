package com.google.android.libraries.assistant.p1363c.p1394f.p1397c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5208h.C66611ci;

/* renamed from: com.google.android.libraries.assistant.c.f.c.i */
/* compiled from: PG */
public final class C17313i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C17313i f50141c;

    /* renamed from: e */
    private static volatile C63010eb f50142e;

    /* renamed from: a */
    public int f50143a = 0;

    /* renamed from: b */
    public Object f50144b;

    /* renamed from: d */
    private byte f50145d = 2;

    static {
        C17313i iVar = new C17313i();
        f50141c = iVar;
        C62942bv.registerDefaultInstance(C17313i.class, iVar);
    }

    private C17313i() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f50145d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f50145d = b;
                return null;
            case 2:
                return newMessageInfo(f50141c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001<\u0000\u0002м\u0000", new Object[]{"b", "a", C17311g.class, C66611ci.class});
            case 3:
                return new C17313i();
            case 4:
                return new C17309e();
            case 5:
                return f50141c;
            case 6:
                C63010eb ebVar = f50142e;
                if (ebVar == null) {
                    synchronized (C17313i.class) {
                        ebVar = f50142e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f50141c);
                            f50142e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
