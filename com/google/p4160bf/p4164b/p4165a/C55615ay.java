package com.google.p4160bf.p4164b.p4165a;

import com.google.p4160bf.p4164b.p4165a.p4166a.C55526af;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.ay */
/* compiled from: PG */
public final class C55615ay extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55615ay f146744c;

    /* renamed from: e */
    private static volatile C63010eb f146745e;

    /* renamed from: a */
    public C62971cq f146746a = emptyProtobufList();

    /* renamed from: b */
    public long f146747b;

    /* renamed from: d */
    private int f146748d;

    static {
        C55615ay ayVar = new C55615ay();
        f146744c = ayVar;
        C62942bv.registerDefaultInstance(C55615ay.class, ayVar);
    }

    private C55615ay() {
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
                return newMessageInfo(f146744c, "\u0001\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0001\u0000\u0004ဂ\u0000\u0005\u001b", new Object[]{"d", "b", "a", C55526af.class});
            case 3:
                return new C55615ay();
            case 4:
                return new C55614ax();
            case 5:
                return f146744c;
            case 6:
                C63010eb ebVar = f146745e;
                if (ebVar == null) {
                    synchronized (C55615ay.class) {
                        ebVar = f146745e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146744c);
                            f146745e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
