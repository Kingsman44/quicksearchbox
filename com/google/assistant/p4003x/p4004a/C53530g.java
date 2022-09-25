package com.google.assistant.p4003x.p4004a;

import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.x.a.g */
/* compiled from: PG */
public final class C53530g extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53530g f140481c;

    /* renamed from: d */
    private static volatile C63010eb f140482d;

    /* renamed from: a */
    public int f140483a;

    /* renamed from: b */
    public C51809dy f140484b;

    static {
        C53530g gVar = new C53530g();
        f140481c = gVar;
        C62942bv.registerDefaultInstance(C53530g.class, gVar);
    }

    private C53530g() {
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
                return newMessageInfo(f140481c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C53530g();
            case 4:
                return new C53529f();
            case 5:
                return f140481c;
            case 6:
                C63010eb ebVar = f140482d;
                if (ebVar == null) {
                    synchronized (C53530g.class) {
                        ebVar = f140482d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140481c);
                            f140482d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
