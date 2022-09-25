package com.google.p395al.p408c.p414c.p416b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.c.c.b.bh */
/* compiled from: PG */
public final class C8492bh extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8492bh f29458c;

    /* renamed from: e */
    private static volatile C63010eb f29459e;

    /* renamed from: a */
    public C8464ag f29460a;

    /* renamed from: b */
    public int f29461b;

    /* renamed from: d */
    private int f29462d;

    static {
        C8492bh bhVar = new C8492bh();
        f29458c = bhVar;
        C62942bv.registerDefaultInstance(C8492bh.class, bhVar);
    }

    private C8492bh() {
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
                return newMessageInfo(f29458c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C8492bh();
            case 4:
                return new C8491bg();
            case 5:
                return f29458c;
            case 6:
                C63010eb ebVar = f29459e;
                if (ebVar == null) {
                    synchronized (C8492bh.class) {
                        ebVar = f29459e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29458c);
                            f29459e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
