package com.google.assistant.p3994s.p3995a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.on */
/* compiled from: PG */
public final class C53455on extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53455on f140296d;

    /* renamed from: f */
    private static volatile C63010eb f140297f;

    /* renamed from: a */
    public int f140298a;

    /* renamed from: b */
    public C53253ha f140299b;

    /* renamed from: c */
    public C53271hs f140300c;

    /* renamed from: e */
    private byte f140301e = 2;

    static {
        C53455on onVar = new C53455on();
        f140296d = onVar;
        C62942bv.registerDefaultInstance(C53455on.class, onVar);
    }

    private C53455on() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f140301e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f140301e = b;
                return null;
            case 2:
                return newMessageInfo(f140296d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C53455on();
            case 4:
                return new C53454om();
            case 5:
                return f140296d;
            case 6:
                C63010eb ebVar = f140297f;
                if (ebVar == null) {
                    synchronized (C53455on.class) {
                        ebVar = f140297f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140296d);
                            f140297f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
