package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.sr */
/* compiled from: PG */
public final class C8023sr extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C8023sr f28172d;

    /* renamed from: f */
    private static volatile C63010eb f28173f;

    /* renamed from: a */
    public int f28174a;

    /* renamed from: b */
    public C8011sf f28175b;

    /* renamed from: c */
    public C8150xj f28176c;

    /* renamed from: e */
    private byte f28177e = 2;

    static {
        C8023sr srVar = new C8023sr();
        f28172d = srVar;
        C62942bv.registerDefaultInstance(C8023sr.class, srVar);
    }

    private C8023sr() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28177e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28177e = b;
                return null;
            case 2:
                return newMessageInfo(f28172d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C8023sr();
            case 4:
                return new C8022sq();
            case 5:
                return f28172d;
            case 6:
                C63010eb ebVar = f28173f;
                if (ebVar == null) {
                    synchronized (C8023sr.class) {
                        ebVar = f28173f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28172d);
                            f28173f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
