package com.google.p5261vr.p5266c9.p5267a.p5268a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4968bh.p4969a.C64625b;

/* renamed from: com.google.vr.c9.a.a.b */
/* compiled from: PG */
public final class C67937b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67937b f184126c;

    /* renamed from: d */
    private static volatile C63010eb f184127d;

    /* renamed from: a */
    public int f184128a;

    /* renamed from: b */
    public C64625b f184129b;

    static {
        C67937b bVar = new C67937b();
        f184126c = bVar;
        C62942bv.registerDefaultInstance(C67937b.class, bVar);
    }

    private C67937b() {
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
                return newMessageInfo(f184126c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C67937b();
            case 4:
                return new C67936a();
            case 5:
                return f184126c;
            case 6:
                C63010eb ebVar = f184127d;
                if (ebVar == null) {
                    synchronized (C67937b.class) {
                        ebVar = f184127d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184126c);
                            f184127d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
