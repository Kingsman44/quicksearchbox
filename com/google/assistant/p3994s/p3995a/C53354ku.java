package com.google.assistant.p3994s.p3995a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52282lz;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.ku */
/* compiled from: PG */
public final class C53354ku extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53354ku f139999d;

    /* renamed from: f */
    private static volatile C63010eb f140000f;

    /* renamed from: a */
    public int f140001a;

    /* renamed from: b */
    public C52282lz f140002b;

    /* renamed from: c */
    public int f140003c;

    /* renamed from: e */
    private byte f140004e = 2;

    static {
        C53354ku kuVar = new C53354ku();
        f139999d = kuVar;
        C62942bv.registerDefaultInstance(C53354ku.class, kuVar);
    }

    private C53354ku() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f140004e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f140004e = b;
                return null;
            case 2:
                return newMessageInfo(f139999d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C53352ks.f139998a});
            case 3:
                return new C53354ku();
            case 4:
                return new C53351kr();
            case 5:
                return f139999d;
            case 6:
                C63010eb ebVar = f140000f;
                if (ebVar == null) {
                    synchronized (C53354ku.class) {
                        ebVar = f140000f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139999d);
                            f140000f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
