package com.google.protos.p4985f.p5020k;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5127o.C65682h;

/* renamed from: com.google.protos.f.k.ae */
/* compiled from: PG */
public final class C64903ae extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64903ae f175811c;

    /* renamed from: d */
    private static volatile C63010eb f175812d;

    /* renamed from: a */
    public int f175813a;

    /* renamed from: b */
    public C65682h f175814b;

    static {
        C64903ae aeVar = new C64903ae();
        f175811c = aeVar;
        C62942bv.registerDefaultInstance(C64903ae.class, aeVar);
    }

    private C64903ae() {
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
                return newMessageInfo(f175811c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C64903ae();
            case 4:
                return new C64902ad();
            case 5:
                return f175811c;
            case 6:
                C63010eb ebVar = f175812d;
                if (ebVar == null) {
                    synchronized (C64903ae.class) {
                        ebVar = f175812d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175811c);
                            f175812d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
