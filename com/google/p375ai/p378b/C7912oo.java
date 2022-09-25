package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.oo */
/* compiled from: PG */
public final class C7912oo extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C7912oo f27797d;

    /* renamed from: f */
    private static volatile C63010eb f27798f;

    /* renamed from: a */
    public int f27799a;

    /* renamed from: b */
    public boolean f27800b;

    /* renamed from: c */
    public int f27801c;

    /* renamed from: e */
    private byte f27802e = 2;

    static {
        C7912oo ooVar = new C7912oo();
        f27797d = ooVar;
        C62942bv.registerDefaultInstance(C7912oo.class, ooVar);
    }

    private C7912oo() {
        emptyIntList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f27802e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f27802e = b;
                return null;
            case 2:
                return newMessageInfo(f27797d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဇ\u0000\u0003င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C7912oo();
            case 4:
                return new C7911on();
            case 5:
                return f27797d;
            case 6:
                C63010eb ebVar = f27798f;
                if (ebVar == null) {
                    synchronized (C7912oo.class) {
                        ebVar = f27798f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27797d);
                            f27798f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
