package com.google.p4222bl.p4223a;

import com.google.p4222bl.p4223a.p4224a.C56067f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bl.a.g */
/* compiled from: PG */
public final class C56093g extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56093g f149436c;

    /* renamed from: d */
    private static volatile C63010eb f149437d;

    /* renamed from: a */
    public int f149438a = 0;

    /* renamed from: b */
    public Object f149439b;

    static {
        C56093g gVar = new C56093g();
        f149436c = gVar;
        C62942bv.registerDefaultInstance(C56093g.class, gVar);
    }

    private C56093g() {
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
                return newMessageInfo(f149436c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"b", "a", C56067f.class, C56091e.class});
            case 3:
                return new C56093g();
            case 4:
                return new C56092f();
            case 5:
                return f149436c;
            case 6:
                C63010eb ebVar = f149437d;
                if (ebVar == null) {
                    synchronized (C56093g.class) {
                        ebVar = f149437d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149436c);
                            f149437d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
