package com.google.assistant.p4008y.p4013d.p4014a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.d.a.p */
/* compiled from: PG */
public final class C53647p extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53647p f140802b;

    /* renamed from: d */
    private static volatile C63010eb f140803d;

    /* renamed from: a */
    public int f140804a;

    /* renamed from: c */
    private int f140805c;

    static {
        C53647p pVar = new C53647p();
        f140802b = pVar;
        C62942bv.registerDefaultInstance(C53647p.class, pVar);
    }

    private C53647p() {
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
                return newMessageInfo(f140802b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C53647p();
            case 4:
                return new C53646o();
            case 5:
                return f140802b;
            case 6:
                C63010eb ebVar = f140803d;
                if (ebVar == null) {
                    synchronized (C53647p.class) {
                        ebVar = f140803d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140802b);
                            f140803d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
