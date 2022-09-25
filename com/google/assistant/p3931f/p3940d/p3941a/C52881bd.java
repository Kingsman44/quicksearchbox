package com.google.assistant.p3931f.p3940d.p3941a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.f.d.a.bd */
/* compiled from: PG */
public final class C52881bd extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52881bd f138723c;

    /* renamed from: d */
    private static volatile C63010eb f138724d;

    /* renamed from: a */
    public int f138725a = 0;

    /* renamed from: b */
    public Object f138726b;

    static {
        C52881bd bdVar = new C52881bd();
        f138723c = bdVar;
        C62942bv.registerDefaultInstance(C52881bd.class, bdVar);
    }

    private C52881bd() {
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
                return newMessageInfo(f138723c, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001:\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"b", "a", C52875ay.class, C52860aj.class});
            case 3:
                return new C52881bd();
            case 4:
                return new C52879bb();
            case 5:
                return f138723c;
            case 6:
                C63010eb ebVar = f138724d;
                if (ebVar == null) {
                    synchronized (C52881bd.class) {
                        ebVar = f138724d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138723c);
                            f138724d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
