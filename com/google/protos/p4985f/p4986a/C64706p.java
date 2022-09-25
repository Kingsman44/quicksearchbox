package com.google.protos.p4985f.p4986a;

import com.google.p4152bb.p4153a.C55421x;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.a.p */
/* compiled from: PG */
public final class C64706p extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64706p f175396b;

    /* renamed from: c */
    private static volatile C63010eb f175397c;

    /* renamed from: a */
    public C62961ch f175398a = emptyIntList();

    static {
        C64706p pVar = new C64706p();
        f175396b = pVar;
        C62942bv.registerDefaultInstance(C64706p.class, pVar);
    }

    private C64706p() {
        emptyIntList();
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
                return newMessageInfo(f175396b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", C55421x.m87687b()});
            case 3:
                return new C64706p();
            case 4:
                return new C64705o();
            case 5:
                return f175396b;
            case 6:
                C63010eb ebVar = f175397c;
                if (ebVar == null) {
                    synchronized (C64706p.class) {
                        ebVar = f175397c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175396b);
                            f175397c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
