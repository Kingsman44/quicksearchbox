package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.gl */
/* compiled from: PG */
public final class C51102gl extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51102gl f133019c;

    /* renamed from: d */
    private static volatile C63010eb f133020d;

    /* renamed from: a */
    public int f133021a = 0;

    /* renamed from: b */
    public Object f133022b;

    static {
        C51102gl glVar = new C51102gl();
        f133019c = glVar;
        C62942bv.registerDefaultInstance(C51102gl.class, glVar);
    }

    private C51102gl() {
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
                return newMessageInfo(f133019c, "\u0001\n\u0001\u0000\u0001\u000b\n\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000\nြ\u0000\u000bြ\u0000", new Object[]{"b", "a", C51064fa.class, C51068fe.class, C51077fn.class, C51106gp.class, C51092gb.class, C51087fx.class, C51110gt.class, C51096gf.class, C51081fr.class, C51070fg.class});
            case 3:
                return new C51102gl();
            case 4:
                return new C51101gk();
            case 5:
                return f133019c;
            case 6:
                C63010eb ebVar = f133020d;
                if (ebVar == null) {
                    synchronized (C51102gl.class) {
                        ebVar = f133020d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133019c);
                            f133020d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
