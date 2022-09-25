package com.google.p4283bv.p4287b.p4288a.p4289a.p4303h;

import com.google.p4283bv.p4412k.p4415c.p4416a.C57858p;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.h.p */
/* compiled from: PG */
public final class C56710p extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56710p f151367c;

    /* renamed from: e */
    private static volatile C63010eb f151368e;

    /* renamed from: a */
    public int f151369a;

    /* renamed from: b */
    public C57858p f151370b;

    /* renamed from: d */
    private byte f151371d = 2;

    static {
        C56710p pVar = new C56710p();
        f151367c = pVar;
        C62942bv.registerDefaultInstance(C56710p.class, pVar);
    }

    private C56710p() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f151371d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f151371d = b;
                return null;
            case 2:
                return newMessageInfo(f151367c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C56710p();
            case 4:
                return new C56709o();
            case 5:
                return f151367c;
            case 6:
                C63010eb ebVar = f151368e;
                if (ebVar == null) {
                    synchronized (C56710p.class) {
                        ebVar = f151368e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151367c);
                            f151368e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
