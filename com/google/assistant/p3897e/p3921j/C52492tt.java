package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.tt */
/* compiled from: PG */
public final class C52492tt extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52492tt f137803d;

    /* renamed from: f */
    private static volatile C63010eb f137804f;

    /* renamed from: a */
    public int f137805a;

    /* renamed from: b */
    public C51953ff f137806b;

    /* renamed from: c */
    public C52507uh f137807c;

    /* renamed from: e */
    private byte f137808e = 2;

    static {
        C52492tt ttVar = new C52492tt();
        f137803d = ttVar;
        C62942bv.registerDefaultInstance(C52492tt.class, ttVar);
    }

    private C52492tt() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f137808e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f137808e = b;
                return null;
            case 2:
                return newMessageInfo(f137803d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0001\u0002ᐉ\u0000\u0003ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C52492tt();
            case 4:
                return new C52491ts();
            case 5:
                return f137803d;
            case 6:
                C63010eb ebVar = f137804f;
                if (ebVar == null) {
                    synchronized (C52492tt.class) {
                        ebVar = f137804f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137803d);
                            f137804f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
