package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.pc */
/* compiled from: PG */
public final class C60408pc extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C60408pc f163478c;

    /* renamed from: d */
    private static volatile C63010eb f163479d;

    /* renamed from: a */
    public int f163480a;

    /* renamed from: b */
    public long f163481b;

    static {
        C60408pc pcVar = new C60408pc();
        f163478c = pcVar;
        C62942bv.registerDefaultInstance(C60408pc.class, pcVar);
    }

    private C60408pc() {
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
                return newMessageInfo(f163478c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C60408pc();
            case 4:
                return new C60407pb();
            case 5:
                return f163478c;
            case 6:
                C63010eb ebVar = f163479d;
                if (ebVar == null) {
                    synchronized (C60408pc.class) {
                        ebVar = f163479d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163478c);
                            f163479d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
