package com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ay.d.a.a.a.a.bk */
/* compiled from: PG */
public final class C64319bk extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64319bk f173896c;

    /* renamed from: e */
    private static volatile C63010eb f173897e;

    /* renamed from: a */
    public C64330f f173898a;

    /* renamed from: b */
    public boolean f173899b;

    /* renamed from: d */
    private int f173900d;

    static {
        C64319bk bkVar = new C64319bk();
        f173896c = bkVar;
        C62942bv.registerDefaultInstance(C64319bk.class, bkVar);
    }

    private C64319bk() {
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
                return newMessageInfo(f173896c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C64319bk();
            case 4:
                return new C64318bj();
            case 5:
                return f173896c;
            case 6:
                C63010eb ebVar = f173897e;
                if (ebVar == null) {
                    synchronized (C64319bk.class) {
                        ebVar = f173897e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173896c);
                            f173897e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
