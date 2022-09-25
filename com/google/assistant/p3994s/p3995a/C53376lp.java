package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.lp */
/* compiled from: PG */
public final class C53376lp extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53376lp f140063c;

    /* renamed from: e */
    private static volatile C63010eb f140064e;

    /* renamed from: a */
    public int f140065a;

    /* renamed from: b */
    public C53430np f140066b;

    /* renamed from: d */
    private byte f140067d = 2;

    static {
        C53376lp lpVar = new C53376lp();
        f140063c = lpVar;
        C62942bv.registerDefaultInstance(C53376lp.class, lpVar);
    }

    private C53376lp() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f140067d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f140067d = b;
                return null;
            case 2:
                return newMessageInfo(f140063c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C53376lp();
            case 4:
                return new C53375lo();
            case 5:
                return f140063c;
            case 6:
                C63010eb ebVar = f140064e;
                if (ebVar == null) {
                    synchronized (C53376lp.class) {
                        ebVar = f140064e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140063c);
                            f140064e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
